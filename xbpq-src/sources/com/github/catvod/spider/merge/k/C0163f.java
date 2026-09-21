package com.github.catvod.spider.merge.k;

import com.github.catvod.crawler.SpiderDebug;
import java.io.IOException;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Response;

/* renamed from: com.github.catvod.spider.merge.k.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0163f extends AbstractC0160c<String> {
    final /* synthetic */ Map b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0163f(Map map) {
        this.b = map;
    }

    @Override // com.github.catvod.spider.merge.k.AbstractC0160c
    public final void onFailure(Call call, Exception exc) {
        b();
        SpiderDebug.log(exc);
    }

    @Override // com.github.catvod.spider.merge.k.AbstractC0160c
    public final String onParseResponse(Call call, Response response) {
        try {
            Map map = this.b;
            if (map != null) {
                map.clear();
                this.b.putAll(response.headers().toMultimap());
            }
            return response.body().string();
        } catch (IOException unused) {
            return "";
        }
    }

    @Override // com.github.catvod.spider.merge.k.AbstractC0160c
    public final /* bridge */ /* synthetic */ void onResponse(String str) {
    }
}
