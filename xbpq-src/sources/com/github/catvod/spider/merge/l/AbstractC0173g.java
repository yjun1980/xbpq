package com.github.catvod.spider.merge.l;

/* renamed from: com.github.catvod.spider.merge.l.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0173g {
    public int a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        C0179m.d(i, length);
        while (i < length) {
            if (b(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public abstract boolean b(char c);
}
