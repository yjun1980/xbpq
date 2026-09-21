/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 */
package com.github.catvod.spider.merge.xc.f;

import android.graphics.Typeface;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Locale;

public final class f {
    public final LinkedHashMap a = new LinkedHashMap(0, 0.75f, true);
    public int b;
    public int c;
    public int d;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object a(Object object) {
        if (object == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    object = this.a.get(object);
                    if (object != null) {
                        ++this.c;
                        return object;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                ++this.d;
                return null;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(Object object, Typeface typeface) {
        if (object == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                ++this.b;
                if (((AbstractMap)this.a).put(object, typeface) != null) {
                    --this.b;
                }
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl8 : MonitorExitStatement: MONITOREXIT : this
                this.c(16);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(int n2) {
        StringBuilder stringBuilder;
        Object object;
        Throwable throwable2;
        while (true) {
            synchronized (this) {
                try {
                    if (this.b < 0 || ((AbstractMap)this.a).isEmpty() && this.b != 0) break;
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                if (this.b <= n2) return;
                if (((AbstractMap)this.a).isEmpty()) {
                    return;
                }
                object = this.a.entrySet().iterator().next();
                stringBuilder = object.getKey();
                object.getValue();
                ((AbstractMap)this.a).remove(stringBuilder);
                --this.b;
            }
        }
        {
            block5: {
                stringBuilder = new StringBuilder();
                stringBuilder.append(f.class.getName());
                stringBuilder.append(".sizeOf() is reporting inconsistent results!");
                object = new IllegalStateException(stringBuilder.toString());
                throw object;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String toString() {
        synchronized (this) {
            Throwable throwable2;
            block3: {
                int n2;
                int n3;
                try {
                    n3 = this.c;
                    n2 = this.d + n3;
                    n2 = n2 != 0 ? n3 * 100 / n2 : 0;
                }
                catch (Throwable throwable2) {
                    break block3;
                }
                Object object = Locale.US;
                int n4 = this.c;
                n3 = this.d;
                object = new StringBuilder("LruCache[maxSize=16,hits=");
                ((StringBuilder)object).append(n4);
                ((StringBuilder)object).append(",misses=");
                ((StringBuilder)object).append(n3);
                ((StringBuilder)object).append(",hitRate=");
                ((StringBuilder)object).append(n2);
                ((StringBuilder)object).append("%]");
                return ((StringBuilder)object).toString();
            }
            throw throwable2;
        }
    }
}

