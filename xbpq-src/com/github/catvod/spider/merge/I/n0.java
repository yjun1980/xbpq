/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  com.github.catvod.demo.MainActivity
 *  okhttp3.MediaType
 *  okhttp3.Request
 *  okhttp3.Request$Builder
 *  okhttp3.RequestBody
 */
package com.github.catvod.spider.merge.I;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.github.catvod.demo.MainActivity;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Live;
import com.github.catvod.spider.TgYunDouBanPan;
import com.github.catvod.spider.merge.I.K0;
import com.github.catvod.spider.merge.I.L0;
import com.github.catvod.spider.merge.I.s0;
import com.github.catvod.spider.merge.T.b;
import com.github.catvod.spider.merge.f0.d;
import com.github.catvod.spider.merge.i0.c;
import java.util.Objects;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

public final class n0
implements Runnable {
    public final int a;
    public final Object b;

    public /* synthetic */ n0(Object object, int n2) {
        this.a = n2;
        this.b = object;
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
            case 5: {
                Objects.requireNonNull((Live)((Object)this.b));
                Activity activity = Init.getActivity();
                Intent intent = new Intent();
                ComponentName componentName = new ComponentName((Context)activity, "com.fongmi.android.tv.ui.activity.LiveActivity");
                activity.startActivity(intent.setComponent(componentName));
                return;
            }
            case 4: {
                String string = (String)this.b;
                string = string.split("###")[0];
                MediaType mediaType = MediaType.parse((String)"text/plain;charset=UTF-8");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("{\"name\":\"");
                stringBuilder.append(string);
                stringBuilder.append("\"}");
                mediaType = RequestBody.create((MediaType)mediaType, (String)stringBuilder.toString());
                stringBuilder = new Request.Builder();
                stringBuilder = stringBuilder.url("http://127.0.0.1:9190/proxies/select").method("PUT", (RequestBody)mediaType).build();
                d.a().newCall((Request)stringBuilder).execute();
                stringBuilder = new StringBuilder();
                stringBuilder.append("singbox \u8282\u70b9 \u5f53\u524d\u4e3a");
                stringBuilder.append(string);
                c.b(stringBuilder.toString());
                return;
            }
            case 3: {
                ((MainActivity)this.b).l();
                return;
            }
            case 2: {
                b b2 = (b)this.b;
                Objects.requireNonNull(b2);
                Objects.requireNonNull(K0.a);
                com.github.catvod.spider.merge.c.b.f(com.github.catvod.spider.merge.c.b.e("uc_user"), b2.toString());
                return;
            }
            case 1: {
                L0.h((L0)this.b);
                return;
            }
            case 0: {
                s0.a((s0)this.b);
                return;
            }
        }
        TgYunDouBanPan.t((TgYunDouBanPan)((Object)this.b));
        return;
        catch (Throwable throwable) {
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

