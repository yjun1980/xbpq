package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.y.AbstractC0266n;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b extends AbstractC0266n {
    private final int a;
    private final int b;
    private boolean c;
    private int d;

    public b(int i, int i2, int i3) {
        this.a = i3;
        this.b = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.c = z;
        this.d = z ? i : i2;
    }

    @Override // com.github.catvod.spider.merge.y.AbstractC0266n
    public final int a() {
        int i = this.d;
        if (i != this.b) {
            this.d = this.a + i;
        } else {
            if (!this.c) {
                throw new NoSuchElementException();
            }
            this.c = false;
        }
        return i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }
}
