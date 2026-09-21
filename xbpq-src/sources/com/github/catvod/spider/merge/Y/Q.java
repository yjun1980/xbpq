package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;
import java.util.Date;
import java.util.TimeZone;

/* loaded from: classes.dex */
final class Q extends TimeZone {
    private final int c;
    private final String d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q(boolean z, int i, int i2) {
        if (i >= 24) {
            throw new IllegalArgumentException(i + cYh.d("47382E242529473F3425773501703330393D02"));
        }
        if (i2 >= 60) {
            throw new IllegalArgumentException(i2 + cYh.d("473D283F222E0223613E222E473F2771253B093724"));
        }
        int i3 = ((i * 60) + i2) * 60000;
        this.c = z ? -i3 : i3;
        StringBuilder sb = new StringBuilder(9);
        sb.append(cYh.d("201D15"));
        sb.append(z ? '-' : '+');
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
        sb.append(':');
        sb.append((char) ((i2 / 10) + 48));
        sb.append((char) ((i2 % 10) + 48));
        this.d = sb.toString();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Q) && this.d == ((Q) obj).d;
    }

    @Override // java.util.TimeZone
    public final String getID() {
        return this.d;
    }

    @Override // java.util.TimeZone
    public final int getOffset(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.c;
    }

    @Override // java.util.TimeZone
    public final int getRawOffset() {
        return this.c;
    }

    public final int hashCode() {
        return this.c;
    }

    @Override // java.util.TimeZone
    public final boolean inDaylightTime(Date date) {
        return false;
    }

    @Override // java.util.TimeZone
    public final void setRawOffset(int i) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        StringBuilder b = C0059d.b(cYh.d("3C172C2503330A351B3E393F4739256C75"));
        b.append(this.d);
        b.append(cYh.d("457C2E37312902247C"));
        b.append(this.c);
        b.append(']');
        return b.toString();
    }

    @Override // java.util.TimeZone
    public final boolean useDaylightTime() {
        return false;
    }
}
