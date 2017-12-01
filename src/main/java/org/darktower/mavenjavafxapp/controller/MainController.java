package org.darktower.mavenjavafxapp.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import org.darktower.mavenjavafxapp.MainApp;
import org.darktower.mavenjavafxapp.Person;

public class MainController {

    private MainApp mainApp;
    private final String login = "frantic";
    private final String password = "system";
    @FXML private Text actiontarget;
    @FXML private TextField loginField;
    @FXML private PasswordField passwordField;

    //для связи с главным приложением
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

    @FXML protected void handleSubmitButtonAction(ActionEvent actionEvent) {
        if(login.equals(loginField.getText())){
            actiontarget.setText("Complete");
            try {
                mainApp.loadInitiativeView();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }else{
            actiontarget.setText("Wrong login");
        }
    }
}
