package Ventanas;

import Hospital.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;

public class VentanaMostrarPacientes extends JFrame  {
    private String[][] datos;
    private String[] nombreColumnas;
    /**
     * El constructor inicializa la tabla con los datos entregados por parámetro
     *
     * @param datos
     */
    public VentanaMostrarPacientes(String[][] datos) {
        super("Lista de Pacientes");
        this.datos = datos;
        this.nombreColumnas = nombreColumnas();
        generarTabla();
        super.setLocationRelativeTo(null);
        super.setResizable(false);
        this.pack();
        this.setVisible(true);
    }
    public boolean isCellEditable(int row, int column) {
        return false;
    }
    public void generarTabla() {
        DefaultTableModel dtm = new DefaultTableModel(this.datos, this.nombreColumnas) {
            //Se edita un método de la tabla para que no se permita modificar los datos
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        final JTable tabla = new JTable(dtm);
        tabla.setPreferredScrollableViewportSize(new Dimension(500, 200));
        JScrollPane scrollPane = new JScrollPane(tabla);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                cerrarVentana();
            }
        });
    }
    private void cerrarVentana() {
        this.dispose();
    }
    private String[] nombreColumnas(){
        String[] nombreColumnas = new String[4];
        nombreColumnas[0]="Nombre";
        nombreColumnas[1]="Apellido";
        nombreColumnas[2]="Edad";
        nombreColumnas[3]="RUN";
        return nombreColumnas;
    }
    private String[][] datosPacientes(Hospital hospital){
        String[][] datosPacientes =new String[0][0];

        for (Paciente paciente : hospital.getPacientes()) {
            //String[][] datosPacientes = paciente.getNombre();
        }
        return datosPacientes;
    }
}
