package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.cYh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.y.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0255c extends C0257e {
    public static byte[] b(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        com.github.catvod.spider.merge.E.f.e(bArr, cYh.d("5B2429382464"));
        com.github.catvod.spider.merge.E.f.e(bArr2, cYh.d("033532253E340624283E39"));
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    public static byte[] c(byte[] bArr, int i, int i2) {
        com.github.catvod.spider.merge.E.f.e(bArr, cYh.d("5B2429382464"));
        C0256d.a(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        com.github.catvod.spider.merge.E.f.d(copyOfRange, cYh.d("043F3128183C35312F363272133828227B7A01222E3C1E340335397D772E08192F3532224E"));
        return copyOfRange;
    }

    public static Object[] d(Object[] objArr, int i, int i2) {
        com.github.catvod.spider.merge.E.f.e(objArr, cYh.d("5B2429382464"));
        C0256d.a(i2, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
        com.github.catvod.spider.merge.E.f.d(copyOfRange, cYh.d("043F3128183C35312F363272133828227B7A01222E3C1E340335397D772E08192F3532224E"));
        return copyOfRange;
    }

    public static List e(Object[] objArr) {
        com.github.catvod.spider.merge.E.f.e(objArr, cYh.d("5B2429382464"));
        return new ArrayList(new C0254b(objArr, false));
    }
}
