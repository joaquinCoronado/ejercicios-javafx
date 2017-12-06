package fxdemo.datepicker;

import java.time.LocalDate;

import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class DatePickerController {
	@FXML private DatePicker dpfx;
	@FXML private TextField txtFechaSeleccionadaFX;
	@FXML private JFXTextField txtFechaSeleccionadaFoenix;
	@FXML private JFXDatePicker dpfoenix;
	
	public void muestraFechaFX() {
		LocalDate ld = dpfx.getValue();
		txtFechaSeleccionadaFX.setText(ld.toString());
	}
	
	public void muestraFechaFoenix() {
		LocalDate ld = dpfoenix.getValue();
		txtFechaSeleccionadaFoenix.setText(ld.toString());
	}
	
}
