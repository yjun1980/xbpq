/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H1;

import com.github.catvod.spider.merge.H1.b;
import com.github.catvod.spider.merge.H1.d;
import com.github.catvod.spider.merge.H1.e;
import com.github.catvod.spider.merge.H1.l;
import com.github.catvod.spider.merge.H1.m;
import com.github.catvod.spider.merge.H1.p;
import com.github.catvod.spider.merge.H1.r;
import com.github.catvod.spider.merge.K1.o;
import com.github.catvod.spider.merge.k1.c;
import com.github.catvod.spider.merge.k1.f;
import com.github.catvod.spider.merge.k1.j;
import com.github.catvod.spider.merge.n1.i;
import com.github.catvod.spider.merge.o1.a;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public abstract class g
extends com.github.catvod.spider.merge.k1.b {
    public g(com.github.catvod.spider.merge.k1.p p2, a a2) {
        super(p2, a2);
    }

    public long A() {
        return 0L;
    }

    public String B() {
        return "";
    }

    public long C() {
        return -1L;
    }

    public List<j> D() {
        return Collections.emptyList();
    }

    public int E() {
        return 1;
    }

    public com.github.catvod.spider.merge.k1.g<? extends com.github.catvod.spider.merge.k1.e, ? extends f> F() {
        return null;
    }

    public List<l> G() {
        return Collections.emptyList();
    }

    public abstract m H();

    public List<c> I() {
        return Collections.emptyList();
    }

    public String J() {
        return "";
    }

    public String K() {
        return "";
    }

    public List<p> L() {
        return Collections.emptyList();
    }

    public String M() {
        return "";
    }

    public List<String> N() {
        return Collections.emptyList();
    }

    public String O() {
        return null;
    }

    public abstract List<c> P();

    public long Q() {
        return 0L;
    }

    /*
     * Unable to fully structure code
     */
    protected final long R(String var1_1) {
        block15: {
            block16: {
                var14_6 = "";
                var15_7 = com.github.catvod.spider.merge.K1.d.f(var1_1, this.j(), 1);
                if (var15_7.isEmpty()) break block15;
                var10_8 = com.github.catvod.spider.merge.K1.d.f("(\\d+)s", var15_7, 1);
                try {
                    var1_1 = com.github.catvod.spider.merge.K1.d.f("(\\d+)m", var15_7, 1);
                }
                catch (Exception var1_2) {
                    var1_1 = "";
                    break block16;
                }
                var12_9 = com.github.catvod.spider.merge.K1.d.f("(\\d+)h", var15_7, 1);
                var11_10 = var10_8;
                var13_12 = var1_1;
                ** GOTO lbl37
                catch (Exception var1_3) {
                    var10_8 = "";
                    var1_1 = "";
                }
            }
lbl21:
            // 2 sources

            while (true) {
                block20: {
                    block19: {
                        block18: {
                            block17: {
                                var12_9 = var14_6;
                                var11_10 = var10_8;
                                var13_12 = var1_1;
                                try {
                                    if (!var10_8.isEmpty()) break block17;
                                    var12_9 = var14_6;
                                    var11_10 = var10_8;
                                    var13_12 = var1_1;
                                }
                                catch (i var1_4) {
                                    throw new i("Could not get timestamp.", var1_4);
                                }
                                if (!var1_1.isEmpty()) break block17;
                                var11_10 = com.github.catvod.spider.merge.K1.d.f("t=(\\d+)", var15_7, 1);
                                var13_12 = var1_1;
                                var12_9 = var14_6;
                            }
                            var9_13 = var11_10.isEmpty();
                            var4_14 = 0;
                            if (!var9_13) break block18;
                            var2_15 = 0;
                            ** GOTO lbl47
                        }
                        var2_15 = Integer.parseInt(var11_10);
lbl47:
                        // 2 sources

                        if (!var13_12.isEmpty()) break block19;
                        var3_16 = 0;
                        ** GOTO lbl53
                    }
                    var3_16 = Integer.parseInt(var13_12);
lbl53:
                    // 2 sources

                    if (var12_9.isEmpty()) break block20;
                    var4_14 = Integer.parseInt(var12_9);
                }
                var7_17 = var2_15;
                var5_18 = var3_16;
                return (long)var4_14 * 3600L + (var5_18 * 60L + var7_17);
            }
        }
        return 0L;
        catch (o var1_5) {
            return -2L;
        }
        catch (Exception var11_11) {
            ** continue;
        }
    }

    public com.github.catvod.spider.merge.p1.b S() {
        return null;
    }

    public List<c> T() {
        return Collections.emptyList();
    }

    public abstract String U();

    public long V() {
        return -1L;
    }

    public abstract String W();

    public abstract List<r> X();

    public abstract List<r> Y();

    public long Z() {
        return -1L;
    }

    public boolean a0() {
        return false;
    }

    public int p() {
        return 0;
    }

    public abstract List<b> q();

    public String r() {
        return "";
    }

    public String s() {
        return "";
    }

    public abstract d t();

    public long u() {
        return -1L;
    }

    public String v() {
        return null;
    }

    public List<e> w() {
        return Collections.emptyList();
    }

    public String x() {
        return "";
    }

    public String y() {
        return "";
    }

    public Locale z() {
        return null;
    }
}

