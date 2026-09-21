/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.I;

import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.TgYunDouBanPan;
import com.github.catvod.spider.merge.I.L0;
import com.github.catvod.spider.merge.I.X;
import com.github.catvod.spider.merge.I.s0;
import com.github.catvod.spider.merge.I.t;
import com.github.catvod.spider.merge.I.u;
import com.github.catvod.spider.merge.c.b;
import com.github.catvod.spider.merge.f0.d;
import com.github.catvod.spider.merge.i0.c;
import java.util.Objects;

public final class l
implements Runnable {
    public final int a;
    public final String b;
    public final Object c;

    public /* synthetic */ l(Object object, String string, int n2) {
        this.a = n2;
        this.c = object;
        this.b = string;
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 4: {
                BaseApi baseApi = (BaseApi)this.c;
                CharSequence charSequence = this.b;
                Objects.requireNonNull(baseApi);
                baseApi.setNetPanOrder((String)charSequence, true);
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("\u7f51\u76d8\u987a\u5e8f\u3001\u753b\u8d28\u8bbe\u7f6e\u6210\u529f \u5f53\u524d\u4e3a");
                ((StringBuilder)charSequence).append(BaseApi.get().c);
                com.github.catvod.spider.merge.i0.c.b(((StringBuilder)charSequence).toString());
                return;
            }
            case 3: {
                L0 l02 = (L0)this.c;
                String string = this.b;
                Objects.requireNonNull(l02);
                String string2 = string;
                if (string.startsWith("http")) {
                    string2 = d.k(string);
                }
                l02.R(string2, true);
                return;
            }
            case 2: {
                s0.h((s0)this.c, this.b);
                return;
            }
            case 1: {
                ((X)this.c).G(this.b, true);
                return;
            }
            case 0: {
                u u2 = (u)this.c;
                CharSequence charSequence = this.b;
                Objects.requireNonNull(u2);
                try {
                    t.a.b = Integer.parseInt((String)charSequence);
                    com.github.catvod.spider.merge.c.b.f(u2.I(), (String)charSequence);
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("\u963f\u91cc\u7ebf\u7a0b\u8bbe\u7f6e\u6210\u529f \u5f53\u524d\u4e3a");
                    ((StringBuilder)charSequence).append(t.a.b);
                    com.github.catvod.spider.merge.i0.c.b(((StringBuilder)charSequence).toString());
                    return;
                }
                catch (Exception exception) {
                    Init.show("\u8acb\u8f38\u5165\u6b63\u78ba\u7684\u6578\u5b57");
                }
                return;
            }
        }
        TgYunDouBanPan.r((TgYunDouBanPan)((Object)this.c));
        return;
        catch (Exception exception) {
            return;
        }
    }
}

