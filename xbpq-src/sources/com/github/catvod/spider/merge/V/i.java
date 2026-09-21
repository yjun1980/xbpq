package com.github.catvod.spider.merge.V;

import com.github.catvod.spider.merge.cYh;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class i implements Serializable {
    public static final i s = new b();
    private static final ThreadLocal<WeakHashMap<Object, Object>> t;
    private boolean e;
    private boolean j;
    private String p;
    private String q;
    private String r;
    private boolean c = true;
    private boolean d = true;
    private boolean f = true;
    private String g = cYh.d("3C");
    private String h = cYh.d("3A");
    private String i = cYh.d("5A");
    private String k = cYh.d("4B");
    private String l = cYh.d("1C");
    private String m = cYh.d("1A");
    private String n = cYh.d("5B3E343D3B64");
    private String o = cYh.d("5B23282B3267");

    static {
        new d();
        new f();
        new g();
        new h();
        new e();
        new c();
        t = new ThreadLocal<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public i() {
        String d = cYh.d("59");
        this.p = d;
        this.q = cYh.d("5B");
        this.r = d;
    }

    static void L(Object obj) {
        Map<Object, Object> t2;
        if (obj == null || (t2 = t()) == null) {
            return;
        }
        t2.remove(obj);
        if (t2.isEmpty()) {
            t.remove();
        }
    }

    static Map<Object, Object> t() {
        return t.get();
    }

    static void u(Object obj) {
        if (obj != null) {
            if (t() == null) {
                t.set(new WeakHashMap<>());
            }
            t().put(obj, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void A(String str) {
        if (str == null) {
            str = "";
        }
        this.k = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void B() {
        this.j = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void C() {
        this.n = cYh.d("09252D3D");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void D() {
        this.p = cYh.d("5972");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void E() {
        this.o = cYh.d("456C32382D3F5A");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void F() {
        this.r = cYh.d("5972");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void G() {
        this.q = cYh.d("456C");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void H() {
        this.d = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void I() {
        this.c = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void J() {
        this.f = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void K() {
        this.e = true;
    }

    public void a(StringBuffer stringBuffer, Object obj) {
        String d = cYh.d("11312D2432");
        j(stringBuffer, d);
        if (obj == null) {
            stringBuffer.append(this.n);
        } else {
            k(stringBuffer, d, obj, true);
        }
        stringBuffer.append(this.k);
    }

    public final void b(StringBuffer stringBuffer, String str, boolean z) {
        j(stringBuffer, str);
        stringBuffer.append(z);
        stringBuffer.append(this.k);
    }

    protected void c(StringBuffer stringBuffer, char c) {
        stringBuffer.append(c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d(StringBuffer stringBuffer, String str, int i, Object obj) {
        if (i > 0) {
            stringBuffer.append(cYh.d("4B"));
        }
        if (obj == null) {
            stringBuffer.append(this.n);
        } else {
            k(stringBuffer, str, obj, true);
        }
    }

    protected void e(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(obj);
    }

    protected void f(StringBuffer stringBuffer, String str, Collection<?> collection) {
        stringBuffer.append(collection);
    }

    protected void g(StringBuffer stringBuffer, Map map) {
        stringBuffer.append(map);
    }

    public final void h(StringBuffer stringBuffer, Object obj) {
        if (com.github.catvod.spider.merge.U.h.a(stringBuffer, this.k)) {
            stringBuffer.setLength(stringBuffer.length() - this.k.length());
        }
        stringBuffer.append(this.h);
        L(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i(StringBuffer stringBuffer) {
        stringBuffer.append(this.k);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j(StringBuffer stringBuffer, String str) {
        if (!this.c || str == null) {
            return;
        }
        stringBuffer.append(str);
        stringBuffer.append(this.i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(StringBuffer stringBuffer, String str, Object obj, boolean z) {
        int size;
        Map<Object, Object> t2 = t();
        int i = 0;
        if ((t2 != null && t2.containsKey(obj)) && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Character)) {
            com.github.catvod.spider.merge.U.d.a(stringBuffer, obj);
            return;
        }
        u(obj);
        try {
            if (obj instanceof Collection) {
                if (z) {
                    f(stringBuffer, str, (Collection) obj);
                } else {
                    size = ((Collection) obj).size();
                    n(stringBuffer, size);
                }
            } else if (!(obj instanceof Map)) {
                boolean z2 = obj instanceof long[];
                String d = cYh.d("4B");
                if (z2) {
                    if (z) {
                        long[] jArr = (long[]) obj;
                        stringBuffer.append(this.l);
                        while (i < jArr.length) {
                            if (i > 0) {
                                stringBuffer.append(d);
                            }
                            stringBuffer.append(jArr[i]);
                            i++;
                        }
                        stringBuffer.append(this.m);
                    } else {
                        n(stringBuffer, ((long[]) obj).length);
                    }
                } else if (obj instanceof int[]) {
                    if (z) {
                        int[] iArr = (int[]) obj;
                        stringBuffer.append(this.l);
                        while (i < iArr.length) {
                            if (i > 0) {
                                stringBuffer.append(d);
                            }
                            stringBuffer.append(iArr[i]);
                            i++;
                        }
                        stringBuffer.append(this.m);
                    } else {
                        n(stringBuffer, ((int[]) obj).length);
                    }
                } else if (obj instanceof short[]) {
                    if (z) {
                        short[] sArr = (short[]) obj;
                        stringBuffer.append(this.l);
                        while (i < sArr.length) {
                            if (i > 0) {
                                stringBuffer.append(d);
                            }
                            stringBuffer.append((int) sArr[i]);
                            i++;
                        }
                        stringBuffer.append(this.m);
                    } else {
                        n(stringBuffer, ((short[]) obj).length);
                    }
                } else if (obj instanceof byte[]) {
                    if (z) {
                        byte[] bArr = (byte[]) obj;
                        stringBuffer.append(this.l);
                        while (i < bArr.length) {
                            if (i > 0) {
                                stringBuffer.append(d);
                            }
                            stringBuffer.append((int) bArr[i]);
                            i++;
                        }
                        stringBuffer.append(this.m);
                    } else {
                        n(stringBuffer, ((byte[]) obj).length);
                    }
                } else if (obj instanceof char[]) {
                    if (z) {
                        char[] cArr = (char[]) obj;
                        stringBuffer.append(this.l);
                        while (i < cArr.length) {
                            if (i > 0) {
                                stringBuffer.append(d);
                            }
                            c(stringBuffer, cArr[i]);
                            i++;
                        }
                        stringBuffer.append(this.m);
                    } else {
                        n(stringBuffer, ((char[]) obj).length);
                    }
                } else if (obj instanceof double[]) {
                    if (z) {
                        double[] dArr = (double[]) obj;
                        stringBuffer.append(this.l);
                        while (i < dArr.length) {
                            if (i > 0) {
                                stringBuffer.append(d);
                            }
                            stringBuffer.append(dArr[i]);
                            i++;
                        }
                        stringBuffer.append(this.m);
                    } else {
                        n(stringBuffer, ((double[]) obj).length);
                    }
                } else if (obj instanceof float[]) {
                    if (z) {
                        float[] fArr = (float[]) obj;
                        stringBuffer.append(this.l);
                        while (i < fArr.length) {
                            if (i > 0) {
                                stringBuffer.append(d);
                            }
                            stringBuffer.append(fArr[i]);
                            i++;
                        }
                        stringBuffer.append(this.m);
                    } else {
                        n(stringBuffer, ((float[]) obj).length);
                    }
                } else if (obj instanceof boolean[]) {
                    if (z) {
                        boolean[] zArr = (boolean[]) obj;
                        stringBuffer.append(this.l);
                        while (i < zArr.length) {
                            if (i > 0) {
                                stringBuffer.append(d);
                            }
                            stringBuffer.append(zArr[i]);
                            i++;
                        }
                        stringBuffer.append(this.m);
                    } else {
                        n(stringBuffer, ((boolean[]) obj).length);
                    }
                } else if (obj.getClass().isArray()) {
                    if (z) {
                        Object[] objArr = (Object[]) obj;
                        stringBuffer.append(this.l);
                        while (i < objArr.length) {
                            Object obj2 = objArr[i];
                            if (i > 0) {
                                stringBuffer.append(d);
                            }
                            if (obj2 == null) {
                                stringBuffer.append(this.n);
                            } else {
                                k(stringBuffer, str, obj2, true);
                            }
                            i++;
                        }
                        stringBuffer.append(this.m);
                    } else {
                        n(stringBuffer, ((Object[]) obj).length);
                    }
                } else if (z) {
                    e(stringBuffer, str, obj);
                } else {
                    stringBuffer.append(this.q);
                    stringBuffer.append(com.github.catvod.spider.merge.U.b.a(obj.getClass()));
                    stringBuffer.append(this.r);
                }
            } else if (z) {
                g(stringBuffer, (Map) obj);
            } else {
                size = ((Map) obj).size();
                n(stringBuffer, size);
            }
        } finally {
            L(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void l(StringBuffer stringBuffer) {
        stringBuffer.append(this.n);
    }

    public final void m(StringBuffer stringBuffer, Object obj) {
        String name;
        if (obj != null) {
            if (this.d) {
                u(obj);
                boolean z = this.e;
                Class<?> cls = obj.getClass();
                if (z) {
                    name = com.github.catvod.spider.merge.U.b.a(cls);
                } else {
                    name = cls.getName();
                }
                stringBuffer.append(name);
            }
            if (this.f) {
                u(obj);
                stringBuffer.append('@');
                stringBuffer.append(Integer.toHexString(System.identityHashCode(obj)));
            }
            stringBuffer.append(this.g);
            if (this.j) {
                stringBuffer.append(this.k);
            }
        }
    }

    protected final void n(StringBuffer stringBuffer, int i) {
        stringBuffer.append(this.o);
        stringBuffer.append(i);
        stringBuffer.append(this.p);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String o() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String p() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String q() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String r() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String s() {
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void v() {
        this.m = cYh.d("3A");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w() {
        this.l = cYh.d("3C");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x(String str) {
        if (str == null) {
            str = "";
        }
        this.h = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void y(String str) {
        this.g = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void z() {
        this.i = cYh.d("5D");
    }
}
