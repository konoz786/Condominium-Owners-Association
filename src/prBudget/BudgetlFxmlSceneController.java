/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prBudget;

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
 * @author HP
 */
public class BudgetlFxmlSceneController implements Initializable {

    @FXML
    private TextField budgetidTextFeild;
    @FXML
    private TextField budgetTextFeild;
    @FXML
    private TextField payableTextFeild;
    @FXML
    private TextField approvalTextFeild;
    @FXML
    private DatePicker budgetDatePicker;
    @FXML
    private TableView<?> budgetTableView;
    @FXML
    private TableColumn<?, ?> idTableColumn;
    @FXML
    private TableColumn<?, ?> billtypeTableColumn;
    @FXML
    private TableColumn<?, ?> payableTableColumn;
    @FXML
    private TableColumn<?, ?> approvalTableColumn;
    @FXML
    private TableColumn<?, ?> dateColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void saveButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void sendrequestButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) {
    }
    
}
