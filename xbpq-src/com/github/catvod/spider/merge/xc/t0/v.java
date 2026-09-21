/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.t0;

import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.q0.e;
import com.github.catvod.spider.merge.xc.q0.h;
import com.github.catvod.spider.merge.xc.t0.B;
import com.github.catvod.spider.merge.xc.t0.a;
import com.github.catvod.spider.merge.xc.t0.u;
import com.github.catvod.spider.merge.xc.t0.w;
import java.util.Iterator;
import java.util.ServiceLoader;

public abstract class v {
    public static final w a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object;
        block11: {
            Throwable throwable2;
            block10: {
                Iterator<u> iterator;
                block9: {
                    int n2 = B.a;
                    try {
                        object = System.getProperty("kotlinx.coroutines.fast.service.loader");
                    }
                    catch (SecurityException securityException) {
                        object = null;
                    }
                    boolean bl = object != null ? Boolean.parseBoolean((String)object) : true;
                    if (bl) {
                        try {
                            object = com.github.catvod.spider.merge.xc.t0.a.c();
                            break block9;
                        }
                        catch (Throwable throwable2) {
                            break block10;
                        }
                    }
                    iterator = ServiceLoader.load(u.class, u.class.getClassLoader()).iterator();
                    i.e(iterator, "<this>");
                    object = new com.github.catvod.spider.merge.xc.q0.i(1, iterator);
                    if (!(object instanceof com.github.catvod.spider.merge.xc.q0.a)) {
                        object = new com.github.catvod.spider.merge.xc.q0.a((com.github.catvod.spider.merge.xc.q0.i)object);
                    }
                    object = h.S((e)object);
                }
                iterator = object.iterator();
                if (!iterator.hasNext()) {
                    object = null;
                } else {
                    object = iterator.next();
                    if (iterator.hasNext()) {
                        m.n(object);
                        throw null;
                    }
                }
                m.n(object);
                object = new w(null, null);
                break block11;
            }
            object = new w(null, throwable2);
        }
        a = object;
    }
}

