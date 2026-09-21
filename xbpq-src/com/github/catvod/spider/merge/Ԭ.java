/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.google.gson.annotations.SerializedName;

public class \u052c {
    @SerializedName(value="url")
    private String \u037f;
    @SerializedName(value="name")
    private String \u0528;
    @SerializedName(value="format")
    private String \u0529;

    public static \u052c \u037f() {
        return new \u052c();
    }

    public \u052c \u0528(String string) {
        string.hashCode();
        int n2 = string.hashCode();
        int n3 = -1;
        switch (n2) {
            default: {
                break;
            }
            case 117110: {
                if (!string.equals(SOY.d("0C2625"))) break;
                n3 = 2;
                break;
            }
            case 114177: {
                if (!string.equals(SOY.d("092130"))) break;
                n3 = 1;
                break;
            }
            case 96897: {
                if (!string.equals(SOY.d("1B2122"))) break;
                n3 = 0;
            }
        }
        switch (n3) {
            default: {
                return this.\u0529(SOY.d("1B22211A1D141B2638191A58027F220316051322"));
            }
            case 2: {
                return this.\u0529(SOY.d("0E3729025B010E26"));
            }
            case 0: 
            case 1: 
        }
        return this.\u0529(SOY.d("0E3729025B0F57212217"));
    }

    public \u052c \u0529(String string) {
        this.\u0529 = string;
        return this;
    }

    public \u052c \u052a(String string) {
        this.\u0528 = string;
        return this;
    }

    public \u052c \u052b(String string) {
        this.\u037f = string;
        return this;
    }
}

