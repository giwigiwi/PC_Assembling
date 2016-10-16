package com.epam.giwigiwi.PC_Assembling;

import com.epam.giwigiwi.PC_Assembling.entity.Part;
import com.epam.giwigiwi.PC_Assembling.util.SortByClass;
import com.epam.giwigiwi.PC_Assembling.util.SortByPower;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class PC_Service {
    private static Logger log = LoggerFactory.getLogger(PC_Service.class.getName());
    private Comparator<Part> comparator1 = new SortByPower().thenComparing(new SortByClass());

    public PC_Service() {
    }


    public void sortByPower(ArrayList partsList) {
        ArrayList<Part> sortedList = new ArrayList<>(partsList);
        Collections.sort(sortedList, comparator1);
        log.info("Parts was sorted by power");
        for (Part ac1 : sortedList) {
            log.info("{}", ac1.toString());
        }
    }

    public void findByPower(ArrayList partsList, int power) {
        int count = 0;
        String className;
        List<Part> sortedList = new ArrayList<>(partsList);
        for (Part ac1 : sortedList) {
            if (ac1.getPower() == power) {
                count++;
                className = (String.valueOf(ac1.getClass()));
                log.info("{} has searching power", className.substring(45, className.length()));
            }
        }
        if (count == 0)
            log.info("Now your PC has no accessories with this power");
    }
}


