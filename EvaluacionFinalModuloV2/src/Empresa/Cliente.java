package Empresa;

import java.util.Scanner;

public class Cliente extends Usuario {
	
	private int rut;
	private String nombres;
	private String apellidos;
	private String telefono;
	private String afp;
	private int sistemaSalud;
	private String direccion;
	private String comuna;
	private int edad;
	
	public Cliente nuevoCliente() {
		
		Cliente objeto = new Cliente(); 
		
		return objeto;
	}
	
	public Cliente ingresarDatosCliente (Cliente objeto) {
		
		objeto.ingresaRUTCliente("Ingrese Rut Cliente: ", objeto);
		
		objeto.ingresaNombresCliente("Ingrese el nombre del"
				+ " Cliente: ", objeto);		
		
		objeto.ingresaApellidosCliente("Ingrese apellidos del "
				+ "Cliente: ", objeto);
		
		objeto.ingresaTelefonoCliente("Ingresa telefono del"
				+ " Cliente: ", objeto);
		
		objeto.ingresaAFPCliente("Ingresa la AFP del "
				+ "Cliente: ", objeto);
		
		objeto.ingresaSistemaDeSaludCliente("Ingresa el Sistema de Salud"
				+ " del cliente: ",	objeto);					
		
		objeto.ingresaDireccionCliente("Ingresa la direccion del"
				+ " Cliente: ", objeto);
		
		objeto.ingresaComunaCliente("Ingresa la comuna del"
				+ " Cliente: ", objeto);
		
		objeto.ingresaEdadCliente("Ingresa la edad del"
				+ " Cliente: ", objeto);
			
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
	
	public void ingresaRUTCliente(String mensaje, Cliente cliente) {
		
		int rutCliente = leeNum(mensaje);
		
		while (cliente.validaRut(rutCliente) == false) {
			
			rutCliente = leeNum("RUT no valido, por favor ingrese nuevamente: ");
			
		}
		
		cliente.setRut(rutCliente);
				
	}
	
	public void ingresaNombresCliente(String mensaje, Cliente cliente) {
		
		String nombresCliente= leeDatos(mensaje);
		
		while (cliente.validaNombres(nombresCliente) == false) {
			
			nombresCliente= leeDatos("Ingrese nombres validos (min.5"
					+ " caracteres, max 30): ");
			
		}
		
		cliente.setNombres(nombresCliente);
				
	}
	
	public void ingresaApellidosCliente(String mensaje, Cliente cliente) {
		
		String apellidosCliente= leeDatos(mensaje);
		
		while(cliente.validaApellidos(apellidosCliente) == false) {
			
			apellidosCliente=leeDatos("Ingrese apellidos validos(min.5 "
					+ "caracteres, max 30):");
			
		}
		
		cliente.setApellidos(apellidosCliente);
				
	}
	
	public void ingresaTelefonoCliente(String mensaje, Cliente cliente) {
		
		String telefonoCliente= leeDatos(mensaje);
		
		while (cliente.validaTelefono(telefonoCliente) == false) {
		
			telefonoCliente=leeDatos("Campo Obligatorio");
			
		}
		
		cliente.setTelefono(telefonoCliente);
				
	}
	
	public void ingresaAFPCliente(String mensaje, Cliente cliente) {
		
		String afpCliente= leeDatos(mensaje);
		
		while (cliente.validaAFP(afpCliente) == false) {
			
			afpCliente = leeDatos("ingrese una AFP valida (min 4 caracteres,"
					+ " max 30): ");
			
		}
		
		cliente.setAfp(afpCliente);
				
	}
	
	public void ingresaSistemaDeSaludCliente(String mensaje, Cliente cliente) {
		
		int sistemaDeSaludCliente = leeNum(mensaje);
		
		while (cliente.validaSistemaDeSalud(sistemaDeSaludCliente)== false) {
			
			sistemaDeSaludCliente = leeNum("Ingrese una opcion valida: ");
			
		}
		
		cliente.setSistemaSalud(sistemaDeSaludCliente);
				
	}
	
	public void ingresaDireccionCliente(String mensaje, Cliente cliente) {
		
		String direccionCliente= leeDatos(mensaje);
		
		while (cliente.validaDireccion(direccionCliente) == false) {
			
			direccionCliente = leeDatos("ingrese una direccion valida"
					+ " maximo 70 caracteres");
			
		}
		
		cliente.setDireccion(direccionCliente);
				
	}
	
	public void ingresaComunaCliente(String mensaje, Cliente cliente) {
		
		String comunaCliente= leeDatos(mensaje);
		
		while (cliente.validaComuna(comunaCliente) == false) {
			
			comunaCliente = leeDatos("ingrese una comuna valida"
					+ " maximo 50 caracteres");
			
		}
		
		cliente.setComuna(comunaCliente);
				
	}
	
	public void ingresaEdadCliente(String mensaje, Cliente cliente) {
		
		int edadCliente = leeNum(mensaje);
		
		while (cliente.validaEdad(edadCliente)== false) {
			
			edadCliente = leeNum("Ingrese una opcion valida: ");
			
		}
		
		cliente.setEdad(edadCliente);
				
	}	
	
	
		
	public Cliente() {
		
	}
	
	public Cliente(int rut, String nombres, String apellidos, String telefono, String afp, int sistemaSalud,
			String direccion, String comuna, int edad) {
		super();
		this.rut = rut;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}

	public Cliente(String nombre, String fechaNacimiento, int run) {
		super(nombre, fechaNacimiento, run);
		
	}

	public int getRut() {
		return rut;
	}
	public void setRut(int rut) {
		this.rut = rut;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getAfp() {
		return afp;
	}
	public void setAfp(String afp) {
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
	public String toString() {
		return "Usuario [nombre = "+ super.getNombre() + ", fecha de nacimiento = "
				+ super.fechaNacimiento + ", run = "+ super.getRun()  + "]\n"
				+ "Cliente [rut = " + rut + ", nombres =" + nombres + ", apellidos = "
				+ apellidos + ",\ntelefono=" + telefono
				+ ", afp = " + afp + ", sistemaSalud = " + sistemaSalud + ", direccion = " 
				+ direccion + ",\ncomuna = " + comuna
				+ ", edad = " + edad + "]\n";
	}
	
	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Direccion: " + direccion);
		System.out.println("Comuna: " + comuna );				
		}

	public String obtenerNombre(String nombres, String apellidos) {
		
		String nombreCompleto = nombres + apellidos;
		
		return nombreCompleto;		
	}
		
	public String obtenerSistemaSalud(int sistemaSalud) {
		
		String sistema_salud = "";
		
		if (sistemaSalud == 1)
		{
			sistema_salud = "Fonasa";
		}
		else if (sistemaSalud == 2)
		{
			sistema_salud = "Isapre";
		}
		
		return sistema_salud;
	}
		
	public boolean validaRut(int rut)
	{
		if (rut <= 99999999)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean validaNombres(String nombres)
	{
		if (nombres.length() >= 5 && nombres.length() <= 30)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean validaApellidos(String apellidos)
	{
		if (apellidos.length() >= 5 && apellidos.length() <= 30)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean validaTelefono(String telefono)
	{
		if (telefono.length() != 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean validaAFP(String afp)
	{
		if (afp.length() >= 4 && afp.length() <= 30)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean validaSistemaDeSalud(int sistemaSalud)
	{
		if (sistemaSalud == 1)	{
			
			return true;
			
		}
		
		else if (sistemaSalud == 2) {
			
			return true;
			
		}
		
		else {
			
			return false;
			
		}
	}
	
	public boolean validaDireccion(String direccion)
	{
		if (direccion.length() <= 70)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean validaComuna(String comuna)
	{
		if (comuna.length() <= 50)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean validaEdad(int edad)
	{
		if (edad >= 0 && edad < 150)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
}