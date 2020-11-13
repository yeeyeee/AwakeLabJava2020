package negocio;

import java.util.ArrayList;
import java.util.List;

import interfaces.IAsesoria;
//

public class Listado {

	//private List<Usuario> usuarios = new ArrayList<Usuario>();
	private List<IAsesoria> usuarios = new ArrayList<IAsesoria>();
	
	/**
	 * Agregamos un elemento al listado.
	 * @param u
	 */
	public void addElemento(IAsesoria u) {
		usuarios.add(u);
	}
	
	
	public void analizaTodo() {
		/*for (Usuario usuario : usuarios) {
			usuario.analizarUsuario();
		}*/
		
		
		for (IAsesoria ia : usuarios) {
			ia.analizarUsuario();
		}
	}
	
}
