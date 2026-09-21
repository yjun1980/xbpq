package com.github.catvod.spider.merge.R;

import com.github.catvod.spider.merge.P.H;
import com.github.catvod.spider.merge.P.I;
import com.github.catvod.spider.merge.cYh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c {
    private final b a;
    private final H b;

    public c(b bVar, H h) {
        this.a = bVar;
        this.b = h;
    }

    protected final String a(e eVar) {
        StringBuilder sb;
        int i = eVar.a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(eVar.d ? cYh.d("5D") : "");
        sb2.append(cYh.d("14"));
        sb2.append(i);
        sb2.append(eVar.g ? cYh.d("39") : "");
        String sb3 = sb2.toString();
        if (!eVar.d) {
            return sb3;
        }
        d[] dVarArr = eVar.h;
        String d = cYh.d("5A6E");
        if (dVarArr != null) {
            sb = new StringBuilder();
            sb.append(sb3);
            sb.append(d);
            sb.append(Arrays.toString(eVar.h));
        } else {
            sb = new StringBuilder();
            sb.append(sb3);
            sb.append(d);
            sb.append(eVar.e);
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.R.e, com.github.catvod.spider.merge.R.e>] */
    public final String toString() {
        if (this.a.b == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        b bVar = this.a;
        bVar.getClass();
        ArrayList arrayList = new ArrayList(bVar.a.keySet());
        Collections.sort(arrayList, new a());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            e[] eVarArr = eVar.c;
            int length = eVarArr != null ? eVarArr.length : 0;
            for (int i = 0; i < length; i++) {
                e eVar2 = eVar.c[i];
                if (eVar2 != null && eVar2.a != Integer.MAX_VALUE) {
                    sb.append(a(eVar));
                    String a = ((I) this.b).a(i - 1);
                    sb.append(cYh.d("4A"));
                    sb.append(a);
                    sb.append(cYh.d("4A6E"));
                    sb.append(a(eVar2));
                    sb.append('\n');
                }
            }
        }
        String sb2 = sb.toString();
        if (sb2.length() == 0) {
            return null;
        }
        return sb2;
    }
}
