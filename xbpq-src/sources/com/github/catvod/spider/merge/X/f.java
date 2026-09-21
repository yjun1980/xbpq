package com.github.catvod.spider.merge.X;

import java.io.Writer;
import java.util.HashMap;
import java.util.HashSet;

@Deprecated
/* loaded from: classes.dex */
public final class f extends b {
    private final HashMap<String, String> b = new HashMap<>();
    private final HashSet<Character> c = new HashSet<>();
    private final int d;
    private final int e;

    public f(CharSequence[]... charSequenceArr) {
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        for (CharSequence[] charSequenceArr2 : charSequenceArr) {
            this.b.put(charSequenceArr2[0].toString(), charSequenceArr2[1].toString());
            this.c.add(Character.valueOf(charSequenceArr2[0].charAt(0)));
            int length = charSequenceArr2[0].length();
            i = length < i ? length : i;
            if (length > i2) {
                i2 = length;
            }
        }
        this.d = i;
        this.e = i2;
    }

    @Override // com.github.catvod.spider.merge.X.b
    public final int a(CharSequence charSequence, int i, Writer writer) {
        if (!this.c.contains(Character.valueOf(charSequence.charAt(i)))) {
            return 0;
        }
        int i2 = this.e;
        if (i + i2 > charSequence.length()) {
            i2 = charSequence.length() - i;
        }
        while (i2 >= this.d) {
            String str = this.b.get(charSequence.subSequence(i, i + i2).toString());
            if (str != null) {
                writer.write(str);
                return i2;
            }
            i2--;
        }
        return 0;
    }
}
