package com.company;
import java.io.*;
import java.util.Random;
import java.util.UUID;
public class enigman {
    public static final void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("キーボードから入力してください");
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
        //鍵
//      final int key = -10;
        //暗号対象の文字列
        str = str.replace("google.com", "Æ");
        str = str.replace("http://", "å");
        str = str.replace("https://", "Å");
        str = str.replace("who is", "ß");
        str = str.replace("you", "∂");
        str = str.replace(".com", "ç");
        str = str.replace(".jp", "∫");
        str = str.replace(".net", "√");
        str = str.replace("This is", "ø");
        str = str.replace("don't", "≈");
        str = str.replace("I am ", "");

        str = str.replace("is a", "ẛ");
        str = str.replace("is an", "Ỻ");
        str = str.replace("en", "ỻ");
        str = str.replace("difficult", "Ỽ");
        str = str.replace("time", "Ỿ");
        str = str.replace("when ", "෴");
        str = str.replace("What ", "༽");
        str = str.replace("That ", "༼");
        str = str.replace("He ", "ཫ");
        str = str.replace("She ", "ཬ");
        str = str.replace("the", "ཪ");
        str = str.replace("be", "༎");
        System.out.println(str);
        String t1 = "";
        char[] c = str.toCharArray();
        for (char c1 : c) {
            switch (c1) {

        //-----------Sp----------------
                case 'å':
                    t1 = t1 + "900";
                    break;
                case 'Å':
                    t1 = t1 + "901";
                    break;
                case 'ß':
                    t1 = t1 + "902";
                    break;
                case '∂':
                    t1 = t1 + "903";
                    break;
                case 'ç':
                    t1 = t1 + "904";
                    break;
                case '√':
                    t1 = t1 + "905";
                    break;
                case '∫':
                    t1 = t1 + "906";
                    break;
                case 'ø':
                    t1 = t1 + "907";
                    break;
                case '≈':
                    t1 = t1 + "908";
                    break;
                case 'Æ':
                    t1 = t1 + "909";
                    break;
                case '':
                    t1 = t1 + "910";
                    break;
                case 'ẛ':
                    t1 = t1 + "911";
                    break;
                case 'Ỻ':
                    t1 = t1 + "9012";
                    break;
                case 'ỻ':
                    t1 = t1 + "913";
                    break;
                case 'Ỽ':
                    t1 = t1 + "914";
                    break;
                case 'Ỿ':
                    t1 = t1 + "915";
                    break;
                case '෴':
                    t1 = t1 + "916";
                    break;
                case '༽':
                    t1 = t1 + "917";
                    break;
                case '༼':
                    t1 = t1 + "918";
                    break;
                case 'ཫ':
                    t1 = t1 + "919";
                    break;
                case 'ཬ':
                    t1 = t1 + "920";
                    break;
                case 'ཪ':
                    t1 = t1 + "921";
                    break;
                case '༎':
                    t1 = t1 + "922";
                    break;
                case 0x05F3:
                    t1 = t1 + "998";
                    break;
                case 0x0020:
                    t1 = t1 + "999";
                    break;
                case '’':
                    t1 = t1 + "000";
                    break;
                case 0x3000:
                    t1 = t1 + "997";
                    break;
        //------------------JP---------------

                case 0x3001:
                    t1 = t1 + "001";
                    break;
                case 0x3002:
                    t1 = t1 + "002";
                    break;
                case 0x3003:
                    t1 = t1 + "003";
                    break;
                case 0x3004:
                    t1 = t1 + "004";
                    break;
                case 0x3005:
                    t1 = t1 + "005";
                    break;
                case 0x3006:
                    t1 = t1 + "006";
                    break;
                case 0x3007:
                    t1 = t1 + "008";
                    break;
                case 0x3008:
                    t1 = t1 + "009";
                    break;
                case 0x3009:
                    t1 = t1 + "010";
                    break;
                case 0x300A:
                    t1 = t1 + "011";
                    break;
                case 0x300B:
                    t1 = t1 + "012";
                    break;
                case 0x300C:
                    t1 = t1 + "013";
                    break;
                case 0x300D:
                    t1 = t1 + "014";
                    break;
                case 0x300E:
                    t1 = t1 + "015";
                    break;
                case 0x300F:
                    t1 = t1 + "016";
                    break;
                case 0x3010:
                    t1 = t1 + "017";
                    break;
                case 0x3011:
                    t1 = t1 + "018";
                    break;
                case 0x3012:
                    t1 = t1 + "019";
                    break;
                case 0x3013:
                    t1 = t1 + "020";
                    break;
                case 0x3014:
                    t1 = t1 + "021";
                    break;
                case 0x3015:
                    t1 = t1 + "022";
                    break;
                case 0x3016:
                    t1 = t1 + "023";
                    break;
                case 0x3017:
                    t1 = t1 + "024";
                    break;
                case 0x3018:
                    t1 = t1 + "025";
                    break;
        //----------------------------------
        //------------------Eng------------
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
                case 0x00A1:
                    t1 = t1 + "196";
                    break;
                case 0x00A2:
                    t1 = t1 + "197";
                    break;
                case 0x00A3:
                    t1 = t1 + "198";
                    break;
                case 0x00A4:
                    t1 = t1 + "199";
                    break;
                case 0x00A5:
                    t1 = t1 + "200";
                    break;
                case 0x00A6:
                    t1 = t1 + "201";
                    break;
                case 0x00A7:
                    t1 = t1 + "202";
                    break;
                case 0x00A8:
                    t1 = t1 + "203";
                    break;
                case 0x00A9:
                    t1 = t1 + "204";
                    break;
                case 0x00B0:
                    t1 = t1 + "205";
                    break;
                case 0x00B1:
                    t1 = t1 + "206";
                    break;
                case 0x00B2:
                    t1 = t1 + "207";
                    break;
                case 0x00B3:
                    t1 = t1 + "208";
                    break;
                case 0x00B4:
                    t1 = t1 + "209";
                    break;
                case 0x00B5:
                    t1 = t1 + "210";
                    break;


                default:
                    t1 = t1 + "{!}";
            }
            System.out.println(t1);

        }


        String t3 = t1;
        String t2= t1;
//            t2 = t2.replace("1","00001");
        System.out.println(t2);
            t2 = t2.replace("0","1111");
            t2 = t2.replace("1","0001");
            t2 = t2.replace("2","0010");
            t2 = t2.replace("3","0011");
            t2 = t2.replace("4","0100");
            t2 = t2.replace("5","0101");
            t2 = t2.replace("6","0110");
            t2 = t2.replace("7","0111");
            t2 = t2.replace("8","1000");
            t2 = t2.replace("9","1001");

        System.out.println(t2);
            t2 = t2.replace("00","a");
            t2 = t2.replace("01","b");
            t2 = t2.replace("10","c");
            t2 = t2.replace("11","d");
            t2 = t2.replace("0", "e");
            t2 = t2.replace("1", "f");

        System.out.println(t2);

            t2 = t2.replace("aa","A");
            t2 = t2.replace("ab","B");
            t2 = t2.replace("ac","C");
            t2 = t2.replace("ad","D");
            t2 = t2.replace("ae","E");
            t2 = t2.replace("af","F");

            t2 = t2.replace("a","G");
            t2 = t2.replace("b","H");
            t2 = t2.replace("c","I");
            t2 = t2.replace("d","J");
            t2 = t2.replace("e","K");
            t2 = t2.replace("f","L");


        System.out.println(t2);
            t2 = t2.replace("A","0001");
            t2 = t2.replace("B","0010");
            t2 = t2.replace("C","0011");
            t2 = t2.replace("D","0100");
            t2 = t2.replace("E","0101");
            t2 = t2.replace("F","0110");

            t2 = t2.replace("G","0111");
            t2 = t2.replace("H","1000");
            t2 = t2.replace("I","1001");
            t2 = t2.replace("J","1010");
            t2 = t2.replace("K","1011");
            t2 = t2.replace("L","1100");

        System.out.println(t2);
            t2 = t2.replace("00","0");
            t2 = t2.replace("01","1");
            t2 = t2.replace("10","2");
            t2 = t2.replace("11","3");
            t2 = t2.replace("0", "4");
            t2 = t2.replace("1", "5");

        System.out.println(t2);
            t2 = t2.replace("00","a");
            t2 = t2.replace("02","b");
            t2 = t2.replace("03","c");
            t2 = t2.replace("04","d");
            t2 = t2.replace("05","e");
            t2 = t2.replace("10","f");
            t2 = t2.replace("11","g");
            t2 = t2.replace("12","h");
            t2 = t2.replace("13","i");
            t2 = t2.replace("14","j");
            t2 = t2.replace("15","k");
            t2 = t2.replace("20","l");
            t2 = t2.replace("21","n");
            t2 = t2.replace("22","m");
            t2 = t2.replace("23","o");
            t2 = t2.replace("24","p");
            t2 = t2.replace("25","q");
            t2 = t2.replace("30","r");
            t2 = t2.replace("31","s");
            t2 = t2.replace("32","t");
            t2 = t2.replace("33","u");
            t2 = t2.replace("34","v");
            t2 = t2.replace("35","w");
            t2 = t2.replace("40","x");
            t2 = t2.replace("41","y");
            t2 = t2.replace("42","z");
            t2 = t2.replace("43","A");
            t2 = t2.replace("44","B");
            t2 = t2.replace("45","C");
            t2 = t2.replace("50","D");
            t2 = t2.replace("51","E");
            t2 = t2.replace("52","F");
            t2 = t2.replace("53","G");
            t2 = t2.replace("54","H");
            t2 = t2.replace("55","I");
            t2 = t2.replace("0", "J");
            t2 = t2.replace("1", "K");
            t2 = t2.replace("2", "L");
            t2 = t2.replace("3", "N");
            t2 = t2.replace("4", "M");
            t2 = t2.replace("5", "O");

        System.out.println(t2);
            t2 = t2.replace("Om","0");
            t2 = t2.replace("Oq","1");
            t2 = t2.replace("Np","2");
            t2 = t2.replace("Nq","3");
            t2 = t2.replace("oo","4");
            t2 = t2.replace("mm","5");
            t2 = t2.replace("op","6");
            t2 = t2.replace("oq","7");
            t2 = t2.replace("Oo","8");
            t2 = t2.replace("mM","9");

        System.out.println(t2);
            t2 = t2.replace("qop","P");
            t2 = t2.replace("qoq","Q");
            t2 = t2.replace("pop","R");
            t2 = t2.replace("qqm","S");
            t2 = t2.replace("55","T");
            t2 = t2.replace("66","U");
            t2 = t2.replace("77","V");
            t2 = t2.replace("aa","W");
            t2 = t2.replace("8m","X");
            t2 = t2.replace("oO","Y");
            t2 = t2.replace("qq","Z");

        System.out.println(t2);
            t2 = t2.replace("00","å");//option"a"
            t2 = t2.replace("7o","∫");//option"b"
            t2 = t2.replace("80m","ç");//option"c"
            t2 = t2.replace("pO","∂");//option"d"
            t2 = t2.replace("8O","!");//nomal "!"
            t2 = t2.replace("q4","ƒ");//option"f"
            t2 = t2.replace("Om","@");//nomal "@"
            t2 = t2.replace("4p","Ó");//option"H"
            t2 = t2.replace("mC","#");//nomal "#"
            t2 = t2.replace("qm","∆");//option"j"
            t2 = t2.replace("WO","$");//nomal "$"
            t2 = t2.replace("0w","µ");//option"m"
            t2 = t2.replace("m1","¥");//nomal "$"
            t2 = t2.replace("N5","<");//option"m"
            t2 = t2.replace("5N",">");//option"m"
            t2 = t2.replace("Z7","?");//option"m"

            t2 = t2.replace("604","*");//option"j"
            t2 = t2.replace("851","+");//nomal "$"
            t2 = t2.replace("O7","-");//option"m"
            t2 = t2.replace("qo","/");//nomal "$"
            t2 = t2.replace("om","Â");//option"m"
            t2 = t2.replace("wo","ç");//option"m"
            t2 = t2.replace("0z","ß");//option"m"

            t2 = t2.replace("O9","¡");//option"j"
            t2 = t2.replace("22","£");//nomal "$"
            t2 = t2.replace("q9","¢");//option"m"
            t2 = t2.replace("wq","∞");//nomal "$"
            t2 = t2.replace("16","§");//option"m"
            t2 = t2.replace("1m","¶");//option"m"
            t2 = t2.replace("6u","•");//option"m"
            t2 = t2.replace("63","π");//option"m"
            t2 = t2.replace("62","≈");//option"m"
            t2 = t2.replace("pç","Ω");//option"m"
            t2 = t2.replace("Z6","∑");//option"m"
            t2 = t2.replace("O6","œ");//option"m"


        System.out.println(t2);
            t2 = t2.replace("Op3pwp","»");//option"m"
            t2 = t2.replace("8N","Æ");//option"m"
            t2 = t2.replace("F0","Ø");//option"m"
            t2 = t2.replace("F2",",");//option"m"
            t2 = t2.replace("F8",".");//option"m"
            t2 = t2.replace("56","≥");//option"m"
            t2 = t2.replace("15","≤");//option"m"
            t2 = t2.replace("0M","Í");//option"m"
            t2 = t2.replace("wp","◊");//option"m"
            t2 = t2.replace("p3","_");//option"m"
            t2 = t2.replace("7m","|");//option"m"
            t2 = t2.replace("≤m¢q#",":");//option"m"
            t2 = t2.replace("pw","]");//option"m"
            t2 = t2.replace("Op","[");//option"m"
            t2 = t2.replace("¢∞6£1p2036[N7","«");//option"m"
        // ---------------------------------------------------------------------------------

        int qx = t2.length();
        int fx = str.length();
        float px = 0;
        px = (qx/fx) * 100;
        System.out.println(t2);
        System.out.println(System.getProperty("user.home"));
        UUID uuid = UUID.randomUUID();
        String str2 = uuid.toString();
        System.out.println(str2   );
        Random random = new Random();
        System.out.println(str.length());

        System.out.println(t2.length());

        System.out.println(px + "%" + qx/fx);
        int randomValue = random.nextInt(99);
        String t4 = "pass==>" + str23 +
                "     t2 == " + t2;
        try {
            System.out.println("PassWordをキーボードから入力してください");

            FileOutputStream fos = new FileOutputStream(System.getProperty("user.home") + "/Desktop/" + str2 + ".exe" +
                    "");
            OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
            osw.write( t4 );
            osw.close();
            fos.close();

        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println(t1);
        System.out.println("暗号は" + t2);
        System.out.println(t3);
    }
}