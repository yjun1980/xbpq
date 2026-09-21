package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;
import java.io.IOException;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final class N implements Serializable {
    private static final z[] h = new z[0];
    private static final ConcurrentMap<C, String> i = new ConcurrentHashMap(7);
    private final String c;
    private final TimeZone d;
    private final Locale e;
    private transient z[] f;
    private transient int g;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x00e4. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x00e8. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x00eb. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x020e A[LOOP:2: B:118:0x020a->B:120:0x020e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public N(java.lang.String r17, java.util.TimeZone r18, java.util.Locale r19) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Y.N.<init>(java.lang.String, java.util.TimeZone, java.util.Locale):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Appendable appendable, int i2) {
        StringBuilder sb = (StringBuilder) appendable;
        sb.append((char) ((i2 / 10) + 48));
        sb.append((char) ((i2 % 10) + 48));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Appendable appendable, int i2, int i3) {
        if (i2 < 10000) {
            int i4 = i2 < 1000 ? i2 < 100 ? i2 < 10 ? 1 : 2 : 3 : 4;
            for (int i5 = i3 - i4; i5 > 0; i5--) {
                ((StringBuilder) appendable).append('0');
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            return;
                        }
                        ((StringBuilder) appendable).append((char) ((i2 / 1000) + 48));
                        i2 %= 1000;
                    }
                    if (i2 >= 100) {
                        ((StringBuilder) appendable).append((char) ((i2 / 100) + 48));
                        i2 %= 100;
                    } else {
                        ((StringBuilder) appendable).append('0');
                    }
                }
                if (i2 >= 10) {
                    ((StringBuilder) appendable).append((char) ((i2 / 10) + 48));
                    i2 %= 10;
                } else {
                    ((StringBuilder) appendable).append('0');
                }
            }
            ((StringBuilder) appendable).append((char) (i2 + 48));
            return;
        }
        char[] cArr = new char[10];
        int i6 = 0;
        while (i2 != 0) {
            cArr[i6] = (char) ((i2 % 10) + 48);
            i2 /= 10;
            i6++;
        }
        while (i6 < i3) {
            ((StringBuilder) appendable).append('0');
            i3--;
        }
        while (true) {
            i6--;
            if (i6 < 0) {
                return;
            } else {
                ((StringBuilder) appendable).append(cArr[i6]);
            }
        }
    }

    private String c(Calendar calendar) {
        StringBuilder sb = new StringBuilder(this.g);
        try {
            for (z zVar : this.f) {
                zVar.c(sb, calendar);
            }
            return sb.toString();
        } catch (IOException e) {
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.concurrent.ConcurrentMap<com.github.catvod.spider.merge.Y.C, java.lang.String>, java.util.concurrent.ConcurrentHashMap] */
    public static String h(TimeZone timeZone, boolean z, int i2, Locale locale) {
        C c = new C(timeZone, z, i2, locale);
        ?? r1 = i;
        String str = (String) r1.get(c);
        if (str != null) {
            return str;
        }
        String displayName = timeZone.getDisplayName(z, i2, locale);
        String str2 = (String) r1.putIfAbsent(c, displayName);
        return str2 != null ? str2 : displayName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String d(Object obj) {
        if (obj instanceof Date) {
            Calendar calendar = Calendar.getInstance(this.d, this.e);
            calendar.setTime((Date) obj);
            return c(calendar);
        }
        if (obj instanceof Calendar) {
            Calendar calendar2 = (Calendar) obj;
            StringBuilder sb = new StringBuilder(this.g);
            if (!calendar2.getTimeZone().equals(this.d)) {
                calendar2 = (Calendar) calendar2.clone();
                calendar2.setTimeZone(this.d);
            }
            try {
                for (z zVar : this.f) {
                    zVar.c(sb, calendar2);
                }
                return sb.toString();
            } catch (IOException e) {
                throw e;
            }
        }
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            Calendar calendar3 = Calendar.getInstance(this.d, this.e);
            calendar3.setTimeInMillis(longValue);
            return c(calendar3);
        }
        StringBuilder b = C0059d.b(cYh.d("323E2A3F382D0970223D3629146A61"));
        b.append(obj == null ? cYh.d("5B3E343D3B64") : obj.getClass().getName());
        throw new IllegalArgumentException(b.toString());
    }

    public final Locale e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof N)) {
            return false;
        }
        N n = (N) obj;
        return this.c.equals(n.c) && this.d.equals(n.d) && this.e.equals(n.e);
    }

    public final String f() {
        return this.c;
    }

    public final TimeZone g() {
        return this.d;
    }

    public final int hashCode() {
        return (((this.e.hashCode() * 13) + this.d.hashCode()) * 13) + this.c.hashCode();
    }

    protected final x i(int i2, int i3) {
        return i3 != 1 ? i3 != 2 ? new y(i2, i3) : new I(i2) : new L(i2);
    }

    public final String toString() {
        StringBuilder b = C0059d.b(cYh.d("21313225133B133511233E341335330A"));
        b.append(this.c);
        String d = cYh.d("4B");
        b.append(d);
        b.append(this.e);
        b.append(d);
        b.append(this.d.getID());
        b.append(cYh.d("3A"));
        return b.toString();
    }
}
