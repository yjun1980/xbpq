/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.z0;

import java.util.regex.Pattern;

public final class a {
    private static final Pattern a = Pattern.compile("&fmt=[^&]*");
    private static final Pattern b = Pattern.compile("&tlang=[^&]*");

    public a(String string) {
        string = a.matcher(string).replaceAll("");
        b.matcher(string).replaceAll("");
    }
}

