/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.C;

import com.github.catvod.spider.merge.B.b;
import com.github.catvod.spider.merge.B.c;
import com.github.catvod.spider.merge.B.f;
import com.github.catvod.spider.merge.B.i;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.C.g;
import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.H.m;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public abstract class d
extends g {
    @Override
    public final <T> T c(b b2, Type type, Object object) {
        return this.f(b2, type, object, null, 0);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final <T> T f(b object, Type object2, Object object3, String clazz, int n2) {
        com.github.catvod.spider.merge.B.d d2 = ((b)object).f;
        n2 = d2.p();
        object3 = null;
        Object var13_11 = null;
        if (n2 == 2) {
            long l2 = d2.h();
            d2.o(16);
            long l3 = l2;
            if ("unixtime".equals(clazz)) {
                l3 = l2 * 1000L;
            }
            object3 = l3;
            clazz = object2;
            return (T)this.g((b)object, clazz, object3);
        }
        if (d2.p() == 4) {
            void var10_33;
            String string = d2.K();
            Object var10_16 = var13_11;
            if (clazz != null) {
                void var10_28;
                Date date;
                if ("yyyy-MM-dd HH:mm:ss.SSSSSSSSS".equals(clazz) && object2 instanceof Class && ((Class)object2).getName().equals("java.sql.Timestamp")) {
                    return (T)m.b(A.R, string);
                }
                try {
                    object3 = new SimpleDateFormat((String)((Object)clazz), ((b)object).f.G());
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    if (((String)((Object)clazz)).contains("T")) {
                        object3 = ((String)((Object)clazz)).replaceAll("T", "'T'");
                        try {
                            object3 = new SimpleDateFormat((String)object3, ((b)object).f.G());
                        }
                        catch (IllegalArgumentException illegalArgumentException2) {
                            throw illegalArgumentException;
                        }
                    }
                    object3 = null;
                }
                if (com.github.catvod.spider.merge.y.a.a != null) {
                    ((DateFormat)object3).setTimeZone(((b)object).f.M());
                }
                try {
                    date = ((DateFormat)object3).parse(string);
                }
                catch (ParseException parseException) {
                    date = null;
                }
                Date date2 = date;
                if (date == null) {
                    Date date3 = date;
                    if (com.github.catvod.spider.merge.y.a.b == Locale.CHINA) {
                        block35: {
                            try {
                                SimpleDateFormat simpleDateFormat = new SimpleDateFormat((String)((Object)clazz), Locale.US);
                                object3 = simpleDateFormat;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                if (!((String)((Object)clazz)).contains("T")) break block35;
                                object3 = ((String)((Object)clazz)).replaceAll("T", "'T'");
                                try {
                                    object3 = new SimpleDateFormat((String)object3, ((b)object).f.G());
                                }
                                catch (IllegalArgumentException illegalArgumentException3) {
                                    throw illegalArgumentException;
                                }
                            }
                        }
                        ((DateFormat)object3).setTimeZone(((b)object).f.M());
                        try {
                            Date date4 = ((DateFormat)object3).parse(string);
                        }
                        catch (ParseException parseException) {
                            Object var10_27 = null;
                        }
                    }
                }
                if (var10_28 == null) {
                    Object var10_29 = var13_11;
                    if (((String)((Object)clazz)).equals("yyyy-MM-dd'T'HH:mm:ss.SSS")) {
                        Object var10_30 = var13_11;
                        if (string.length() == 19) {
                            try {
                                object3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", com.github.catvod.spider.merge.y.a.b);
                                ((DateFormat)object3).setTimeZone(com.github.catvod.spider.merge.y.a.a);
                                Date date5 = ((DateFormat)object3).parse(string);
                            }
                            catch (ParseException parseException) {
                                Object var10_32 = var13_11;
                            }
                        }
                    }
                }
            }
            object3 = var10_33;
            clazz = object2;
            if (var10_33 != null) return (T)this.g((b)object, clazz, object3);
            d2.o(16);
            object3 = string;
            if (d2.l(c.f)) {
                clazz = new i(string);
                object3 = string;
                if (((i)((Object)clazz)).x0(true)) {
                    object3 = ((f)((Object)clazz)).S().getTime();
                }
                ((f)((Object)clazz)).close();
            }
            clazz = object2;
            return (T)this.g((b)object, clazz, object3);
        }
        if (d2.p() == 8) {
            d2.nextToken();
            clazz = object2;
            return (T)this.g((b)object, clazz, object3);
        }
        if (d2.p() == 12) {
            d2.nextToken();
            if (d2.p() != 4) throw new com.github.catvod.spider.merge.y.d("syntax error");
            clazz = d2.K();
            object3 = object2;
            if (com.github.catvod.spider.merge.y.a.c.equals(clazz)) {
                d2.nextToken();
                ((b)object).a(17);
                object3 = d2.K();
                object3 = ((b)object).e().b((String)object3, null, d2.w());
                if (object3 != null) {
                    object2 = object3;
                }
                ((b)object).a(4);
                ((b)object).a(16);
                object3 = object2;
            }
            d2.a();
            if (d2.p() != 2) {
                object = a.c("syntax error : ");
                ((StringBuilder)object).append(d2.y());
                throw new com.github.catvod.spider.merge.y.d(((StringBuilder)object).toString());
            }
            long l4 = d2.h();
            d2.nextToken();
            clazz = l4;
            object2 = object3;
            object3 = clazz;
        } else {
            if (((b)object).k != 2) {
                object3 = ((b)object).o(null);
                clazz = object2;
                return (T)this.g((b)object, clazz, object3);
            }
            ((b)object).k = 0;
            ((b)object).a(16);
            if (d2.p() != 4) throw new com.github.catvod.spider.merge.y.d("syntax error");
            if (!"val".equals(d2.K())) throw new com.github.catvod.spider.merge.y.d("syntax error");
            d2.nextToken();
            ((b)object).a(17);
            object3 = ((b)object).o(null);
        }
        ((b)object).a(13);
        clazz = object2;
        return (T)this.g((b)object, clazz, object3);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    protected abstract Object g(b var1, Type var2, Object var3);
}

