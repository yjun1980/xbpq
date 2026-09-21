/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u02b8;
import java.io.Writer;

@Deprecated
public class \u06e5
extends \u02b8 {
    private final int \u0528;
    private final int \u0529;
    private final boolean \u052a;

    private \u06e5(int n2, int n3, boolean bl) {
        this.\u0528 = n2;
        this.\u0529 = n3;
        this.\u052a = bl;
    }

    public static \u06e5 \u052d(int n2, int n3) {
        return new \u06e5(n2, n3, true);
    }

    @Override
    public boolean \u052c(int n2, Writer writer) {
        if (this.\u052a ? n2 < this.\u0528 || n2 > this.\u0529 : n2 >= this.\u0528 && n2 <= this.\u0529) {
            return false;
        }
        writer.write(SOY.d("5C71"));
        writer.write(Integer.toString(n2, 10));
        writer.write(59);
        return true;
    }
}

