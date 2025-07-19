/*
 * Copyright (c) eightman 2005-2025
 * Furin-lab All rights reserved.
 * 動作設計: enigmanの数値コード列をテーブル参照で元の文字へ復号するクラス。
 */

package com.company.decoder;

import java.util.*;

public class EnigmanDecoder {
    private static Map<String, Character> createMap() {
        Map<String, Character> MAP = new HashMap<>();
MAP.put("900", 'å');
MAP.put("901", 'Å');
MAP.put("902", 'ß');
MAP.put("903", '∂');
MAP.put("904", 'ç');
MAP.put("905", '√');
MAP.put("906", '∫');
MAP.put("907", 'ø');
MAP.put("908", '≈');
MAP.put("909", 'Æ');
MAP.put("910", '');
MAP.put("911", 'ẛ');
MAP.put("9012", 'Ỻ');
MAP.put("913", 'ỻ');
MAP.put("914", 'Ỽ');
MAP.put("915", 'Ỿ');
MAP.put("916", '෴');
MAP.put("917", '༽');
MAP.put("918", '༼');
MAP.put("919", 'ཫ');
MAP.put("920", 'ཬ');
MAP.put("921", 'ཪ');
MAP.put("922", '༎');
MAP.put("000", '’');
MAP.put("998", '׳');
MAP.put("999", ' ');
MAP.put("997", '　');
MAP.put("001", '、');
MAP.put("002", '。');
MAP.put("003", '〃');
MAP.put("004", '〄');
MAP.put("005", '々');
MAP.put("006", '〆');
MAP.put("008", '〇');
MAP.put("009", '〈');
MAP.put("010", '〉');
MAP.put("011", '《');
MAP.put("012", '》');
MAP.put("013", '「');
MAP.put("014", '」');
MAP.put("015", '『');
MAP.put("016", '』');
MAP.put("017", '【');
MAP.put("018", '】');
MAP.put("019", '〒');
MAP.put("020", '〓');
MAP.put("021", '〔');
MAP.put("022", '〕');
MAP.put("023", '〖');
MAP.put("024", '〗');
MAP.put("025", '〘');
MAP.put("101", '!');
MAP.put("102", '"');
MAP.put("103", '#');
MAP.put("104", '$');
MAP.put("105", '%');
MAP.put("106", '&');
MAP.put("107", '\'');
MAP.put("108", '(');
MAP.put("109", ')');
MAP.put("110", '*');
MAP.put("111", '+');
MAP.put("112", ',');
MAP.put("113", '-');
MAP.put("114", '.');
MAP.put("115", '/');
MAP.put("116", '0');
MAP.put("117", '1');
MAP.put("118", '2');
MAP.put("119", '3');
MAP.put("120", '4');
MAP.put("121", '5');
MAP.put("122", '6');
MAP.put("123", '7');
MAP.put("124", '8');
MAP.put("125", '9');
MAP.put("126", ':');
MAP.put("127", ';');
MAP.put("128", '<');
MAP.put("129", '=');
MAP.put("130", '>');
MAP.put("131", '?');
MAP.put("132", '@');
MAP.put("133", 'A');
MAP.put("134", 'B');
MAP.put("135", 'C');
MAP.put("136", 'D');
MAP.put("137", 'E');
MAP.put("138", 'F');
MAP.put("139", 'G');
MAP.put("140", 'H');
MAP.put("141", 'I');
MAP.put("142", 'J');
MAP.put("143", 'K');
MAP.put("144", 'L');
MAP.put("145", 'M');
MAP.put("146", 'N');
MAP.put("147", 'O');
MAP.put("148", 'P');
MAP.put("149", 'Q');
MAP.put("150", 'R');
MAP.put("151", 'S');
MAP.put("152", 'T');
MAP.put("153", 'U');
MAP.put("154", 'V');
MAP.put("155", 'W');
MAP.put("156", 'X');
MAP.put("157", 'Y');
MAP.put("158", 'Z');
MAP.put("159", '[');
MAP.put("160", '\\');
MAP.put("161", ']');
MAP.put("162", '^');
MAP.put("163", '_');
MAP.put("164", '`');
MAP.put("165", 'a');
MAP.put("166", 'b');
MAP.put("167", 'c');
MAP.put("168", 'd');
MAP.put("169", 'e');
MAP.put("170", 'f');
MAP.put("171", 'g');
MAP.put("172", 'h');
MAP.put("173", 'i');
MAP.put("174", 'j');
MAP.put("175", 'k');
MAP.put("176", 'l');
MAP.put("177", 'm');
MAP.put("178", 'n');
MAP.put("179", 'o');
MAP.put("180", 'p');
MAP.put("181", 'q');
MAP.put("182", 'r');
MAP.put("183", 's');
MAP.put("184", 't');
MAP.put("185", 'u');
MAP.put("186", 'v');
MAP.put("187", 'w');
MAP.put("188", 'x');
MAP.put("189", 'y');
MAP.put("190", 'z');
MAP.put("191", '{');
MAP.put("192", '|');
MAP.put("193", '}');
MAP.put("194", '~');
MAP.put("195", '');
MAP.put("196", '¡');
MAP.put("197", '¢');
MAP.put("198", '£');
MAP.put("199", '¤');
MAP.put("200", '¥');
MAP.put("201", '¦');
MAP.put("202", '§');
MAP.put("203", '¨');
MAP.put("204", '©');
MAP.put("205", '°');
MAP.put("206", '±');
MAP.put("207", '²');
MAP.put("208", '³');
MAP.put("209", '´');
MAP.put("210", 'µ');
        return MAP;
    }

    private static final String[][] REPL = {
    {"«", "¢∞6£1p2036[N7"},
    {"[", "Op"},
    {"]", "pw"},
    {":", "≤m¢q#"},
    {"|", "7m"},
    {"_", "p3"},
    {"◊", "wp"},
    {"Í", "0M"},
    {"≤", "15"},
    {"≥", "56"},
    {".", "F8"},
    {",", "F2"},
    {"Ø", "F0"},
    {"Æ", "8N"},
    {"»", "Op3pwp"},
    {"œ", "O6"},
    {"∑", "Z6"},
    {"Ω", "pç"},
    {"≈", "62"},
    {"π", "63"},
    {"•", "6u"},
    {"¶", "1m"},
    {"§", "16"},
    {"∞", "wq"},
    {"¢", "q9"},
    {"£", "22"},
    {"¡", "O9"},
    {"ß", "0z"},
    {"ç", "wo"},
    {"Â", "om"},
    {"/", "qo"},
    {"-", "O7"},
    {"+", "851"},
    {"*", "604"},
    {"?", "Z7"},
    {">", "5N"},
    {"<", "N5"},
    {"¥", "m1"},
    {"µ", "0w"},
    {"$", "WO"},
    {"∆", "qm"},
    {"#", "mC"},
    {"Ó", "4p"},
    {"@", "Om"},
    {"ƒ", "q4"},
    {"!", "8O"},
    {"∂", "pO"},
    {"ç", "80m"},
    {"∫", "7o"},
    {"å", "00"},
    {"Z", "qq"},
    {"Y", "oO"},
    {"X", "8m"},
    {"W", "aa"},
    {"V", "77"},
    {"U", "66"},
    {"T", "55"},
    {"S", "qqm"},
    {"R", "pop"},
    {"Q", "qoq"},
    {"P", "qop"},
    {"9", "mM"},
    {"8", "Oo"},
    {"7", "oq"},
    {"6", "op"},
    {"5", "mm"},
    {"4", "oo"},
    {"3", "Nq"},
    {"2", "Np"},
    {"1", "Oq"},
    {"0", "Om"},
    {"I", "55"},
    {"H", "54"},
    {"G", "53"},
    {"F", "52"},
    {"E", "51"},
    {"D", "50"},
    {"C", "45"},
    {"B", "44"},
    {"A", "43"},
    {"z", "42"},
    {"y", "41"},
    {"x", "40"},
    {"w", "35"},
    {"v", "34"},
    {"u", "33"},
    {"t", "32"},
    {"s", "31"},
    {"r", "30"},
    {"q", "25"},
    {"p", "24"},
    {"o", "23"},
    {"m", "22"},
    {"n", "21"},
    {"l", "20"},
    {"k", "15"},
    {"j", "14"},
    {"i", "13"},
    {"h", "12"},
    {"g", "11"},
    {"f", "10"},
    {"e", "05"},
    {"d", "04"},
    {"c", "03"},
    {"b", "02"},
    {"a", "00"},
    {"3", "11"},
    {"2", "10"},
    {"1", "01"},
    {"0", "00"},
    {"1100", "L"},
    {"1011", "K"},
    {"1010", "J"},
    {"1001", "I"},
    {"1000", "H"},
    {"0111", "G"},
    {"0110", "F"},
    {"0101", "E"},
    {"0100", "D"},
    {"0011", "C"},
    {"0010", "B"},
    {"0001", "A"},
    {"L", "f"},
    {"K", "e"},
    {"J", "d"},
    {"I", "c"},
    {"H", "b"},
    {"G", "a"},
    {"F", "af"},
    {"E", "ae"},
    {"D", "ad"},
    {"C", "ac"},
    {"B", "ab"},
    {"A", "aa"},
    {"d", "11"},
    {"c", "10"},
    {"b", "01"},
    {"a", "00"},
    {"1001", "9"},
    {"1000", "8"},
    {"0111", "7"},
    {"0110", "6"},
    {"0101", "5"},
    {"0100", "4"},
    {"0011", "3"},
    {"0010", "2"},
    {"0001", "1"},
    {"1111", "0"},
    {"00001", "1"},
};
    private static String reverse(String input) {
        String result = input;
        for (String[] p : REPL) {
            result = result.replace(p[0], p[1]);
        }
        return result;
    }

    public static String decode(String encoded) {
        String t1 = reverse(encoded);
        StringBuilder sb = new StringBuilder();
        Map<String, Character> map = createMap();
        for (int i = 0; i < t1.length();) {
            if (t1.startsWith("9012", i)) {
                sb.append(map.get("9012"));
                i += 4;
            } else {
                if (i + 3 > t1.length()) break;
                String code = t1.substring(i, i + 3);
                Character ch = map.get(code);
                sb.append(ch != null ? ch : '?');
                i += 3;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(decode(line));
    }
}
