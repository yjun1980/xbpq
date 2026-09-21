/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.Q.a0;
import com.github.catvod.spider.merge.Q.b;
import com.github.catvod.spider.merge.Q.e0;
import com.github.catvod.spider.merge.Q.f;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;

public final class b0 {
    public static boolean a(f object) {
        object = ((f)object).iterator();
        while (object.hasNext()) {
            if (((b)object.next()).a instanceof e0) continue;
            return false;
        }
        return true;
    }

    public static Collection<BitSet> b(f object) {
        a0 a02 = new a0();
        Iterator<b> iterator = ((f)object).iterator();
        while (iterator.hasNext()) {
            b b2 = iterator.next();
            BitSet bitSet = (BitSet)a02.get(b2);
            object = bitSet;
            if (bitSet == null) {
                object = new BitSet();
                a02.put(b2, object);
            }
            ((BitSet)object).set(b2.b);
        }
        return a02.values();
    }

    public static int c(Collection<BitSet> object) {
        BitSet bitSet = new BitSet();
        object = object.iterator();
        while (object.hasNext()) {
            bitSet.set(((BitSet)object.next()).nextSetBit(0));
            if (bitSet.cardinality() <= 1) continue;
            return 0;
        }
        return bitSet.nextSetBit(0);
    }
}

