/**
 * 
 */
package fxdemo.combobox;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Joaquin Coronado
 *
 */
public class Combobox extends Application {

	public static void main(String[] args) {
		
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		//sustituimos la raíz por el archivo FXML creado desde SceneBuilder.
		Parent root = FXMLLoader.load(getClass().getResource("Combobox.fxml")); 
		Scene scene = new Scene(root);
		
		//Le mandamos la escena al Stage y lo hacemos visible. 
		primaryStage.setScene(scene);
		primaryStage.show();
	
	}

}
