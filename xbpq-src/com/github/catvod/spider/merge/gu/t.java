/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.gu;

import com.github.catvod.spider.merge.Mm.i;
import com.github.catvod.spider.merge.gu.d;
import com.github.catvod.spider.merge.gu.s;
import com.github.catvod.spider.merge.gu.z;
import java.util.Locale;

public final class t
extends z {
    private final int h;

    public t(s s2, d d2, int n2) {
        super(s2, d2, null);
        this.h = n2;
    }

    @Override
    public final String toString() {
        Object object;
        block8: {
            block3: {
                int n2 = this.h;
                if (n2 < 0 || n2 >= ((d)this.b()).size()) break block3;
                object = (d)this.b();
                n2 = this.h;
                object = object.h(i.b(n2, n2));
                StringBuilder stringBuilder = new StringBuilder();
                for (char c2 : ((String)object).toCharArray()) {
                    block7: {
                        block5: {
                            block6: {
                                block4: {
                                    if (c2 != '\t') break block4;
                                    object = "\\t";
                                    break block5;
                                }
                                if (c2 != '\n') break block6;
                                object = "\\n";
                                break block5;
                            }
                            if (c2 != '\r') break block7;
                            object = "\\r";
                        }
                        stringBuilder.append((String)object);
                        continue;
                    }
                    stringBuilder.append(c2);
                }
                object = stringBuilder.toString();
                break block8;
            }
            object = "";
        }
        return String.format(Locale.getDefault(), "%s('%s')", t.class.getSimpleName(), object);
    }
}

