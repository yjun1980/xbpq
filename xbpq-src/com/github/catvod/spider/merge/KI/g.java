/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.core.view.ContentInfoCompat
 *  androidx.core.view.OnReceiveContentViewBehavior
 *  androidx.core.view.ViewCompat
 */
package com.github.catvod.spider.merge.KI;

import androidx.core.view.ContentInfoCompat;
import androidx.core.view.OnReceiveContentViewBehavior;
import androidx.core.view.ViewCompat;

public final class g
implements OnReceiveContentViewBehavior {
    public final ContentInfoCompat onReceiveContent(ContentInfoCompat contentInfoCompat) {
        return ViewCompat.a((ContentInfoCompat)contentInfoCompat);
    }
}

