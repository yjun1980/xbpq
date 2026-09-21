package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.L.t;
import com.github.catvod.spider.merge.cYh;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.internal.MainDispatcherFactory;

/* loaded from: classes.dex */
public final class f {
    public static final t a;

    static {
        Object next;
        String c = h.c(cYh.d("0C3F353D3E341F7E223E25351224283F3229493620222374143533273E39027E2D3E363E0222"));
        if (c != null) {
            Boolean.parseBoolean(c);
        }
        List b = com.github.catvod.spider.merge.J.c.b(com.github.catvod.spider.merge.J.c.a(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator()));
        Iterator it = b.iterator();
        t tVar = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int loadPriority = ((MainDispatcherFactory) next).getLoadPriority();
                do {
                    Object next2 = it.next();
                    int loadPriority2 = ((MainDispatcherFactory) next2).getLoadPriority();
                    if (loadPriority < loadPriority2) {
                        next = next2;
                        loadPriority = loadPriority2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) next;
        if (mainDispatcherFactory != null) {
            try {
                tVar = mainDispatcherFactory.createDispatcher(b);
            } catch (Throwable unused) {
                mainDispatcherFactory.hintOnError();
            }
            if (tVar != null) {
                a = tVar;
                return;
            }
        }
        throw new IllegalStateException(cYh.d("2A3F25243B3F472728253F7A133824711A3B0E3E61353E29173135323F3F1570282277370E233238393D49700035337A03353134393E023E2228772A153F37383333093761253F3F471D2038397A03393221362E043824237B7A027E267F777D0C3F353D3E341F7D223E25351224283F32294A312F3525350E34667136340370243F242F15356138237A0F3132712332027032303A3F472624232433083E6130247A403B2E253B3309286C32382808253538393F147D223E253F40"));
    }
}
