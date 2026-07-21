/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saulmartinez.proyecto.controller;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author Will
 */
public class SceneManager {

    private static SceneManager instanciaSceneManager;
    private Stage escenarioPrincipal;
    private Stage escenarioSecundario;
    private Scene escenaPrincipal;

    public SceneManager(Stage escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }

    public void cambiarEscena(Pane panel, int ancho, int largo) {
        try {
            escenaPrincipal = new Scene(panel, ancho, largo);
            escenarioPrincipal.setScene(escenaPrincipal);
            escenarioPrincipal.sizeToScene();
            escenarioPrincipal.show();
        } catch (NullPointerException objetoNulo) {
            JOptionPane.showMessageDialog(null, "Error objeto nulo");
            objetoNulo.printStackTrace();

        } catch(Exception errorPadre)  {
            JOptionPane.showMessageDialog(null, "Error objeto padre");
            errorPadre.printStackTrace();
        }
    }
    
}
