package Ventanas;

import Hospital.*;
import Ventanas2.VentanaMostrarPacienteBuscado;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaBusquedaPaciente extends Ventana {
    private JLabel textoMenu;
    private JButton botonRegistrarPaciente;
    private JButton botonSalida;
    private JButton botonRegistrarMedico;
    private JButton botonBuscarPaciente;
    private JButton botonBuscarMedico;
    private JButton botonMostrarPacientes;
    private Hospital hospital;
    public VentanaBusquedaPaciente(Hospital hospital){
        super("Busqueda Paciente", 500, 520);
        this.hospital = hospital;
        generarElementosVentana();
    }

    private void generarElementosVentana() {
        generarMensajeMenu();
        generarBotonBuscarPaciente();
        //generarBotonSalir();
    }

    private void generarMensajeMenu() {
        String textoBienvenida = "Busqueda de Paciente";
        super.generarJLabelEncabezado(this.textoMenu, textoBienvenida, 120, 30, 500, 30);
    }

    private void generarCampo(){

    }

    private void generarBotonBuscarPaciente() {
        String textoBoton = "Buscar Paciente";
        this.botonBuscarPaciente = super.generarBoton(textoBoton, 175, 350, 150, 40);
        this.add(this.botonBuscarPaciente);
        this.botonBuscarPaciente.addActionListener(this);
    }
    private void generarBotonSalir() {
        String textoBoton = "Salir";
        this.botonSalida = super.generarBoton(textoBoton, 175, 420, 150, 40);
        this.add(this.botonSalida);
        this.botonSalida.addActionListener(this);
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
            //String run = textFieldRUN.getText();
            Paciente paciente = new Paciente("","",0,"");
            //paciente= hospital.buscarPaciente(run);
            VentanaMostrarPacienteBuscado ventanaMostrarPacienteBuscado= new VentanaMostrarPacienteBuscado(paciente);
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
