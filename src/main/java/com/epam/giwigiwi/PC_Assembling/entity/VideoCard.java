package com.epam.giwigiwi.PC_Assembling.entity;

public class VideoCard extends Accessories {
    private String producer;
    private String ramSize;

    public VideoCard() {
    }

    public VideoCard(int power, String producer, String ramSize) {
        this.power = power;
        this.producer = producer;
        this.ramSize = ramSize;
    }

    @Override
    public String toString() {
        return "VideoCard{" +
                "power= " + power+'\''+
                "W, producer='" + producer + '\'' +
                ", ramSize='" + ramSize + '\'' +
                "Gb"+'}';
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getRamSize() {
        return ramSize;
    }

    public void setRamSize(String ramSize) {
        this.ramSize = ramSize;
    }
}
