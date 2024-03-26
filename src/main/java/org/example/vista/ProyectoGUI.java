package org.example.vista;
/*
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;*/

import javax.swing.*;
import java.awt.*;


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
        scrollContenido.getVerticalScrollBar().setUnitIncrement(12);
        //panelGeneral.add(panelCentro);
        Font fontsize22 = UIManager.getFont("h1.font");
        Font fontsize20 = UIManager.getFont("h2.font");
        Font fontsize18 = UIManager.getFont("h3.font");

        /*ModoClaro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ModoClaro.isSelected()){
                    EventQueue.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            FlatAnimatedLafChange.showSnapshot();
                            FlatDarkLaf.setup();
                            FlatLaf.updateUI();
                            FlatAnimatedLafChange.hideSnapshotWithAnimation();
                        }
                    });
                }else {
                    EventQueue.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            FlatAnimatedLafChange.showSnapshot();
                            FlatLightLaf.setup();
                            FlatLaf.updateUI();
                            FlatAnimatedLafChange.hideSnapshotWithAnimation();
                        }
                    });
                }
            }
        });
        ModoOscuro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ModoClaro.isSelected()){
                    EventQueue.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            FlatAnimatedLafChange.showSnapshot();
                            FlatLightLaf.setup();
                            FlatLaf.updateUI();
                            FlatAnimatedLafChange.hideSnapshotWithAnimation();
                        }
                    });
                }else {
                    EventQueue.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            FlatAnimatedLafChange.showSnapshot();
                            FlatDarkLaf.setup();
                            FlatLaf.updateUI();
                            FlatAnimatedLafChange.hideSnapshotWithAnimation();
                        }
                    });
                }
            }
        });*/
    }

}

