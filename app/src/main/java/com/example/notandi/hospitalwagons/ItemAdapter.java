package com.example.notandi.hospitalwagons;

import android.app.Activity;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;

import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.view.View.GONE;

/**
 * Created by Ósk on 7.2.2018.
 */


public class ItemAdapter extends ArrayAdapter<Item> {

    public static boolean isitpopulated;
    public static int DrawerInUse;
    public static int ListLoc;


    public ItemAdapter(Activity context, ArrayList<Item> items) {
        super(context, 0, items);
    }

    @Override
    public View getView(final int position, final View convertView, final ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }else{}



            // Get the {@link Item} object located at this position in the list
            final Item currentItem = getItem(position);
            final Item currentposs = getItem(position);

            // Find the TextView in the list_item.xml layout with the ID version_name
            TextView itemTextView = (TextView) listItemView.findViewById(R.id.item);

            CheckBox check = listItemView.findViewById(R.id.checkbox);


            final TextView quantityTextView = (TextView) listItemView.findViewById(R.id.quantity);
            String listcontent = quantityTextView.getText().toString();

            int drawer = Drawers.DrawerChosen;
            //System.out.println("!!!!!!!!-!Check: "+ListProcessing.wagon[0][drawer][position][5]+"----------------------------------------------");


            // Get the version name from the current object and
            // set this text on the name TextView
            itemTextView.setText(currentItem.getItem());

            TextView infoTextView = (TextView) listItemView.findViewById(R.id.info);
            infoTextView.setText(currentItem.getInfo());

            TextView doseTextView = (TextView) listItemView.findViewById(R.id.dose);
            doseTextView.setText(currentItem.getDose());

            TextView typeTextView = (TextView) listItemView.findViewById(R.id.type);
            typeTextView.setText(currentItem.getType());
            // website with solution
            //https://stackoverflow.com/questions/11190390/checking-a-checkbox-in-listview-makes-other-random-checkboxes-checked-too

        if (listcontent.isEmpty()) {
                quantityTextView.setText(currentItem.getQuantity());

                System.out.println("Drawer: "+drawer+" Position: "+position);

                if (drawer < 9) {
                    String Liststatus = ListProcessing.wagon[0][drawer][position][5];
                    if (Liststatus.equals("true")) {
                        // make box cheked
                        CheckBox checktemp = listItemView.findViewById(R.id.checkbox);
                        checktemp.setChecked(true);
                        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA: " + ListProcessing.wagon[0][drawer][position][5]);
                    }
                }else{
                //String FListstatus = ListProcessing.finalWagon[position][5];
                    /*
                    if (FListstatus.equals("true")) {
                        CheckBox checktemp = listItemView.findViewById(R.id.checkbox);
                        checktemp.setChecked(true);
                        System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
                    }
                    */
                }

                // if(listcontent.isEmpty()) {
                //final CheckBox check = listItemView.findViewById(R.id.checkbox);

                final View listItemView1 = listItemView;

                //reset and Populating list
                final String itemName = currentposs.getItem();
                String itemInfo = currentposs.getInfo();
                String itemDose = currentposs.getDose();
                String itemQuantity = currentposs.getQuantity();
                String itemType = currentposs.getType();
                // populateList(position,itemName,itemInfo,itemDose,itemQuantity,itemType);

                // when chekbox is ticked then list is amended
                check.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        CheckBox checkBox = (CheckBox) v;
                        ListProcessing d = new ListProcessing();
                        if (checkBox.isChecked()) {
                            /*System.out.println("currentposs : "+currentposs);
                            System.out.println("position : "+position);
                            System.out.println("Parent : "+parent);
                            String itemName= currentposs.getItem();
                            System.out.println("getItem() : "+itemName);
                            String itemInfo = currentposs.getInfo();
                            System.out.println("getInfo() : "+ itemInfo);
                            String itemDose = currentposs.getDose();
                            System.out.println("getDose() : "+ itemDose);
                            String itemType = currentposs.getType();
                            System.out.println("getType() : "+ itemType);
                            String itemQuantity = currentposs.getQuantity();
                            System.out.println("getQuantity() : "+ itemQuantity);*/
                            if (Drawers.DrawerChosen <= 10) {
                                d.wagon[0][Drawers.DrawerChosen][position][5] = "true";
                                System.out.println("111111111111111111111111111111111111111");
                            } else if (Drawers.DrawerChosen == 10) {
                                d.finalWagon[position][5] = "true";
                                System.out.println("2222222222222222222222222222222222222222");
                            }
                        } else if (checkBox.isChecked() == false) {
                            if (Drawers.DrawerChosen < 10) {
                                d.wagon[0][Drawers.DrawerChosen][position][5] = "false";
                            } else if (Drawers.DrawerChosen == 10) {
                                d.finalWagon[position][5] = "false";
                            }
                        }
                    }
                });
                //TextView.setContentView(R.layout.list_item);
                //String yourEditText = (EditText) currentposs.findViewById(R.id.quantity);
                //final View listItemView2 = listItemView1;
                final TextView quantityTextView1 = (TextView) listItemView1.findViewById(R.id.quantity);
                String userinput = quantityTextView1.getText().toString();
                //if(userinput.isEmpty()){
                //final TextView quantityTextView2 = (TextView) listItemView.findViewById(R.id.quantity);
                quantityTextView1.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                        // System.out.println("!!!!!!!!!!!!!!!!!!!!!!beforeTextChanged!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    }
                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                        //System.out.println("!!!!!!!!!!!!!!!!!!!!!!onTextChanged!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    }

                    //@Override
                    public void afterTextChanged(Editable s) {
                        System.out.println("!!!!!!!!!!!!!!!!!!!!!!afterTextChanged!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                        String numberInserted;
                        final View listItemView2 = listItemView1;
                        final TextView quantityTextView2 = (TextView) listItemView2.findViewById(R.id.quantity);
                        String userinput = quantityTextView2.getText().toString();
                        //System.out.println("user input: " + userinput + "-------------------------------");
                        //if (userinput.isEmpty()) {

                        int drawer = Drawers.DrawerChosen;
                        //ListProcessing.wagon[0][drawer][position][3] = userinput;
                        //System.out.println("ListProcessing.wagon[0]["+drawer+"]["+position+"][3]: " + ListProcessing.wagon[0][drawer][position][3] + "-------------------------------");
                        ListProcessing.ChangeData(drawer, position, userinput);
                    }
                });
            }


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

