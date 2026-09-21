/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.l;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.l.i;
import java.util.Arrays;

public final class j {
    private final String a;
    private final i b;
    private i c;

    j(String string) {
        i i2;
        this.b = i2 = new i();
        this.c = i2;
        this.a = string;
    }

    public final j a(Object object) {
        i i2;
        this.c.b = i2 = new i();
        this.c = i2;
        i2.a = object;
        return this;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(32);
        stringBuilder.append(this.a);
        stringBuilder.append('{');
        i i2 = this.b.b;
        String string = "";
        while (i2 != null) {
            Object object = i2.a;
            stringBuilder.append(string);
            if (object != null && object.getClass().isArray()) {
                string = Arrays.deepToString(new Object[]{object});
                stringBuilder.append(string, 1, string.length() - 1);
            } else {
                stringBuilder.append(object);
            }
            i2 = i2.b;
            string = cYh.d("4B70");
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

