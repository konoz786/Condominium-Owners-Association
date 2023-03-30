/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prConsulting;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class ConsultingController implements Initializable {

    @FXML
    private TextArea queryTextArea;
    @FXML
    private DatePicker meetingDateDatePicker;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField typeTextField;
    @FXML
    private TextField timeTextField;
    @FXML
    private TableView<?> consultingTableView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void LoadBudgetButton(MouseEvent event) {
    }

    @FXML
    private void loadQueryButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void YesButton(MouseEvent event) {
    }

    @FXML
    private void yesButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void NoButton(MouseEvent event) {
    }

    @FXML
    private void noButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void BackButton(MouseEvent event) {
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void saveButtonOnClick(ActionEvent event) {
    }
    
}
