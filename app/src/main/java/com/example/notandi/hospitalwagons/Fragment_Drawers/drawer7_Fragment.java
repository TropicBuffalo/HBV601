package com.example.notandi.hospitalwagons.Fragment_Drawers;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.notandi.hospitalwagons.Item;
import com.example.notandi.hospitalwagons.ItemAdapter;
import com.example.notandi.hospitalwagons.ListProcessing;
import com.example.notandi.hospitalwagons.R;

import java.util.ArrayList;

/**
 * Created by Petur on 24.2.2018.
 */

public class drawer7_Fragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        getActivity().setTitle(R.string.drawer_seven);

        ArrayList<Item> items = new ArrayList<Item>();

        String[] itemArr = getResources().getStringArray(R.array.drawer_seven_items);
        String[] infoArr = getResources().getStringArray(R.array.drawer_seven_info);
        String[] doseArr = getResources().getStringArray(R.array.drawer_seven_dose);
        int[] quantityArr = new int[5];
        for(int i=0;i<5;i++){
            int a = Integer.parseInt(ListProcessing.wagon[0][8][i][3]);
            quantityArr[i]=a;
        }
                //getResources().getIntArray(R.array.drawer_seven_quantity);
        String[] typeArr = getResources().getStringArray(R.array.drawer_seven_type);
        String item;
        String info;
        String dose;
        String type;
        int quantity;

        for (int i = 0; i < itemArr.length; i++) {
            item = itemArr[i];
            info = infoArr[i];
            dose = doseArr[i];
            quantity = quantityArr[i];
            type = typeArr[i];

            items.add(new Item(item, info, dose, quantity, type));
        }


        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setRetainInstance(true);
    }
}
