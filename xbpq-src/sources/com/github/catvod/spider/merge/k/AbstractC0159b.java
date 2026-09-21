package com.github.catvod.spider.merge.k;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Response;

/* renamed from: com.github.catvod.spider.merge.k.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0159b extends AbstractC0160c<String> {
    @Override // com.github.catvod.spider.merge.k.AbstractC0160c
    public void onError(Call call, Exception exc) {
        b();
        onFailure(call, exc);
    }

    @Override // com.github.catvod.spider.merge.k.AbstractC0160c
    public String onParseResponse(Call call, Response response) {
        try {
            return response.body().string();
        } catch (IOException unused) {
            return "";
        }
    }
}
