/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.S;
import java.nio.charset.Charset;

public class kN {
    public static byte[] S(String string) {
        return kN.l8(string, S.l);
    }

    private static byte[] l8(String string, Charset charset) {
        if (string == null) {
            return null;
        }
        return string.getBytes(charset);
    }
}

