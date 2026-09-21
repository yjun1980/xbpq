/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.s0.D;
import com.github.catvod.spider.merge.xc.s0.c0;
import com.github.catvod.spider.merge.xc.s0.s;
import java.util.concurrent.CancellationException;

public final class d0
extends CancellationException
implements s {
    public final transient c0 a;

    public d0(String string, Throwable throwable, c0 c02) {
        super(string);
        this.a = c02;
        if (throwable != null) {
            this.initCause(throwable);
        }
    }

    public final boolean equals(Object object) {
        boolean bl = object == this || object instanceof d0 && i.a(((Throwable)(object = (d0)object)).getMessage(), this.getMessage()) && i.a(((d0)object).a, this.a) && i.a(((Throwable)object).getCause(), this.getCause());
        return bl;
    }

    @Override
    public final Throwable fillInStackTrace() {
        if (D.a) {
            return super.fillInStackTrace();
        }
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        Object object = this.getMessage();
        i.b(object);
        int n2 = ((String)object).hashCode();
        int n3 = this.a.hashCode();
        object = this.getCause();
        int n4 = object != null ? object.hashCode() : 0;
        return (n3 + n2 * 31) * 31 + n4;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("; job=");
        stringBuilder.append(this.a);
        return stringBuilder.toString();
    }
}

