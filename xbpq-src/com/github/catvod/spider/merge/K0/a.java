/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.K0;

import java.io.Serializable;

public final class a
implements Serializable {
    private String a;
    private String b;
    private String c;

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

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.c;
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
        if (this.a.equals("")) {
            return this.b;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{");
        stringBuffer.append(this.a);
        stringBuffer.append("}");
        stringBuffer.append(this.b);
        return stringBuffer.toString();
    }
}

