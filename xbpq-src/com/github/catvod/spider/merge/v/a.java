/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.v;

import com.github.catvod.spider.merge.cYh;

public final class a {
    public static /* synthetic */ int a(int n2) {
        if (n2 == 1) {
            return 1;
        }
        if (n2 == 2) {
            return 0;
        }
        if (n2 == 3) {
            return 3;
        }
        if (n2 == 4) {
            return 2;
        }
        throw null;
    }

    public static /* synthetic */ String b(int n2) {
        if (n2 == 1) {
            return cYh.d("2B");
        }
        if (n2 == 2) {
            return cYh.d("2A");
        }
        if (n2 == 3) {
            return cYh.d("36");
        }
        if (n2 == 4) {
            return cYh.d("2F");
        }
        return cYh.d("09252D3D");
    }

    public static /* synthetic */ int c(String string) {
        if (string != null) {
            if (string.equals(cYh.d("2B"))) {
                return 1;
            }
            if (string.equals(cYh.d("2A"))) {
                return 2;
            }
            if (string.equals(cYh.d("36"))) {
                return 3;
            }
            if (string.equals(cYh.d("2F"))) {
                return 4;
            }
            throw new IllegalArgumentException(cYh.d("293F6134392F0A70223E392913312F257739083D6F363835003C247F2D220E3E267F2628043F2534793E02332E353228491533233828243F3323323913392E3F1B3F11352D7F").concat(string));
        }
        throw new NullPointerException(cYh.d("29312C34773314702F243B36"));
    }
}

