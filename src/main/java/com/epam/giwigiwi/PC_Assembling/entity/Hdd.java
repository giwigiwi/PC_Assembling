package com.epam.giwigiwi.PC_Assembling.entity;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Hdd {
    private static Logger log = LoggerFactory.getLogger(Hdd.class.getName());
    private int power;
    private String spindleSpeed;

    public Hdd() {
    }

    public Hdd(int power, String rotateSpeed) {
        this.power = power;
        this.spindleSpeed = rotateSpeed;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getSpindleSpeed() {
        return spindleSpeed;
    }

    public void setSpindleSpeed(String spindleSpeed) {
        this.spindleSpeed = spindleSpeed;
    }
}
