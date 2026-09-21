package com.github.catvod.spider.merge.Y;

import java.util.Arrays;

/* loaded from: classes.dex */
final class P {
    private final Object[] a;
    private final int b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public P(Object... objArr) {
        this.a = objArr;
        this.b = Arrays.hashCode(objArr) + 31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && P.class == obj.getClass()) {
            return Arrays.deepEquals(this.a, ((P) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
