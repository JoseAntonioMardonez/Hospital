package Hospital;

public class Medico extends Persona {
	private Especialidad especialidad;

	public Medico(String nombre, String apellido, int edad, String run, Especialidad especialidad) {
		super(nombre,apellido,edad,run);
		this.especialidad = especialidad;
	}

	public String getTipo() {
		return "Medico";
	}
}