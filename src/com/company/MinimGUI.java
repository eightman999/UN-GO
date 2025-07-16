package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Simple GUI application that performs encryption and decryption
 * using the same Caesar shift logic as {@link MINIM}.
 */
public class MinimGUI extends JFrame {
    private final JTextArea inputArea = new JTextArea();
    private final JTextArea outputArea = new JTextArea();
    private final Map<String, String> charToCode = new HashMap<>();
    private final Map<String, String> codeToChar = new HashMap<>();
    private final List<String> codesSorted = new ArrayList<>();

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
        JButton loadButton = new JButton("Load .enigm");
        JPanel buttons = new JPanel();
        buttons.add(encButton);
        buttons.add(decButton);
        buttons.add(loadButton);
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

        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                int result = chooser.showOpenDialog(MinimGUI.this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File file = chooser.getSelectedFile();
                    try {
                        loadEnigm(file);
                        JOptionPane.showMessageDialog(MinimGUI.this,
                                "Loaded " + file.getName(),
                                "ENIGM", JOptionPane.INFORMATION_MESSAGE);
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(MinimGUI.this,
                                "Failed to load: " + ex.getMessage(),
                                "ENIGM", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
    }

    /**
     * Encrypt using a Caesar shift of -5, matching {@link MINIM}.
     */
    private String encrypt(String text) {
        if (!charToCode.isEmpty()) {
            return encryptCustom(text);
        }
        return shift(text, -5);
    }

    /**
     * Decrypt text that was encrypted with {@link #encrypt(String)}.
     */
    private String decrypt(String text) {
        if (!codeToChar.isEmpty()) {
            return decryptCustom(text);
        }
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

    private void loadEnigm(File file) throws IOException {
        charToCode.clear();
        codeToChar.clear();
        codesSorted.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.startsWith("-")) {
                    line = line.substring(1).trim();
                    String[] parts = line.split(",");
                    if (parts.length >= 2) {
                        String ch = parts[0].trim();
                        String code = parts[1].trim();
                        if (ch.length() == 1 && !code.isEmpty()) {
                            charToCode.put(ch, code);
                            codeToChar.put(code, ch);
                        }
                    }
                }
            }
        }
        codesSorted.addAll(codeToChar.keySet());
        codesSorted.sort((a, b) -> Integer.compare(b.length(), a.length()));
    }

    private String encryptCustom(String text) {
        StringBuilder sb = new StringBuilder();
        for (char ch : text.toCharArray()) {
            String code = charToCode.get(String.valueOf(ch));
            if (code == null) {
                code = charToCode.get(String.valueOf(Character.toLowerCase(ch)));
            }
            if (code == null) {
                sb.append(ch);
            } else {
                sb.append(code);
            }
        }
        return sb.toString();
    }

    private String decryptCustom(String text) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        while (idx < text.length()) {
            boolean matched = false;
            for (String code : codesSorted) {
                if (text.startsWith(code, idx)) {
                    sb.append(codeToChar.get(code));
                    idx += code.length();
                    matched = true;
                    break;
                }
            }
            if (!matched) {
                sb.append(text.charAt(idx));
                idx++;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MinimGUI().setVisible(true));
    }
}
