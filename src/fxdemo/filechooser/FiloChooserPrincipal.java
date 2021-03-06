package fxdemo.filechooser;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FiloChooserPrincipal extends Application {

	public static Stage primaryStage;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	@SuppressWarnings("static-access")
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("FileChooser.fxml"));
		Scene scene = new Scene(root);
		this.primaryStage = primaryStage;
		this.primaryStage.setScene(scene);
		this.primaryStage.show();
	
	}
	
	
	

}
