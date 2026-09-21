/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.KT;

import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.KT.I;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.security.Key;
import java.security.spec.KeySpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class J {
    public static final byte[] a = "XJAR-ENC1".getBytes(com.github.catvod.spider.merge.UY.m.y());

    public static byte[] a(I i2, long l2, byte[] byArray, String object) {
        object = ((String)object).toCharArray();
        int n2 = i2.a;
        object = new PBEKeySpec((char[])object, i2.d, n2, 256);
        SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256").generateSecret((KeySpec)object).getEncoded(), "AES");
        object = Cipher.getInstance("AES/GCM/NoPadding");
        byte[] byArray2 = new byte[12];
        byte[] byArray3 = i2.e;
        int n3 = byArray3.length;
        System.arraycopy(byArray3, 0, byArray2, 0, n3);
        for (n2 = 0; n2 < 8; ++n2) {
            byArray2[byArray3.length + n2] = (byte)(l2 >>> 56 - n2 * 8);
        }
        ((Cipher)object).init(2, (Key)secretKeySpec, new GCMParameterSpec(128, byArray2));
        ((Cipher)object).updateAAD(i2.f);
        return ((Cipher)object).doFinal(byArray);
    }

    public static boolean b(String string) {
        boolean bl = string != null && string.toLowerCase().endsWith(".xenc");
        return bl;
    }

    public static I c(byte[] object) {
        object = new DataInputStream(new ByteArrayInputStream((byte[])object));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] byArray = a;
        byte[] byArray2 = new byte[byArray.length];
        ((DataInputStream)object).readFully(byArray2);
        byteArrayOutputStream.write(byArray2, 0, byArray2.length);
        if (Arrays.equals(byArray2, byArray)) {
            int n2 = ((InputStream)object).read();
            if (n2 >= 0) {
                byteArrayOutputStream.write(n2);
                int n3 = ((InputStream)object).read();
                if (n3 >= 0) {
                    byteArrayOutputStream.write(n3);
                    byArray = new byte[4];
                    ((DataInputStream)object).readFully(byArray);
                    byteArrayOutputStream.write(byArray, 0, byArray.length);
                    int n4 = new DataInputStream(new ByteArrayInputStream(byArray)).readInt();
                    byArray = new byte[4];
                    ((DataInputStream)object).readFully(byArray);
                    byteArrayOutputStream.write(byArray, 0, byArray.length);
                    int n5 = new DataInputStream(new ByteArrayInputStream(byArray)).readInt();
                    byArray = new byte[8];
                    ((DataInputStream)object).readFully(byArray);
                    byteArrayOutputStream.write(byArray, 0, byArray.length);
                    long l2 = new DataInputStream(new ByteArrayInputStream(byArray)).readLong();
                    byArray = new byte[2];
                    ((DataInputStream)object).readFully(byArray);
                    byteArrayOutputStream.write(byArray, 0, byArray.length);
                    int n6 = byArray[0];
                    n6 = byArray[1] & 0xFF | (n6 & 0xFF) << 8;
                    byArray = new byte[2];
                    ((DataInputStream)object).readFully(byArray);
                    byteArrayOutputStream.write(byArray, 0, byArray.length);
                    int n7 = byArray[0];
                    n7 = byArray[1] & 0xFF | (n7 & 0xFF) << 8;
                    if (n2 == 1) {
                        if (n3 == 1) {
                            if (n5 >= 65536) {
                                if (l2 >= 0L) {
                                    if (n6 >= 8 && n6 <= 64) {
                                        if (n7 == 4) {
                                            byArray = new byte[n6];
                                            byArray2 = new byte[n7];
                                            ((DataInputStream)object).readFully(byArray);
                                            byteArrayOutputStream.write(byArray, 0, byArray.length);
                                            ((DataInputStream)object).readFully(byArray2);
                                            byteArrayOutputStream.write(byArray2, 0, byArray2.length);
                                            return new I(n4, n5, l2, byArray, byArray2, byteArrayOutputStream.toByteArray());
                                        }
                                        throw new IOException("Invalid XENC nonce prefix");
                                    }
                                    throw new IOException("Invalid XENC salt length");
                                }
                                throw new IOException("Invalid XENC original size");
                            }
                            throw new IOException("Invalid XENC chunk size");
                        }
                        throw new IOException(m.c(n3, "Unsupported XENC KDF: "));
                    }
                    throw new IOException(m.c(n2, "Unsupported XENC version: "));
                }
                throw new EOFException("XENC header ended early");
            }
            throw new EOFException("XENC header ended early");
        }
        throw new IOException("Not XJAR-ENC1");
    }
}

