/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.q;

import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;

public class g<K, V> {
    private final LinkedHashMap<K, V> a;
    private int b;
    private int c;
    private int d;
    private int e;

    public g(int n2) {
        if (n2 > 0) {
            this.c = n2;
            this.a = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final V a(K object) {
        Objects.requireNonNull(object, "key == null");
        synchronized (this) {
            object = this.a.get(object);
            if (object != null) {
                ++this.d;
                return (V)object;
            }
            ++this.e;
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final V b(K object, V v2) {
        if (object == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            ++this.b;
            object = ((AbstractMap)this.a).put(object, v2);
            if (object != null) {
                --this.b;
            }
        }
        this.c(this.c);
        return (V)object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(int n2) {
        StringBuilder stringBuilder;
        Object object;
        while (true) {
            synchronized (this) {
                if (this.b < 0 || ((AbstractMap)this.a).isEmpty() && this.b != 0) break block3;
                if (this.b <= n2 || ((AbstractMap)this.a).isEmpty()) break;
                object = this.a.entrySet().iterator().next();
                stringBuilder = object.getKey();
                object.getValue();
                ((AbstractMap)this.a).remove(stringBuilder);
                --this.b;
            }
        }
        {
            block3: {
                return;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.getClass().getName());
            stringBuilder.append(".sizeOf() is reporting inconsistent results!");
            object = new IllegalStateException(stringBuilder.toString());
            throw object;
        }
    }

    public final String toString() {
        synchronized (this) {
            int n2;
            block6: {
                block5: {
                    n2 = this.d;
                    int n3 = this.e + n2;
                    if (n3 == 0) break block5;
                    n2 = n2 * 100 / n3;
                    break block6;
                }
                n2 = 0;
            }
            String string = String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", this.c, this.d, this.e, n2);
            return string;
        }
    }
}

