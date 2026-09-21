/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u02b6;
import java.io.Writer;
import java.util.HashMap;
import java.util.HashSet;

@Deprecated
public class \u10fc
extends \u02b6 {
    private final HashMap<String, String> \u0528 = new HashMap();
    private final HashSet<Character> \u0529 = new HashSet();
    private final int \u052a;
    private final int \u052b;

    public \u10fc(CharSequence[] ... charSequenceArray) {
        int n2;
        int n3 = 0;
        int n4 = n2 = Integer.MAX_VALUE;
        if (charSequenceArray != null) {
            int n5 = charSequenceArray.length;
            n4 = 0;
            for (n3 = 0; n3 < n5; ++n3) {
                CharSequence[] charSequenceArray2 = charSequenceArray[n3];
                this.\u0528.put(charSequenceArray2[0].toString(), charSequenceArray2[1].toString());
                this.\u0529.add(Character.valueOf(charSequenceArray2[0].charAt(0)));
                int n6 = charSequenceArray2[0].length();
                int n7 = n2;
                if (n6 < n2) {
                    n7 = n6;
                }
                int n8 = n4;
                if (n6 > n4) {
                    n8 = n6;
                }
                n2 = n7;
                n4 = n8;
            }
            n3 = n4;
            n4 = n2;
        }
        this.\u052a = n4;
        this.\u052b = n3;
    }

    @Override
    public int \u0528(CharSequence charSequence, int n2, Writer writer) {
        if (this.\u0529.contains(Character.valueOf(charSequence.charAt(n2)))) {
            int n3;
            int n4 = n3 = this.\u052b;
            if (n2 + n3 > charSequence.length()) {
                n4 = charSequence.length() - n2;
            }
            while (n4 >= this.\u052a) {
                CharSequence charSequence2 = charSequence.subSequence(n2, n2 + n4);
                if ((charSequence2 = this.\u0528.get(charSequence2.toString())) != null) {
                    writer.write((String)charSequence2);
                    return n4;
                }
                --n4;
            }
        }
        return 0;
    }
}

