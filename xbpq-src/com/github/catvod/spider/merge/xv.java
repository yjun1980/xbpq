/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.MN;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.security.Key;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

public class xv {
    private static PublicKey HM(String object) {
        object = new X509EncodedKeySpec(MN.l8((String)object));
        return KeyFactory.getInstance("RSA").generatePublic((KeySpec)object);
    }

    public static PrivateKey N(String object) {
        object = new PKCS8EncodedKeySpec(MN.l8((String)object));
        return KeyFactory.getInstance("RSA").generatePrivate((KeySpec)object);
    }

    /*
     * Unable to fully structure code
     */
    public static String OL(String var0, String var1_2) {
        try {
            var6_3 = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            var7_4 = KeyFactory.getInstance("RSA");
            var8_5 = new X509EncodedKeySpec(MN.l8((String)var0));
            var6_3.init(1, var7_4.generatePublic(var8_5));
            var4_6 = var1_2.getBytes().length;
            var7_4 = new ByteArrayOutputStream();
            var2_7 = 0;
            var3_8 = 0;
        }
        catch (Exception var0_1) {
            return "error";
        }
        while (true) {
            block6: {
                if ((var5_9 = var4_6 - var2_7) <= 0) {
                    var0 = var7_4.toByteArray();
                    var7_4.close();
                    return MN.S((byte[])var0);
                }
                if (var5_9 <= 117) ** GOTO lbl20
                var0 = var6_3.doFinal(var1_2.getBytes(), var2_7, 117);
                break block6;
lbl20:
                // 1 sources

                var0 = var6_3.doFinal(var1_2.getBytes(), var2_7, var5_9);
            }
            var7_4.write((byte[])var0, 0, ((Object)var0).length);
            var2_7 = ++var3_8 * 117;
            continue;
            break;
        }
    }

    public static String S(String object, String object2) {
        int n2;
        object2 = xv.N((String)object2);
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(2, (Key)object2);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(MN.l8((String)object));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        object2 = new byte[256];
        while ((n2 = byteArrayInputStream.read((byte[])object2)) != -1) {
            if (256 == n2) {
                object = object2;
            } else {
                byte[] byArray = new byte[n2];
                int n3 = 0;
                while (true) {
                    object = byArray;
                    if (n3 >= n2) break;
                    byArray[n3] = (byte)object2[n3];
                    ++n3;
                }
            }
            byteArrayOutputStream.write(cipher.doFinal((byte[])object));
        }
        return new String(byteArrayOutputStream.toByteArray());
    }

    public static String T4(String object, String string) {
        object = xv.HM((String)object);
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(2, (Key)object);
        return new String(cipher.doFinal(MN.l8(string)));
    }

    /*
     * Unable to fully structure code
     */
    public static String b(String var0, String var1_2) {
        var6_3 = "error";
        var7_4 = MN.l8((String)var1_2);
        var1_2 = new ByteArrayOutputStream();
        try {
            var0 = xv.HM((String)var0);
            var8_5 = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            var8_5.init(2, (Key)var0);
            var4_6 = var7_4.length;
            var3_7 = 0;
            var2_8 = 0;
        }
        catch (Exception var0_1) {
            return "error";
        }
        while (true) {
            block9: {
                if ((var5_9 = var4_6 - var3_7) <= 0) {
                    block8: {
                        block7: {
                            var0 = var1_2.toByteArray();
                            var1_2.close();
                            if (var0 != null) break block7;
                            var0 = var6_3;
                            break block8;
                        }
                        var0 = new String((byte[])var0);
                    }
                    return var0;
                }
                if (var5_9 <= 128) ** GOTO lbl28
                var0 = var8_5.doFinal(var7_4, var3_7, 128);
                break block9;
lbl28:
                // 1 sources

                var0 = var8_5.doFinal(var7_4, var3_7, var5_9);
            }
            var1_2.write((byte[])var0, 0, ((Object)var0).length);
            var3_7 = ++var2_8 * 128;
            continue;
            break;
        }
    }

    public static String l(String object, String object2) {
        try {
            object2 = xv.HM((String)object2);
            System.out.println((String)object);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, (Key)object2);
            object = new String(MN.S(cipher.doFinal(((String)object).getBytes("UTF-8"))));
            return object;
        }
        catch (Exception exception) {
            object = System.out;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("sadsad4");
            stringBuilder.append(exception);
            ((PrintStream)object).println(stringBuilder.toString());
            return null;
        }
    }

    public static String l8(String object, String object2) {
        int n2;
        object2 = xv.N((String)object2);
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(2, (Key)object2);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(MN.l8((String)object));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        object2 = new byte[128];
        while ((n2 = byteArrayInputStream.read((byte[])object2)) != -1) {
            if (128 == n2) {
                object = object2;
            } else {
                byte[] byArray = new byte[n2];
                int n3 = 0;
                while (true) {
                    object = byArray;
                    if (n3 >= n2) break;
                    byArray[n3] = (byte)object2[n3];
                    ++n3;
                }
            }
            byteArrayOutputStream.write(cipher.doFinal((byte[])object));
        }
        return new String(byteArrayOutputStream.toByteArray());
    }

    public static String tT(String object, String object2) {
        Object object3 = xv.HM((String)object2);
        object2 = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        ((Cipher)object2).init(1, (Key)object3);
        object = ((String)object).getBytes("UTF-8");
        object3 = new ByteArrayOutputStream();
        int n2 = 0;
        while (true) {
            if (n2 >= ((Object)object).length) break;
            int n3 = Math.min(((Object)object).length - n2, 117);
            ((OutputStream)object3).write(((Cipher)object2).doFinal((byte[])object, n2, n3));
            n2 += n3;
            continue;
            break;
        }
        try {
            object = MN.S(((ByteArrayOutputStream)object3).toByteArray());
            return object;
        }
        catch (Exception exception) {
            object = System.out;
            object3 = new StringBuilder();
            ((StringBuilder)object3).append("\u52a0\u5bc6\u5931\u8d25: ");
            ((StringBuilder)object3).append(exception);
            ((PrintStream)object).println(((StringBuilder)object3).toString());
            return null;
        }
    }
}

