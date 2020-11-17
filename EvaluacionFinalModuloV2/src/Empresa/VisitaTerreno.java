package Empresa;

import java.sql.Date;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class VisitaTerreno extends Cliente {

	private int idVisita;
	private int rutCliente;
	private String fechaAccidente;
	private String horaAccidente;
	private String lugarAccidente;
	private String comentarios;
	
	private static final String [] N_DIAS = {"",
            "Domingo",
            "Lunes",
            "Martes",
            "Miercoles",
            "Jueves",
            "Viernes",
            "Sabado"
             };
	
	public VisitaTerreno() {
		
	}
	
	public VisitaTerreno nuevaVisitaTerreno() {
		
		VisitaTerreno objeto = new VisitaTerreno();
		
		return objeto;
	}
	
	public VisitaTerreno ingresarDatosVisitaTerreno (VisitaTerreno objeto) {
		
		objeto.ingresaIdVisita("Ingrese el indentificador de la"
				+ "Visita a terreno: ", objeto);

		objeto.ingresaRutCliente("Ingrese Rut Cliente: ", objeto);
		
		objeto.ingresaFechaAccidente("Ingrese fecha de "
				+ "accidente: ", objeto);
		
		objeto.ingresaHoraAccidente("Ingresa Hora del accidente "
				+ "(HH:MM): ", objeto);
		
		objeto.ingresaLugarAccidente("Ingresa el lugar del "
				+ "accidente: ", objeto);
		
		objeto.ingresaComentarios("Ingresa comentarios del accidente: ",
				objeto);					
		
			
		return objeto;
		
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
	
	public void ingresaIdVisita(String mensaje, VisitaTerreno visita) {
		
		int idVisita = leeNum(mensaje);
		
		visita.setIdVisita(idVisita);
		
		
	}
	
	public void ingresaRutCliente(String mensaje, VisitaTerreno visita) {
		
		int rutClient = leeNum(mensaje);
		
		while (visita.validaRut(rutClient) == false) {
			
			rutClient = leeNum("Ingrese como RUN un numero menor a "
					+ "99.999.999");
		}
		
		visita.setRutCliente(rutClient);
	}

	public void ingresaFechaAccidente (String mensaje, VisitaTerreno visita) {
		
		String fechaAccidente = leeDatos(mensaje);
		
		while (visita.validarDiaAccidente(fechaAccidente) == false ) {
			
			fechaAccidente = leeDatos("Ingrese una fecha correcta: ");
		}
		
		visita.setFechaAccidente(fechaAccidente);
		
	}
	
	public void ingresaHoraAccidente(String mensaje, VisitaTerreno visita) {
		
		String horaAccidente = leeDatos(mensaje);
		
		while (visita.validarHoraAccidente(horaAccidente) == false) {
			
			horaAccidente = leeDatos("Ingrese una hora correcta: ");
		}
		
		visita.setHoraAccidente(horaAccidente);
	}
	
	public void ingresaLugarAccidente(String mensaje, VisitaTerreno visita) {
		
		String lugarAccidente = leeDatos(mensaje);
		
		while(visita.validaLugar(lugarAccidente) == false) {
			
			lugarAccidente = leeDatos("Ingrese un lugar con m�nimo 10 caracteres: ");
			
		}
		
		visita.setLugarAccidente(lugarAccidente);
	}
	
	public void ingresaComentarios(String mensaje, VisitaTerreno visita) {
		
		String comentarios = leeDatos(mensaje);
		
		while(visita.validaComentario(comentarios) == false) {
			
			comentarios = leeDatos("Maximo 100 caracteres");
			
		}
		
		visita.setComentarios(comentarios);
	}
	
	
	
	
	public boolean validarHoraAccidente(String horaAccidente) {
		
	       SimpleDateFormat df = new SimpleDateFormat("HH:MM");
	       
	       try {
	    	   
	           df.parse(horaAccidente);
	           
	           return true;
	           
	       } catch (ParseException e) {
	    	   
	           return false;
	       }
	}
	
	public boolean validarDiaAccidente(String diaAccidente) {
		
	       SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyy");
	       
	       try {
	    	   
	           df.parse(diaAccidente);
	           
	           return true;
	           
	       } catch (ParseException e) {
	    	   
	           return false;
	       }
	}
	
	public void escribir(String mensaje) {
		System.out.println(mensaje);
	}

	public VisitaTerreno(int idVisita, int rutCliente, String fechaAccidente,
			String horaAccidente, String lugarAccidente, String comentarios) {
		super();
		this.idVisita = idVisita;
		this.rutCliente = rutCliente;
		this.fechaAccidente = fechaAccidente;
		this.horaAccidente = horaAccidente;
		this.lugarAccidente = lugarAccidente;
		this.comentarios = comentarios;
	}

	public int getIdVisita() {
		return idVisita;
	}

	public void setIdVisita(int idVisita) {
		this.idVisita = idVisita;
	}

	public int getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getFechaAccidente() {
		return fechaAccidente;
	}

	public void setFechaAccidente(String fechaAccidente) {
		this.fechaAccidente = fechaAccidente;
	}

	public String getHoraAccidente() {
		return horaAccidente;
	}

	public void setHoraAccidente(String horaAccidente) {
		this.horaAccidente = horaAccidente;
	}

	public String getLugarAccidente() {
		return lugarAccidente;
	}

	public void setLugarAccidente(String lugarAccidente) {
		this.lugarAccidente = lugarAccidente;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	@Override
	public String toString() {
		return "VisitaTerreno [idVisita=" + idVisita + ", ruClientet=" + rutCliente + ", fechaAccidente=" + fechaAccidente
				+ ", horaAccidente=" + horaAccidente + ", lugarAccidente=" + lugarAccidente + ", comentarios="
				+ comentarios + "]";
	}
	
	public String retornarFecha(Date fechaAccidente)
	{
		Format formatter = new SimpleDateFormat("dd/MM/yyyy");
		String fecha_accidente = formatter.format(fechaAccidente);
		
		return fecha_accidente;
	}
	
	public String retornarHora(Date horaAccidente)
	{
		Format formatter = new SimpleDateFormat("HH:mm");
		String hora_accidente = formatter.format(horaAccidente);
		
		return hora_accidente;
	}
	
	public boolean validaLugar(String lugarAccidente)
	{
		if (lugarAccidente.length() >= 10 && lugarAccidente.length() <= 50)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean validaComentario(String comentarios)
	{
		if (comentarios.length() <= 100)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
}
