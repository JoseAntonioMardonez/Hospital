package Ventanas2;

import Hospital.*;

import javax.swing.*;

public class VentanaMostrarPacienteBuscado extends JFrame{
    private JPanel panelMain;
    private JLabel run;
    private JLabel edad;
    private JLabel apellido;
    private JLabel nombre;

    public VentanaMostrarPacienteBuscado(Paciente paciente) {
        setContentPane(panelMain);
        setTitle("Sistema de Registro");
        setSize(500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        nombre.setText(paciente.getNombre());
        apellido.setText(paciente.getApellido());
        edad.setText(Integer.toString(paciente.getEdad()));
        run.setText(paciente.getRun());

    }
}
