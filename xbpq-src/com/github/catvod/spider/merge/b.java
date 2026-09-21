/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.i;
import java.nio.charset.Charset;

public class b
extends i {
    public static String S(byte[] byArray, Charset charset) {
        if (byArray == null) {
            return null;
        }
        if (charset == null) {
            return new String(byArray);
        }
        return new String(byArray, charset);
    }
}

