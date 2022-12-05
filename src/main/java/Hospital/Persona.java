package Hospital;

public abstract class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private String run;

	public abstract String getTipo();

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

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getRun() {
		return this.run;
	}

	public void setRun(String run) {
		this.run = run;
	}

	public String toString(){
		return nombre+", "+apellido+", "+edad+", "+run;
	}

	public Persona(String nombre, String apellido, int edad, String run) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.run = run;
	}
}