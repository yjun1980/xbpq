/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge.d0;

import android.content.Context;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.Init;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class o
implements Runnable {
    public final boolean a;
    public final JSONObject b;

    public /* synthetic */ o(boolean bl, JSONObject jSONObject) {
        this.a = bl;
        this.b = jSONObject;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void run() {
        boolean bl = this.a;
        JSONObject jSONObject = this.b;
        Pattern pattern = NetPan.a;
        try {
            Init.get().exeTgProxy(bl, jSONObject, (Context)Init.context());
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

