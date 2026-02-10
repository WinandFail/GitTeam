package com.example._02611;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Bienvenido profesor Raul a nuestro ejemplo fx");
    }

    @FXML
    private Label Integrantes;

    @FXML
    private void mostrarIntegrantes() {Integrantes.setText("• Alejandro\n" + "• Danilo\n" + "• Juan\n"+ "• Luis");
    }

}
