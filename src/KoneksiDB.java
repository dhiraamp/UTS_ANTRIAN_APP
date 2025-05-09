/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAdm-AdhiraMaharani
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class KoneksiDB {
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/manajemen_antrian";
            String user = "root";
            String password = "";

            return DriverManager.getConnection(url, user, password); // koneksi baru setiap kali
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Koneksi Gagal: " + e.getMessage());
            return null;
        }
    }
}
