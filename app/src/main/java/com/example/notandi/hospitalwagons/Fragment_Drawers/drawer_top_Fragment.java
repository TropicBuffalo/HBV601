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
import com.example.notandi.hospitalwagons.R;

import java.util.ArrayList;

/**
 * Created by Petur on 24.2.2018.
 */


public class drawer_top_Fragment extends Fragment {



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        getActivity().setTitle(R.string.top_of_wagon);

        ArrayList<Item> items = new ArrayList<Item>();

        String[] medicalDevices = getResources().getStringArray(R.array.medical_devices);
        String medicalDevice;

        for (int i = 0; i < medicalDevices.length; i++) {
            medicalDevice = medicalDevices[i];
            items.add(new Item(medicalDevice));
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
