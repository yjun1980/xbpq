/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import java.nio.charset.Charset;

public class i {
    public static byte[] l8(CharSequence charSequence, Charset charset) {
        if (charSequence == null) {
            return null;
        }
        if (charset == null) {
            return charSequence.toString().getBytes();
        }
        return charSequence.toString().getBytes(charset);
    }
}

