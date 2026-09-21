/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.T0;

import com.github.catvod.spider.merge.T0.b;
import java.io.Writer;
import java.util.HashMap;
import java.util.HashSet;

@Deprecated
public final class f
extends b {
    private final HashMap<String, String> b = new HashMap();
    private final HashSet<Character> c = new HashSet();
    private final int d;
    private final int e;

    public f(CharSequence[] ... charSequenceArray) {
        int n2 = charSequenceArray.length;
        int n3 = Integer.MAX_VALUE;
        int n4 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            CharSequence[] charSequenceArray2 = charSequenceArray[i2];
            this.b.put(charSequenceArray2[0].toString(), charSequenceArray2[1].toString());
            this.c.add(Character.valueOf(charSequenceArray2[0].charAt(0)));
            int n5 = charSequenceArray2[0].length();
            int n6 = n3;
            if (n5 < n3) {
                n6 = n5;
            }
            int n7 = n4;
            if (n5 > n4) {
                n7 = n5;
            }
            n3 = n6;
            n4 = n7;
        }
        this.d = n3;
        this.e = n4;
    }

    @Override
    public final int a(CharSequence charSequence, int n2, Writer writer) {
        if (this.c.contains(Character.valueOf(charSequence.charAt(n2)))) {
            int n3;
            int n4 = n3 = this.e;
            if (n2 + n3 > charSequence.length()) {
                n4 = charSequence.length() - n2;
            }
            while (n4 >= this.d) {
                CharSequence charSequence2 = charSequence.subSequence(n2, n2 + n4);
                if ((charSequence2 = this.b.get(charSequence2.toString())) != null) {
                    writer.write((String)charSequence2);
                    return n4;
                }
                --n4;
            }
        }
        return 0;
    }
}

