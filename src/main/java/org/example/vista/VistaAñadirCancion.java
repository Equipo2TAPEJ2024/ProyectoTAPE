package org.example.vista;

import javax.swing.*;

public class VistaAñadirCancion extends JFrame{
    private JPanel PanelGeneral;
    private JPanel Psur;
    private JPanel Pcentro;
    private JLabel IDCancion;
    private JLabel AñadirCanciones;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextArea textArea1;

    public VistaAñadirCancion(){
        setContentPane(PanelGeneral);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
