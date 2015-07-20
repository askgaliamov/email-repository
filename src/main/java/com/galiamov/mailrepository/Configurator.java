package com.galiamov.mailrepository;

import org.apache.commons.dbcp.BasicDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

public class Configurator {

    private static final Logger LOG = LoggerFactory.getLogger(Configurator.class);

    private static final Properties properties = new Properties();
    private static final String CONFIG_PROPERTIES_FILE = "/config.properties";

    static void configure(BasicDataSource ds) {
        try {
            properties.load(Configurator.class.getResourceAsStream(CONFIG_PROPERTIES_FILE));
        } catch (Exception e) {
            LOG.error("Load properties from file: {}, throws exception.", CONFIG_PROPERTIES_FILE, e);
        }

        ds.setDriverClassName(properties.getProperty("db.driver"));
        ds.setUrl(properties.getProperty("db.url"));
        ds.setUsername(properties.getProperty("db.username"));
        ds.setPassword(properties.getProperty("db.password"));
    }

}
