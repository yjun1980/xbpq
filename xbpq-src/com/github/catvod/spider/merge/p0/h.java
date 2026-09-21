/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.p0;

import com.github.catvod.spider.merge.p0.d;

final class h
implements d {
    h() {
    }

    @Override
    public final char[] a(char[] cArray, String object) {
        int n2 = Integer.parseInt((String)object);
        int n3 = cArray.length - n2;
        object = new char[n3];
        System.arraycopy(cArray, 0, object, 0, n2);
        System.arraycopy(cArray, n2 * 2, object, n2, n3 - n2);
        return object;
    }
}

