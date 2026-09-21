/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.MN;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

public class lE {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String S(String object) {
        try {
            object = MN.l8((String)object);
            Object object2 = new ByteArrayInputStream((byte[])object);
            object = new GZIPInputStream((InputStream)object2);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            object2 = new byte[1024];
            while (true) {
                int n2;
                if ((n2 = ((FilterInputStream)object).read((byte[])object2)) == -1) {
                    ((GZIPInputStream)object).close();
                    byteArrayOutputStream.close();
                    return byteArrayOutputStream.toString("UTF-8");
                }
                byteArrayOutputStream.write((byte[])object2, 0, n2);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public static String l8(byte[] object) {
        object = new GZIPInputStream(new ByteArrayInputStream((byte[])object));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] byArray = new byte[1024];
        int n2;
        while ((n2 = ((FilterInputStream)object).read(byArray)) != -1) {
            byteArrayOutputStream.write(byArray, 0, n2);
        }
        return byteArrayOutputStream.toString("UTF-8");
    }
}

