/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.SpiderDebug
 */
package com.github.catvod.spider.merge.KT;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.KT.G;
import com.github.catvod.spider.merge.KT.u;
import com.github.catvod.spider.merge.KT.v;
import com.github.catvod.spider.merge.KT.w;
import com.github.catvod.spider.merge.by.p;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.A0.c;
import com.github.catvod.spider.merge.xc.a.a;
import com.github.catvod.spider.merge.xc.d0.o;
import com.github.catvod.spider.merge.xc.e0.d;
import com.github.catvod.spider.merge.xc.s0.E;
import com.github.catvod.spider.merge.xc.s0.I;
import com.github.catvod.spider.merge.xc.s0.L;
import com.github.catvod.spider.merge.xc.s0.f0;
import com.github.catvod.spider.merge.xc.s0.x;
import com.github.catvod.spider.merge.xc.t0.f;
import java.io.SequenceInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public final class y {
    public static final y a = new y();
    public static final int b = Runtime.getRuntime().availableProcessors() * 2;
    public static final LinkedHashMap c = new LinkedHashMap();

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Serializable a(y var0, String var1_4, Map var2_5, d var3_6) {
        block28: {
            block30: {
                block27: {
                    block29: {
                        var11_7 = var0;
                        var0.getClass();
                        if (!(var3_6 /* !! */  instanceof u)) ** GOTO lbl-1000
                        var0 = (u)var3_6 /* !! */ ;
                        var4_8 = var0.j;
                        if ((var4_8 & -2147483648) != 0) {
                            var0.j = var4_8 + -2147483648;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var0 = new u((y)var11_7, var3_6 /* !! */ );
                        }
                        var12_9 = var0.h;
                        var3_6 /* !! */  = com.github.catvod.spider.merge.xc.f0.a.a;
                        var4_8 = var0.j;
                        var17_10 = y.c;
                        var20_11 = x.b;
                        var15_12 = "content-range";
                        var5_13 = y.b;
                        var16_14 = "Content-Range";
                        if (var4_8 == 0) break block29;
                        if (var4_8 != 1) {
                            if (var4_8 != 2) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            var14_15 = var0.g;
                            var2_5 = var0.f;
                            var13_16 = (List)var0.e;
                            var3_6 /* !! */  = var0.d;
                            var1_4 /* !! */  = (Map)var0.c;
                            com.github.catvod.spider.merge.xc.a.a.C(var12_9);
                            var11_7 = "content-range";
                            var15_12 = "Content-Range";
                            var0 = var14_15;
                            var14_15 = var12_9;
                            var12_9 = var15_12;
                            ** GOTO lbl-1000
                        } else {
                            var2_5 = (Map)var0.e;
                            var1_4 /* !! */  = var0.d;
                            var11_7 = (y)var0.c;
                            com.github.catvod.spider.merge.xc.a.a.C(var12_9);
                            break block27;
                        }
                    }
                    com.github.catvod.spider.merge.xc.a.a.C(var12_9);
                    var12_9 = new StringBuilder("--proxyMultiThread: THREAD_NUM: ");
                    var12_9.append(var5_13);
                    SpiderDebug.log((String)var12_9.toString());
                    var14_15 = (Object[])var17_10.get(var1_4 /* !! */ );
                    if (var14_15 == null) {
                        var17_10.clear();
                        var12_9 = L.b;
                        if (var12_9.b(var20_11) == null) {
                            var14_15 = new f0(null);
                            var12_9 = var12_9.f((com.github.catvod.spider.merge.xc.e0.i)var14_15);
                        }
                        var13_16 = new HashMap<String, Object>((com.github.catvod.spider.merge.xc.e0.i)var12_9);
                        var12_9 = new v((String)var1_4 /* !! */ , (Map)var2_5, null);
                        var12_9 = E.a((f)var13_16, (p)var12_9);
                        var0.c = var11_7;
                        var0.d = var1_4 /* !! */ ;
                        var0.e = var2_5;
                        var0.j = 1;
                        var13_16 = var12_9.G((u)var0);
                        var12_9 = var13_16;
                        if (var13_16 != var3_6 /* !! */ ) break block27;
                        return var3_6 /* !! */ ;
                    }
                    ** GOTO lbl76
                    {
                        catch (Exception var0_1) {}
                    }
                }
                var14_15 = (Object[])var12_9;
                var17_10.put(var1_4 /* !! */ , var14_15);
                var12_9 = var2_5;
                var13_16 = var1_4 /* !! */ ;
                break block30;
lbl76:
                // 1 sources

                var13_16 = var1_4 /* !! */ ;
                var12_9 = var2_5;
            }
            var1_4 /* !! */  = var14_15[0];
            i.c(var1_4 /* !! */ , "null cannot be cast to non-null type kotlin.Int");
            var4_8 = (Integer)var1_4 /* !! */ ;
            var1_4 /* !! */  = new Map<K, V>("-----------code:");
            var1_4 /* !! */ .append(var4_8);
            SpiderDebug.log((String)var1_4 /* !! */ .toString());
            if (var4_8 != 206) {
                return G.d((String)var13_16, (Map)var12_9);
            }
            var1_4 /* !! */  = var14_15[3];
            i.c(var1_4 /* !! */ , "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.String>");
            var6_17 = var1_4 /* !! */  instanceof com.github.catvod.spider.merge.xc.n0.a;
            if (var6_17) ** GOTO lbl-1000
            var17_10 = var1_4 /* !! */ ;
            {
                catch (ClassCastException var0_2) {
                    i.f(var0_2, com.github.catvod.spider.merge.mI.o.class.getName());
                    throw var0_2;
                }
            }
            var1_4 /* !! */  = com.github.catvod.spider.merge.xc.A0.c.a(new CharSequence[]{var17_10.get("Content-Range")}) != false ? var17_10.get("content-range") : var17_10.get("Content-Range");
            var1_4 /* !! */  = (String)var1_4 /* !! */ ;
            var2_5 = new StringBuilder("--contentRange:");
            var2_5.append((String)var1_4 /* !! */ );
            SpiderDebug.log((String)var2_5.toString());
            var18_18 = com.github.catvod.spider.merge.xc.A0.c.f((String)var1_4 /* !! */ , "/")[1];
            var1_4 /* !! */  = new Map<K, V>("--\u6587\u4ef6\u603b\u5927\u5c0f:");
            var1_4 /* !! */ .append(var18_18);
            SpiderDebug.log((String)var1_4 /* !! */ .toString());
            var6_17 = com.github.catvod.spider.merge.xc.A0.c.a(new CharSequence[]{var12_9.get("range")});
            var1_4 /* !! */  = var6_17 != false ? var12_9.get("Range") : var12_9.get("range");
            var2_5 = (String)var1_4 /* !! */ ;
            var1_4 /* !! */  = var2_5;
            if (com.github.catvod.spider.merge.xc.A0.c.a(new CharSequence[]{var2_5})) {
                var1_4 /* !! */  = "bytes=0-";
            }
            var2_5 = new StringBuilder("---proxyMultiThread,Range:");
            var2_5.append((String)var1_4 /* !! */ );
            SpiderDebug.log((String)var2_5.toString());
            i.b(var1_4 /* !! */ );
            var1_4 /* !! */  = G.c((String)var1_4 /* !! */ );
            i.b(var1_4 /* !! */ );
            i.b(var18_18);
            var11_7.getClass();
            var19_19 = y.b(var18_18, var1_4 /* !! */ );
            var21_20 = new ArrayList<I>();
            var2_5 = new ArrayList();
            var14_15 = var19_19.iterator();
            var4_8 = 0;
            var1_4 /* !! */  = var3_6 /* !! */ ;
            var11_7 = var0;
            var0 = var2_5;
            var2_5 = var16_14;
            var3_6 /* !! */  = var15_12;
            ** GOTO lbl142
lbl-1000:
            // 1 sources

            {
                com.github.catvod.spider.merge.mI.o.b(var1_4 /* !! */ , "kotlin.collections.MutableMap");
                try {
                    throw null;
                }
                catch (Exception var0_3) {
                    // empty catch block
                    break block28;
                }
                break block28;
lbl142:
                // 2 sources

                while (var14_15.hasNext()) {
                    var15_12 = (long[])var14_15.next();
                    var7_21 /* !! */  = (long)var15_12[0];
                    var9_22 = var15_12[1];
                    {
                        var15_12 = new StringBuilder();
                        var15_12.append("bytes=");
                        var15_12.append(var7_21 /* !! */ );
                        var15_12.append("-");
                        var15_12.append((long)var9_22);
                        var15_12 = var15_12.toString();
                        var16_14 = new HashMap<String, Object>((Map<String, Object>)var12_9);
                        var16_14.put("range", var15_12);
                        var16_14.put("Range", var15_12);
                        var15_12 = L.b;
                        if (var15_12.b(var20_11) == null) {
                            var23_24 = new f0(null);
                            var15_12 = var15_12.f(var23_24);
                        }
                        var22_23 = new f((com.github.catvod.spider.merge.xc.e0.i)var15_12);
                        var15_12 = new w((String)var13_16, var16_14, var4_8, null);
                        var21_20.add(E.a(var22_23, (p)var15_12));
                        ++var4_8;
                    }
                }
                {
                    var11_7.c = var17_10;
                    var11_7.d = var18_18;
                    var11_7.e = var19_19;
                    var11_7.f = var0;
                    var11_7.g = var0;
                    var11_7.j = 2;
                    var14_15 = E.b(var21_20, (u)var11_7);
                    if (var14_15 == var1_4 /* !! */ ) {
                        return var1_4 /* !! */ ;
                    }
                    var13_16 = var18_18;
                    var16_14 = var19_19;
                    var15_12 = var0;
                    var12_9 = var2_5;
                    var11_7 = var3_6 /* !! */ ;
                    var1_4 /* !! */  = var17_10;
                    var3_6 /* !! */  = var13_16;
                    var13_16 = var16_14;
                    var2_5 = var0;
                    var0 = var15_12;
                }
lbl-1000:
                // 2 sources

                {
                    o.I((Collection)var0, (Iterable)var14_15);
                    var0 = var14_15 = (String)var1_4 /* !! */ .get("Content-Type");
                    if (com.github.catvod.spider.merge.xc.A0.c.a(new CharSequence[]{var14_15})) {
                        var0 = (String)var1_4 /* !! */ .get("content-type");
                    }
                    var14_15 = var0;
                    if (com.github.catvod.spider.merge.xc.A0.c.a(new CharSequence[]{var0})) {
                        var14_15 = var0;
                        if (com.github.catvod.spider.merge.xc.A0.c.c(new CharSequence[]{var1_4 /* !! */ .get("Content-Disposition")})) {
                            var14_15 = G.b((String)var1_4 /* !! */ .get("Content-Disposition"));
                        }
                    }
                    var4_8 = var5_13 - 1;
                }
                var1_4 /* !! */ .put("Content-Length", String.valueOf(((long[])var13_16.get(var4_8))[1] - ((long[])var13_16.get(0))[0] + 1L));
                var1_4 /* !! */ .remove("content-length");
                var7_21 /* !! */  = ((long[])var13_16.get(0))[0];
                var0 = new Long(var7_21 /* !! */ );
                var7_21 /* !! */  = ((long[])var13_16.get(var4_8))[1];
                var13_16 = new HashMap<String, Object>(var7_21 /* !! */ );
                var1_4 /* !! */ .put(var12_9, String.format("bytes %s-%s/%s", Arrays.copyOf(new Object[]{var0, var13_16, var3_6 /* !! */ }, 3)));
                var1_4 /* !! */ .remove(var11_7);
                var0 = new StringBuilder();
                var0.append("----proxy res contentType:");
                var0.append((String)var14_15);
                SpiderDebug.log((String)var0.toString());
                var3_6 /* !! */  = C.Z(var1_4 /* !! */ );
                var0 = new StringBuilder();
                var0.append("----proxy res respHeaders:");
                var0.append((String)var3_6 /* !! */ );
                SpiderDebug.log((String)var0.toString());
                var11_7 = new Integer(206);
                var0 = new Vector(var2_5);
                var3_6 /* !! */  = new SequenceInputStream(var0.elements());
                var0 = new Object[]{var11_7, var14_15, var3_6 /* !! */ , var1_4 /* !! */ };
                return var0;
            }
        }
        var2_5 = var0.getMessage();
        var1_4 /* !! */  = new StringBuilder("proxyMultiThread error:");
        var1_4 /* !! */ .append((String)var2_5);
        SpiderDebug.log((String)var1_4 /* !! */ .toString());
        var0.printStackTrace();
        return null;
    }

    public static ArrayList b(String object, Map map) {
        long l2 = Long.parseLong((String)object);
        long l3 = l2 > 0x280000000L ? 0x2000000L : 0x1000000L;
        object = map.get("start");
        i.b(object);
        long l4 = Long.parseLong((String)object);
        if (com.github.catvod.spider.merge.xc.A0.c.a(new CharSequence[]{map.get("end")})) {
            l3 += l4;
        } else {
            object = map.get("end");
            i.b(object);
            l3 = Long.parseLong((String)object);
        }
        l2 = (long)Math.min((double)l3, (double)(l2 - 1L));
        int n2 = b;
        long l5 = (l2 - l4 + 1L) / (long)n2;
        object = new ArrayList();
        l3 = l4;
        for (int i2 = 0; i2 < n2; ++i2) {
            l4 = (long)Math.min((double)(l3 + l5), (double)l2);
            ((ArrayList)object).add(new long[]{l3, l4});
            l3 = l4 + 1L;
        }
        return object;
    }
}

