package Hospital;

public class Paciente extends Persona {

	public Paciente(String nombre, String apellido, int edad, String run) {
		super(nombre,apellido,edad,run);
	}



	public String getTipo() {
		return "Paciente";
	}
}