package com.epam.giwigiwi.PC_Assembling;


import com.epam.giwigiwi.PC_Assembling.util.PropManager;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import static com.epam.giwigiwi.PC_Assembling.util.PropManager.*;

public class Main {
    private static Logger log = LoggerFactory.getLogger(Main.class.getName());
    public static void main(String[] args) {
            log.info("CPU power list {} {} {} {} {}",PropManager.getInstance().getArrayProperty("cpu.power"));
        log.info("all works as may");

    }
}
