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

public class drawer8_Fragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        getActivity().setTitle("Bráðabúnaður fyrir börn");

        ArrayList<Item> items = new ArrayList<Item>();

        String[] itemArr= new String[26];
        for(int i=0;i<26;i++){
            String a = ListProcessing.wagon[0][9][i][0];
            itemArr[i]=a;
        }

        //String[] itemArr=getResources().getStringArray(R.array.drawer_eight_items);
        int[] quantityArr = new int[26];
        for(int i=0;i<26;i++){
            int a = Integer.parseInt(ListProcessing.wagon[0][9][i][3]);
            quantityArr[i]=a;
        }

        //int[] quantityArr = getResources().getIntArray(R.array.drawer_eight_quantity);
        String[] typeArr = getResources().getStringArray(R.array.drawer_eight_type);
        String item;
        int quantity;
        String type;

        for (int i = 0; i < itemArr.length; i++) {
            item = itemArr[i];
            quantity = quantityArr[i];
            type = typeArr[i];
            System.out.println("item: "+item+" quantity: "+quantity+" type: "+type);
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
