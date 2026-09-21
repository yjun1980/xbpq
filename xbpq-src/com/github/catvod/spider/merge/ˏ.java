/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u02b6;
import com.github.catvod.spider.merge.\u02b8;
import java.io.Writer;

@Deprecated
public class \u02cf
extends \u02b8 {
    private final int \u0528;
    private final int \u0529;
    private final boolean \u052a;

    protected \u02cf(int n2, int n3, boolean bl) {
        this.\u0528 = n2;
        this.\u0529 = n3;
        this.\u052a = bl;
    }

    @Override
    public boolean \u052c(int n2, Writer writer) {
        if (this.\u052a ? n2 < this.\u0528 || n2 > this.\u0529 : n2 >= this.\u0528 && n2 <= this.\u0529) {
            return false;
        }
        if (n2 > 65535) {
            writer.write(this.\u052d(n2));
        } else {
            writer.write(SOY.d("2627"));
            char[] cArray = \u02b6.\u037f;
            writer.write(cArray[n2 >> 12 & 0xF]);
            writer.write(cArray[n2 >> 8 & 0xF]);
            writer.write(cArray[n2 >> 4 & 0xF]);
            writer.write(cArray[n2 & 0xF]);
        }
        return true;
    }

    protected String \u052d(int n2) {
        throw null;
    }
}

