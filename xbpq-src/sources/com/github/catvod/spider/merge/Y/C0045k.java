package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;
import java.text.ParsePosition;
import java.util.Calendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.Y.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0045k extends AbstractC0049o {
    private final String a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0045k(String str) {
        super(null);
        this.a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.Y.AbstractC0049o
    public final boolean b(t tVar, Calendar calendar, String str, ParsePosition parsePosition, int i) {
        for (int i2 = 0; i2 < this.a.length(); i2++) {
            int index = parsePosition.getIndex() + i2;
            if (index == str.length()) {
                parsePosition.setErrorIndex(index);
                return false;
            }
            if (this.a.charAt(i2) != str.charAt(index)) {
                parsePosition.setErrorIndex(index);
                return false;
            }
        }
        parsePosition.setIndex(parsePosition.getIndex() + this.a.length());
        return true;
    }

    public final String toString() {
        return com.github.catvod.spider.merge.b.n.b(C0059d.b(cYh.d("243F3128062F08242435042E153135343023470B273E2537062407383236036D")), this.a, cYh.d("3A"));
    }
}
