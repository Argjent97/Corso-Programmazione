/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package it.tss.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author tss
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String url = "jdbc:mariadb://localhost:3306";
            try (Connection connection = DriverManager.getConnection(url, "tss", "root")) {
                System.out.println("connessione ok...");
                Statement cmd = connection.createStatement();
                connection.setCatalog("DBScuola");
                try (ResultSet rs = cmd.executeQuery("select * from t_corsi")) {
                    while (rs.next()) {
                        System.out.println(rs.getString("titolo_corso"));
                    }
                }
            }

        } catch (SQLException ex) {
            System.out.println("errore..." + ex);
        }
    }

}
