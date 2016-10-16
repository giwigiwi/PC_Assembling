package com.epam.giwigiwi.PC_Assembling.entity;

public class Ram extends Part {
    private String clock;
    private String capacity;

    public Ram() {
    }

    public Ram(int power, String clock, String capacity) {
        this.power = power;
        this.clock = clock;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "power= " + power + '\'' +
                "W, clock='" + clock + '\'' +
                "MHz, capacity='" + capacity + '\'' +
                "Gb " + '}';
    }

    public String getClock() {
        return clock;
    }

    public void setClock(String clock) {
        this.clock = clock;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

}
