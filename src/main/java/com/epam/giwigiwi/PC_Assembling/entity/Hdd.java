package com.epam.giwigiwi.PC_Assembling.entity;

public class Hdd extends Accessories {
    private String spindleSpeed;

    public Hdd() {
    }

    public Hdd(int power, String rotateSpeed) {
        this.power = power;
        this.spindleSpeed = rotateSpeed;
    }

    @Override
    public String toString() {
        return "Hdd{" +
                "power= " + power+'\''+
                "W, spindleSpeed='" + spindleSpeed + '\'' +
                "Rt/min "+'}';
    }

    public String getSpindleSpeed() {
        return spindleSpeed;
    }

    public void setSpindleSpeed(String spindleSpeed) {
        this.spindleSpeed = spindleSpeed;
    }
}
