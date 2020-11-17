package Empresa;

import java.util.Scanner;

/**
 * Esta clase define los objetos que contienen los datos asociados a
 * la revision sobre el accidente del trabajador para luego ser 
 * almacenados en la clase Revision
 *  
 * @author Ruben, Jeffrey, Fran, Javiera, Jeison
 * @version 2,0 16/11/2020
 * 
 * @param idRevision El parametro idRevision define el numero 
 * interno que maneja la empresa sobre la revision
 * @param idVisita El parametro idVisita define el numero 
 * interno para identificar la visita a terreno
 * @param nombreRevision El parametro nombreRevision define
 * el nombre asociado a la revision
 * @param detalleRevision El parametro detalleRevision define el
 * detalle para revisar.
 * @param estado El parametro estado define el estado de la 
 * revision.
 * 
 */

public class Revision extends VisitaTerreno {
	
	private int idRevision;
	private int idVisita;
	private String nombreRevision;
	private String detalleRevision;
	private int estado;
	
	/**
	 * Este metodo instancia un nuevo objeto de la clase Revision.
	 * @return nuevo objeto de la clase Revision
	 */
	
	public Revision nuevaRevision() {
		
		Revision objeto = new Revision();
		
		return objeto;
	}
	
	/**
	 * Se solicita la identificacion de la revision a traves de un 
	 * numero interno manejado por la empresa, a demas el numero
	 * identificador de la visita en terreno a la que se asocia la
	 * revision, nombre de la revision, detalle, y estado de esta.
	 * 
	 * @param objeto
	 * @return nuevo objeto mdificado 
	 * 
	 */
	
	public Revision ingresarDatosRevision (Revision objeto) {
		
		objeto.ingresaIdRevision("Ingrese el indentificador de la"
				+ " revision a la Visita a terreno: ", objeto);
		
		objeto.ingresaIdVisita("Ingrese el indentificador de la"
				+ " Visita a terreno: ", objeto);

		objeto.ingresaNombreRevision("Ingrese un nombre alusivo a la"
				+ " revision: (min. 10 caracteres, max 50) ", objeto);
		
		objeto.ingresaDetalleRevision("Ingrese detalles para revisar: (max. "
				+ "100 caracteres)", objeto);
		
		objeto.ingresaEstadoRevision("Ingresa el estado de la revision: \n1.- Sin "
				+ "problemas\n2.- Con observaciones \n3.- No aprueba", objeto);
		
				
			
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
	
	public void escribir(String mensaje) {
		System.out.println(mensaje);
	}
	
	public void ingresaIdRevision(String mensaje, Revision revision) {
		
		int idRevision= leeNum(mensaje);
		
		revision.setIdRevision(idRevision);
				
	}
	
	public void ingresaNombreRevision(String mensaje, Revision revision) {
		
		String nombreRevision= leeDatos(mensaje);
		
		revision.setNombreRevision(nombreRevision);
				
	}
	
	public void ingresaDetalleRevision(String mensaje, Revision revision) {
		
		String detalleRevision= leeDatos(mensaje);
		
		revision.setDetalleRevision(detalleRevision);
				
	}
	
	public void ingresaEstadoRevision(String mensaje, Revision revision) {
		
		int estadoRevision= leeNum(mensaje);
		
		revision.setEstado(estadoRevision);
				
	}

	public Revision() {
		
	}

	public Revision(int idRevision, int idVisita, String nombreRevision, String detalleRevision, int estado) {
		super();
		this.idRevision = idRevision;
		this.idVisita = idVisita;
		this.nombreRevision = nombreRevision;
		this.detalleRevision = detalleRevision;
		this.estado = estado;
	}

	public int getIdRevision() {
		return idRevision;
	}

	public void setIdRevision(int idRevision) {
		this.idRevision = idRevision;
	}

	public int getIdVisita() {
		return idVisita;
	}

	public void setIdVisita(int idVisita) {
		this.idVisita = idVisita;
	}

	public String getNombreRevision() {
		return nombreRevision;
	}

	public void setNombreRevision(String nombreRevision) {
		this.nombreRevision = nombreRevision;
	}

	public String getDetalleRevision() {
		return detalleRevision;
	}

	public void setDetalleRevision(String detalleRevision) {
		this.detalleRevision = detalleRevision;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Revision [idRevision=" + idRevision + ", idVisita=" + idVisita + ", nombreRevision=" + nombreRevision
				+ ", detalleRevision=" + detalleRevision + ", estado=" + estado + "]";
	}
	
	public boolean validarNombre(String nombreRevision)
	{
		if(nombreRevision.length() >= 10 && nombreRevision.length() <= 50)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean validarDetalle(String detalleRevision)
	{
		if(detalleRevision.length() <= 100)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String validarEstado(int estado)
	{
		switch(estado) {
			case 1:
				return "Sin problemas";
			case 2:
				return "Con observaciones";
			case 3:
				return "No aprueba";
			default:
				return "No a ingresado opcion valida";
		}
	}
}
