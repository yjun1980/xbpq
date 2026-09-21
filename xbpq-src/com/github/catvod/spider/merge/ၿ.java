/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u08a7;
import com.github.catvod.spider.merge.\u08a8;
import com.github.catvod.spider.merge.\u08ac;
import com.github.catvod.spider.merge.\u08bb;
import com.github.catvod.spider.merge.\u107a;
import com.github.catvod.spider.merge.\u1080;
import com.github.catvod.spider.merge.\u1081;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class \u107f {
    public final Map<\u1081, \u1081> \u037f = new HashMap<\u1081, \u1081>();
    public volatile \u1081 \u0528;
    public final int \u0529;
    public final \u08bb \u052a;
    private final boolean \u052b;

    public \u107f(\u08bb object, int n2) {
        boolean bl;
        this.\u052a = object;
        this.\u0529 = n2;
        boolean bl2 = object instanceof \u107a;
        boolean bl3 = bl = false;
        if (bl2) {
            bl3 = bl;
            if (((\u107a)object).\u0620) {
                object = new \u1081(new \u08ac());
                ((\u1081)object).\u0529 = new \u1081[0];
                ((\u1081)object).\u052a = false;
                ((\u1081)object).\u052d = false;
                this.\u0528 = object;
                bl3 = true;
            }
        }
        this.\u052b = bl3;
    }

    public String toString() {
        return this.\u052b(\u08a8.\u0528);
    }

    public final \u1081 \u037f(int n2) {
        if (this.\u0529()) {
            if (n2 >= 0 && n2 < this.\u0528.\u0529.length) {
                return this.\u0528.\u0529[n2];
            }
            return null;
        }
        throw new IllegalStateException(SOY.d("353C3D0F54070837321310121431345630313B21711B150E5A313E180016133C711754070837321310121431345607031B20255607031B263458"));
    }

    public List<\u1081> \u0528() {
        ArrayList<\u1081> arrayList = new ArrayList<\u1081>(this.\u037f.keySet());
        Collections.sort(arrayList, new Comparator<\u1081>(this){
            final \u107f \u037f;
            {
                this.\u037f = \u107f2;
            }

            public int \u037f(\u1081 \u10812, \u1081 \u10813) {
                return \u10812.\u037f - \u10813.\u037f;
            }
        });
        return arrayList;
    }

    public final boolean \u0529() {
        return this.\u052b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void \u052a(int n2, \u1081 \u10812) {
        if (!this.\u0529()) {
            throw new IllegalStateException(SOY.d("353C3D0F54070837321310121431345630313B21711B150E5A313E180016133C711754070837321310121431345607031B20255607031B263458"));
        }
        if (n2 < 0) {
            return;
        }
        \u1081 \u10813 = this.\u0528;
        synchronized (\u10813) {
            if (n2 >= this.\u0528.\u0529.length) {
                this.\u0528.\u0529 = Arrays.copyOf(this.\u0528.\u0529, n2 + 1);
            }
            this.\u0528.\u0529[n2] = \u10812;
            return;
        }
    }

    public String \u052b(\u08a7 \u08a72) {
        if (this.\u0528 == null) {
            return "";
        }
        return new \u1080(this, \u08a72).toString();
    }
}

