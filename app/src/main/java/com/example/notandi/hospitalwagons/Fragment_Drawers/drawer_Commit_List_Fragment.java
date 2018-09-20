package com.example.notandi.hospitalwagons.Fragment_Drawers;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.example.notandi.hospitalwagons.Item;
import com.example.notandi.hospitalwagons.ItemAdapter;
import com.example.notandi.hospitalwagons.ListProcessing;
import com.example.notandi.hospitalwagons.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class drawer_Commit_List_Fragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView textView = new TextView(getActivity());

        textView.setText(R.string.hello_blank_fragment);
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        getActivity().setTitle("Vantar/Óklárað");

        ArrayList<Item> items = new ArrayList<Item>();

        List<Object> main = new ArrayList();
        String item;
        String info;
        String dose;
        int quantity=1;
        String type;

        ListProcessing LP = new  ListProcessing();

        for(int i=0;i<=153;i++)
        {
            System.out.println("iterations: "+i+ " TTTTTTTTTTTTTTTTT");
            if(LP.finalWagon[i][0]==null){break;}
             item=LP.finalWagon[i][0];
             info=LP.finalWagon[i][1];
             dose=LP.finalWagon[i][2];
             if(LP.finalWagon[i][3]==null){}else{
             quantity=Integer.parseInt(LP.finalWagon[i][3]);}
             type=LP.finalWagon[i][4];
            items.add(new Item(item,info,dose,quantity,type));

        }

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

    // list function perhaps to be used later but serves no purpose now
    public List<List<List<Object>>> Cartlist = new ArrayList<List<List<Object>>>();

    public void creatingList()
    {

        List<List<Object>> itemsInUse = new ArrayList<List<Object>>();
        String[] medicalDevices = getResources().getStringArray(R.array.medical_devices);
        String medicalDevice = null;
        String Status="y";
        boolean status =false;

        for (int i = 0; i < medicalDevices.length; i++) {
            itemsInUse.add(new ArrayList<Object>());
            medicalDevice = medicalDevices[i];
            //itemsInUse.add((List<Object>) new Item(medicalDevice,status));
            itemsInUse.get(i).add(medicalDevices[i]);
            Collections.addAll(itemsInUse.get(i),medicalDevice,"y");
        }
        Cartlist.add(itemsInUse);
        int b = medicalDevices.length;


        //----------------------------------------
        String[] itemArr = getResources().getStringArray(R.array.medicine_drawer_items);
        String[] infoArr = getResources().getStringArray(R.array.medicine_drawer_info);
        String[] doseArr = getResources().getStringArray(R.array.medicine_drawer_dose);
        int[] quantityArr = getResources().getIntArray(R.array.medicine_drawer_quantity);
        String[] typeArr = getResources().getStringArray(R.array.medicine_drawer_type);
        String item;
        String info;
        String dose;
        String type;
        int quantity;

        for (int i = b; i < itemArr.length+b; i++) {
            item = itemArr[i];
            info = infoArr[i];
            dose = doseArr[i];
            quantity = quantityArr[i];
            type = typeArr[i];
            System.out.println(item+info+dose+quantity+type);
            Collections.addAll(itemsInUse.get(i),item, info, dose, quantity, type);
        }
        Cartlist.add(itemsInUse);
        b=b+itemArr.length;

        //----------------------------------------

        itemArr = getResources().getStringArray(R.array.drawer_one_items);
        quantityArr = getResources().getIntArray(R.array.drawer_one_quantity);
        typeArr = getResources().getStringArray(R.array.drawer_one_type);

        for (int i = b; i < itemArr.length+b; i++) {
            item = itemArr[i];
            quantity = quantityArr[i];
            type = typeArr[i];
            Collections.addAll(itemsInUse.get(i),item, quantity, type);
        }
        Cartlist.add(itemsInUse);
        b=b+itemArr.length;

        //--------------------------------------------

        itemArr = getResources().getStringArray(R.array.drawer_two_items);
        quantityArr = getResources().getIntArray(R.array.drawer_two_quantity);
        typeArr = getResources().getStringArray(R.array.drawer_two_type);

        for (int i = b; i < itemArr.length+b; i++) {
            item = itemArr[i];
            quantity = quantityArr[i];
            type = typeArr[i];
            Collections.addAll(itemsInUse.get(i),item, quantity, type);
        }
        Cartlist.add(itemsInUse);
        b=b+itemArr.length;

        //---------------------------------------------

        itemArr = getResources().getStringArray(R.array.drawer_three_items);
        quantityArr = getResources().getIntArray(R.array.drawer_three_quantity);
        typeArr = getResources().getStringArray(R.array.drawer_three_type);

        for (int i = b; i < itemArr.length+b; i++) {
            item = itemArr[i];
            quantity = quantityArr[i];
            type = typeArr[i];
            Collections.addAll(itemsInUse.get(i),item, quantity, type);
        }
        Cartlist.add(itemsInUse);
        b=b+itemArr.length+b;

        //-----------------------------------------------

        itemArr = getResources().getStringArray(R.array.drawer_four_items);
        quantityArr = getResources().getIntArray(R.array.drawer_four_quantity);
        typeArr = getResources().getStringArray(R.array.drawer_four_type);


        for (int i = b; i < itemArr.length+b; i++) {
            item = itemArr[i];
            quantity = quantityArr[i];
            type = typeArr[i];
            Collections.addAll(itemsInUse.get(i),item, quantity, type);
        }
        Cartlist.add(itemsInUse);
        b=b+itemArr.length;

        //----------------------------------------------------
        itemArr = getResources().getStringArray(R.array.drawer_five_items);
        quantityArr = getResources().getIntArray(R.array.drawer_five_quantity);
        typeArr = getResources().getStringArray(R.array.drawer_five_type);

        for (int i = b; i < itemArr.length+b; i++) {
            item = itemArr[i];
            quantity = quantityArr[i];
            type = typeArr[i];
            Collections.addAll(itemsInUse.get(i),item, quantity, type);
        }
        Cartlist.add(itemsInUse);
        b=b+itemArr.length;

        //----------------------------------------------------

        itemArr = getResources().getStringArray(R.array.drawer_six_items);
        infoArr = getResources().getStringArray(R.array.drawer_six_info);
        doseArr = getResources().getStringArray(R.array.drawer_six_dose);
        quantityArr = getResources().getIntArray(R.array.drawer_six_quantity);
        typeArr = getResources().getStringArray(R.array.drawer_six_type);

        for (int i = b; i < itemArr.length+b; i++) {
            item = itemArr[i];
            info = infoArr[i];
            dose = doseArr[i];
            quantity = quantityArr[i];
            type = typeArr[i];

            Collections.addAll(itemsInUse.get(i),item, info, dose, quantity, type);
        }
        Cartlist.add(itemsInUse);
        b=b+itemArr.length;

        //------------------------------------------------------

        itemArr = getResources().getStringArray(R.array.drawer_seven_items);
        infoArr = getResources().getStringArray(R.array.drawer_seven_info);
        doseArr = getResources().getStringArray(R.array.drawer_seven_dose);
        quantityArr = getResources().getIntArray(R.array.drawer_seven_quantity);
        typeArr = getResources().getStringArray(R.array.drawer_seven_type);

        for (int i =b; i < itemArr.length+b; i++) {
            item = itemArr[i];
            info = infoArr[i];
            dose = doseArr[i];
            quantity = quantityArr[i];
            type = typeArr[i];
            Collections.addAll(itemsInUse.get(i),item, info, dose, quantity, type);
        }
        Cartlist.add(itemsInUse);
        b=b+itemArr.length;

        //-----------------------------------------------------
        itemArr = getResources().getStringArray(R.array.drawer_eight_items);
        quantityArr = getResources().getIntArray(R.array.drawer_eight_quantity);
        typeArr = getResources().getStringArray(R.array.drawer_eight_type);

        for (int i = b; i < itemArr.length+b; i++) {
            item = itemArr[i];
            quantity = quantityArr[i];
            type = typeArr[i];
            Collections.addAll(itemsInUse.get(i),item, quantity, type);
        }
        Cartlist.add(itemsInUse);
        System.out.println("Cartlist");
    }
}
