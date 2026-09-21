package com.github.catvod.spider.merge.V;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class c extends i {
    /* JADX INFO: Access modifiers changed from: package-private */
    public c() {
        H();
        J();
        y(cYh.d("1C"));
        x(cYh.d("1A"));
        w();
        v();
        A(cYh.d("4B"));
        z();
        C();
        G();
        F();
        E();
        D();
    }

    @Override // com.github.catvod.spider.merge.V.i
    public final void a(StringBuffer stringBuffer, Object obj) {
        super.a(stringBuffer, obj);
    }

    @Override // com.github.catvod.spider.merge.V.i
    protected final void c(StringBuffer stringBuffer, char c) {
        String valueOf = String.valueOf(c);
        stringBuffer.append('\"');
        stringBuffer.append(com.github.catvod.spider.merge.U.g.a(valueOf));
        stringBuffer.append('\"');
    }

    @Override // com.github.catvod.spider.merge.V.i
    protected final void e(StringBuffer stringBuffer, String str, Object obj) {
        if (obj == null) {
            l(stringBuffer);
            return;
        }
        if ((obj instanceof String) || (obj instanceof Character)) {
            String obj2 = obj.toString();
            stringBuffer.append('\"');
            stringBuffer.append(com.github.catvod.spider.merge.U.g.a(obj2));
            stringBuffer.append('\"');
            return;
        }
        if ((obj instanceof Number) || (obj instanceof Boolean)) {
            stringBuffer.append(obj);
            return;
        }
        String obj3 = obj.toString();
        boolean z = false;
        if (!(obj3.startsWith(r()) && obj3.endsWith(q()))) {
            if (obj3.startsWith(p()) && obj3.endsWith(o())) {
                z = true;
            }
            if (!z) {
                e(stringBuffer, str, obj3);
                return;
            }
        }
        stringBuffer.append(obj);
    }

    @Override // com.github.catvod.spider.merge.V.i
    protected final void f(StringBuffer stringBuffer, String str, Collection<?> collection) {
        if (collection == null || collection.isEmpty()) {
            stringBuffer.append(collection);
            return;
        }
        stringBuffer.append(p());
        int i = 0;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            d(stringBuffer, str, i, it.next());
            i++;
        }
        stringBuffer.append(o());
    }

    @Override // com.github.catvod.spider.merge.V.i
    protected final void g(StringBuffer stringBuffer, Map map) {
        if (map == null || map.isEmpty()) {
            stringBuffer.append(map);
            return;
        }
        stringBuffer.append(r());
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            String obj = key != null ? key.toString() : null;
            if (obj != null) {
                if (z) {
                    z = false;
                } else {
                    i(stringBuffer);
                }
                j(stringBuffer, obj);
                Object value = entry.getValue();
                if (value == null) {
                    l(stringBuffer);
                } else {
                    k(stringBuffer, obj, value, true);
                }
            }
        }
        stringBuffer.append(q());
    }

    @Override // com.github.catvod.spider.merge.V.i
    protected final void j(StringBuffer stringBuffer, String str) {
        String d = cYh.d("45");
        StringBuilder b = C0059d.b(d);
        b.append(com.github.catvod.spider.merge.U.g.a(str));
        b.append(d);
        super.j(stringBuffer, b.toString());
    }
}
