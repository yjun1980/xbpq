/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.spider.merge.Lc.d
 *  com.github.catvod.spider.merge.gu.F
 *  com.github.catvod.spider.merge.gu.a
 *  com.github.catvod.spider.merge.gu.o
 *  com.github.catvod.spider.merge.h0.e
 *  com.github.catvod.spider.merge.h0.f
 */
package com.github.catvod.spider.merge.Dw;

import com.github.catvod.spider.merge.Dw.g;
import com.github.catvod.spider.merge.Dw.q;
import com.github.catvod.spider.merge.Dw.w;
import com.github.catvod.spider.merge.fb.b;
import com.github.catvod.spider.merge.gu.F;
import com.github.catvod.spider.merge.gu.G;
import com.github.catvod.spider.merge.gu.d;
import com.github.catvod.spider.merge.gu.e;
import com.github.catvod.spider.merge.gu.f;
import com.github.catvod.spider.merge.gu.j;
import com.github.catvod.spider.merge.gu.m;
import com.github.catvod.spider.merge.gu.o;
import com.github.catvod.spider.merge.lq.a;
import java.io.Serializable;
import java.nio.CharBuffer;
import java.util.LinkedList;
import java.util.List;

public final class v {
    private com.github.catvod.spider.merge.ej.g a;

    public v(com.github.catvod.spider.merge.ej.g g2) {
        this.a = g2;
    }

    public final List<b> a(String object) {
        Object object2;
        Serializable serializable;
        block15: {
            block14: {
                block13: {
                    block12: {
                        block11: {
                            block10: {
                                serializable = new LinkedList();
                                Object object32 = f.b(((String)object).length());
                                object2 = CharBuffer.allocate(((String)object).length());
                                ((CharBuffer)object2).put((String)object);
                                ((CharBuffer)object2).flip();
                                ((e)object32).a((CharBuffer)object2);
                                object = j.k(((e)object32).d());
                                object2 = new com.github.catvod.spider.merge.gu.a((d)object);
                                object = new m((F)object2);
                                object2 = new w((G)object);
                                object = new a();
                                ((com.github.catvod.spider.merge.gu.w)object2).v((o)object);
                                object = ((w)object2).H();
                                object2 = new com.github.catvod.spider.merge.h0.f(this.a);
                                object = (com.github.catvod.spider.merge.h0.e)object.e((com.github.catvod.spider.merge.Lc.d)object2);
                                if (!object.n()) break block10;
                                for (Object object32 : object.d()) {
                                    object = new b(object32);
                                    ((LinkedList)serializable).add(object);
                                }
                                return serializable;
                            }
                            try {
                                if (!object.p()) break block11;
                                for (Object object32 : object.e()) {
                                    object2 = new b(object32);
                                    ((LinkedList)serializable).add(object2);
                                }
                                return serializable;
                            }
                            catch (Exception exception) {
                                serializable = com.github.catvod.spider.merge.ka.d.b("Please check the syntax of your xpath expr or commit a ");
                                ((StringBuilder)serializable).append(q.b(exception));
                                g g2 = new g(((StringBuilder)serializable).toString(), exception);
                                throw g2;
                            }
                        }
                        if (!object.r()) break block12;
                        object = object.g();
                        object2 = new b(object);
                        ((LinkedList)serializable).add(object2);
                        return serializable;
                    }
                    if (!object.q()) break block13;
                    object2 = object.c();
                    object = new b(object2);
                    ((LinkedList)serializable).add(object);
                    return serializable;
                }
                if (!object.l()) break block14;
                object2 = object.a();
                object = new b(object2);
                ((LinkedList)serializable).add(object);
                return serializable;
            }
            if (!object.m()) break block15;
            object = object.b();
            object2 = new b(object);
            ((LinkedList)serializable).add(object2);
            return serializable;
        }
        object = object.g();
        object2 = new b(object);
        ((LinkedList)serializable).add(object2);
        return serializable;
    }
}

