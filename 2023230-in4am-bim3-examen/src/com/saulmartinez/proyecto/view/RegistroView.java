/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saulmartinez.proyecto.view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

/**
 *
 * @author Will
 */
public class RegistroView extends BorderPane {
    
    private static RegistroView instanciaRegistroUsuarioView;
    private HBox barraDeVentana;
    
    private Label lblTituloVentana;
    private Label lblusername;
    private Label lblnombres;
    private Label lblapellidos;
    private Label lblconfirmarPassword;
    private Label lblcorreo;
    
    private TextField txtNombres;
    private TextField txtApellidos;
    private TextField txtUserName;
    private TextField txtCorreo;
    
    private PasswordField pwdContrasena;
    private PasswordField pwdConfirmarPass;
    
    private Button btnRegistrarse;
    
    //GETTER Y SETTER

    public static RegistroView getInstanciaRegistroUsuarioView() {
        return instanciaRegistroUsuarioView;
    }

    public HBox getBarraDeVentana() {
        return barraDeVentana;
    }

    public Label getLblTituloVentana() {
        return lblTituloVentana;
    }

    public Label getLblusername() {
        return lblusername;
    }

    public Label getLblnombres() {
        return lblnombres;
    }

    public Label getLblapellidos() {
        return lblapellidos;
    }

    public Label getLblconfirmarPassword() {
        return lblconfirmarPassword;
    }

    public Label getLblcorreo() {
        return lblcorreo;
    }

    public TextField getTxtNombres() {
        return txtNombres;
    }

    public TextField getTxtApellidos() {
        return txtApellidos;
    }

    public TextField getTxtUserName() {
        return txtUserName;
    }

    public TextField getTxtCorreo() {
        return txtCorreo;
    }

    public PasswordField getPwdContrasena() {
        return pwdContrasena;
    }

    public PasswordField getPwdConfirmarPass() {
        return pwdConfirmarPass;
    }

    public Button getBtnRegistrarse() {
        return btnRegistrarse;
    }

    public static void setInstanciaRegistroUsuarioView(RegistroView instanciaRegistroUsuarioView) {
        RegistroView.instanciaRegistroUsuarioView = instanciaRegistroUsuarioView;
    }

    public void setBarraDeVentana(HBox barraDeVentana) {
        this.barraDeVentana = barraDeVentana;
    }

    public void setLblTituloVentana(Label lblTituloVentana) {
        this.lblTituloVentana = lblTituloVentana;
    }

    public void setLblusername(Label lblusername) {
        this.lblusername = lblusername;
    }

    public void setLblnombres(Label lblnombres) {
        this.lblnombres = lblnombres;
    }

    public void setLblapellidos(Label lblapellidos) {
        this.lblapellidos = lblapellidos;
    }

    public void setLblconfirmarPassword(Label lblconfirmarPassword) {
        this.lblconfirmarPassword = lblconfirmarPassword;
    }

    public void setLblcorreo(Label lblcorreo) {
        this.lblcorreo = lblcorreo;
    }

    public void setTxtNombres(TextField txtNombres) {
        this.txtNombres = txtNombres;
    }

    public void setTxtApellidos(TextField txtApellidos) {
        this.txtApellidos = txtApellidos;
    }

    public void setTxtUserName(TextField txtUserName) {
        this.txtUserName = txtUserName;
    }

    public void setTxtCorreo(TextField txtCorreo) {
        this.txtCorreo = txtCorreo;
    }

    public void setPwdContrasena(PasswordField pwdContrasena) {
        this.pwdContrasena = pwdContrasena;
    }

    public void setPwdConfirmarPass(PasswordField pwdConfirmarPass) {
        this.pwdConfirmarPass = pwdConfirmarPass;
    }

    public void setBtnRegistrarse(Button btnRegistrarse) {
        this.btnRegistrarse = btnRegistrarse;
    }
    
}
