public class Medico {
	private String nombre;
	private int edad;

	//Metodos

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String toString(){
		return "Nombre del Médico: "+nombre+"\n "+" Edad: "+edad;
	}

	//Constructor

	public Medico(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
}