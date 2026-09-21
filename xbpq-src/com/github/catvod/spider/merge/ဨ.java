/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u02c9;
import com.github.catvod.spider.merge.\u0674;
import com.github.catvod.spider.merge.\u0866;
import com.github.catvod.spider.merge.\u0867;
import com.github.catvod.spider.merge.\u0868;
import com.github.catvod.spider.merge.\u08a0;
import com.github.catvod.spider.merge.\u08a1;
import com.github.catvod.spider.merge.\u08a6;
import com.github.catvod.spider.merge.\u08aa;
import com.github.catvod.spider.merge.\u08ab;
import com.github.catvod.spider.merge.\u08ac;
import com.github.catvod.spider.merge.\u08af;
import com.github.catvod.spider.merge.\u08b0;
import com.github.catvod.spider.merge.\u08b3;
import com.github.catvod.spider.merge.\u08b9;
import com.github.catvod.spider.merge.\u08ba;
import com.github.catvod.spider.merge.\u08bb;
import com.github.catvod.spider.merge.\u08bd;
import com.github.catvod.spider.merge.\u105c;
import com.github.catvod.spider.merge.\u105d;
import com.github.catvod.spider.merge.\u1061;
import com.github.catvod.spider.merge.\u1065;
import com.github.catvod.spider.merge.\u1066;
import com.github.catvod.spider.merge.\u1070;
import com.github.catvod.spider.merge.\u1075;
import com.github.catvod.spider.merge.\u1076;
import com.github.catvod.spider.merge.\u1078;
import com.github.catvod.spider.merge.\u107a;
import com.github.catvod.spider.merge.\u107d;
import com.github.catvod.spider.merge.\u107f;
import com.github.catvod.spider.merge.\u1081;
import com.github.catvod.spider.merge.\u10cd;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class \u1028
extends \u08af {
    public static final boolean \u052c = Boolean.parseBoolean(\u1028.\u078f(SOY.d("2E0703382B383C140E3A2628361D1E262B323406032F2B3528131F353C28350205")));
    protected final \u0867 \u052d;
    public final \u107f[] \u052e;
    private \u1066 \u052f = \u1066.\u0528;
    protected \u10cd<\u1061, \u1061, \u1061> \u058f;
    protected \u08a6 \u0620;
    protected int \u0780;
    protected \u0868 \u0781;
    protected \u107f \u0782;

    public \u1028(\u0867 \u08672, \u08aa \u08aa2, \u107f[] \u107fArray, \u1065 \u10652) {
        super(\u08aa2, \u10652);
        this.\u052d = \u08672;
        this.\u052e = \u107fArray;
    }

    public static String \u078f(String string) {
        try {
            string = System.getenv(string);
            return string;
        }
        catch (SecurityException securityException) {
            return null;
        }
    }

    protected static int \u0791(\u08ac object) {
        Iterator<\u08ab> iterator = ((\u08ac)object).iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            object = iterator.next();
            if (n2 == 0) {
                n2 = ((\u08ab)object).\u0528;
                continue;
            }
            if (((\u08ab)object).\u0528 == n2) continue;
            return 0;
        }
        return n2;
    }

    @Override
    public void \u0528() {
    }

    protected \u08ab \u0529(\u08ab \u08ab2, \u08b3 \u08b32) {
        return new \u08ab(\u08ab2, \u08b32.\u0529);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int \u052a(\u08a6 \u08a62, int n2, \u0868 object) {
        \u107f \u107f2;
        this.\u0620 = \u08a62;
        this.\u0780 = \u08a62.\u052d();
        this.\u0781 = object;
        this.\u0782 = \u107f2 = this.\u052e[n2];
        int n3 = \u08a62.\u037f();
        int n4 = this.\u0780;
        try {
            Object object2 = \u107f2.\u0529() ? \u107f2.\u037f(this.\u052d.\u0791()) : \u107f2.\u0528;
            Object object3 = object2;
            Object object4 = object;
            if (object2 == null) {
                object2 = object;
                if (object == null) {
                    object2 = \u08a1.\u037f;
                }
                object3 = this.\u0781(\u107f2.\u052a, \u08a1.\u037f, false);
                if (\u107f2.\u0529()) {
                    \u107f2.\u0528.\u0528 = object3;
                    object = this.\u052d((\u08ac)object3);
                    object3 = new \u1081((\u08ac)object);
                    object3 = this.\u052c(\u107f2, (\u1081)object3);
                    \u107f2.\u052a(this.\u052d.\u0791(), (\u1081)object3);
                    object4 = object2;
                } else {
                    object = new \u1081((\u08ac)object3);
                    \u107f2.\u0528 = object3 = this.\u052c(\u107f2, (\u1081)object);
                    object4 = object2;
                }
            }
            n2 = this.\u0785(\u107f2, (\u1081)object3, \u08a62, n4, (\u0868)object4);
            return n2;
        }
        finally {
            this.\u058f = null;
            this.\u0782 = null;
            \u08a62.\u0529(n4);
            \u08a62.\u058f(n3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected \u1081 \u052b(\u107f object, \u1081 \u10812, int n2, \u1081 \u10813) {
        if (\u10813 == null) {
            return null;
        }
        object = this.\u052c((\u107f)object, \u10813);
        if (\u10812 == null) return object;
        if (n2 < -1) return object;
        if (n2 > this.\u052a.\u052d) {
            return object;
        }
        synchronized (\u10812) {
            if (\u10812.\u0529 == null) {
                \u10812.\u0529 = new \u1081[this.\u052a.\u052d + 1 + 1];
            }
            \u10812.\u0529[n2 + 1] = object;
            return object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected \u1081 \u052c(\u107f \u107f2, \u1081 \u10812) {
        if (\u10812 == \u08af.\u0529) {
            return \u10812;
        }
        Map<\u1081, \u1081> map = \u107f2.\u037f;
        synchronized (map) {
            \u1081 \u10813 = \u107f2.\u037f.get(\u10812);
            if (\u10813 != null) {
                return \u10813;
            }
            \u10812.\u037f = \u107f2.\u037f.size();
            if (!\u10812.\u0528.\u052b()) {
                \u10812.\u0528.\u052c(this);
                \u10812.\u0528.\u052d(true);
            }
            \u107f2.\u037f.put(\u10812, \u10812);
            return \u10812;
        }
    }

    protected \u08ac \u052d(\u08ac object) {
        Object object2;
        HashMap<Integer, \u1061> hashMap = new HashMap<Integer, \u1061>();
        \u08ac \u08ac2 = new \u08ac(((\u08ac)object).\u052e);
        Object object3 = ((\u08ac)object).iterator();
        while (object3.hasNext()) {
            \u08ab \u08ab2 = object3.next();
            if (\u08ab2.\u0528 != 1 || (object2 = \u08ab2.\u052b.\u052a(this.\u052d, this.\u0781)) == null) continue;
            hashMap.put(\u08ab2.\u037f.\u0529, \u08ab2.\u0529);
            if (object2 != \u08ab2.\u052b) {
                \u08ac2.\u0528(new \u08ab(\u08ab2, (\u1076)object2), this.\u058f);
                continue;
            }
            \u08ac2.\u0528(\u08ab2, this.\u058f);
        }
        object2 = ((\u08ac)object).iterator();
        while (object2.hasNext()) {
            object3 = object2.next();
            if (((\u08ab)object3).\u0528 == 1 || !((\u08ab)object3).\u0529() && (object = (\u1061)hashMap.get(((\u08ab)object3).\u037f.\u0529)) != null && ((\u1061)object).equals(((\u08ab)object3).\u0529)) continue;
            \u08ac2.\u0528((\u08ab)object3, this.\u058f);
        }
        return \u08ac2;
    }

    protected boolean \u052e(\u08ab \u08ab2) {
        if (\u052c) {
            return false;
        }
        \u08b0 \u08b02 = \u08ab2.\u037f;
        if (\u08b02.\u052a() == 10 && ((\u107a)\u08b02).\u0620 && !\u08ab2.\u0529.\u058f() && !\u08ab2.\u0529.\u052f()) {
            int n2;
            int n3 = \u08ab2.\u0529.\u0783();
            for (n2 = 0; n2 < n3; ++n2) {
                if (this.\u052a.\u037f.get((int)\u08ab2.\u0529.\u052e((int)n2)).\u052a == \u08b02.\u052a) continue;
                return false;
            }
            n2 = ((\u08ba)\u08b02.\u052e((int)0).\u0529).\u058f.\u0529;
            \u08b9 \u08b92 = (\u08b9)this.\u052a.\u037f.get(n2);
            for (n2 = 0; n2 < n3; ++n2) {
                int n4 = \u08ab2.\u0529.\u052e(n2);
                \u08b0 \u08b03 = this.\u052a.\u037f.get(n4);
                if (\u08b03.\u0529() == 1 && \u08b03.\u052e(0).\u0528()) {
                    \u08b0 \u08b04 = \u08b03.\u052e((int)0).\u0529;
                    if (\u08b03.\u052a() == 8 && \u08b04 == \u08b02 || \u08b03 == \u08b92 || \u08b04 == \u08b92 || \u08b04.\u052a() == 8 && \u08b04.\u0529() == 1 && \u08b04.\u052e(0).\u0528() && \u08b04.\u052e((int)0).\u0529 == \u08b02) {
                        continue;
                    }
                }
                return false;
            }
            return true;
        }
        return false;
    }

    protected void \u052f(\u08ab \u08ab2, \u08ac \u08ac2, Set<\u08ab> set, boolean bl, boolean bl2, boolean bl3) {
        this.\u058f(\u08ab2, \u08ac2, set, bl, bl2, 0, bl3);
    }

    protected void \u058f(\u08ab \u08ab2, \u08ac \u08ac2, Set<\u08ab> set, boolean bl, boolean bl2, int n2, boolean bl3) {
        if (\u08ab2.\u037f instanceof \u1070) {
            if (!\u08ab2.\u0529.\u058f()) {
                for (int i2 = 0; i2 < \u08ab2.\u0529.\u0783(); ++i2) {
                    if (\u08ab2.\u0529.\u052e(i2) == Integer.MAX_VALUE) {
                        if (bl2) {
                            \u08ac2.\u0528(new \u08ab(\u08ab2, \u08ab2.\u037f, (\u1061)\u1061.\u037f), this.\u058f);
                            continue;
                        }
                        this.\u0620(\u08ab2, \u08ac2, set, bl, bl2, n2, bl3);
                        continue;
                    }
                    Object object = this.\u052a.\u037f.get(\u08ab2.\u0529.\u052e(i2));
                    \u1061 \u10612 = \u08ab2.\u0529.\u052d(i2);
                    object = new \u08ab((\u08b0)object, \u08ab2.\u0528, \u10612, \u08ab2.\u052b);
                    ((\u08ab)object).\u052a = \u08ab2.\u052a;
                    this.\u058f((\u08ab)object, \u08ac2, set, bl, bl2, n2 - 1, bl3);
                }
                return;
            }
            if (bl2) {
                \u08ac2.\u0528(\u08ab2, this.\u058f);
                return;
            }
        }
        this.\u0620(\u08ab2, \u08ac2, set, bl, bl2, n2, bl3);
    }

    protected void \u0620(\u08ab \u08ab2, \u08ac \u08ac2, Set<\u08ab> set, boolean bl, boolean bl2, int n2, boolean bl3) {
        \u08b0 \u08b02 = \u08ab2.\u037f;
        if (!\u08b02.\u052b()) {
            \u08ac2.\u0528(\u08ab2, this.\u058f);
        }
        for (int i2 = 0; i2 < \u08b02.\u0529(); ++i2) {
            int n3;
            boolean bl4;
            boolean bl5;
            \u107d \u107d2;
            \u08ab \u08ab3;
            if (i2 == 0 && this.\u052e(\u08ab2) || (\u08ab3 = this.\u078a(\u08ab2, \u107d2, bl5 = !((\u107d2 = \u08b02.\u052e(i2)) instanceof \u08b3) && bl, bl4 = n2 == 0, bl2, bl3)) == null) continue;
            if (\u08ab2.\u037f instanceof \u1070) {
                \u107f \u107f2 = this.\u0782;
                if (\u107f2 != null && \u107f2.\u0529() && ((\u08bd)\u107d2).\u052b() == this.\u0782.\u052a.\u052a) {
                    \u08ab3.\u052a(true);
                }
                ++\u08ab3.\u052a;
                if (!set.add(\u08ab3)) continue;
                \u08ac2.\u052d = true;
                n3 = n2 - 1;
            } else {
                if (!\u107d2.\u0528() && !set.add(\u08ab3)) continue;
                n3 = \u107d2 instanceof \u1075 && n2 >= 0 ? n2 + 1 : n2;
            }
            this.\u058f(\u08ab3, \u08ac2, set, bl5, bl2, n3, bl3);
        }
    }

    /*
     * Unable to fully structure code
     */
    protected \u08ac \u0780(\u08ac var1_1, int var2_2, boolean var3_3) {
        if (this.\u058f == null) {
            this.\u058f = new \u10cd<Key1, Key2, Value>();
        }
        var10_4 = new \u08ac(var3_3);
        var8_5 = var1_1.iterator();
        var9_6 = null;
        block0: while (true) {
            var6_9 = var8_5.hasNext();
            var7_10 = false;
            var4_7 = 0;
            if (!var6_9) break;
            var11_11 = var8_5.next();
            var1_1 = var11_11.\u037f;
            if (var1_1 instanceof \u1070) {
                if (!var3_3 && var2_2 != -1) continue;
                var1_1 = var9_6;
                if (var9_6 == null) {
                    var1_1 = new ArrayList<\u08ab>();
                }
                var1_1.add(var11_11);
                var9_6 = var1_1;
                continue;
            }
            var5_8 = var1_1.\u0529();
            while (true) {
                if (var4_7 < var5_8) ** break;
                continue block0;
                var1_1 = this.\u078e(var11_11.\u037f.\u052e(var4_7), var2_2);
                if (var1_1 != null) {
                    var10_4.\u0528(new \u08ab((\u08ab)var11_11, (\u08b0)var1_1), this.\u058f);
                }
                ++var4_7;
            }
            break;
        }
        var8_5 = var9_6 == null && var2_2 != -1 && (var10_4.size() == 1 || \u1028.\u0791(var10_4) != 0) ? var10_4 : null;
        var1_1 = var8_5;
        if (var8_5 == null) {
            var1_1 = new \u08ac(var3_3);
            var8_5 = new HashSet<E>();
            var6_9 = var2_2 == -1;
            var11_11 = var10_4.iterator();
            while (var11_11.hasNext()) {
                this.\u052f((\u08ab)var11_11.next(), (\u08ac)var1_1, var8_5, false, var3_3, var6_9);
            }
        }
        var8_5 = var1_1;
        if (var2_2 == -1) {
            var6_9 = var7_10;
            if (var1_1 == var10_4) {
                var6_9 = true;
            }
            var8_5 = this.\u0796((\u08ac)var1_1, var6_9);
        }
        if (!(var9_6 == null || var3_3 && \u1066.\u052e(var8_5))) {
            var1_1 = var9_6.iterator();
            while (var1_1.hasNext()) {
                var8_5.\u0528((\u08ab)var1_1.next(), this.\u058f);
            }
        }
        if (var8_5.isEmpty()) {
            return null;
        }
        return var8_5;
    }

    protected \u08ac \u0781(\u08b0 \u08b02, \u08a1 object, boolean bl) {
        \u1061 \u10612 = \u1061.\u052b(this.\u052a, (\u08a1)object);
        \u08ac \u08ac2 = new \u08ac(bl);
        int n2 = 0;
        while (n2 < \u08b02.\u0529()) {
            object = \u08b02.\u052e((int)n2).\u0529;
            this.\u052f(new \u08ab((\u08b0)object, ++n2, \u10612), \u08ac2, new HashSet<\u08ab>(), true, bl, false);
        }
        return \u08ac2;
    }

    protected \u1081 \u0782(\u107f \u107f2, \u1081 \u10812, int n2) {
        Object object = this.\u0780(\u10812.\u0528, n2, false);
        if (object == null) {
            object = \u08af.\u0529;
            this.\u052b(\u107f2, \u10812, n2, (\u1081)object);
            return object;
        }
        \u1081 \u10813 = new \u1081((\u08ac)object);
        int n3 = \u1028.\u0791((\u08ac)object);
        if (n3 != 0) {
            \u10813.\u052a = true;
            \u10813.\u0528.\u052a = n3;
            \u10813.\u052b = n3;
        } else if (\u1066.\u0620(this.\u052f, (\u08ac)object)) {
            \u10813.\u0528.\u052b = this.\u0788((\u08ac)object);
            \u10813.\u052d = true;
            \u10813.\u052a = true;
            \u10813.\u052b = \u10813.\u0528.\u052b.nextSetBit(0);
        }
        if (\u10813.\u052a && \u10813.\u0528.\u052c) {
            this.\u0795(\u10813, this.\u052a.\u0529(\u107f2.\u0529));
            if (\u10813.\u052e != null) {
                \u10813.\u052b = 0;
            }
        }
        return this.\u052b(\u107f2, \u10812, n2, \u10813);
    }

    protected BitSet \u0783(\u1081.\u037f[] \u03f3Array, \u0868 \u08682, boolean bl) {
        BitSet bitSet = new BitSet();
        for (\u1081.\u037f \u03f3 : \u03f3Array) {
            \u1076 \u10762 = \u03f3.\u037f;
            if (\u10762 == \u1076.\u037f) {
                bitSet.set(\u03f3.\u0528);
                if (bl) continue;
                break;
            }
            if (!this.\u0784(\u10762, \u08682, \u03f3.\u0528, false)) continue;
            bitSet.set(\u03f3.\u0528);
            if (!bl) break;
        }
        return bitSet;
    }

    protected boolean \u0784(\u1076 \u10762, \u0868 \u08682, int n2, boolean bl) {
        return \u10762.\u0529(this.\u052d, \u08682);
    }

    protected int \u0785(\u107f object, \u1081 \u10812, \u08a6 \u08a62, int n2, \u0868 \u08682) {
        int n3 = \u08a62.\u052c(1);
        Object object2 = \u10812;
        while (true) {
            int n4;
            Object object3 = this.\u078b((\u1081)object2, n3);
            \u10812 = object3;
            if (object3 == null) {
                \u10812 = this.\u0782((\u107f)object, (\u1081)object2, n3);
            }
            if (\u10812 == \u08af.\u0529) {
                object = this.\u0792(\u08a62, \u08682, ((\u1081)object2).\u0528, n2);
                \u08a62.\u0529(n2);
                n2 = this.\u0790(((\u1081)object2).\u0528, \u08682);
                if (n2 != 0) {
                    return n2;
                }
                throw object;
            }
            if (\u10812.\u052d && this.\u052f != \u1066.\u037f) {
                object2 = \u10812.\u0528.\u052b;
                if (\u10812.\u052e != null) {
                    n3 = \u08a62.\u052d();
                    if (n3 != n2) {
                        \u08a62.\u0529(n2);
                    }
                    if (((BitSet)(object3 = this.\u0783(\u10812.\u052e, \u08682, true))).cardinality() == 1) {
                        return ((BitSet)object3).nextSetBit(0);
                    }
                    object2 = object3;
                    if (n3 != n2) {
                        \u08a62.\u0529(n3);
                        object2 = object3;
                    }
                }
                object3 = this.\u0781(((\u107f)object).\u052a, \u08682, true);
                this.\u0798((\u107f)object, (BitSet)object2, \u10812.\u0528, n2, \u08a62.\u052d());
                return this.\u0786((\u107f)object, \u10812, (\u08ac)object3, \u08a62, n2, \u08682);
            }
            if (\u10812.\u052a) {
                if (\u10812.\u052e == null) {
                    return \u10812.\u052b;
                }
                n4 = \u08a62.\u052d();
                \u08a62.\u0529(n2);
                object2 = this.\u0783(\u10812.\u052e, \u08682, true);
                n3 = ((BitSet)object2).cardinality();
                if (n3 != 0) {
                    if (n3 != 1) {
                        this.\u0797((\u107f)object, \u10812, n2, n4, false, (BitSet)object2, \u10812.\u0528);
                        return ((BitSet)object2).nextSetBit(0);
                    }
                    return ((BitSet)object2).nextSetBit(0);
                }
                throw this.\u0792(\u08a62, \u08682, \u10812.\u0528, n2);
            }
            n4 = n3;
            if (n3 != -1) {
                \u08a62.\u052f();
                n4 = \u08a62.\u052c(1);
            }
            object2 = \u10812;
            n3 = n4;
        }
    }

    protected int \u0786(\u107f object, \u1081 \u10812, \u08ac collection, \u08a6 \u08a62, int n2, \u0868 \u08682) {
        \u08a62.\u0529(n2);
        int n3 = \u08a62.\u052c(1);
        while (true) {
            int n4;
            \u08ac \u08ac2;
            block11: {
                boolean bl;
                block9: {
                    block10: {
                        block8: {
                            if ((\u08ac2 = this.\u0780((\u08ac)collection, n3, true)) == null) {
                                object = this.\u0792(\u08a62, \u08682, (\u08ac)collection, n2);
                                \u08a62.\u0529(n2);
                                n2 = this.\u0790((\u08ac)collection, \u08682);
                                if (n2 != 0) {
                                    return n2;
                                }
                                throw object;
                            }
                            collection = \u1066.\u052b(\u08ac2);
                            \u08ac2.\u052a = n4 = \u1028.\u0791(\u08ac2);
                            bl = false;
                            if (n4 == 0) break block8;
                            n3 = n4;
                            break block9;
                        }
                        if (this.\u052f == \u1066.\u0529) break block10;
                        n4 = \u1066.\u0781(collection);
                        if (n4 == 0) break block11;
                        n3 = n4;
                        break block9;
                    }
                    if (!\u1066.\u0528(collection) || !\u1066.\u0529(collection)) break block11;
                    n3 = \u1066.\u052c(collection);
                    bl = true;
                }
                if (\u08ac2.\u052a != 0) {
                    this.\u0799((\u107f)object, n3, \u08ac2, n2, \u08a62.\u052d());
                    return n3;
                }
                this.\u0797((\u107f)object, \u10812, n2, \u08a62.\u052d(), bl, \u08ac2.\u052a(), \u08ac2);
                return n3;
            }
            n4 = n3;
            if (n3 != -1) {
                \u08a62.\u052f();
                n4 = \u08a62.\u052c(1);
            }
            collection = \u08ac2;
            n3 = n4;
        }
    }

    protected int \u0787(\u08ac object) {
        \u0674 \u06742 = new \u0674(new int[0]);
        object = ((\u08ac)object).iterator();
        while (object.hasNext()) {
            \u08ab \u08ab2 = (\u08ab)object.next();
            if (\u08ab2.\u0528() <= 0 && (!(\u08ab2.\u037f instanceof \u1070) || !\u08ab2.\u0529.\u052f())) continue;
            \u06742.\u0529(\u08ab2.\u0528);
        }
        if (\u06742.\u0784() == 0) {
            return 0;
        }
        return \u06742.\u058f();
    }

    protected BitSet \u0788(\u08ac \u08ac2) {
        return \u1066.\u052a(\u1066.\u052b(\u08ac2));
    }

    protected BitSet \u0789(\u08ac object) {
        if (((\u08ac)object).\u052a != 0) {
            BitSet bitSet = new BitSet();
            bitSet.set(((\u08ac)object).\u052a);
            object = bitSet;
        } else {
            object = ((\u08ac)object).\u052b;
        }
        return object;
    }

    protected \u08ab \u078a(\u08ab \u08ab2, \u107d \u107d2, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        int n2 = \u107d2.\u037f();
        if (n2 != 10) {
            switch (n2) {
                default: {
                    return null;
                }
                case 6: {
                    return this.\u0529(\u08ab2, (\u08b3)\u107d2);
                }
                case 4: {
                    return this.\u0794(\u08ab2, (\u105d)\u107d2, bl, bl2, bl3);
                }
                case 3: {
                    return this.\u079a(\u08ab2, (\u1075)\u107d2);
                }
                case 2: 
                case 5: 
                case 7: {
                    if (bl4 && \u107d2.\u052a(-1, 0, 1)) {
                        return new \u08ab(\u08ab2, \u107d2.\u0529);
                    }
                    return null;
                }
                case 1: 
            }
            return new \u08ab(\u08ab2, \u107d2.\u0529);
        }
        return this.\u0793(\u08ab2, (\u105c)\u107d2, bl, bl2, bl3);
    }

    protected \u1081 \u078b(\u1081 \u1081Array, int n2) {
        \u1081Array = \u1081Array.\u0529;
        if (\u1081Array != null && ++n2 >= 0 && n2 < \u1081Array.length) {
            return \u1081Array[n2];
        }
        return null;
    }

    protected \u1081.\u037f[] \u078c(BitSet bitSet, \u1076[] \u1076Array) {
        ArrayList<\u1081.\u037f> arrayList = new ArrayList<\u1081.\u037f>();
        boolean bl = false;
        for (int i2 = 1; i2 < \u1076Array.length; ++i2) {
            \u1076 \u10762 = \u1076Array[i2];
            if (bitSet != null && bitSet.get(i2)) {
                arrayList.add(new \u1081.\u037f(\u10762, i2));
            }
            if (\u10762 == \u1076.\u037f) continue;
            bl = true;
        }
        if (!bl) {
            return null;
        }
        return arrayList.toArray(new \u1081.\u037f[arrayList.size()]);
    }

    protected \u1076[] \u078d(BitSet \u1076Array, \u08ac object, int n2) {
        int n3;
        \u1076[] \u1076Array2 = new \u1076[n2 + 1];
        Iterator<\u08ab> iterator = ((\u08ac)object).iterator();
        while (iterator.hasNext()) {
            object = iterator.next();
            if (!\u1076Array.get(((\u08ab)object).\u0528)) continue;
            n3 = ((\u08ab)object).\u0528;
            \u1076Array2[n3] = \u1076.\u052c(\u1076Array2[n3], ((\u08ab)object).\u052b);
        }
        int n4 = 0;
        for (n3 = 1; n3 <= n2; ++n3) {
            int n5;
            if (\u1076Array2[n3] == null) {
                \u1076Array2[n3] = \u1076.\u037f;
                n5 = n4;
            } else {
                n5 = n4;
                if (\u1076Array2[n3] != \u1076.\u037f) {
                    n5 = n4 + 1;
                }
            }
            n4 = n5;
        }
        \u1076Array = \u1076Array2;
        if (n4 == 0) {
            \u1076Array = null;
        }
        return \u1076Array;
    }

    protected \u08b0 \u078e(\u107d \u107d2, int n2) {
        if (\u107d2.\u052a(n2, 0, this.\u052a.\u052d)) {
            return \u107d2.\u0529;
        }
        return null;
    }

    protected int \u0790(\u08ac \u08ac2, \u0868 object) {
        object = this.\u079b(\u08ac2, (\u0868)object);
        \u08ac2 = (\u08ac)((\u02c9)object).\u037f;
        object = (\u08ac)((\u02c9)object).\u0528;
        int n2 = this.\u0787(\u08ac2);
        if (n2 != 0) {
            return n2;
        }
        if (((\u08ac)object).size() > 0 && (n2 = this.\u0787((\u08ac)object)) != 0) {
            return n2;
        }
        return 0;
    }

    protected \u0866 \u0792(\u08a6 \u08a62, \u0868 \u08682, \u08ac \u08ac2, int n2) {
        return new \u0866(this.\u052d, \u08a62, \u08a62.get(n2), \u08a62.\u052b(1), \u08ac2, \u08682);
    }

    public \u08ab \u0793(\u08ab \u08ab2, \u105c \u105c2, boolean bl, boolean bl2, boolean bl3) {
        if (bl && bl2) {
            if (bl3) {
                int n2 = this.\u0620.\u052d();
                this.\u0620.\u0529(this.\u0780);
                bl = this.\u0784(\u105c2.\u052b(), this.\u0781, \u08ab2.\u0528, bl3);
                this.\u0620.\u0529(n2);
                \u08ab2 = bl ? new \u08ab(\u08ab2, \u105c2.\u0529) : null;
            } else {
                \u1076 \u10762 = \u1076.\u0528(\u08ab2.\u052b, \u105c2.\u052b());
                \u08ab2 = new \u08ab(\u08ab2, \u105c2.\u0529, \u10762);
            }
        } else {
            \u08ab2 = new \u08ab(\u08ab2, \u105c2.\u0529);
        }
        return \u08ab2;
    }

    protected \u08ab \u0794(\u08ab \u08ab2, \u105d \u105d2, boolean bl, boolean bl2, boolean bl3) {
        if (bl && (!(bl = \u105d2.\u052c) || bl && bl2)) {
            if (bl3) {
                int n2 = this.\u0620.\u052d();
                this.\u0620.\u0529(this.\u0780);
                bl = this.\u0784(\u105d2.\u052b(), this.\u0781, \u08ab2.\u0528, bl3);
                this.\u0620.\u0529(n2);
                \u08ab2 = bl ? new \u08ab(\u08ab2, \u105d2.\u0529) : null;
            } else {
                \u1076 \u10762 = \u1076.\u0528(\u08ab2.\u052b, \u105d2.\u052b());
                \u08ab2 = new \u08ab(\u08ab2, \u105d2.\u0529, \u10762);
            }
        } else {
            \u08ab2 = new \u08ab(\u08ab2, \u105d2.\u0529);
        }
        return \u08ab2;
    }

    protected void \u0795(\u1081 \u10812, \u08bb object) {
        int n2 = ((\u08b0)object).\u0529();
        object = this.\u0789(\u10812.\u0528);
        \u1076[] \u1076Array = this.\u078d((BitSet)object, \u10812.\u0528, n2);
        if (\u1076Array != null) {
            \u10812.\u052e = this.\u078c((BitSet)object, \u1076Array);
            \u10812.\u052b = 0;
        } else {
            \u10812.\u052b = ((BitSet)object).nextSetBit(0);
        }
    }

    protected \u08ac \u0796(\u08ac object, boolean bl) {
        if (\u1066.\u037f((\u08ac)object)) {
            return object;
        }
        \u08ac \u08ac2 = new \u08ac(((\u08ac)object).\u052e);
        Iterator<\u08ab> iterator = ((\u08ac)object).iterator();
        while (iterator.hasNext()) {
            object = iterator.next();
            \u08b0 \u08b02 = ((\u08ab)object).\u037f;
            if (\u08b02 instanceof \u1070) {
                \u08ac2.\u0528((\u08ab)object, this.\u058f);
                continue;
            }
            if (!bl || !\u08b02.\u052b() || !this.\u052a.\u052c(((\u08ab)object).\u037f).\u052e(-2)) continue;
            \u08ac2.\u0528(new \u08ab((\u08ab)object, this.\u052a.\u052a[((\u08ab)object).\u037f.\u052a]), this.\u058f);
        }
        return \u08ac2;
    }

    protected void \u0797(\u107f \u107f2, \u1081 object, int n2, int n3, boolean bl, BitSet bitSet, \u08ac \u08ac2) {
        object = this.\u052d;
        if (object != null) {
            ((\u08a0)object).\u052e().\u037f(this.\u052d, \u107f2, n2, n3, bl, bitSet, \u08ac2);
        }
    }

    protected void \u0798(\u107f \u107f2, BitSet bitSet, \u08ac \u08ac2, int n2, int n3) {
        \u0867 \u08672 = this.\u052d;
        if (\u08672 != null) {
            \u08672.\u052e().\u052a(this.\u052d, \u107f2, n2, n3, bitSet, \u08ac2);
        }
    }

    protected void \u0799(\u107f \u107f2, int n2, \u08ac \u08ac2, int n3, int n4) {
        \u0867 \u08672 = this.\u052d;
        if (\u08672 != null) {
            \u08672.\u052e().\u0528(this.\u052d, \u107f2, n3, n4, n2, \u08ac2);
        }
    }

    protected \u08ab \u079a(\u08ab \u08ab2, \u1075 \u10752) {
        Object object = \u10752.\u052c;
        object = \u1078.\u0784(\u08ab2.\u0529, ((\u08b0)object).\u0529);
        return new \u08ab(\u08ab2, \u10752.\u0529, (\u1061)object);
    }

    protected \u02c9<\u08ac, \u08ac> \u079b(\u08ac \u08ac2, \u0868 \u08682) {
        \u08ac \u08ac3 = new \u08ac(\u08ac2.\u052e);
        \u08ac \u08ac4 = new \u08ac(\u08ac2.\u052e);
        for (\u08ab \u08ab2 : \u08ac2) {
            \u1076 \u10762 = \u08ab2.\u052b;
            if (\u10762 != \u1076.\u037f) {
                if (this.\u0784(\u10762, \u08682, \u08ab2.\u0528, \u08ac2.\u052e)) {
                    \u08ac3.\u037f(\u08ab2);
                    continue;
                }
                \u08ac4.\u037f(\u08ab2);
                continue;
            }
            \u08ac3.\u037f(\u08ab2);
        }
        return new \u02c9<\u08ac, \u08ac>(\u08ac3, \u08ac4);
    }
}

