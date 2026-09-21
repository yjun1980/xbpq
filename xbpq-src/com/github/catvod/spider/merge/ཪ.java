/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.ParametersAreNonnullByDefault
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u013a;
import com.github.catvod.spider.merge.\u017f;
import com.github.catvod.spider.merge.\u01c3;
import com.github.catvod.spider.merge.\u01d0;
import com.github.catvod.spider.merge.\u0371;
import com.github.catvod.spider.merge.\u0456;
import com.github.catvod.spider.merge.\u0457;
import com.github.catvod.spider.merge.\u05f2;
import com.github.catvod.spider.merge.\u0845;
import com.github.catvod.spider.merge.\u097d;
import com.github.catvod.spider.merge.\u0f8b;
import java.io.Reader;
import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

abstract class \u0f6a {
    protected \u0371 \u037f;
    \u0456 \u0528;
    \u05f2 \u0529;
    protected \u01d0 \u052a;
    protected ArrayList<\u013a> \u052b;
    protected String \u052c;
    protected \u017f \u052d;
    protected \u097d \u052e;
    private \u017f.\u0780 \u052f = new \u017f.\u0780();
    private \u017f.\u0620 \u058f = new \u017f.\u0620();

    \u0f6a() {
    }

    protected \u013a \u037f() {
        int n2 = this.\u052b.size();
        \u013a \u013a2 = n2 > 0 ? this.\u052b.get(n2 - 1) : null;
        return \u013a2;
    }

    abstract \u097d \u0528();

    protected void \u0529(String string) {
        \u0457 \u04572 = this.\u037f.\u037f();
        if (\u04572.\u037f()) {
            \u04572.add(new \u0845(this.\u0528.\u0797(), string));
        }
    }

    @ParametersAreNonnullByDefault
    protected void \u052a(Reader reader, String string, \u0371 \u03712) {
        \u01d0 \u01d02;
        \u01c3.\u058f(reader, SOY.d("2926231F1A105A3B3F0601035A3F24050057143D255616125A3C241A18"));
        \u01c3.\u058f(string, SOY.d("38332213212533723C0307035A3C3E0254151F723F03181B"));
        \u01c3.\u052f(\u03712);
        this.\u052a = \u01d02 = new \u01d0(string);
        \u01d02.\u0c80(\u03712);
        this.\u037f = \u03712;
        this.\u052e = \u03712.\u052c();
        this.\u0528 = new \u0456(reader);
        this.\u052d = null;
        this.\u0529 = new \u05f2(this.\u0528, \u03712.\u037f());
        this.\u052b = new ArrayList(32);
        this.\u052c = string;
    }

    protected abstract boolean \u052b(String var1);

    @ParametersAreNonnullByDefault
    \u01d0 \u052c(Reader reader, String string, \u0371 \u03712) {
        this.\u052a(reader, string, \u03712);
        this.\u0620();
        this.\u0528.\u052a();
        this.\u0528 = null;
        this.\u0529 = null;
        this.\u052b = null;
        return this.\u052a;
    }

    protected abstract boolean \u052d(\u017f var1);

    protected boolean \u052e(String string) {
        \u017f \u017f2 = this.\u052d;
        \u017f.\u0620 \u06202 = this.\u058f;
        if (\u017f2 == \u06202) {
            return this.\u052d(new \u017f.\u0620().\u0791(string));
        }
        return this.\u052d(\u06202.\u0794().\u0791(string));
    }

    protected boolean \u052f(String string) {
        \u017f.\u0780 \u07802 = this.\u052f;
        if (this.\u052d == \u07802) {
            return this.\u052d(new \u017f.\u0780().\u0791(string));
        }
        return this.\u052d(\u07802.\u0794().\u0791(string));
    }

    public boolean \u058f(String string, \u0f8b \u0f8b2) {
        \u017f.\u0780 \u07802 = this.\u052f;
        if (this.\u052d == \u07802) {
            return this.\u052d(new \u017f.\u0780().\u0797(string, \u0f8b2));
        }
        \u07802.\u0794();
        \u07802.\u0797(string, \u0f8b2);
        return this.\u052d(\u07802);
    }

    protected void \u0620() {
        \u017f \u017f2;
        \u05f2 \u05f22 = this.\u0529;
        \u017f.\u0782 \u07822 = \u017f.\u0782.\u052c;
        do {
            \u017f2 = \u05f22.\u078a();
            this.\u052d(\u017f2);
            \u017f2.\u0781();
        } while (\u017f2.\u037f != \u07822);
    }
}

