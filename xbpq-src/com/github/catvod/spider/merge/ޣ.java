/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u02c9;
import com.github.catvod.spider.merge.\u02cb;
import com.github.catvod.spider.merge.\u079f;
import com.github.catvod.spider.merge.\u08a0;
import com.github.catvod.spider.merge.\u08a5;
import com.github.catvod.spider.merge.\u08a9;
import java.io.Serializable;

public class \u07a3
implements \u08a9,
Serializable {
    protected static final \u02c9<\u08a5, \u079f> \u037f = new \u02c9<Object, Object>(null, null);
    protected int \u0528;
    protected int \u0529;
    protected int \u052a = -1;
    protected int \u052b = 0;
    protected \u02c9<\u08a5, \u079f> \u052c;
    protected String \u052d;
    protected int \u052e = -1;
    protected int \u052f;
    protected int \u058f;

    public \u07a3(\u02c9<\u08a5, \u079f> \u02c92, int n2, int n3, int n4, int n5) {
        this.\u052c = \u02c92;
        this.\u0528 = n2;
        this.\u052b = n3;
        this.\u052f = n4;
        this.\u058f = n5;
        Object a2 = \u02c92.\u037f;
        if (a2 != null) {
            this.\u0529 = ((\u08a5)a2).\u0529();
            this.\u052a = ((\u08a5)\u02c92.\u037f).\u037f();
        }
    }

    @Override
    public int getChannel() {
        return this.\u052b;
    }

    @Override
    public int getType() {
        return this.\u0528;
    }

    public String toString() {
        return this.\u0620(null);
    }

    @Override
    public int \u037f() {
        return this.\u052a;
    }

    @Override
    public String \u0528() {
        int n2;
        Object object = this.\u052d;
        if (object != null) {
            return object;
        }
        object = this.\u052d();
        if (object == null) {
            return null;
        }
        int n3 = this.\u052f;
        int n4 = object.size();
        if (n3 < n4 && (n2 = this.\u058f) < n4) {
            return object.\u052e(\u02cb.\u0529(n3, n2));
        }
        return SOY.d("46171E304A");
    }

    @Override
    public int \u0529() {
        return this.\u0529;
    }

    @Override
    public \u08a5 \u052a() {
        return (\u08a5)this.\u052c.\u037f;
    }

    @Override
    public int \u052b() {
        return this.\u052e;
    }

    @Override
    public void \u052c(int n2) {
        this.\u052e = n2;
    }

    public \u079f \u052d() {
        return (\u079f)this.\u052c.\u0528;
    }

    public void \u052e(int n2) {
        this.\u052a = n2;
    }

    public void \u052f(int n2) {
        this.\u0529 = n2;
    }

    public void \u058f(String string) {
        this.\u052d = string;
    }

    public String \u0620(\u08a0 object) {
        CharSequence charSequence;
        if (this.\u052b > 0) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(SOY.d("563139171A191F3E6C"));
            ((StringBuilder)charSequence).append(this.\u052b);
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = "";
        }
        String string = this.\u0528();
        string = string != null ? string.replace(SOY.d("70"), SOY.d("263C")).replace(SOY.d("77"), SOY.d("2620")).replace(SOY.d("73"), SOY.d("2626")) : SOY.d("463C3E56001202266F");
        String string2 = String.valueOf(this.\u0528);
        if (object != null) {
            string2 = ((\u08a0)object).\u0781().\u0529(this.\u0528);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(SOY.d("2112"));
        ((StringBuilder)object).append(this.\u052b());
        String string3 = SOY.d("56");
        ((StringBuilder)object).append(string3);
        ((StringBuilder)object).append(this.\u052f);
        String string4 = SOY.d("40");
        ((StringBuilder)object).append(string4);
        ((StringBuilder)object).append(this.\u058f);
        ((StringBuilder)object).append(SOY.d("4775"));
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(SOY.d("5D7E6D"));
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(SOY.d("44"));
        ((StringBuilder)object).append((String)charSequence);
        ((StringBuilder)object).append(string3);
        ((StringBuilder)object).append(this.\u0529);
        ((StringBuilder)object).append(string4);
        ((StringBuilder)object).append(this.\u037f());
        ((StringBuilder)object).append(SOY.d("27"));
        return ((StringBuilder)object).toString();
    }
}

