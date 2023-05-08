package controller;

import java.awt.event.ActionEvent;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import test.GUI.screens.SwitchController;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nhamnguyenduc
 */
public class HomeController {
    @FXML
    private AnchorPane Home;
    
    @FXML
    void btnTrending(ActionEvent event) throws IOException{
        new SwitchController(Home,"Trending.fxml");
    }
}
