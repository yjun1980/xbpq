package com.github.catvod.spider.merge.Q;

/* renamed from: com.github.catvod.spider.merge.Q.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0018i implements InterfaceC0019j {
    @Override // com.github.catvod.spider.merge.Q.InterfaceC0019j
    public final int a(char[] cArr, int i) {
        return (cArr[i + 1] << 16) | cArr[i];
    }

    @Override // com.github.catvod.spider.merge.Q.InterfaceC0019j
    public final int size() {
        return 2;
    }
}
