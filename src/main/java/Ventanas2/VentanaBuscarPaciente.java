package Ventanas2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Hospital.*;

public class VentanaBuscarPaciente extends JFrame{
    private JTextField textFieldRUN;
    private JButton buscarButton;
    private JPanel panelMain;

    public VentanaBuscarPaciente(Hospital hospital) {
        setContentPane(panelMain);
        setTitle("Sistema de Registro");
        setSize(500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String run = textFieldRUN.getText();
                Paciente paciente = new Paciente("","",0,"");
                paciente= hospital.buscarPaciente(run);
                VentanaMostrarPacienteBuscado ventanaMostrarPacienteBuscado= new VentanaMostrarPacienteBuscado(paciente);
            }
        });
    }
}
