package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Simple GUI application that performs encryption and decryption
 * using the same Caesar shift logic as {@link MINIM}.
 */
public class MinimGUI extends JFrame {
    private final JTextArea inputArea = new JTextArea();
    private final JTextArea outputArea = new JTextArea();

    public MinimGUI() {
        super("MINIM Encrypt/Decrypt");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLayout(new BorderLayout());

        JPanel center = new JPanel(new GridLayout(2, 1));
        center.add(new JScrollPane(inputArea));
        center.add(new JScrollPane(outputArea));
        outputArea.setEditable(false);
        add(center, BorderLayout.CENTER);

        JButton encButton = new JButton("Encrypt");
        JButton decButton = new JButton("Decrypt");
        JPanel buttons = new JPanel();
        buttons.add(encButton);
        buttons.add(decButton);
        add(buttons, BorderLayout.SOUTH);

        encButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputArea.setText(encrypt(inputArea.getText()));
            }
        });
        decButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputArea.setText(decrypt(inputArea.getText()));
            }
        });
    }

    /**
     * Encrypt using a Caesar shift of -5, matching {@link MINIM}.
     */
    private String encrypt(String text) {
        return shift(text, -5);
    }

    /**
     * Decrypt text that was encrypted with {@link #encrypt(String)}.
     */
    private String decrypt(String text) {
        return shift(text, 5);
    }

    private String shift(String text, int key) {
        String source = text.replaceAll("[^A-Za-z]", "").toUpperCase();
        char[] buf = new char[source.length()];
        for (int i = 0; i < source.length(); i++) {
            char ch = source.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                int num = ((ch - 'A') + key + 26) % 26;
                buf[i] = (char)('A' + num);
            } else {
                buf[i] = ch;
            }
        }
        return new String(buf);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MinimGUI().setVisible(true));
    }
}
