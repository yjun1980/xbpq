/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.D.c0;
import com.github.catvod.spider.merge.D.e0;
import com.github.catvod.spider.merge.D.g0;
import com.github.catvod.spider.merge.D.h0;
import com.github.catvod.spider.merge.D.i0;
import com.github.catvod.spider.merge.H.i;
import com.github.catvod.spider.merge.y.a;
import com.github.catvod.spider.merge.y.d;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.zip.GZIPOutputStream;

public final class L
extends g0 {
    protected final e0 i;
    public final h0 j;
    private int k = 0;
    private String l = "\t";
    private String m;
    private SimpleDateFormat n;
    protected IdentityHashMap<Object, c0> o = null;
    protected c0 p;
    protected TimeZone q = com.github.catvod.spider.merge.y.a.a;
    protected Locale r = com.github.catvod.spider.merge.y.a.b;

    public L() {
        this(new h0(), e0.i);
    }

    public L(h0 h02, e0 e02) {
        this.j = h02;
        this.i = e02;
    }

    private DateFormat k(String object) {
        object = new SimpleDateFormat((String)object, this.r);
        ((DateFormat)object).setTimeZone(this.q);
        return object;
    }

    public final boolean i(Object object) {
        Object object2 = this.o;
        boolean bl = false;
        if (object2 == null) {
            return false;
        }
        if ((object2 = ((IdentityHashMap)object2).get(object)) == null) {
            return false;
        }
        if (object == Collections.emptyMap()) {
            return false;
        }
        object = ((c0)object2).c;
        if (object == null || object instanceof Integer || object instanceof String) {
            bl = true;
        }
        return bl;
    }

    public final void j() {
        --this.k;
    }

    public final DateFormat l() {
        String string;
        if (this.n == null && (string = this.m) != null) {
            this.n = (SimpleDateFormat)this.k(string);
        }
        return this.n;
    }

    public final String m() {
        SimpleDateFormat simpleDateFormat = this.n;
        if (simpleDateFormat instanceof SimpleDateFormat) {
            return simpleDateFormat.toPattern();
        }
        return this.m;
    }

    public final X n(Class<?> clazz) {
        return this.i.e(clazz);
    }

    public final void o() {
        ++this.k;
    }

    public final boolean p(i0 i02) {
        return this.j.g(i02);
    }

    public final boolean q(Type object) {
        boolean bl = this.j.g(i0.o) && (object != null || !this.j.g(i0.t) || (object = this.p) != null && ((c0)object).a != null);
        return bl;
    }

    public final void r() {
        this.j.write(10);
        for (int i2 = 0; i2 < this.k; ++i2) {
            this.j.write(this.l);
        }
    }

    public final void s(c0 c02, Object object, Object object2) {
        this.t(c02, object, object2, 0, 0);
    }

    public final void t(c0 c02, Object object, Object object2, int n2, int n3) {
        if (this.j.h) {
            return;
        }
        this.p = new c0(c02, object, object2, n2);
        if (this.o == null) {
            this.o = new IdentityHashMap();
        }
        this.o.put(object, this.p);
    }

    public final String toString() {
        return this.j.toString();
    }

    public final void u(Object object) {
        if (object == null) {
            this.j.s();
            return;
        }
        X x2 = this.n(object.getClass());
        try {
            x2.d(this, object, null, null, 0);
            return;
        }
        catch (IOException iOException) {
            throw new d(iOException.getMessage(), iOException);
        }
    }

    public final void v(String string) {
        h0 h02 = this.j;
        if (string == null) {
            h02.u(i0.i);
        } else {
            h02.v(string);
        }
    }

    public final void w() {
        this.j.s();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void x(Object object) {
        Object object2;
        c0 c02;
        block9: {
            block8: {
                block7: {
                    c02 = this.p;
                    if (object != c02.b) break block7;
                    object = this.j;
                    object2 = "{\"$ref\":\"@\"}";
                    break block8;
                }
                c0 c03 = c02.a;
                object2 = c02;
                if (c03 == null) break block9;
                object2 = c02;
                if (object != c03.b) break block9;
                object = this.j;
                object2 = "{\"$ref\":\"..\"}";
            }
            ((h0)object).write((String)object2);
            return;
        }
        while (true) {
            if ((c02 = ((c0)object2).a) == null) {
                if (object == ((c0)object2).b) {
                    object = this.j;
                    object2 = "{\"$ref\":\"$\"}";
                } else {
                    this.j.write("{\"$ref\":\"");
                    object = this.o.get(object).toString();
                    this.j.write((String)object);
                    object = this.j;
                    object2 = "\"}";
                }
                ((h0)object).write((String)object2);
                return;
            }
            object2 = c02;
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void y(Object var1_1, Object var2_3) {
        if (var1_1 != null) ** GOTO lbl5
        try {
            block2: {
                this.j.s();
                break block2;
lbl5:
                // 1 sources

                this.n(var1_1.getClass()).d(this, var1_1, var2_3, null, 0);
            }
            return;
        }
        catch (IOException var1_2) {
            throw new d(var1_2.getMessage(), var1_2);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void z(Object object, String object2) {
        if (object instanceof Date) {
            Object object3;
            block21: {
                if ("unixtime".equals(object2)) {
                    long l2 = ((Date)object).getTime() / 1000L;
                    this.j.q((int)l2);
                    return;
                }
                if ("millis".equals(object2)) {
                    this.j.r(((Date)object).getTime());
                    return;
                }
                if (this.n == null && (object3 = this.m) != null) {
                    this.n = (SimpleDateFormat)this.k((String)object3);
                }
                SimpleDateFormat simpleDateFormat = this.n;
                object3 = simpleDateFormat;
                if (simpleDateFormat == null) {
                    block22: {
                        if (object2 != null) {
                            try {
                                object3 = this.k((String)object2);
                                break block21;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                object2 = ((String)object2).replaceAll("T", "'T'");
                                break block22;
                            }
                        }
                        object2 = com.github.catvod.spider.merge.y.a.e;
                    }
                    object3 = this.k((String)object2);
                }
            }
            object = ((DateFormat)object3).format((Date)object);
            this.j.v((String)object);
            return;
        }
        if (object instanceof byte[]) {
            Throwable throwable2222222;
            block23: {
                byte[] byArray = (byte[])object;
                if (!"gzip".equals(object2) && !"gzip,base64".equals(object2)) {
                    if ("hex".equals(object2)) {
                        this.j.p(byArray);
                        return;
                    }
                    this.j.h(byArray);
                    return;
                }
                Object var8_15 = null;
                GZIPOutputStream gZIPOutputStream = null;
                object = gZIPOutputStream;
                object2 = var8_15;
                object = gZIPOutputStream;
                object2 = var8_15;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                object = gZIPOutputStream;
                object2 = var8_15;
                if (byArray.length < 512) {
                    GZIPOutputStream gZIPOutputStream2;
                    object = gZIPOutputStream;
                    object2 = var8_15;
                    object = gZIPOutputStream;
                    object2 = var8_15;
                    gZIPOutputStream = gZIPOutputStream2 = new GZIPOutputStream((OutputStream)byteArrayOutputStream, byArray.length);
                } else {
                    object = gZIPOutputStream;
                    object2 = var8_15;
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                }
                object = gZIPOutputStream;
                object2 = gZIPOutputStream;
                ((OutputStream)gZIPOutputStream).write(byArray);
                object = gZIPOutputStream;
                object2 = gZIPOutputStream;
                gZIPOutputStream.finish();
                object = gZIPOutputStream;
                object2 = gZIPOutputStream;
                this.j.h(byteArrayOutputStream.toByteArray());
                {
                    catch (Throwable throwable2222222) {
                        break block23;
                    }
                    catch (IOException iOException) {}
                    object = object2;
                    {
                        object = object2;
                        d d2 = new d("write gzipBytes error", iOException);
                        object = object2;
                        throw d2;
                    }
                }
                com.github.catvod.spider.merge.H.i.a(gZIPOutputStream);
                return;
            }
            com.github.catvod.spider.merge.H.i.a((Closeable)object);
            throw throwable2222222;
        }
        if (!(object instanceof Collection)) {
            this.u(object);
            return;
        }
        Collection collection = (Collection)object;
        Iterator iterator = collection.iterator();
        this.j.write(91);
        int n2 = 0;
        while (true) {
            if (n2 >= collection.size()) {
                this.j.write(93);
                return;
            }
            object = iterator.next();
            if (n2 != 0) {
                this.j.write(44);
            }
            this.z(object, (String)object2);
            ++n2;
        }
    }
}

