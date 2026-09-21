package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.cYh;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: com.github.catvod.spider.merge.Q.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0020k {
    private static final UUID b;
    private static final UUID c;
    private static final UUID d;
    private static final List<UUID> e;
    public static final UUID f;
    private final C0016g a = C0016g.a();

    static {
        UUID fromString = UUID.fromString(cYh.d("54637667661855146C666F18257D751063694A680361157753167413121F5F1100121169"));
        UUID fromString2 = UUID.fromString(cYh.d("56140061146F50146C67146A517D75626F1B4A690363607756600312156924157117616B"));
        b = fromString2;
        UUID fromString3 = UUID.fromString(cYh.d("261105136F1E50156C10121F217D7565666F4A11056315775F627165136C24167165651F"));
        c = fromString3;
        UUID fromString4 = UUID.fromString(cYh.d("52697763606D5F646C62151F527D7560601B4A12781415775F617260166D556877616F63"));
        d = fromString4;
        ArrayList arrayList = new ArrayList();
        e = arrayList;
        arrayList.add(fromString);
        arrayList.add(fromString2);
        arrayList.add(fromString3);
        arrayList.add(fromString4);
        f = fromString4;
    }

    private int c(char[] cArr, int i, List<com.github.catvod.spider.merge.S.j> list, InterfaceC0019j interfaceC0019j) {
        int i2 = i + 1;
        char c2 = cArr[i];
        for (int i3 = 0; i3 < c2; i3++) {
            char c3 = cArr[i2];
            int i4 = i2 + 1;
            com.github.catvod.spider.merge.S.j jVar = new com.github.catvod.spider.merge.S.j(new int[0]);
            list.add(jVar);
            int i5 = i4 + 1;
            if (cArr[i4] != 0) {
                jVar.a(-1);
            }
            i2 = i5;
            for (int i6 = 0; i6 < c3; i6++) {
                int a = interfaceC0019j.a(cArr, i2);
                int size = i2 + interfaceC0019j.size();
                int a2 = interfaceC0019j.a(cArr, size);
                i2 = size + interfaceC0019j.size();
                jVar.b(a, a2);
            }
        }
        return i2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<java.util.UUID>, java.util.ArrayList] */
    protected static boolean d(UUID uuid, UUID uuid2) {
        ?? r0 = e;
        int indexOf = r0.indexOf(uuid);
        return indexOf >= 0 && r0.indexOf(uuid2) >= indexOf;
    }

    protected static long e(char[] cArr, int i) {
        long j = (cArr[i] | (cArr[i + 1] << 16)) & 4294967295L;
        int i2 = i + 2;
        return (((cArr[i2 + 1] << 16) | cArr[i2]) << 32) | j;
    }

    protected final void a(boolean z) {
        if (!z) {
            throw new IllegalStateException((String) null);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:107:0x027a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0081. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0105  */
    /* JADX WARN: Type inference failed for: r11v22, types: [java.util.List<com.github.catvod.spider.merge.Q.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v23, types: [java.util.List<com.github.catvod.spider.merge.Q.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v24, types: [java.util.List<com.github.catvod.spider.merge.Q.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.util.List<com.github.catvod.spider.merge.Q.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.List<com.github.catvod.spider.merge.Q.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List<com.github.catvod.spider.merge.Q.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.List<com.github.catvod.spider.merge.Q.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List<com.github.catvod.spider.merge.Q.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.List<com.github.catvod.spider.merge.Q.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.List<com.github.catvod.spider.merge.Q.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.util.List<com.github.catvod.spider.merge.Q.t0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.util.List<com.github.catvod.spider.merge.Q.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.util.List<com.github.catvod.spider.merge.Q.v>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List<java.util.UUID>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.util.List<com.github.catvod.spider.merge.Q.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.util.List<com.github.catvod.spider.merge.Q.r0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v22, types: [java.util.List<com.github.catvod.spider.merge.Q.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v25, types: [java.util.List<com.github.catvod.spider.merge.Q.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v27, types: [java.util.List<com.github.catvod.spider.merge.Q.m>, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.github.catvod.spider.merge.Q.C0010a b(char[] r19) {
        /*
            Method dump skipped, instructions count: 1438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Q.C0020k.b(char[]):com.github.catvod.spider.merge.Q.a");
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x00fe, code lost:
    
        if (r0.g < 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0109, code lost:
    
        if ((r0 instanceof com.github.catvod.spider.merge.Q.e0) == false) goto L88;
     */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List<com.github.catvod.spider.merge.Q.m>, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void f(com.github.catvod.spider.merge.Q.C0010a r7) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Q.C0020k.f(com.github.catvod.spider.merge.Q.a):void");
    }
}
