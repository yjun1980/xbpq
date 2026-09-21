/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.E;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.Rz;
import com.github.catvod.spider.merge.Y9;
import com.github.catvod.spider.merge.g9;
import com.github.catvod.spider.merge.tv;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import javax.annotation.Nullable;

public class in
implements Map.Entry<String, String>,
Cloneable {
    private static final String[] l8 = new String[]{"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};
    private String S;
    @Nullable
    private String T4;
    @Nullable
    Rz b;

    public in(String string, @Nullable String string2, @Nullable Rz rz) {
        Rc.HM(string);
        string = string.trim();
        Rc.tT(string);
        this.S = string;
        this.T4 = string2;
        this.b = rz;
    }

    protected static boolean HM(String string, @Nullable String string2, g9.aA aA2) {
        boolean bl = aA2.n() == g9.aA.aA.l8 && (string2 == null || (string2.isEmpty() || string2.equalsIgnoreCase(string)) && in.tT(string));
        return bl;
    }

    protected static void l(String string, @Nullable String string2, Appendable appendable, g9.aA aA2) {
        appendable.append(string);
        if (!in.HM(string, string2, aA2)) {
            appendable.append("=\"");
            Y9.OL(appendable, Rz.N(string2), aA2, true, false, false);
            appendable.append('\"');
        }
    }

    protected static boolean tT(String string) {
        boolean bl = Arrays.binarySearch(l8, string) >= 0;
        return bl;
    }

    public String N(String string) {
        Object object = this.T4;
        Object object2 = this.b;
        if (object2 != null) {
            object2 = ((Rz)object2).v(this.S);
            int n2 = this.b.E9(this.S);
            object = object2;
            if (n2 != -1) {
                this.b.T4[n2] = string;
                object = object2;
            }
        }
        this.T4 = string;
        return Rz.N((String)object);
    }

    protected void OL(Appendable appendable, g9.aA aA2) {
        in.l(this.S, this.T4, appendable, aA2);
    }

    public String S() {
        return this.S;
    }

    public String T4() {
        return Rz.N(this.T4);
    }

    public String b() {
        StringBuilder stringBuilder = tv.S();
        try {
            g9 g92 = new g9("");
            this.OL(stringBuilder, g92.K());
        }
        catch (IOException iOException) {
            throw new E(iOException);
        }
        return tv.cD(stringBuilder);
    }

    @Override
    public boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (object != null && in.class == object.getClass()) {
            object = (in)object;
            String string = this.S;
            if (string != null ? !string.equals(((in)object).S) : ((in)object).S != null) {
                return false;
            }
            string = this.T4;
            object = ((in)object).T4;
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
    public int hashCode() {
        String string = this.S;
        int n2 = 0;
        int n3 = string != null ? string.hashCode() : 0;
        string = this.T4;
        if (string != null) {
            n2 = string.hashCode();
        }
        return n3 * 31 + n2;
    }

    public in l8() {
        try {
            in in2 = (in)super.clone();
            return in2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
    }

    public String toString() {
        return this.b();
    }
}

