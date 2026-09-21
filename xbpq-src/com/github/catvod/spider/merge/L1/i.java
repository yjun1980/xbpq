/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.L1;

import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.L1.a;
import com.github.catvod.spider.merge.L1.b;
import com.github.catvod.spider.merge.L1.c;
import com.github.catvod.spider.merge.L1.d;
import com.github.catvod.spider.merge.L1.e;
import com.github.catvod.spider.merge.L1.f;
import com.github.catvod.spider.merge.L1.g;
import com.github.catvod.spider.merge.L1.h;
import com.github.catvod.spider.merge.y.z;
import java.util.AbstractCollection;
import java.util.Stack;

public final class i {
    private final a a;
    private final d b;
    private final Stack<b> c;
    private final Stack<f> d;

    public i(String string) {
        this.a = new a(string);
        this.b = new d();
        this.c = new Stack();
        this.d = new Stack();
    }

    /*
     * Unable to fully structure code
     */
    public final h a() {
        block32: {
            block31: {
                block26: {
                    block29: {
                        block30: {
                            block28: {
                                block27: {
                                    block25: {
                                        var7_1 = this.a;
                                        while ((var2_2 = var7_1.d()) == 3 || var2_2 == 94) {
                                        }
                                        var5_3 = false;
                                        var6_4 = false;
                                        if (var2_2 == 20) break block25;
                                        var1_5 = var2_2;
                                        if (var2_2 != 62) break block26;
                                    }
                                    if (this.b.a() == null) ** GOTO lbl-1000
                                    var1_5 = this.b.a().a;
                                    if (!com.github.catvod.spider.merge.B.h.a(var1_5)) break block27;
                                    if (var1_5 == 31) ** GOTO lbl-1000
                                    ** GOTO lbl-1000
                                }
                                if (var1_5 != 50 || !(this.b.a() instanceof g)) break block28;
                                var4_6 = ((g)this.b.a()).c.b;
                                break block29;
                            }
                            if (var1_5 != 48 || !(this.b.a() instanceof c)) break block30;
                            var7_1 = ((c)this.b.a()).c;
                            if (!var7_1.a) ** GOTO lbl-1000
                            var7_1 = var7_1.b;
                            if (var7_1 == null) ** GOTO lbl-1000
                            var4_6 = var7_1.a ^ true;
                            break block29;
                        }
                        if (!com.github.catvod.spider.merge.B.h.c(var1_5) || var1_5 == 46) lbl-1000:
                        // 3 sources

                        {
                            var4_6 = false;
                        } else lbl-1000:
                        // 4 sources

                        {
                            var4_6 = true;
                        }
                    }
                    var1_5 = var2_2;
                    if (var4_6) {
                        this.a.i(var2_2);
                        var1_5 = 36;
                    }
                }
                var7_1 = this.a;
                var2_2 = var7_1.k;
                var9_7 = new h(var1_5, var2_2, var7_1.l);
                if (!com.github.catvod.spider.merge.B.h.c(var1_5)) break block31;
                var3_8 = z.c(var1_5);
                var8_9 = null;
                switch (var3_8) {
                    default: {
                        break;
                    }
                    case 49: {
                        if (this.d.isEmpty()) ** GOTO lbl51
                        this.b.c(new g(50, this.a.g, this.d.pop()));
                        break block32;
lbl51:
                        // 1 sources

                        throw new com.github.catvod.spider.merge.n1.i(r.a("unmatched closing paren at ", var2_2));
                    }
                    case 48: {
                        if (!this.b.b()) ** GOTO lbl59
                        if (this.b.e() == null) ** GOTO lbl-1000
                        var1_5 = this.b.e().a;
                        var1_5 = !com.github.catvod.spider.merge.B.h.b(var1_5) && var1_5 != 4 && var1_5 != 78 ? 0 : 1;
                        if (var1_5 == 0) ** GOTO lbl-1000
                        ** GOTO lbl-1000
lbl59:
                        // 1 sources

                        if (this.b.f() && this.b.d() != null) {
                            var1_5 = this.b.d().a;
                            var1_5 = !com.github.catvod.spider.merge.B.h.b(var1_5) && var1_5 != 4 && var1_5 != 78 ? 0 : 1;
                            ** if (var1_5 == 0) goto lbl-1000
                        }
                        ** GOTO lbl-1000
lbl-1000:
                        // 2 sources

                        {
                            var4_6 = true;
                            ** GOTO lbl67
                        }
lbl-1000:
                        // 4 sources

                        {
                            var4_6 = false;
                        }
lbl67:
                        // 2 sources

                        var5_3 = var6_4;
                        if (this.b.a() != null) {
                            var1_5 = this.b.a().a;
                            if (var1_5 != 0) {
                                var1_5 = var1_5 != 75 && var1_5 != 82 && var1_5 != 80 && var1_5 != 86 ? 0 : 1;
                                var5_3 = var6_4;
                                if (var1_5 != 0) {
                                    var5_3 = true;
                                }
                            } else {
                                throw null;
                            }
                        }
                        var7_1 = new f(var4_6, var5_3);
                        this.d.push((f)var7_1);
                        this.b.c(new g(49, this.a.g, (f)var7_1));
                        break block32;
                    }
                    case 47: {
                        if (this.c.isEmpty()) ** GOTO lbl86
                        this.b.c(new c(48, this.a.g, this.c.pop()));
                        break block32;
lbl86:
                        // 1 sources

                        throw new com.github.catvod.spider.merge.n1.i(r.a("unmatched closing brace at ", var2_2));
                    }
                    case 46: {
                        if (this.b.a() == null) ** GOTO lbl110
                        var1_5 = z.c(this.b.a().a);
                        if (var1_5 == 3 || var1_5 == 39) ** GOTO lbl106
                        var4_6 = var5_3;
                        if (var1_5 == 46) ** GOTO lbl111
                        var4_6 = var5_3;
                        if (var1_5 == 48) ** GOTO lbl111
                        if (var1_5 == 65) ** GOTO lbl101
                        var4_6 = var5_3;
                        if (var1_5 == 77) ** GOTO lbl111
                        if (var1_5 == 95) ** GOTO lbl106
                        var4_6 = com.github.catvod.spider.merge.B.h.b(this.b.a().a) ^ true;
                        ** GOTO lbl111
lbl101:
                        // 1 sources

                        var4_6 = var5_3;
                        if (this.c.isEmpty()) ** GOTO lbl111
                        var4_6 = var5_3;
                        if (!((b)this.c.lastElement()).a) ** GOTO lbl111
                        ** GOTO lbl110
lbl106:
                        // 2 sources

                        var4_6 = var5_3;
                        if (this.b.e() == null) ** GOTO lbl111
                        var4_6 = var5_3;
                        if (this.b.e().b == this.a.g) ** GOTO lbl111
lbl110:
                        // 3 sources

                        var4_6 = true;
lbl111:
                        // 9 sources

                        var7_1 = var8_9;
                        if (this.b.a() instanceof g) {
                            var7_1 = var8_9;
                            if (this.b.a().a == 50) {
                                var7_1 = ((g)this.b.a()).c;
                            }
                        }
                        var7_1 = new b(var4_6, (f)var7_1);
                        this.c.push((b)var7_1);
                        this.b.c(new c(47, this.a.g, (b)var7_1));
                        break block32;
                    }
                }
            }
            if (var1_5 != 94) {
                this.b.c(new e(var1_5, this.a.g));
            }
        }
        return var9_7;
    }

    public final boolean b() {
        boolean bl = ((AbstractCollection)this.c).isEmpty() && ((AbstractCollection)this.d).isEmpty();
        return bl;
    }
}

