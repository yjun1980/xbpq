/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.K;
import com.github.catvod.spider.merge.E0.N;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class c0<K, V>
extends LinkedHashMap<K, V> {
    private static final c0<?, ?> b;
    private boolean a = true;

    static {
        c0 c02 = new c0();
        b = c02;
        c02.a = false;
    }

    private c0() {
    }

    private c0(Map<K, V> map) {
        super(map);
    }

    private static int a(Object object) {
        if (object instanceof byte[]) {
            int n2;
            int n3;
            object = (byte[])object;
            byte[] byArray = N.b;
            int n4 = n3 = ((Object)object).length;
            for (n2 = 0; n2 < 0 + n3; ++n2) {
                n4 = n4 * 31 + object[n2];
            }
            n2 = n4;
            if (n4 == 0) {
                n2 = 1;
            }
            return n2;
        }
        if (!(object instanceof K)) {
            return object.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public static <K, V> c0<K, V> b() {
        return b;
    }

    private void c() {
        if (this.a) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public final void clear() {
        this.c();
        super.clear();
    }

    public final boolean d() {
        return this.a;
    }

    public final void e() {
        this.a = false;
    }

    @Override
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Object> set = ((AbstractMap)this).isEmpty() ? Collections.emptySet() : super.entrySet();
        return set;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final boolean equals(Object var1_1) {
        block7: {
            var3_2 = var1_1 instanceof Map;
            var4_3 = true;
            if (!var3_2) ** GOTO lbl-1000
            var5_4 = (Map)var1_1;
            if (this == var5_4) {
                while (true) {
                    var2_5 = true;
                    break block7;
                    break;
                }
            }
            if (this.size() != var5_4.size()) lbl-1000:
            // 3 sources

            {
                while (true) {
                    var2_5 = false;
                    break block7;
                    break;
                }
            }
            var1_1 = this.entrySet().iterator();
            do {
                if (!var1_1.hasNext()) ** continue;
                var7_7 /* !! */  = var1_1.next();
                if (!var5_4.containsKey(var7_7 /* !! */ .getKey())) ** GOTO lbl-1000
                var6_6 = var7_7 /* !! */ .getValue();
                var7_7 /* !! */  = var5_4.get(var7_7 /* !! */ .getKey());
            } while (var3_2 = var6_6 instanceof byte[] != false && var7_7 /* !! */  instanceof byte[] != false ? Arrays.equals((byte[])var6_6, (byte[])var7_7 /* !! */ ) : var6_6.equals(var7_7 /* !! */ ));
            ** while (true)
        }
        if (var2_5) {
            var3_2 = var4_3;
        } else lbl-1000:
        // 2 sources

        {
            var3_2 = false;
        }
        return var3_2;
    }

    public final void f(c0<K, V> c02) {
        this.c();
        if (!((AbstractMap)c02).isEmpty()) {
            this.putAll(c02);
        }
    }

    public final c0<K, V> g() {
        c0<K, V> c02 = ((AbstractMap)this).isEmpty() ? new c0<K, V>() : new c0<K, V>(this);
        return c02;
    }

    @Override
    public final int hashCode() {
        Iterator<Map.Entry<K, V>> iterator = this.entrySet().iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            Map.Entry<K, V> entry = iterator.next();
            int n3 = c0.a(entry.getKey());
            n2 += c0.a(entry.getValue()) ^ n3;
        }
        return n2;
    }

    @Override
    public final V put(K k2, V v2) {
        this.c();
        byte[] byArray = N.b;
        Objects.requireNonNull(k2);
        Objects.requireNonNull(v2);
        return super.put(k2, v2);
    }

    @Override
    public final void putAll(Map<? extends K, ? extends V> map) {
        this.c();
        for (K k2 : map.keySet()) {
            byte[] byArray = N.b;
            Objects.requireNonNull(k2);
            Objects.requireNonNull(map.get(k2));
        }
        super.putAll(map);
    }

    @Override
    public final V remove(Object object) {
        this.c();
        return super.remove(object);
    }
}

