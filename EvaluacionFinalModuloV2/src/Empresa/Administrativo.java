package Empresa;



public class Administrativo extends Usuario {
	
	
	private String area;
	private String experienciaPrevia;
	
	public Administrativo() {
		
	}
	
	public Administrativo(String area, String experienciaPrevia) {
		super();
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}

	public Administrativo(String nombre, String fechaNacimiento, int run) {
		super(nombre, fechaNacimiento, run);
		// TODO Auto-generated constructor stub
		
	}

	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}
	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}

	@Override
	public String toString() {
		return "Administrativo [area=" + area + ", experienciaPrevia=" + experienciaPrevia + "]";
	}

	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		// Administrativo
		System.out.println("Area perteneciente: " + this.area);
		System.out.println("Experiencia previa: " + this.experienciaPrevia );	
	}
	
	public void listarUsuario() {
		
		System.out.println("\nNombre Usuario: " + this.nombre);
		System.out.println("Fecha nacimiento: " + this.fechaNacimiento);
		System.out.println("RUN Usuario: " + this.run + "\n");
		
	}
	
	public Administrativo nuevoAdmin() {
		
		Administrativo objeto = new Administrativo(); 
		
		return objeto;
	}
	
	

}
