/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.X;

import com.github.catvod.spider.merge.X.b;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.d;
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
            if ((n3 = (n4 = n2 + n5) + 4) <= charSequence.length()) {
                charSequence = charSequence.subSequence(n4, n3);
                try {
                    ((Writer)appendable).write((char)Integer.parseInt(charSequence.toString(), 16));
                    return n5 + 4;
                }
                catch (NumberFormatException numberFormatException) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(cYh.d("323E20333B3F47242E71273B1523247122340E332E35327A11312D24326047"));
                    stringBuilder.append((Object)charSequence);
                    throw new IllegalArgumentException(stringBuilder.toString(), numberFormatException);
                }
            }
            appendable = d.b(cYh.d("2B353222772E0F312F71637A0F35397133330039352277330970343F3E3908342471213B0B25246B777D"));
            ((StringBuilder)appendable).append((Object)charSequence.subSequence(n2, charSequence.length()));
            ((StringBuilder)appendable).append(cYh.d("40702524327A133F6134393E473F2771143206221234262F023E2234"));
            throw new IllegalArgumentException(((StringBuilder)appendable).toString());
        }
        return 0;
    }
}

