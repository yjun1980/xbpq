/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e1;

import com.github.catvod.spider.merge.b1.a;
import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.d1.c;
import com.github.catvod.spider.merge.e1.g;
import com.github.catvod.spider.merge.e1.n;
import com.github.catvod.spider.merge.y.z;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.CharsetEncoder;
import java.util.HashMap;

public final class o {
    private static final char[] a = new char[]{',', ';'};
    private static final HashMap<String, String> b = new HashMap();
    private static final g c = new g();

    static void a(n n2, String object, int n3) {
        n.e(n2, new String[n3]);
        n.i(n2, new int[n3]);
        n.k(n2, new int[n3]);
        n.m(n2, new String[n3]);
        object = new com.github.catvod.spider.merge.f1.a(new StringReader((String)object), ((String)object).length());
        boolean bl = false;
        int n4 = 0;
        while (true) {
            block10: {
                int n5;
                int n6;
                String string;
                block9: {
                    if (((com.github.catvod.spider.merge.f1.a)object).w()) break;
                    string = ((com.github.catvod.spider.merge.f1.a)object).p('=');
                    ((com.github.catvod.spider.merge.f1.a)object).a();
                    n6 = Integer.parseInt(((com.github.catvod.spider.merge.f1.a)object).q(a), 36);
                    n5 = ((com.github.catvod.spider.merge.f1.a)object).u();
                    ((com.github.catvod.spider.merge.f1.a)object).a();
                    if (n5 != 44) break block9;
                    n5 = Integer.parseInt(((com.github.catvod.spider.merge.f1.a)object).p(';'), 36);
                    ((com.github.catvod.spider.merge.f1.a)object).a();
                }
                n5 = -1;
                int n7 = Integer.parseInt(((com.github.catvod.spider.merge.f1.a)object).p('&'), 36);
                ((com.github.catvod.spider.merge.f1.a)object).a();
                n.b((n)n2)[n4] = string;
                n.h((n)n2)[n4] = n6;
                n.j((n)n2)[n7] = n6;
                n.l((n)n2)[n7] = string;
                if (n5 == -1) break block10;
                HashMap<String, String> hashMap = b;
                String string2 = new String(new int[]{n6, n5}, 0, 2);
                hashMap.put(string, string2);
            }
            ++n4;
        }
        if (n4 == n3) {
            bl = true;
        }
        try {
            d.g(bl, "Unexpected count of entities loaded");
            return;
        }
        catch (Throwable throwable) {
            throw throwable;
        }
        finally {
            ((com.github.catvod.spider.merge.f1.a)object).d();
        }
    }

    private static void b(Appendable object, n object2, int n2) {
        String string = ((n)((Object)object2)).o(n2);
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
        int n2 = n.g.n(string);
        if (n2 != -1) {
            nArray[0] = n2;
            return 1;
        }
        return 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String d(String string) {
        g g2 = c;
        if (string == null) {
            return "";
        }
        StringBuilder stringBuilder = com.github.catvod.spider.merge.d1.c.b();
        try {
            o.e(stringBuilder, string, g2, false, false, false, false);
        }
        catch (IOException iOException) {
            throw new a(iOException);
        }
        return com.github.catvod.spider.merge.d1.c.i(stringBuilder);
    }

    static void e(Appendable appendable, String string, g g2, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        int n2;
        n n3 = g2.e();
        CharsetEncoder charsetEncoder = g2.d();
        int n4 = g2.d;
        int n5 = string.length();
        int n6 = 0;
        boolean bl5 = false;
        boolean bl6 = false;
        for (int i2 = 0; i2 < n5; i2 += Character.charCount(n2)) {
            boolean bl7;
            boolean bl8;
            int n7;
            block21: {
                String string2;
                block22: {
                    block14: {
                        char c2;
                        block15: {
                            block16: {
                                block17: {
                                    block18: {
                                        block19: {
                                            block20: {
                                                n2 = string.codePointAt(i2);
                                                boolean bl9 = true;
                                                n7 = n6;
                                                bl8 = bl5;
                                                bl7 = bl6;
                                                if (bl2) {
                                                    if (com.github.catvod.spider.merge.d1.c.e(n2)) {
                                                        if (bl3 && !bl5 || bl6) continue;
                                                        if (bl4) {
                                                            n6 = 1;
                                                            continue;
                                                        }
                                                        appendable.append(' ');
                                                        bl6 = true;
                                                        continue;
                                                    }
                                                    n7 = n6;
                                                    if (n6 != 0) {
                                                        appendable.append(' ');
                                                        n7 = 0;
                                                    }
                                                    bl8 = true;
                                                    bl7 = false;
                                                }
                                                if (n2 >= 65536) break block14;
                                                c2 = (char)n2;
                                                if (c2 == '\t' || c2 == '\n' || c2 == '\r') break block15;
                                                if (c2 == '\"') break block16;
                                                if (c2 == '&') break block17;
                                                if (c2 == '<') break block18;
                                                if (c2 == '>') break block19;
                                                if (c2 == '\u00a0') break block20;
                                                if (c2 < ' ') break block21;
                                                n6 = z.c(n4);
                                                if (n6 != 0) {
                                                    if (n6 != 1) {
                                                        bl9 = charsetEncoder.canEncode(c2);
                                                    }
                                                } else if (c2 >= '\u0080') {
                                                    bl9 = false;
                                                }
                                                if (bl9) break block15;
                                                break block21;
                                            }
                                            string2 = n3 != n.e ? "&nbsp;" : "&#xa0;";
                                            break block22;
                                        }
                                        if (bl) break block15;
                                        string2 = "&gt;";
                                        break block22;
                                    }
                                    if (bl && n3 != n.e && g2.j() != 2) break block15;
                                    string2 = "&lt;";
                                    break block22;
                                }
                                string2 = "&amp;";
                                break block22;
                            }
                            if (!bl) break block15;
                            string2 = "&quot;";
                            break block22;
                        }
                        appendable.append(c2);
                        n6 = n7;
                        bl5 = bl8;
                        bl6 = bl7;
                        continue;
                    }
                    string2 = new String(Character.toChars(n2));
                    if (!charsetEncoder.canEncode(string2)) break block21;
                }
                appendable.append(string2);
                n6 = n7;
                bl5 = bl8;
                bl6 = bl7;
                continue;
            }
            o.b(appendable, n3, n2);
            bl6 = bl7;
            bl5 = bl8;
            n6 = n7;
        }
    }

    public static boolean f(String string) {
        boolean bl = n.f.n(string) != -1;
        return bl;
    }

    public static boolean g(String string) {
        boolean bl = n.g.n(string) != -1;
        return bl;
    }
}

