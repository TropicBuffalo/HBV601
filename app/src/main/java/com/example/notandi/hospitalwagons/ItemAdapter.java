package com.example.notandi.hospitalwagons;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import static android.view.View.GONE;

/**
 * Created by Ósk on 7.2.2018.
 */

public class ItemAdapter extends ArrayAdapter<Item> {

    public ItemAdapter(Activity context, ArrayList<Item> items) {

        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Item} object located at this position in the list
        Item currentItem = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView itemTextView = (TextView) listItemView.findViewById(R.id.item);

        // Get the version name from the current object and
        // set this text on the name TextView
        itemTextView.setText(currentItem.getItem());

        TextView infoTextView = (TextView) listItemView.findViewById(R.id.info);
        infoTextView.setText(currentItem.getInfo());

        TextView doseTextView = (TextView) listItemView.findViewById(R.id.dose);
        doseTextView.setText(currentItem.getDose());


        TextView quantityTextView = (TextView) listItemView.findViewById(R.id.quantity);
        quantityTextView.setText(currentItem.getQuantity());

        TextView typeTextView = (TextView) listItemView.findViewById(R.id.type);
        typeTextView.setText(currentItem.getType());

        CheckBox check = listItemView.findViewById(R.id.checkbox);

        if (currentItem.isCheckBox()) {
            check.setVisibility(View.VISIBLE);
        } else {
            check.setVisibility(View.GONE);
        }

        if (currentItem.isInfo()) {
            infoTextView.setVisibility(View.VISIBLE);
        } else {
            infoTextView.setVisibility(View.GONE);
        }

        if (currentItem.isDose()) {
            doseTextView.setVisibility(View.VISIBLE);
        } else {
            doseTextView.setVisibility(View.GONE);
        }

        if (currentItem.isQuantity()) {
            quantityTextView.setVisibility(View.VISIBLE);
        } else {
            quantityTextView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}

