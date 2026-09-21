/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.D.D;
import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.O;
import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.D.c0;
import com.github.catvod.spider.merge.D.d;
import com.github.catvod.spider.merge.D.d0;
import com.github.catvod.spider.merge.D.f0;
import com.github.catvod.spider.merge.D.g0;
import com.github.catvod.spider.merge.D.i0;
import com.github.catvod.spider.merge.D.l;
import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.y.V;
import com.github.catvod.spider.merge.y.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class M
extends g0
implements X {
    protected final D[] i;
    protected final D[] j;
    protected final d0 k;
    private volatile transient long[] l;
    private volatile transient short[] m;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public M(d0 object) {
        D[] dArray;
        int n2;
        this.k = object;
        this.j = new D[((d0)object).f.length];
        for (n2 = 0; n2 < (dArray = this.j).length; ++n2) {
            dArray[n2] = new D(((d0)object).a, ((d0)object).f[n2]);
        }
        com.github.catvod.spider.merge.H.e[] eArray = ((d0)object).e;
        if (eArray == ((d0)object).f) {
            this.i = dArray;
        } else {
            block10: {
                this.i = new D[eArray.length];
                for (n2 = 0; n2 < this.i.length; ++n2) {
                    D d2 = this.k(((d0)object).e[n2].a);
                    if (d2 == null) {
                        n2 = 1;
                        break block10;
                    }
                    this.i[n2] = d2;
                }
                n2 = 0;
            }
            if (n2 != 0) {
                D[] dArray2 = this.j;
                System.arraycopy(dArray2, 0, this.i, 0, dArray2.length);
            }
        }
        object = ((d0)object).d;
        if (object != null) {
            for (Class<? extends f0> clazz : object.serialzeFilters()) {
                try {
                    this.c((f0)clazz.getConstructor(new Class[0]).newInstance(new Object[0]));
                }
                catch (Exception exception) {}
            }
        }
    }

    @Override
    public final void d(L l2, Object object, Object object2, Type type, int n2) {
        this.r(l2, object, object2, type, n2, false);
    }

    protected final boolean i(L object, String string) {
        object = ((g0)object).g;
        if (object != null) {
            object = ((ArrayList)object).iterator();
            while (object.hasNext()) {
                if (((O)object.next()).a()) continue;
                return false;
            }
        }
        if ((object = this.g) != null) {
            object = ((ArrayList)object).iterator();
            while (object.hasNext()) {
                if (((O)object.next()).a()) continue;
                return false;
            }
        }
        return true;
    }

    public final Set<String> j(Object object) {
        HashSet<String> hashSet = new HashSet<String>();
        for (D d2 : this.j) {
            if (d2.e(object) == null) continue;
            hashSet.add(d2.a.a);
        }
        return hashSet;
    }

    public final D k(String string) {
        if (string == null) {
            return null;
        }
        int n2 = 0;
        int n3 = this.j.length - 1;
        while (n2 <= n3) {
            int n4 = n2 + n3 >>> 1;
            int n5 = this.j[n4].a.a.compareTo(string);
            if (n5 < 0) {
                n2 = n4 + 1;
                continue;
            }
            if (n5 > 0) {
                n3 = n4 - 1;
                continue;
            }
            return this.j[n4];
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object l(Object var1_1, String var2_4, long var3_5) {
        if (this.l == null) {
            var9_6 /* !! */  = V.values();
            var10_7 /* !! */  = new long[this.j.length * var9_6 /* !! */ .length];
            var5_9 = 0;
            for (var6_8 = 0; var6_8 < ((D[])(var11_12 = this.j)).length; ++var6_8) {
                var11_12 = var11_12[var6_8].a.a;
                var7_10 = var5_9 + 1;
                var10_7 /* !! */ [var5_9] = A.z((String)var11_12);
                var8_11 = 0;
                var5_9 = var7_10;
                for (var7_10 = var8_11; var7_10 < var9_6 /* !! */ .length; ++var7_10) {
                    var12_13 = var9_6 /* !! */ [var7_10].b((String)var11_12);
                    if (var11_12.equals(var12_13)) continue;
                    var10_7 /* !! */ [var5_9] = A.z(var12_13);
                    ++var5_9;
                }
            }
            Arrays.sort(var10_7 /* !! */ , 0, var5_9);
            this.l = new long[var5_9];
            System.arraycopy(var10_7 /* !! */ , 0, this.l, 0, var5_9);
        } else {
            var9_6 /* !! */  = null;
        }
        var7_10 = Arrays.binarySearch(this.l, var3_5);
        if (var7_10 < 0) ** GOTO lbl-1000
        if (this.m == null) {
            var10_7 /* !! */  = (long[])var9_6 /* !! */ ;
            if (var9_6 /* !! */  == null) {
                var10_7 /* !! */  = (long[])V.values();
            }
            var9_6 /* !! */  = (V[])new short[this.l.length];
            Arrays.fill((short[])var9_6 /* !! */ , (short)-1);
            for (var5_9 = 0; var5_9 < ((D[])(var11_12 = this.j)).length; ++var5_9) {
                var12_13 = var11_12[var5_9].a.a;
                var6_8 = Arrays.binarySearch(this.l, A.z(var12_13));
                if (var6_8 >= 0) {
                    var9_6 /* !! */ [var6_8] = (V)((short)var5_9);
                }
                for (var6_8 = 0; var6_8 < var10_7 /* !! */ .length; ++var6_8) {
                    var11_12 = var10_7 /* !! */ [var6_8].b(var12_13);
                    if (var12_13.equals(var11_12) || (var8_11 = Arrays.binarySearch(this.l, A.z((String)var11_12))) < 0) continue;
                    var9_6 /* !! */ [var8_11] = (V)((short)var5_9);
                }
            }
            this.m = (short[])var9_6 /* !! */ ;
        }
        if ((var5_9 = this.m[var7_10]) != -1) {
            var9_6 /* !! */  = this.j[var5_9];
        } else lbl-1000:
        // 2 sources

        {
            var9_6 /* !! */  = null;
        }
        if (var9_6 /* !! */  == null) {
            return null;
        }
        try {
            var1_1 = var9_6 /* !! */ .b(var1_1);
            return var1_1;
        }
        catch (IllegalAccessException var1_2) {
            throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.B.e.c("getFieldValue error.", var2_4), var1_2);
        }
        catch (InvocationTargetException var1_3) {
            throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.B.e.c("getFieldValue error.", var2_4), var1_3);
        }
    }

    public final List<Object> m(Object object) {
        ArrayList<Object> arrayList = new ArrayList<Object>(this.j.length);
        D[] dArray = this.j;
        int n2 = dArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            arrayList.add(dArray[i2].b(object));
        }
        return arrayList;
    }

    public final Map<String, Object> n(Object object) {
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>(this.j.length);
        for (D d2 : this.j) {
            boolean bl = i0.e(d2.c, i0.l);
            Object object2 = d2.a;
            if (bl && object2 != null && ((com.github.catvod.spider.merge.H.e)object2).n) continue;
            if (((com.github.catvod.spider.merge.H.e)object2).r) {
                object2 = com.github.catvod.spider.merge.y.a.k(d2.b(object));
                if (object2 instanceof Map) {
                    linkedHashMap.putAll((Map)object2);
                    continue;
                }
                object2 = d2.a.a;
            } else {
                object2 = ((com.github.catvod.spider.merge.H.e)object2).a;
            }
            linkedHashMap.put((String)object2, d2.b(object));
        }
        return linkedHashMap;
    }

    public final com.github.catvod.spider.merge.z.d o() {
        return this.k.d;
    }

    public final int p(Object object) {
        D[] dArray = this.j;
        int n2 = dArray.length;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n4 = n3;
            if (dArray[i2].e(object) != null) {
                n4 = n3 + 1;
            }
            n3 = n4;
        }
        return n3;
    }

    protected final boolean q(L l2, int n2) {
        int n3 = i0.u.a;
        boolean bl = (this.k.g & n3) != 0 || l2.j.i || (n2 & n3) != 0;
        return bl;
    }

    /*
     * Exception decompiling
     */
    protected final void r(L var1_1, Object var2_2, Object var3_8, Type var4_9, int var5_19, boolean var6_20) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 24[TRYBLOCK] [48, 49 : 602->614)] java.lang.Exception
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    protected final char s(L l2, Object object, char c2) {
        Object object2 = l2.b;
        char c3 = c2;
        if (object2 != null) {
            object2 = ((ArrayList)object2).iterator();
            while (true) {
                c3 = c2;
                if (!object2.hasNext()) break;
                c2 = ((d)object2.next()).f(l2, object, c2);
            }
        }
        object2 = this.b;
        c2 = c3;
        if (object2 != null) {
            object2 = ((ArrayList)object2).iterator();
            while (true) {
                c2 = c3;
                if (!object2.hasNext()) break;
                c3 = ((d)object2.next()).f(l2, object, c3);
            }
        }
        return c2;
    }

    protected final char t(L l2, Object object, char c2) {
        Object object2 = l2.a;
        char c3 = c2;
        if (object2 != null) {
            object2 = ((ArrayList)object2).iterator();
            while (true) {
                c3 = c2;
                if (!object2.hasNext()) break;
                c2 = ((l)object2.next()).f(l2, object, c2);
            }
        }
        object2 = this.a;
        c2 = c3;
        if (object2 != null) {
            object2 = ((ArrayList)object2).iterator();
            while (true) {
                c2 = c3;
                if (!object2.hasNext()) break;
                c3 = ((l)object2.next()).f(l2, object, c3);
            }
        }
        return c2;
    }

    protected final void u(L l2, String object, Object clazz) {
        String string = object;
        if (object == null) {
            string = l2.i.c;
        }
        l2.j.j(string);
        string = this.k.b;
        object = string;
        if (string == null) {
            clazz = clazz.getClass();
            object = clazz;
            if (A.i0(clazz)) {
                object = clazz.getSuperclass();
            }
            object = ((Class)object).getName();
        }
        l2.v((String)object);
    }

    public final void v(L l2, Object object, Object object2, Type type, int n2) {
        this.r(l2, object, object2, type, n2, false);
    }

    public final boolean w(L l2, Object object, int n2) {
        Object object2 = l2.p;
        int n3 = i0.p.a;
        if (object2 != null && (((c0)object2).d & n3) == 0 && (n2 & n3) == 0 && (object2 = l2.o) != null && ((IdentityHashMap)object2).containsKey(object)) {
            l2.x(object);
            return true;
        }
        return false;
    }
}

