/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Joshy
 */
public class ClockViewLauncher extends Application {
    
    
    
    @Override
    public void start(Stage primaryStage) throws IOException {
            Parent root = FXMLLoader.load(getClass().getResource("Clock.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Super cool clock - that doesn't change");
            primaryStage.show();
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
