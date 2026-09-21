package com.github.catvod.spider.merge.E;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
public final /* synthetic */ class e {
    public static /* synthetic */ void a(int i, String str) {
        if (i != 0) {
            return;
        }
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        NullPointerException nullPointerException = new NullPointerException(cYh.d("373133303A3F13353371242A023328373E3F037020227734083E6C3F22360B7028227734123C2D6B77370224293E337A") + stackTraceElement.getClassName() + cYh.d("49") + stackTraceElement.getMethodName() + cYh.d("4B703130253B0A353534257A") + str);
        f.g(nullPointerException);
        throw nullPointerException;
    }
}
