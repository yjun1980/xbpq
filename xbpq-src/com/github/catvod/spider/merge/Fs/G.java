/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Fs.H;
import com.github.catvod.spider.merge.dp.n;
import com.github.catvod.spider.merge.ka.d;

final class G
extends H {
    G(String string) {
        this.i(string);
    }

    @Override
    public final String toString() {
        return n.b(d.b("<![CDATA["), this.j(), "]]>");
    }
}

