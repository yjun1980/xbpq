package com.github.catvod.spider.merge.c;

import com.github.catvod.spider.merge.cYh;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public final class e {

    @SerializedName("url")
    private String a;

    @SerializedName("name")
    private String b;

    @SerializedName("lang")
    private String c;

    @SerializedName("format")
    private String d;

    public final e a(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 96897:
                if (str.equals(cYh.d("062332"))) {
                    c = 0;
                    break;
                }
                break;
            case 114177:
                if (str.equals(cYh.d("142320"))) {
                    c = 1;
                    break;
                }
                break;
            case 117110:
                if (str.equals(cYh.d("112435"))) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                this.d = cYh.d("1335392578224A233230");
                return this;
            case 2:
                this.d = cYh.d("13353925782C1324");
                return this;
            default:
                this.d = cYh.d("0620313D3E390624283E39751F7D322435280E20");
                return this;
        }
    }

    public final e b(String str) {
        this.c = str;
        return this;
    }

    public final e c(String str) {
        this.b = str;
        return this;
    }

    public final e d(String str) {
        this.a = str;
        return this;
    }
}
