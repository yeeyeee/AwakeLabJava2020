package Empresa;

import java.text.SimpleDateFormat;

import java.util.Scanner;
import java.text.ParseException;

/**
 * 
 * @author Jeffrey
 *
 */

public class Capacitacion {
	
	private int idCapacitacion;
	private int rutCliente;
	private String diaCapacitacion;
	private String horaCapacitacion;
	private String lugarCapacitacion;
	private String duracionCapacitacion;
	private int cantidadAsistentes;
	
	public Capacitacion() {
		
	}
	
	/**
	 * 
	 * @param idCapacitacion 
	 * @param rutCliente
	 * @param diaCapacitacion
	 * @param horaCapacitacion
	 * @param lugarCapacitacion
	 * @param duracionCapacitacion
	 * @param cantidadAsistentes
	 */

	public Capacitacion(int idCapacitacion, int rutCliente, String diaCapacitacion, String horaCapacitacion,
			String lugarCapacitacion, String duracionCapacitacion, int cantidadAsistentes) {
		super();
		this.idCapacitacion = idCapacitacion;
		this.rutCliente = rutCliente;
		this.diaCapacitacion = diaCapacitacion;
		this.horaCapacitacion = horaCapacitacion;
		this.lugarCapacitacion = lugarCapacitacion;
		this.duracionCapacitacion = duracionCapacitacion;
		this.cantidadAsistentes = cantidadAsistentes;
	}

	public int getIdCapacitacion() {
		return idCapacitacion;
	}

	public void setIdCapacitacion(int idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}

	public int getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getdiaCapacitacion() {
		return diaCapacitacion;
	}

	public void setdiaCapacitacion(String diaCapacitacion) {
		this.diaCapacitacion = diaCapacitacion;
	}

	public String getHoraCapacitacion() {
		return horaCapacitacion;
	}

	public void setHoraCapacitacion(String horaCapacitacion) {
		this.horaCapacitacion = horaCapacitacion;
	}

	public String getLugarCapacitacion() {
		return lugarCapacitacion;
	}

	public void setLugarCapacitacion(String lugarCapacitacion) {
		this.lugarCapacitacion = lugarCapacitacion;
	}
	
	public String getDuracionCapacitacion() {
		return duracionCapacitacion;
	}

	public void setDuracionCapacitacion(String duracionCapacitacion) {
		this.duracionCapacitacion = duracionCapacitacion;
	}	

	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}

	public void setCantidadAsistentes(int cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}

	@Override
	public String toString() {
		return "Capacitacion [idCapacitacion=" + idCapacitacion + ", rutCliente=" + rutCliente + ", diaCapacitacion="
				+ diaCapacitacion + ", horaCapacitacion=" + horaCapacitacion + ", lugarCapacitacion="
				+ lugarCapacitacion + ", cantidadAsistentes=" + cantidadAsistentes + "]";
	}
	
	
	
	private static final String [] N_DIAS = {"",
            "Domingo",
            "Lunes",
            "Martes",
            "Miercoles",
            "Jueves",
            "Viernes",
            "Sabado"
             };
	
		
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
	

	
	public boolean validaDiaSemana(String diaCapa) {
		
		int cont = 0;
		
		for(String d: N_DIAS) {
			
			if (d.equalsIgnoreCase(diaCapa) == false) {
				cont++;				
			}
		}
		
		if (cont > 7 ) {
			System.out.println("Dia Invalido ingrese: \nLunes \nMartes"
					+ "\nMiercoles \nJueves \nO Viernes");
			return false;
			
		}else {
			
			
			return true;
			
		}
	}

	
	
	public boolean validaLugar(String lugarCapacitacion)
	{
		if (lugarCapacitacion.length() >= 10 && lugarCapacitacion.length() <= 50)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean validaDuracion(String duracionCapacitacion)
	{
		if (duracionCapacitacion.length() <= 70)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean validaCantidadAsistentes(int cantidadAsistentes)
	{
		if (cantidadAsistentes < 1000) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public boolean validaRut(int rutCliente) {
		
		if (rutCliente <= 99999999) {
			return true;
		} 
		else{
			return false;
		}
	}
	
	
	
	public boolean validarHoraCapa(String horaCapa) {
		
	       SimpleDateFormat df = new SimpleDateFormat("HH:MM");
	       
	       try {
	    	   
	           df.parse(horaCapa);
	           
	           return true;
	           
	       } catch (ParseException e) {
	    	   
	           return false;
	       }
	}

	public void mostrarDetalle() { 
				
		System.out.print( "Capacitacion sera en " + this.lugarCapacitacion + " a las " 
		+ this.horaCapacitacion + " \nDel dia " + this.diaCapacitacion + ", y"
		+ " tendra duracion de " + this.duracionCapacitacion + " minutos.\n");
	}
	

	public void ingresaIdCapa(String mensaje, Capacitacion capa) {
		
		int idCapa = leeNum(mensaje);
		
		capa.setIdCapacitacion(idCapa);
		
		
	}
			
	public void ingresaRutCliente(String mensaje, Capacitacion capa) {
		
		int rutClient = leeNum(mensaje);
		
		while (capa.validaRut(rutClient) == false) {
			
			rutClient = leeNum("Ingrese como RUN un numero menor a "
					+ "99.999.999");
		}
		
		capa.setRutCliente(rutClient);
	}
	
	public void ingresaDiaCapa (String mensaje, Capacitacion capa) {
		
		String diaCapa = leeDatos(mensaje);
		
		while (capa.validaDiaSemana(diaCapa) == false ) {
			
			diaCapa = leeDatos("Ingrese un dia de semana correcto: ");
		}
		
		capa.setdiaCapacitacion(diaCapa);
		
	}
	
	public void ingresaHoraCapa(String mensaje, Capacitacion capa) {
		
		String horaCapa = leeDatos(mensaje);
		
		while (capa.validarHoraCapa(horaCapa) == false) {
			
			horaCapa = leeDatos("Ingrese una hora correcta: ");
		}
		
		capa.setHoraCapacitacion(horaCapa);
	}
	
	public void ingresaLugarCapa(String mensaje, Capacitacion capa ) {
		
		String lugarCapa = leeDatos(mensaje);
		
		while(capa.validaLugar(lugarCapa) == false) {
			
			lugarCapa = leeDatos("Ingrese un lugar con m�nimo 10 caracteres: ");
			
		}
		
		capa.setLugarCapacitacion(lugarCapa);
	}
	
	public void ingresaDuracionCapa(String mensaje, Capacitacion capa) {
		
		String duracionCapa = leeDatos(mensaje);
		
		while(capa.validaDuracion(duracionCapa) == false) {
			
			duracionCapa = leeDatos("Ingrese duracion de capacitacion, m�ximo "
					+ "70 caracteres: ");
			
		}
		
		capa.setDuracionCapacitacion(duracionCapa);
		
	}
	
	public void ingresaAsistentes(String mensaje, Capacitacion capa) {
		
		int cantAsist = leeNum(mensaje);
		
		while(capa.validaCantidadAsistentes(cantAsist) == false) {
			
			cantAsist = leeNum("Ingrese cantidad de asistentes numero entero "
					+ "menor a 1000: ");
			
		}
		
		capa.setCantidadAsistentes(cantAsist);
	}
	
	public Capacitacion nuevaCapacitacion() {
		
		Capacitacion objeto = new Capacitacion(); 
		
		return objeto;
	}
	
	public Capacitacion ingresarDatosCapacitacion (Capacitacion objeto) {
		
		objeto.ingresaIdCapa("Ingrese Id capacitacion; ", objeto);

		objeto.ingresaRutCliente("Ingrese Rut Cliente de Capacitacion: ", objeto);
		
		objeto.ingresaDiaCapa("Ingrese Dia de semana de Capacitacion: ", objeto);
		
		objeto.ingresaHoraCapa("Ingresa Hora de inicio capacitacion "
				+ "(HH:MM): ", objeto);
		
		objeto.ingresaDuracionCapa("Ingresa Duracion de capacitacion "
				+ "(minutos): ", objeto);
		
		objeto.ingresaLugarCapa("Ingresa lugar de la capacitacion: ",
				objeto);					
		
		objeto.ingresaAsistentes("Ingresa cantidad de asistentes de la "
				+ "capacitacion:", objeto);
			
		return objeto;
		
	}
	
	
	
	
	
	
}