/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.D.h0;
import com.github.catvod.spider.merge.D.i0;
import java.lang.reflect.Type;

public final class Y
implements X {
    public static Y a = new Y();

    @Override
    public final void d(L object, Object object2, Object object3, Type type, int n2) {
        object3 = ((L)object).j;
        if (object2 == null) {
            ((h0)object3).u(i0.h);
            return;
        }
        boolean bl = object2 instanceof int[];
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        if (bl) {
            object = (int[])object2;
            ((h0)object3).write(91);
            for (n2 = n7; n2 < ((Object)object).length; ++n2) {
                if (n2 != 0) {
                    ((h0)object3).write(44);
                }
                ((h0)object3).q((int)object[n2]);
            }
            ((h0)object3).write(93);
            return;
        }
        if (object2 instanceof short[]) {
            object = (short[])object2;
            ((h0)object3).write(91);
            for (n2 = 0; n2 < ((Object)object).length; ++n2) {
                if (n2 != 0) {
                    ((h0)object3).write(44);
                }
                ((h0)object3).q((int)object[n2]);
            }
            ((h0)object3).write(93);
            return;
        }
        if (object2 instanceof long[]) {
            object = (long[])object2;
            ((h0)object3).write(91);
            for (n2 = n3; n2 < ((Object)object).length; ++n2) {
                if (n2 != 0) {
                    ((h0)object3).write(44);
                }
                ((h0)object3).r((long)object[n2]);
            }
            ((h0)object3).write(93);
            return;
        }
        if (object2 instanceof boolean[]) {
            object2 = (boolean[])object2;
            ((h0)object3).write(91);
            for (n2 = n4; n2 < ((Object)object2).length; ++n2) {
                if (n2 != 0) {
                    ((h0)object3).write(44);
                }
                object = object2[n2] != false ? "true" : "false";
                ((h0)object3).write((String)object);
            }
            ((h0)object3).write(93);
            return;
        }
        if (object2 instanceof float[]) {
            object = (float[])object2;
            ((h0)object3).write(91);
            for (n2 = n5; n2 < ((Object)object).length; ++n2) {
                Object object4;
                if (n2 != 0) {
                    ((h0)object3).write(44);
                }
                if (Float.isNaN((float)(object4 = object[n2]))) {
                    ((h0)object3).s();
                    continue;
                }
                ((h0)object3).b(Float.toString((float)object4));
            }
            ((h0)object3).write(93);
            return;
        }
        if (object2 instanceof double[]) {
            object = (double[])object2;
            ((h0)object3).write(91);
            for (n2 = n6; n2 < ((Object)object).length; ++n2) {
                Object object5;
                if (n2 != 0) {
                    ((h0)object3).write(44);
                }
                if (Double.isNaN((double)(object5 = object[n2]))) {
                    ((h0)object3).s();
                    continue;
                }
                ((h0)object3).b(Double.toString((double)object5));
            }
            ((h0)object3).write(93);
            return;
        }
        if (object2 instanceof byte[]) {
            ((h0)object3).h((byte[])object2);
            return;
        }
        ((h0)object3).w((char[])object2);
    }
}

