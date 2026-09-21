/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Em;

import com.github.catvod.spider.merge.Dw.e;
import com.github.catvod.spider.merge.Dw.h;
import com.github.catvod.spider.merge.Em.g;
import com.github.catvod.spider.merge.Em.m;
import com.github.catvod.spider.merge.Fs.a;
import java.io.StringReader;
import java.util.HashMap;

public final class n {
    private static final char[] a = new char[]{',', ';'};
    private static final HashMap<String, String> b = new HashMap();

    static {
        new g();
    }

    static void a(m object, String object2, int n2) {
        int n3;
        m.b(object, new String[n2]);
        m.d(object, new int[n2]);
        m.f(object, new int[n2]);
        m.h(object, new String[n2]);
        object2 = new a(new StringReader((String)object2), ((String)object2).length());
        int n4 = 0;
        int n5 = 0;
        while (!((a)object2).t()) {
            String string = ((a)object2).o('=');
            ((a)object2).a();
            int n6 = Integer.parseInt(((a)object2).p(a), 36);
            n3 = ((a)object2).s();
            ((a)object2).a();
            if (n3 == 44) {
                n3 = Integer.parseInt(((a)object2).o(';'), 36);
                ((a)object2).a();
            } else {
                n3 = -1;
            }
            int n7 = Integer.parseInt(((a)object2).o('&'), 36);
            ((a)object2).a();
            m.a((m)((Object)object))[n5] = string;
            m.c((m)((Object)object))[n5] = n6;
            m.e((m)((Object)object))[n7] = n6;
            m.g((m)((Object)object))[n7] = string;
            if (n3 != -1) {
                b.put(string, new String(new int[]{n6, n3}, 0, 2));
            }
            ++n5;
        }
        n3 = n4;
        if (n5 == n2) {
            n3 = 1;
        }
        if (n3 != 0) {
            return;
        }
        object = new IllegalArgumentException("Unexpected count of entities loaded");
        throw object;
    }

    private static void b(Appendable object, m object2, int n2) {
        String string = ((m)((Object)object2)).j(n2);
        if (!"".equals(string)) {
            object2 = object.append('&');
            object = string;
        } else {
            object2 = object.append("&#x");
            object = Integer.toHexString(n2);
        }
        object2.append((CharSequence)object).append(';');
    }

    public static int c(String string, int[] nArray) {
        String string2 = b.get(string);
        if (string2 != null) {
            nArray[0] = string2.codePointAt(0);
            nArray[1] = string2.codePointAt(1);
            return 2;
        }
        int n2 = m.i.i(string);
        if (n2 != -1) {
            nArray[0] = n2;
            return 1;
        }
        return 0;
    }

    /*
     * Unable to fully structure code
     */
    static void d(Appendable var0, String var1_1, g var2_2, boolean var3_3, boolean var4_4, boolean var5_5) {
        var17_6 = var2_2.c();
        var18_7 = var2_2.b();
        var12_8 = var2_2.f;
        var13_9 = var1_1.length();
        var8_11 = false;
        var7_12 = 0;
        for (var11_10 = 0; var11_10 < var13_9; var11_10 += Character.charCount(var14_16)) {
            block14: {
                block15: {
                    block21: {
                        block16: {
                            block17: {
                                block18: {
                                    block19: {
                                        block20: {
                                            block11: {
                                                block12: {
                                                    block13: {
                                                        var14_16 = var1_1.codePointAt(var11_10);
                                                        var15_17 = true;
                                                        var10_15 = var8_11;
                                                        var9_14 = var7_12;
                                                        if (!var4_4) break block11;
                                                        if (!e.d(var14_16)) break block12;
                                                        if (!var5_5) break block13;
                                                        var10_15 = var8_11;
                                                        var9_14 = var7_12;
                                                        if (!var8_11) break block14;
                                                    }
                                                    if (var7_12 != 0) {
                                                        var10_15 = var8_11;
                                                        var9_14 = var7_12;
                                                    } else {
                                                        var0.append(' ');
                                                        var9_14 = 1;
                                                        var10_15 = var8_11;
                                                    }
                                                    break block14;
                                                }
                                                var10_15 = true;
                                                var9_14 = 0;
                                            }
                                            if (var14_16 >= 65536) break block15;
                                            var6_13 = (char)var14_16;
                                            if (var6_13 == '\"') break block16;
                                            if (var6_13 == '&') break block17;
                                            if (var6_13 == '<') break block18;
                                            if (var6_13 == '>') break block19;
                                            if (var6_13 == '\u00a0') break block20;
                                            var7_12 = h.a(var12_8);
                                            if (var7_12 != 0) {
                                                if (var7_12 != 1) {
                                                    var15_17 = var18_7.canEncode(var6_13);
                                                }
                                            } else if (var6_13 >= '\u0080') {
                                                var15_17 = false;
                                            }
                                            if (!var15_17) ** GOTO lbl-1000
                                            break block21;
                                        }
                                        var16_18 = var17_6 != m.g ? "&nbsp;" : "&#xa0;";
                                        ** GOTO lbl-1000
                                    }
                                    if (var3_3) break block21;
                                    var16_18 = "&gt;";
                                    ** GOTO lbl-1000
                                }
                                if (var3_3 && var17_6 != m.g && var2_2.g() != 2) break block21;
                                var16_18 = "&lt;";
                                ** GOTO lbl-1000
                            }
                            var16_18 = "&amp;";
                            ** GOTO lbl-1000
                        }
                        if (!var3_3) break block21;
                        var16_18 = "&quot;";
                        ** GOTO lbl-1000
                    }
                    var0.append(var6_13);
                    break block14;
                }
                var16_18 = new String(Character.toChars(var14_16));
                if (var18_7.canEncode(var16_18)) lbl-1000:
                // 6 sources

                {
                    var0.append(var16_18);
                } else lbl-1000:
                // 2 sources

                {
                    n.b(var0, var17_6, var14_16);
                }
            }
            var8_11 = var10_15;
            var7_12 = var9_14;
        }
    }

    public static boolean e(String string) {
        boolean bl = m.h.i(string) != -1;
        return bl;
    }

    public static boolean f(String string) {
        boolean bl = m.i.i(string) != -1;
        return bl;
    }
}

