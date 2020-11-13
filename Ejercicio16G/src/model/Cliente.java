package model;

import java.util.Date;

public class Cliente extends Usuario {

	private String telefono;
	private String afp;
	
	private int sistemaSalud;
	private String direccion;
	private String comuna;
	private int edad;
	
	public Cliente() {
		
	}
	public Cliente(String nombre, Date fechaNacimiento, String rut, String telefono, String afp, int sistemaSalud,
			String direccion, String comuna, int edad) {
		super(nombre, fechaNacimiento, rut);
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getAFP() {
		return this.afp;
	}
	public void setAFP(String afp) {
		this.afp = afp;
	}
	public int getSistemaSalud() {
		return sistemaSalud;
	}
	public void setSistemaSalud(int sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getComuna() {
		return comuna;
	}
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	@Override
	public void analizarUsuario() {
		// TODO Auto-generated method stub
		super.analizarUsuario();
		System.out.println("tel: " + telefono);
		System.out.println("AFP: " + afp);
		System.out.println("Sist. Salud: " + sistemaSalud);
		System.out.println("Direción: " + direccion);
		System.out.println("Comuna: " + comuna);
		System.out.println("Edad: " + edad);
		
	}
	

	
	
	
}
