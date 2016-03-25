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
                new scLogin().setVisible(true);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        });
    }
}
