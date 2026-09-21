/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.B.b;
import com.github.catvod.spider.merge.C.v;
import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.D.h0;
import com.github.catvod.spider.merge.D.p;
import java.lang.reflect.Type;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Objects;

public final class q
implements X,
v {
    public static final q a = new q();

    @Override
    public final <T> T c(b object, Type type, Object object2) {
        Objects.requireNonNull((p)((b)object).t((Type)((Object)p.class), null));
        object = ByteBuffer.wrap(null);
        ((ByteBuffer)object).limit(0);
        ((ByteBuffer)object).position(0);
        return (T)object;
    }

    @Override
    public final void d(L object, Object object2, Object object3, Type type, int n2) {
        object2 = (ByteBuffer)object2;
        object3 = ((ByteBuffer)object2).array();
        object = ((L)object).j;
        ((h0)object).write(123);
        ((h0)object).j("array");
        ((h0)object).h((byte[])object3);
        ((h0)object).k(',', "limit", ((Buffer)object2).limit());
        ((h0)object).k(',', "position", ((Buffer)object2).position());
        ((h0)object).write(125);
    }

    @Override
    public final int e() {
        return 14;
    }
}

