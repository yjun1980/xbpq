/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u0674;
import com.github.catvod.spider.merge.\u08a1;
import com.github.catvod.spider.merge.\u08aa;
import com.github.catvod.spider.merge.\u08ab;
import com.github.catvod.spider.merge.\u08b0;
import com.github.catvod.spider.merge.\u08b2;
import com.github.catvod.spider.merge.\u0f8c;
import com.github.catvod.spider.merge.\u1061;
import com.github.catvod.spider.merge.\u1070;
import com.github.catvod.spider.merge.\u1075;
import com.github.catvod.spider.merge.\u1078;
import com.github.catvod.spider.merge.\u107d;
import com.github.catvod.spider.merge.\u107e;
import com.github.catvod.spider.merge.\u10ff;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

public class \u09fc {
    public final \u08aa \u037f;

    public \u09fc(\u08aa \u08aa2) {
        this.\u037f = \u08aa2;
    }

    public \u0674 \u037f(\u08b0 \u08b02, \u08a1 \u08a12) {
        return this.\u0528(\u08b02, null, \u08a12);
    }

    public \u0674 \u0528(\u08b0 \u08b02, \u08b0 \u08b03, \u08a1 object) {
        \u0674 \u06742 = new \u0674(new int[0]);
        object = object != null ? \u1061.\u052b(\u08b02.\u0528, (\u08a1)object) : null;
        this.\u0529(\u08b02, \u08b03, (\u1061)object, \u06742, new HashSet<\u08ab>(), new BitSet(), true, true);
        return \u06742;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void \u0529(\u08b0 \u08b02, \u08b0 \u08b03, \u1061 \u10612, \u0674 \u06742, Set<\u08ab> set, BitSet bitSet, boolean bl, boolean bl2) {
        int n2 = 0;
        if (!set.add(new \u08ab(\u08b02, 0, \u10612))) {
            return;
        }
        if (\u08b02 == \u08b03) {
            if (\u10612 == null) {
                \u06742.\u0529(-2);
                return;
            }
            if (\u10612.\u058f() && bl2) {
                \u06742.\u0529(-1);
                return;
            }
        }
        if (\u08b02 instanceof \u1070) {
            if (\u10612 == null) {
                \u06742.\u0529(-2);
                return;
            }
            if (\u10612.\u058f() && bl2) {
                \u06742.\u0529(-1);
                return;
            }
            if (\u10612 != \u1061.\u037f) {
                boolean bl3 = bitSet.get(\u08b02.\u052a);
                try {
                    bitSet.clear(\u08b02.\u052a);
                    while (n2 < \u10612.\u0783()) {
                        this.\u0529(this.\u037f.\u037f.get(\u10612.\u052e(n2)), \u08b03, \u10612.\u052d(n2), \u06742, set, bitSet, bl, bl2);
                        ++n2;
                    }
                    if (bl3) {
                        bitSet.set(\u08b02.\u052a);
                    }
                    return;
                }
                catch (Throwable throwable) {
                    if (bl3) {
                        bitSet.set(\u08b02.\u052a);
                    }
                    throw throwable;
                }
            }
        }
        n2 = \u08b02.\u0529();
        int i2 = 0;
        while (true) {
            block33: {
                Object object;
                Object object2;
                if (i2 >= n2) {
                    return;
                }
                Object object3 = \u08b02.\u052e(i2);
                if (object3.getClass() == \u1075.class) {
                    object2 = (\u1075)object3;
                    if (!bitSet.get(((\u107d)object2).\u0529.\u052a)) {
                        void var1_4;
                        block32: {
                            object = \u1078.\u0784(\u10612, ((\u1075)object2).\u052c.\u0529);
                            try {
                                bitSet.set(((\u1075)object3).\u0529.\u052a);
                                object3 = ((\u107d)object3).\u0529;
                            }
                            catch (Throwable throwable) {
                                // empty catch block
                                break block32;
                            }
                            try {
                                this.\u0529((\u08b0)object3, \u08b03, (\u1061)object, \u06742, set, bitSet, bl, bl2);
                                bitSet.clear(((\u107d)object2).\u0529.\u052a);
                                break block33;
                            }
                            catch (Throwable throwable) {}
                        }
                        bitSet.clear(((\u107d)object2).\u0529.\u052a);
                        throw var1_4;
                    }
                } else if (object3 instanceof \u08b2) {
                    if (bl) {
                        this.\u0529(((\u107d)object3).\u0529, \u08b03, \u10612, \u06742, set, bitSet, bl, bl2);
                    } else {
                        \u06742.\u0529(0);
                    }
                } else if (((\u107d)object3).\u0528()) {
                    this.\u0529(((\u107d)object3).\u0529, \u08b03, \u10612, \u06742, set, bitSet, bl, bl2);
                } else if (object3.getClass() == \u107e.class) {
                    \u06742.\u052c(\u0674.\u0780(1, this.\u037f.\u052d));
                } else {
                    object = ((\u107d)object3).\u0529();
                    if (object != null) {
                        object2 = object;
                        if (object3 instanceof \u0f8c) {
                            object2 = ((\u0674)object).\u052d(\u0674.\u0780(1, this.\u037f.\u052d));
                        }
                        \u06742.\u052c((\u10ff)object2);
                    }
                }
            }
            ++i2;
        }
    }
}

