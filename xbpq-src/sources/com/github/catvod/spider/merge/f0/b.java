package com.github.catvod.spider.merge.f0;

import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.C0123g;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class b {
    private Object a;

    public b(Object obj) {
        this.a = obj;
    }

    public final String a() {
        Object obj = this.a;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            String n0 = lVar.n0();
            String d = cYh.d("2D081E05120233");
            return n0 == d || (n0 != null && n0.equals(d)) ? lVar.e0() : lVar.u();
        }
        return String.valueOf(obj);
    }

    public final List<b> b(String str) {
        if (this.a instanceof l) {
            return new a(new C0123g((l) this.a)).a(str);
        }
        return null;
    }

    public final b c(String str) {
        List<b> b = b(str);
        if (b == null) {
            return null;
        }
        LinkedList linkedList = (LinkedList) b;
        if (linkedList.size() > 0) {
            return (b) linkedList.get(0);
        }
        return null;
    }

    public final String toString() {
        return a();
    }
}
