/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.SpiderDebug
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge.I;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.A0;
import com.github.catvod.spider.merge.I.L0;
import com.github.catvod.spider.merge.I.t;
import com.github.catvod.spider.merge.f0.d;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

public final class x0
implements Runnable {
    public final L0 a;
    public final boolean b;

    public /* synthetic */ x0(L0 l02, boolean bl) {
        this.a = l02;
        this.b = bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void run() {
        Object object;
        Object object2;
        CharSequence charSequence;
        L0 l02 = this.a;
        boolean bl = this.b;
        Objects.requireNonNull(l02);
        if (bl) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(t.a.c);
            ((StringBuilder)charSequence).append("/api/ucqr");
            charSequence = d.k(((StringBuilder)charSequence).toString()).split("###")[0];
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("https://su.uc.cn/9_iCI3h?uc_param_str=&token=");
            ((StringBuilder)object2).append((String)charSequence);
            object = "&uc_biz_str=S%3Acustom%7CC%3Atitlebar_fix";
        } else {
            charSequence = d.k("https://api.open.uc.cn/cas/ajax/getTokenForQrcodeLogin?client_id=381&v=1.2");
            object = new JSONObject((String)charSequence);
            charSequence = object.getJSONObject("data").getJSONObject("members").getString("token");
            object = new StringBuilder();
            ((StringBuilder)object).append("getQRCode >> token: ");
            ((StringBuilder)object).append((String)charSequence);
            SpiderDebug.log((String)((StringBuilder)object).toString());
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("https://su.uc.cn/1_n0ZCv?uc_param_str=dsdnfrpfbivesscpgimibtbmnijblauputogpintnwktprchmt&token=");
            ((StringBuilder)object2).append((String)charSequence);
            object = "&client_id=381&uc_biz_str=S%3Acustom%7CC%3Atitlebar_fix";
        }
        try {
            ((StringBuilder)object2).append((String)object);
            object = ((StringBuilder)object2).toString();
            object2 = new A0(l02, bl, (String)charSequence, (String)object);
            Init.run((Runnable)object2);
            return;
        }
        catch (JSONException jSONException) {
            return;
        }
    }
}

