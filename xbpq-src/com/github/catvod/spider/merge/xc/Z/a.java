/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.Z;

import java.io.Serializable;

public final class a
implements Serializable {
    public final String a;
    public final String b;
    public final String c;

    public a(String string, String string2) {
        this(string, string2, "");
    }

    public a(String string, String string2, String string3) {
        if (string2 != null) {
            String string4 = string;
            if (string == null) {
                string4 = "";
            }
            string = string3;
            if (string3 == null) {
                string = "";
            }
            this.a = string4;
            this.b = string2;
            this.c = string;
            return;
        }
        throw new IllegalArgumentException("Local part not allowed to be null");
    }

    public final boolean equals(Object object) {
        boolean bl = false;
        if (object == null) {
            return false;
        }
        if (!(object instanceof a)) {
            return false;
        }
        object = (a)object;
        boolean bl2 = bl;
        if (this.b.equals(((a)object).b)) {
            bl2 = bl;
            if (this.a.equals(((a)object).a)) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        String string = this.a;
        boolean bl = string.equals("");
        String string2 = this.b;
        if (bl) {
            return string2;
        }
        StringBuffer stringBuffer = new StringBuffer("{");
        stringBuffer.append(string);
        stringBuffer.append("}");
        stringBuffer.append(string2);
        return stringBuffer.toString();
    }
}

