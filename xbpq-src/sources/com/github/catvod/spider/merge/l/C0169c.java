package com.github.catvod.spider.merge.l;

import com.github.catvod.spider.merge.cYh;

/* renamed from: com.github.catvod.spider.merge.l.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0169c extends AbstractC0168b {
    private final char a = ',';

    @Override // com.github.catvod.spider.merge.l.AbstractC0173g
    public final boolean b(char c) {
        return c == this.a;
    }

    public final String toString() {
        char c = this.a;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = cYh.d("57617362636F51677968161824140417").charAt(c & 15);
            c = (char) (c >> 4);
        }
        String copyValueOf = String.copyValueOf(cArr);
        StringBuilder sb = new StringBuilder(String.valueOf(copyValueOf).length() + 18);
        sb.append(cYh.d("243820231A3B1333293425740E236976"));
        sb.append(copyValueOf);
        sb.append(cYh.d("4079"));
        return sb.toString();
    }
}
