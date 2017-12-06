/**
 * 
 */
package fxdemo.clase4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author Joaquin Coronado
 *
 */
public class Lambda extends Application {

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
		
		//Creamos un boton y le asignamos su evento con expresiones lambda.
		Button btnSalir = new Button("Salir");
		btnSalir.setOnAction(e ->{
			System.out.println("Saliendo de la aplicación");
			System.exit(0);
		});
		
		//Creamos un panel, el StackPane organiza sus componentes como una pila.
		VBox root = new VBox();
		//Se agrega el boton al panel. 
		root.getChildren().addAll(btn, btnSalir);
		
		//Creamos un aescena y mandamos sus medidas y el panel como parametro al constructor. 
		Scene scene = new Scene(root, 500, 300);
		
		//Le mandamos la escena al Stage y lo hacemos visible.
		primaryStage.setTitle("Hola Mundo");
		primaryStage.setScene(scene);
		primaryStage.show();
				
	}

}
