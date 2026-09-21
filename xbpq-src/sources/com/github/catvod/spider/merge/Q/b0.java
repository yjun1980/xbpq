package com.github.catvod.spider.merge.Q;

import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class b0 {
    public static boolean a(C0015f c0015f) {
        Iterator<C0011b> it = c0015f.iterator();
        while (it.hasNext()) {
            if (!(it.next().a instanceof e0)) {
                return false;
            }
        }
        return true;
    }

    public static Collection<BitSet> b(C0015f c0015f) {
        a0 a0Var = new a0();
        Iterator<C0011b> it = c0015f.iterator();
        while (it.hasNext()) {
            C0011b next = it.next();
            BitSet bitSet = (BitSet) a0Var.get(next);
            if (bitSet == null) {
                bitSet = new BitSet();
                a0Var.put(next, bitSet);
            }
            bitSet.set(next.b);
        }
        return a0Var.values();
    }

    public static int c(Collection<BitSet> collection) {
        BitSet bitSet = new BitSet();
        Iterator<BitSet> it = collection.iterator();
        while (it.hasNext()) {
            bitSet.set(it.next().nextSetBit(0));
            if (bitSet.cardinality() > 1) {
                return 0;
            }
        }
        return bitSet.nextSetBit(0);
    }
}
