package com.epam.giwigiwi.PC_Assembling;

import com.epam.giwigiwi.PC_Assembling.entity.Accessories;
import com.epam.giwigiwi.PC_Assembling.entity.ComputerCase;
import com.epam.giwigiwi.PC_Assembling.util.PcFactory;
import com.epam.giwigiwi.PC_Assembling.util.SortByClass;
import com.epam.giwigiwi.PC_Assembling.util.SortByPower;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


public class Service {
    private static Logger log = LoggerFactory.getLogger(Service.class.getName());
    private Comparator<Accessories> comparator1 = new SortByPower().thenComparing(new SortByClass());
    public Service() {
    }

    public ComputerCase getNewPC(int powerSupplyCapacity) {
        return new ComputerCase(PcFactory.getNewCpu(),
                PcFactory.getNewHdd(),
                PcFactory.getNewRam(),
                PcFactory.getNewVcard(),
                powerSupplyCapacity);
    }

    public void isItWork(ComputerCase compCase) {
        int powerSupplyCapacity = compCase.getPowerSupply();
        if (powerSupplyCapacity == 0) {
            log.info("Power supply capacity is null");
        } else {
            int aggregatePower = compCase.getCpu().getPower()
                    + compCase.getHdd().getPower()
                    + compCase.getRam().getPower()
                    + compCase.getvCard().getPower();
            int result = powerSupplyCapacity - aggregatePower;
            if (powerSupplyCapacity > aggregatePower) {
                log.info("Your PC will work well, you have {} free power", result);
            } else {
                log.info("Not enough power, you need {} more", result);
            }
        }
    }

    public TreeSet<Accessories> getAccessoriesList(ComputerCase case1) {
        TreeSet<Accessories> acList = new TreeSet<>(comparator1);
        acList.add(case1.getRam());
        acList.add(case1.getHdd());
        acList.add(case1.getCpu());
        acList.add(case1.getvCard());
        for (Accessories ac1:acList) {
            log.debug("Accessories list {} \n",ac1);
        }
        return acList;
    }

    public void sortByPower(TreeSet accessoriesList) {
        Set<Accessories> sortedList = new TreeSet<>(comparator1);
        sortedList.addAll(accessoriesList);
        log.info("Accessories was sorted by power");
        for (Accessories ac1 : sortedList) {
            log.info("{}", ac1.toString());
        }
    }

    public void findByPower(TreeSet accessoriesList, int power) {
        int count = 0;
        String className;
        Set<Accessories> sortedList = new TreeSet<>(comparator1);
        sortedList.addAll(accessoriesList);
        for (Accessories ac1 : sortedList) {
            if (ac1.getPower() == power) {
                count++;
                className=(String.valueOf(ac1.getClass()));
                log.info("{} has searching power",className.substring(45,className.length()));
            }
        }
        if (count == 0)
            log.info("Now your PC has no accessories with this power");
    }
}


