/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.i0;

public abstract class a {
    public static final Integer a;

    static {
        Object object;
        Object object2;
        block5: {
            block4: {
                object2 = null;
                try {
                    object = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                    if (!(object instanceof Integer)) break block4;
                    object = (Integer)object;
                    break block5;
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
            }
            object = null;
        }
        Object object3 = object2;
        if (object != null) {
            object3 = object2;
            if (((Number)object).intValue() > 0) {
                object3 = object;
            }
        }
        a = object3;
    }
}

