package Empresa;


import java.text.Format;
import java.text.SimpleDateFormat;

public class Profesional extends Usuario {
	
	private String titulo;
	private String fechaIngreso;
	
	
	public Profesional() {

	}	
	
	public Profesional(String titulo, String fechaIngreso) {
		super();
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}

	public Profesional(String nombre, String fechaNacimiento, int run) {
		super(nombre, fechaNacimiento, run);
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.run = run;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}	

	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + "]";
	}

	@Override
	public void analizarUsuario() {
		super.analizarUsuario();		
		// Profesional
		System.out.println("titulo: " + this.titulo);
		System.out.println("fecha ingreso: " + this.getFechaIngreso());		
	}

	public boolean validarTitulo(String titulo)
	{
		if (titulo.length() >= 10 && titulo.length() <= 50)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String retornarFecha(String fechaIngreso)
	{
		Format formatter = new SimpleDateFormat("dd/MM/yyyy");
		String fecha_ingreso = formatter.format(fechaIngreso);
		
		return fecha_ingreso;
	}
	
	public void listarUsuario() {
		
		System.out.println("\nNombre Usuario: " + this.nombre);
		System.out.println("Fecha nacimiento: " + this.fechaNacimiento);
		System.out.println("RUN Usuario: " + this.run + "\n");
		
	}
	
	public Profesional nuevoProfesional() {
		
		Profesional objeto = new Profesional(); 
		
		return objeto;
	}
	
}
