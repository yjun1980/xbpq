/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.F0;

import com.github.catvod.spider.merge.xc.E0.b;
import com.github.catvod.spider.merge.xc.F0.g;
import com.github.catvod.spider.merge.xc.F0.m;
import com.github.catvod.spider.merge.xc.y0.a;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import java.util.HashMap;

public abstract class n {
    public static final char[] a = new char[]{',', ';'};
    public static final HashMap b = new HashMap();

    static {
        Object object = m.e;
        object = com.github.catvod.spider.merge.xc.D0.a.a;
        new ThreadLocal();
    }

    public static void a(Appendable appendable, m object, int n2) {
        int n3;
        String[] stringArray;
        int n4 = Arrays.binarySearch(object.c, n2);
        object = n4 >= 0 ? (n4 < (stringArray = object.d).length - 1 && (object = (Object)object.c)[n3 = n4 + 1] == n2 ? stringArray[n3] : stringArray[n4]) : "";
        if (!"".equals(object)) {
            appendable.append('&').append((CharSequence)object).append(';');
        } else {
            appendable.append("&#x").append(Integer.toHexString(n2)).append(';');
        }
    }

    public static void b(Appendable appendable, String string, g g2, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        int n2;
        m m2 = g2.a;
        CharsetEncoder charsetEncoder = (CharsetEncoder)g2.c.get();
        if (charsetEncoder == null) {
            charsetEncoder = g2.b();
        }
        int n3 = g2.d;
        int n4 = string.length();
        int n5 = 0;
        boolean bl5 = false;
        boolean bl6 = false;
        for (int i2 = 0; i2 < n4; i2 += Character.charCount(n2)) {
            n2 = string.codePointAt(i2);
            boolean bl7 = true;
            int n6 = n5;
            boolean bl8 = bl5;
            boolean bl9 = bl6;
            if (bl2) {
                if (com.github.catvod.spider.merge.xc.E0.b.e(n2)) {
                    if (bl3 && !bl5 || bl6) continue;
                    if (bl4) {
                        n5 = 1;
                        continue;
                    }
                    appendable.append(' ');
                    bl6 = true;
                    continue;
                }
                n6 = n5;
                if (n5 != 0) {
                    appendable.append(' ');
                    n6 = 0;
                }
                bl8 = true;
                bl9 = false;
            }
            if (n2 < 65536) {
                char c2 = (char)n2;
                if (c2 != '\t' && c2 != '\n' && c2 != '\r') {
                    if (c2 != '\"') {
                        if (c2 != '&') {
                            if (c2 != '<') {
                                if (c2 != '>') {
                                    if (c2 != '\u00a0') {
                                        if (c2 >= ' ') {
                                            n5 = com.github.catvod.spider.merge.xc.y0.a.a(n3);
                                            if (n5 != 0) {
                                                if (n5 != 1) {
                                                    bl7 = charsetEncoder.canEncode(c2);
                                                }
                                            } else if (c2 >= '\u0080') {
                                                bl7 = false;
                                            }
                                            if (bl7) {
                                                appendable.append(c2);
                                                n5 = n6;
                                                bl5 = bl8;
                                                bl6 = bl9;
                                                continue;
                                            }
                                        }
                                        n.a(appendable, m2, n2);
                                        n5 = n6;
                                        bl5 = bl8;
                                        bl6 = bl9;
                                        continue;
                                    }
                                    if (m2 != m.e) {
                                        appendable.append("&nbsp;");
                                        n5 = n6;
                                        bl5 = bl8;
                                        bl6 = bl9;
                                        continue;
                                    }
                                    appendable.append("&#xa0;");
                                    n5 = n6;
                                    bl5 = bl8;
                                    bl6 = bl9;
                                    continue;
                                }
                                if (!bl) {
                                    appendable.append("&gt;");
                                    n5 = n6;
                                    bl5 = bl8;
                                    bl6 = bl9;
                                    continue;
                                }
                                appendable.append(c2);
                                n5 = n6;
                                bl5 = bl8;
                                bl6 = bl9;
                                continue;
                            }
                            if (bl && m2 != m.e && g2.h != 2) {
                                appendable.append(c2);
                                n5 = n6;
                                bl5 = bl8;
                                bl6 = bl9;
                                continue;
                            }
                            appendable.append("&lt;");
                            n5 = n6;
                            bl5 = bl8;
                            bl6 = bl9;
                            continue;
                        }
                        appendable.append("&amp;");
                        n5 = n6;
                        bl5 = bl8;
                        bl6 = bl9;
                        continue;
                    }
                    if (bl) {
                        appendable.append("&quot;");
                        n5 = n6;
                        bl5 = bl8;
                        bl6 = bl9;
                        continue;
                    }
                    appendable.append(c2);
                    n5 = n6;
                    bl5 = bl8;
                    bl6 = bl9;
                    continue;
                }
                appendable.append(c2);
                n5 = n6;
                bl5 = bl8;
                bl6 = bl9;
                continue;
            }
            String string2 = new String(Character.toChars(n2));
            if (charsetEncoder.canEncode(string2)) {
                appendable.append(string2);
                n5 = n6;
                bl5 = bl8;
                bl6 = bl9;
                continue;
            }
            n.a(appendable, m2, n2);
            bl6 = bl9;
            bl5 = bl8;
            n5 = n6;
        }
    }
}

