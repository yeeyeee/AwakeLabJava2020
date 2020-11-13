package model;

import java.util.Date;

public class Profesional extends Usuario {
	private String titulo;
	private Date fechaIngreso;
	
	
	public Profesional() {
		super();
	}
	public Profesional(String nombre, Date fechaNacimiento, String rut, 
			String titulo, Date fechaIngreso) {
		super(nombre, fechaNacimiento, rut);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public void analizarUsuario() {
		// TODO Auto-generated method stub
		super.analizarUsuario();
		System.out.println("titulo: " + this.titulo);
		System.out.println("fecha ingreso: " + this.getFechaIngreso());		
	}
		
}
