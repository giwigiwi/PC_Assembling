package com.epam.giwigiwi.PC_Assembling.util;

import com.epam.giwigiwi.PC_Assembling.entity.Part;

import java.util.Comparator;

public class SortByPower implements Comparator<Part> {

    @Override
    public int compare(Part ac1, Part ac2) {
        if(ac1.getPower()>ac2.getPower())
            return 1;
        else
        if(ac1.getPower()<ac2.getPower())
            return -1;
        else
        return 0;
    }
}
