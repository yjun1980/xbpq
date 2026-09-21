/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.by.l;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.s0.h;
import java.util.concurrent.CancellationException;

public final class p {
    public final Object a;
    public final h b;
    public final l c;
    public final Object d;
    public final Throwable e;

    public p(Object object, h h2, l l2, Object object2, Throwable throwable) {
        this.a = object;
        this.b = h2;
        this.c = l2;
        this.d = object2;
        this.e = throwable;
    }

    public /* synthetic */ p(Object object, h h2, l l2, CancellationException cancellationException, int n2) {
        if ((n2 & 2) != 0) {
            h2 = null;
        }
        if ((n2 & 4) != 0) {
            l2 = null;
        }
        if ((n2 & 0x10) != 0) {
            cancellationException = null;
        }
        this(object, h2, l2, null, cancellationException);
    }

    public static p a(p p2, h h2, CancellationException throwable, int n2) {
        Object object = p2.a;
        if ((n2 & 2) != 0) {
            h2 = p2.b;
        }
        l l2 = p2.c;
        Object object2 = p2.d;
        if ((n2 & 0x10) != 0) {
            throwable = p2.e;
        }
        p2.getClass();
        return new p(object, h2, l2, object2, throwable);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof p)) {
            return false;
        }
        p p2 = (p)object;
        object = p2.a;
        if (!i.a(this.a, object)) {
            return false;
        }
        if (!i.a(this.b, p2.b)) {
            return false;
        }
        if (!i.a(this.c, p2.c)) {
            return false;
        }
        if (!i.a(this.d, p2.d)) {
            return false;
        }
        return i.a(this.e, p2.e);
    }

    public final int hashCode() {
        int n2 = 0;
        Object object = this.a;
        int n3 = object == null ? 0 : object.hashCode();
        object = this.b;
        int n4 = object == null ? 0 : object.hashCode();
        object = this.c;
        int n5 = object == null ? 0 : object.hashCode();
        object = this.d;
        int n6 = object == null ? 0 : object.hashCode();
        object = this.e;
        if (object != null) {
            n2 = object.hashCode();
        }
        return (((n3 * 31 + n4) * 31 + n5) * 31 + n6) * 31 + n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CompletedContinuation(result=");
        stringBuilder.append(this.a);
        stringBuilder.append(", cancelHandler=");
        stringBuilder.append(this.b);
        stringBuilder.append(", onCancellation=");
        stringBuilder.append(this.c);
        stringBuilder.append(", idempotentResume=");
        stringBuilder.append(this.d);
        stringBuilder.append(", cancelCause=");
        stringBuilder.append(this.e);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

