/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.cYh;

class d {
    public static final void a(int n2, int n3) {
        if (n2 <= n3) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(cYh.d("133F083F333F1F7069"));
        stringBuilder.append(n2);
        stringBuilder.append(cYh.d("4E702822773D15352025322847242930397A14393B347772"));
        stringBuilder.append(n3);
        stringBuilder.append(cYh.d("4E7E"));
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }
}

