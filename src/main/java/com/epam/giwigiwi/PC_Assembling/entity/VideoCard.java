package com.epam.giwigiwi.PC_Assembling.entity;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class VideoCard {
    private static Logger log = LoggerFactory.getLogger(VideoCard.class.getName());
    private int power;
    private String producer;
    private String ramSize;

    public VideoCard() {
    }

    public VideoCard(int power, String producer, String ramSize) {
        this.power = power;
        this.producer = producer;
        this.ramSize = ramSize;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getRamSize() {
        return ramSize;
    }

    public void setRamSize(String ramSize) {
        this.ramSize = ramSize;
    }
}
