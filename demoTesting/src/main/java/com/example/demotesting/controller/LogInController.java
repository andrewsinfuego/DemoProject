package com.example.demotesting.controller;
import com.example.demotesting.model.Login;
import com.example.demotesting.logic.login;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;

import java.sql.SQLException;

public class LogInController {
    @FXML
    private Text actionTarget;

    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;

    @FXML
    public void onLoginButtonClick(ActionEvent actionEvent) throws SQLException {
        //Use constructor in login model
        Login userData = new Login(usernameField.getText(),passwordField.getText());
        login loginLogic = new login();
        if(loginLogic.loginQuery(userData)) {
            actionTarget.setText("Password is correct");
        } else {
            actionTarget.setText("Password is incorrect");
        }

    }
}