package com.github.catvod.spider.merge.l;

import com.github.catvod.spider.merge.cYh;
import java.util.Arrays;

/* renamed from: com.github.catvod.spider.merge.l.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0176j {
    private final String a;
    private final C0175i b;
    private C0175i c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0176j(String str) {
        C0175i c0175i = new C0175i();
        this.b = c0175i;
        this.c = c0175i;
        this.a = str;
    }

    public final C0176j a(Object obj) {
        C0175i c0175i = new C0175i();
        this.c.b = c0175i;
        this.c = c0175i;
        c0175i.a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        C0175i c0175i = this.b.b;
        String str = "";
        while (c0175i != null) {
            Object obj = c0175i.a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            }
            c0175i = c0175i.b;
            str = cYh.d("4B70");
        }
        sb.append('}');
        return sb.toString();
    }
}
