/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u02d1;
import com.github.catvod.spider.merge.\u02e4;
import java.util.ArrayList;
import java.util.List;

public class \u02b2 {
    private static final String[] \u037f = new String[]{SOY.d("1D37253515020937"), SOY.d("1D372538110F0E17291511070E3B3E18"), SOY.d("1D37252215051D3725330C141F22251F1B19"), SOY.d("1D3725330C141F22251F1B19"), SOY.d("1D3725251B02083134330C141F22251F1B19"), SOY.d("1D3725241B180E1130030712"), SOY.d("1D3725351502093735340D3202313406001E153C"), SOY.d("1D37253811040E3735"), SOY.d("1D37253A1D19113735330C141F22251F1B19"), SOY.d("1D37253811040E3735330C141F22251F1B19"), SOY.d("1D37253A1D191137353515020937"), SOY.d("1D3725221C05152530141812")};

    public static String \u037f(Throwable serializable) {
        if (serializable == null) {
            return "";
        }
        String string = \u02e4.\u0528(serializable, null);
        String string2 = ((Throwable)serializable).getMessage();
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append(string);
        ((StringBuilder)serializable).append(SOY.d("4072"));
        ((StringBuilder)serializable).append(\u02d1.\u0529(string2));
        return ((StringBuilder)serializable).toString();
    }

    public static Throwable \u0528(Throwable object) {
        object = (object = \u02b2.\u052a((Throwable)object)).isEmpty() ? null : (Throwable)object.get(object.size() - 1);
        return object;
    }

    public static String \u0529(Throwable throwable) {
        Throwable throwable2 = \u02b2.\u0528(throwable);
        if (throwable2 != null) {
            throwable = throwable2;
        }
        return \u02b2.\u037f(throwable);
    }

    public static List<Throwable> \u052a(Throwable throwable) {
        ArrayList<Throwable> arrayList = new ArrayList<Throwable>();
        while (throwable != null && !arrayList.contains(throwable)) {
            arrayList.add(throwable);
            throwable = throwable.getCause();
        }
        return arrayList;
    }

    public static <R> R \u052b(Throwable throwable) {
        return \u02b2.\u052c(throwable);
    }

    private static <R, T extends Throwable> R \u052c(Throwable throwable) {
        throw throwable;
    }
}

