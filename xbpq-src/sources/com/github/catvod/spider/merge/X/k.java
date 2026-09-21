package com.github.catvod.spider.merge.X;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;
import java.io.Writer;

@Deprecated
/* loaded from: classes.dex */
public final class k extends b {
    @Override // com.github.catvod.spider.merge.X.b
    public final int a(CharSequence charSequence, int i, Writer writer) {
        int i2;
        int i3;
        if (charSequence.charAt(i) != '\\' || (i2 = i + 1) >= charSequence.length() || charSequence.charAt(i2) != 'u') {
            return 0;
        }
        int i4 = 2;
        while (true) {
            i3 = i + i4;
            if (i3 >= charSequence.length() || charSequence.charAt(i3) != 'u') {
                break;
            }
            i4++;
        }
        if (i3 < charSequence.length() && charSequence.charAt(i3) == '+') {
            i4++;
        }
        int i5 = i + i4;
        int i6 = i5 + 4;
        if (i6 > charSequence.length()) {
            StringBuilder b = C0059d.b(cYh.d("2B353222772E0F312F71637A0F35397133330039352277330970343F3E3908342471213B0B25246B777D"));
            b.append((Object) charSequence.subSequence(i, charSequence.length()));
            b.append(cYh.d("40702524327A133F6134393E473F2771143206221234262F023E2234"));
            throw new IllegalArgumentException(b.toString());
        }
        CharSequence subSequence = charSequence.subSequence(i5, i6);
        try {
            writer.write((char) Integer.parseInt(subSequence.toString(), 16));
            return i4 + 4;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(cYh.d("323E20333B3F47242E71273B1523247122340E332E35327A11312D24326047") + ((Object) subSequence), e);
        }
    }
}
