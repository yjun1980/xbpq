package com.github.catvod.spider.merge.f0;

import com.github.catvod.spider.merge.P.AbstractC0009j;
import com.github.catvod.spider.merge.P.C0004e;
import com.github.catvod.spider.merge.P.C0005f;
import com.github.catvod.spider.merge.P.m;
import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;
import com.github.catvod.spider.merge.e0.C0123g;
import com.github.catvod.spider.merge.g0.C0143a;
import com.github.catvod.spider.merge.g0.D;
import com.github.catvod.spider.merge.h0.e;
import com.github.catvod.spider.merge.h0.f;
import com.github.catvod.spider.merge.l.C0187u;
import java.nio.CharBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class a {
    private C0123g a;

    public a(C0123g c0123g) {
        this.a = c0123g;
    }

    public final List<b> a(String str) {
        LinkedList linkedList = new LinkedList();
        try {
            C0004e b = C0005f.b(str.length());
            CharBuffer allocate = CharBuffer.allocate(str.length());
            allocate.put(str);
            allocate.flip();
            b.a(allocate);
            D d = new D(new m(new C0143a(AbstractC0009j.k(b.d()))));
            d.v(new com.github.catvod.spider.merge.l0.a());
            e eVar = (e) d.H().e(new f(this.a));
            if (eVar.n()) {
                Iterator<l> it = eVar.d().iterator();
                while (it.hasNext()) {
                    linkedList.add(new b(it.next()));
                }
                return linkedList;
            }
            if (eVar.p()) {
                Iterator<String> it2 = eVar.e().iterator();
                while (it2.hasNext()) {
                    linkedList.add(new b(it2.next()));
                }
                return linkedList;
            }
            if (eVar.r()) {
                linkedList.add(new b(eVar.g()));
                return linkedList;
            }
            if (eVar.q()) {
                linkedList.add(new b(eVar.c()));
                return linkedList;
            }
            if (eVar.l()) {
                linkedList.add(new b(eVar.a()));
                return linkedList;
            }
            if (eVar.m()) {
                linkedList.add(new b(eVar.b()));
                return linkedList;
            }
            linkedList.add(new b(eVar.g()));
            return linkedList;
        } catch (Exception e) {
            StringBuilder b2 = C0059d.b(cYh.d("373C2430243F4733293434314724293477291E3E35302F7A08366128382F15703921362E0F7024292728473F337134350A3D2825773B47"));
            b2.append(com.github.catvod.spider.merge.W.a.b(e));
            throw new C0187u(b2.toString(), e);
        }
    }
}
