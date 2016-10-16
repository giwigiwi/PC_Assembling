package com.epam.giwigiwi.PC_Assembling.util;

import com.epam.giwigiwi.PC_Assembling.entity.Part;

import java.util.Comparator;

public class SortByClass implements Comparator<Part>{
    @Override
    public int compare(Part ac1, Part ac2) {
        return String.valueOf(ac1.getClass()).compareTo(String.valueOf(ac2.getClass()));
    }
}
