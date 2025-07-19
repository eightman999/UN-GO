/*
 * Copyright (c) eightman 2005-2025
 * Furin-lab All rights reserved.
 * 動作設計: 入力から英大文字を取り出し-5シフトのシーザー暗号を施して表示する。
 */

package com.company;

/**
 * 入力から英大文字のみを抜き出し、-5 シフトのシーザー暗号を施して出力する
 * コマンドラインツール。
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MINIM {
    /**
     * 標準入力を読み取り、暗号化した結果を表示する。
     */
        public static final void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("キーボードから入力してください");
        String str23 =";";
        String str = "";
        try {
            str = br.readLine();
//            System.out.println("PassWordをキーボードから入力してください");
//            str23 = br.readLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //鍵
        final int key = -5;
        //暗号対象の文字列
        String source = str;
        //アルファベット以外は消去
        byte[] tmp = source.replaceAll("[^A-Z]", "").getBytes();
        byte[] buf = new byte[tmp.length];

        for (int i = 0; i < tmp.length; i++) {
            // シフトした文字がA(65)からZ(90)の間に収まるようにする
            int num = ((tmp[i] - 65) + key + 26) % 26;
            buf[i] = (byte) (num + 65);
        }
        System.out.println(new String(buf));
    }
}