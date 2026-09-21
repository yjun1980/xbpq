/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.B0;

import java.util.Date;
import java.util.TimeZone;

public final class F
extends TimeZone {
    public final int a;
    public final String b;

    public F(int n2, int n3, boolean bl) {
        if (n2 < 24) {
            if (n3 < 60) {
                int n4;
                int n5 = n4 = (n2 * 60 + n3) * 60000;
                if (bl) {
                    n5 = -n4;
                }
                this.a = n5;
                StringBuilder stringBuilder = new StringBuilder(9);
                stringBuilder.append("GMT");
                char c2 = bl ? (char)'-' : '+';
                stringBuilder.append(c2);
                stringBuilder.append((char)(n2 / 10 + 48));
                stringBuilder.append((char)(n2 % 10 + 48));
                stringBuilder.append(':');
                stringBuilder.append((char)(n3 / 10 + 48));
                stringBuilder.append((char)(n3 % 10 + 48));
                this.b = stringBuilder.toString();
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(n3);
            stringBuilder.append(" minutes out of range");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n2);
        stringBuilder.append(" hours out of range");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final boolean equals(Object object) {
        boolean bl = object instanceof F;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        object = ((F)object).b;
        if (this.b == object) {
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public final String getID() {
        return this.b;
    }

    @Override
    public final int getOffset(int n2, int n3, int n4, int n5, int n6, int n7) {
        return this.a;
    }

    @Override
    public final int getRawOffset() {
        return this.a;
    }

    public final int hashCode() {
        return this.a;
    }

    @Override
    public final boolean inDaylightTime(Date date) {
        return false;
    }

    @Override
    public final void setRawOffset(int n2) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[GmtTimeZone id=\"");
        stringBuilder.append(this.b);
        stringBuilder.append("\",offset=");
        stringBuilder.append(this.a);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    @Override
    public final boolean useDaylightTime() {
        return false;
    }
}

