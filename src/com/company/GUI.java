package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    private JButton button;

    public GUI() {
        frame = new JFrame();
        button = new JButton("click");
        label = new JLabel("number of clicks: 0");
        panel = new JPanel();

        button.addActionListener(this);

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Banking Application");
        frame.pack();
        frame.setVisible(true);





    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count += 1;
        label.setText(new StringBuilder().append("Number of Clicks: ").append(count).toString());
    }
}
