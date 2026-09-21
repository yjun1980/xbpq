/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e1;

import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.e1.c;
import com.github.catvod.spider.merge.e1.g;
import com.github.catvod.spider.merge.e1.h;
import com.github.catvod.spider.merge.e1.o;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;

public final class a
implements Map.Entry<String, String>,
Cloneable {
    private static final String[] d = new String[]{"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};
    private static final Pattern e = Pattern.compile("[a-zA-Z_:][-a-zA-Z0-9_:.]*");
    private static final Pattern f = Pattern.compile("[^-a-zA-Z0-9_:.]");
    private static final Pattern g = Pattern.compile("[^\\x00-\\x1f\\x7f-\\x9f \"'/=]+");
    private static final Pattern h = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"'/=]");
    private String a;
    private String b;
    c c;

    public a(String string, String string2, c c2) {
        com.github.catvod.spider.merge.c1.d.j(string);
        string = string.trim();
        com.github.catvod.spider.merge.c1.d.h(string);
        this.a = string;
        this.b = string2;
        this.c = c2;
    }

    public static String b(String string, int n2) {
        Pattern pattern;
        String string2 = null;
        String string3 = null;
        if (n2 == 2 && !(pattern = e).matcher(string).matches()) {
            string2 = f.matcher(string).replaceAll("");
            string = string3;
            if (pattern.matcher(string2).matches()) {
                string = string2;
            }
            return string;
        }
        if (n2 == 1 && !(pattern = g).matcher(string).matches()) {
            string3 = h.matcher(string).replaceAll("");
            string = string2;
            if (pattern.matcher(string3).matches()) {
                string = string3;
            }
            return string;
        }
        return string;
    }

    static void d(String string, String string2, Appendable appendable, g g2) {
        boolean bl;
        block4: {
            block5: {
                boolean bl2;
                int n2;
                block6: {
                    appendable.append(string);
                    n2 = g2.j();
                    bl = bl2 = false;
                    if (n2 != 1) break block4;
                    if (string2 == null) break block5;
                    if (string2.isEmpty()) break block6;
                    bl = bl2;
                    if (!string2.equalsIgnoreCase(string)) break block4;
                }
                n2 = Arrays.binarySearch(d, com.github.catvod.spider.merge.K1.d.e(string)) >= 0 ? 1 : 0;
                bl = bl2;
                if (n2 == 0) break block4;
            }
            bl = true;
        }
        if (!bl) {
            appendable.append("=\"");
            o.e(appendable, com.github.catvod.spider.merge.e1.c.l(string2), g2, true, false, false, false);
            appendable.append('\"');
        }
    }

    public final String a() {
        return this.a;
    }

    public final String c() {
        return com.github.catvod.spider.merge.e1.c.l(this.b);
    }

    public final Object clone() {
        try {
            a a2 = (a)super.clone();
            return a2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
    }

    @Override
    public final boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (object != null && a.class == object.getClass()) {
            object = (a)object;
            String string = this.a;
            if (string != null ? !string.equals(((a)object).a) : ((a)object).a != null) {
                return false;
            }
            string = this.b;
            object = ((a)object).b;
            if (string != null) {
                bl = string.equals(object);
            } else if (object != null) {
                bl = false;
            }
            return bl;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        String string = this.a;
        int n2 = 0;
        int n3 = string != null ? string.hashCode() : 0;
        string = this.b;
        if (string != null) {
            n2 = string.hashCode();
        }
        return n3 * 31 + n2;
    }

    @Override
    public final Object setValue(Object object) {
        String string = (String)object;
        String string2 = this.b;
        c c2 = this.c;
        object = string2;
        if (c2 != null) {
            int n2 = c2.t(this.a);
            object = string2;
            if (n2 != -1) {
                object = this.c.o(this.a);
                this.c.c[n2] = string;
            }
        }
        this.b = string;
        return com.github.catvod.spider.merge.e1.c.l(object);
    }

    public final String toString() {
        StringBuilder stringBuilder;
        block3: {
            String string;
            g g2;
            Object object;
            stringBuilder = com.github.catvod.spider.merge.d1.c.b();
            try {
                object = new h("");
                g2 = ((h)object).B0();
                string = this.a;
                object = this.b;
                string = com.github.catvod.spider.merge.e1.a.b(string, g2.j());
                if (string == null) break block3;
            }
            catch (IOException iOException) {
                throw new com.github.catvod.spider.merge.b1.a(iOException);
            }
            com.github.catvod.spider.merge.e1.a.d(string, (String)object, stringBuilder, g2);
        }
        return com.github.catvod.spider.merge.d1.c.i(stringBuilder);
    }
}

