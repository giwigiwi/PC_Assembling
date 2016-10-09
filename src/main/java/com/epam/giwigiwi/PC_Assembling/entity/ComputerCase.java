package com.epam.giwigiwi.PC_Assembling.entity;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class ComputerCase {
    private static Logger log = LoggerFactory.getLogger(ComputerCase.class.getName());
    private Cpu Cpu;
    private Hdd Hdd;
    private Ram Ram;
    private VideoCard Vcard;
    private int PowerCase;

    public ComputerCase() {
    }

    public void setCpu(com.epam.giwigiwi.PC_Assembling.entity.Cpu cpu) {
        Cpu = cpu;
    }

    public void setHdd(com.epam.giwigiwi.PC_Assembling.entity.Hdd hdd) {
        Hdd = hdd;
    }

    public void setRam(com.epam.giwigiwi.PC_Assembling.entity.Ram ram) {
        Ram = ram;
    }

    public void setVcard(VideoCard vcard) {
        Vcard = vcard;
    }

    public void setPowerCase(int powerCase) {
        PowerCase = powerCase;
    }
}
