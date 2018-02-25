package com.example.notandi.hospitalwagons;

import android.content.Context;

/**
 * Created by Ósk on 7.2.2018.
 */

public class Item {

    private String item;
    private String info;
    private String dose;
    private String type;
    private int quantity;

    private boolean isInfo = false;
    private boolean isDose = false;
    private boolean isQuantity = false;
    private boolean isCheckBox = false;

    /**
     *
     * @param wItem
     */
    public Item(String wItem) {
        item = wItem;
        isCheckBox = true;
    }

    /**
     * @param wItem is the name of the item/medicine
     * @param wQuantity is how many items there should be total
     * @param wType ...
     */
    public Item(String wItem, int wQuantity, String wType) {
        item = wItem;
        quantity = wQuantity;
        type = wType;
        isCheckBox = true;
        isQuantity = true;
    }

    public Item(String wItem, String wInfo, String wDose, int wQuantity, String wType) {
        item = wItem;
        info = wInfo;
        dose = wDose;
        quantity = wQuantity;
        type = wType;
        isCheckBox = true;
        isQuantity = true;
        isDose = true;
        isInfo = true;
    }

    public String getItem() {
        return item;
    }

    public String getInfo() {
        return info;
    }

    public String getDose() {
        return dose;
    }

    public String getType() {
        return type;
    }

    public String getQuantity() {
        return Integer.toString(quantity);
    }

    public boolean isCheckBox() {
        return isCheckBox;
    }

    public boolean isInfo() {
        return isInfo;
    }

    public boolean isDose() {
        return isDose;
    }

    public boolean isQuantity() {
        return isQuantity;
    }

}

