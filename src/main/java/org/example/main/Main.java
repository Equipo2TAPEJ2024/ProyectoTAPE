package org.example.main;

import com.formdev.flatlaf.FlatLightLaf;
import org.example.vista.ProyectoGUI;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        FlatLightLaf.setup();
        //UIManager.put("h1.font")

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new ProyectoGUI();
                frame.setSize(540, 920);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                frame.setResizable(true);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setTitle("Spotify 2");

            }
        });

    }
}