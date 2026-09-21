/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.DownloadManager$Request
 */
package com.github.catvod.spider.merge.d0;

import android.app.DownloadManager;
import java.util.function.BiConsumer;

public final class j
implements BiConsumer {
    public final DownloadManager.Request a;

    public /* synthetic */ j(DownloadManager.Request request) {
        this.a = request;
    }

    public final void accept(Object object, Object object2) {
        this.a.addRequestHeader((String)object, (String)object2);
    }
}

