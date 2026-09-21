/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.P.d;
import com.github.catvod.spider.merge.P.s;
import com.github.catvod.spider.merge.P.z;
import com.github.catvod.spider.merge.S.i;
import com.github.catvod.spider.merge.cYh;
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
        CharSequence charSequence;
        Object object;
        block8: {
            block3: {
                int n2 = this.h;
                if (n2 < 0 || n2 >= ((d)this.b()).size()) break block3;
                object = (d)this.b();
                n2 = this.h;
                object = object.h(i.b(n2, n2));
                charSequence = new StringBuilder();
                for (Object object2 : (Locale)((String)object).toCharArray()) {
                    block7: {
                        block5: {
                            block6: {
                                block4: {
                                    if (object2 != 9) break block4;
                                    object = cYh.d("3B24");
                                    break block5;
                                }
                                if (object2 != 10) break block6;
                                object = cYh.d("3B3E");
                                break block5;
                            }
                            if (object2 != 13) break block7;
                            object = cYh.d("3B22");
                        }
                        ((StringBuilder)charSequence).append((String)object);
                        continue;
                    }
                    ((StringBuilder)charSequence).append((char)object2);
                }
                object = ((StringBuilder)charSequence).toString();
                break block8;
            }
            object = "";
        }
        Locale locale = Locale.getDefault();
        charSequence = t.class.getSimpleName();
        return String.format(locale, cYh.d("4223697672294079"), charSequence, object);
    }
}

