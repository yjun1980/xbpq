/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u08ab;
import com.github.catvod.spider.merge.\u08af;
import com.github.catvod.spider.merge.\u1061;
import com.github.catvod.spider.merge.\u1076;
import com.github.catvod.spider.merge.\u108e;
import com.github.catvod.spider.merge.\u10c7;
import com.github.catvod.spider.merge.\u10cd;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class \u08ac
implements Set<\u08ab> {
    protected boolean \u037f = false;
    public \u037f \u0528;
    public final ArrayList<\u08ab> \u0529 = new ArrayList(7);
    public int \u052a;
    protected BitSet \u052b;
    public boolean \u052c;
    public boolean \u052d;
    public final boolean \u052e;
    private int \u052f = -1;

    public \u08ac() {
        this(true);
    }

    public \u08ac(boolean bl) {
        this.\u0528 = new \u052a();
        this.\u052e = bl;
    }

    @Override
    public boolean addAll(Collection<? extends \u08ab> object) {
        object = object.iterator();
        while (object.hasNext()) {
            this.\u037f((\u08ab)object.next());
        }
        return false;
    }

    @Override
    public void clear() {
        if (!this.\u037f) {
            this.\u0529.clear();
            this.\u052f = -1;
            this.\u0528.clear();
            return;
        }
        throw new IllegalStateException(SOY.d("2E3A380554041F26711F0757083730121B19162B"));
    }

    @Override
    public boolean contains(Object object) {
        \u037f \u03f3 = this.\u0528;
        if (\u03f3 != null) {
            return \u03f3.contains(object);
        }
        throw new UnsupportedOperationException(SOY.d("2E3A3805541A1F2639191057132171181B035A3B3C06181217373F0211135A343E0454051F3335191A1B03722213000454"));
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(Object object) {
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (!(object instanceof \u08ac)) {
            return false;
        }
        object = (\u08ac)object;
        ArrayList<\u08ab> arrayList = this.\u0529;
        if (arrayList == null || !arrayList.equals(((\u08ac)object).\u0529) || this.\u052e != ((\u08ac)object).\u052e || this.\u052a != ((\u08ac)object).\u052a || this.\u052b != ((\u08ac)object).\u052b || this.\u052c != ((\u08ac)object).\u052c || this.\u052d != ((\u08ac)object).\u052d) {
            bl = false;
        }
        return bl;
    }

    @Override
    public int hashCode() {
        if (this.\u052b()) {
            if (this.\u052f == -1) {
                this.\u052f = this.\u0529.hashCode();
            }
            return this.\u052f;
        }
        return this.\u0529.hashCode();
    }

    @Override
    public boolean isEmpty() {
        return this.\u0529.isEmpty();
    }

    @Override
    public Iterator<\u08ab> iterator() {
        return this.\u0529.iterator();
    }

    @Override
    public boolean remove(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        return this.\u0529.size();
    }

    @Override
    public <T> T[] toArray(T[] TArray) {
        return this.\u0528.toArray((U[])TArray);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.\u0529().toString());
        if (this.\u052c) {
            stringBuilder.append(SOY.d("563A3005271217333F021D14393D3F02110F0E6F"));
            stringBuilder.append(this.\u052c);
        }
        if (this.\u052a != 0) {
            stringBuilder.append(SOY.d("56273F1F05021F133D0249"));
            stringBuilder.append(this.\u052a);
        }
        if (this.\u052b != null) {
            stringBuilder.append(SOY.d("56313E18121B1331251F1A103B3E250549"));
            stringBuilder.append(this.\u052b);
        }
        if (this.\u052d) {
            stringBuilder.append(SOY.d("56363806073E14263E3901031F2012191A031F2A25"));
        }
        return stringBuilder.toString();
    }

    public boolean \u037f(\u08ab \u08ab2) {
        return this.\u0528(\u08ab2, null);
    }

    public boolean \u0528(\u08ab \u08ab2, \u10cd<\u1061, \u1061, \u1061> object) {
        if (!this.\u037f) {
            \u08ab \u08ab3;
            if (\u08ab2.\u052b != \u1076.\u037f) {
                this.\u052c = true;
            }
            if (\u08ab2.\u0528() > 0) {
                this.\u052d = true;
            }
            if ((\u08ab3 = this.\u0528.\u052e(\u08ab2)) == \u08ab2) {
                this.\u052f = -1;
                this.\u0529.add(\u08ab2);
                return true;
            }
            boolean bl = this.\u052e;
            object = \u1061.\u0620(\u08ab3.\u0529, \u08ab2.\u0529, bl ^ true, object);
            \u08ab3.\u052a = Math.max(\u08ab3.\u052a, \u08ab2.\u052a);
            if (\u08ab2.\u0529()) {
                \u08ab3.\u052a(true);
            }
            \u08ab3.\u0529 = object;
            return true;
        }
        throw new IllegalStateException(SOY.d("2E3A380554041F26711F0757083730121B19162B"));
    }

    public List<\u08ab> \u0529() {
        return this.\u0529;
    }

    public BitSet \u052a() {
        BitSet bitSet = new BitSet();
        Iterator<\u08ab> iterator = this.\u0529.iterator();
        while (iterator.hasNext()) {
            bitSet.set(iterator.next().\u0528);
        }
        return bitSet;
    }

    public boolean \u052b() {
        return this.\u037f;
    }

    public void \u052c(\u08af object) {
        if (!this.\u037f) {
            if (this.\u0528.isEmpty()) {
                return;
            }
            for (\u08ab \u08ab2 : this.\u0529) {
                \u08ab2.\u0529 = ((\u08af)object).\u037f(\u08ab2.\u0529);
            }
            return;
        }
        object = new IllegalStateException(SOY.d("2E3A380554041F26711F0757083730121B19162B"));
        throw object;
    }

    public void \u052d(boolean bl) {
        this.\u037f = bl;
        this.\u0528 = null;
    }

    public \u08ab[] \u052e() {
        return (\u08ab[])this.\u0528.toArray();
    }

    public static abstract class \u037f
    extends \u10c7<\u08ab> {
        public \u037f(\u108e<? super \u08ab> \u108e2) {
            this(\u108e2, 16, 2);
        }

        public \u037f(\u108e<? super \u08ab> \u108e2, int n2, int n3) {
            super(\u108e2, n2, n3);
        }

        protected final \u08ab \u0620(Object object) {
            if (!(object instanceof \u08ab)) {
                return null;
            }
            return (\u08ab)object;
        }

        protected final \u08ab[] \u0780(int n2) {
            return new \u08ab[n2];
        }

        protected final \u08ab[][] \u0781(int n2) {
            return new \u08ab[n2][];
        }
    }

    public static final class \u0528
    extends \u108e<\u08ab> {
        public static final \u0528 \u037f = new \u0528();

        private \u0528() {
        }

        public boolean \u0529(\u08ab \u08ab2, \u08ab \u08ab3) {
            boolean bl = true;
            if (\u08ab2 == \u08ab3) {
                return true;
            }
            if (\u08ab2 != null && \u08ab3 != null) {
                if (\u08ab2.\u037f.\u0529 != \u08ab3.\u037f.\u0529 || \u08ab2.\u0528 != \u08ab3.\u0528 || !\u08ab2.\u052b.equals(\u08ab3.\u052b)) {
                    bl = false;
                }
                return bl;
            }
            return false;
        }

        public int \u052a(\u08ab \u08ab2) {
            return ((217 + \u08ab2.\u037f.\u0529) * 31 + \u08ab2.\u0528) * 31 + \u08ab2.\u052b.hashCode();
        }
    }

    public static class \u052a
    extends \u037f {
        public \u052a() {
            super(com.github.catvod.spider.merge.\u08ac$\u0528.\u037f);
        }
    }
}

