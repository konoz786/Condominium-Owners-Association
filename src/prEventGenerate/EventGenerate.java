/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prEventGenerate;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class EventGenerate implements Initializable {

    @FXML
    private DatePicker eventDatePicker;
    @FXML
    private TextField eventnameTextField;
    @FXML
    private TextField addressTextField;
    @FXML
    private TextField eventInvitationTextField;
    @FXML
    private TableView<?> managementTableView;
    @FXML
    private TableColumn<?, ?> EventNameColumn;
    @FXML
    private TableColumn<?, ?> EventDateColumn;
    @FXML
    private TableColumn<?, ?> EventInvitationColoum;
    @FXML
    private TableColumn<?, ?> EventBookingAddressColoumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void saveEventDataButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void sendButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) {
    }
    
}
