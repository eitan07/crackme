package com.eitan07.crackme.windows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow implements ActionListener {

    JFrame frame;
    JPanel panel;
    JButton button;
    JLabel lbl1;
    JLabel lbl2;

    public MainWindow() throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        frame = new JFrame();
        panel = new JPanel();
        lbl1 = new JLabel();
        button = new JButton();

        lbl1.setText("Try to crack the password!");
        lbl1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lbl1.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));

        button.setText("CLICK ME!!");
        button.setFocusPainted(false);
        button.setMargin(new Insets(20, 0, 0, 0));
        button.addActionListener(this);


        panel.add(lbl1);
        panel.add(button);

        frame.add(panel);
        frame.setTitle("CRACKME");
        frame.setResizable(false);
        frame.setSize(300, 500);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.exit(0);
        }
    }
}
