package com.github.catvod.spider.merge.E;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
public final class h {
    private static final i a;
    private static final com.github.catvod.spider.merge.I.a[] b;

    static {
        i iVar = null;
        try {
            iVar = (i) Class.forName(cYh.d("0C3F353D3E34492224373B3F04246F3B213749392F25322809312D7F053F013C24322333083E0730342E082238183A2A0B")).newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (iVar == null) {
            iVar = new i();
        }
        a = iVar;
        b = new com.github.catvod.spider.merge.I.a[0];
    }

    public static String a(g gVar) {
        a.getClass();
        String obj = gVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith(cYh.d("0C3F353D3E34493A373C793C123E22253E3509236F")) ? obj.substring(21) : obj;
    }
}
