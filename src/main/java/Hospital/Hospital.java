package Hospital;

import java.io.IOException;
import java.util.ArrayList;
import Gestores.*;

public class Hospital {
	//Atributos
	private ArrayList<Medico> medicos = new ArrayList<Medico>();
	private ArrayList<Paciente> pacientes = new ArrayList<Paciente>();

	//Métodos
	public ArrayList<Paciente> getPacientes() {
		return pacientes;
	}

	public ArrayList<Medico> getMedicos() {
		return medicos;
	}

	public void agregarPaciente(Paciente paciente) {
		this.pacientes.add(paciente);
		System.out.println("Paciente agregado");
	}

	public void eliminarPaciente(Paciente paciente) {
		this.pacientes.remove(paciente);
		System.out.println("Paciente eliminado");
	}

	public void agregarMedico(Medico medico) {
		this.medicos.add(medico);
		System.out.println("Médico agregado");
	}

	public void eliminarMedico(Medico medico) {
		this.medicos.remove(medico);
		System.out.println("Médico eliminado");
	}

	public void buscarPaciente(String nombre) {
		for(Paciente paciente : this.pacientes){
			if(paciente.getNombre().equals(nombre)){
				System.out.println("Paciente encontrado");
				return;
			}
		}

		System.out.println("Paciente no encontrado");
	}

	public void buscarMedico(String nombre) {
		for(Medico medico : this.medicos){
			if(medico.getNombre().equals(nombre)){
				System.out.println("Médico encontrado");
				return;
			}
		}

		System.out.println("Médico no encontrado");
	}

	public void fichaPaciente(Paciente paciente) throws IOException {
		GestorPDF.generarFichaPaciente(paciente);
	}

//Constructor
	public Hospital() {
		this.pacientes = new ArrayList<Paciente>();
		this.medicos = new ArrayList<Medico>();
	}
}