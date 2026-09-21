/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.widget.EditText
 *  android.widget.Toast
 *  com.github.catvod.demo.MainActivity
 */
package com.github.catvod.spider.merge.I;

import android.content.Context;
import android.widget.EditText;
import android.widget.Toast;
import com.github.catvod.demo.MainActivity;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.TgYunDouBanPan;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.s0;
import com.github.catvod.spider.merge.I.w;
import com.github.catvod.spider.merge.I.y;
import com.github.catvod.spider.merge.d0.g;
import com.github.catvod.spider.merge.i0.m;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public final class o0
implements Runnable {
    public final int a;
    public final Object b;

    public /* synthetic */ o0(Object object, int n2) {
        this.a = n2;
        this.b = object;
    }

    @Override
    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 4: {
                ((TgYunDouBanPan)((Object)this.b)).showTgInput();
                return;
            }
            case 3: {
                NetPan.b((Context)this.b);
                return;
            }
            case 2: {
                Object object = (BaseApi)this.b;
                Objects.requireNonNull(object);
                BaseApi baseApi = BaseApi.get();
                g g2 = new g(object);
                object = com.github.catvod.spider.merge.C.a.c("\u8bbe\u7f6e\u7f51\u76d8\u987a\u5e8f\u3001\u753b\u8d28 \n \u5f53\u524d ");
                ((StringBuilder)object).append(BaseApi.get().c);
                baseApi.showInputWithOption("", null, g2, ((StringBuilder)object).toString(), "\u8bf7\u8f93\u5165\u7f51\u76d8\u987a\u5e8f\u3001\u753b\u8d28\u6216\u70b9\u51fb\u4e0a\u65b9\u9ed8\u8ba4\u9009\u9879", Arrays.asList("uc|quark|p123|ali|115|ty|yd###\u539f\u756b|\u666e\u756b", "ty|ali|p123|quark|uc|115|yd###\u539f\u756b|\u666e\u756b", "quark|p123|uc|115|ali|ty|yd###\u539f\u756b"), BaseApi.get().c);
                return;
            }
            case 1: {
                ((MainActivity)this.b).k();
                return;
            }
            case 0: {
                s0 s02 = (s0)this.b;
                Objects.requireNonNull(s02);
                EditText editText = BaseApi.get().initEditText();
                editText.setHint((CharSequence)"\u8acb\u8f38\u5165\u5938\u514bCookie");
                editText.setPadding(m.e(8), m.e(8), m.e(8), m.e(8));
                editText.setBackground(BaseApi.createRoundedBackground(-3355444, m.e(8)));
                Init.run(new y(s02, editText, new w(s02, editText, 1), 1));
                return;
            }
        }
        String string = (String)this.b;
        List<String> list = m.a;
        Toast.makeText((Context)Init.context(), (CharSequence)string, (int)1).show();
    }
}

