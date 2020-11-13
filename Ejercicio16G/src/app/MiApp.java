package app;

import java.util.Date;

import model.Cliente;
import model.Profesional;
import model.Usuario;
import negocio.Listado;

public class MiApp {

	public static void main(String[] args) {
		Listado listado = new Listado();
		
		Usuario u1 = new Usuario("Deyanira", new Date(), "1-1");
		Cliente c1 = new Cliente("Miguel", new Date(), "2-2", "234234", "Modelo", 1, 
				"por ahí no más", "Lo Barnechea", 35);
		Profesional p1 = new Profesional("Miguel", new Date(), "5-5", "Gerente", new Date());
		Profesional p2 = new Profesional("Yossie", new Date(), "3-3", "Emperadora", new Date());
		Cliente c2 = new Cliente("Juan", new Date(), "4-4", "234234", "Habitat", 0, 
				"por ahí no más", "Las Condes", 35);
		
		listado.addElemento(u1);
		listado.addElemento(c1);
		listado.addElemento(p1);
		listado.addElemento(p2);
		listado.addElemento(c2);
		
		listado.analizaTodo();
		
		
	}

}
