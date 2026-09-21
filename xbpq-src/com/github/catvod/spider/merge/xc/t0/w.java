/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.t0;

import com.github.catvod.spider.merge.xc.e0.i;
import com.github.catvod.spider.merge.xc.s0.J;

public final class w
extends com.github.catvod.spider.merge.xc.s0.w
implements J {
    public final Throwable c;
    public final String d;

    public w(String string, Throwable throwable) {
        this.c = throwable;
        this.d = string;
    }

    @Override
    public final void d(i i2, Runnable runnable) {
        this.h();
        throw null;
    }

    @Override
    public final boolean g() {
        this.h();
        throw null;
    }

    public final void h() {
        block2: {
            String string;
            Throwable throwable;
            block4: {
                block3: {
                    String string2;
                    throwable = this.c;
                    if (throwable == null) break block2;
                    string = this.d;
                    if (string == null) break block3;
                    string = string2 = ". ".concat(string);
                    if (string2 != null) break block4;
                }
                string = "";
            }
            throw new IllegalStateException("Module with the Main dispatcher had failed to initialize".concat(string), throwable);
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    @Override
    public final String toString() {
        CharSequence charSequence;
        StringBuilder stringBuilder = new StringBuilder("Dispatchers.Main[missing");
        Throwable throwable = this.c;
        if (throwable != null) {
            charSequence = new StringBuilder(", cause=");
            ((StringBuilder)charSequence).append(throwable);
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = "";
        }
        stringBuilder.append((String)charSequence);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

