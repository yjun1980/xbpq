/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D1;

import com.github.catvod.spider.merge.D1.C;
import com.github.catvod.spider.merge.D1.E;
import com.github.catvod.spider.merge.D1.l;
import com.github.catvod.spider.merge.K1.d;
import com.github.catvod.spider.merge.K1.p;
import com.github.catvod.spider.merge.n1.i;
import java.util.HashMap;
import java.util.Map;

public final class m {
    private static final Map<String, String> a = new HashMap<String, String>();
    private static String b;
    private static String c;
    private static String d;
    private static String e;
    private static i f;
    private static i g;

    public static String a(String string, String string2) {
        i i2 = g;
        if (i2 == null) {
            if (b == null) {
                b = l.c(string);
            }
            if (c == null) {
                try {
                    c = C.b(b);
                }
                catch (Exception exception) {
                    g = new i("Could not get signature parameter deobfuscation JavaScript function", exception);
                    throw exception;
                }
                catch (i i4) {
                    g = i4;
                    throw i4;
                }
            }
            try {
                string = com.github.catvod.spider.merge.K1.d.j(c, "deobfuscate", string2);
                if (string == null) {
                    string = "";
                }
                return string;
            }
            catch (Exception exception) {
                throw new i("Could not run signature parameter deobfuscation JavaScript function", exception);
            }
        }
        throw i2;
    }

    public static String b(String object, String string) {
        String string2 = E.c(string);
        if (string2 == null) {
            return string;
        }
        Map<String, String> map = a;
        String string3 = (String)((HashMap)map).get(string2);
        if (string3 != null) {
            return string.replace(string2, string3);
        }
        if (b == null) {
            b = l.c((String)object);
        }
        if ((object = f) == null) {
            if (e == null) {
                try {
                    d = object = E.b(b);
                    e = E.a(b, (String)object);
                }
                catch (Exception exception) {
                    f = new i("Could not get throttling parameter deobfuscation JavaScript function", exception);
                    throw exception;
                }
                catch (i i2) {
                    f = i2;
                    throw i2;
                }
            }
            try {
                object = com.github.catvod.spider.merge.K1.d.j(e, d, string2);
                if (!p.j((String)object)) {
                    ((HashMap)map).put(string2, (String)object);
                    return string.replace(string2, (CharSequence)object);
                }
                object = new IllegalStateException("Extracted n-parameter is empty");
                throw object;
            }
            catch (Exception exception) {
                throw new i("Could not run throttling parameter deobfuscation JavaScript function", exception);
            }
        }
        throw object;
    }
}

