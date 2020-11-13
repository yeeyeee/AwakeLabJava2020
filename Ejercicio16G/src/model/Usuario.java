package model;

import java.util.Date;

import interfaces.IAsesoria;

public class Usuario implements IAsesoria {

	private String nombre;
	private Date fechaNacimiento;
	private String rut;
	
	public Usuario() {
		
	}
	
	public Usuario(String nombre, Date fechaNacimiento, String rut) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}

	@Override
	public void analizarUsuario() {
		// TODO Auto-generated method stub
		
		System.out.println("Nombre Usuario: "+ this.nombre);
		
	}
	
	
	
}
