/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Z0;

import com.github.catvod.spider.merge.Z0.b;
import com.github.catvod.spider.merge.Z0.c;
import com.github.catvod.spider.merge.Z0.d;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public final class a {
    private static final b a = new b();

    public static byte[] a(String charSequence) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((String)charSequence).length() / 4 * 3);
        try {
            a.a((String)charSequence, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        catch (Exception exception) {
            charSequence = com.github.catvod.spider.merge.C.a.c("unable to decode base64 string: ");
            ((StringBuilder)charSequence).append(exception.getMessage());
            throw new c(((StringBuilder)charSequence).toString(), exception);
        }
    }

    public static byte[] b(byte[] byArray) {
        int n2 = byArray.length;
        Object object = new ByteArrayOutputStream((n2 + 2) / 3 * 4);
        try {
            a.b(byArray, n2, (OutputStream)object);
            return ((ByteArrayOutputStream)object).toByteArray();
        }
        catch (Exception exception) {
            object = com.github.catvod.spider.merge.C.a.c("exception encoding base64 string: ");
            ((StringBuilder)object).append(exception.getMessage());
            throw new d(((StringBuilder)object).toString(), exception);
        }
    }
}

