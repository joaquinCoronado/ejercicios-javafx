/**
 * 
 */
package fxdemo.clase3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * @author Joaquin Coronado
 *
 */
public class HolaMundo extends Application {

	public static void main(String[] args) {	
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//Creamos un boton y le asignamos un evento(clic).
		Button btn = new Button("Tocame");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Hola Mundo");
				
			}
		});
		
		//Creamos un panel, el StackPane organiza sus componentes como una pila.
		StackPane root = new StackPane();
		//Se agrega el boton al panel. 
		root.getChildren().add(btn);
		
		//Creamos un aescena y mandamos sus medidas y el panel como parametro al constructor. 
		Scene scene = new Scene(root, 500, 300);
		
		//Le mandamos la escena al Stage y lo hacemos visible. 
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
	}

}
