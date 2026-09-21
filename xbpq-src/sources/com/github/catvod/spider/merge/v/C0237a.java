package com.github.catvod.spider.merge.v;

import com.github.catvod.spider.merge.cYh;

/* renamed from: com.github.catvod.spider.merge.v.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0237a {
    public static /* synthetic */ int a(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 0;
        }
        if (i == 3) {
            return 3;
        }
        if (i == 4) {
            return 2;
        }
        throw null;
    }

    public static /* synthetic */ String b(int i) {
        return i == 1 ? cYh.d("2B") : i == 2 ? cYh.d("2A") : i == 3 ? cYh.d("36") : i == 4 ? cYh.d("2F") : cYh.d("09252D3D");
    }

    public static /* synthetic */ int c(String str) {
        if (str == null) {
            throw new NullPointerException(cYh.d("29312C34773314702F243B36"));
        }
        if (str.equals(cYh.d("2B"))) {
            return 1;
        }
        if (str.equals(cYh.d("2A"))) {
            return 2;
        }
        if (str.equals(cYh.d("36"))) {
            return 3;
        }
        if (str.equals(cYh.d("2F"))) {
            return 4;
        }
        throw new IllegalArgumentException(cYh.d("293F6134392F0A70223E392913312F257739083D6F363835003C247F2D220E3E267F2628043F2534793E02332E353228491533233828243F3323323913392E3F1B3F11352D7F").concat(str));
    }
}
