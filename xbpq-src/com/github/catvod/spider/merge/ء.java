/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u02b8;
import java.io.Writer;

@Deprecated
public class \u0621
extends \u02b8 {
    @Override
    public boolean \u052c(int n2, Writer writer) {
        boolean bl = n2 >= 55296 && n2 <= 57343;
        return bl;
    }
}

