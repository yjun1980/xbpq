/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f0;

import com.github.catvod.spider.merge.P.F;
import com.github.catvod.spider.merge.P.e;
import com.github.catvod.spider.merge.P.f;
import com.github.catvod.spider.merge.P.j;
import com.github.catvod.spider.merge.P.m;
import com.github.catvod.spider.merge.P.w;
import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.d;
import com.github.catvod.spider.merge.e0.g;
import com.github.catvod.spider.merge.f0.b;
import com.github.catvod.spider.merge.g0.D;
import com.github.catvod.spider.merge.g0.n;
import com.github.catvod.spider.merge.l.u;
import java.nio.CharBuffer;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public final class a {
    private g a;

    public a(g g2) {
        this.a = g2;
    }

    public final List<b> a(String object4) {
        com.github.catvod.spider.merge.h0.e e2;
        Object object;
        LinkedList<b> linkedList;
        block15: {
            block14: {
                block13: {
                    block12: {
                        block11: {
                            block10: {
                                linkedList = new LinkedList<b>();
                                object = f.b(((String)object4).length());
                                Object object2 = CharBuffer.allocate(((String)object4).length());
                                ((CharBuffer)object2).put((String)object4);
                                ((CharBuffer)object2).flip();
                                ((e)object).a((CharBuffer)object2);
                                j j2 = j.k(((e)object).d());
                                object = new com.github.catvod.spider.merge.g0.a(j2);
                                m m2 = new m((F)object);
                                object = new D(m2);
                                com.github.catvod.spider.merge.l0.a a2 = new com.github.catvod.spider.merge.l0.a();
                                ((w)object).v(a2);
                                object = ((D)object).H();
                                com.github.catvod.spider.merge.h0.f f2 = new com.github.catvod.spider.merge.h0.f(this.a);
                                e2 = ((n)object).e(f2);
                                if (!e2.n()) break block10;
                                for (l l2 : e2.d()) {
                                    object2 = new b(l2);
                                    linkedList.add((b)object2);
                                }
                                return linkedList;
                            }
                            try {
                                if (!e2.p()) break block11;
                                for (String string : e2.e()) {
                                    object = new b(string);
                                    linkedList.add((b)object);
                                }
                                return linkedList;
                            }
                            catch (Exception exception) {
                                StringBuilder stringBuilder = d.b(cYh.d("373C2430243F4733293434314724293477291E3E35302F7A08366128382F15703921362E0F7024292728473F337134350A3D2825773B47"));
                                stringBuilder.append(com.github.catvod.spider.merge.W.a.b(exception));
                                u u2 = new u(stringBuilder.toString(), exception);
                                throw u2;
                            }
                        }
                        if (!e2.r()) break block12;
                        object = e2.g();
                        b b2 = new b(object);
                        linkedList.add(b2);
                        return linkedList;
                    }
                    if (!e2.q()) break block13;
                    Double d2 = e2.c();
                    object = new b(d2);
                    linkedList.add((b)object);
                    return linkedList;
                }
                if (!e2.l()) break block14;
                Boolean bl = e2.a();
                object = new b(bl);
                linkedList.add((b)object);
                return linkedList;
            }
            if (!e2.m()) break block15;
            Date date = e2.b();
            object = new b(date);
            linkedList.add((b)object);
            return linkedList;
        }
        object = e2.g();
        b b3 = new b(object);
        linkedList.add(b3);
        return linkedList;
    }
}

