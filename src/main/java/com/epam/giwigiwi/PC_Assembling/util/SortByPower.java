package com.epam.giwigiwi.PC_Assembling.util;

import com.epam.giwigiwi.PC_Assembling.entity.Accessories;

import java.util.Comparator;

public class SortByPower implements Comparator<Accessories> {

    @Override
    public int compare(Accessories ac1, Accessories ac2) {
        if(ac1.getPower()>ac2.getPower())
            return 1;
        else
        if(ac1.getPower()<ac2.getPower())
            return -1;
        else
        return 0;
    }
}
