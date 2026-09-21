package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.d0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0103w extends A {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0103w() {
        super(cYh.d("2E3E033E3323"), 6, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0411, code lost:
    
        if (r41.a().d0().equals(r11) == false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0413, code lost:
    
        r41.n(r39);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0416, code lost:
    
        r41.V(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01bf, code lost:
    
        if (r41.d(r13) != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0213, code lost:
    
        if (r41.a().d0().equals(r11) == false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0274, code lost:
    
        if (r41.a().d0().equals(r11) == false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x02a2, code lost:
    
        if (r41.a().d0().equals(r11) == false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0190, code lost:
    
        if (r11.equals(r12) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0bd0, code lost:
    
        if (com.github.catvod.spider.merge.b0.b.b(r1, com.github.catvod.spider.merge.d0.C0109z.q) != false) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x07e8, code lost:
    
        if (r6.G(r0).c(com.github.catvod.spider.merge.cYh.d("13293134")).equalsIgnoreCase(com.github.catvod.spider.merge.cYh.d("0F3925353234")) == false) goto L569;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x09ae, code lost:
    
        if (r6.w(r0) != false) goto L533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0a3d, code lost:
    
        r6.d(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x0a3b, code lost:
    
        if (r6.w(r0) != false) goto L533;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:241:0x06ac. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x01a1. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03c6 A[LOOP:3: B:99:0x03c4->B:100:0x03c6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x030b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0379  */
    @Override // com.github.catvod.spider.merge.d0.A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(com.github.catvod.spider.merge.d0.O r40, com.github.catvod.spider.merge.d0.C0062b r41) {
        /*
            Method dump skipped, instructions count: 3352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.d0.C0103w.d(com.github.catvod.spider.merge.d0.O, com.github.catvod.spider.merge.d0.b):boolean");
    }

    final boolean e(O o, C0062b c0062b) {
        o.getClass();
        String str = ((L) o).c;
        ArrayList<com.github.catvod.spider.merge.c0.l> arrayList = c0062b.e;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            com.github.catvod.spider.merge.c0.l lVar = arrayList.get(size);
            if (lVar.d0().equals(str)) {
                c0062b.q(str);
                if (!str.equals(c0062b.a().d0())) {
                    c0062b.n(this);
                }
                c0062b.V(str);
            } else {
                if (c0062b.O(lVar)) {
                    c0062b.n(this);
                    return false;
                }
                size--;
            }
        }
        return true;
    }
}
