package Empresa;


import java.util.Scanner;
/**
 * 
 * @author Jeffrey
 *
 */

public class Principal {
	
	/**
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
					
		int opc;
						
		Cliente client = new Cliente();
		
		Profesional prof = new Profesional();
		
		Administrativo admin = new Administrativo();
		
		Capacitacion curso = new Capacitacion();		
					
		Accidente accidente = new Accidente();
		
		VisitaTerreno visita = new VisitaTerreno();
		
		Revision revision = new Revision();
		
		Contenedor contenedor= new Contenedor();
		
		
		String totalidadDatos = "";
		
		do {			
			
			escribir("\tMenu Principal" + "\n1.- Almacenar Nuevo Cliente."
					+ "\n2.- Almacenar Nuevo Profesional." 
					+ "\n3.- Almacenar Nuevo Administrativo."
					+ "\n4.- Almacenar Nueva Capacitacion." 
					+ "\n5.- Eliminar Usuario."
					+ "\n6.- Lista total de Usuarios." 	
					+ "\n7.- Lista de Usuarios por Tipo." 
					+ "\n8.- Lista Total de Capacitaciones." + 
					"\n9.- Salir. \n");
				
			opc = leeNum("Ingrese una Opcion");
			
			
			switch (opc) {
			
			
				case 1:			
					
					client = client.nuevoCliente(); // Con este metodo se evita
					//que se sobreescriba un nuevo Usuario en el anterior
					
					client.ingresaNombreUsuario("Ingresa nombre de Usuario",
							client);
							
					client.ingresaFechaNacUsuario("Ingresa fecha de nacimiento "
							+ "de Usuario: ", client);
					
					client.ingresaRunUsuario("Ingresa Run Usuario: ", client);
					
					client.ingresarDatosCliente(client);
					
							
					totalidadDatos = leeDatos("Desea ingresar una capacitacion?:"
							+ " \n-Si \n-No");
					
					if (totalidadDatos.equalsIgnoreCase("Si")) { 
						
						curso = curso.nuevaCapacitacion();
						
						curso.ingresarDatosCapacitacion(curso);
															
						contenedor.agregarCapacitacion(curso);
						
					}
					
					totalidadDatos = leeDatos("Desea ingresar un accidente?:"
							+ " \n-Si \n-No");
					
					if (totalidadDatos.equalsIgnoreCase("si")) {
						
						accidente = accidente.nuevoAccidente();
						
						accidente.ingresarDatosAccidente(accidente);
						
						contenedor.agregarAccidente(accidente);
						
					}
					
					
					
					do {
						
						escribir("Ingrese visita a terreno: ");
						
						visita = visita.nuevaVisitaTerreno();
						
						visita.ingresarDatosVisitaTerreno(visita);
						
						contenedor.agregarVisitaTerreno(visita);
						
						totalidadDatos = leeDatos("Desea ingresar otra visita"
								+ " a terreno?: \n-Si \n-No");
						
					} while (totalidadDatos.equalsIgnoreCase("si"));
					
					
					
					totalidadDatos = "si";
					
					while (totalidadDatos.equalsIgnoreCase("si")) {
						
						escribir("Ingrese revision de la visita a terreno: ");
						
						revision = revision.nuevaRevision();
						
						revision.ingresarDatosRevision(revision);
						
						contenedor.agregarRevision(revision);
						
						totalidadDatos = leeDatos("Desea ingresar otra revision"
								+ " de la visita a terreno?: \n-Si \n-No");
						
					} 
								
					contenedor.agregarUsuario(client); // se ingresa al
					//contenedor de usuarios 
										
					System.out.println(accidente.toString());
					System.out.println(curso.toString());
					
					break;
					
				case 2:
					
					prof = prof.nuevoProfesional();
													
					prof.ingresaNombreUsuario("Ingresa nombre de Usuario: ", prof);
					
					prof.ingresaFechaNacUsuario("Ingresa fecha de nacimiento de "
							+ " Usuario", prof);
					
					prof.ingresaRunUsuario("Ingresa Run Usuario: ", prof);
					
					totalidadDatos = leeDatos("Desea ingresar datos especificos"
							+ " del cliente: \n-Si \n-No"); // se eliminara este condicional para entrega final
					
					if (totalidadDatos.equalsIgnoreCase("Si")) {
						
						prof.setTitulo(prof.leeDatos("Ingrese titulo del Usuario Profesional: "));
						
						prof.setFechaIngreso(prof.leeDatos("Ingrese fecha de ingreso del Usuario "
								+ "Profesional: "));
												
					}else {
						
						escribir("Solo ha ingresado los datos basicos del Usuario.");
					}	
									
					contenedor.agregarUsuario(prof);	
										
					break;
					
				case 3:
					
					admin = admin.nuevoAdmin();
					
					admin.ingresaNombreUsuario("Ingresa nombre de Usuario: ", admin);
										
					admin.ingresaFechaNacUsuario("Ingrese fecha de nacimiento de Usuario", admin);
					
					totalidadDatos = leeDatos("Desea ingresar datos especificos"
							+ " del cliente: \n-Si \n-No"); // se eliminara este condicional para entrega final
					
					if (totalidadDatos.equalsIgnoreCase("Si")) {
						
						admin.setArea(admin.leeDatos("Ingrese Area del Usuario Administrativo: "));
						
						admin.setExperienciaPrevia(admin.leeDatos("Ingrese experiencia previa"
								+ " del Usuario Administrativo: "));
												
					}else {
						
						escribir("Solo ha ingresado los datos basicos del Cliente.");
					}	
					
					contenedor.agregarUsuario(admin);
					
					break;
					
				case 4:			
					
					curso = curso.nuevaCapacitacion();
					
					curso.ingresarDatosCapacitacion(curso);
														
					contenedor.agregarCapacitacion(curso);
										
					break;
				
				case 5:
					
					contenedor.eliminarUsuario(leeNum("Ingrese el RUN de"
							+ " Usuario a eliminar de la lista: "));				
					break;
				
				case 6:
					
					contenedor.analizarTodo("--------Datos de Lista"
							+ " Usuarios-------\n");
					break;	
					
				case 7: 
					
					int tipo = escogeUsuario("Indique de cual tipo de usuario desea ver la lista: ");
					
					escribir("-----Datos de Usuario Tipo " +
					( (tipo==1) 
							?"Cliente"
							:(tipo==2)
								?"Profesional"
								:"Administrativo"));
					
					contenedor.analizarPorTipo(tipo);
					
					break;
					
				case 8:
										
					contenedor.analizarCapacitaciones("--------"
							+ "Datos de Capacitaciones-------\n");
					//falta juntar los datos del cliente asociados a la capacitacion 		
					break;
				
				default:
					escribir("Adios...");
			}
			
		}while(opc != 9);
		
	}
	
	public static void escribir(String mensaje) {
		System.out.println(mensaje);
	}
	
	public static String leeDatos(String mensaje) {
		escribir(mensaje);
		Scanner e = new Scanner(System.in);
		
		return e.nextLine();
	}
	
	public static int leeNum(String mensaje) {
		escribir(mensaje);
		Scanner e = new Scanner(System.in);
		
		return e.nextInt();
	}
	
	public static int escogeUsuario(String mensaje) {
			
		int tipoU = 0;
		
		 do{
			
			String tipoUsuario = leeDatos(mensaje);
			
		if (tipoUsuario.equalsIgnoreCase("Cliente")) {
			tipoU = 1;
			
		}else if (tipoUsuario.equalsIgnoreCase("Profesional")) {
			
			tipoU = 2;
			
		}else if (tipoUsuario.equalsIgnoreCase("Administrativo")) {
			
			tipoU = 3;
			
		}else {
			
			escribir("Ingrese un tipo de Usuario correcto:"
					+ " cliente - profesional - administrativo"); 
		
		}
		
		}while (tipoU == 0);
		
		return tipoU;
	}
	
	
	
	
	
	

}
