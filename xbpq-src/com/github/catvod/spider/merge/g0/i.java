/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.github.catvod.spider.merge.g0;

import android.content.Context;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.ConfigCenter;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.o0;
import com.github.catvod.spider.merge.I.s0;
import com.github.catvod.spider.merge.I.u;
import com.github.catvod.spider.merge.R0.e;
import com.github.catvod.spider.merge.f0.d;
import com.github.catvod.spider.merge.i0.m;
import java.util.Objects;

public final class i
implements Runnable {
    public static final i b = new i(0);
    public static final i c = new i(1);
    public static final i d = new i(2);
    public static final i e = new i(3);
    public static final i f = new i(4);
    public final int a;

    public /* synthetic */ i(int n2) {
        this.a = n2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 3: {
                CharSequence charSequence = ConfigCenter.n;
                try {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(u.p().c);
                    ((StringBuilder)charSequence).append("/api/ping");
                    charSequence = com.github.catvod.spider.merge.f0.d.k(((StringBuilder)charSequence).toString());
                    if (com.github.catvod.spider.merge.R0.e.d(charSequence)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("GO\u4ee3\u7406\u5df2\u542f\u52a8: ");
                        stringBuilder.append((String)charSequence);
                        charSequence = stringBuilder.toString();
                    } else {
                        charSequence = "GO\u4ee3\u7406\u672a\u54cd\u5e94";
                    }
                    m.y((String)charSequence);
                    return;
                }
                catch (Exception exception) {
                    StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("GO\u4ee3\u7406\u72b6\u6001\u68c0\u67e5\u5931\u8d25: ");
                    stringBuilder.append(exception.getMessage());
                    m.y(stringBuilder.toString());
                }
                return;
            }
            case 2: {
                String string = ConfigCenter.n;
                BaseApi.get().setNetPanDown();
                return;
            }
            case 1: {
                CharSequence charSequence = ConfigCenter.n;
                Init.get().exeAListProxy((Context)Init.context(), Boolean.FALSE);
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("\u6b63\u5728\u542f\u52a8alist \u8d26\u53f7\u5bc6\u7801\u90fd\u662fadmin \u8bf7\u7a0d\u540e\u5728\u6d4f\u89c8\u5668\u8f93\u5165 ");
                ((StringBuilder)charSequence).append(ConfigCenter.o);
                ((StringBuilder)charSequence).append(" \u8bbf\u95ee");
                m.y(((StringBuilder)charSequence).toString());
                return;
            }
            case 0: {
                Object object = ConfigCenter.n;
                object = s0.o();
                Objects.requireNonNull(object);
                Init.run(new o0(object, 0));
                return;
            }
        }
        try {
            Init.interceptActivityStart();
            return;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }
}

