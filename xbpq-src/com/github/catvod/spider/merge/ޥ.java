/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u079e;
import com.github.catvod.spider.merge.\u08a3;
import com.github.catvod.spider.merge.\u08a5;

public class \u07a5
extends \u079e {
    protected int \u052b = 0;

    public \u07a5(\u08a5 \u08a52) {
        super(\u08a52);
    }

    @Override
    public \u08a3 \u052b(int n2) {
        this.\u0782();
        if (n2 == 0) {
            return null;
        }
        if (n2 < 0) {
            return this.\u0787(-n2);
        }
        int n3 = this.\u0529;
        for (int i2 = 1; i2 < n2; ++i2) {
            int n4 = n3 + 1;
            if (!this.\u0786(n4)) continue;
            n3 = this.\u0783(n4, this.\u052b);
        }
        return this.\u0528.get(n3);
    }

    @Override
    protected int \u0620(int n2) {
        return this.\u0783(n2, this.\u052b);
    }

    protected \u08a3 \u0787(int n2) {
        int n3;
        if (n2 != 0 && (n3 = this.\u0529) - n2 >= 0) {
            for (int i2 = 1; i2 <= n2 && n3 > 0; ++i2) {
                n3 = this.\u0784(n3 - 1, this.\u052b);
            }
            if (n3 < 0) {
                return null;
            }
            return this.\u0528.get(n3);
        }
        return null;
    }
}

