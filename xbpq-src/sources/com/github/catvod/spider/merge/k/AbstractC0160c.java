package com.github.catvod.spider.merge.k;

import okhttp3.Call;
import okhttp3.Response;

/* renamed from: com.github.catvod.spider.merge.k.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0160c<T> {
    private T a = null;

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(Call call, Response response) {
        T onParseResponse = onParseResponse(call, response);
        this.a = onParseResponse;
        onResponse(onParseResponse);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b() {
        this.a = "";
    }

    public T getResult() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onError(Call call, Exception exc) {
        onFailure(call, exc);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void onFailure(Call call, Exception exc);

    protected abstract T onParseResponse(Call call, Response response);

    protected abstract void onResponse(T t);
}
