/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider;

import com.github.catvod.spider.Init;
import com.github.catvod.spider.XBPQ;
import com.github.catvod.spider.merge.dp.n;
import com.github.catvod.spider.merge.nz.j;

class XBPQ$4
implements j {
    final String a;
    final XBPQ b;

    XBPQ$4(XBPQ xBPQ, String string) {
        this.b = xBPQ;
        this.a = string;
    }

    @Override
    public void vertifyCode(String object) {
        if (((String)object).indexOf("$$$") > 1) {
            String[] object22 = ((String)object).split("\\$\\$\\$");
            XBPQ xBPQ = this.b;
            object = object22.length > 1 ? object22[1] : "1";
            XBPQ.a(xBPQ, (String)object);
            xBPQ = Init.d.edit();
            xBPQ.putString(n.b(new StringBuilder(), XBPQ.b(this.b), "_ua"), object22[0].split("#")[0]);
            XBPQ.K = object22[0].split("#")[0];
            XBPQ.d(this.b, object22[0].split("#")[1]);
            if (this.a.length() > 2) {
                for (String string : this.a.split(";")) {
                    XBPQ xBPQ2;
                    if (XBPQ.c(this.b).indexOf(string.split("=")[0]) < 0) {
                        xBPQ2 = this.b;
                        object = string;
                        if (XBPQ.c(xBPQ2).length() >= 1) {
                            if ("0".equals(XBPQ.c(this.b))) {
                                object = string;
                            } else {
                                object = new StringBuilder();
                                ((StringBuilder)object).append(XBPQ.c(this.b));
                                ((StringBuilder)object).append(";");
                                ((StringBuilder)object).append(string);
                                object = ((StringBuilder)object).toString();
                            }
                        }
                        XBPQ.d(xBPQ2, (String)object);
                        continue;
                    }
                    xBPQ2 = this.b;
                    String string2 = n.b(new StringBuilder(), XBPQ.c(this.b), ";");
                    String string3 = n.b(new StringBuilder(), string.split("=")[0], "=.*?;");
                    object = new StringBuilder();
                    ((StringBuilder)object).append(string);
                    ((StringBuilder)object).append(";");
                    XBPQ.d(xBPQ2, string2.replaceAll(string3, ((StringBuilder)object).toString()));
                    object = this.b;
                    XBPQ.d((XBPQ)((Object)object), XBPQ.c((XBPQ)((Object)object)).substring(0, XBPQ.c(this.b).length() - 1));
                }
            }
            xBPQ.putString(XBPQ.b(this.b), XBPQ.c(this.b));
            xBPQ.apply();
        } else {
            XBPQ.a(this.b, "0");
        }
    }
}

