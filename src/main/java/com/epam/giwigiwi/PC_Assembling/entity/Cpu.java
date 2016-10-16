package com.epam.giwigiwi.PC_Assembling.entity;

public class Cpu extends Part {
    private String clock;
    private String bits;

    public Cpu() {
    }

    public Cpu(int power, String clock, String bits) {
        this.power = power;
        this.clock = clock;
        this.bits = bits;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "power= " + power + '\'' +
                "W, clock='" + clock + '\'' +
                "MHz, bits='" + bits + '\'' +
                '}';
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

