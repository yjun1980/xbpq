/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.net.Uri
 *  android.view.View
 *  android.view.View$OnClickListener
 *  com.github.catvod.demo.MainActivity
 */
package com.github.catvod.spider.merge.I;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.github.catvod.demo.MainActivity;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.O.b;

public final class G
implements View.OnClickListener {
    public final int a;
    public final Object b;

    public /* synthetic */ G(Object object, int n2) {
        this.a = n2;
        this.b = object;
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onClick(View object) {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                MainActivity.a((MainActivity)((MainActivity)this.b));
                return;
            }
            case 0: {
                object = (b)this.b;
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse((String)((b)object).k()));
                Init.getActivity().startActivity(intent);
                return;
            }
        }
        BaseApi.c((Activity)this.b);
        return;
        catch (Exception exception) {
            return;
        }
    }
}

