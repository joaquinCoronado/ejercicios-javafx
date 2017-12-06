package fxdemo.filechooser;

import java.io.File;
import java.util.List;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;

import javafx.fxml.FXML;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class FileChooserController {
	
	@FXML
	private JFXButton btnUnArchivo;
	@FXML
	private JFXButton btnMultiplesArchivos;
	@FXML
	private JFXButton btnSelectDirectory;
	@FXML
	private JFXListView<String> lvArchivos;
	 
	
	@SuppressWarnings("unused")
	private File defaultDirectory = null;
	
	public void btnDyrectory() {
		DirectoryChooser chooser = new DirectoryChooser();
		chooser.setTitle("JavaFX Projects");
		//File defaultDirectory = new File("c:/dev/javafx");
		//chooser.setInitialDirectory(defaultDirectory);
		defaultDirectory = chooser.showDialog(FiloChooserPrincipal.primaryStage);
	}
	
	public void btnUnArchivoAction() {
		FileChooser fc = new FileChooser();
		//fc.setInitialDirectory(new File("C:\\Users\\ardi_\\Desktop"));
		fc.setInitialDirectory(defaultDirectory);
		
		fc.getExtensionFilters().addAll(
					new ExtensionFilter("PDF Files", "*.pdf")
				);
		File selectedFile = fc.showOpenDialog(FiloChooserPrincipal.primaryStage);
		
		if(selectedFile != null) {
			lvArchivos.getItems().add(selectedFile.getAbsolutePath());
		}else {
			
		}
		
		
	}
	public void btnMultiplesArchivosAction() {
		FileChooser fc = new FileChooser();
		//fc.setInitialDirectory(new File("C:\\Users\\ardi_\\Desktop"));
		fc.getExtensionFilters().addAll(
					new ExtensionFilter("PDF Files", "*.pdf")
				);
		fc.setInitialDirectory(defaultDirectory);
		List<File> selectedFiles = fc.showOpenMultipleDialog(FiloChooserPrincipal.primaryStage);
		
		if(selectedFiles != null) {
			
			for (File file : selectedFiles) {
				lvArchivos.getItems().add(file.getPath());
			}
				
		}else {
			
		}
	}
	
}
