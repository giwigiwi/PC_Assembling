package com.epam.giwigiwi.PC_Assembling.util;

import com.epam.giwigiwi.PC_Assembling.Main;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class PropManager {
    private static Logger log = LoggerFactory.getLogger(PropManager.class.getName());
    private static PropManager ourInstance = new PropManager();
    private final Properties property;

    public static PropManager getInstance() {
        return ourInstance;
    }

    private PropManager() {
        property = new Properties();
        InputStream in = Main.class.getClassLoader().getResourceAsStream("Accessories.properties");
        try {
            property.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String getProperty(String key) {
        return property.getProperty(key);

    }
    public String[] getArrayProperty(String key){
        return property.getProperty(key).split(",");
    }

}
