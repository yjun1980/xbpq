/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.f;

import com.github.catvod.spider.merge.xc.f.a;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public final class i
implements Iterator,
Map.Entry {
    public int a;
    public int b;
    public boolean c;
    public final a d;

    public i(a a2) {
        this.d = a2;
        this.c = false;
        this.a = a2.d() - 1;
        this.b = -1;
    }

    @Override
    public final boolean equals(Object object) {
        block4: {
            boolean bl;
            block6: {
                block7: {
                    Map.Entry entry;
                    boolean bl2;
                    block5: {
                        int n2;
                        Object object2;
                        if (!this.c) break block4;
                        bl = object instanceof Map.Entry;
                        bl2 = false;
                        if (!bl) {
                            return false;
                        }
                        entry = (Map.Entry)object;
                        Object k2 = entry.getKey();
                        if (k2 == (object2 = ((a)(object = this.d)).b(n2 = this.b, 0))) break block5;
                        bl = bl2;
                        if (k2 == null) break block6;
                        bl = bl2;
                        if (!k2.equals(object2)) break block6;
                    }
                    if ((entry = entry.getValue()) == (object = ((a)object).b(this.b, 1))) break block7;
                    bl = bl2;
                    if (entry == null) break block6;
                    bl = bl2;
                    if (!((Object)entry).equals(object)) break block6;
                }
                bl = true;
            }
            return bl;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object getKey() {
        if (this.c) {
            int n2 = this.b;
            return this.d.b(n2, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object getValue() {
        if (this.c) {
            int n2 = this.b;
            return this.d.b(n2, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override
    public final boolean hasNext() {
        boolean bl = this.b < this.a;
        return bl;
    }

    @Override
    public final int hashCode() {
        if (this.c) {
            int n2 = this.b;
            Object object = this.d;
            int n3 = 0;
            Object object2 = ((a)object).b(n2, 0);
            object = ((a)object).b(this.b, 1);
            n2 = object2 == null ? 0 : object2.hashCode();
            if (object != null) {
                n3 = object.hashCode();
            }
            return n2 ^ n3;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object next() {
        if (this.hasNext()) {
            ++this.b;
            this.c = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        if (this.c) {
            this.d.h(this.b);
            --this.b;
            --this.a;
            this.c = false;
            return;
        }
        throw new IllegalStateException();
    }

    public final Object setValue(Object object) {
        if (this.c) {
            return this.d.i(this.b, object);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getKey());
        stringBuilder.append("=");
        stringBuilder.append(this.getValue());
        return stringBuilder.toString();
    }
}

