/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u01c3;
import com.github.catvod.spider.merge.\u0582;
import com.github.catvod.spider.merge.\u0f8b;
import java.util.List;

abstract class \u02d0
extends \u0582 {
    Object \u052a;

    \u02d0() {
    }

    private void \u07a1() {
        if (!this.\u0785()) {
            Object object = this.\u052a;
            \u0f8b \u0f8b2 = new \u0f8b();
            this.\u052a = \u0f8b2;
            if (object != null) {
                \u0f8b2.\u078a(this.\u0789(), (String)object);
            }
        }
    }

    @Override
    public String \u037f(String string) {
        this.\u07a1();
        return super.\u037f(string);
    }

    @Override
    public String \u0529(String string) {
        \u01c3.\u052f(string);
        if (!this.\u0785()) {
            string = string.equals(this.\u0789()) ? (String)this.\u052a : "";
            return string;
        }
        return super.\u0529(string);
    }

    @Override
    public \u0582 \u052a(String string, String string2) {
        if (!this.\u0785() && string.equals(this.\u0789())) {
            this.\u052a = string2;
        } else {
            this.\u07a1();
            super.\u052a(string, string2);
        }
        return this;
    }

    @Override
    public final \u0f8b \u052b() {
        this.\u07a1();
        return (\u0f8b)this.\u052a;
    }

    @Override
    public String \u052c() {
        String string = this.\u0786() ? this.\u0790().\u052c() : "";
        return string;
    }

    @Override
    public int \u052f() {
        return 0;
    }

    @Override
    protected void \u0781(String string) {
    }

    @Override
    public \u0582 \u0782() {
        return this;
    }

    @Override
    protected List<\u0582> \u0783() {
        return \u0582.\u037f;
    }

    @Override
    protected final boolean \u0785() {
        return this.\u052a instanceof \u0f8b;
    }

    String \u079f() {
        return this.\u0529(this.\u0789());
    }

    protected \u02d0 \u07a0(\u0582 \u05822) {
        \u05822 = (\u02d0)super.\u0780(\u05822);
        if (this.\u0785()) {
            ((\u02d0)\u05822).\u052a = ((\u0f8b)this.\u052a).\u052f();
        }
        return \u05822;
    }
}

