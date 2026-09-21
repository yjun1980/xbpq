/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E;

import com.github.catvod.spider.merge.E.f;
import com.github.catvod.spider.merge.cYh;
import java.io.Serializable;

public final class e {
    public static /* synthetic */ void a(int n2, String object) {
        if (n2 != 0) {
            return;
        }
        Serializable serializable = Thread.currentThread().getStackTrace()[4];
        String string = ((StackTraceElement)serializable).getClassName();
        String string2 = ((StackTraceElement)serializable).getMethodName();
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append(cYh.d("373133303A3F13353371242A023328373E3F037020227734083E6C3F22360B7028227734123C2D6B77370224293E337A"));
        ((StringBuilder)serializable).append(string);
        ((StringBuilder)serializable).append(cYh.d("49"));
        ((StringBuilder)serializable).append(string2);
        ((StringBuilder)serializable).append(cYh.d("4B703130253B0A353534257A"));
        ((StringBuilder)serializable).append((String)object);
        object = new NullPointerException(((StringBuilder)serializable).toString());
        f.g(object);
        throw object;
    }
}

