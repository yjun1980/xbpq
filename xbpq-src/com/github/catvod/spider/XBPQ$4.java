/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider;

import com.github.catvod.spider.Init;
import com.github.catvod.spider.XBPQ;
import com.github.catvod.spider.merge.b.n;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.j.j;

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
        int n2 = object.indexOf(cYh.d("437465"));
        String string = cYh.d("57");
        if (n2 > 1) {
            String[] object22 = object.split(cYh.d("3B741D750B7E"));
            XBPQ xBPQ = this.b;
            object = object22.length > 1 ? object22[1] : cYh.d("56");
            XBPQ.a(xBPQ, object);
            xBPQ = Init.d.edit();
            String string2 = n.b(new StringBuilder(), XBPQ.b(this.b), cYh.d("382520"));
            String[] stringArray = object22[0];
            object = cYh.d("44");
            xBPQ.putString(string2, stringArray.split((String)object)[0]);
            XBPQ.K = object22[0].split((String)object)[0];
            XBPQ.d(this.b, object22[0].split((String)object)[1]);
            if (this.a.length() > 2) {
                object = this.a;
                string2 = cYh.d("5C");
                for (String string3 : object.split(string2)) {
                    Object object2;
                    CharSequence charSequence;
                    object = XBPQ.c(this.b);
                    if (object.indexOf(string3.split((String)(charSequence = cYh.d("5A")))[0]) < 0) {
                        object2 = this.b;
                        object = string3;
                        if (XBPQ.c((XBPQ)((Object)object2)).length() >= 1) {
                            if (string.equals(XBPQ.c(this.b))) {
                                object = string3;
                            } else {
                                object = new StringBuilder();
                                ((StringBuilder)object).append(XBPQ.c(this.b));
                                ((StringBuilder)object).append(string2);
                                ((StringBuilder)object).append(string3);
                                object = ((StringBuilder)object).toString();
                            }
                        }
                        XBPQ.d((XBPQ)((Object)object2), object);
                        continue;
                    }
                    object = this.b;
                    object2 = n.b(new StringBuilder(), XBPQ.c(this.b), string2);
                    String string4 = n.b(new StringBuilder(), string3.split((String)charSequence)[0], cYh.d("5A7E6B6E6C"));
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(string3);
                    ((StringBuilder)charSequence).append(string2);
                    XBPQ.d((XBPQ)((Object)object), ((String)object2).replaceAll(string4, ((StringBuilder)charSequence).toString()));
                    object = this.b;
                    XBPQ.d((XBPQ)((Object)object), XBPQ.c((XBPQ)((Object)object)).substring(0, XBPQ.c(this.b).length() - 1));
                }
            }
            xBPQ.putString(XBPQ.b(this.b), XBPQ.c(this.b));
            xBPQ.apply();
        } else {
            XBPQ.a(this.b, string);
        }
    }
}

