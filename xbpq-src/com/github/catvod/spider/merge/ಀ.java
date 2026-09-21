/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u079f;
import com.github.catvod.spider.merge.\u0864;
import com.github.catvod.spider.merge.\u0865;
import com.github.catvod.spider.merge.\u08aa;
import com.github.catvod.spider.merge.\u08ab;
import com.github.catvod.spider.merge.\u08ac;
import com.github.catvod.spider.merge.\u08af;
import com.github.catvod.spider.merge.\u08b0;
import com.github.catvod.spider.merge.\u08b3;
import com.github.catvod.spider.merge.\u08bc;
import com.github.catvod.spider.merge.\u0af9;
import com.github.catvod.spider.merge.\u0cf2;
import com.github.catvod.spider.merge.\u1022;
import com.github.catvod.spider.merge.\u105d;
import com.github.catvod.spider.merge.\u1061;
import com.github.catvod.spider.merge.\u1065;
import com.github.catvod.spider.merge.\u1070;
import com.github.catvod.spider.merge.\u1075;
import com.github.catvod.spider.merge.\u1078;
import com.github.catvod.spider.merge.\u107d;
import com.github.catvod.spider.merge.\u107f;
import com.github.catvod.spider.merge.\u1081;
import java.util.Iterator;

public class \u0c80
extends \u08af {
    public static int \u052c;
    protected final \u0864 \u052d;
    protected int \u052e = -1;
    protected int \u052f = 1;
    protected int \u058f = 0;
    public final \u107f[] \u0620;
    protected int \u0780 = 0;
    protected final \u037f \u0781 = new \u037f();

    public \u0c80(\u0864 \u08642, \u08aa \u08aa2, \u107f[] \u107fArray, \u1065 \u10652) {
        super(\u08aa2, \u10652);
        this.\u0620 = \u107fArray;
        this.\u052d = \u08642;
    }

    @Override
    public void \u0528() {
        this.\u0781.\u037f();
        this.\u052e = -1;
        this.\u052f = 1;
        this.\u058f = 0;
        this.\u0780 = 0;
    }

    protected void \u0529(\u079f \u079f2, \u0cf2 \u0cf22, int n2, int n3, int n4, int n5) {
        \u0864 \u08642;
        \u079f2.\u0529(n3);
        this.\u052f = n4;
        this.\u058f = n5;
        if (\u0cf22 != null && (\u08642 = this.\u052d) != null) {
            \u0cf22.\u0528(\u08642, \u079f2, n2);
        }
    }

    protected \u1081 \u052a(\u1081 \u10812, int n2, \u08ac object) {
        boolean bl = ((\u08ac)object).\u052c;
        ((\u08ac)object).\u052c = false;
        object = this.\u052c((\u08ac)object);
        if (bl) {
            return object;
        }
        this.\u052b(\u10812, n2, (\u1081)object);
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void \u052b(\u1081 \u10812, int n2, \u1081 \u10813) {
        if (n2 < 0) return;
        if (n2 > 127) {
            return;
        }
        synchronized (\u10812) {
            if (\u10812.\u0529 == null) {
                \u10812.\u0529 = new \u1081[128];
            }
            \u10812.\u0529[n2 + 0] = \u10813;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected \u1081 \u052c(\u08ac \u08ac2) {
        Object object;
        \u1081 \u10812 = new \u1081(\u08ac2);
        Object object2 = null;
        Object object3 = \u08ac2.iterator();
        do {
            object = object2;
            if (!object3.hasNext()) break;
            object = object3.next();
        } while (!(((\u08ab)object).\u037f instanceof \u1070));
        if (object != null) {
            \u10812.\u052a = true;
            \u10812.\u052c = ((\u0af9)object).\u052d();
            \u10812.\u052b = this.\u052a.\u052e[((\u08ab)object).\u037f.\u052a];
        }
        object2 = this.\u0620[this.\u0780];
        object = ((\u107f)object2).\u037f;
        synchronized (object) {
            object3 = ((\u107f)object2).\u037f.get(\u10812);
            if (object3 != null) {
                return object3;
            }
            \u10812.\u037f = ((\u107f)object2).\u037f.size();
            \u08ac2.\u052d(true);
            \u10812.\u0528 = \u08ac2;
            ((\u107f)object2).\u037f.put(\u10812, \u10812);
            return \u10812;
        }
    }

    protected void \u052d(\u037f \u03f3, \u079f \u079f2, \u1081 \u10812) {
        \u03f3.\u037f = \u079f2.\u052d();
        \u03f3.\u0528 = this.\u052f;
        \u03f3.\u0529 = this.\u058f;
        \u03f3.\u052a = \u10812;
    }

    protected boolean \u052e(\u079f \u079f2, \u0af9 \u0af92, \u08ac \u08ac2, boolean bl, boolean bl2, boolean bl3) {
        Object object;
        block8: {
            block10: {
                block9: {
                    object = \u0af92.\u037f;
                    if (!(object instanceof \u1070)) break block8;
                    object = \u0af92.\u0529;
                    boolean bl4 = true;
                    if (object != null && !((\u1061)object).\u052f()) break block9;
                    object = \u0af92.\u0529;
                    if (object == null || ((\u1061)object).\u058f()) break block10;
                    \u08ac2.\u037f(new \u0af9(\u0af92, \u0af92.\u037f, (\u1061)\u1061.\u037f));
                    bl = bl4;
                }
                object = \u0af92.\u0529;
                if (object != null && !((\u1061)object).\u058f()) {
                    for (int i2 = 0; i2 < \u0af92.\u0529.\u0783(); ++i2) {
                        if (\u0af92.\u0529.\u052e(i2) == Integer.MAX_VALUE) continue;
                        object = \u0af92.\u0529.\u052d(i2);
                        bl = this.\u052e(\u079f2, new \u0af9(\u0af92, this.\u052a.\u037f.get(\u0af92.\u0529.\u052e(i2)), (\u1061)object), \u08ac2, bl, bl2, bl3);
                    }
                }
                return bl;
            }
            \u08ac2.\u037f(\u0af92);
            return true;
        }
        if (!(((\u08b0)object).\u052b() || bl && \u0af92.\u052e())) {
            \u08ac2.\u037f(\u0af92);
        }
        object = \u0af92.\u037f;
        for (int i4 = 0; i4 < ((\u08b0)object).\u0529(); ++i4) {
            \u0af9 \u0af93 = this.\u0784(\u079f2, \u0af92, ((\u08b0)object).\u052e(i4), \u08ac2, bl2, bl3);
            boolean bl5 = bl;
            if (\u0af93 != null) {
                bl5 = this.\u052e(\u079f2, \u0af93, \u08ac2, bl, bl2, bl3);
            }
            bl = bl5;
        }
        return bl;
    }

    protected \u08ac \u052f(\u079f \u079f2, \u08b0 \u08b02) {
        \u08bc \u08bc2 = \u1061.\u037f;
        \u1022 \u10222 = new \u1022();
        int n2 = 0;
        while (n2 < \u08b02.\u0529()) {
            \u08b0 \u08b03 = \u08b02.\u052e((int)n2).\u0529;
            this.\u052e(\u079f2, new \u0af9(\u08b03, ++n2, (\u1061)\u08bc2), \u10222, false, false, false);
        }
        return \u10222;
    }

    protected \u1081 \u058f(\u079f \u079f2, \u1081 \u10812, int n2) {
        \u1022 \u10222 = new \u1022();
        this.\u0787(\u079f2, \u10812.\u0528, \u10222, n2);
        if (\u10222.isEmpty()) {
            if (!\u10222.\u052c) {
                this.\u052b(\u10812, n2, \u08af.\u0529);
            }
            return \u08af.\u0529;
        }
        return this.\u052a(\u10812, n2, \u10222);
    }

    public void \u0620(\u079f \u079f2) {
        if (\u079f2.\u052c(1) == 10) {
            ++this.\u052f;
            this.\u058f = 0;
        } else {
            ++this.\u058f;
        }
        \u079f2.\u052f();
    }

    protected boolean \u0780(\u079f \u079f2, int n2, int n3, boolean bl) {
        \u0864 \u08642 = this.\u052d;
        if (\u08642 == null) {
            return true;
        }
        if (!bl) {
            return \u08642.\u0783(null, n2, n3);
        }
        int n4 = this.\u058f;
        int n5 = this.\u052f;
        int n6 = \u079f2.\u052d();
        int n7 = \u079f2.\u037f();
        try {
            this.\u0620(\u079f2);
            bl = this.\u052d.\u0783(null, n2, n3);
            return bl;
        }
        finally {
            this.\u058f = n4;
            this.\u052f = n5;
            \u079f2.\u0529(n6);
            \u079f2.\u058f(n7);
        }
    }

    protected int \u0781(\u079f \u079f2, \u1081 \u10812) {
        if (\u10812.\u052a) {
            this.\u052d(this.\u0781, \u079f2, \u10812);
        }
        int n2 = \u079f2.\u052c(1);
        \u1081 \u10813 = \u10812;
        while (true) {
            block8: {
                block7: {
                    \u1081 \u10814;
                    \u10812 = \u10814 = this.\u0785(\u10813, n2);
                    if (\u10814 == null) {
                        \u10812 = this.\u058f(\u079f2, \u10813, n2);
                    }
                    if (\u10812 == \u08af.\u0529) break block7;
                    if (n2 != -1) {
                        this.\u0620(\u079f2);
                    }
                    if (!\u10812.\u052a) break block8;
                    this.\u052d(this.\u0781, \u079f2, \u10812);
                    if (n2 != -1) break block8;
                }
                return this.\u0782(this.\u0781, \u079f2, \u10813.\u0528, n2);
            }
            n2 = \u079f2.\u052c(1);
            \u10813 = \u10812;
        }
    }

    protected int \u0782(\u037f \u03f3, \u079f \u079f2, \u08ac \u08ac2, int n2) {
        \u1081 \u10812 = \u03f3.\u052a;
        if (\u10812 != null) {
            this.\u0529(\u079f2, \u10812.\u052c, this.\u052e, \u03f3.\u037f, \u03f3.\u0528, \u03f3.\u0529);
            return \u03f3.\u052a.\u052b;
        }
        if (n2 == -1 && \u079f2.\u052d() == this.\u052e) {
            return -1;
        }
        throw new \u0865(this.\u052d, \u079f2, this.\u052e, \u08ac2);
    }

    public int \u0783() {
        return this.\u058f;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected \u0af9 \u0784(\u079f object, \u0af9 \u0af92, \u107d \u107d2, \u08ac \u08ac2, boolean bl, boolean bl2) {
        int n2 = \u107d2.\u037f();
        if (n2 == 10) throw new UnsupportedOperationException(SOY.d("2A20341511131F3C321354070837351F17160E37225615051F723F190057092721061B050E3735561D195A3E340E1105097C"));
        switch (n2) {
            default: {
                return null;
            }
            case 6: {
                object = \u0af92.\u0529;
                if (object != null) {
                    if (!((\u1061)object).\u052f()) return new \u0af9(\u0af92, \u107d2.\u0529);
                }
                object = \u0cf2.\u037f(\u0af92.\u052d(), this.\u052a.\u052f[((\u08b3)\u107d2).\u052b]);
                return new \u0af9(\u0af92, \u107d2.\u0529, (\u0cf2)object);
            }
            case 4: {
                \u105d \u105d2 = (\u105d)\u107d2;
                \u08ac2.\u052c = true;
                if (!this.\u0780((\u079f)object, \u105d2.\u052a, \u105d2.\u052b, bl)) return null;
                return new \u0af9(\u0af92, \u107d2.\u0529);
            }
            case 3: {
                object = (\u1075)\u107d2;
                object = \u1078.\u0784(\u0af92.\u0529, ((\u1075)object).\u052c.\u0529);
                return new \u0af9(\u0af92, \u107d2.\u0529, (\u1061)object);
            }
            case 2: 
            case 5: 
            case 7: {
                if (!bl2) return null;
                if (!\u107d2.\u052a(-1, 0, 0x10FFFF)) return null;
                return new \u0af9(\u0af92, \u107d2.\u0529);
            }
            case 1: 
        }
        return new \u0af9(\u0af92, \u107d2.\u0529);
    }

    protected \u1081 \u0785(\u1081 \u1081Array, int n2) {
        \u1081Array = \u1081Array.\u0529;
        if (\u1081Array != null && n2 >= 0 && n2 <= 127) {
            return \u1081Array[n2 + 0];
        }
        return null;
    }

    public int \u0786() {
        return this.\u052f;
    }

    protected void \u0787(\u079f \u079f2, \u08ac object, \u08ac \u08ac2, int n2) {
        Iterator<\u08ab> iterator = ((\u08ac)object).iterator();
        int n3 = 0;
        block0: while (iterator.hasNext()) {
            \u08ab \u08ab2 = iterator.next();
            boolean bl = \u08ab2.\u0528 == n3;
            if (bl && ((\u0af9)\u08ab2).\u052e()) continue;
            int n4 = \u08ab2.\u037f.\u0529();
            for (int i2 = 0; i2 < n4; ++i2) {
                boolean bl2;
                \u08b0 \u08b02 = this.\u0788(\u08ab2.\u037f.\u052e(i2), n2);
                if (\u08b02 == null) continue;
                \u0af9 \u0af92 = (\u0af9)\u08ab2;
                \u0cf2 \u0cf22 = \u0af92.\u052d();
                object = \u0cf22;
                if (\u0cf22 != null) {
                    object = \u0cf22.\u0529(\u079f2.\u052d() - this.\u052e);
                }
                if (!this.\u052e(\u079f2, new \u0af9(\u0af92, \u08b02, (\u0cf2)object), \u08ac2, bl, true, bl2 = n2 == -1)) continue;
                n3 = \u08ab2.\u0528;
                continue block0;
            }
        }
    }

    protected \u08b0 \u0788(\u107d \u107d2, int n2) {
        if (\u107d2.\u052a(n2, 0, 0x10FFFF)) {
            return \u107d2.\u0529;
        }
        return null;
    }

    public int \u0789(\u079f \u079f2, int n2) {
        ++\u052c;
        this.\u0780 = n2;
        int n3 = \u079f2.\u037f();
        try {
            this.\u052e = \u079f2.\u052d();
            this.\u0781.\u037f();
            \u107f \u107f2 = this.\u0620[n2];
            if (\u107f2.\u0528 == null) {
                n2 = this.\u078a(\u079f2);
                return n2;
            }
            n2 = this.\u0781(\u079f2, \u107f2.\u0528);
            return n2;
        }
        finally {
            \u079f2.\u058f(n3);
        }
    }

    protected int \u078a(\u079f \u079f2) {
        Object object = this.\u052f(\u079f2, this.\u052a.\u058f.get(this.\u0780));
        boolean bl = ((\u08ac)object).\u052c;
        ((\u08ac)object).\u052c = false;
        object = this.\u052c((\u08ac)object);
        if (!bl) {
            this.\u0620[this.\u0780].\u0528 = object;
        }
        return this.\u0781(\u079f2, (\u1081)object);
    }

    protected static class \u037f {
        protected int \u037f = -1;
        protected int \u0528 = 0;
        protected int \u0529 = -1;
        protected \u1081 \u052a;

        protected \u037f() {
        }

        protected void \u037f() {
            this.\u037f = -1;
            this.\u0528 = 0;
            this.\u0529 = -1;
            this.\u052a = null;
        }
    }
}

