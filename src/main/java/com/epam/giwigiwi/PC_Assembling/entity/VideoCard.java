package com.epam.giwigiwi.PC_Assembling.entity;

public class VideoCard extends Part {
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
                "power= " + power + '\'' +
                "W, producer='" + producer + '\'' +
                ", ramSize='" + ramSize + '\'' +
                "Gb" + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VideoCard videoCard = (VideoCard) o;

        if (producer != null ? !producer.equals(videoCard.producer) : videoCard.producer != null) return false;
        return ramSize != null ? ramSize.equals(videoCard.ramSize) : videoCard.ramSize == null;

    }

    @Override
    public int hashCode() {
        int result = producer != null ? producer.hashCode() : 0;
        result = 31 * result + (ramSize != null ? ramSize.hashCode() : 0);
        return result;
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
