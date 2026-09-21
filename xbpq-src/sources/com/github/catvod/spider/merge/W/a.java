package com.github.catvod.spider.merge.W;

import com.github.catvod.spider.merge.U.b;
import com.github.catvod.spider.merge.U.h;
import com.github.catvod.spider.merge.c0.r;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.O;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a implements com.github.catvod.spider.merge.n0.a {
    public static String b(Throwable th) {
        ArrayList arrayList = new ArrayList();
        for (Throwable th2 = th; th2 != null && !arrayList.contains(th2); th2 = th2.getCause()) {
            arrayList.add(th2);
        }
        Throwable th3 = arrayList.isEmpty() ? null : (Throwable) arrayList.get(arrayList.size() - 1);
        if (th3 != null) {
            th = th3;
        }
        int i = b.e;
        String a = b.a(th.getClass());
        String message = th.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(cYh.d("5D70"));
        int i2 = h.a;
        if (message == null) {
            message = "";
        }
        sb.append(message);
        return sb.toString();
    }

    public static void c(O o, r rVar) {
        r rVar2 = rVar;
        int i = 0;
        while (rVar2 != null) {
            r A = rVar2.A();
            o.a(rVar2, i);
            if (A != null && !rVar2.q()) {
                rVar2 = A.g(rVar2.H());
            }
            if (rVar2.h() > 0) {
                rVar2 = rVar2.g(0);
                i++;
            } else {
                while (rVar2.s() == null && i > 0) {
                    o.b(rVar2, i);
                    rVar2 = rVar2.A();
                    i--;
                }
                o.b(rVar2, i);
                if (rVar2 == rVar) {
                    return;
                } else {
                    rVar2 = rVar2.s();
                }
            }
        }
    }

    @Override // com.github.catvod.spider.merge.n0.a
    public com.github.catvod.spider.merge.n0.b a(String str) {
        return com.github.catvod.spider.merge.p0.b.c;
    }
}
