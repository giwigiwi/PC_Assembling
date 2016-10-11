package com.epam.giwigiwi.PC_Assembling;

import com.epam.giwigiwi.PC_Assembling.entity.ComputerCase;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        ComputerCase pc1 = service.getNewPC(850);
        service.isItWork(pc1);
        service.sortByPower(service.getAccessoriesList(pc1));
        service.findByPower(service.getAccessoriesList(pc1),200);
    }
}
