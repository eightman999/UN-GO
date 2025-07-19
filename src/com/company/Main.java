/*
 * Copyright (c) eightman 2005-2025
 * Furin-lab All rights reserved.
 * 動作設計: 入力文字を3桁の数値コードへ変換し、結果をファイルにも保存するエンコーダ。
 */

package com.company;
import java.io.*;
import java.util.Random;
import java.util.UUID;
/**
 * 非常に冗長な文字→数値変換処理を実行するエントリーポイントクラス。
 * 生成された数値列はユーザーが入力したパスワードと共にファイルへ保存される。
 */
public class Main {
    /**
     * メイン処理。ユーザー入力を読み取り、巨大な switch 文で各文字を 3 桁コードへ
     * 変換し、様々な置換を行った後に結果を保存する。
     */
    public static final void main(String[] args) {
        // コンソール入力用のリーダーを準備
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("キーボードから入力してください");

        // パスワードと平文の入力を受け付ける
        String str23 =";";
        String str = "";
        try {
            str = br.readLine();
            System.out.println("PassWordをキーボードから入力してください");
            str23 = br.readLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("入力された文字は「" + str + "」です");
        // 暗号対象の文字列を溜めるバッファ
        String t1 = "";

        // 入力文字列を1文字ずつ走査し、対応する3桁コードへ変換
        char[] c = str.toCharArray();
        for (char c1 : c) {
            // このswitchはASCIIと一部のUnicode文字をハードコードで変換する
            switch (c1) {
                case 0x0020:
                    t1 = t1 + "999";
                    break;
                case 0x0021:
                    t1 = t1 + "101";
                    break;
                case 0x0022:
                    t1 = t1 + "102";
                    break;
                case 0x0023:
                    t1 = t1 + "103";
                    break;
                case 0x0024:
                    t1 = t1 + "104";
                    break;
                case 0x0025:
                    t1 = t1 + "105";
                    break;
                case 0x0026:
                    t1 = t1 + "106";
                    break;
                case 0x0027:
                    t1 = t1 + "107";
                    break;
                case 0x0028:
                    t1 = t1 + "108";
                    break;
                case 0x0029:
                    t1 = t1 + "109";
                    break;
                case 0x002A:
                    t1 = t1 + "110";
                    break;
                case 0x002B:
                    t1 = t1 + "111";
                    break;
                case 0x002C:
                    t1 = t1 + "112";
                    break;
                case 0x002D:
                    t1 = t1 + "113";
                    break;
                case 0x002E:
                    t1 = t1 + "114";
                    break;
                case 0x002F:
                    t1 = t1 + "115";
                    break;
                case 0x0030:
                    t1 = t1 + "116";
                    break;
                case 0x0031:
                    t1 = t1 + "117";
                    break;
                case 0x0032:
                    t1 = t1 + "118";
                    break;
                case 0x0033:
                    t1 = t1 + "119";
                    break;
                case 0x0034:
                    t1 = t1 + "120";
                    break;
                case 0x0035:
                    t1 = t1 + "121";
                    break;
                case 0x0036:
                    t1 = t1 + "122";
                    break;
                case 0x0037:
                    t1 = t1 + "123";
                    break;
                case 0x0038:
                    t1 = t1 + "124";
                    break;
                case 0x0039:
                    t1 = t1 + "125";
                    break;
                case 0x003A:
                    t1 = t1 + "126";
                    break;
                case 0x003B:
                    t1 = t1 + "127";
                    break;
                case 0x003C:
                    t1 = t1 + "128";
                    break;
                case 0x003D:
                    t1 = t1 + "129";
                    break;
                case 0x003E:
                    t1 = t1 + "130";
                    break;
                case 0x003F:
                    t1 = t1 + "131";
                    break;
                case 0x0040:
                    t1 = t1 + "132";
                    break;
                case 0x0041:
                    t1 = t1 + "133";
                    break;
                case 0x0042:
                    t1 = t1 + "134";
                    break;
                case 0x0043:
                    t1 = t1 + "135";
                    break;
                case 0x0044:
                    t1 = t1 + "136";
                    break;

                case 0x0045:
                    t1 = t1 + "137";
                    break;
                case 0x0046:
                    t1 = t1 + "138";
                    break;
                case 0x0047:
                    t1 = t1 + "139";
                    break;
                case 0x0048:
                    t1 = t1 + "140";
                    break;
                case 0x0049:
                    t1 = t1 + "141";
                    break;
                case 0x004A:
                    t1 = t1 + "142";
                    break;
                case 0x004B:
                    t1 = t1 + "143";
                    break;
                case 0x004C:
                    t1 = t1 + "144";
                    break;
                case 0x004D:
                    t1 = t1 + "145";
                    break;
                case 0x004E:
                    t1 = t1 + "146";
                    break;
                case 0x004F:
                    t1 = t1 + "147";
                    break;
                case 0x0050:
                    t1 = t1 + "148";
                    break;
                case 0x0051:
                    t1 = t1 + "149";
                    break;
                case 0x0052:
                    t1 = t1 + "150";
                    break;
                case 0x0053:
                    t1 = t1 + "151";
                    break;
                case 0x0054:
                    t1 = t1 + "152";
                    break;
                case 0x0055:
                    t1 = t1 + "153";
                    break;
                case 0x0056:
                    t1 = t1 + "154";
                    break;
                case 0x0057:
                    t1 = t1 + "155";
                    break;
                case 0x0058:
                    t1 = t1 + "156";
                    break;
                case 0x0059:
                    t1 = t1 + "157";
                    break;
                case 0x005A:
                    t1 = t1 + "158";
                    break;
                case 0x005B:
                    t1 = t1 + "159";
                    break;
                case 0x005C:
                    t1 = t1 + "160";
                    break;
                case 0x005D:
                    t1 = t1 + "161";
                    break;
                case 0x005E:
                    t1 = t1 + "162";
                    break;
                case 0x005F:
                    t1 = t1 + "163";
                    break;
                case 0x0060:
                    t1 = t1 + "164";
                    break;
                case 0x0061:
                    t1 = t1 + "165";
                    break;
                case 0x0062:
                    t1 = t1 + "166";
                    break;
                case 0x0063:
                    t1 = t1 + "167";
                    break;
                case 0x0064:
                    t1 = t1 + "168";
                    break;
                case 0x0065:
                    t1 = t1 + "169";
                    break;
                case 0x0066:
                    t1 = t1 + "170";
                    break;
                case 0x0067:
                    t1 = t1 + "171";
                    break;
                case 0x0068:
                    t1 = t1 + "172";
                    break;
                case 0x0069:
                    t1 = t1 + "173";
                    break;
                case 0x006A:
                    t1 = t1 + "174";
                    break;
                case 0x006B:
                    t1 = t1 + "175";
                    break;
                case 0x006C:
                    t1 = t1 + "176";
                    break;
                case 0x006D:
                    t1 = t1 + "177";
                    break;
                case 0x006E:
                    t1 = t1 + "178";
                    break;
                case 0x006F:
                    t1 = t1 + "179";
                    break;
                case 0x0070:
                    t1 = t1 + "180";
                    break;
                case 0x0071:
                    t1 = t1 + "181";
                    break;
                case 0x0072:
                    t1 = t1 + "182";
                    break;
                case 0x0073:
                    t1 = t1 + "183";
                    break;
                case 0x0074:
                    t1 = t1 + "184";
                    break;
                case 0x0075:
                    t1 = t1 + "185";
                    break;
                case 0x0076:
                    t1 = t1 + "186";
                    break;
                case 0x0077:
                    t1 = t1 + "187";
                    break;
                case 0x0078:
                    t1 = t1 + "188";
                    break;
                case 0x0079:
                    t1 = t1 + "189";
                    break;
                case 0x007A:
                    t1 = t1 + "190";
                    break;
                case 0x007B:
                    t1 = t1 + "191";
                    break;
                case 0x007C:
                    t1 = t1 + "192";
                    break;
                case 0x007D:
                    t1 = t1 + "193";
                    break;
                case 0x007E:
                    t1 = t1 + "194";
                    break;
                case 0x007F:
                    t1 = t1 + "195";
                    break;
                case 0x3000:
                    t1 = t1 + "30a";
                    break;
                case 0x3001:
                    t1 = t1 + "300";
                    break;
                case 0x3002:
                    t1 = t1 + "301";
                    break;
                case 0x3003:
                    t1 = t1 + "302";
                    break;
                case 0x3004:
                    t1 = t1 + "303";
                    break;
                case 0x3005:
                    t1 = t1 + "304";
                    break;
                case 0x3006:
                    t1 = t1 + "305";
                    break;
                case '¥':
                    t1 = t1 + "306";
                    break;
                case '〈':
                    t1 = t1 + "307";
                    break;
                case '〉':
                    t1 = t1 + "308";
                    break;
                case '《':
                    t1 = t1 + "309";
                    break;
                case '》':
                    t1 = t1 + "310";
                    break;
                case '「':
                    t1 = t1 + "311";
                    break;
                case '」':
                    t1 = t1 + "312";
                    break;
                case '『':
                    t1 = t1 + "313";
                    break;
                default:
                    t1 = t1 + "X";
            }
            System.out.println(t1);

        }


        // 変換後の数値列を保持しておく
        String t3 = t1;

        // 以降の複雑な置換に用いる作業用変数
        String t2 = t1;

        // 数値コードを文字や記号へ置き換える
        t2 = t2.replace("29","a");System.out.println(t2);
            t2 = t2.replace("17", "b");System.out.println(t2);
            t2 = t2.replace("00", "c");System.out.println(t2);
            t2 = t2.replace("11", "d");System.out.println(t2);
            t2 = t2.replace("12", "e");System.out.println(t2);
            t2 = t2.replace("131", "f");System.out.println(t2);
            t2 = t2.replace("14", "g");System.out.println(t2);
            t2 = t2.replace("15", "h");System.out.println(t2);
            t2 = t2.replace("16", "i");System.out.println(t2);
            t2 = t2.replace("17", "j");System.out.println(t2);
            t2 = t2.replace("18", "k");System.out.println(t2);
            t2 = t2.replace("41", "l");System.out.println(t2);
            t2 = t2.replace("91", "n");System.out.println(t2);
            t2 = t2.replace("99","m");System.out.println(t2);
            t2 = t2.replace("0", "o");System.out.println(t2);
            t2 = t2.replace("1", "p");System.out.println(t2);
            t2 = t2.replace("2", "q");System.out.println(t2);
            t2 = t2.replace("3", "r");System.out.println(t2);
            t2 = t2.replace("4", "s");System.out.println(t2);
            t2 = t2.replace("5", "t");System.out.println(t2);
            t2 = t2.replace("6", "u");System.out.println(t2);
            t2 = t2.replace("7", "v");System.out.println(t2);
            t2 = t2.replace("8", "w");System.out.println(t2);
            t2 = t2.replace("9", "x");System.out.println(t2);
            t2 = t2.replace("papapa","y");System.out.println(t2);
            t2 = t2.replace("mmmm","0");System.out.println(t2);
            t2 = t2.replace("0m","1");System.out.println(t2);
            t2 = t2.replace("mm","2");System.out.println(t2);
            t2 = t2.replace("qb","3");System.out.println(t2);
            t2 = t2.replace("wm","4");System.out.println(t2);
            t2 = t2.replace("pa","5");System.out.println(t2);
            t2 = t2.replace("kr","6");System.out.println(t2);
            t2 = t2.replace("bu","7");System.out.println(t2);
            t2 = t2.replace("yy","8");System.out.println(t2);
            t2 = t2.replace("bwd","9");System.out.println(t2);
            t2 = t2.replace("xb","A");System.out.println(t2);
            t2 = t2.replace("bw","B");System.out.println(t2);
            t2 = t2.replace("xi","C");System.out.println(t2);
            t2 = t2.replace("mb","D");System.out.println(t2);
            t2 = t2.replace("xk","E");System.out.println(t2);
            t2 = t2.replace("sm","F");System.out.println(t2);
            t2 = t2.replace("Ct","G");System.out.println(t2);
            t2 = t2.replace("rk","H");System.out.println(t2);
            t2 = t2.replace("du","I");System.out.println(t2);
            t2 = t2.replace("es","J");System.out.println(t2);
            t2 = t2.replace("Ar","K");System.out.println(t2);
            t2 = t2.replace("AA","L");System.out.println(t2);
            t2 = t2.replace("no","N");System.out.println(t2);
            t2 = t2.replace("wi","M");System.out.println(t2);
            t2 = t2.replace("6b","O");System.out.println(t2);
            t2 = t2.replace("it","P");System.out.println(t2);
            t2 = t2.replace("am","Q");System.out.println(t2);
            t2 = t2.replace("qi","R");System.out.println(t2);
            t2 = t2.replace("mx","S");System.out.println(t2);
            t2 = t2.replace("6m","T");System.out.println(t2);
            t2 = t2.replace("tk","U");System.out.println(t2);
            t2 = t2.replace("Av","V");System.out.println(t2);
            t2 = t2.replace("pr","W");System.out.println(t2);
            t2 = t2.replace("sb","X");System.out.println(t2);
            t2 = t2.replace("Pk","Y");System.out.println(t2);
            t2 = t2.replace("ks","Z");System.out.println(t2);
            t2 = t2.replace("Pi","œ");System.out.println(t2);
            t2 = t2.replace("uW","∑");System.out.println(t2);
            t2 = t2.replace("Ev","å");System.out.println(t2);
            t2 = t2.replace("ri","ß");System.out.println(t2);
            t2 = t2.replace("iv","∂");System.out.println(t2);
            t2 = t2.replace("kR","Ω");System.out.println(t2);
            t2 = t2.replace("Lo","≈");System.out.println(t2);
            t2 = t2.replace("xd","ç");System.out.println(t2);
            t2 = t2.replace("XR","£");System.out.println(t2);
            t2 = t2.replace("Eo","¢");System.out.println(t2);
            t2 = t2.replace("ER","$");System.out.println(t2);
            t2 = t2.replace("er","#");System.out.println(t2);
            t2 = t2.replace("xg","§");System.out.println(t2);
            t2 = t2.replace("mG","ƒ");System.out.println(t2);
            t2 = t2.replace("Aw","µ");System.out.println(t2);
            t2 = t2.replace("A4","∆");System.out.println(t2);
            t2 = t2.replace("EX","*");System.out.println(t2);
            t2 = t2.replace("E£","@");System.out.println(t2);
            t2 = t2.replace("Ωx",".");System.out.println(t2);


        // 複雑な置換後の最終的な文字列
        System.out.println(t2);

        // 最後に空白を ~ に置換
        t2 = t2.replace(" ","~");
        System.out.println(t2);
        int qx = t2.length();
        int fx = str.length();
        float px = 0;
             px = (qx/fx) * 100;
        System.out.println(t2);
        // ユーザーのホームディレクトリを表示し、ユニークなファイル名を生成
        System.out.println(System.getProperty("user.home"));
        UUID uuid = UUID.randomUUID();
        String str2 = uuid.toString();
        System.out.println(str2);
        Random random = new Random();
        System.out.println(str.length());

        System.out.println(t2.length());

        // 簡易的な圧縮率を表示
        System.out.println(px + "%" + qx/fx);
        int randomValue = random.nextInt(99);
        String t4 = "pass==>" + str23 +
                "     t2 == " + t2;
        try {
            System.out.println("PassWordをキーボードから入力してください");

            // 変換結果をデスクトップ上のユニークなファイルに保存
            FileOutputStream fos = new FileOutputStream(System.getProperty("user.home") + "/Desktop/" + str2 + ".exe" +
                    "");
            OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
            osw.write( t4 );
            osw.close();
            fos.close();

        } catch (IOException e) {
            System.out.println(e);
        }
        // コンソールに情報を表示
        System.out.println(t1);
        System.out.println("暗号は" + t2);
        System.out.println(t3);
    }
}