/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saulmartinez.proyecto.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Will
 */
public class ConnectionDB {

    private static ConnectionDB instanceConnectionDB;
    private String userDB = "root";
    private String claveDB = "config123";
    private String urlJDBC = "jdbc:mysql://localhost:3306/gestor_usuarios_db_in4am";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private Connection instanciaConnection;

    private ConnectionDB() {
        try {
            //Busca la clase del Driver
            Class.forName(DRIVER);

            //Crear conexion con la DB
            instanciaConnection = DriverManager.getConnection(urlJDBC, userDB, claveDB);

        } catch (ClassNotFoundException errorClassNotFound) {
            System.out.println("Error de clase no encontrada");

        } catch (SQLException errorSQL) {
            System.out.println("Error de SQL");

        } catch (Exception errorPadre) {
            System.out.println("Error de jerarquia top");
        }
    }

    public Connection getInstanciaConnection() {
        return instanciaConnection;
    }

    public void setInstanciaConnection(Connection instanciaConnection) {
        if (instanciaConnection == null) {
            this.instanciaConnection = instanciaConnection;
        }
    }

}
