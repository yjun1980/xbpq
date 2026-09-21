/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.R0;

import com.github.catvod.spider.merge.R0.e;
import java.io.Writer;

final class b
extends com.github.catvod.spider.merge.T0.b {
    private static final String b = String.valueOf('\"');
    private static final char[] c = new char[]{',', '\"', '\r', '\n'};

    @Override
    public final int a(CharSequence charSequence, int n2, Writer writer) {
        if (n2 == 0) {
            Object object;
            CharSequence charSequence2;
            block6: {
                charSequence2 = charSequence.toString();
                object = c;
                n2 = e.a;
                if (charSequence2 != null && object != null) {
                    int n3 = ((String)charSequence2).length();
                    int n4 = ((char[])object).length;
                    for (n2 = 0; n2 < n3; ++n2) {
                        char c2 = ((String)charSequence2).charAt(n2);
                        for (int i2 = 0; i2 < n4; ++i2) {
                            if (object[i2] != c2 || Character.isHighSurrogate(c2) && i2 != n4 - 1 && (n2 >= n3 - 1 || object[i2 + 1] != ((String)charSequence2).charAt(n2 + 1))) continue;
                            n2 = 0;
                            break block6;
                        }
                    }
                }
                n2 = 1;
            }
            if (n2 != 0) {
                writer.write(charSequence.toString());
            } else {
                writer.write(34);
                String string = charSequence.toString();
                object = b;
                charSequence2 = new StringBuilder();
                ((StringBuilder)charSequence2).append((String)object);
                ((StringBuilder)charSequence2).append((String)object);
                writer.write(e.g(string, (String)object, ((StringBuilder)charSequence2).toString()));
                writer.write(34);
            }
            return Character.codePointCount(charSequence, 0, charSequence.length());
        }
        throw new IllegalStateException("CsvEscaper should never reach the [1] index");
    }
}

