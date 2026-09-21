/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.c;

import com.github.catvod.spider.merge.cYh;
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
                if (!string.equals(cYh.d("112435"))) break;
                n3 = 2;
                break;
            }
            case 114177: {
                if (!string.equals(cYh.d("142320"))) break;
                n3 = 1;
                break;
            }
            case 96897: {
                if (!string.equals(cYh.d("062332"))) break;
                n3 = 0;
            }
        }
        switch (n3) {
            default: {
                this.d = cYh.d("0620313D3E390624283E39751F7D322435280E20");
                return this;
            }
            case 2: {
                this.d = cYh.d("13353925782C1324");
                return this;
            }
            case 0: 
            case 1: 
        }
        this.d = cYh.d("1335392578224A233230");
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

