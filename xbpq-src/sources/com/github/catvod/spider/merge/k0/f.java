package com.github.catvod.spider.merge.k0;

import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.c0.r;
import com.github.catvod.spider.merge.c0.u;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.C0123g;
import com.github.catvod.spider.merge.e0.O;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes.dex */
final class f implements O {
    final /* synthetic */ Map a;
    final /* synthetic */ C0123g b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Map map, C0123g c0123g) {
        this.a = map;
        this.b = c0123g;
    }

    @Override // com.github.catvod.spider.merge.e0.O
    public final void a(r rVar, int i) {
        if (rVar instanceof u) {
            u uVar = (u) rVar;
            String str = i + cYh.d("38") + uVar.z().hashCode();
            Integer num = (Integer) this.a.get(str);
            Integer valueOf = num == null ? 1 : Integer.valueOf(num.intValue() + 1);
            this.a.put(str, valueOf);
            l lVar = new l(cYh.d("2D081E05120233"));
            lVar.o0(uVar.L());
            try {
                Method declaredMethod = r.class.getDeclaredMethod(cYh.d("143535013628023E351F383E02"), r.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(lVar, uVar.z());
            } catch (Exception unused) {
            }
            com.github.catvod.spider.merge.j.l.f(lVar, valueOf.intValue());
            this.b.add(lVar);
        }
    }

    @Override // com.github.catvod.spider.merge.e0.O
    public final void b(r rVar, int i) {
    }
}
