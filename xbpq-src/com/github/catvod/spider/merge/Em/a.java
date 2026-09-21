/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Em;

import com.github.catvod.spider.merge.Dw.e;
import com.github.catvod.spider.merge.Dw.i;
import com.github.catvod.spider.merge.Dw.q;
import com.github.catvod.spider.merge.Em.c;
import com.github.catvod.spider.merge.Em.g;
import com.github.catvod.spider.merge.Em.h;
import com.github.catvod.spider.merge.Em.n;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

public final class a
implements Map.Entry<String, String>,
Cloneable {
    private static final String[] f = new String[]{"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};
    private String c;
    private String d;
    c e;

    public a(String string, String string2, c c2) {
        i.k(string);
        string = string.trim();
        i.i(string);
        this.c = string;
        this.d = string2;
        this.e = c2;
    }

    protected static boolean c(String string, String string2, g g2) {
        boolean bl;
        block2: {
            block3: {
                boolean bl2;
                int n2;
                block4: {
                    n2 = g2.g();
                    bl = bl2 = false;
                    if (n2 != 1) break block2;
                    if (string2 == null) break block3;
                    if (string2.isEmpty()) break block4;
                    bl = bl2;
                    if (!string2.equalsIgnoreCase(string)) break block2;
                }
                n2 = Arrays.binarySearch(f, string) >= 0 ? 1 : 0;
                bl = bl2;
                if (n2 == 0) break block2;
            }
            bl = true;
        }
        return bl;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        String string;
        String string2 = string = this.d;
        if (string == null) {
            string2 = "";
        }
        return string2;
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
            Object object2 = (a)object;
            object = this.c;
            if (object != null ? !((String)object).equals(((a)object2).c) : ((a)object2).c != null) {
                return false;
            }
            object = this.d;
            object2 = ((a)object2).d;
            if (object != null) {
                bl = ((String)object).equals(object2);
            } else if (object2 != null) {
                bl = false;
            }
            return bl;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.c;
    }

    @Override
    public final Object getValue() {
        String string;
        String string2 = string = this.d;
        if (string == null) {
            string2 = "";
        }
        return string2;
    }

    @Override
    public final int hashCode() {
        String string = this.c;
        int n2 = 0;
        int n3 = string != null ? string.hashCode() : 0;
        string = this.d;
        if (string != null) {
            n2 = string.hashCode();
        }
        return n3 * 31 + n2;
    }

    @Override
    public final Object setValue(Object object) {
        String string = (String)object;
        object = this.d;
        Object object2 = this.e;
        if (object2 != null) {
            object2 = ((c)object2).j(this.c);
            int n2 = this.e.o(this.c);
            object = object2;
            if (n2 != -1) {
                this.e.e[n2] = string;
                object = object2;
            }
        }
        this.d = string;
        object2 = object;
        if (object == null) {
            object2 = "";
        }
        return object2;
    }

    public final String toString() {
        StringBuilder stringBuilder;
        block3: {
            g g2;
            Object object;
            block4: {
                stringBuilder = com.github.catvod.spider.merge.Dw.e.a();
                try {
                    object = new h();
                    g2 = ((h)object).s0();
                    object = this.c;
                    String string = this.d;
                    stringBuilder.append((CharSequence)object);
                    if (a.c((String)object, string, g2)) break block3;
                    stringBuilder.append((CharSequence)"=\"");
                    object = string;
                    if (string != null) break block4;
                    object = "";
                }
                catch (IOException iOException) {
                    throw new q((Throwable)iOException);
                }
            }
            n.d(stringBuilder, (String)object, g2, true, false, false);
            stringBuilder.append('\"');
        }
        return com.github.catvod.spider.merge.Dw.e.g(stringBuilder);
    }
}

