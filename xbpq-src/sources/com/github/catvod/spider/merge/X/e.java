package com.github.catvod.spider.merge.X;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;
import java.io.Writer;
import java.util.Locale;

@Deprecated
/* loaded from: classes.dex */
public final class e extends c {
    private final int b = 32;
    private final int c = 127;

    @Override // com.github.catvod.spider.merge.X.c
    public final boolean b(int i, Writer writer) {
        if (i >= this.b && i <= this.c) {
            return false;
        }
        String d = cYh.d("3B25");
        if (i <= 65535) {
            writer.write(d);
            char[] cArr = b.a;
            writer.write(cArr[(i >> 12) & 15]);
            writer.write(cArr[(i >> 8) & 15]);
            writer.write(cArr[(i >> 4) & 15]);
            writer.write(cArr[i & 15]);
            return true;
        }
        char[] chars = Character.toChars(i);
        StringBuilder b = C0059d.b(d);
        String hexString = Integer.toHexString(chars[0]);
        Locale locale = Locale.ENGLISH;
        b.append(hexString.toUpperCase(locale));
        b.append(d);
        b.append(Integer.toHexString(chars[1]).toUpperCase(locale));
        writer.write(b.toString());
        return true;
    }
}
