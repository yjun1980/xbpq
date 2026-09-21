/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.P.B;
import com.github.catvod.spider.merge.P.b;
import com.github.catvod.spider.merge.P.z;
import com.github.catvod.spider.merge.cYh;
import java.io.PrintStream;

public final class n
extends b {
    public static final n a = new n();

    @Override
    public final void a(B<?, ?> object, Object object2, int n2, int n3, String string, z z2) {
        object = System.err;
        object2 = new StringBuilder();
        ((StringBuilder)object2).append(cYh.d("0B392F3477"));
        ((StringBuilder)object2).append(n2);
        ((StringBuilder)object2).append(cYh.d("5D"));
        ((StringBuilder)object2).append(n3);
        ((StringBuilder)object2).append(cYh.d("47"));
        ((StringBuilder)object2).append(string);
        ((PrintStream)object).println(((StringBuilder)object2).toString());
    }
}

