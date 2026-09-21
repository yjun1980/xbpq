/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.F0;

import com.github.catvod.spider.merge.xc.E0.b;
import com.github.catvod.spider.merge.xc.F0.c;
import com.github.catvod.spider.merge.xc.F0.g;
import com.github.catvod.spider.merge.xc.F0.h;
import com.github.catvod.spider.merge.xc.F0.n;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;

public final class a
implements Map.Entry,
Cloneable {
    public static final String[] d = new String[]{"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};
    public static final Pattern e = Pattern.compile("[a-zA-Z_:][-a-zA-Z0-9_:.]*");
    public static final Pattern f = Pattern.compile("[^-a-zA-Z0-9_:.]");
    public static final Pattern g = Pattern.compile("[^\\x00-\\x1f\\x7f-\\x9f \"'/=]+");
    public static final Pattern h = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"'/=]");
    public final String a;
    public String b;
    public c c;

    public a(String string, String string2, c c2) {
        com.github.catvod.spider.merge.xc.D0.b.A(string);
        string = string.trim();
        com.github.catvod.spider.merge.xc.D0.b.y(string);
        this.a = string;
        this.b = string2;
        this.c = c2;
    }

    public static String a(int n2, String string) {
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

    public static void b(String string, String string2, Appendable appendable, g g2) {
        appendable.append(string);
        if (g2.h != 1 || string2 != null && (!string2.isEmpty() && !string2.equalsIgnoreCase(string) || Arrays.binarySearch(d, com.github.catvod.spider.merge.xc.D0.b.u(string)) < 0)) {
            appendable.append("=\"");
            string = string2;
            if (string2 == null) {
                string = "";
            }
            n.b(appendable, string, g2, true, false, false, false);
            appendable.append('\"');
        }
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
            String string = ((a)object).a;
            String string2 = this.a;
            if (string2 != null ? !string2.equals(string) : string != null) {
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

    public final Object getKey() {
        return this.a;
    }

    public final Object getValue() {
        String string;
        String string2 = string = this.b;
        if (string == null) {
            string2 = "";
        }
        return string2;
    }

    @Override
    public final int hashCode() {
        int n2 = 0;
        String string = this.a;
        int n3 = string != null ? string.hashCode() : 0;
        string = this.b;
        if (string != null) {
            n2 = string.hashCode();
        }
        return n3 * 31 + n2;
    }

    public final Object setValue(Object object) {
        String string = (String)object;
        Object object2 = this.b;
        c c2 = this.c;
        object = object2;
        if (c2 != null) {
            String string2 = this.a;
            int n2 = c2.g(string2);
            object = object2;
            if (n2 != -1) {
                object = this.c.d(string2);
                this.c.c[n2] = string;
            }
        }
        this.b = string;
        object2 = object;
        if (object == null) {
            object2 = "";
        }
        return object2;
    }

    public final String toString() {
        StringBuilder stringBuilder;
        block3: {
            String string;
            g g2;
            Object object;
            stringBuilder = com.github.catvod.spider.merge.xc.E0.b.b();
            try {
                object = new h("");
                g2 = ((h)object).j;
                string = this.b;
                object = com.github.catvod.spider.merge.xc.F0.a.a(g2.h, this.a);
                if (object == null) break block3;
            }
            catch (IOException iOException) {
                throw new com.github.catvod.spider.merge.xc.C0.a(iOException);
            }
            com.github.catvod.spider.merge.xc.F0.a.b((String)object, string, stringBuilder, g2);
        }
        return com.github.catvod.spider.merge.xc.E0.b.g(stringBuilder);
    }
}

