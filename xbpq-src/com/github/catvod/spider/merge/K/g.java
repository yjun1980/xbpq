/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.K;

import com.github.catvod.spider.merge.i0.h;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;

public final class g {
    @SerializedName(value="url")
    private String a;
    @SerializedName(value="name")
    private String b;
    @SerializedName(value="lang")
    private String c;
    @SerializedName(value="format")
    private String d;

    public final g a(String string) {
        Objects.requireNonNull(string);
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

    public final g b(String string) {
        int n2 = h.a;
        this.b = string;
        return this;
    }

    public final g c(String string) {
        this.a = string;
        return this;
    }
}

