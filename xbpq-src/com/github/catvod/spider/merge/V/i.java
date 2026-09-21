/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.V;

import com.github.catvod.spider.merge.V.b;
import com.github.catvod.spider.merge.V.c;
import com.github.catvod.spider.merge.V.d;
import com.github.catvod.spider.merge.V.e;
import com.github.catvod.spider.merge.V.f;
import com.github.catvod.spider.merge.V.g;
import com.github.catvod.spider.merge.V.h;
import com.github.catvod.spider.merge.cYh;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;

public abstract class i
implements Serializable {
    public static final i s = new b();
    private static final ThreadLocal<WeakHashMap<Object, Object>> t;
    private boolean c = true;
    private boolean d = true;
    private boolean e;
    private boolean f = true;
    private String g = cYh.d("3C");
    private String h = cYh.d("3A");
    private String i = cYh.d("5A");
    private boolean j;
    private String k = cYh.d("4B");
    private String l = cYh.d("1C");
    private String m = cYh.d("1A");
    private String n = cYh.d("5B3E343D3B64");
    private String o = cYh.d("5B23282B3267");
    private String p;
    private String q;
    private String r;

    static {
        new d();
        new f();
        new g();
        new h();
        new e();
        new c();
        t = new ThreadLocal();
    }

    protected i() {
        String string;
        this.p = string = cYh.d("59");
        this.q = cYh.d("5B");
        this.r = string;
    }

    static void L(Object object) {
        Map<Object, Object> map;
        if (object != null && (map = com.github.catvod.spider.merge.V.i.t()) != null) {
            map.remove(object);
            if (map.isEmpty()) {
                t.remove();
            }
        }
    }

    static Map<Object, Object> t() {
        return t.get();
    }

    static void u(Object object) {
        if (object != null) {
            if (com.github.catvod.spider.merge.V.i.t() == null) {
                t.set(new WeakHashMap());
            }
            com.github.catvod.spider.merge.V.i.t().put(object, null);
        }
    }

    protected final void A(String string) {
        String string2 = string;
        if (string == null) {
            string2 = "";
        }
        this.k = string2;
    }

    protected final void B() {
        this.j = true;
    }

    protected final void C() {
        this.n = cYh.d("09252D3D");
    }

    protected final void D() {
        this.p = cYh.d("5972");
    }

    protected final void E() {
        this.o = cYh.d("456C32382D3F5A");
    }

    protected final void F() {
        this.r = cYh.d("5972");
    }

    protected final void G() {
        this.q = cYh.d("456C");
    }

    protected final void H() {
        this.d = false;
    }

    protected final void I() {
        this.c = false;
    }

    protected final void J() {
        this.f = false;
    }

    protected final void K() {
        this.e = true;
    }

    public void a(StringBuffer stringBuffer, Object object) {
        String string = cYh.d("11312D2432");
        this.j(stringBuffer, string);
        if (object == null) {
            stringBuffer.append(this.n);
        } else {
            this.k(stringBuffer, string, object, true);
        }
        stringBuffer.append(this.k);
    }

    public final void b(StringBuffer stringBuffer, String string, boolean bl) {
        this.j(stringBuffer, string);
        stringBuffer.append(bl);
        stringBuffer.append(this.k);
    }

    protected void c(StringBuffer stringBuffer, char c2) {
        stringBuffer.append(c2);
    }

    protected final void d(StringBuffer stringBuffer, String string, int n2, Object object) {
        if (n2 > 0) {
            stringBuffer.append(cYh.d("4B"));
        }
        if (object == null) {
            stringBuffer.append(this.n);
        } else {
            this.k(stringBuffer, string, object, true);
        }
    }

    protected void e(StringBuffer stringBuffer, String string, Object object) {
        stringBuffer.append(object);
    }

    protected void f(StringBuffer stringBuffer, String string, Collection<?> collection) {
        stringBuffer.append(collection);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    protected void g(StringBuffer stringBuffer, Map map) {
        stringBuffer.append(map);
    }

    public final void h(StringBuffer stringBuffer, Object object) {
        if (com.github.catvod.spider.merge.U.h.a(stringBuffer, this.k)) {
            stringBuffer.setLength(stringBuffer.length() - this.k.length());
        }
        stringBuffer.append(this.h);
        com.github.catvod.spider.merge.V.i.L(object);
    }

    protected final void i(StringBuffer stringBuffer) {
        stringBuffer.append(this.k);
    }

    protected void j(StringBuffer stringBuffer, String string) {
        if (this.c && string != null) {
            stringBuffer.append(string);
            stringBuffer.append(this.i);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final void k(StringBuffer var1_1, String var2_3, Object var3_4, boolean var4_5) {
        block38: {
            var16_6 = com.github.catvod.spider.merge.V.i.t();
            var14_7 = 0;
            var10_8 = 0;
            var11_9 = 0;
            var12_10 = 0;
            var13_11 = 0;
            var7_12 = 0;
            var9_13 = 0;
            var6_14 = 0;
            var8_15 = 0;
            var5_16 = var16_6 != null && var16_6.containsKey(var3_4) != false ? 1 : 0;
            if (!(var5_16 == 0 || var3_4 instanceof Number || var3_4 instanceof Boolean || var3_4 instanceof Character)) {
                com.github.catvod.spider.merge.U.d.a(var1_1, var3_4);
                return;
            }
            com.github.catvod.spider.merge.V.i.u(var3_4);
            try {
                block40: {
                    block39: {
                        if (!(var3_4 instanceof Collection)) break block39;
                        if (var4_5) {
                            this.f(var1_1, (String)var2_3, (Collection)var3_4);
                            break block38;
                        }
                        var5_16 = ((Collection)var3_4).size();
                        ** GOTO lbl29
                    }
                    if (!(var3_4 instanceof Map)) break block40;
                    if (var4_5) {
                        this.g(var1_1, (Map)var3_4);
                        break block38;
                    } else {
                        var5_16 = ((Map)var3_4).size();
lbl29:
                        // 2 sources

                        this.n(var1_1, var5_16);
                    }
                    break block38;
                }
                var15_17 = var3_4 instanceof long[];
            }
            catch (Throwable var1_2) {
                com.github.catvod.spider.merge.V.i.L(var3_4);
                throw var1_2;
            }
            var16_6 = cYh.d("4B");
            if (!var15_17) ** GOTO lbl55
            if (!var4_5) ** GOTO lbl53
            {
                var2_3 = (long[])var3_4;
                var1_1.append(this.l);
                for (var5_16 = var8_15; var5_16 < ((Object)var2_3).length; ++var5_16) {
                    if (var5_16 > 0) {
                        var1_1.append((String)var16_6);
                    }
                    var1_1.append((long)var2_3[var5_16]);
                }
            }
            {
                var1_1.append(this.m);
                break block38;
lbl53:
                // 1 sources

                this.n(var1_1, ((long[])var3_4).length);
                break block38;
lbl55:
                // 1 sources

                if (!(var3_4 instanceof int[])) ** GOTO lbl72
                if (!var4_5) ** GOTO lbl70
                var2_3 = (int[])var3_4;
                var1_1.append(this.l);
                for (var5_16 = var14_7; var5_16 < ((Object)var2_3).length; ++var5_16) {
                    if (var5_16 > 0) {
                        var1_1.append((String)var16_6);
                    }
                    var1_1.append((int)var2_3[var5_16]);
                }
            }
            {
                var1_1.append(this.m);
                break block38;
lbl70:
                // 1 sources

                this.n(var1_1, ((int[])var3_4).length);
                break block38;
lbl72:
                // 1 sources

                if (!(var3_4 instanceof short[])) ** GOTO lbl89
                if (!var4_5) ** GOTO lbl87
                var2_3 = (short[])var3_4;
                var1_1.append(this.l);
                for (var5_16 = var10_8; var5_16 < ((Object)var2_3).length; ++var5_16) {
                    if (var5_16 > 0) {
                        var1_1.append((String)var16_6);
                    }
                    var1_1.append((int)var2_3[var5_16]);
                }
            }
            {
                var1_1.append(this.m);
                break block38;
lbl87:
                // 1 sources

                this.n(var1_1, ((short[])var3_4).length);
                break block38;
lbl89:
                // 1 sources

                if (!(var3_4 instanceof byte[])) ** GOTO lbl106
                if (!var4_5) ** GOTO lbl104
                var2_3 = (byte[])var3_4;
                var1_1.append(this.l);
                for (var5_16 = var11_9; var5_16 < ((Object)var2_3).length; ++var5_16) {
                    if (var5_16 > 0) {
                        var1_1.append((String)var16_6);
                    }
                    var1_1.append((int)var2_3[var5_16]);
                }
            }
            {
                var1_1.append(this.m);
                break block38;
lbl104:
                // 1 sources

                this.n(var1_1, ((byte[])var3_4).length);
                break block38;
lbl106:
                // 1 sources

                if (!(var3_4 instanceof char[])) ** GOTO lbl122
                if (!var4_5) ** GOTO lbl120
                var2_3 = (char[])var3_4;
                var1_1.append(this.l);
                for (var5_16 = var12_10; var5_16 < ((Object)var2_3).length; ++var5_16) {
                    if (var5_16 > 0) {
                        var1_1.append((String)var16_6);
                    }
                    this.c(var1_1, (char)var2_3[var5_16]);
                }
            }
            {
                var1_1.append(this.m);
                break block38;
lbl120:
                // 1 sources

                this.n(var1_1, ((char[])var3_4).length);
                break block38;
lbl122:
                // 1 sources

                if (!(var3_4 instanceof double[])) ** GOTO lbl139
                if (!var4_5) ** GOTO lbl137
                var2_3 = (double[])var3_4;
                var1_1.append(this.l);
                for (var5_16 = var13_11; var5_16 < ((Object)var2_3).length; ++var5_16) {
                    if (var5_16 > 0) {
                        var1_1.append((String)var16_6);
                    }
                    var1_1.append((double)var2_3[var5_16]);
                }
            }
            {
                var1_1.append(this.m);
                break block38;
lbl137:
                // 1 sources

                this.n(var1_1, ((double[])var3_4).length);
                break block38;
lbl139:
                // 1 sources

                if (!(var3_4 instanceof float[])) ** GOTO lbl156
                if (!var4_5) ** GOTO lbl154
                var2_3 = (float[])var3_4;
                var1_1.append(this.l);
                for (var5_16 = var7_12; var5_16 < ((Object)var2_3).length; ++var5_16) {
                    if (var5_16 > 0) {
                        var1_1.append((String)var16_6);
                    }
                    var1_1.append((float)var2_3[var5_16]);
                }
            }
            {
                var1_1.append(this.m);
                break block38;
lbl154:
                // 1 sources

                this.n(var1_1, ((float[])var3_4).length);
                break block38;
lbl156:
                // 1 sources

                if (!(var3_4 instanceof boolean[])) ** GOTO lbl173
                if (!var4_5) ** GOTO lbl171
                var2_3 = (boolean[])var3_4;
                var1_1.append(this.l);
                for (var5_16 = var9_13; var5_16 < ((Object)var2_3).length; ++var5_16) {
                    if (var5_16 > 0) {
                        var1_1.append((String)var16_6);
                    }
                    var1_1.append((boolean)var2_3[var5_16]);
                }
            }
            {
                var1_1.append(this.m);
                break block38;
lbl171:
                // 1 sources

                this.n(var1_1, ((boolean[])var3_4).length);
                break block38;
lbl173:
                // 1 sources

                if (!var3_4.getClass().isArray()) ** GOTO lbl194
                if (!var4_5) ** GOTO lbl192
                var18_18 = (Object[])var3_4;
                var1_1.append(this.l);
                ** for (var5_16 = var6_14;
                ; var5_16 < var18_18.length; ++var5_16)
            }
lbl-1000:
            // 1 sources

            {
                var17_19 = var18_18[var5_16];
                if (var5_16 <= 0) ** GOTO lbl183
                {
                    var1_1.append((String)var16_6);
lbl183:
                    // 2 sources

                    if (var17_19 == null) {
                        var1_1.append(this.n);
                        continue;
                    }
                    this.k(var1_1, (String)var2_3, var17_19, true);
                    continue;
                }
            }
lbl-1000:
            // 1 sources

            {
                var1_1.append(this.m);
                break block38;
lbl192:
                // 1 sources

                this.n(var1_1, ((Object[])var3_4).length);
                break block38;
lbl194:
                // 1 sources

                if (var4_5) {
                    this.e(var1_1, (String)var2_3, var3_4);
                    break block38;
                }
                var1_1.append(this.q);
                var1_1.append(com.github.catvod.spider.merge.U.b.a(var3_4.getClass()));
                var1_1.append(this.r);
            }
        }
        com.github.catvod.spider.merge.V.i.L(var3_4);
    }

    protected final void l(StringBuffer stringBuffer) {
        stringBuffer.append(this.n);
    }

    public final void m(StringBuffer stringBuffer, Object object) {
        if (object != null) {
            if (this.d) {
                com.github.catvod.spider.merge.V.i.u(object);
                boolean bl = this.e;
                Object object2 = object.getClass();
                object2 = bl ? com.github.catvod.spider.merge.U.b.a(object2) : ((Class)object2).getName();
                stringBuffer.append((String)object2);
            }
            if (this.f) {
                com.github.catvod.spider.merge.V.i.u(object);
                stringBuffer.append('@');
                stringBuffer.append(Integer.toHexString(System.identityHashCode(object)));
            }
            stringBuffer.append(this.g);
            if (this.j) {
                stringBuffer.append(this.k);
            }
        }
    }

    protected final void n(StringBuffer stringBuffer, int n2) {
        stringBuffer.append(this.o);
        stringBuffer.append(n2);
        stringBuffer.append(this.p);
    }

    protected final String o() {
        return this.m;
    }

    protected final String p() {
        return this.l;
    }

    protected final String q() {
        return this.h;
    }

    protected final String r() {
        return this.g;
    }

    protected final String s() {
        return this.n;
    }

    protected final void v() {
        this.m = cYh.d("3A");
    }

    protected final void w() {
        this.l = cYh.d("3C");
    }

    protected final void x(String string) {
        String string2 = string;
        if (string == null) {
            string2 = "";
        }
        this.h = string2;
    }

    protected final void y(String string) {
        this.g = string;
    }

    protected final void z() {
        this.i = cYh.d("5D");
    }
}

