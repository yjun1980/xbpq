/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u02c0;
import com.github.catvod.spider.merge.\u02c1;
import com.github.catvod.spider.merge.\u02c8;
import com.github.catvod.spider.merge.\u0868;
import java.util.List;

public class \u08a1
implements \u02c0 {
    public static final \u0868 \u037f = new \u0868();
    public \u08a1 \u0528;
    public int \u0529 = -1;

    public \u08a1() {
    }

    public \u08a1(\u08a1 \u08a12, int n2) {
        this.\u0528 = \u08a12;
        this.\u0529 = n2;
    }

    public String toString() {
        return this.\u0620(null, null);
    }

    @Override
    public String \u0528() {
        if (this.\u052c() == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < this.\u052c(); ++i2) {
            stringBuilder.append(this.\u052b(i2).\u0528());
        }
        return stringBuilder.toString();
    }

    @Override
    public <T> T \u052a(\u02c1<? extends T> \u02c12) {
        return \u02c12.\u052b(this);
    }

    @Override
    public \u02c8 \u052b(int n2) {
        return null;
    }

    @Override
    public int \u052c() {
        return 0;
    }

    public \u08a1 \u052d() {
        return this.\u0528;
    }

    public int \u052e() {
        return -1;
    }

    public boolean \u052f() {
        boolean bl = this.\u0529 == -1;
        return bl;
    }

    public void \u058f(int n2) {
    }

    public String \u0620(List<String> list, \u08a1 \u08a12) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(SOY.d("21"));
        \u08a1 \u08a13 = this;
        while (\u08a13 != null && \u08a13 != \u08a12) {
            Object object;
            if (list == null) {
                if (!\u08a13.\u052f()) {
                    stringBuilder.append(\u08a13.\u0529);
                }
            } else {
                int n2 = \u08a13.\u052e();
                object = n2 >= 0 && n2 < list.size() ? list.get(n2) : Integer.toString(n2);
                stringBuilder.append((String)object);
            }
            if (!((object = \u08a13.\u0528) == null || list == null && ((\u08a1)object).\u052f())) {
                stringBuilder.append(SOY.d("5A"));
            }
            \u08a13 = \u08a13.\u0528;
        }
        stringBuilder.append(SOY.d("27"));
        return stringBuilder.toString();
    }
}

