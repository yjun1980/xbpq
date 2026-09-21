/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u07a1;
import com.github.catvod.spider.merge.\u07a2;
import java.nio.CharBuffer;

public final class \u07a0 {
    public static \u07a2 \u037f(String string) {
        return \u07a0.\u0528(string, SOY.d("46273F1D1A180D3C6F"));
    }

    public static \u07a2 \u0528(String string, String string2) {
        \u07a1.\u0528 \u0529 = \u07a1.\u0528(string.length());
        CharBuffer charBuffer = CharBuffer.allocate(string.length());
        charBuffer.put(string);
        charBuffer.flip();
        \u0529.\u037f(charBuffer);
        return \u07a2.\u0620(\u0529.\u052c(), string2);
    }
}

