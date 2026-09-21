/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u0674;
import com.github.catvod.spider.merge.\u08aa;
import com.github.catvod.spider.merge.\u107d;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public abstract class \u08b0 {
    public static final List<String> \u037f = Collections.unmodifiableList(Arrays.asList(SOY.d("331C0737383E3E"), SOY.d("3813023F37"), SOY.d("28071D332B242E130322"), SOY.d("381E1E353F282906102420"), SOY.d("2A1E04252B35361D123D2B242E130322"), SOY.d("290610242B35361D123D2B242E130322"), SOY.d("2E1D1A333A282906102420"), SOY.d("28071D332B242E1D01"), SOY.d("381E1E353F283F1C15"), SOY.d("290610242B3B351D012936363919"), SOY.d("290610242B3B351D012931392E0008"), SOY.d("2A1E04252B3B351D012936363919"), SOY.d("361D1E262B323416")));
    public \u08aa \u0528 = null;
    public int \u0529 = -1;
    public int \u052a;
    public boolean \u052b = false;
    protected final List<\u107d> \u052c = new ArrayList<\u107d>(4);
    public \u0674 \u052d;

    public boolean equals(Object object) {
        boolean bl;
        boolean bl2 = object instanceof \u08b0;
        boolean bl3 = bl = false;
        if (bl2) {
            bl3 = bl;
            if (this.\u0529 == ((\u08b0)object).\u0529) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public int hashCode() {
        return this.\u0529;
    }

    public String toString() {
        return String.valueOf(this.\u0529);
    }

    public void \u037f(int n2, \u107d \u107d2) {
        boolean bl;
        block5: {
            boolean bl2 = this.\u052c.isEmpty();
            bl = true;
            if (bl2) {
                this.\u052b = \u107d2.\u0528();
            } else if (this.\u052b != \u107d2.\u0528()) {
                PrintStream object = System.err;
                Locale locale = Locale.getDefault();
                int n3 = this.\u0529;
                object.format(locale, SOY.d("3B061F5607031B26345651135A3A30055415152639561107093B3D191A571B3C35561A18147F3406071E163D3F5600051B3C221F001E153C22587E"), n3);
                this.\u052b = false;
            }
            for (\u107d \u107d3 : this.\u052c) {
                if (\u107d3.\u0529.\u0529 != \u107d2.\u0529.\u0529 || (\u107d3.\u0529() == null || \u107d2.\u0529() == null || !\u107d3.\u0529().equals(\u107d2.\u0529())) && (!\u107d3.\u0528() || !\u107d2.\u0528())) continue;
                break block5;
            }
            bl = false;
        }
        if (!bl) {
            this.\u052c.add(n2, \u107d2);
        }
    }

    public void \u0528(\u107d \u107d2) {
        this.\u037f(this.\u052c.size(), \u107d2);
    }

    public int \u0529() {
        return this.\u052c.size();
    }

    public abstract int \u052a();

    public final boolean \u052b() {
        return this.\u052b;
    }

    public \u107d \u052c(int n2) {
        return this.\u052c.remove(n2);
    }

    public void \u052d(int n2, \u107d \u107d2) {
        this.\u052c.set(n2, \u107d2);
    }

    public \u107d \u052e(int n2) {
        return this.\u052c.get(n2);
    }
}

