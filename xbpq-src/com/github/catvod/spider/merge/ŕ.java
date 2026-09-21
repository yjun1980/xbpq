/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u013a;
import com.github.catvod.spider.merge.\u068c;
import com.github.catvod.spider.merge.\u0e33;

public class \u0155 {
    private \u0e33 \u037f;
    private boolean \u0528 = false;
    private \u0155 \u0529;

    private \u0155(\u013a \u013a2) {
        \u0e33 \u0e332;
        this.\u037f = \u0e332 = new \u0e33();
        \u0e332.add(\u013a2);
    }

    private \u0155(\u0e33 \u0e332) {
        \u0e33 \u0e333;
        this.\u037f = \u0e333 = new \u0e33();
        \u0e333.addAll(\u0e332);
    }

    public static \u0155 \u0528(\u013a \u013a2) {
        return new \u0155(\u013a2);
    }

    public static \u0155 \u0529(\u0e33 \u0e332) {
        return new \u0155(\u0e332);
    }

    public static \u0155 \u052a(\u0155 \u01552) {
        return new \u0155(\u01552.\u037f()).\u058f(\u01552);
    }

    public \u0e33 \u037f() {
        return this.\u037f;
    }

    public \u0155 \u052b() {
        return this.\u0529;
    }

    public boolean \u052c() {
        return this.\u0528;
    }

    public void \u052d() {
        this.\u0528 = false;
    }

    void \u052e() {
        this.\u0528 = true;
    }

    public void \u052f(\u0e33 \u0e332) {
        this.\u037f = \u0e332;
    }

    public \u0155 \u058f(\u0155 \u01552) {
        this.\u0529 = \u01552;
        return this;
    }

    public \u013a \u0620() {
        if (this.\u037f.size() == 1) {
            return this.\u037f.\u0529();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(SOY.d("1927230411190E7232191A031F2A25561D045A3F3E0411570E3A3018541814377113185B0E3D251718574772"));
        stringBuilder.append(this.\u037f.size());
        throw new \u068c(stringBuilder.toString());
    }
}

