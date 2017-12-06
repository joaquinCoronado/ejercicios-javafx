package fxdemo.combobox;


import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class ComboboxController implements Initializable{

	public ArrayList<String> nombres = new ArrayList<String>();


	@FXML
	public ComboBox<String> CMBXNombres;
	@FXML
	public Button btnClear;
	@FXML
	public TextArea txtNombre;
	@FXML
	public TextField txtItem;

	ObservableList<String> listaNombres = FXCollections.observableArrayList("Joaquin", "Ricardo", "Jesi", "Gera");


	public void limpiarCBX() {
		CMBXNombres.getItems().clear();
	}

	public void CBXChange() {
		txtNombre.setText(CMBXNombres.getValue());
	}

	public void agregarItem() {

		System.out.println(txtItem.getText());
		
		if(txtItem.getText().isEmpty() ||  txtItem.getText().contains(" ")){		
			Alert alerta = new Alert(AlertType.ERROR);
			alerta.setTitle("Error");
			alerta.setHeaderText(null);
			alerta.setContentText("El item no puede estar vacio ni tener espacios");
			alerta.show();
			txtItem.clear();
		}else {
			CMBXNombres.getItems().add(txtItem.getText().trim());
			txtItem.clear();
		}

	}


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		nombres.add("Daniela");
		nombres.add("Maria");

		FXCollections.copy(listaNombres, nombres);
		CMBXNombres.setItems(listaNombres);

	}

}
