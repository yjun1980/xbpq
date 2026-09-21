/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.U;

public final class a {
    static int a(CharSequence charSequence, CharSequence charSequence2, int n2) {
        if (charSequence instanceof String) {
            return ((String)charSequence).indexOf(charSequence2.toString(), n2);
        }
        if (charSequence instanceof StringBuilder) {
            return ((StringBuilder)charSequence).indexOf(charSequence2.toString(), n2);
        }
        if (charSequence instanceof StringBuffer) {
            return ((StringBuffer)charSequence).indexOf(charSequence2.toString(), n2);
        }
        return charSequence.toString().indexOf(charSequence2.toString(), n2);
    }

    static boolean b(CharSequence charSequence, boolean bl, int n2, CharSequence charSequence2, int n3) {
        if (charSequence instanceof String && charSequence2 instanceof String) {
            return ((String)charSequence).regionMatches(bl, n2, (String)charSequence2, 0, n3);
        }
        int n4 = charSequence.length();
        int n5 = charSequence2.length();
        if (n2 >= 0 && n3 >= 0 && n4 - n2 >= n3 && n5 - 0 >= n3) {
            n5 = 0;
            while (n3 > 0) {
                char c2;
                char c3 = charSequence.charAt(n2);
                if (c3 != (c2 = charSequence2.charAt(n5))) {
                    if (!bl) {
                        return false;
                    }
                    if ((c3 = Character.toUpperCase(c3)) != (c2 = Character.toUpperCase(c2)) && Character.toLowerCase(c3) != Character.toLowerCase(c2)) {
                        return false;
                    }
                }
                ++n2;
                --n3;
                ++n5;
            }
            return true;
        }
        return false;
    }
}

