/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u013a;
import com.github.catvod.spider.merge.\u0442;
import com.github.catvod.spider.merge.\u0e33;
import com.github.catvod.spider.merge.\u0ec0;
import java.util.List;

public class \u02ec {
    private Object \u037f;

    public \u02ec(Object object) {
        this.\u037f = object;
    }

    public static \u02ec \u0529(Object object) {
        return new \u02ec(object);
    }

    public String toString() {
        return this.\u0528();
    }

    public \u013a \u037f() {
        return (\u013a)this.\u037f;
    }

    public String \u0528() {
        if (this.\u052b()) {
            return (String)this.\u037f;
        }
        if (this.\u052a()) {
            \u013a \u013a2 = (\u013a)this.\u037f;
            if (\u0ec0.\u037f(\u013a2.\u08b8(), SOY.d("300A0E22312F2E"))) {
                return \u013a2.\u08ab();
            }
            return \u013a2.toString();
        }
        return String.valueOf(this.\u037f);
    }

    public boolean \u052a() {
        return this.\u037f instanceof \u013a;
    }

    public boolean \u052b() {
        return this.\u037f instanceof String;
    }

    public List<\u02ec> \u052c(String string) {
        if (!this.\u052a()) {
            return null;
        }
        return new \u0442(new \u0e33(this.\u037f())).\u0528(string);
    }

    public \u02ec \u052d(String object) {
        if ((object = this.\u052c((String)object)) != null && object.size() > 0) {
            return (\u02ec)object.get(0);
        }
        return null;
    }
}

