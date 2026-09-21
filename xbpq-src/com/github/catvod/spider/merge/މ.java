/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.util.zip.GZIPInputStream;

public class \u0789 {
    public static String \u037f(byte[] object) {
        object = new GZIPInputStream(new ByteArrayInputStream((byte[])object));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] byArray = new byte[1024];
        int n2;
        while ((n2 = ((FilterInputStream)object).read(byArray)) != -1) {
            byteArrayOutputStream.write(byArray, 0, n2);
        }
        return byteArrayOutputStream.toString(SOY.d("2F06175B4C"));
    }
}

