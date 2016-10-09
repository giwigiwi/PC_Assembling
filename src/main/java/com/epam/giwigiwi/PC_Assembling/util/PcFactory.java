package com.epam.giwigiwi.PC_Assembling.util;

import com.epam.giwigiwi.PC_Assembling.entity.Cpu;
import com.epam.giwigiwi.PC_Assembling.entity.Hdd;
import com.epam.giwigiwi.PC_Assembling.entity.Ram;
import com.epam.giwigiwi.PC_Assembling.entity.VideoCard;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class PcFactory {
    private static Logger log = LoggerFactory.getLogger(PcFactory.class.getName());
    public PcFactory() {
    }
    public Hdd getNewHdd(){
        int powerRange= (int) (Math.random()*5);
        int rotateSpeedRange= (int) (Math.random()*4);
        String[] power;
        String[] rotateSpeed;
        power=PropManager.getInstance().getArrayProperty("hdd.power");
        rotateSpeed=PropManager.getInstance().getArrayProperty("hdd.rotate.speed");
        log.debug("create new HDD: {} {}",power,rotateSpeed);
        return new Hdd(Integer.parseInt(power[powerRange]),rotateSpeed[rotateSpeedRange]);
    }

    public Ram getNewRam(){
        int powerRange= (int) (Math.random()*4);
        int clockRange= (int) (Math.random()*4);
        int capacityRange= (int) (Math.random()*4);
        String[] power;
        String[] clock;
        String[] capacity;
        power=PropManager.getInstance().getArrayProperty("ram.power");
        clock=PropManager.getInstance().getArrayProperty("ram.clock");
        capacity=PropManager.getInstance().getArrayProperty("ram.capacity");
        log.debug("create new RAM: {} {} {}",power,clock,capacity);
        return new Ram(Integer.parseInt(power[powerRange]),clock[clockRange],capacity[capacityRange]);
    }

    public Cpu getNewCpu(){
        int powerRange= (int) (Math.random()*4);
        int clockRange= (int) (Math.random()*4);
        int bitsRange= (int) (Math.random()*1);
        String[] power;
        String[] clock;
        String[] bits;
        power=PropManager.getInstance().getArrayProperty("cpu.power");
        clock=PropManager.getInstance().getArrayProperty("cpu.clock");
        bits=PropManager.getInstance().getArrayProperty("cpu.bits");
        log.debug("create new CPU: {} {} {}",power,clock,bits);
        return new Cpu(Integer.parseInt(power[powerRange]),clock[clockRange],bits[bitsRange]);
    }

    public VideoCard getNewVcard(){
        int powerRange= (int) (Math.random()*4);
        int producerRange= (int) (Math.random()*1);
        int ramSizeRange= (int) (Math.random()*2);
        String[] power;
        String[] producer;
        String[] ramSize;
        power=PropManager.getInstance().getArrayProperty("vcard.power");
        producer=PropManager.getInstance().getArrayProperty("vcard.producer");
        ramSize=PropManager.getInstance().getArrayProperty("vcard.ram.size");
        log.debug("create new Video card: {} {} {}",power,producer,ramSize);
        return new VideoCard(Integer.parseInt(power[powerRange]),producer[producerRange],ramSize[ramSizeRange]);
    }

}
