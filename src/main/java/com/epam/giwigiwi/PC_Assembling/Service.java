package com.epam.giwigiwi.PC_Assembling;

import com.epam.giwigiwi.PC_Assembling.entity.ComputerCase;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import com.epam.giwigiwi.PC_Assembling.util.PcFactory;


public class Service {
    private static Logger log = LoggerFactory.getLogger(Service.class.getName());

    public Service() {
    }

    public ComputerCase getNewPC(int powerSupplyCapacity){
        PcFactory factory = new PcFactory();
    return new ComputerCase(factory.getNewCpu(),
                            factory.getNewHdd(),
                            factory.getNewRam(),
                            factory.getNewVcard(),
                            powerSupplyCapacity);
    }

    public void isItWork(ComputerCase compCase){
        int powerSupplyCapacity =compCase.getPowerSupply();
        if(powerSupplyCapacity == 0){
           log.info("Power supply capacity is null");
        }
        else{
            int aggregatePower = compCase.getCpu().getPower()
                    +compCase.getHdd().getPower()
                    +compCase.getRam().getPower()
                    +compCase.getVcard().getPower();
            int result=powerSupplyCapacity-aggregatePower;
            if(powerSupplyCapacity > aggregatePower){
                log.info("Your PC will work well, you have {} free power",result);
            }
            else{
                log.info("Not enough power, you need {} more",result);
            }
        }
    }
}
