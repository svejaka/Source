package com.lsys.db;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Konstantin
 */
public class DBConnect {

    private static final String DRIVER = "org.postgresql.Driver";
    private static final String DB_URL = "jdbc:postgresql://localhost:5433/TestDB";
    private static final String USER = "postgres";
    private static final String PASS = "masterx";
    public static Connection conn = null;

    public static Connection createConnection() throws Exception {
        try {
            Class.forName(DRIVER).newInstance();
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            JOptionPane.showMessageDialog(null, "Database connected sucessfully");
            return conn;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong");
        }
        return null;
    }
}
