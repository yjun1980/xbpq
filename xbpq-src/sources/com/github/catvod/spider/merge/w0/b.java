package com.github.catvod.spider.merge.w0;

import com.github.catvod.spider.merge.E.f;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.x.C0246d;
import com.github.catvod.spider.merge.x.InterfaceC0245c;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes.dex */
public final class b implements Interceptor {
    private final com.github.catvod.spider.merge.r0.a c;
    private final InterfaceC0245c d;

    public b(com.github.catvod.spider.merge.r0.a aVar) {
        f.e(aVar, cYh.d("04312239320913222025323D1E"));
        this.c = aVar;
        this.d = C0246d.a(a.c);
    }

    private final boolean a(int... iArr) {
        int b = this.c.b();
        for (int i : iArr) {
            if (i == b) {
                return true;
            }
        }
        return false;
    }

    private final Response b(Request request, long j) {
        Object value = this.d.getValue();
        f.d(value, cYh.d("5B3724257A39063329346972497E6F78"));
        this.c.getClass();
        Response response = ((com.github.catvod.spider.merge.r0.b) value).get();
        if (response == null) {
            return null;
        }
        long receivedResponseAtMillis = response.receivedResponseAtMillis();
        if (j == -1 || System.currentTimeMillis() - receivedResponseAtMillis <= j) {
            return response;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain r9) {
        /*
            r8 = this;
            java.lang.String r0 = "0438203839"
            java.lang.String r0 = com.github.catvod.spider.merge.cYh.d(r0)
            com.github.catvod.spider.merge.E.f.e(r9, r0)
            okhttp3.Request r0 = r9.request()
            r1 = 2
            int[] r2 = new int[r1]
            r2 = {x008a: FILL_ARRAY_DATA , data: [2, 4} // fill-array
            boolean r2 = r8.a(r2)
            r3 = 1
            r4 = 0
            r5 = 0
            if (r2 == 0) goto L39
            com.github.catvod.spider.merge.r0.a r2 = r8.c
            long r6 = r2.c()
            okhttp3.Response r2 = r8.b(r0, r6)
            if (r2 != 0) goto L3a
            int[] r2 = new int[r3]
            r2[r4] = r1
            boolean r1 = r8.a(r2)
            if (r1 != 0) goto L33
            goto L39
        L33:
            com.github.catvod.spider.merge.v0.a r9 = new com.github.catvod.spider.merge.v0.a
            r9.<init>()
            throw r9
        L39:
            r2 = r5
        L3a:
            if (r2 == 0) goto L3d
            return r2
        L3d:
            okhttp3.Response r9 = r9.proceed(r0)     // Catch: java.lang.Throwable -> L6f
            int[] r1 = new int[r3]     // Catch: java.lang.Throwable -> L6f
            r1[r4] = r3     // Catch: java.lang.Throwable -> L6f
            boolean r1 = r8.a(r1)     // Catch: java.lang.Throwable -> L6f
            if (r1 != 0) goto L6e
            com.github.catvod.spider.merge.x.c r9 = r8.d     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r9 = r9.getValue()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = "5B3724257A39063329346972497E6F78"
            java.lang.String r1 = com.github.catvod.spider.merge.cYh.d(r1)     // Catch: java.lang.Throwable -> L6f
            com.github.catvod.spider.merge.E.f.d(r9, r1)     // Catch: java.lang.Throwable -> L6f
            com.github.catvod.spider.merge.r0.b r9 = (com.github.catvod.spider.merge.r0.b) r9     // Catch: java.lang.Throwable -> L6f
            com.github.catvod.spider.merge.r0.a r1 = r8.c     // Catch: java.lang.Throwable -> L6f
            r1.getClass()     // Catch: java.lang.Throwable -> L6f
            okhttp3.Response r9 = r9.a()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = "1C5A6171777A47706171777A47706171777A487FA8CCC915291C180E191F33070E031CBCCFF1A4EDD8BEDFDB6DB9F8ED81E1C3B7DFCA82DADEBEEBD682D6D8B4D2FF80ECD2B4FAC26D706171777A47706171777A47706171773906332934792A122469233229173F2F223276473320323F3F34243330233F00296F3236390F350A342E736D706171777A47706171777A472D"
            java.lang.String r1 = com.github.catvod.spider.merge.cYh.d(r1)     // Catch: java.lang.Throwable -> L6f
            com.github.catvod.spider.merge.E.f.d(r9, r1)     // Catch: java.lang.Throwable -> L6f
        L6e:
            return r9
        L6f:
            r9 = move-exception
            int[] r1 = new int[r3]
            r2 = 5
            r1[r4] = r2
            boolean r1 = r8.a(r1)
            if (r1 == 0) goto L85
            com.github.catvod.spider.merge.r0.a r1 = r8.c
            long r1 = r1.c()
            okhttp3.Response r5 = r8.b(r0, r1)
        L85:
            if (r5 == 0) goto L88
            return r5
        L88:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.w0.b.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
