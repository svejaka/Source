package com.lsys.main;

import com.lsys.ui.*;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Konstantin
 */
public class LSYS {
    public static void main(String[] args) throws SQLException, Exception {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Login().setVisible(true);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Login broken !");
            }
        });
    }

//    private static void selectStatement(String statement) {
//        try {
//            stmt = conn.createStatement();
//            ResultSet results = stmt.executeQuery(statement);
//            while (results.next()) {
//                System.out.println("ID: " + results.getInt(1) + " NAME: " +  results.getString(2) + " VALUE: " + results.getString(3));
//            }
//            results.close();
//            stmt.close();
//        } catch (SQLException sqlExcept) {
//            sqlExcept.printStackTrace();
//        }
//    }
//    
//    private static void insertStatement(String tableName, String value) {
//        try {
//            stmt = conn.createStatement();
//            stmt.executeUpdate("Insert into " + tableName + " values (" + value + ")");
//            stmt.close();
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//    }
//    
//    private static void updateStatement(String tableName,String column, String value) {
//        try {
//            stmt = conn.createStatement();
//            stmt.executeUpdate("UPDATE " + tableName + " SET " + column + " = " + value);
//            stmt.close();
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//    }
}
