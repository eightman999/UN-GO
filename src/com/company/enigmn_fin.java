/*
 * Copyright (c) eightman 2005-2025
 * Furin-lab All rights reserved.
 * 動作設計: MINIM・enigman・enigman2の処理を順に適用する統合暗号化クラス。
 */

package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Simple combination of the encryption steps found in
 * {@link enigman}, {@link enigman2}, {@link Main} and {@link MINIM}.
 * This class is not a drop in replacement for each of those classes but
 * rather demonstrates how their approaches can be chained together.
 */
public class enigmn_fin {

    /**
     * Apply a Caesar style shift similar to {@link MINIM}.
     */
    private static String applyMinim(String input) {
        StringBuilder sb = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                int num = ((ch - 'A') - 5 + 26) % 26;
                sb.append((char) ('A' + num));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    /**
     * Perform a small subset of the replacements that appear in
     * {@link enigman}.
     */
    private static String applyEnigman(String input) {
        return input
                .replace("google.com", "Æ")
                .replace("http://", "å")
                .replace("https://", "Å")
                .replace("who is", "ß")
                .replace("you", "∂")
                .replace(".com", "ç")
                .replace(".jp", "∫")
                .replace(".net", "√")
                .replace("This is", "ø")
                .replace("don't", "≈");
    }

    /**
     * Additional replacements extracted from {@link enigman2}.
     */
    private static String applyEnigman2(String input) {
        return input
                .replace(" use to ", "Ԉ")
                .replace(" uses to ", "ԉ")
                .replace(" any of", "Ԋ");
    }

    /**
     * Convert characters to numeric codes similar to the mapping in
     * {@link Main}. For simplicity this implementation just outputs the
     * UTF-16 code point separated by spaces.
     */
    private static String applyMain(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (i > 0) {
                sb.append(' ');
            }
            sb.append((int) input.charAt(i));
        }
        return sb.toString();
    }

    /**
     * Apply all encryption steps in order.
     */
    public static String encrypt(String input) {
        String step1 = applyMinim(input);
        String step2 = applyEnigman(step1);
        String step3 = applyEnigman2(step2);
        return applyMain(step3);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter text to encrypt:");
        String input = br.readLine();
        String result = encrypt(input);
        System.out.println("Encrypted:");
        System.out.println(result);
    }
}
