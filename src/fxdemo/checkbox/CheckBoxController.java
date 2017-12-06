package fxdemo.checkbox;

import com.jfoenix.controls.JFXCheckBox;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CheckBoxController {

	@FXML
	private JFXCheckBox ckbJava;
	@FXML
	private JFXCheckBox ckbNet;
	@FXML
	private JFXCheckBox ckbPython;
	@FXML
	private JFXCheckBox ckbNode;
	@FXML
	private Label lblSeleccionado;
	@FXML
	private Label lblCount;
	
	public void checkEvent() {
		int count = 0;
		String message = "";
		
		if(ckbJava.isSelected()) {
			count++;
			message += ckbJava.getText()+ "\n";		
		}
		if(ckbNet.isSelected()) {
			count++;
			message += ckbNet.getText()+ "\n";			
		}
		if(ckbPython.isSelected()) {
			count++;
			message += ckbPython.getText()+ "\n";		
		}
		if(ckbNode.isSelected()) {
			count++;
			message += ckbNode.getText()+ "\n";			
		}
		lblCount.setText("Items Selected: " + count);
		lblSeleccionado.setText(message);
	}
	
	
}
