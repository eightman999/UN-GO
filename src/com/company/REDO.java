/*
 * Copyright (c) eightman 2005-2025
 * Furin-lab All rights reserved.
 * 動作設計: 3桁数値列をswitch文の表に基づき元の文字へ復号するツール。
 */

package com.company;

/**
 * 標準入力から暗号化済み文字列を受け取り、3桁コードを元の文字に戻す
 * 簡易デコーダ。
 */

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class REDO {
    /**
     * コンソールから利用するインタラクティブなエントリーポイント。
     */
        public static final void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("キーボードから入力してください");
        String str = "";
        try {
            str = br.readLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String t1 = str;
        {
            System.out.println("入力された文字は「" + str + "」です");


        }
        String t2 = "";
        String sbyte = t1;
        String str2 = new String(sbyte);

        System.out.println("str : " + str2);
        int man = -1;
        for (int i = 0; i < str.length(); i++) {
            String name = "";


            for (int s = 0; s <  3;s++) {
                man = man + 1;
                System.out.println((s) + "番目：" + t1.charAt(man));
                name = name + ((t1.charAt(man)));
                System.out.println(name + "mama");


            }
            t1 = t1.replace(".","Ωx");
            t1 = t1.replace("@","E£");
            t1 = t1.replace("*","EX");
            t1 = t1.replace("∆","A4");
            t1 = t1.replace("µ","Aw");
            t1 = t1.replace("ƒ","mG");
            System.out.println(man + "sa" +
                    "");
            System.out.println(name +"name");
            switch (name) {
                case "999":
                    t2 = t2 + " ";
                    break;
                case "101":
                    t2 = t2 + "!";
                    break;
                case "102":
                    t2 = t2 + "\"";
                    break;
                case "103":
                    t2 = t2 + "#";
                    break;
                case "104":
                    t2 = t2 + "$";
                    break;
                case "105":
                    t2 = t2 + "%";
                    break;
                case "106":
                    t2 = t2 + "&";
                    break;
                case "107":
                    t2 = t2 + "'";
                    break;
                case "108":
                    t2 = t2 + "(";
                    break;
                case "109":
                    t2 = t2 + ")";
                    break;
                case "110":
                    t2 = t2 + "*";
                    break;
                case "111":
                    t2 = t2 + "+";
                    break;
                case "112":
                    t2 = t2 + ",";
                    break;
                case "113":
                    t2 = t2 + "-";
                    break;
                case "114":
                    t2 = t2 + ".";
                    break;
                case "115":
                    t2 = t2 + "/";
                case "116":
                    t2 = t2 + "0";
                    break;
                case "117":
                    t2 = t2 + "1";
                    break;
                case "118":
                    t2 = t2 + "2";
                    break;
                case "119":
                    t2 = t2 + "3";
                    break;
                case "120":
                    t2 = t2 + "4";
                    break;
                case "121":
                    t2 = t2 + "5";
                    break;
                case "122":
                    t2 = t2 + "6";
                    break;
                case "123":
                    t2 = t2 + "7";
                    break;
                case "124":
                    t2 = t2 + "8";
                    break;
                case "125":
                    t2 = t2 + "9";
                    break;
                case "126":
                    t2 = t2 + ":";
                    break;
                case "127":
                    t2 = t2 + ";";
                    break;
                case "128":
                    t2 = t2 + "<";
                    break;
                case "129":
                    t2 = t2 + "=";
                    break;
                case "130":
                    t2 = t2 + ">";
                    break;
                case "131":
                    t2 = t2 + "?";
                    break;
                case "132":
                    t2 = t2 + "@";
                    break;
                case "133":
                    t2 = t2 + "A";
                    break;
                case "134":
                    t2 = t2 + "B";
                    break;
                case "135":
                    t2 = t2 + "C";
                    break;
                case "136":
                    t2 = t2 + "D";
                    break;
                case "137":
                    t2 = t2 + "E";
                    break;
                case "138":
                    t2 = t2 + "F";
                    break;
                case "139":
                    t2 = t2 + "G";
                    break;
                case "140":
                    t2 = t2 + "H";
                    break;
                case "141":
                    t2 = t2 + "I";
                    break;
                case "142":
                    t2 = t2 + "J";
                    break;
                case "143":
                    t2 = t2 + "K";
                    break;
                case "144":
                    t2 = t2 + "L";
                    break;
                case "145":
                    t2 = t2 + "M";
                    break;
                case "146":
                    t2 = t2 + "N";
                    break;
                case "147":
                    t2 = t2 + "O";
                    break;
                case "148":
                    t2 = t2 + "P";
                    break;
                case "149":
                    t2 = t2 + "Q";
                    break;
                case "150":
                    t2 = t2 + "R";
                    break;
                case "151":
                    t2 = t2 + "S";
                    break;
                case "152":
                    t2 = t2 + "T";
                    break;
                case "153":
                    t2 = t2 + "U";
                    break;
                case "154":
                    t2 = t2 + "V";
                    break;
                case "155":
                    t2 = t2 + "W";
                    break;
                case "156":
                    t2 = t2 + "X";
                    break;
                case "157":
                    t2 = t2 + "Y";
                    break;
                case "158":
                    t2 = t2 + "Z";
                    break;
                case "159":
                    t2 = t2 + "[";
                    break;
                case "160":
                    t2 = t2 + "\\";
                    break;
                case "161":
                    t2 = t2 + "]";
                    break;
                case "162":
                    t2 = t2 + "^";
                    break;
                case "163":
                    t2 = t2 + "_";
                    break;
                case "164":
                    t2 = t2 + "`";
                    break;
                case "165":
                    t2 = t2 + "a";
                    break;
                case "166":
                    t2 = t2 + "b";
                    break;
                case "167":
                    t2 = t2 + "c";
                    break;
                case "168":
                    t2 = t2 + "d";
                    break;
                case "169":
                    t2 = t2 + "e";
                    break;
                case "170":
                    t2 = t2 +"f";
                    break;
                case "171":
                    t2 = t2 +"g";
                    break;
                case "172":
                    t2= t2 + "h";
                    break;
                case"173":
                    t2 = t2 +"i";
                    break;
                case "174":
                    t2 = t2 + "j";
                    break;
                case "175":
                    t2 = t2 +"k";
                    break;
                case "176":
                    t2 = t2 + "l";
                    break;
                case "177":
                    t2 = t2 + "m";
                    break;
                case "178":
                    t2 = t2 + "n";
                    break;
                case "179":
                    t2 = t2 + "o";
                    break;
                case "180":
                    t2 = t2 +"p";
                    break;
                case "181":
                    t2 = t2 +"q";
                    break;
                case "182":
                    t2= t2 + "r";
                    break;
                case"183":
                    t2 = t2 +"s";
                    break;
                case "184":
                    t2 = t2 + "t";
                    break;
                case "185":
                    t2 = t2 +"u";
                    break;
                case "186":
                    t2 = t2 + "v";
                    break;
                case "187":
                    t2 = t2 + "w";
                    break;
                case "188":
                    t2 = t2 + "x";
                    break;
                case "189":
                    t2 = t2 + "y";
                    break;
                case "190":
                    t2 = t2 +"z";
                    break;
                case "191":
                    t2 = t2 +"{";
                    break;
                case "192":
                    t2= t2 + "|";
                    break;
                case"193":
                    t2 = t2 +"}";
                    break;
                case "194":
                    t2 = t2 + "~";
                    break;
                case "195":
                    t2 = t2 +"¥/DEL¥/";
                    break;
                case "196":
                    t2 = t2 + "l";
                    break;
                case "197":
                    t2 = t2 + "m";
                    break;
                case"306":
                    t2 = t2 + "¥";
                    break;
                //鍵
//        final int key = -10;
                //暗号対象の文字列


            }
            System.out.println(t2);
        }
    }
//    class admin{
//    booleans
//    }
}