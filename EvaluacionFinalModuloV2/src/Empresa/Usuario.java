package Empresa;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.text.ParseException;

public class Usuario implements Asesoria {

	protected String nombre;
	protected String fechaNacimiento;
	protected int run;
	
	public Usuario() {
		
	}
	
	public Usuario(String nombre, String fechaNacimiento, int run) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.run = run;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	/**
	 * 
	 * @return
	 */
	public int getRun() {
		return run;
	}
	
	public void setRun(int run) {
		this.run = run;
	}

	public void analizarUsuario() {
		// TODO Auto-generated method stub
		
		System.out.println("Nombre Usuario: " + this.nombre);
		System.out.println("RUN usuario: " + this.run );
		
	}
	
	
	public void listarUsuario() {
		
		System.out.println("\nNombre Usuario: " + this.nombre);
		System.out.println("Fecha nacimiento: " + this.fechaNacimiento);
		System.out.println("RUN Usuario: " + this.run + "\n");
		
	}
	
	public boolean validaNombre(String nombre) 	{
		if (nombre.length() >= 10 && nombre.length() <= 50)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean validaFechaNac(String fechaNac) {
		
	       SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyy");
	       
	       try {
	    	   
	           df.parse(fechaNac);
	           
	           return true;
	           
	       } catch (ParseException e) {
	    	   
	           return false;
	       }
	}
	
	public boolean validaRun(int run) {
		
		if (run <= 999999999 ) {
			
			return true;
		}
		else {
			return false;
		}
	}
	
	public String retornarFecha(String fechaNacimiento)
	{
		Format formatter = new SimpleDateFormat("dd/MM/yyyy");
		String fecha_nacimiento = formatter.format(fechaNacimiento);
		
		return fecha_nacimiento;
	}
	
	
	public String mostrarEdad() {
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNac1 = LocalDate.parse(this.fechaNacimiento, fmt);
		LocalDate ahora = LocalDate.now();
		
		Period periodo = Period.between(fechaNac1, ahora);
		
		int edad = periodo.getYears(); 
				
		return "El usuario tiene " + edad + " a�os";
	}

	
	@Override
	public void ingresaNombreUsuario(String mensaje, Usuario objeto) {
		
		String nombreUsuario = leeDatos(mensaje);	
			
		while (objeto.validaNombre(nombreUsuario) != true) {
					
			nombreUsuario = leeDatos("Invalido. Ingrese minimo 10 caracteres, maximo 50");
		
		}
		
		escribir("\nNombre valido");
		
		objeto.setNombre(nombreUsuario);
	}
	
	@Override
	public void ingresaFechaNacUsuario(String mensaje, Usuario object) {
		
		String fecha = leeDatos(mensaje);
		
		while (object.validaFechaNac(fecha) != true) {
			
			fecha = leeDatos("Fecha invalida. Ingresar formato dd/MM/yyyy");
			
		}
		
		object.setFechaNacimiento(fecha);
		
	}
	
	@Override
	public void ingresaRunUsuario(String mensaje, Usuario objeto) {
		
		int run = leeNum(mensaje);
		
		while (objeto.validaRun(run) != true) {
						
			run = leeNum("Ingrese como RUN un numero menor a "
					+ "99.999.999");
			
		}
		
		escribir("Run Valido");
		
		objeto.setRun(run);
	}
	

	
	public String leeDatos(String mensaje) {
		escribir(mensaje);
		Scanner e = new Scanner(System.in);
		return e.nextLine();
	}
	

	
	public int leeNum(String mensaje) {
		escribir(mensaje);
		Scanner e = new Scanner(System.in);
		return e.nextInt();
	}

	
	public void escribir(String mensaje) {
		System.out.println(mensaje);
	}
	

	
	

}
