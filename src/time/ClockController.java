/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Joshy
 */
public class ClockController implements Initializable {

    @FXML private TextField hoursTextField;
    @FXML private TextField minutesTextField;
    @FXML private TextField secondsTextField;

    @FXML private Button updateTimeButton;
    @FXML private Label militaryTimeLabel;
    @FXML private Label standardTimeLabel;
    @FXML private Label errorMessageLabel;
   
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        //set a default time
        this.hoursTextField.setText("15");
        this.minutesTextField.setText("0");
        this.secondsTextField.setText("0");
        this.errorMessageLabel.setVisible(false); //error message is invisible, unless error
        
        updateTimeLabels();
    }    
    
    public void updateTimeLabels(){
        
        try
        {
            //create a new instance of the time class, based on provided input
            Time time = new Time(Integer.parseInt(hoursTextField.getText()),Integer.parseInt(minutesTextField.getText()),Integer.parseInt(secondsTextField.getText()));
            this.militaryTimeLabel.setText(time.toMilitaryTime());
            this.standardTimeLabel.setText(time.toStandardTime());
            
            //display labels if they have been hidden
            this.militaryTimeLabel.setVisible(true);
            this.standardTimeLabel.setVisible(true);
            this.errorMessageLabel.setVisible(false);

        }
        
        catch (IllegalArgumentException e)
        {
            this.militaryTimeLabel.setVisible(false);
            this.standardTimeLabel.setVisible(false);
            this.errorMessageLabel.setVisible(true);
            this.errorMessageLabel.setText(e.getMessage());
        }
    }
}
