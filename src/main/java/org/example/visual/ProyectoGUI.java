package org.example.visual;

import javax.swing.*;

public class ProyectoGUI extends JFrame {


    private JPanel panelGeneral;
    private JPanel panelNorte;
    private JPanel panelCentro;
    private JPanel panelSur;
    private JButton btnHome;
    private JButton btnRegistro;
    private JButton btnBiblioteca;
    private JPanel panelScroll;
    private JPanel panelContenido;
    private JLabel lblCanciones;
    private JScrollPane scrlCanciones;
    private JPanel panelCanciones;
    private JScrollPane scrollContenido;
    private JLabel lblArtistas;
    private JScrollPane scrollArtistas;
    private JPanel panelArtistas;
    private JLabel lblAlbumes;
    private JScrollPane scrollAlbumes;
    private JPanel panelAlbumes;
    private JLabel lblProductoras;
    private JScrollPane scrollGeneros;
    private JPanel panelGeneros;
    private JScrollPane scrollProductoras;
    private JLabel lblGeneros;
    private JPanel panelProductoras;

    public ProyectoGUI(){
        setContentPane(panelGeneral);
        panelGeneral.add(panelCentro);

        scrollContenido.getVerticalScrollBar().setUnitIncrement(12);

    }
}
