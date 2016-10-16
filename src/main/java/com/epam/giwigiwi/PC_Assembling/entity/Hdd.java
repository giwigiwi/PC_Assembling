package com.epam.giwigiwi.PC_Assembling.entity;

public class Hdd extends Part {
    private String spindleSpeed;

    public Hdd() {
    }

    public Hdd(int power, String rotateSpeed) {
        this.power = power;
        this.spindleSpeed = rotateSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hdd hdd = (Hdd) o;

        return spindleSpeed != null ? spindleSpeed.equals(hdd.spindleSpeed) : hdd.spindleSpeed == null;

    }

    @Override
    public int hashCode() {
        return spindleSpeed != null ? spindleSpeed.hashCode() : 0;
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
