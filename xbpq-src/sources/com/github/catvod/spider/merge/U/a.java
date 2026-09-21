package com.github.catvod.spider.merge.U;

/* loaded from: classes.dex */
public final class a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(CharSequence charSequence, CharSequence charSequence2, int i) {
        return charSequence instanceof String ? ((String) charSequence).indexOf(charSequence2.toString(), i) : charSequence instanceof StringBuilder ? ((StringBuilder) charSequence).indexOf(charSequence2.toString(), i) : charSequence instanceof StringBuffer ? ((StringBuffer) charSequence).indexOf(charSequence2.toString(), i) : charSequence.toString().indexOf(charSequence2.toString(), i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(CharSequence charSequence, boolean z, int i, CharSequence charSequence2, int i2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return ((String) charSequence).regionMatches(z, i, (String) charSequence2, 0, i2);
        }
        int length = charSequence.length() - i;
        int length2 = charSequence2.length() - 0;
        if (i < 0 || i2 < 0 || length < i2 || length2 < i2) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            if (i2 <= 0) {
                return true;
            }
            int i5 = i + 1;
            char charAt = charSequence.charAt(i);
            int i6 = i3 + 1;
            char charAt2 = charSequence2.charAt(i3);
            if (charAt != charAt2) {
                if (!z) {
                    return false;
                }
                char upperCase = Character.toUpperCase(charAt);
                char upperCase2 = Character.toUpperCase(charAt2);
                if (upperCase != upperCase2 && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                    return false;
                }
            }
            i = i5;
            i2 = i4;
            i3 = i6;
        }
    }
}
