package com.company;

import com.company.decoder.EnigmanDecoder;

/**
 * Utility decoder that converts numeric codes back to plain text.
 * This bypasses the complex replacement logic in {@link EnigmanDecoder}
 * and directly interprets the encoded numbers.
 */
public class SimpleDecoder {

    /**
     * Decode a string consisting solely of numeric codes. Codes are
     * processed in 3 character chunks with the special value "9012"
     * handled separately.
     */
    public static String decodeNumbers(String encoded) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        java.util.Map<String, Character> map = getMap();
        while (i < encoded.length()) {
            if (encoded.startsWith("9012", i)) {
                sb.append(map.get("9012"));
                i += 4;
            } else {
                if (i + 3 > encoded.length()) {
                    break;
                }
                String code = encoded.substring(i, i + 3);
                Character ch = map.get(code);
                sb.append(ch != null ? ch : '?');
                i += 3;
            }
        }
        return sb.toString();
    }

    private static java.util.Map<String, Character> getMap() {
        try {
            java.lang.reflect.Method m = EnigmanDecoder.class.getDeclaredMethod("createMap");
            m.setAccessible(true);
            @SuppressWarnings("unchecked")
            java.util.Map<String, Character> map = (java.util.Map<String, Character>) m.invoke(null);
            return map;
        } catch (Exception e) {
            throw new RuntimeException("Failed to access map", e);
        }
    }

    public static void main(String[] args) throws Exception {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        String line = br.readLine();
        System.out.println(decodeNumbers(line.trim()));
    }
}
