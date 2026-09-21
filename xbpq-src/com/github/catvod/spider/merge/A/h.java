/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.A;

import com.github.catvod.spider.merge.C.a;

public final class h {
    private final int a;
    private final int b;
    private int c;
    private final StringBuilder d;
    protected boolean e;

    protected h(int n2, int n3) {
        this.b = n2;
        this.a = n3;
        this.d = new StringBuilder();
        boolean bl = false;
        this.c = 0;
        if (n3 == 0) {
            bl = true;
        }
        this.e = bl;
    }

    protected final String a() {
        String string = this.d.length() != 0 ? this.d.substring(1) : "";
        return string;
    }

    protected final void b(String string, int n2) {
        int n3 = this.b;
        if (n2 >= n3 && n2 < n3 + this.a) {
            StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("arg");
            stringBuilder.append(this.c);
            if (!string.equals(stringBuilder.toString())) {
                this.e = true;
            }
            this.d.append(',');
            this.d.append(string);
            ++this.c;
        }
    }
}

