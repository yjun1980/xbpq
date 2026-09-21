/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.I;

public final class O0 {
    public static void a(StringBuilder stringBuilder, String string, String string2, String string3, String string4) {
        stringBuilder.append(string);
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        stringBuilder.append(string4);
    }

    public static /* synthetic */ String b(int n2) {
        if (n2 == 1) {
            return "STREAM";
        }
        if (n2 == 2) {
            return "PLAYLIST";
        }
        if (n2 == 3) {
            return "CHANNEL";
        }
        if (n2 == 4) {
            return "COMMENT";
        }
        return "null";
    }
}

