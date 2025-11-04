package org.pa.library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/nombre_base_datos?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "tu_contraseña";

        try {
            // Carga del driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Conexión
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("¡Conexión exitosa!");

            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("No se encontró el driver JDBC.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos.");
            e.printStackTrace();
        }
    }
}

