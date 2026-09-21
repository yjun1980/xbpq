package com.github.catvod.spider.merge.U;

import com.github.catvod.spider.merge.cYh;
import java.io.Writer;

/* loaded from: classes.dex */
final class e extends com.github.catvod.spider.merge.X.b {
    private static final String b = String.valueOf('\"');
    private static final char[] c = {',', '\"', '\r', '\n'};

    @Override // com.github.catvod.spider.merge.X.b
    public final int a(CharSequence charSequence, int i, Writer writer) {
        boolean z;
        if (i != 0) {
            throw new IllegalStateException(cYh.d("2423371424390620242377290F3F343D337A09353734257A153520323F7A133824710C6B3A70283F333F1F"));
        }
        String charSequence2 = charSequence.toString();
        char[] cArr = c;
        int i2 = h.a;
        if (charSequence2 != null && cArr != null) {
            int length = charSequence2.length();
            int i3 = length - 1;
            int length2 = cArr.length;
            int i4 = length2 - 1;
            loop0: for (int i5 = 0; i5 < length; i5++) {
                char charAt = charSequence2.charAt(i5);
                for (int i6 = 0; i6 < length2; i6++) {
                    if (cArr[i6] == charAt && (!Character.isHighSurrogate(charAt) || i6 == i4 || (i5 < i3 && cArr[i6 + 1] == charSequence2.charAt(i5 + 1)))) {
                        z = false;
                        break loop0;
                    }
                }
            }
        }
        z = true;
        if (z) {
            writer.write(charSequence.toString());
        } else {
            writer.write(34);
            String charSequence3 = charSequence.toString();
            String str = b;
            writer.write(h.h(charSequence3, str, str + str));
            writer.write(34);
        }
        return Character.codePointCount(charSequence, 0, charSequence.length());
    }
}
