/*
 * Copyright (c) eightman 2005-2025
 * Furin-lab All rights reserved.
 * 動作設計: 入力文字列のSHA-256ハッシュを基に2バイトずつUnicode文字へ変換するエンコーダ。
 */

package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class mojigm {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter text to encode:");
        try {
            String input = br.readLine();
            br.close();
            String encoded = encodeToUnicodeGarbled(input);
            System.out.println(encoded);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String encodeToUnicodeGarbled(String input) {
        byte[] hash = hashBytes(input.getBytes());
        if (hash == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < hash.length; i += 2) {
            int high = hash[i] & 0xFF;
            int low = 0;
            if (i + 1 < hash.length) {
                low = hash[i + 1] & 0xFF;
            }
            int codePoint = (high << 8) | low;
            sb.append((char) codePoint);
        }
        return sb.toString();
    }

    private static byte[] hashBytes(byte[] data) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            return digest.digest(data);
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }
}
