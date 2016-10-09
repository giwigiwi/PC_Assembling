package com.epam.giwigiwi.PC_Assembling.entity;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Cpu {
    private static Logger log = LoggerFactory.getLogger(Cpu.class.getName());
    private int power;
    private String clock;
    private String bits;

    public Cpu() {
    }

    public Cpu(int power, String clock, String bits) {
        this.power = power;
        this.clock = clock;
        this.bits = bits;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getClock() {
        return clock;
    }

    public void setClock(String clock) {
        this.clock = clock;
    }

    public String getBitCount() {
        return bits;
    }

    public void setBitCount(String bits) {
        this.bits = bits;
    }
}

