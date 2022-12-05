package Ventanas;

import Hospital.Hospital;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaBienvenida extends Ventana{
    private JLabel textoMenu;
    private JButton botonRegistrarPaciente;
    private JButton botonSalida;
    private JButton botonRegistrarMedico;
    private JButton botonBuscarPaciente;
    private JButton botonBuscarMedico;
    private JButton botonMostrarPacientes;
    private Hospital hospital;

    public VentanaBienvenida(Hospital hospital) {
        super("Menu Hospital", 500, 700);
        this.hospital=hospital;
        generarElementosVentana();
    }

    private void generarElementosVentana() {
        generarMensajeMenu();
        generarBotonRegistrarPaciente();
        generarBotonRegistrarMedico();
        generarBotonBuscarPaciente();
        generarBotonBuscarMedico();
        generarBotonMostrarPacientes();
        generarBotonSalir();
    }

    private void generarMensajeMenu() {
        String textoBienvenida = "Hospital - Sistema de Registro";
        super.generarJLabelEncabezado(this.textoMenu, textoBienvenida, 120, 30, 500, 30);
    }

    private void generarBotonRegistrarPaciente() {
        String textoBoton = "Registrar Paciente";
        this.botonRegistrarPaciente = super.generarBoton(textoBoton, 175, 100, 150, 40);
        this.add(this.botonRegistrarPaciente);
        this.botonRegistrarPaciente.addActionListener(this);
    }
    private void generarBotonSalir() {
        String textoBoton = "Salir";
        this.botonSalida = super.generarBoton(textoBoton, 175, 520, 150, 40);
        this.add(this.botonSalida);
        this.botonSalida.addActionListener(this);
    }
    private void generarBotonRegistrarMedico() {
        String textoBoton = "Registrar Medico";
        this.botonRegistrarMedico = super.generarBoton(textoBoton, 175, 340, 150, 40);
        this.add(this.botonRegistrarMedico);
        this.botonRegistrarMedico.addActionListener(this);
    }
    private void generarBotonBuscarPaciente(){
        String textoBoton = "Buscar Paciente";
        this.botonBuscarPaciente=super.generarBoton(textoBoton, 175, 180, 150, 40);
        this.add(this.botonBuscarPaciente);
        this.botonBuscarPaciente.addActionListener(this);
    }
    private void generarBotonBuscarMedico(){
        String textoBoton = "Buscar Medico";
        this.botonBuscarMedico=super.generarBoton(textoBoton, 175, 420, 150, 40);
        this.add(this.botonBuscarMedico);
        this.botonBuscarMedico.addActionListener(this);
    }
    private void generarBotonMostrarPacientes(){
        String textoBoton = "Mostrar Pacientes";
        this.botonMostrarPacientes=super.generarBoton(textoBoton, 175, 260, 150, 40);
        this.add(this.botonMostrarPacientes);
        this.botonMostrarPacientes.addActionListener(this);
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botonRegistrarPaciente) {
            //VentanaRegistroPaciente ventanaRegistroPaciente= new VentanaRegistroPaciente(hospital);
            //Cierra la ventana actual
            this.dispose();
        }
        if(e.getSource() == this.botonRegistrarMedico){
            JOptionPane.showMessageDialog(this,"Próximamente","Mensaje Informativo",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        if(e.getSource() == this.botonBuscarPaciente){
            VentanaBusquedaPaciente ventanaBusquedaPaciente= new VentanaBusquedaPaciente(hospital);
            this.dispose();
        }
        if(e.getSource() == this.botonBuscarMedico){
            JOptionPane.showMessageDialog(this,"Próximamente","Mensaje Informativo",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        if(e.getSource() == this.botonMostrarPacientes){
            //VentanaMostrarPacientes ventanaMostrarPacientes= new VentanaMostrarPacientes(datos);
            this.dispose();
        }

        if(e.getSource() == this.botonSalida){
            //HospitalController.almacenarDatos(this.hospital);
            this.dispose();
            System.exit(0);
        }

    }
}
