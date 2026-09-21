/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.G0;

import com.github.catvod.spider.merge.G0.a;
import com.github.catvod.spider.merge.G0.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

final class c
implements d {
    private final ThreadLocal<String> a = new ThreadLocal();
    private final List<a> b = new ArrayList<a>();

    c() {
    }

    @Override
    public final void a(Object object) {
        object = object == null ? "null" : (!object.getClass().isArray() ? object.toString() : (object instanceof boolean[] ? Arrays.toString((boolean[])object) : (object instanceof byte[] ? Arrays.toString((byte[])object) : (object instanceof char[] ? Arrays.toString((char[])object) : (object instanceof short[] ? Arrays.toString((short[])object) : (object instanceof int[] ? Arrays.toString((int[])object) : (object instanceof long[] ? Arrays.toString((long[])object) : (object instanceof float[] ? Arrays.toString((float[])object) : (object instanceof double[] ? Arrays.toString((double[])object) : (object instanceof Object[] ? Arrays.deepToString((Object[])object) : "Couldn't find a correct type for the object"))))))))));
        synchronized (this) {
            String string;
            block6: {
                block5: {
                    Objects.requireNonNull(object);
                    string = this.a.get();
                    if (string == null) break block5;
                    this.a.remove();
                    break block6;
                }
                string = null;
            }
            this.b(string, (String)object);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(String object, String object2) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                block6: {
                    if (object2 != null) {
                        try {
                            if (((String)object2).length() == 0) break block6;
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                }
                object = ((ArrayList)this.b).iterator();
                while (true) {
                    if (!object.hasNext()) {
                        return;
                    }
                    object2 = (a)object.next();
                    if (!object2.b()) continue;
                    object2.a();
                }
            }
            throw throwable2;
        }
    }

    public final d c(String string) {
        this.a.set(string);
        return this;
    }
}

