/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saulmartinez.proyecto.controller;

import com.saulmartinez.proyecto.repository.UserRepository;


/**
 *
 * @author Will
 */
public class AuthController {

    private final UserRepository userRepository;

    public AuthController() {
        this.userRepository = new UserRepository();
    }

}