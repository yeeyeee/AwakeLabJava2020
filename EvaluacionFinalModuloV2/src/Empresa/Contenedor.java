package Empresa;

import java.util.ArrayList;
import java.util.List;



public class Contenedor {

	private List<Asesoria> usuarios = new ArrayList<Asesoria>();
	private List<Capacitacion> capacitacion = new ArrayList<Capacitacion>();
	private List<Accidente> accidente = new ArrayList<Accidente>();
	private List<VisitaTerreno> visitaTerreno = new ArrayList<VisitaTerreno>();
	private List<Revision> revision = new ArrayList<Revision>();
		
	public void agregarAccidente(Accidente objetoAccidente) {
		
		accidente.add(objetoAccidente);
		
	}
	
	public void agregarVisitaTerreno(VisitaTerreno objetoVisitaTerreno) {
		
		visitaTerreno.add(objetoVisitaTerreno);
		
	}	
	
	public void agregarRevision(Revision objetoRevision) {
		
		revision.add(objetoRevision);
		
	}
	
	public void agregarUsuario(Asesoria objetoUsuario) {
		
		usuarios.add(objetoUsuario);
	}
		
	public void agregarCapacitacion(Capacitacion objetoCapacitacion) {
		
		capacitacion.add(objetoCapacitacion);
	}
	
	public void eliminarUsuario(int run) {
				
		for(Asesoria objetoUsuario : usuarios) {
				
			Usuario object = (Usuario) objetoUsuario; //casteo explicito de Asesoria a Usuario
				
			int runUsuario = object.getRun(); // y asi acceder a sus atributos de la clase Usuario
			
			if (runUsuario == run ) {
					
					usuarios.remove(objetoUsuario);
					System.out.println("Se ha removido de la lista el Usuario "
							+ "con Run: " + runUsuario);
			}
			else {
				System.out.println("No existe el Usuario bajo el Run Ingresado "
						+ run);
			}
		}
	}
	
	public void analizarTodo(String mensaje) {
		
		System.out.println(mensaje);
		
		int cont = 1;
		
		for(Asesoria ia : usuarios) {
			
			System.out.println("\nUsuario " + cont + ".: ");
			
			ia.analizarUsuario();// consultar si se imprime solo nombre y run
			// o si se imprime run fecha nacimiento y run
			
			cont++;
			
		}
		
	}
	
	public void analizarPorTipo(int tipo) {
		
		for(Asesoria claseUsuario: usuarios) {
			
			if (tipo == 1 && claseUsuario  instanceof Cliente) {
				
				claseUsuario.analizarUsuario();
			}
			else if (tipo == 2 && claseUsuario instanceof Profesional) {
				
				claseUsuario.analizarUsuario();
				
			}else if (tipo == 3 && claseUsuario instanceof Administrativo) {
				
				claseUsuario.analizarUsuario();
				
			}
			
		}
	}
	
	public void analizarCapacitaciones(String mensaje) {
		
		System.out.println(mensaje);
		
		int cont = 1;
				
		for (Capacitacion curso: capacitacion) {
			
			System.out.println("\nCapacitacion " + cont + ".: " );
			
			curso.mostrarDetalle();
						
			for (Asesoria obj : usuarios ) {
				
				if (obj instanceof Cliente && ((Cliente) obj).getRut() == curso.getRutCliente() ) {	
					
					Cliente parseadoCliente = (Cliente) obj;
											
					parseadoCliente.analizarUsuario();
					
				}
				
			}
			
			cont++;
		}
			
	}
	
	
	
	
	
}
