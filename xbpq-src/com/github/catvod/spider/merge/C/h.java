/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.C;

import com.github.catvod.spider.merge.B.b;
import com.github.catvod.spider.merge.B.o;
import com.github.catvod.spider.merge.C.g;
import com.github.catvod.spider.merge.C.n;
import com.github.catvod.spider.merge.C.q;
import com.github.catvod.spider.merge.C.r;
import com.github.catvod.spider.merge.C.v;
import com.github.catvod.spider.merge.H.e;
import com.github.catvod.spider.merge.y.d;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.zip.GZIPInputStream;

public final class h
extends n {
    protected v c;
    protected boolean d;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public h(Class clazz, e e2) {
        super(clazz, e2);
        boolean bl = false;
        this.d = false;
        clazz = e2.h();
        if (clazz != null) {
            clazz = clazz.deserializeUsing();
            boolean bl2 = bl;
            if (clazz != null) {
                bl2 = bl;
                if (clazz != Void.class) {
                    bl2 = true;
                }
            }
            this.d = bl2;
        }
    }

    @Override
    public final int b() {
        v v2 = this.c;
        if (v2 != null) {
            return v2.e();
        }
        return 2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void d(b var1_1, Object var2_3, Type var3_4, Map<String, Object> var4_5) {
        block18: {
            block19: {
                if (this.c == null) {
                    this.g(var1_1.e());
                }
                var8_6 = this.c;
                var9_7 = this.a.f;
                var7_8 = var8_6;
                var6_9 = var9_7;
                if (var3_4 instanceof ParameterizedType) {
                    var6_9 = var1_1.f();
                    if (var6_9 != null) {
                        var6_9.e = var3_4;
                    }
                    var7_8 = var8_6;
                    var6_9 = var9_7;
                    if (var9_7 != var3_4) {
                        var3_4 = e.k(this.b, (Type)var3_4, var9_7, null);
                        var7_8 = var8_6;
                        var6_9 = var3_4;
                        if (var8_6 instanceof r) {
                            var7_8 = var1_1.e().f((Type)var3_4);
                            var6_9 = var3_4;
                        }
                    }
                }
                if (!(var7_8 instanceof q)) ** GOTO lbl-1000
                var3_4 = this.a;
                var5_10 = var3_4.j;
                if (var5_10 != 0) {
                    var3_4 = ((q)var7_8).g(var1_1, (Type)var6_9, var3_4.a, var5_10);
                } else lbl-1000:
                // 2 sources

                {
                    var8_6 = this.a;
                    var3_4 = var8_6.s;
                    var3_4 = (var3_4 != null || var8_6.j != 0) && var7_8 instanceof g != false ? ((g)var7_8).f(var1_1, (Type)var6_9, var8_6.a, (String)var3_4, var8_6.j) : var7_8.c(var1_1, (Type)var6_9, var8_6.a);
                }
                var6_9 = var3_4;
                if (!(var3_4 instanceof byte[])) break block18;
                if ("gzip".equals(this.a.s)) break block19;
                var6_9 = var3_4;
                if (!"gzip,base64".equals(this.a.s)) break block18;
            }
            var7_8 = (byte[])var3_4;
            try {
                var6_9 = new ByteArrayInputStream((byte[])var7_8);
                var3_4 = new GZIPInputStream((InputStream)var6_9);
                var6_9 = new ByteArrayOutputStream();
                while (true) {
                    if ((var5_10 = var3_4.read((byte[])(var7_8 = (Object)new byte[1024]))) != -1) break block17;
                    break;
                }
            }
            catch (IOException var1_2) {
                throw new d("unzip bytes error.", var1_2);
            }
            {
                block17: {
                    var6_9 = var6_9.toByteArray();
                }
                if (var5_10 <= 0) continue;
                var6_9.write((byte[])var7_8, 0, var5_10);
                continue;
            }
        }
        if (var1_1.k == 1) {
            var2_3 = var1_1.j();
            var2_3.c = this;
            var2_3.d = var1_1.f();
            var1_1.k = 0;
        } else if (var2_3 == null) {
            var4_5.put(this.a.a, var6_9);
        } else {
            this.e(var2_3, var6_9);
        }
    }

    public final v g(o object) {
        if (this.c == null) {
            Object object2 = this.a.h();
            if (object2 != null && object2.deserializeUsing() != Void.class) {
                object = object2.deserializeUsing();
                try {
                    this.c = (v)((Class)object).newInstance();
                }
                catch (Exception exception) {
                    throw new d("create deserializeUsing ObjectDeserializer error", exception);
                }
            } else {
                object2 = this.a;
                this.c = ((o)object).e(((e)object2).e, ((e)object2).f);
            }
        }
        return this.c;
    }
}

