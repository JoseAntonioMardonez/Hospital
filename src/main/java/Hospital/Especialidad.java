package Hospital;

public enum Especialidad {

	MEDICINAGENERAL("Medicina General"),
	PEDIATRIA("Pediatría"),
	TRAUMATOLOGIA("Traumatología"),
	DERMATOLOGIA("Dermatología"),
	OFTALMOLOGIA("Oftalmología");

	private String especialidad;

	private Especialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}
}