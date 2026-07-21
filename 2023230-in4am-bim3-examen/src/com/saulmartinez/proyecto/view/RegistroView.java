/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saulmartinez.proyecto.view;

import com.saulmartinez.proyecto.controller.AuthController;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Will
 */
public class RegistroView {

    private AuthController controller = new AuthController();

    public void iniciarStage(Stage stageRoot) {
        stageRoot.initStyle(StageStyle.UNDECORATED);

        Label lblTitulo = new Label("Crear cuenta");

        TextField txtUsername = new TextField();
        txtUsername.setPromptText("Nombre de usuario");

        TextField txtNombres = new TextField();
        txtNombres.setPromptText("Nombres");

        TextField txtApellidos = new TextField();
        txtApellidos.setPromptText("Apellidos");

        TextField txtCorreo = new TextField();
        txtCorreo.setPromptText("Correo electrónico");

        PasswordField txtPass = new PasswordField();
        txtPass.setPromptText("Contraseña");

        PasswordField txtConfirmPass = new PasswordField();
        txtConfirmPass.setPromptText("Confirmar contraseña");

        Label lblMensaje = new Label();

        Button btnRegistrar = new Button("Registrar");
        Button btnVolver = new Button("Volver al Login");

    }
}
