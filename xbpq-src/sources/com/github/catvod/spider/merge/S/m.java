package com.github.catvod.spider.merge.S;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class m extends CancellationException {
    public m(Throwable th) {
        initCause(th);
    }
}
