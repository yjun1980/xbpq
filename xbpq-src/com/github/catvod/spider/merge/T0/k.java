/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.T0;

import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.T0.b;
import java.io.Writer;

@Deprecated
public final class k
extends b {
    @Override
    public final int a(CharSequence charSequence, int n2, Writer appendable) {
        int n3;
        if (charSequence.charAt(n2) == '\\' && (n3 = n2 + 1) < charSequence.length() && charSequence.charAt(n3) == 'u') {
            int n4;
            n3 = 2;
            while ((n4 = n2 + n3) < charSequence.length() && charSequence.charAt(n4) == 'u') {
                ++n3;
            }
            int n5 = n3;
            if (n4 < charSequence.length()) {
                n5 = n3;
                if (charSequence.charAt(n4) == '+') {
                    n5 = n3 + 1;
                }
            }
            if ((n4 = (n3 = n2 + n5) + 4) <= charSequence.length()) {
                charSequence = charSequence.subSequence(n3, n4);
                try {
                    ((Writer)appendable).write((char)Integer.parseInt(charSequence.toString(), 16));
                    return n5 + 4;
                }
                catch (NumberFormatException numberFormatException) {
                    appendable = new StringBuilder();
                    ((StringBuilder)appendable).append("Unable to parse unicode value: ");
                    ((StringBuilder)appendable).append((Object)charSequence);
                    throw new IllegalArgumentException(((StringBuilder)appendable).toString(), numberFormatException);
                }
            }
            appendable = com.github.catvod.spider.merge.C.a.c("Less than 4 hex digits in unicode value: '");
            ((StringBuilder)appendable).append((Object)charSequence.subSequence(n2, charSequence.length()));
            ((StringBuilder)appendable).append("' due to end of CharSequence");
            throw new IllegalArgumentException(((StringBuilder)appendable).toString());
        }
        return 0;
    }
}

