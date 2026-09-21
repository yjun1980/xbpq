/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.HR.n;
import com.github.catvod.spider.merge.xc.D0.b;
import com.github.catvod.spider.merge.xc.F0.l;

public final class g
extends n {
    public final String a;
    public final String b;
    public final int c;

    public /* synthetic */ g(int n2, String string, String string2) {
        this.c = n2;
        this(string, string2, true);
    }

    public /* synthetic */ g(String string, int n2, String string2, boolean bl) {
        this.c = n2;
        this(string, string2, false);
    }

    public g(String string, String string2, boolean bl) {
        com.github.catvod.spider.merge.xc.D0.b.y(string);
        com.github.catvod.spider.merge.xc.D0.b.y(string2);
        this.a = com.github.catvod.spider.merge.xc.D0.b.x(string);
        boolean bl2 = string2.startsWith("'") && string2.endsWith("'") || string2.startsWith("\"") && string2.endsWith("\"");
        string = string2;
        if (bl2) {
            string = m.d(string2, 1, 1);
        }
        string = bl ? com.github.catvod.spider.merge.xc.D0.b.x(string) : (bl2 ? com.github.catvod.spider.merge.xc.D0.b.u(string) : com.github.catvod.spider.merge.xc.D0.b.x(string));
        this.b = string;
    }

    @Override
    public final boolean a(l object, l l2) {
        switch (this.c) {
            default: {
                object = this.a;
                boolean bl = l2.k((String)object) && com.github.catvod.spider.merge.xc.D0.b.u(l2.c((String)object)).startsWith(this.b);
                return bl;
            }
            case 3: {
                object = l2.c(this.a);
                return this.b.equalsIgnoreCase((String)object) ^ true;
            }
            case 2: {
                object = this.a;
                boolean bl = l2.k((String)object) && com.github.catvod.spider.merge.xc.D0.b.u(l2.c((String)object)).endsWith(this.b);
                return bl;
            }
            case 1: {
                object = this.a;
                boolean bl = l2.k((String)object) && com.github.catvod.spider.merge.xc.D0.b.u(l2.c((String)object)).contains(this.b);
                return bl;
            }
            case 0: 
        }
        object = this.a;
        boolean bl = l2.k((String)object) && this.b.equalsIgnoreCase((String)(object = l2.c((String)object).trim()));
        return bl;
    }

    public final String toString() {
        switch (this.c) {
            default: {
                StringBuilder stringBuilder = new StringBuilder("[");
                stringBuilder.append(this.a);
                stringBuilder.append("^=");
                stringBuilder.append(this.b);
                stringBuilder.append("]");
                return stringBuilder.toString();
            }
            case 3: {
                StringBuilder stringBuilder = new StringBuilder("[");
                stringBuilder.append(this.a);
                stringBuilder.append("!=");
                stringBuilder.append(this.b);
                stringBuilder.append("]");
                return stringBuilder.toString();
            }
            case 2: {
                StringBuilder stringBuilder = new StringBuilder("[");
                stringBuilder.append(this.a);
                stringBuilder.append("$=");
                stringBuilder.append(this.b);
                stringBuilder.append("]");
                return stringBuilder.toString();
            }
            case 1: {
                StringBuilder stringBuilder = new StringBuilder("[");
                stringBuilder.append(this.a);
                stringBuilder.append("*=");
                stringBuilder.append(this.b);
                stringBuilder.append("]");
                return stringBuilder.toString();
            }
            case 0: 
        }
        StringBuilder stringBuilder = new StringBuilder("[");
        stringBuilder.append(this.a);
        stringBuilder.append("=");
        stringBuilder.append(this.b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

