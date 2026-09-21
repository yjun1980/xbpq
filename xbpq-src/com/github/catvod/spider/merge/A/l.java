/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.A;

import com.github.catvod.spider.merge.A.h;
import com.github.catvod.spider.merge.A.j;
import com.github.catvod.spider.merge.A.k;
import com.github.catvod.spider.merge.H.c;
import com.github.catvod.spider.merge.z.d;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

public final class l {
    private static String e = com.github.catvod.spider.merge.H.c.b(d.class);
    private static final Map<String, String> f = new k();
    private final String a;
    private final Class<?>[] b;
    protected h c;
    protected boolean d;

    public l(String string, Class<?>[] classArray) {
        this.a = string;
        this.b = classArray;
        this.c = null;
    }

    public final String[] a() {
        h h2 = this.c;
        if (h2 != null && h2.e) {
            return h2.a().split(",");
        }
        return new String[0];
    }

    public final boolean b() {
        return this.d;
    }

    public final void c(String string) {
        if (e.equals(string)) {
            this.d = true;
        }
    }

    protected final h d(int n2, String object, String object2) {
        int n3;
        if (this.c != null) {
            return null;
        }
        if (!((String)object).equals(this.a)) {
            return null;
        }
        j[] jArray = j.a((String)object2);
        int n4 = jArray.length;
        int n5 = 0;
        for (n3 = 0; n3 < n4; ++n3) {
            int n6;
            block13: {
                block12: {
                    object = jArray[n3].b();
                    if (((String)object).equals("long")) break block12;
                    n6 = n5;
                    if (!((String)object).equals("double")) break block13;
                }
                n6 = n5 + 1;
            }
            n5 = n6;
        }
        if (jArray.length != this.b.length) {
            return null;
        }
        for (n3 = 0; n3 < jArray.length; ++n3) {
            object = jArray[n3];
            String string = this.b[n3].getName();
            object = ((j)object).b();
            StringBuilder stringBuilder = new StringBuilder();
            while (((String)object).endsWith("[]")) {
                stringBuilder.append('[');
                object = ((String)object).substring(0, ((String)object).length() - 2);
            }
            object2 = object;
            if (stringBuilder.length() != 0) {
                object2 = (HashMap)f;
                if (((HashMap)object2).containsKey(object)) {
                    stringBuilder.append((String)((HashMap)object2).get(object));
                } else {
                    stringBuilder.append('L');
                    stringBuilder.append((String)object);
                    stringBuilder.append(';');
                }
                object2 = stringBuilder.toString();
            }
            if (((String)object2).equals(string)) continue;
            return null;
        }
        this.c = object = new h(Modifier.isStatic(n2) ^ 1, jArray.length + n5);
        return object;
    }
}

