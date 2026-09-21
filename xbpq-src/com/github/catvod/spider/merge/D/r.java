/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.B.b;
import com.github.catvod.spider.merge.C.g;
import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.D.h0;
import com.github.catvod.spider.merge.D.i0;
import com.github.catvod.spider.merge.D.k;
import com.github.catvod.spider.merge.D.w;
import com.github.catvod.spider.merge.D.y;
import com.github.catvod.spider.merge.H.i;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public final class r
extends g
implements X,
w {
    public static final r b = new r();
    private DatatypeFactory a;

    @Override
    public final void b(L l2, Object object, k object2) {
        h0 h02 = l2.j;
        object2 = ((k)object2).b();
        object = (Calendar)object;
        if (((String)object2).equals("unixtime")) {
            h02.q((int)(((Calendar)object).getTimeInMillis() / 1000L));
            return;
        }
        object2 = new SimpleDateFormat((String)object2);
        ((DateFormat)object2).setTimeZone(l2.q);
        h02.v(((DateFormat)object2).format(((Calendar)object).getTime()));
    }

    @Override
    public final <T> T c(b b2, Type type, Object object) {
        return this.f(b2, type, object, null, 0);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void d(L var1_1, Object var2_2, Object var3_3, Type var4_4, int var5_5) {
        block13: {
            block8: {
                block10: {
                    block12: {
                        block11: {
                            block9: {
                                var3_3 = var1_1.j;
                                if (var2_2 == null) {
                                    var3_3.s();
                                    return;
                                }
                                var2_2 = var2_2 instanceof XMLGregorianCalendar != false ? ((XMLGregorianCalendar)var2_2).toGregorianCalendar() : (Calendar)var2_2;
                                if (!var3_3.g(i0.g)) break block8;
                                var5_5 = var3_3.g(i0.c) != false ? 39 : 34;
                                var3_3.write(var5_5);
                                var11_6 = var2_2.get(1);
                                var13_7 = var2_2.get(2) + 1;
                                var9_8 = var2_2.get(5);
                                var8_9 = var2_2.get(11);
                                var7_10 = var2_2.get(12);
                                var12_11 = var2_2.get(13);
                                var10_12 = var2_2.get(14);
                                if (var10_12 != 0) {
                                    var1_1 = "0000-00-00T00:00:00.000".toCharArray();
                                    i.c(var10_12, 23, (char[])var1_1);
                                    i.c(var12_11, 19, (char[])var1_1);
                                    i.c(var7_10, 16, (char[])var1_1);
                                    i.c(var8_9, 13, (char[])var1_1);
                                    i.c(var9_8, 10, (char[])var1_1);
                                    i.c(var13_7, 7, (char[])var1_1);
                                    i.c(var11_6, 4, (char[])var1_1);
                                } else if (var12_11 == 0 && var7_10 == 0 && var8_9 == 0) {
                                    var1_1 = "0000-00-00".toCharArray();
                                    i.c(var9_8, 10, (char[])var1_1);
                                    i.c(var13_7, 7, (char[])var1_1);
                                    i.c(var11_6, 4, (char[])var1_1);
                                } else {
                                    var1_1 = "0000-00-00T00:00:00".toCharArray();
                                    i.c(var12_11, 19, (char[])var1_1);
                                    i.c(var7_10, 16, (char[])var1_1);
                                    i.c(var8_9, 13, (char[])var1_1);
                                    i.c(var9_8, 10, (char[])var1_1);
                                    i.c(var13_7, 7, (char[])var1_1);
                                    i.c(var11_6, 4, (char[])var1_1);
                                }
                                var3_3.write((char[])var1_1);
                                var6_13 = (float)var2_2.getTimeZone().getOffset(var2_2.getTimeInMillis()) / 3600000.0f;
                                var7_10 = (int)var6_13;
                                if ((double)var7_10 != 0.0) break block9;
                                var3_3.write(90);
                                break block10;
                            }
                            if (var7_10 <= 9) break block11;
                            var3_3.write(43);
                            ** GOTO lbl57
                        }
                        if (var7_10 <= 0) break block12;
                        var3_3.write(43);
                        var3_3.write(48);
                        ** GOTO lbl57
                    }
                    if (var7_10 < -9) {
                        var3_3.write(45);
lbl57:
                        // 3 sources

                        var3_3.q(var7_10);
                    } else if (var7_10 < 0) {
                        var3_3.write(45);
                        var3_3.write(48);
                        var3_3.q(-var7_10);
                    }
                    var3_3.write(58);
                    var3_3.b(String.format("%02d", new Object[]{(int)((var6_13 - (float)var7_10) * 60.0f)}));
                }
                var3_3.write(var5_5);
                break block13;
            }
            var1_1.u(var2_2.getTime());
        }
    }

    @Override
    public final int e() {
        return 2;
    }

    @Override
    public final <T> T f(b object, Type type, Object object2, String object3, int n2) {
        if ((object2 = y.a.f((b)object, type, object2, (String)object3, n2)) instanceof Calendar) {
            return (T)object2;
        }
        object3 = (Date)object2;
        if (object3 == null) {
            return null;
        }
        object = ((b)object).f;
        object2 = Calendar.getInstance(object.M(), object.G());
        ((Calendar)object2).setTime((Date)object3);
        object = object2;
        if (type == XMLGregorianCalendar.class) {
            object = this.g((GregorianCalendar)object2);
        }
        return (T)object;
    }

    public final XMLGregorianCalendar g(Calendar calendar) {
        if (this.a == null) {
            try {
                this.a = DatatypeFactory.newInstance();
            }
            catch (DatatypeConfigurationException datatypeConfigurationException) {
                throw new IllegalStateException("Could not obtain an instance of DatatypeFactory.", datatypeConfigurationException);
            }
        }
        return this.a.newXMLGregorianCalendar((GregorianCalendar)calendar);
    }
}

