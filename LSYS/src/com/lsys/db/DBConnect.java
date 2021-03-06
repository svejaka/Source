package com.lsys.db;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Konstantin
 */
public class DBConnect {

    private static final String DRIVER = "org.postgresql.Driver";
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/";
    private static final String DB_NAME = "TestDB";
    private static final String USER = "postgres";
    private static final String PASS = "masterx";
    public static Connection conn = null;

    public static Connection createConnection() throws Exception {
        try {
            Class.forName(DRIVER).newInstance();
            conn = DriverManager.getConnection(DB_URL + DB_NAME, USER, PASS);
            return conn;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
}
