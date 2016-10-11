package com.epam.giwigiwi.PC_Assembling.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropManager {
    private static Logger log = LoggerFactory.getLogger(PropManager.class.getName());
    private static PropManager Instance = new PropManager();
    private final Properties property;

    private PropManager() {
        property = new Properties();
        InputStream in = PropManager.class.getClassLoader().getResourceAsStream("Accessories.properties");
        try {
            property.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static PropManager getInstance() {
        return Instance;
    }

    public String getProperty(String key) {
        return property.getProperty(key);

    }

    public String[] getArrayProperty(String key) {
        return getProperty(key).split(",");
    }

}
