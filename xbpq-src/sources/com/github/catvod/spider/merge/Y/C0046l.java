package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.cYh;
import java.util.Calendar;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.Y.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0046l extends AbstractC0048n {
    private static final C0046l b = new C0046l(cYh.d("4F0A3D7968603C7B6C0C0B3E1C623C787E"));
    private static final C0046l c = new C0046l(cYh.d("4F0A3D7968603C7B6C0C0B3E1C623C0D3321552D6878"));
    private static final C0046l d = new C0046l(cYh.d("4F0A3D7968603C7B6C0C0B3E1C623C7968605D791D352C681A7968"));

    C0046l(String str) {
        this.a = Pattern.compile(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ AbstractC0049o d() {
        return d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC0049o e(int i) {
        if (i == 1) {
            return b;
        }
        if (i == 2) {
            return c;
        }
        if (i == 3) {
            return d;
        }
        throw new IllegalArgumentException(cYh.d("0E3E37303B3303702F243A380222613E317A3F"));
    }

    @Override // com.github.catvod.spider.merge.Y.AbstractC0048n
    final void c(Calendar calendar, String str) {
        calendar.setTimeZone(O.a(str));
    }
}
