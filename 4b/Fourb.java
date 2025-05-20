package swinDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fourb {



    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("Country Button Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        // Create buttons
        JButton btnSrilanka = new JButton("Srilanka");
        JButton btnIndia = new JButton("India");

        // Add ActionListeners
        btnSrilanka.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Srilanka is pressed");
            }
        });

        btnIndia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("India is pressed");
            }
        });

        // Add buttons to the frame
        frame.add(btnSrilanka);
        frame.add(btnIndia);

        // Show frame
        frame.setVisible(true);
    }
}
