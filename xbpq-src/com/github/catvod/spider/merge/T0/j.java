/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.T0;

import com.github.catvod.spider.merge.T0.b;
import java.io.Writer;

@Deprecated
public final class j
extends b {
    private boolean b(char c2) {
        boolean bl = c2 >= '0' && c2 <= '7';
        return bl;
    }

    @Override
    public final int a(CharSequence charSequence, int n2, Writer writer) {
        int n3;
        int n4 = charSequence.length() - n2 - 1;
        StringBuilder stringBuilder = new StringBuilder();
        int n5 = charSequence.charAt(n2);
        int n6 = 0;
        if (n5 == 92 && n4 > 0 && this.b(charSequence.charAt(n3 = n2 + 1))) {
            int n7 = n2 + 2;
            n5 = n2 + 3;
            stringBuilder.append(charSequence.charAt(n3));
            if (n4 > 1 && this.b(charSequence.charAt(n7))) {
                stringBuilder.append(charSequence.charAt(n7));
                if (n4 > 2) {
                    n4 = charSequence.charAt(n3);
                    n2 = n6;
                    if (n4 >= 48) {
                        n2 = n6;
                        if (n4 <= 51) {
                            n2 = 1;
                        }
                    }
                    if (n2 != 0 && this.b(charSequence.charAt(n5))) {
                        stringBuilder.append(charSequence.charAt(n5));
                    }
                }
            }
            writer.write(Integer.parseInt(stringBuilder.toString(), 8));
            return stringBuilder.length() + 1;
        }
        return 0;
    }
}

