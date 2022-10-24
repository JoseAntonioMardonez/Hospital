public class Launcher {

	public static void main(String[] Args) {
		Hospital hospital = new Hospital();
		Paciente paciente1 = new Paciente("Jose Mardonez", 93);
		Paciente paciente2 = new Paciente("Juan Rojel", 55);
		Medico medico1 = new Medico("Pedro García", 45);
		Medico medico2 = new Medico("Antonio Jimenez", 60);
		hospital.agregarPaciente(paciente1);
		hospital.agregarPaciente(paciente2);
		hospital.agregarMedico(medico1);
		hospital.agregarMedico(medico2);
		hospital.buscarMedico("Antonio Jimenez");
		hospital.eliminarPaciente(paciente1);

	}
}