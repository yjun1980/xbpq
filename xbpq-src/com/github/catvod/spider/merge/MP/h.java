/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.MP;

import com.google.gson.annotations.SerializedName;

public class h {
    @SerializedName(value="url")
    private String a;
    @SerializedName(value="name")
    private String b;
    @SerializedName(value="lang")
    private String c;
    @SerializedName(value="format")
    private String d;

    public final void a(String string) {
        string.getClass();
        int n2 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 117110: {
                if (!string.equals("vtt")) break;
                n2 = 2;
                break;
            }
            case 114177: {
                if (!string.equals("ssa")) break;
                n2 = 1;
                break;
            }
            case 96897: {
                if (!string.equals("ass")) break;
                n2 = 0;
            }
        }
        switch (n2) {
            default: {
                this.d = "application/x-subrip";
                return;
            }
            case 2: {
                this.d = "text/vtt";
                return;
            }
            case 0: 
            case 1: 
        }
        this.d = "text/x-ssa";
    }

    public final void b(String string) {
        this.c = string;
    }

    public final void c(String string) {
        this.b = string;
    }

    public final void d(String string) {
        this.a = string;
    }
}

