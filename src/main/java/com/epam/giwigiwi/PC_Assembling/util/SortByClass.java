package com.epam.giwigiwi.PC_Assembling.util;

import com.epam.giwigiwi.PC_Assembling.entity.Accessories;

import java.util.Comparator;

public class SortByClass implements Comparator<Accessories>{
    @Override
    public int compare(Accessories ac1, Accessories ac2) {
        return String.valueOf(ac1.getClass()).compareTo(String.valueOf(ac2.getClass()));
    }
}
