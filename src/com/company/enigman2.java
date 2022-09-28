package com.company;
import java.io.*;
import java.util.Random;
import java.util.UUID;
public class enigman2 {
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
        str = str.replace("I am ", "∋");

        str = str.replace(" use to ", "Ԉ");
        str = str.replace(" uses to ", "ԉ");

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
        str = str.replace("that", "»");
        str = str.replace("su", "⁄");
        str = str.replace("If a", "¶");
        str = str.replace(".org", "੧");
        str = str.replace("es", "੩");
        str = str.replace("review", "ɞ");
        str = str.replace("ed", "ɟ");
        str = str.replace("ing", "Ⱦ");
        str = str.replace("at", "ʨ");
        str = str.replace("news", "Ƈ");


        str = str.replace(" any of", "Ԋ");
        str = str.replace(" have been ", "ԋ");
        str = str.replace("any", "Ԍ");
        str = str.replace("Any", "ԍ");
        str = str.replace("its", "Ԏ");
        str = str.replace("in", "ԏ");
        str = str.replace("of", "ԇ");
        str = str.replace("has", "Ԇ");
        str = str.replace("which", "ԅ");
        str = str.replace("How", "Ԅ");
        str = str.replace("how", "ԃ");
        str = str.replace("ss", "Ԃ");
        str = str.replace("tt", "ԑ");
        str = str.replace("news", "Ԑ");
        str = str.replace(". ", "Ԓ");
        str = str.replace(" for ཪ ", "ԓ");
        str = str.replace(" may ༎ ", "Ԕ");
        str = str.replace(" of ", "ԕ");


        str = str.replace("/a/", "Ҁ");
        str = str.replace("/b/", "ҁ");
        str = str.replace("/c/", "҂");
        str = str.replace("/d/", "҃");
        str = str.replace("/e/", "҄");
        str = str.replace("/f/", "҅");
        str = str.replace("/g/", "҆");
        str = str.replace("こんにちは", "ꚞ");
        System.out.println(str);
        String t1 = "";
        char[] c = str.toCharArray();
        for (char c1 : c) {
            switch (c1) {
                //------------url
                case 'Ҁ':
                    t1 = t1 + "A01";
                    break;
                case 'ҁ':
                    t1 = t1 + "A02";
                    break;
                case '҃':
                    t1 = t1 + "A03";
                    break;
                case '҄':
                    t1 = t1 + "A04";
                    break;
                case '҅':
                    t1 = t1 + "A05";
                    break;
                case '҆':
                    t1 = t1 + "A06";
                    break;
                case '҂':
                    t1 = t1 + "A07";
                    break;
                case 'ꚞ':
                    t1 = t1 + "A08";
                    break;
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
                case '∋':
                    t1 = t1 + "910";
                    break;
                case 'ẛ':
                    t1 = t1 + "911";
                    break;
                case 'Ỻ':
                    t1 = t1 + "902";
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
                case '»':
                    t1 = t1 + "923";
                    break;
                case '⁄':
                    t1 = t1 + "924";
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
                case '¶':
                    t1 = t1 + "989";
                    break;
                case '੧':
                    t1 = t1 + "988";
                    break;
                case '੩':
                    t1 = t1 + "987";
                    break;
                case 'ɞ':
                    t1 = t1 + "986";
                    break;
                case 'ɟ':
                    t1 = t1 + "985";
                    break;
                case 'Ⱦ':
                    t1 = t1 + "984";
                    break;
                case 'ʨ':
                    t1 = t1 + "983";
                    break;
                case 'Ƈ':
                    t1 = t1 + "982";
                    break;

                case 'Ԉ':
                    t1 = t1 + "982";
                    break;
                case 'ԉ':
                    t1 = t1 + "981";
                    break;
                case 'Ԋ':
                    t1 = t1 + "980";
                    break;
                case 'Ԍ':
                    t1 = t1 + "979";
                    break;
                case 'ԍ':
                    t1 = t1 + "978";
                    break;
                case 'Ԏ':
                    t1 = t1 + "977";
                    break;
                case 'ԏ':
                    t1 = t1 + "976";
                    break;
                case 'ԇ':
                    t1 = t1 + "975";
                    break;
                case 'Ԇ':
                    t1 = t1 + "974";
                    break;
                case 'ԅ':
                    t1 = t1 + "973";
                    break;
                case 'Ԅ':
                    t1 = t1 + "972";
                    break;
                case 'ԃ':
                    t1 = t1 + "971";
                    break;
                case 'ԋ':
                    t1 = t1 + "970";
                    break;

                case 'ԑ':
                    t1 = t1 + "969";
                    break;
                case 'Ԑ':
                    t1 = t1 + "968";
                    break;
                case 'Ԓ':
                    t1 = t1 + "967";
                    break;
                case 'ԓ':
                    t1 = t1 + "966";
                    break;
                case 'Ԕ':
                    t1 = t1 + "965";
                    break;
                case 'ԕ':
                    t1 = t1 + "964";
                    break;
                case 'Ԃ':
                    t1 = t1 + "963";
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
                case 0x3019:
                    t1 = t1 + "026";
                    break;
                case 0x301A:
                    t1 = t1 + "027";
                    break;
                case 0x301B:
                    t1 = t1 + "028";
                    break;
                case 0x301C:
                    t1 = t1 + "029";
                    break;
                case 0x301D:
                    t1 = t1 + "030";
                    break;
                case 0x301E:
                    t1 = t1 + "031";
                    break;
                case 0x301F:
                    t1 = t1 + "032";
                    break;
                case 0x3020:
                    t1 = t1 + "033";
                    break;
                case 0x3021:
                    t1 = t1 + "034";
                    break;
                case 0x3022:
                    t1 = t1 + "035";
                    break;
                case 0x3023:
                    t1 = t1 + "036";
                    break;
                case 0x3024:
                    t1 = t1 + "037";
                    break;
                case 0x3025:
                    t1 = t1 + "038";
                    break;
                case 0x3026:
                    t1 = t1 + "039";
                    break;
                case 0x3027:
                    t1 = t1 + "040";
                    break;
                case 0x3028:
                    t1 = t1 + "041";
                    break;
                case 0x3029:
                    t1 = t1 + "042";
                    break;
                case 0x302A:
                    t1 = t1 + "043";
                    break;
                case 0x302B:
                    t1 = t1 + "044";
                    break;
                case 0x302C:
                    t1 = t1 + "045";
                    break;
                case 0x302D:
                    t1 = t1 + "046";
                    break;
                case 0x302E:
                    t1 = t1 + "047";
                    break;
                case 0x302F:
                    t1 = t1 + "048";
                    break;
                case 0x3030:
                    t1 = t1 + "049";
                    break;
                case 0x3031:
                    t1 = t1 + "050";
                    break;
                case 0x3032:
                    t1 = t1 + "051";
                    break;
                case 0x3033:
                    t1 = t1 + "052";
                    break;
                case 0x3034:
                    t1 = t1 + "053";
                    break;
                case 0x3035:
                    t1 = t1 + "054";
                    break;
                case 0x3036:
                    t1 = t1 + "055";
                    break;
                case 0x3037:
                    t1 = t1 + "056";
                    break;
                case 0x3038:
                    t1 = t1 + "057";
                    break;
                case 0x3039:
                    t1 = t1 + "058";
                    break;
                case 0x303A:
                    t1 = t1 + "059";
                    break;
                case 0x303B:
                    t1 = t1 + "060";
                    break;
                case 0x303C:
                    t1 = t1 + "061";
                    break;
                case 0x303D:
                    t1 = t1 + "062";
                    break;
                case 0x303E:
                    t1 = t1 + "063";
                    break;
                case 0x303F:
                    t1 = t1 + "064";
                    break;
                case 0x3040:
                    t1 = t1 + "065";
                    break;
                case 0x3041:
                    t1 = t1 + "066";
                    break;
                case 0x3042:
                    t1 = t1 + "067";
                    break;
                case 0x3043:
                    t1 = t1 + "068";
                    break;
                case 0x3044:
                    t1 = t1 + "069";
                    break;
                case 0x3045:
                    t1 = t1 + "070";
                    break;
                case 0x3046:
                    t1 = t1 + "080";
                    break;
                case 0x3047:
                    t1 = t1 + "081";
                    break;
                case 0x3048:
                    t1 = t1 + "082";
                    break;
                case 0x3049:
                    t1 = t1 + "083";
                    break;
                case 0x304A:
                    t1 = t1 + "084";
                    break;
                case 0x304B:
                    t1 = t1 + "085";
                    break;
                case 0x304C:
                    t1 = t1 + "086";
                    break;
                case 0x304D:
                    t1 = t1 + "087";
                    break;
                case 0x304E:
                    t1 = t1 + "088";
                    break;
                case 0x304F:
                    t1 = t1 + "089";
                    break;

                case 0x3050:
                    t1 = t1 + "090";
                    break;
                case 0x3051:
                    t1 = t1 + "091";
                    break;
                case 0x3052:
                    t1 = t1 + "092";
                    break;
                case 0x3053:
                    t1 = t1 + "093";
                    break;
                case 0x3054:
                    t1 = t1 + "094";
                    break;
                case 0x3055:
                    t1 = t1 + "095";
                    break;
                case 0x3056:
                    t1 = t1 + "096";
                    break;
                case 0x3057:
                    t1 = t1 + "097";
                    break;
                case 0x3058:
                    t1 = t1 + "098";
                    break;
                case 0x3059:
                    t1 = t1 + "098";
                    break;
                case 0x305A:
                    t1 = t1 + "099";
                    break;
                case 0x305B:
                    t1 = t1 + "100";
                    break;
                case 0x305C:
                    t1 = t1 + "211";
                    break;
                case 0x305D:
                    t1 = t1 + "212";
                    break;
                case 0x305E:
                    t1 = t1 + "213";
                    break;
                case 0x305F:
                    t1 = t1 + "214";
                    break;

                case 0x3060:
                    t1 = t1 + "215";
                    break;
                case 0x3061:
                    t1 = t1 + "216";
                    break;
                case 0x3062:
                    t1 = t1 + "217";
                    break;
                case 0x3063:
                    t1 = t1 + "218";
                    break;
                case 0x3064:
                    t1 = t1 + "219";
                    break;
                case 0x3065:
                    t1 = t1 + "220";
                    break;
                case 0x3066:
                    t1 = t1 + "221";
                    break;
                case 0x3067:
                    t1 = t1 + "222";
                    break;
                case 0x3068:
                    t1 = t1 + "223";
                    break;
                case 0x3069:
                    t1 = t1 + "224";
                    break;
                case 0x306A:
                    t1 = t1 + "225";
                    break;
                case 0x306B:
                    t1 = t1 + "226";
                    break;
                case 0x306C:
                    t1 = t1 + "227";
                    break;
                case 0x306D:
                    t1 = t1 + "228";
                    break;
                case 0x306E:
                    t1 = t1 + "229";
                    break;
                case 0x306F:
                    t1 = t1 + "230";
                    break;

                case 0x3070:
                    t1 = t1 + "215";
                    break;
                case 0x3071:
                    t1 = t1 + "216";
                    break;
                case 0x3072:
                    t1 = t1 + "217";
                    break;
                case 0x3073:
                    t1 = t1 + "218";
                    break;
                case 0x3074:
                    t1 = t1 + "219";
                    break;
                case 0x3075:
                    t1 = t1 + "220";
                    break;
                case 0x3076:
                    t1 = t1 + "221";
                    break;
                case 0x3077:
                    t1 = t1 + "222";
                    break;
                case 0x3078:
                    t1 = t1 + "223";
                    break;
                case 0x3079:
                    t1 = t1 + "224";
                    break;
                case 0x307A:
                    t1 = t1 + "225";
                    break;
                case 0x307B:
                    t1 = t1 + "226";
                    break;
                case 0x307C:
                    t1 = t1 + "227";
                    break;
                case 0x307D:
                    t1 = t1 + "228";
                    break;
                case 0x307E:
                    t1 = t1 + "229";
                    break;
                case 0x307F:
                    t1 = t1 + "230";
                    break;

                case 0x3080:
                    t1 = t1 + "231";
                    break;
                case 0x3081:
                    t1 = t1 + "232";
                    break;
                case 0x3082:
                    t1 = t1 + "233";
                    break;
                case 0x3083:
                    t1 = t1 + "234";
                    break;
                case 0x3084:
                    t1 = t1 + "235";
                    break;
                case 0x3085:
                    t1 = t1 + "236";
                    break;
                case 0x3086:
                    t1 = t1 + "237";
                    break;
                case 0x3087:
                    t1 = t1 + "238";
                    break;
                case 0x3088:
                    t1 = t1 + "239";
                    break;
                case 0x3089:
                    t1 = t1 + "240";
                    break;
                case 0x308A:
                    t1 = t1 + "241";
                    break;
                case 0x308B:
                    t1 = t1 + "242";
                    break;
                case 0x308C:
                    t1 = t1 + "243";
                    break;
                case 0x308D:
                    t1 = t1 + "244";
                    break;
                case 0x308E:
                    t1 = t1 + "245";
                    break;
                case 0x308F:
                    t1 = t1 + "246";
                    break;

                case 0x3090:
                    t1 = t1 + "247";
                    break;
                case 0x3091:
                    t1 = t1 + "248";
                    break;
                case 0x3092:
                    t1 = t1 + "249";
                    break;
                case 0x3093:
                    t1 = t1 + "250";
                    break;
                case 0x3094:
                    t1 = t1 + "251";
                    break;
                case 0x3095:
                    t1 = t1 + "252";
                    break;
                case 0x3096:
                    t1 = t1 + "253";
                    break;
                case 0x3097:
                    t1 = t1 + "254";
                    break;
                case 0x3098:
                    t1 = t1 + "255";
                    break;
                case 0x3099:
                    t1 = t1 + "256";
                    break;
                case 0x309A:
                    t1 = t1 + "257";
                    break;
                case 0x309B:
                    t1 = t1 + "258";
                    break;
                case 0x309C:
                    t1 = t1 + "259";
                    break;
                case 0x309D:
                    t1 = t1 + "260";
                    break;
                case 0x309E:
                    t1 = t1 + "261";
                    break;
                case 0x309F:
                    t1 = t1 + "262";
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
        t2 = t2.replace("A","1010");
        t2 = t2.replace("B","1011");
        t2 = t2.replace("C","1100");
        t2 = t2.replace("D","1101");
        t2 = t2.replace("E","1110");
        t2 = t2.replace("F","0000");

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
        t2 = t2.replace("mw","1");
        t2 = t2.replace("mu","2");
        t2 = t2.replace("Np","3");
        t2 = t2.replace("Nm","4");
        t2 = t2.replace("Mu","5");
        t2 = t2.replace("qo","6");
        t2 = t2.replace("Op","7");
        t2 = t2.replace("wo","8");
        t2 = t2.replace("wq","9");

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
        t2 = t2.replace("3/","Ú");//option"m"
        t2 = t2.replace("Nm","∋");//option"m"
        t2 = t2.replace("mm","¯");//option"m"
        t2 = t2.replace("¯¯","¸");//option"m"
        t2 = t2.replace("qp","„");//option"m"
        t2 = t2.replace("83","‹");//option"m"
        t2 = t2.replace("Oo","‡");//option"m"
        t2 = t2.replace("Nq","±");//option"m"
        t2 = t2.replace("CpuN","ø");//option"m"
        t2 = t2.replace("0m","¿");//option"m"
        t2 = t2.replace("o9","˛");//option"m"
        t2 = t2.replace("No","˜");//option"m"
        t2 = t2.replace("2‡","˘");//option"m"
        t2 = t2.replace("±6","=");//option"m"
        t2 = t2.replace("m∫","ı");//option"m"
        t2 = t2.replace("uo","≠");//option"m"
        t2 = t2.replace("NZ","ﬂ");//option"m"
        t2 = t2.replace("88","°");//option"m"
        t2 = t2.replace("q∂","‰");//option"m"
        t2 = t2.replace("uu","%");//option"m"
        t2 = t2.replace("wm","\"");//option"m"
        t2 = t2.replace("3u6","∝");//option"m"
        t2 = t2.replace("mN","Γ");//option"m"
        t2 = t2.replace("02","¬");//option"m"
        t2 = t2.replace("o7","ª");//option"m"
        t2 = t2.replace("98","º");//option"m"
        t2 = t2.replace("Æ‰‰","Œ");//option"m"
        t2 = t2.replace("mo","ƿ");//option"m"
        t2 = t2.replace("89m","ȱ");//option"m"
        t2 = t2.replace("89p","ɗ");//option"m"
        t2 = t2.replace("˛pYo°Æ‰„u","ɕ");//option"m"
        t2 = t2.replace("ou","Ʊ");//option"m"
        t2 = t2.replace("u∆5o89pN","Ⱥ");//option"m"
        t2 = t2.replace("„•","ɟ");//option"m"
        t2 = t2.replace("Æo","ɚ");//option"m"
        t2 = t2.replace("‰q#6œ∆MqL","ʭ");//option"m"
        t2 = t2.replace("Mw¯˛m5ªﬂ∂oN˛","ʬ");//option"m"
        t2 = t2.replace("0u","·");//option"m"
        t2 = t2.replace("05OZ2O","×");//option"m"
        t2 = t2.replace("8u","ǂ");//option"m"
        t2 = t2.replace("˜˜","ċ");//option"m"
        t2 = t2.replace("o8","ê");//option"m"
        t2 = t2.replace("˛pYo°8u˜u","ë");//option"m"
        t2 = t2.replace("5u","é");//option"m"
        t2 = t2.replace("2u","è");//option"m"
        t2 = t2.replace("28","ç");//option"m"
        t2 = t2.replace("w2","à");//option"m"
        t2 = t2.replace("%%","á");//option"m"
        t2 = t2.replace("ÂF","â");//option"m"
        t2 = t2.replace("po","ã");//option"m"
        t2 = t2.replace("q6","ą");//option"m"
        t2 = t2.replace("pYo","Ą");//option"m"
        t2 = t2.replace("Ą°","Ă");//option"m"
        t2 = t2.replace("O∆","ć");//option"m"
        t2 = t2.replace("p¯˜◊|","ĉ");//option"m"
        t2 = t2.replace("4F","ċ");//option"m"
        t2 = t2.replace("OY","č");//option"m"
        t2 = t2.replace("oo","ď");//option"m"
        t2 = t2.replace("∆O","đ");//option"m"

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