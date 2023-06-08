/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectUas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author User
 */
public class koneksi {
    public Connection getConnection() {
    Connection connection = null;
    try {
        // Ganti <host>, <port>, <database>, <username>, <password> sesuai dengan konfigurasi MySQL Anda
        String url = "jdbc:mysql://<host>:<port>/<database>";
        String username = "<username>";
        String password = "<password>";

        // Membuat koneksi
        connection = DriverManager.getConnection(url, username, password);
        System.out.println("Berhasil terhubung ke database!");
    } catch (SQLException e) {
        System.out.println("Gagal terhubung ke database: " + e.getMessage());
    }
    return connection;
}

}
