/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class \u0528 {
    @SerializedName(value="key")
    private String \u037f;
    @SerializedName(value="name")
    private String \u0528;
    @SerializedName(value="value")
    private List<\u037f> \u0529;

    public \u0528(String string, String string2, List<\u037f> list) {
        this.\u037f = string;
        this.\u0528 = string2;
        this.\u0529 = list;
    }

    public static class \u037f {
        @SerializedName(value="n")
        private String \u037f;
        @SerializedName(value="v")
        private String \u0528;

        public \u037f(String string, String string2) {
            this.\u037f = string;
            this.\u0528 = string2;
        }
    }
}

