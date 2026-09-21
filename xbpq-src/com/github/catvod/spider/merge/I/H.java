/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  com.github.catvod.crawler.SpiderDebug
 *  com.github.catvod.demo.MainActivity
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge.I;

import android.net.Uri;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.demo.MainActivity;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.M;
import com.github.catvod.spider.merge.I.X0;
import com.github.catvod.spider.merge.I.a1;
import com.github.catvod.spider.merge.I.t;
import com.github.catvod.spider.merge.R.c;
import com.github.catvod.spider.merge.R0.e;
import com.github.catvod.spider.merge.c.b;
import com.github.catvod.spider.merge.f0.g;
import com.github.catvod.spider.merge.i0.i;
import java.util.Objects;
import org.json.JSONObject;

public final class H
implements Runnable {
    public final int a;
    public final Object b;

    public /* synthetic */ H(Object object, int n2) {
        this.a = n2;
        this.b = object;
    }

    /*
     * Loose catch block
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
            case 4: {
                Object object = (BaseApi)this.b;
                Objects.requireNonNull(object);
                boolean bl = ((BaseApi)object).e == false;
                ((BaseApi)object).e = bl;
                com.github.catvod.spider.merge.c.b.f(((BaseApi)object).getNetPanIsoCache(), String.valueOf(((BaseApi)object).e));
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("iso\u539f\u76d8\u8c03\u7528\u5916\u90e8\u64ad\u653e\u5668 \u5f53\u524d\u4e3a");
                object = BaseApi.get().e != false ? "\u5f00" : "\u5173";
                stringBuilder.append((String)object);
                com.github.catvod.spider.merge.i0.c.b(stringBuilder.toString());
                return;
            }
            case 3: {
                MainActivity mainActivity = (MainActivity)this.b;
                int n2 = MainActivity.c;
                Objects.requireNonNull(mainActivity);
                try {
                    Init.init(mainActivity.getApplicationContext());
                    return;
                }
                catch (Exception exception) {
                    throw new RuntimeException(exception);
                }
            }
            case 2: {
                c c2 = (c)this.b;
                Objects.requireNonNull(c2);
                int n3 = a1.i;
                Objects.requireNonNull(X0.a);
                com.github.catvod.spider.merge.c.b.f(com.github.catvod.spider.merge.c.b.e("p123_user"), c2.toString());
                return;
            }
            case 1: {
                com.github.catvod.spider.merge.L.e e2 = (com.github.catvod.spider.merge.L.e)this.b;
                Objects.requireNonNull(e2);
                Objects.requireNonNull(t.a);
                com.github.catvod.spider.merge.c.b.f(com.github.catvod.spider.merge.c.b.e("aliyundrive_drive"), e2.toString());
                return;
            }
            case 0: {
                M.d((M)this.b);
                return;
            }
        }
        Object object = (JSONObject)this.b;
        Object object2 = NetPan.a;
        try {
            if (!object.has("proxy")) return;
            if (!e.d(object.getString("proxy"))) return;
            object2 = object.getString("proxy");
            object = new i();
            ((i)object).f((String)object2);
            String string = ((i)object).d();
            String string2 = ((i)object).a();
            int n4 = ((i)object).c();
            String string3 = ((i)object).e();
            String string4 = ((i)object).b();
            object2 = "";
            boolean bl = e.d(string3);
            object = object2;
            if (bl) {
                object = object2;
                if (!string3.equals("null")) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append(string3);
                    ((StringBuilder)object).append(":");
                    ((StringBuilder)object).append(string4);
                    object = ((StringBuilder)object).toString();
                }
            }
            object2 = e.d(string3) ? Uri.encode((String)object, (String)":/@#?&") : null;
            object = string2;
            if (object2 != null) {
                object = new StringBuilder();
                ((StringBuilder)object).append((String)object2);
                ((StringBuilder)object).append("@");
                ((StringBuilder)object).append(string2);
                object = ((StringBuilder)object).toString();
            }
            object2 = object;
            if (n4 != -1) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append(":");
                ((StringBuilder)object2).append(n4);
                object2 = ((StringBuilder)object2).toString();
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("uri.authority :");
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append((String)object2);
            SpiderDebug.log((String)((StringBuilder)object).toString());
            object = new Uri.Builder();
            object = object.scheme(string).encodedAuthority((String)object2).build();
            object2 = g.b();
            Objects.requireNonNull(object2);
            ((g)object2).a = g.c((Uri)object).build();
            return;
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
        }
        return;
        catch (Exception exception) {
            return;
        }
    }
}

