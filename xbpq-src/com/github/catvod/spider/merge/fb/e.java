/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.fb;

import com.google.gson.annotations.SerializedName;

public final class e {
    @SerializedName(value="url")
    private String a;
    @SerializedName(value="name")
    private String b;
    @SerializedName(value="lang")
    private String c;
    @SerializedName(value="format")
    private String d;

    public final e a(String string) {
        string.getClass();
        int n2 = string.hashCode();
        int n3 = -1;
        switch (n2) {
            default: {
                break;
            }
            case 117110: {
                if (!string.equals("vtt")) break;
                n3 = 2;
                break;
            }
            case 114177: {
                if (!string.equals("ssa")) break;
                n3 = 1;
                break;
            }
            case 96897: {
                if (!string.equals("ass")) break;
                n3 = 0;
            }
        }
        switch (n3) {
            default: {
                this.d = "application/x-subrip";
                return this;
            }
            case 2: {
                this.d = "text/vtt";
                return this;
            }
            case 0: 
            case 1: 
        }
        this.d = "text/x-ssa";
        return this;
    }

    public final e b(String string) {
        this.c = string;
        return this;
    }

    public final e c(String string) {
        this.b = string;
        return this;
    }

    public final e d(String string) {
        this.a = string;
        return this;
    }
}

