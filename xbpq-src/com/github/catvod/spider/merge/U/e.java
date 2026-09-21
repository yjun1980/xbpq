/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.U;

import com.github.catvod.spider.merge.U.h;
import com.github.catvod.spider.merge.X.b;
import com.github.catvod.spider.merge.cYh;
import java.io.Writer;

final class e
extends b {
    private static final String b = String.valueOf('\"');
    private static final char[] c = new char[]{',', '\"', '\r', '\n'};

    @Override
    public final int a(CharSequence object, int n2, Writer writer) {
        if (n2 == 0) {
            Object object2;
            CharSequence charSequence;
            block6: {
                charSequence = object.toString();
                object2 = c;
                n2 = h.a;
                if (charSequence != null && object2 != null) {
                    int n3 = ((String)charSequence).length();
                    int n4 = ((char[])object2).length;
                    for (n2 = 0; n2 < n3; ++n2) {
                        char c2 = ((String)charSequence).charAt(n2);
                        for (int i2 = 0; i2 < n4; ++i2) {
                            if (object2[i2] != c2 || Character.isHighSurrogate(c2) && i2 != n4 - 1 && (n2 >= n3 - 1 || object2[i2 + 1] != ((String)charSequence).charAt(n2 + 1))) continue;
                            n2 = 0;
                            break block6;
                        }
                    }
                }
                n2 = 1;
            }
            if (n2 != 0) {
                writer.write(object.toString());
            } else {
                writer.write(34);
                String string = object.toString();
                object2 = b;
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append((String)object2);
                ((StringBuilder)charSequence).append((String)object2);
                writer.write(h.h(string, (String)object2, ((StringBuilder)charSequence).toString()));
                writer.write(34);
            }
            return Character.codePointCount((CharSequence)object, 0, object.length());
        }
        object = new IllegalStateException(cYh.d("2423371424390620242377290F3F343D337A09353734257A153520323F7A133824710C6B3A70283F333F1F"));
        throw object;
    }
}

