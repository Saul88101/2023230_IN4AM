/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saulmartinez.proyecto.conexionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Will
 */
public class ConnectionDB {

    private static ConnectionDB instanceConnectionDB;
    private String usuario = "root";
    private String clave = "";  // Usuario de compu de Kinal
    private String clave2 = ""; // Mi compu personal
    private String url = "jdbc:mysql://localhost:3306/gestor_usuarios_in4av";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private Connection instanciaConnection;

    private ConnectionDB() {
        try {
            Class.forName(DRIVER);

            instanciaConnection = DriverManager.getConnection(url, usuario, clave2);

        } catch (ClassNotFoundException errorClassNotFound) {
            System.out.println("Error de clase no encontrada");

        } catch (SQLException errorSQL) {
            System.out.println("Error de SQL");

        } catch (Exception errorPadre) {
            System.out.println("Error top");
        }
    }

    public Connection getInstanciaConnection() {
        return instanciaConnection;
    }

    public static ConnectionDB getInstanceConnectionDB() {
        if (instanceConnectionDB == null) {
            instanceConnectionDB = new ConnectionDB();
        }
        return instanceConnectionDB;
    }
}
