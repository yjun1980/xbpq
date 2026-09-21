/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.D.C;
import com.github.catvod.spider.merge.D.E;
import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.M;
import com.github.catvod.spider.merge.D.T;
import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.D.h0;
import com.github.catvod.spider.merge.D.i0;
import com.github.catvod.spider.merge.D.k;
import com.github.catvod.spider.merge.D.w;
import com.github.catvod.spider.merge.D.z;
import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.H.e;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.y.a;
import com.github.catvod.spider.merge.z.b;
import com.github.catvod.spider.merge.z.d;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.sql.Date;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Collection;

public final class D
implements Comparable<D> {
    public final e a;
    protected final boolean b;
    protected int c;
    private final String d;
    private String e;
    private String f;
    protected k g;
    private String h;
    protected boolean i;
    protected boolean j;
    protected boolean k;
    protected boolean l;
    protected boolean m;
    protected boolean n;
    private C o;

    /*
     * WARNING - void declaration
     */
    public D(Class<?> object2, e e2) {
        boolean bl;
        block20: {
            block19: {
                d d2;
                void var2_8;
                boolean bl2 = false;
                this.i = false;
                this.j = false;
                this.k = false;
                this.l = false;
                this.m = false;
                this.a = var2_8;
                this.g = new k((e)var2_8);
                if (object2 != null && (d2 = A.D(object2, d.class)) != null) {
                    for (i0 i02 : d2.serialzeFeatures()) {
                        if (i02 == i0.e) {
                            this.i = true;
                            continue;
                        }
                        if (i02 == i0.f) {
                            this.j = true;
                            continue;
                        }
                        if (i02 == i0.p) {
                            this.k = true;
                            continue;
                        }
                        i0 i03 = i0.r;
                        if (i02 == i03) {
                            this.c |= i03.a;
                            this.n = true;
                            continue;
                        }
                        i0 i04 = i0.d;
                        if (i02 != i04) continue;
                        this.c |= i04.a;
                    }
                }
                var2_8.o();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append('\"');
                this.d = r.c(stringBuilder, var2_8.a, "\":");
                b b2 = var2_8.h();
                if (b2 != null) {
                    String string;
                    int n2;
                    block18: {
                        i0[] i0Array = b2.serialzeFeatures();
                        int n3 = i0Array.length;
                        for (n2 = 0; n2 < n3; ++n2) {
                            if ((i0Array[n2].a & i0.E) == 0) continue;
                            bl = true;
                            break block18;
                        }
                        bl = false;
                    }
                    this.h = string = b2.format();
                    if (string.trim().length() == 0) {
                        this.h = null;
                    }
                    for (i0 i05 : b2.serialzeFeatures()) {
                        if (i05 == i0.e) {
                            this.i = true;
                            continue;
                        }
                        if (i05 == i0.f) {
                            this.j = true;
                            continue;
                        }
                        if (i05 == i0.p) {
                            this.k = true;
                            continue;
                        }
                        if (i05 != i0.r) continue;
                        this.n = true;
                    }
                    n2 = this.c;
                    this.c = i0.h(b2.serialzeFeatures()) | n2;
                } else {
                    bl = false;
                }
                this.b = bl;
                if (A.a0(var2_8.b)) break block19;
                bl = bl2;
                if (!A.Z(var2_8.b)) break block20;
            }
            bl = true;
        }
        this.m = bl;
    }

    public final Object b(Object object) {
        Object object2;
        block2: {
            block3: {
                object2 = this.a;
                GenericDeclaration genericDeclaration = ((e)object2).b;
                object = genericDeclaration != null ? genericDeclaration.invoke(object, new Object[0]) : ((e)object2).c.get(object);
                object2 = object;
                if (this.h == null) break block2;
                object2 = object;
                if (object == null) break block2;
                genericDeclaration = this.a.e;
                if (genericDeclaration == java.util.Date.class) break block3;
                object2 = object;
                if (genericDeclaration != Date.class) break block2;
            }
            object2 = new SimpleDateFormat(this.h, com.github.catvod.spider.merge.y.a.b);
            ((DateFormat)object2).setTimeZone(com.github.catvod.spider.merge.y.a.a);
            object2 = ((Format)object2).format(object);
        }
        return object2;
    }

    @Override
    public final int compareTo(Object object) {
        object = (D)object;
        return this.a.b(((D)object).a);
    }

    public final Object e(Object object) {
        e e2 = this.a;
        Object object2 = e2.b;
        object = object2 != null ? ((Method)object2).invoke(object, new Object[0]) : e2.c.get(object);
        object2 = object;
        if (this.m) {
            object2 = object;
            if (!A.d0(object)) {
                object2 = null;
            }
        }
        return object2;
    }

    public final void h(L object) {
        h0 h02 = ((L)object).j;
        if (h02.f) {
            if (i0.b(h02.c, this.a.i, i0.c)) {
                if (this.e == null) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append('\'');
                    this.e = r.c((StringBuilder)object, this.a.a, "':");
                }
                object = this.e;
            } else {
                object = this.d;
            }
        } else {
            if (this.f == null) {
                this.f = r.c(new StringBuilder(), this.a.a, ":");
            }
            object = this.f;
        }
        h02.write((String)object);
    }

    public final void i(L l2, Object object) {
        long l3;
        Object object2;
        Object object3;
        Class<?> clazz;
        block36: {
            block38: {
                block39: {
                    String string;
                    block40: {
                        block41: {
                            block37: {
                                if (this.o != null) break block36;
                                if (object == null) {
                                    clazz = this.a.e;
                                    if (clazz == Byte.TYPE) {
                                        object3 = Byte.class;
                                    } else if (clazz == Short.TYPE) {
                                        object3 = Short.class;
                                    } else if (clazz == Integer.TYPE) {
                                        object3 = Integer.class;
                                    } else if (clazz == Long.TYPE) {
                                        object3 = Long.class;
                                    } else if (clazz == Float.TYPE) {
                                        object3 = Float.class;
                                    } else if (clazz == Double.TYPE) {
                                        object3 = Double.class;
                                    } else {
                                        object3 = clazz;
                                        if (clazz == Boolean.TYPE) {
                                            object3 = Boolean.class;
                                        }
                                    }
                                } else {
                                    object3 = object.getClass();
                                }
                                object2 = null;
                                clazz = this.a.h();
                                if (clazz == null || clazz.serializeUsing() == Void.class) break block37;
                                clazz = (X)clazz.serializeUsing().newInstance();
                                this.l = true;
                                break block38;
                            }
                            string = this.h;
                            clazz = object2;
                            if (string == null) break block39;
                            if (object3 == Double.TYPE || object3 == Double.class) break block40;
                            if (object3 == Float.TYPE) break block41;
                            clazz = object2;
                            if (object3 != Float.class) break block39;
                        }
                        clazz = new E(string);
                        break block39;
                    }
                    clazz = new z(string);
                }
                if (clazz == null) {
                    clazz = l2.n((Class<?>)object3);
                }
            }
            this.o = new C((X)((Object)clazz), (Class<?>)object3);
        }
        object3 = this.o;
        int n2 = this.k ? this.a.i | i0.p.a : this.a.i;
        n2 |= this.c;
        if (object == null) {
            object = l2.j;
            if (this.a.e == Object.class && ((h0)object).f(i0.E)) {
                ((h0)object).s();
                return;
            }
            clazz = ((C)object3).b;
            if (Number.class.isAssignableFrom(clazz)) {
                ((h0)object).t(this.c, i0.j.a);
                return;
            }
            if (String.class == clazz) {
                ((h0)object).t(this.c, i0.i.a);
                return;
            }
            if (Boolean.class == clazz) {
                ((h0)object).t(this.c, i0.k.a);
                return;
            }
            if (!Collection.class.isAssignableFrom(clazz) && !clazz.isArray()) {
                object3 = ((C)object3).a;
                if (((h0)object).f(i0.E) && object3 instanceof M) {
                    ((h0)object).s();
                    return;
                }
                object = this.a;
                object3.d(l2, null, ((e)object).a, ((e)object).f, n2);
                return;
            }
            ((h0)object).t(this.c, i0.h.a);
            return;
        }
        if (this.a.p) {
            if (this.j) {
                l2.j.v(((Enum)object).name());
                return;
            }
            if (this.i) {
                l2.j.v(((Enum)object).toString());
                return;
            }
        }
        object3 = (clazz = object.getClass()) != ((C)object3).b && !this.l ? l2.n(clazz) : ((C)object3).a;
        object2 = this.h;
        if (object2 != null && !(object3 instanceof z) && !(object3 instanceof E)) {
            if (object3 instanceof w) {
                ((w)object3).b(l2, object, this.g);
            } else {
                l2.z(object, (String)object2);
            }
            return;
        }
        object2 = this.a;
        if (((e)object2).r) {
            if (object3 instanceof M) {
                ((M)object3).r(l2, object, ((e)object2).a, ((e)object2).f, n2, true);
                return;
            }
            if (object3 instanceof T) {
                ((T)object3).i(l2, object, ((e)object2).a, ((e)object2).f, n2, true);
                return;
            }
        }
        if ((this.c & i0.o.a) != 0 && clazz != ((e)object2).e && object3 instanceof M) {
            ((M)object3).r(l2, object, ((e)object2).a, ((e)object2).f, n2, false);
            return;
        }
        if (!(!this.n || (clazz = ((e)object2).e) != Long.TYPE && clazz != Long.class || (l3 = ((Long)object).longValue()) <= 0x1FFFFFFFFFFFFFL && l3 >= -9007199254740991L)) {
            l2.j.v(Long.toString(l3));
            return;
        }
        clazz = this.a;
        object3.d(l2, object, ((e)((Object)clazz)).a, ((e)((Object)clazz)).f, n2);
    }
}

