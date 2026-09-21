/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  okhttp3.Authenticator
 *  okhttp3.Credentials
 *  okhttp3.Request
 *  okhttp3.Response
 *  okhttp3.Route
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.en.BaseApi;
import com.github.catvod.en.BaseApi$Task;
import com.github.catvod.spider.merge.I.n0;
import okhttp3.Authenticator;
import okhttp3.Credentials;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

public final class f
implements BaseApi$Task,
Authenticator {
    public final Object a;

    public /* synthetic */ f(Object object) {
        this.a = object;
    }

    public final Request authenticate(Route object, Response response) {
        object = (String)this.a;
        object = Credentials.basic((String)((String)object).split(":")[0], (String)((String)object).split(":")[1]);
        return response.request().newBuilder().header("Proxy-Authorization", (String)object).build();
    }

    @Override
    public final void execute(String string) {
        ((BaseApi)this.a).dismiss();
        new Thread(new n0(string, 4)).start();
    }
}

