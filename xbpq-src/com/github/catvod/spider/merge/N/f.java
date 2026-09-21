/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlinx.coroutines.internal.MainDispatcherFactory
 */
package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.J.c;
import com.github.catvod.spider.merge.L.t;
import com.github.catvod.spider.merge.N.h;
import com.github.catvod.spider.merge.cYh;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.internal.MainDispatcherFactory;

public final class f {
    public static final t a;

    /*
     * Loose catch block
     * Enabled aggressive exception aggregation
     */
    static {
        Object object;
        block13: {
            Object object2;
            object = h.c(cYh.d("0C3F353D3E341F7E223E25351224283F3229493620222374143533273E39027E2D3E363E0222"));
            if (object != null) {
                Boolean.parseBoolean((String)object);
            }
            List list = c.b(c.a(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator()));
            Iterator iterator = list.iterator();
            boolean bl = iterator.hasNext();
            Object var6_6 = null;
            if (!bl) {
                object = null;
            } else {
                object = iterator.next();
                if (iterator.hasNext()) {
                    int n2 = ((MainDispatcherFactory)object).getLoadPriority();
                    object2 = object;
                    do {
                        Object t2 = iterator.next();
                        int n3 = ((MainDispatcherFactory)t2).getLoadPriority();
                        object = object2;
                        int n4 = n2;
                        if (n2 < n3) {
                            object = t2;
                            n4 = n3;
                        }
                        object2 = object;
                        n2 = n4;
                    } while (iterator.hasNext());
                }
            }
            object2 = (MainDispatcherFactory)object;
            if (object2 == null) break block13;
            {
                catch (Throwable throwable) {}
                {
                    throw throwable;
                }
            }
            try {
                object = object2.createDispatcher(list);
            }
            catch (Throwable throwable) {
                object2.hintOnError();
                object = var6_6;
            }
            if (object != null) {
                a = object;
                return;
            }
        }
        object = new IllegalStateException(cYh.d("2A3F25243B3F472728253F7A133824711A3B0E3E61353E29173135323F3F1570282277370E233238393D49700035337A03353134393E023E2228772A153F37383333093761253F3F471D2038397A03393221362E043824237B7A027E267F777D0C3F353D3E341F7D223E25351224283F32294A312F3525350E34667136340370243F242F15356138237A0F3132712332027032303A3F472624232433083E6130247A403B2E253B3309286C32382808253538393F147D223E253F40"));
        throw object;
    }
}

