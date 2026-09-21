package com.github.catvod.spider.merge.F;

import java.util.Random;

/* loaded from: classes.dex */
public final class b extends ThreadLocal<Random> {
    @Override // java.lang.ThreadLocal
    public final Random initialValue() {
        return new Random();
    }
}
