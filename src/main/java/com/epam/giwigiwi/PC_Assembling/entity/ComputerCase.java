package com.epam.giwigiwi.PC_Assembling.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ComputerCase extends Accessories {
    private static Logger log = LoggerFactory.getLogger(ComputerCase.class.getName());
    private Cpu cpu;
    private Hdd hdd;
    private Ram ram;
    private VideoCard vCard;
    private int powerSupply;

    public ComputerCase() {
    }

    public ComputerCase(Cpu cpu, Hdd hdd, Ram ram, VideoCard vCard, int powerSupply) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.vCard = vCard;
        this.powerSupply = powerSupply;
        log.info("Your PC was successful assembling");
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public VideoCard getvCard() {
        return vCard;
    }

    public void setvCard(VideoCard vCard) {
        this.vCard = vCard;
    }

    public int getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(int powerSupply) {
        this.powerSupply = powerSupply;
    }

}
