package com.epam.giwigiwi.PC_Assembling.entity;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


public class ComputerCase {
    private static Logger log = LoggerFactory.getLogger(ComputerCase.class.getName());
    private Cpu Cpu;
    private Hdd Hdd;
    private Ram Ram;
    private VideoCard Vcard;
    private int PowerSupply;

    public ComputerCase() {
    }

    public ComputerCase(Cpu cpu,Hdd hdd,Ram ram,VideoCard vcard, int powerSupply) {
        Cpu = cpu;
        Hdd = hdd;
        Ram = ram;
        Vcard = vcard;
        PowerSupply = powerSupply;
        log.info("Your PC was successful assembling");
    }

    public int getPowerSupply() {
        return PowerSupply;
    }

    public com.epam.giwigiwi.PC_Assembling.entity.Cpu getCpu() {
        return Cpu;
    }

    public com.epam.giwigiwi.PC_Assembling.entity.Hdd getHdd() {
        return Hdd;
    }

    public com.epam.giwigiwi.PC_Assembling.entity.Ram getRam() {
        return Ram;
    }

    public VideoCard getVcard() {
        return Vcard;
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

    public void setPowerSupply(int powerSupply) {
        PowerSupply = powerSupply;
    }
}
