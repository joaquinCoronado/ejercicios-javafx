package fxdemo.radiobutton;

import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;

import javafx.fxml.FXML;

public class RadioButtonController {

	@FXML
	private JFXRadioButton rbHombre;
	@FXML
	private JFXRadioButton rbMujer;
	@FXML
	private JFXTextField txtSeleccion;
	
	public void radioSelect() {
		String message = "";
		if(rbHombre.isSelected()) {
			message += rbHombre.getText();
		}
		if(rbMujer.isSelected()) {
			message += rbMujer.getText();
		}
		txtSeleccion.setText(message);
	}
	

}
