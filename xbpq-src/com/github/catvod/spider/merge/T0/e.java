/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.T0;

import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.T0.b;
import com.github.catvod.spider.merge.T0.c;
import java.io.Writer;
import java.util.Locale;

@Deprecated
public final class e
extends c {
    private final int b;
    private final int c;

    public e() {
        this.b = 32;
        this.c = 127;
    }

    @Override
    public final boolean b(int n2, Writer writer) {
        int n3 = this.b;
        boolean bl = true;
        if (n2 >= n3 && n2 <= this.c) {
            bl = false;
        } else if (n2 > 65535) {
            char[] cArray = Character.toChars(n2);
            StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("\\u");
            String string = Integer.toHexString(cArray[0]);
            Locale locale = Locale.ENGLISH;
            stringBuilder.append(string.toUpperCase(locale));
            stringBuilder.append("\\u");
            stringBuilder.append(Integer.toHexString(cArray[1]).toUpperCase(locale));
            writer.write(stringBuilder.toString());
        } else {
            writer.write("\\u");
            char[] cArray = com.github.catvod.spider.merge.T0.b.a;
            writer.write(cArray[n2 >> 12 & 0xF]);
            writer.write(cArray[n2 >> 8 & 0xF]);
            writer.write(cArray[n2 >> 4 & 0xF]);
            writer.write(cArray[n2 & 0xF]);
        }
        return bl;
    }
}

