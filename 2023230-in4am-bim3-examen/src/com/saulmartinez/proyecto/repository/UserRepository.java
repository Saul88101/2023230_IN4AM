/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saulmartinez.proyecto.repository;

import com.saulmartinez.proyecto.conexionDB.ConnectionDB;
import com.saulmartinez.proyecto.model.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Will
 */
public class UserRepository {

    public boolean registrarUsuarioDB(User usuario) {
        try {
            PreparedStatement prepararLlamada = ConnectionDB
                    .getInstanceConnectionDB()
                    .getInstanciaConnection()
                    .prepareCall("{call sp_create_user(?, ?, ?, ?, ?)}");

            prepararLlamada.setString(1, usuario.getUsername());
            prepararLlamada.setString(2, usuario.getNombreCompleto());
            prepararLlamada.setString(3, usuario.getApellidos());
            prepararLlamada.setString(4, usuario.getCorreo());
            prepararLlamada.setString(5, usuario.getPassword());

            return prepararLlamada.executeUpdate() > 0;

        } catch (SQLException errorSQL) {
            System.out.println("Error al registrar el usuario en la DB: " + errorSQL.getMessage());
            return false;
        } catch (Exception errorPadre) {
            System.out.println("Error top al registrar usuario: " + errorPadre.getMessage());
            return false;
        }
    }

    // SE VALIDAN LAS CREDENCIALES
    public boolean validarLoginDB(String username, String password) {
        try {
            PreparedStatement prepararLlamada = ConnectionDB
                    .getInstanceConnectionDB()
                    .getInstanciaConnection()
                    .prepareCall("{call sp_validar_login(?, ?)}");

            prepararLlamada.setString(1, username);
            prepararLlamada.setString(2, password);

            ResultSet resultado = prepararLlamada.executeQuery();
            return resultado.next();
            
        } catch (SQLException errorSQL) {
            System.out.println("Error al validar el login en la DB: " + errorSQL.getMessage());
            return false;
        } catch (Exception errorPadre) {
            System.out.println("Error top al validar login: " + errorPadre.getMessage());
            return false;
        }
    }

}
