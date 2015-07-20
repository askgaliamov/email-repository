package com.galiamov.mailrepository.world.mysql

import com.google.inject.Binder
import com.netflix.governator.guice.AutoBindProvider
import groovy.sql.Sql

class MySQLAutoBindProvider implements AutoBindProvider<MySQL> {

    private static Map<String, Sql> sqls = new HashMap<>()
    private static final Properties properties = new Properties();
    private static final String CONFIG_PROPERTIES_FILE = "/config.properties";

    void configure(Binder binder, MySQL annotation) {
        properties.load(MySQLAutoBindProvider.class.getResourceAsStream(CONFIG_PROPERTIES_FILE))

        def dbURL = properties.getProperty("db.url")
        def dbUser = properties.getProperty("db.username")
        def dbPass = properties.getProperty("db.password")

        def sql = sqls.get(annotation.databaseName())
        if (sql == null) {
            sql = Sql.newInstance("$dbURL/${annotation.databaseName()}?user=$dbUser&password=$dbPass")
            sqls.put(annotation.databaseName(), sql)
        }
        binder.bind(Sql).annotatedWith(new MySQLImpl(annotation.databaseName())).toInstance(sql)
    }

}