package com.epam.giwigiwi.PC_Assembling.entity;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Hdd {
    private static Logger log = LoggerFactory.getLogger(Hdd.class.getName());
    private int power;
    private String rotateSpeed;

    public Hdd() {
    }

    public Hdd(int power, String rotateSpeed) {
        this.power = power;
        this.rotateSpeed = rotateSpeed;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getRotateSpeed() {
        return rotateSpeed;
    }

    public void setRotateSpeed(String rotateSpeed) {
        this.rotateSpeed = rotateSpeed;
    }
}
