/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familyphones;
import java.util.Scanner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
public class FamilyPhones extends Application {

	public static void main (String [] args)
	{

	launch(args);
	}
	  @Override
	    public void start(Stage stage) throws Exception {
	        Parent root = FXMLLoader.load(getClass().getResource("inteface.fxml"));
	        Scene scene = new Scene(root);
	        stage.setScene(scene);
	        stage.setResizable(false);
	        stage.show();
	    }
	
}
