package com.epam.giwigiwi.PC_Assembling.util;

import com.epam.giwigiwi.PC_Assembling.entity.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class Pc_Factory {
    private static Logger log = LoggerFactory.getLogger(Pc_Factory.class.getName());

    public Pc_Factory() {
    }

    public static void isItWork(Computer compCase) {
        int powerSupplyCapacity = compCase.getPowerSupply();
        if (powerSupplyCapacity == 0) {
            log.info("Power supply capacity is null");
        } else {
            int aggregatePower = 0;
            for (Part partsList : compCase.getPartsList()) {
                aggregatePower += partsList.getPower();
            }
            int result = powerSupplyCapacity - aggregatePower;
            if (powerSupplyCapacity > aggregatePower) {
                log.info("Your PC will work well, you have {} free power", result);
            } else {
                log.info("Not enough power, you need {} more", result);
            }
        }
    }

    public static Computer getNewPC(int vCardCount, int hddCount, int powerSupplyCapacity) {
        ArrayList<Part> compParts = new ArrayList<>();
        for (int i = 0; i < vCardCount; i++)
            compParts.add(getNewVcard());
        for (int i = 0; i < hddCount; i++)
            compParts.add(getNewHdd());
        compParts.add(getNewCpu());
        compParts.add(getNewRam());
        return new Computer(compParts, powerSupplyCapacity);
    }

    public static Computer getNewRandomPC(int powerSupplyCapacity) {
        int vCardsRange = (int) (Math.random() * 4);
        int hddRange = (int) (Math.random() * 4);
        ArrayList<Part> compParts = new ArrayList<>();
        for (int i = 0; i <= vCardsRange; i++)
            compParts.add(getNewVcard());
        for (int i = 0; i <= hddRange; i++)
            compParts.add(getNewHdd());
        compParts.add(getNewCpu());
        compParts.add(getNewRam());
        return new Computer(compParts, powerSupplyCapacity);
    }

    public static Hdd getNewHdd() {
        int powerRange = (int) (Math.random() * 5);
        log.debug("HDD power range {}", powerRange);
        int spindleSpeedRange = (int) (Math.random() * 4);
        log.debug("Spindle speed range {}", spindleSpeedRange);
        String[] power;
        String[] spindleSpeed;
        power = PropManager.getInstance().getArrayProperty("hdd.power");
        spindleSpeed = PropManager.getInstance().getArrayProperty("hdd.spindle.speed");
        log.info("create new HDD: power: {}W, spindle speed: {}Rt/min",
                power[powerRange], spindleSpeed[spindleSpeedRange]);
        return new Hdd(Integer.parseInt(power[powerRange]), spindleSpeed[spindleSpeedRange]);
    }

    public static Ram getNewRam() {
        int powerRange = (int) (Math.random() * 5);
        log.debug("RAM power range {}", powerRange);
        int clockRange = (int) (Math.random() * 5);
        log.debug("RAM clock range {}", clockRange);
        int capacityRange = (int) (Math.random() * 5);
        log.debug("RAM capacity range {}", capacityRange);
        String[] power;
        String[] clock;
        String[] capacity;
        power = PropManager.getInstance().getArrayProperty("ram.power");
        clock = PropManager.getInstance().getArrayProperty("ram.clock");
        capacity = PropManager.getInstance().getArrayProperty("ram.capacity");
        log.info("create new RAM: power: {}W, clock: {}MHz, capacity: {}Gb ",
                power[powerRange], clock[clockRange], capacity[capacityRange]);
        return new Ram(Integer.parseInt(power[powerRange]), clock[clockRange], capacity[capacityRange]);
    }

    public static Cpu getNewCpu() {
        int powerRange = (int) (Math.random() * 5);
        log.debug("cpu power range {}", powerRange);
        int clockRange = (int) (Math.random() * 7);
        log.debug("cpu clock range {}", clockRange);
        int bitsRange = (int) (Math.random() * 2);
        log.debug("cpu architecture range {}", bitsRange);
        String[] power;
        String[] clock;
        String[] bits;
        power = PropManager.getInstance().getArrayProperty("cpu.power");
        clock = PropManager.getInstance().getArrayProperty("cpu.clock");
        bits = PropManager.getInstance().getArrayProperty("cpu.bits");
        log.info("create new CPU: power: {}W, clock: {}MHz, based on {} architecture",
                power[powerRange], clock[clockRange], bits[bitsRange]);
        return new Cpu(Integer.parseInt(power[powerRange]), clock[clockRange], bits[bitsRange]);
    }

    public static VideoCard getNewVcard() {
        int powerRange = (int) (Math.random() * 5);
        log.debug("Video card power range {}", powerRange);
        int producerRange = (int) (Math.random() * 2);
        log.debug("Video card producer range {}", producerRange);
        int memorySizeRange = (int) (Math.random() * 3);
        log.debug("Video card memory size range {}", memorySizeRange);
        String[] power;
        String[] producer;
        String[] memorySize;
        power = PropManager.getInstance().getArrayProperty("vCard.power");
        producer = PropManager.getInstance().getArrayProperty("vCard.producer");
        memorySize = PropManager.getInstance().getArrayProperty("vCard.ram.size");
        log.info("create new Video card: power: {}W, from {}, with {}Gb of memory",
                power[powerRange], producer[producerRange], memorySize[memorySizeRange]);
        return new VideoCard(Integer.parseInt(power[powerRange]), producer[producerRange],
                memorySize[memorySizeRange]);
    }

}
