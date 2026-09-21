/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u02b6;
import java.io.Writer;

@Deprecated
public class \u02b7
extends \u02b6 {
    private boolean \u052c(char c2) {
        boolean bl = c2 >= '0' && c2 <= '7';
        return bl;
    }

    private boolean \u052d(char c2) {
        boolean bl = c2 >= '0' && c2 <= '3';
        return bl;
    }

    @Override
    public int \u0528(CharSequence charSequence, int n2, Writer writer) {
        int n3;
        int n4 = charSequence.length() - n2 - 1;
        StringBuilder stringBuilder = new StringBuilder();
        if (charSequence.charAt(n2) == '\\' && n4 > 0 && this.\u052c(charSequence.charAt(n3 = n2 + 1))) {
            int n5 = n2 + 2;
            n2 += 3;
            stringBuilder.append(charSequence.charAt(n3));
            if (n4 > 1 && this.\u052c(charSequence.charAt(n5))) {
                stringBuilder.append(charSequence.charAt(n5));
                if (n4 > 2 && this.\u052d(charSequence.charAt(n3)) && this.\u052c(charSequence.charAt(n2))) {
                    stringBuilder.append(charSequence.charAt(n2));
                }
            }
            writer.write(Integer.parseInt(stringBuilder.toString(), 8));
            return stringBuilder.length() + 1;
        }
        return 0;
    }
}

