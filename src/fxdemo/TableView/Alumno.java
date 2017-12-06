/**
 * 
 */
package fxdemo.TableView;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * @author Joaquin Coronado.
 *
 */
public class Alumno {
	
	private SimpleIntegerProperty id;
	private SimpleStringProperty nombre;
	private SimpleStringProperty ciudad;
	private SimpleIntegerProperty edad;
	
	public Alumno(Integer id, String nombre, String ciudad, Integer edad) {
		this.id = new SimpleIntegerProperty(id) ;
		this.nombre = new SimpleStringProperty(nombre);
		this.ciudad = new SimpleStringProperty(ciudad);
		this.edad = new SimpleIntegerProperty(edad);
	}

	public Integer getId() {
		return id.get();
	}

	public void setId(Integer id) {
		this.id = new SimpleIntegerProperty(id) ;
	}

	public String getNombre() {
		return nombre.get();
	}

	public void setNombre(String nombre) {
		this.nombre = new SimpleStringProperty(nombre);
	}

	public String getCiudad() {
		return ciudad.get();
	}

	public void setCiudad(String ciudad) {
		this.ciudad = new SimpleStringProperty(ciudad);
	}

	public Integer getEdad() {
		return edad.get();
	}

	public void setEdad(Integer edad) {
		this.edad = new SimpleIntegerProperty(edad);
	}
	
}
