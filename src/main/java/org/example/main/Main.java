package org.example.main;

import org.example.visual.ProyectoGUI;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*try {
            UIManager.setLookAndFeel( new FlatLightLaf() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }

         */
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new ProyectoGUI();
                frame.setSize(540,720);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                frame.setResizable(true);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setTitle("Spotify 2");

            }
        });

    }
}