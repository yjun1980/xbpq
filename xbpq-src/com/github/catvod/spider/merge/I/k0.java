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
import com.github.catvod.spider.merge.I.h0;
import com.github.catvod.spider.merge.I.s0;
import com.github.catvod.spider.merge.f0.d;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

public final class k0
implements Runnable {
    public final int a;
    public final s0 b;

    public /* synthetic */ k0(s0 s02, int n2) {
        this.a = n2;
        this.b = s02;
    }

    @Override
    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                s0.a(this.b);
                return;
            }
        }
        s0 s02 = this.b;
        Objects.requireNonNull(s02);
        try {
            String string = d.k("https://uop.quark.cn/cas/ajax/getTokenForQrcodeLogin?client_id=532&v=1.2");
            Object object = new JSONObject(string);
            string = object.getJSONObject("data").getJSONObject("members").getString("token");
            object = new StringBuilder();
            ((StringBuilder)object).append("getQRCode >> token: ");
            ((StringBuilder)object).append(string);
            SpiderDebug.log((String)((StringBuilder)object).toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("https://su.quark.cn/4_eMHBJ?token=");
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append("&client_id=532&ssb=weblogin&uc_param_str=&uc_biz_str=S%3Acustom%7COPT%3ASAREA%400%7COPT%3AIMMERSIVE%401%7COPT%3ABACK_BTN_STYLE%400");
            object = ((StringBuilder)object).toString();
            h0 h02 = new h0(s02, string, (String)object);
            Init.run(h02);
            return;
        }
        catch (JSONException jSONException) {
            throw new RuntimeException(jSONException);
        }
    }
}

