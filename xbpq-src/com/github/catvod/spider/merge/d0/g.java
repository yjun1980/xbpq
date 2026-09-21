/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.en.BaseApi;
import com.github.catvod.en.BaseApi$Task;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.l;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextAction;
import org.mozilla.javascript.tools.shell.Global;

public final class g
implements BaseApi$Task,
ContextAction {
    public final Object a;

    public /* synthetic */ g(Object object) {
        this.a = object;
    }

    @Override
    public final void execute(String string) {
        BaseApi baseApi = (BaseApi)this.a;
        baseApi.dismiss();
        Init.execute(new l(baseApi, string, 4));
    }

    public final Object run(Context context) {
        return Global.a((Global)this.a, context);
    }
}

