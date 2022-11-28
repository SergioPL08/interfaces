package com.mycompany.tresenraya;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class PrimaryController {

    static int turno=0;
    static int[][] marcado = new int[3][3];
    @FXML
    private Button boton00,boton01,boton02,boton10,boton11,boton12,boton20,boton21,boton22;
    @FXML
    private Label label;
    @FXML
    private Pane panel;
    
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
    
    
    @FXML
    private void click00(){
        String valor=boton00.getText();
        if(!(valor.equals("O"))&&(!valor.equals("X"))){
            if(turno%2==0){
                boton00.setText("O");
                label.setText("Turno de jugador 2");
                panel.setStyle("-fx-background-color: F28679;");
            }
            else{
                boton00.setText("X");
                label.setText("Turno de jugador 1");
                panel.setStyle("-fx-background-color: lightblue;");
            }
            turno++;
        }
    }
    
    @FXML
    private void click10(){
        String valor=boton10.getText();
        if(!(valor.equals("O"))&&(!valor.equals("X"))){
            if(turno%2==0){
                boton10.setText("O");
                label.setText("Turno de jugador 2");
                panel.setStyle("-fx-background-color: F28679;");
            }
            else{
                boton10.setText("X");
                label.setText("Turno de jugador 1");
                panel.setStyle("-fx-background-color: lightblue;");
            }
            turno++;
        }
    }
    
    @FXML
    private void click20(){
        String valor=boton20.getText();
        if(!(valor.equals("O"))&&(!valor.equals("X"))){
            if(turno%2==0){
                boton20.setText("O");
                label.setText("Turno de jugador 2");
                panel.setStyle("-fx-background-color: F28679;");
            }
            else{
                boton20.setText("X");
                label.setText("Turno de jugador 1");
                panel.setStyle("-fx-background-color: lightblue;");
            }
            turno++;
        }
    }
    
    @FXML
    private void click01(){
        String valor=boton01.getText();
        if(!(valor.equals("O"))&&(!valor.equals("X"))){
            if(turno%2==0){
                boton01.setText("O");
                label.setText("Turno de jugador 2");
                panel.setStyle("-fx-background-color: F28679;");
            }
            else{
                boton01.setText("X");
                label.setText("Turno de jugador 1");
                panel.setStyle("-fx-background-color: lightblue;");
            }
            turno++;
        }
    }
    @FXML
    private void click02(){
        String valor=boton02.getText();
        if(!(valor.equals("O"))&&(!valor.equals("X"))){
            if(turno%2==0){
                boton02.setText("O");
                label.setText("Turno de jugador 2");
                panel.setStyle("-fx-background-color: F28679;");
            }
            else{
                boton02.setText("X");
                label.setText("Turno de jugador 1");
                panel.setStyle("-fx-background-color: lightblue;");
            }
            turno++;
        }
    }
    
    @FXML
    private void click11(){
        String valor=boton11.getText();
        if(!(valor.equals("O"))&&(!valor.equals("X"))){
            if(turno%2==0){
                boton11.setText("O");
                label.setText("Turno de jugador 2");
                panel.setStyle("-fx-background-color: F28679;");
            }
            else{
                boton11.setText("X");
                label.setText("Turno de jugador 1");
                panel.setStyle("-fx-background-color: lightblue;");
            }
            turno++;
        }
    }
    
    @FXML
    private void click22(){
        String valor=boton22.getText();
        if(!(valor.equals("O"))&&(!valor.equals("X"))){
            if(turno%2==0){
                boton22.setText("O");
                label.setText("Turno de jugador 2");
                panel.setStyle("-fx-background-color: F28679;");
            }
            else{
                boton22.setText("X");
                label.setText("Turno de jugador 1");
                panel.setStyle("-fx-background-color: lightblue;");
            }
            turno++;
        }
    }
    
    @FXML
    private void click12(){
        String valor=boton12.getText();
        if(!(valor.equals("O"))&&(!valor.equals("X"))){
            if(turno%2==0){
                boton12.setText("O");
                label.setText("Turno de jugador 2");
                panel.setStyle("-fx-background-color: F28679;");
            }
            else{
                boton12.setText("X");
                label.setText("Turno de jugador 1");
                panel.setStyle("-fx-background-color: lightblue;");
            }
            turno++;
        }
    }
    
    @FXML
    private void click21(){
        String valor=boton21.getText();
        if(!(valor.equals("O"))&&(!valor.equals("X"))){
            if(turno%2==0){
                boton21.setText("O");
                label.setText("Turno de jugador 2");
                panel.setStyle("-fx-background-color: F28679;");
            }
            else{
                boton21.setText("X");
                label.setText("Turno de jugador 1");
                panel.setStyle("-fx-background-color: lightblue;");
            }
            turno++;
        }
    }
    
    
    
}
