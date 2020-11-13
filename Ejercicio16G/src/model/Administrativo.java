package model;

import java.util.Date;

public class Administrativo extends Usuario {

	private String area;
	private String experienciaPrevia;
	
	public Administrativo() {
		super();
	}
	
	
	public Administrativo(String nombre, Date fechaNacimiento, String rut, String area, String experienciaPrevia) {
		super(nombre, fechaNacimiento, rut);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}
	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}
	
	
	
	
}
