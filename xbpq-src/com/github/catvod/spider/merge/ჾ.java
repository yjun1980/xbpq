/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u02c6;
import com.github.catvod.spider.merge.\u02c7;
import com.github.catvod.spider.merge.\u108e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class \u10fe<K, V>
implements Map<K, V> {
    protected final \u108e<? super K> \u037f;
    protected LinkedList<\u037f<K, V>>[] \u0528;
    protected int \u0529 = 0;
    protected int \u052a = 12;
    protected int \u052b = 1;
    protected int \u052c = 8;

    public \u10fe(\u108e<? super K> \u108e2) {
        this(\u108e2, 16, 8);
    }

    public \u10fe(\u108e<? super K> \u02c72, int n2, int n3) {
        \u02c7 \u02c73 = \u02c72;
        if (\u02c72 == null) {
            \u02c73 = \u02c7.\u037f;
        }
        this.\u037f = \u02c73;
        this.\u0528 = \u10fe.\u037f(n3);
        this.\u052c = n3;
    }

    private static <K, V> LinkedList<\u037f<K, V>>[] \u037f(int n2) {
        return new LinkedList[n2];
    }

    @Override
    public void clear() {
        this.\u0528 = \u10fe.\u037f(16);
        this.\u0529 = 0;
    }

    @Override
    public boolean containsKey(Object object) {
        boolean bl = this.get(object) != null;
        return bl;
    }

    @Override
    public boolean containsValue(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public V get(Object object) {
        if (object == null) {
            return null;
        }
        int n2 = this.\u0529(object);
        LinkedList<\u037f<K, V>> linkedList2 = this.\u0528[n2];
        if (linkedList2 == null) {
            return null;
        }
        for (\u037f \u03f3 : linkedList2) {
            if (!this.\u037f.\u037f(\u03f3.\u037f, object)) continue;
            return \u03f3.\u0528;
        }
        return null;
    }

    @Override
    public int hashCode() {
        int n2 = \u02c6.\u0529();
        for (LinkedList<\u037f<K, V>> linkedList : this.\u0528) {
            int n3;
            if (linkedList == null) {
                n3 = n2;
            } else {
                Iterator iterator = linkedList.iterator();
                while (true) {
                    n3 = n2;
                    if (!iterator.hasNext()) break;
                    \u037f \u03f3 = (\u037f)iterator.next();
                    if (\u03f3 == null) {
                        n3 = n2;
                        break;
                    }
                    n2 = \u02c6.\u052b(n2, this.\u037f.\u0528(\u03f3.\u037f));
                }
            }
            n2 = n3;
        }
        return \u02c6.\u037f(n2, this.size());
    }

    @Override
    public boolean isEmpty() {
        boolean bl = this.\u0529 == 0;
        return bl;
    }

    @Override
    public Set<K> keySet() {
        throw new UnsupportedOperationException();
    }

    @Override
    public V put(K object, V v2) {
        if (object == null) {
            return null;
        }
        if (this.\u0529 > this.\u052a) {
            this.\u0528();
        }
        int n2 = this.\u0529(object);
        LinkedList<\u037f<K, V>>[] linkedListArray = this.\u0528;
        LinkedList<\u037f<K, V>> object22 = linkedListArray[n2];
        LinkedList<\u037f<K, V>> linkedList = object22;
        if (object22 == null) {
            linkedListArray[n2] = linkedList = new LinkedList();
        }
        for (\u037f \u03f3 : linkedList) {
            if (!this.\u037f.\u037f(\u03f3.\u037f, object)) continue;
            object = \u03f3.\u0528;
            \u03f3.\u0528 = v2;
            ++this.\u0529;
            return (V)object;
        }
        linkedList.add(new \u037f<Object, V>(object, v2));
        ++this.\u0529;
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override
    public V remove(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        return this.\u0529;
    }

    public String toString() {
        if (this.size() == 0) {
            return SOY.d("012F");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('{');
        LinkedList<\u037f<K, V>>[] linkedListArray = this.\u0528;
        int n2 = linkedListArray.length;
        boolean bl = true;
        for (int i2 = 0; i2 < n2; ++i2) {
            boolean bl2;
            LinkedList<\u037f<K, V>> linkedList = linkedListArray[i2];
            if (linkedList == null) {
                bl2 = bl;
            } else {
                linkedList = linkedList.iterator();
                while (true) {
                    bl2 = bl;
                    if (!linkedList.hasNext()) break;
                    \u037f \u03f3 = (\u037f)linkedList.next();
                    if (\u03f3 == null) {
                        bl2 = bl;
                        break;
                    }
                    if (bl) {
                        bl = false;
                    } else {
                        stringBuilder.append(SOY.d("5672"));
                    }
                    stringBuilder.append(\u03f3.toString());
                }
            }
            bl = bl2;
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    @Override
    public Collection<V> values() {
        ArrayList arrayList = new ArrayList(this.size());
        for (LinkedList<\u037f<K, V>> linkedList : this.\u0528) {
            if (linkedList == null) continue;
            linkedList = linkedList.iterator();
            while (linkedList.hasNext()) {
                arrayList.add(((\u037f)linkedList.next()).\u0528);
            }
        }
        return arrayList;
    }

    protected void \u0528() {
        LinkedList<\u037f<K, V>>[] linkedListArray = this.\u0528;
        this.\u052b += 4;
        int n2 = linkedListArray.length * 2;
        this.\u0528 = \u10fe.\u037f(n2);
        double d2 = n2;
        Double.isNaN(d2);
        this.\u052a = (int)(d2 * 0.75);
        int n3 = this.size();
        for (LinkedList<\u037f<K, V>> linkedList : linkedListArray) {
            \u037f \u03f3;
            if (linkedList == null) continue;
            linkedList = linkedList.iterator();
            while (linkedList.hasNext() && (\u03f3 = (\u037f)linkedList.next()) != null) {
                this.put(\u03f3.\u037f, \u03f3.\u0528);
            }
        }
        this.\u0529 = n3;
    }

    protected int \u0529(K k2) {
        return this.\u037f.\u0528(k2) & this.\u0528.length - 1;
    }

    public static class \u037f<K, V> {
        public final K \u037f;
        public V \u0528;

        public \u037f(K k2, V v2) {
            this.\u037f = k2;
            this.\u0528 = v2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.\u037f.toString());
            stringBuilder.append(SOY.d("40"));
            stringBuilder.append(this.\u0528.toString());
            return stringBuilder.toString();
        }
    }
}

