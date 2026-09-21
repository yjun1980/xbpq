package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.cYh;
import java.util.Locale;

/* loaded from: classes.dex */
public final class t extends z {
    private final int h;

    public t(s sVar, InterfaceC0003d interfaceC0003d, int i) {
        super(sVar, interfaceC0003d, null);
        this.h = i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String str;
        String d;
        int i = this.h;
        if (i < 0 || i >= ((InterfaceC0003d) b()).size()) {
            str = "";
        } else {
            InterfaceC0003d interfaceC0003d = (InterfaceC0003d) b();
            int i2 = this.h;
            String h = interfaceC0003d.h(com.github.catvod.spider.merge.S.i.b(i2, i2));
            StringBuilder sb = new StringBuilder();
            for (char c : h.toCharArray()) {
                if (c == '\t') {
                    d = cYh.d("3B24");
                } else if (c == '\n') {
                    d = cYh.d("3B3E");
                } else if (c == '\r') {
                    d = cYh.d("3B22");
                } else {
                    sb.append(c);
                }
                sb.append(d);
            }
            str = sb.toString();
        }
        return String.format(Locale.getDefault(), cYh.d("4223697672294079"), t.class.getSimpleName(), str);
    }
}
