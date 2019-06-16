/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familyphones;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class interfaceController implements Initializable{
 private ToggleGroup tg1;
    private ToggleGroup tg2;
    private ToggleGroup tg3;
    @FXML
    private RadioButton r1;

    @FXML
    private RadioButton r4;

    @FXML
    private RadioButton r7;

    @FXML
    private RadioButton r2;

    @FXML
    private RadioButton r5;

    @FXML
    private RadioButton r8;

    @FXML
    private RadioButton r3;

    @FXML
    private RadioButton r6;

    @FXML
    private RadioButton r9;

    @FXML
    private TextField t1;

    @FXML
    private Button b1;
     @FXML
    void start(ActionEvent event) throws IOException {
        
        if (r1.isSelected())
            t1.setText("050-377-8195");
        else if (r2.isSelected())
            t1.setText("052-264-3444");

        else if (r3.isSelected())
            t1.setText("052-377-9066");

        else if (r4.isSelected())   
            t1.setText("052-415-7550");

        else if (r5.isSelected())
            t1.setText("052-750-7025");

        else if (r6.isSelected())
            t1.setText("054-900-4269");

        else if (r7.isSelected())
            t1.setText("058-445-4436");

        else if (r8.isSelected())
            t1.setText("052-800-1022");

        else if (r9.isSelected())
            t1.setText("052-298-8056");

    }
    @Override
	public void initialize(URL location, ResourceBundle resources) {
		tg1=new ToggleGroup();
		tg2=new ToggleGroup();
		tg3=new ToggleGroup();

		this.r1.setToggleGroup(tg1);
		this.r2.setToggleGroup(tg1);	
                this.r3.setToggleGroup(tg1);
		this.r4.setToggleGroup(tg1);	

                this.r5.setToggleGroup(tg1);
		this.r6.setToggleGroup(tg1);	
                this.r7.setToggleGroup(tg1);
		this.r8.setToggleGroup(tg1);	
                this.r9.setToggleGroup(tg1);
			


	}
    
    }


