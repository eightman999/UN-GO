/*
 * Copyright (c) eightman 2005-2025
 * Furin-lab All rights reserved.
 * 動作設計: 基底クラスenigmn_finの暗号化に加え、頻出単語を独自コードに置き換える拡張。
 *           encryptExtraで置換後に暗号化し、decryptExtraで逆変換する。
 */

package com.company;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Extension of {@link enigmn_fin} that introduces replacement codes for
 * frequently used English and Japanese words. The class provides simple
 * encode/decode helpers which run in addition to the base encryption.
 */
public class Extragman extends enigmn_fin {

    /** Mapping from words/phrases to unique codes. */
    private static final Map<String, String> WORD_TO_CODE = new LinkedHashMap<>();
    /** Reverse mapping for decoding. */
    private static final Map<String, String> CODE_TO_WORD = new LinkedHashMap<>();

    static {
        addMapping("the", "\u262D1");       // example frequent English word
        addMapping("and", "\u262D2");
        addMapping("to", "\u262D3");
        addMapping("hello", "\u262D4");
        addMapping("world", "\u262D5");
        addMapping("こんにちは", "\u262DJ1");
        addMapping("ありがとう", "\u262DJ2");
    }

    private static void addMapping(String word, String code) {
        WORD_TO_CODE.put(word, code);
        CODE_TO_WORD.put(code, word);
    }

    /**
     * Apply extra word replacements before delegating to the base encrypt
     * method.
     */
    public static String encryptExtra(String input) {
        String work = input;
        for (Map.Entry<String, String> e : WORD_TO_CODE.entrySet()) {
            work = work.replace(e.getKey(), e.getValue());
        }
        // Delegate to the encryption from enigmn_fin
        return encrypt(work);
    }

    /**
     * Reverse only the replacements introduced by {@link #encryptExtra}.
     * The original transformation performed by {@link enigmn_fin#encrypt}
     * is not reverted here.
     */
    public static String decryptExtra(String input) {
        String work = input;
        for (Map.Entry<String, String> e : CODE_TO_WORD.entrySet()) {
            work = work.replace(e.getKey(), e.getValue());
        }
        return work;
    }
}

