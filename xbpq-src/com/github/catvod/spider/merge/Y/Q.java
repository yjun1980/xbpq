/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.d;
import java.util.Date;
import java.util.TimeZone;

final class Q
extends TimeZone {
    private final int c;
    private final String d;

    Q(boolean bl, int n2, int n3) {
        if (n2 < 24) {
            if (n3 < 60) {
                int n4;
                int n5 = n4 = (n2 * 60 + n3) * 60000;
                if (bl) {
                    n5 = -n4;
                }
                this.c = n5;
                StringBuilder stringBuilder = new StringBuilder(9);
                stringBuilder.append(cYh.d("201D15"));
                char c2 = bl ? (char)'-' : '+';
                stringBuilder.append(c2);
                stringBuilder.append((char)(n2 / 10 + 48));
                stringBuilder.append((char)(n2 % 10 + 48));
                stringBuilder.append(':');
                stringBuilder.append((char)(n3 / 10 + 48));
                stringBuilder.append((char)(n3 % 10 + 48));
                this.d = stringBuilder.toString();
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(n3);
            stringBuilder.append(cYh.d("473D283F222E0223613E222E473F2771253B093724"));
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n2);
        stringBuilder.append(cYh.d("47382E242529473F3425773501703330393D02"));
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final boolean equals(Object object) {
        boolean bl = object instanceof Q;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        if (this.d == ((Q)object).d) {
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public final String getID() {
        return this.d;
    }

    @Override
    public final int getOffset(int n2, int n3, int n4, int n5, int n6, int n7) {
        return this.c;
    }

    @Override
    public final int getRawOffset() {
        return this.c;
    }

    public final int hashCode() {
        return this.c;
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
        StringBuilder stringBuilder = com.github.catvod.spider.merge.d.d.b(cYh.d("3C172C2503330A351B3E393F4739256C75"));
        stringBuilder.append(this.d);
        stringBuilder.append(cYh.d("457C2E37312902247C"));
        stringBuilder.append(this.c);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    @Override
    public final boolean useDaylightTime() {
        return false;
    }
}

