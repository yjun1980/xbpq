package com.github.catvod.spider.merge.K;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
public final class d extends j {
    public static int g(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return ((String) charSequence).indexOf(c, i);
    }

    public static String h(String str, String str2, String str3) {
        int c = i.c(str, str2, 0, false);
        if (c < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, c);
            sb.append(str3);
            i2 = c + length;
            if (c >= str.length()) {
                break;
            }
            c = i.c(str, str2, c + i, false);
        } while (c > 0);
        sb.append((CharSequence) str, i2, str.length());
        String sb2 = sb.toString();
        com.github.catvod.spider.merge.E.f.d(sb2, cYh.d("14243338393D2525283D333F157E2021273F093469253F33147C61387B7A0B352F3623324E7E353E042E15392F367F73"));
        return sb2;
    }
}
