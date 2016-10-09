package com.epam.giwigiwi.PC_Assembling;

import com.epam.giwigiwi.PC_Assembling.entity.ComputerCase;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Main {
    private static Logger log = LoggerFactory.getLogger(Main.class.getName());
    public static void main(String[] args) {
          Service service = new Service();
        ComputerCase pc1 =service.getNewPC(850);
        service.isItWork(pc1);


    }
}
