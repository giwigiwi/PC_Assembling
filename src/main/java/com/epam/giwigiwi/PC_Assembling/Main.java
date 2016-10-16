package com.epam.giwigiwi.PC_Assembling;

import com.epam.giwigiwi.PC_Assembling.entity.Computer;
import com.epam.giwigiwi.PC_Assembling.util.Pc_Factory;

public class Main {
    public static void main(String[] args) {
        PC_Service service = new PC_Service();
        Computer pc1 = Pc_Factory.getNewRandomPC(1800);
        Pc_Factory.isItWork(pc1);
        service.sortByPower(pc1.getPartsList());
        service.findByPower(pc1.getPartsList(), 200);
        Computer pc2 = Pc_Factory.getNewPC(1, 2, 750);
        Pc_Factory.isItWork(pc2);
    }
}
