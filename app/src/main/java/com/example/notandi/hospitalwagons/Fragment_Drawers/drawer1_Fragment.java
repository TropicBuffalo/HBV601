package com.example.notandi.hospitalwagons.Fragment_Drawers;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;

import com.example.notandi.hospitalwagons.Item;
import com.example.notandi.hospitalwagons.ItemAdapter;
import com.example.notandi.hospitalwagons.ListProcessing;
import com.example.notandi.hospitalwagons.R;

import java.util.ArrayList;

/**
 * Created by Notandi on 24.2.2018.
 */

public class drawer1_Fragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        getActivity().setTitle(R.string.drawer_one);

        ArrayList<Item> items = new ArrayList<Item>();

        String[] itemArr = getResources().getStringArray(R.array.drawer_one_items);
        int[] quantityArr =new int[29]; //getResources().getIntArray(R.array.drawer_one_quantity);

            for(int i=0;i<29;i++) {
                int a = Integer.parseInt(ListProcessing.wagon[0][2][i][3]);
                quantityArr[i] = a;
            }
        String[] typeArr = getResources().getStringArray(R.array.drawer_one_type);
        String item;
        int quantity;
        String type;

        for (int i= 0; i < itemArr.length; i++) {
            item = itemArr[i];
            quantity = quantityArr[i];
            type = typeArr[i];
            items.add(new Item(item, quantity, type));
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
