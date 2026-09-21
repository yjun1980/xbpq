/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u02c6;
import com.github.catvod.spider.merge.\u08a0;
import com.github.catvod.spider.merge.\u08b0;
import com.github.catvod.spider.merge.\u1061;
import com.github.catvod.spider.merge.\u1076;

public class \u08ab {
    public final \u08b0 \u037f;
    public final int \u0528;
    public \u1061 \u0529;
    public int \u052a;
    public final \u1076 \u052b;

    public \u08ab(\u08ab \u08ab2, \u08b0 \u08b02) {
        this(\u08ab2, \u08b02, \u08ab2.\u0529, \u08ab2.\u052b);
    }

    public \u08ab(\u08ab \u08ab2, \u08b0 \u08b02, \u1061 \u10612) {
        this(\u08ab2, \u08b02, \u10612, \u08ab2.\u052b);
    }

    public \u08ab(\u08ab \u08ab2, \u08b0 \u08b02, \u1061 \u10612, \u1076 \u10762) {
        this.\u037f = \u08b02;
        this.\u0528 = \u08ab2.\u0528;
        this.\u0529 = \u10612;
        this.\u052b = \u10762;
        this.\u052a = \u08ab2.\u052a;
    }

    public \u08ab(\u08ab \u08ab2, \u08b0 \u08b02, \u1076 \u10762) {
        this(\u08ab2, \u08b02, \u08ab2.\u0529, \u10762);
    }

    public \u08ab(\u08ab \u08ab2, \u1076 \u10762) {
        this(\u08ab2, \u08ab2.\u037f, \u08ab2.\u0529, \u10762);
    }

    public \u08ab(\u08b0 \u08b02, int n2, \u1061 \u10612) {
        this(\u08b02, n2, \u10612, \u1076.\u037f);
    }

    public \u08ab(\u08b0 \u08b02, int n2, \u1061 \u10612, \u1076 \u10762) {
        this.\u037f = \u08b02;
        this.\u0528 = n2;
        this.\u0529 = \u10612;
        this.\u052b = \u10762;
    }

    public boolean equals(Object object) {
        if (!(object instanceof \u08ab)) {
            return false;
        }
        return this.\u037f((\u08ab)object);
    }

    public int hashCode() {
        return \u02c6.\u037f(\u02c6.\u052c(\u02c6.\u052c(\u02c6.\u052b(\u02c6.\u052b(\u02c6.\u052a(7), this.\u037f.\u0529), this.\u0528), this.\u0529), this.\u052b), 4);
    }

    public String toString() {
        return this.\u052b(null, true);
    }

    public boolean \u037f(\u08ab \u08ab2) {
        \u1061 \u10612;
        \u1061 \u10613;
        boolean bl = true;
        if (this == \u08ab2) {
            return true;
        }
        if (\u08ab2 == null) {
            return false;
        }
        if (this.\u037f.\u0529 != \u08ab2.\u037f.\u0529 || this.\u0528 != \u08ab2.\u0528 || (\u10613 = this.\u0529) != (\u10612 = \u08ab2.\u0529) && (\u10613 == null || !\u10613.equals(\u10612)) || !this.\u052b.equals(\u08ab2.\u052b) || this.\u0529() != \u08ab2.\u0529()) {
            bl = false;
        }
        return bl;
    }

    public final int \u0528() {
        return this.\u052a & 0xBFFFFFFF;
    }

    public final boolean \u0529() {
        boolean bl = (this.\u052a & 0x40000000) != 0;
        return bl;
    }

    public final void \u052a(boolean bl) {
        this.\u052a = bl ? (this.\u052a |= 0x40000000) : (this.\u052a &= 0xBFFFFFFF);
    }

    public String \u052b(\u08a0<?, ?> object, boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('(');
        stringBuilder.append(this.\u037f);
        String string = SOY.d("56");
        if (bl) {
            stringBuilder.append(string);
            stringBuilder.append(this.\u0528);
        }
        if (this.\u0529 != null) {
            stringBuilder.append(SOY.d("5609"));
            stringBuilder.append(this.\u0529.toString());
            stringBuilder.append(SOY.d("27"));
        }
        if ((object = this.\u052b) != null && object != \u1076.\u037f) {
            stringBuilder.append(string);
            stringBuilder.append(this.\u052b);
        }
        if (this.\u0528() > 0) {
            stringBuilder.append(SOY.d("5627214B"));
            stringBuilder.append(this.\u0528());
        }
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

