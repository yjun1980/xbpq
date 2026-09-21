package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.cYh;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: com.github.catvod.spider.merge.n.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0213l implements PrivilegedExceptionAction<Unsafe> {
    @Override // java.security.PrivilegedExceptionAction
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Unsafe run() {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError(cYh.d("13382471023414312734"));
    }
}
