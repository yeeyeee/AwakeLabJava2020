package Empresa;

import java.sql.Date;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


/**
 * 
 * @author Jeffrey
 *
 */
public class Accidente extends Cliente {
	
	
	private int idAccidente;
	private int rutCliente;
	private String fechaAccidente;
	private String horaAccidente;
	private String lugarAccidente;
	private String origenAccidente;
	private String consecuenciasAccidente;
	
	public Accidente nuevoAccidente() {
		
		Accidente objeto = new Accidente();
		
		return objeto;
	}
	
	/**
	 * 
	 * @param objeto
	 * @return
	 */
	
	public Accidente ingresarDatosAccidente (Accidente objeto) {
		
		objeto.ingresaIdAccidente("Ingrese el indentificador del"
				+ "accidente: ", objeto);

		objeto.ingresaRutCliente("Ingrese Rut Cliente: ", objeto);
		
		objeto.ingresaFechaAccidente("Ingrese fecha de "
				+ "accidente: ", objeto);
		
		objeto.ingresaHoraAccidente("Ingresa Hora del accidente "
				+ "(HH:MM): ", objeto);
		
		objeto.ingresaLugarAccidente("Ingresa el lugar del "
				+ "accidente: ", objeto);
		
		objeto.ingresaOrigenAccidente("Ingresa el origen del accidente: ",
				objeto);					
		
		objeto.ingresaConsecuenciasAccidente("Ingresa las consecuencias del"
				+ " accidente: ", objeto);
			
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
	
	public void ingresaIdAccidente(String mensaje, Accidente accidente) {
		
		int idCapa = leeNum(mensaje);
		
		accidente.setIdAccidente(idCapa);
		
		
	}
	
	public void ingresaRutCliente(String mensaje, Accidente accidente) {
		
		int rutClient = leeNum(mensaje);
		
		while (accidente.validaRut(rutClient) == false) {
			
			rutClient = leeNum("Ingrese como RUN un numero menor a "
					+ "99.999.999");
		}
		
		accidente.setRutCliente(rutClient);
	}

	public void ingresaFechaAccidente (String mensaje, Accidente accidente) {
		
		String fechaAccidente = leeDatos(mensaje);
		
		while (accidente.validarDiaAccidente(fechaAccidente) == false ) {
			
			fechaAccidente = leeDatos("Ingrese una fecha correcta: ");
		}
		
		accidente.setFechaAccidente(fechaAccidente);
		
	}
	
	public void ingresaHoraAccidente(String mensaje, Accidente accidente) {
		
		String horaAccidente = leeDatos(mensaje);
		
		while (accidente.validarHoraAccidente(horaAccidente) == false) {
			
			horaAccidente = leeDatos("Ingrese una hora correcta: ");
		}
		
		accidente.setHoraAccidente(horaAccidente);
	}
	
	public void ingresaLugarAccidente(String mensaje, Accidente accidente ) {
		
		String lugarAccidente = leeDatos(mensaje);
		
		while(accidente.validaLugar(lugarAccidente) == false) {
			
			lugarAccidente = leeDatos("Ingrese un lugar con m�nimo 10 caracteres: ");
			
		}
		
		accidente.setLugarAccidente(lugarAccidente);
	}
	
	public void ingresaOrigenAccidente(String mensaje, Accidente accidente ) {
		
		String origenAccidente = leeDatos(mensaje);
		
		while(accidente.validaOrigen(origenAccidente) == false) {
			
			origenAccidente = leeDatos("Maximo 100 caracteres");
			
		}
		
		accidente.setOrigenAccidente(origenAccidente);
	}
	
	public void ingresaConsecuenciasAccidente(String mensaje, Accidente accidente ) {
		
		String consecuenciasAccidente = leeDatos(mensaje);
		
		while(accidente.validaOrigen(consecuenciasAccidente) == false) {
			
			consecuenciasAccidente = leeDatos("Maximo 100 caracteres");
			
		}
		
		accidente.setConsecuenciasAccidente(consecuenciasAccidente);
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
	
	public Accidente() {
		
	}
	
	public Accidente(int idAccidente, int rutCliente, String fechaAccidente, String horaAccidente, String lugarAccidente,
			String origenAccidente, String consecuenciasAccidente) {
		super();
		this.idAccidente = idAccidente;
		this.rutCliente = rutCliente;
		this.fechaAccidente = fechaAccidente;
		this.horaAccidente = horaAccidente;
		this.lugarAccidente = lugarAccidente;
		this.origenAccidente = origenAccidente;
		this.consecuenciasAccidente = consecuenciasAccidente;
	}

	public int getIdAccidente() {
		return idAccidente;
	}
	public void setIdAccidente(int idAccidente) {
		this.idAccidente = idAccidente;
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
	public String getOrigenAccidente() {
		return origenAccidente;
	}
	public void setOrigenAccidente(String origenAccidente) {
		this.origenAccidente = origenAccidente;
	}
	public String getConsecuenciasAccidente() {
		return consecuenciasAccidente;
	}
	public void setConsecuenciasAccidente(String consecuenciasAccidente) {
		this.consecuenciasAccidente = consecuenciasAccidente;
	}
	
	@Override
	public String toString() {
		return "Accidente [idAccidente=" + idAccidente + ", rutCliente=" + rutCliente + ", fechaAccidente="
				+ fechaAccidente + ", horaAccidente=" + horaAccidente + ", lugarAccidente=" + lugarAccidente
				+ ", origenAccidente=" + origenAccidente + ", consecuenciasAccidente=" + consecuenciasAccidente + "]";
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

	public boolean validaOrigen(String origenAccidente)
	{
		if (origenAccidente.length() <= 100)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean validaConsecuencias(String consecuenciasAccidente)
	{
		if (consecuenciasAccidente.length() <= 100)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
