/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u02c6;
import com.github.catvod.spider.merge.\u08ab;
import com.github.catvod.spider.merge.\u08ac;
import com.github.catvod.spider.merge.\u08b0;
import com.github.catvod.spider.merge.\u1070;
import com.github.catvod.spider.merge.\u1076;
import com.github.catvod.spider.merge.\u108e;
import com.github.catvod.spider.merge.\u10fe;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class \u1066
extends Enum<\u1066> {
    public static final /* enum */ \u1066 \u037f;
    public static final /* enum */ \u1066 \u0528;
    public static final /* enum */ \u1066 \u0529;
    private static final \u1066[] \u052a;

    static {
        \u1066 \u10662;
        \u1066 \u10663;
        \u1066 \u10664;
        \u037f = \u10664 = new \u1066();
        \u0528 = \u10663 = new \u1066();
        \u0529 = \u10662 = new \u1066();
        \u052a = new \u1066[]{\u10664, \u10663, \u10662};
    }

    public static boolean \u037f(\u08ac object) {
        object = ((\u08ac)object).iterator();
        while (object.hasNext()) {
            if (((\u08ab)object.next()).\u037f instanceof \u1070) continue;
            return false;
        }
        return true;
    }

    public static boolean \u0528(Collection<BitSet> collection) {
        return \u1066.\u058f(collection) ^ true;
    }

    public static boolean \u0529(Collection<BitSet> object) {
        object = object.iterator();
        BitSet bitSet = (BitSet)object.next();
        while (object.hasNext()) {
            if (((BitSet)object.next()).equals(bitSet)) continue;
            return false;
        }
        return true;
    }

    public static BitSet \u052a(Collection<BitSet> object) {
        BitSet bitSet = new BitSet();
        object = object.iterator();
        while (object.hasNext()) {
            bitSet.or((BitSet)object.next());
        }
        return bitSet;
    }

    public static Collection<BitSet> \u052b(\u08ac object) {
        \u0528 \u0529 = new \u0528();
        Iterator<\u08ab> iterator = ((\u08ac)object).iterator();
        while (iterator.hasNext()) {
            \u08ab \u08ab2 = iterator.next();
            BitSet bitSet = (BitSet)\u0529.get(\u08ab2);
            object = bitSet;
            if (bitSet == null) {
                object = new BitSet();
                \u0529.put(\u08ab2, object);
            }
            ((BitSet)object).set(\u08ab2.\u0528);
        }
        return \u0529.values();
    }

    public static int \u052c(Collection<BitSet> object) {
        BitSet bitSet = new BitSet();
        object = object.iterator();
        while (object.hasNext()) {
            bitSet.set(((BitSet)object.next()).nextSetBit(0));
            if (bitSet.cardinality() <= 1) continue;
            return 0;
        }
        return bitSet.nextSetBit(0);
    }

    public static Map<\u08b0, BitSet> \u052d(\u08ac object) {
        HashMap<\u08b0, BitSet> hashMap = new HashMap<\u08b0, BitSet>();
        Iterator<\u08ab> iterator = ((\u08ac)object).iterator();
        while (iterator.hasNext()) {
            \u08ab \u08ab2 = iterator.next();
            BitSet bitSet = (BitSet)hashMap.get(\u08ab2.\u037f);
            object = bitSet;
            if (bitSet == null) {
                object = new BitSet();
                hashMap.put(\u08ab2.\u037f, (BitSet)object);
            }
            ((BitSet)object).set(\u08ab2.\u0528);
        }
        return hashMap;
    }

    public static boolean \u052e(\u08ac object) {
        object = ((\u08ac)object).iterator();
        while (object.hasNext()) {
            if (!(((\u08ab)object.next()).\u037f instanceof \u1070)) continue;
            return true;
        }
        return false;
    }

    public static boolean \u052f(Collection<BitSet> object) {
        object = object.iterator();
        while (object.hasNext()) {
            if (((BitSet)object.next()).cardinality() <= 1) continue;
            return true;
        }
        return false;
    }

    public static boolean \u058f(Collection<BitSet> object) {
        object = object.iterator();
        while (object.hasNext()) {
            if (((BitSet)object.next()).cardinality() != 1) continue;
            return true;
        }
        return false;
    }

    public static boolean \u0620(\u1066 object, \u08ac \u08ac2) {
        boolean bl = \u1066.\u037f(\u08ac2);
        boolean bl2 = true;
        if (bl) {
            return true;
        }
        \u08ac \u08ac3 = \u08ac2;
        if (object == \u037f) {
            \u08ac3 = \u08ac2;
            if (\u08ac2.\u052c) {
                \u08ac3 = new \u08ac();
                object = \u08ac2.iterator();
                while (object.hasNext()) {
                    \u08ac3.\u037f(new \u08ab((\u08ab)object.next(), \u1076.\u037f));
                }
            }
        }
        if (!\u1066.\u052f(\u1066.\u052b(\u08ac3)) || \u1066.\u0780(\u08ac3)) {
            bl2 = false;
        }
        return bl2;
    }

    public static boolean \u0780(\u08ac object) {
        object = \u1066.\u052d((\u08ac)object).values().iterator();
        while (object.hasNext()) {
            if (((BitSet)object.next()).cardinality() != 1) continue;
            return true;
        }
        return false;
    }

    public static int \u0781(Collection<BitSet> collection) {
        return \u1066.\u052c(collection);
    }

    private static final class \u037f
    extends \u108e<\u08ab> {
        public static final \u037f \u037f = new \u037f();

        private \u037f() {
        }

        public boolean \u0529(\u08ab \u08ab2, \u08ab \u08ab3) {
            boolean bl = true;
            if (\u08ab2 == \u08ab3) {
                return true;
            }
            if (\u08ab2 != null && \u08ab3 != null) {
                if (\u08ab2.\u037f.\u0529 != \u08ab3.\u037f.\u0529 || !\u08ab2.\u0529.equals(\u08ab3.\u0529)) {
                    bl = false;
                }
                return bl;
            }
            return false;
        }

        public int \u052a(\u08ab \u08ab2) {
            return \u02c6.\u037f(\u02c6.\u052c(\u02c6.\u052b(\u02c6.\u052a(7), \u08ab2.\u037f.\u0529), \u08ab2.\u0529), 2);
        }
    }

    static class \u0528
    extends \u10fe<\u08ab, BitSet> {
        public \u0528() {
            super(com.github.catvod.spider.merge.\u1066$\u037f.\u037f);
        }
    }
}

