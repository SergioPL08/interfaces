package com.mycompany.tresenraya;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class PrimaryController {

    @FXML
    private Button boton01,boton02,boton10,boton11,boton12,boton20,boton21,boton22;
    @FXML
    private Label label, boton00    ;
    
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
    @FXML
    private void miclick(MouseEvent e){
        boton00.setText("0");
        System.out.println("Hola");
        
    }
}
