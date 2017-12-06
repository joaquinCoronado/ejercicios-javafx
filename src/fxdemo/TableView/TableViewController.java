package fxdemo.TableView;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class TableViewController implements Initializable {

	@FXML private TableView<Alumno> tvAlumnos;
	@FXML private TableColumn<Alumno, Integer> tcId;
	@FXML private TableColumn<Alumno, String> tcNombre;
	@FXML private TableColumn<Alumno, String> tcCiudad;
	@FXML private TableColumn<Alumno, Integer> tcEdad;
	
	public ObservableList<Alumno> list = FXCollections.observableArrayList(
			new Alumno(1, "Joaquin", "Guadalajara", 22),
			new Alumno(2, "Ricardo", "Guadalajara", 24),
			new Alumno(3, "Erick", "CDMX", 24),
			new Alumno(4, "Moy", "Tlaquepaque", 25),
			new Alumno(5, "Daniela", "Guadalajara", 21),
			new Alumno(6, "Emo", "Guadalajara", 25)
			);
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		tcId.setCellValueFactory(new PropertyValueFactory<Alumno, Integer>("id"));
		tcNombre.setCellValueFactory(new PropertyValueFactory<Alumno, String>("Nombre"));
		tcCiudad.setCellValueFactory(new PropertyValueFactory<Alumno, String>("Ciudad"));
		tcEdad.setCellValueFactory(new PropertyValueFactory<Alumno, Integer>("Edad"));
		tvAlumnos.setItems(list);
		
	}

}
