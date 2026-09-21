/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.cv;

import com.github.catvod.spider.merge.cv.a;
import com.github.catvod.spider.merge.cv.b;
import com.github.catvod.spider.merge.nIe;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
import java.util.Properties;

final class c {
    private static boolean a;
    static Class b;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        boolean bl;
        try {
            bl = System.getProperty(nIe.d("3A0B3F6D3A3B3003322E672B27042624")) != null;
        }
        catch (Exception exception) {
            return;
        }
        a = bl;
    }

    static /* synthetic */ Class a() {
        return c.class;
    }

    private static void b(String string) {
        if (a) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(nIe.d("1132010608027846"));
            stringBuffer.append(string);
            printStream.println(stringBuffer.toString());
        }
    }

    /*
     * Unable to fully structure code
     */
    static Object c() {
        block21: {
            block18: {
                block19: {
                    block17: {
                        var1 = c.class;
                        var3_4 = nIe.d("2807252231613A0B3F6D3A3B3003322E67170F2A1A2D393A362032203D20301F");
                        var4_5 = new StringBuffer();
                        var0_7 = var2_6 = c.b;
                        if (var2_6 != null) break block17;
                        c.a();
                        c.b = c.class;
                        var0_7 = c.class;
                    }
                    try {
                        var4_5.append(var0_7.getName());
                        var4_5.append(nIe.d("66253F223A3C0E0932272C3D040F3D272C3D01093D203B2A3603"));
                        var0_7 = ((b)Class.forName(var4_5.toString()).newInstance()).a();
                        break block18;
                    }
                    catch (Exception var0_8) {
                        throw new a(var0_8.toString(), var0_8);
                    }
                    catch (ClassNotFoundException var0_9) {
                        var0_7 = var2_6 = c.b;
                        if (var2_6 != null) break block19;
                    }
                    catch (LinkageError var0_10) {
                        var0_7 = var2_6 = c.b;
                        if (var2_6 != null) break block19;
                    }
                    c.a();
                    c.b = c.class;
                    var0_7 = var1;
                }
                var0_7 = var0_7.getClassLoader();
            }
            try {
                var2_6 = System.getProperty((String)var3_4);
                if (var2_6 == null) break block21;
            }
            catch (SecurityException var1_3) {
                ** continue;
            }
            var1 = new StringBuffer();
            var1.append(nIe.d("2409262D2D6F311F20372C226216212C392A30122A"));
            var1.append((String)var2_6);
            c.b(var1.toString());
            var0_7 = var1 = c.d((String)var2_6, (ClassLoader)var0_7);
            ** GOTO lbl125
        }
lbl52:
        // 2 sources

        while (true) {
            block23: {
                block24: {
                    block25: {
                        block22: {
                            var2_6 = System.getProperty(nIe.d("2807252267272D0B36"));
                            var1 = new StringBuffer();
                            var1.append((String)var2_6);
                            var2_6 = File.separator;
                            var1.append((String)var2_6);
                            var1.append(nIe.d("2E0F31"));
                            var1.append((String)var2_6);
                            var1.append(nIe.d("28072B33673F300923263B3B2B0320"));
                            var2_6 = var1.toString();
                            var1 = new File((String)var2_6);
                            if (!var1.exists()) break block22;
                            var2_6 = new Properties();
                            var4_5 = new FileInputStream((File)var1);
                            var2_6.load((InputStream)var4_5);
                            var2_6 = var2_6.getProperty((String)var3_4);
                            if (var2_6 == null) break block22;
                            try {
                                if (var2_6.length() <= 0) break block22;
                                var1 = new StringBuffer();
                                var1.append(nIe.d("2409262D2D6F2807252267272D0B3663393D2D1636313D3662"));
                                var1.append((String)var2_6);
                                c.b(var1.toString());
                                var0_7 = var1 = c.d((String)var2_6, (ClassLoader)var0_7);
                                break block23;
                            }
                            catch (Exception var1_1) {
                                if (!c.a) break block22;
                                var1_1.printStackTrace();
                            }
                        }
                        var2_6 = nIe.d("0F23070264060C207C302C3D340F30263A602807252231613A0B3F6D3A3B3003322E67170F2A1A2D393A362032203D20301F");
                        if (var0_7 != null) ** GOTO lbl94
                        var1 = ClassLoader.getSystemResourceAsStream((String)var2_6);
                        break block25;
lbl94:
                        // 1 sources

                        var1 = var0_7.getResourceAsStream((String)var2_6);
                    }
                    if (var1 == null) break block24;
                    var3_4 = new StringBuffer();
                    var3_4.append(nIe.d("2409262D2D6F"));
                    var3_4.append((String)var2_6);
                    c.b(var3_4.toString());
                    var3_4 = new InputStreamReader((InputStream)var1, nIe.d("1732156E71"));
                    var2_6 = new BufferedReader((Reader)var3_4);
                    var1 = var2_6.readLine();
                    var2_6.close();
                    if (var1 == null) break block24;
                    try {
                        if ("".equals(var1)) break block24;
                        var2_6 = new StringBuffer();
                        var2_6.append(nIe.d("2E0932272C2B6200212C246F31032135202C27156963"));
                        var2_6.append((String)var1);
                        c.b(var2_6.toString());
                        var0_7 = var1 = c.d((String)var1, (ClassLoader)var0_7);
                        break block23;
                    }
                    catch (Exception var1_2) {
                        if (!c.a) break block24;
                        var1_2.printStackTrace();
                    }
                }
                c.b(nIe.d("2E0932272C2B6200212C246F24073F2F2B2E210D73352823370369632A202F48312628613A0B3F6D3A3B3003322E67021A3632313A2A302032203D20301F"));
                var0_7 = c.d(nIe.d("21093E6D2B2A23482B2E25613112212628226C2B0B13283D31032105282C3609213A"), (ClassLoader)var0_7);
            }
            return var0_7;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static Object d(String var0, ClassLoader var1_1) {
        var2_4 = nIe.d("12143C35202B271473");
        if (var1_1 != null) ** GOTO lbl6
        try {
            block3: {
                var1_1 = Class.forName(var0);
                break block3;
lbl6:
                // 1 sources

                var1_1 = var1_1.loadClass(var0);
            }
            var1_1 = var1_1.newInstance();
            return var1_1;
        }
        catch (Exception var1_2) {
            var3_5 = new StringBuffer();
            var3_5.append(var2_4);
            var3_5.append(var0);
            var3_5.append(nIe.d("62053C36252B62083C37692D27463A2D3A3B2308272A283B27026963"));
            var3_5.append(var1_2);
            throw new a(var3_5.toString(), var1_2);
        }
        catch (ClassNotFoundException var1_3) {
            var3_6 = new StringBuffer();
            var3_6.append(var2_4);
            var3_6.append(var0);
            var3_6.append(nIe.d("62083C3769292D133D27"));
            throw new a(var3_6.toString(), var1_3);
        }
    }
}

