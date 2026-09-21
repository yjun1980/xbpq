/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.money.CurrencyUnit
 *  javax.money.Monetary
 *  org.javamoney.moneta.Money
 */
package com.github.catvod.spider.merge.F;

import com.github.catvod.spider.merge.B.b;
import com.github.catvod.spider.merge.C.v;
import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.D.h0;
import com.github.catvod.spider.merge.D.i0;
import com.github.catvod.spider.merge.y.e;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.money.CurrencyUnit;
import javax.money.Monetary;
import org.javamoney.moneta.Money;

public final class a
implements X,
v {
    public static final a a = new a();

    @Override
    public final <T> T c(b object, Type object2, Object object3) {
        object2 = ((b)object).s();
        object = (object = ((e)object2).get("currency")) instanceof e ? ((e)object).x("currencyCode") : (object instanceof String ? (String)object : null);
        if (!((object2 = ((e)object2).get("numberStripped")) instanceof BigDecimal || object2 instanceof Integer || object2 instanceof BigInteger)) {
            throw new UnsupportedOperationException();
        }
        return (T)Money.of((Number)((Number)object2), (CurrencyUnit)Monetary.getCurrency((String)object, (String[])new String[0]));
    }

    @Override
    public final void d(L object, Object object2, Object object3, Type type, int n2) {
        if ((object2 = (Money)object2) == null) {
            ((L)object).w();
            return;
        }
        object3 = ((L)object).j;
        object = object2.getNumberStripped();
        ((h0)object3).write(123);
        ((h0)object3).j("numberStripped");
        if (object == null) {
            ((h0)object3).s();
        } else {
            n2 = ((BigDecimal)object).scale();
            object = ((h0)object3).g(i0.B) && n2 >= -100 && n2 < 100 ? ((BigDecimal)object).toPlainString() : ((BigDecimal)object).toString();
            ((h0)object3).write((String)object);
        }
        ((h0)object3).m(',', "currency", object2.getCurrency().getCurrencyCode());
        ((h0)object3).write(125);
    }

    @Override
    public final int e() {
        return 0;
    }
}

