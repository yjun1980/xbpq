/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.d0;

import com.github.catvod.spider.merge.by.l;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.mI.j;
import com.github.catvod.spider.merge.xc.c0.c;
import com.github.catvod.spider.merge.xc.d0.e;

public final class a
extends j
implements l {
    public final int a;
    public final Object b;

    public /* synthetic */ a(int n2, Object object) {
        this.a = n2;
        this.b = object;
        super(1);
    }

    @Override
    public final Object invoke(Object object) {
        switch (this.a) {
            default: {
                Throwable throwable = (Throwable)object;
                object = (l)this.b;
                Object var3_4 = null;
                Throwable throwable2 = (Throwable)object.invoke(throwable);
                object = throwable2;
                try {
                    if (!i.a(throwable.getMessage(), throwable2.getMessage())) {
                        boolean bl = i.a(throwable2.getMessage(), throwable.toString());
                        object = throwable2;
                        if (!bl) {
                            object = null;
                        }
                    }
                }
                catch (Throwable throwable3) {
                    object = com.github.catvod.spider.merge.xc.a.a.h(throwable3);
                }
                if (object instanceof c) {
                    object = var3_4;
                }
                return (Throwable)object;
            }
            case 0: 
        }
        object = object == (e)this.b ? "(this Collection)" : String.valueOf(object);
        return object;
    }
}

