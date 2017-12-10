package fxdemo.webview;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class WebViewController implements Initializable{

	
	@FXML private WebView webView;
	private WebEngine engine;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		engine = webView.getEngine();
	}

	/**
	 * Carga un página web.
	 */
	public void btnLoad(){
		engine.load("http://www.google.com");
	}
	/**
	 * Carga un archivo JavaScript.
	 */
	public void btnJavaScript(){
		engine.executeScript("windows.location = \" http://easyonlineconverter.com//\";");
	}
	/**
	 * Carga código HTML.
	 */
	public void btnHTML(){
		engine.loadContent("<html><body><h1>Hola Mundo</h1></body></html>");
	}
	/**
	 * Recarga la pagina actiual.
	 */
	public void btnReload(){
		engine.reload();
	}
	
}
