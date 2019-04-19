package com.bpd.arsip.database;

import java.sql.Connection;
import org.apache.log4j.Logger;

/**
 *
 * @author Dany Candra
 */
public class DatabaseConnection {
    
    private static final Logger arsipLog = Logger.getLogger(DatabaseConnection.class);
    private static Connection connection;

    public static Connection getConnection() {
        return connection;
    }
    
    
    
}
