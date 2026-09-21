/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u02c6;
import com.github.catvod.spider.merge.\u02c7;
import com.github.catvod.spider.merge.\u08ab;
import com.github.catvod.spider.merge.\u08b0;
import com.github.catvod.spider.merge.\u08bb;
import com.github.catvod.spider.merge.\u0cf2;
import com.github.catvod.spider.merge.\u1061;
import com.github.catvod.spider.merge.\u1076;

public class \u0af9
extends \u08ab {
    private final \u0cf2 \u052c;
    private final boolean \u052d;

    public \u0af9(\u08b0 \u08b02, int n2, \u1061 \u10612) {
        super(\u08b02, n2, \u10612, \u1076.\u037f);
        this.\u052d = false;
        this.\u052c = null;
    }

    public \u0af9(\u0af9 \u0af92, \u08b0 \u08b02) {
        super(\u0af92, \u08b02, \u0af92.\u0529, \u0af92.\u052b);
        this.\u052c = \u0af92.\u052c;
        this.\u052d = \u0af9.\u052c(\u0af92, \u08b02);
    }

    public \u0af9(\u0af9 \u0af92, \u08b0 \u08b02, \u0cf2 \u0cf22) {
        super(\u0af92, \u08b02, \u0af92.\u0529, \u0af92.\u052b);
        this.\u052c = \u0cf22;
        this.\u052d = \u0af9.\u052c(\u0af92, \u08b02);
    }

    public \u0af9(\u0af9 \u0af92, \u08b0 \u08b02, \u1061 \u10612) {
        super(\u0af92, \u08b02, \u10612, \u0af92.\u052b);
        this.\u052c = \u0af92.\u052c;
        this.\u052d = \u0af9.\u052c(\u0af92, \u08b02);
    }

    private static boolean \u052c(\u0af9 \u0af92, \u08b0 \u08b02) {
        boolean bl = \u0af92.\u052d || \u08b02 instanceof \u08bb && ((\u08bb)\u08b02).\u052f;
        return bl;
    }

    @Override
    public int hashCode() {
        return \u02c6.\u037f(\u02c6.\u052c(\u02c6.\u052b(\u02c6.\u052c(\u02c6.\u052c(\u02c6.\u052b(\u02c6.\u052b(\u02c6.\u052a(7), this.\u037f.\u0529), this.\u0528), this.\u0529), this.\u052b), this.\u052d ? 1 : 0), this.\u052c), 6);
    }

    @Override
    public boolean \u037f(\u08ab \u08ab2) {
        if (this == \u08ab2) {
            return true;
        }
        if (!(\u08ab2 instanceof \u0af9)) {
            return false;
        }
        \u0af9 \u0af92 = (\u0af9)\u08ab2;
        if (this.\u052d != \u0af92.\u052d) {
            return false;
        }
        if (!\u02c7.\u037f.\u037f(this.\u052c, \u0af92.\u052c)) {
            return false;
        }
        return super.\u037f(\u08ab2);
    }

    public final \u0cf2 \u052d() {
        return this.\u052c;
    }

    public final boolean \u052e() {
        return this.\u052d;
    }
}

