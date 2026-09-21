/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u02b6;
import java.io.Writer;

@Deprecated
public class \u0627
extends \u02b6 {
    @Override
    public int \u0528(CharSequence charSequence, int n2, Writer appendable) {
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
                    stringBuilder.append(SOY.d("2F3C301418125A263E56041608213456011913313E1211570C333D03114D5A"));
                    stringBuilder.append((Object)charSequence);
                    throw new IllegalArgumentException(stringBuilder.toString(), numberFormatException);
                }
            }
            appendable = new StringBuilder();
            ((StringBuilder)appendable).append(SOY.d("36372205540312333F56405712372956101E1D3B2505541E147224181D141536345602161627344C5450"));
            ((StringBuilder)appendable).append((Object)charSequence.subSequence(n2, charSequence.length()));
            ((StringBuilder)appendable).append(SOY.d("5D72350311570E3D71131A135A3D3756371F1B20021305021F3C3213"));
            throw new IllegalArgumentException(((StringBuilder)appendable).toString());
        }
        return 0;
    }
}

