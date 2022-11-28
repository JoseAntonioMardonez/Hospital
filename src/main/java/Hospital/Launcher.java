package Hospital;
import Ventanas.*;
import Gestores.*;

import java.io.IOException;

public class Launcher {

	public static void main(String[] args) throws IOException {
		Hospital hospital = new Hospital();
		Paciente paciente1 = new Paciente("Jose","Mardonez",93,"11.111.111-1");
		Paciente paciente2 = new Paciente("Juan","Rojel",55,"22.222.222-2");
		hospital.agregarPaciente(paciente1);
		hospital.agregarPaciente(paciente2);
		//GestorDatos.registrarDato(paciente1,"src\\main\\java\\Gestores\\Pacientes.txt");
		//GestorDatos.registrarDatos(hospital.getPacientes(),"C:\\Users\\josem\\IdeaProjects\\Hospital\\src\\main\\java\\Gestores\\Pacientes.txt");
		hospital.fichaPaciente(paciente1);
		//new VentanaBienvenida(hospital);
	}

}