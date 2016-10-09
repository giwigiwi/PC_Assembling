package com.epam.giwigiwi.PC_Assembling;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


public class Service {
    private static Logger log = LoggerFactory.getLogger(Service.class.getName());
    private static Service ourInstance = new Service();

    public static Service getInstance() {
        return ourInstance;
    }

    private Service() {
    }
}
