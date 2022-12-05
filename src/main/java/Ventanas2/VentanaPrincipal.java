package Ventanas2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Hospital.*;

public class VentanaPrincipal extends JFrame {
    private JPanel panelMain;
    private JButton agregarPacienteButton;
    private JButton buscarPacienteButton;
    private JButton buscarMedicoButton;
    private JButton button2;
    private JButton agregarMedicoButton;

    public VentanaPrincipal(Hospital hospital){
        setContentPane(panelMain);
        setTitle("Sistema de Registro");
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


        buscarPacienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaBuscarPaciente ventanaBuscarPaciente= new VentanaBuscarPaciente(hospital);
            }
        });
    }
}
