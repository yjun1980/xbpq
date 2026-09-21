/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.StaticLayout$Builder
 *  android.widget.TextView
 */
package com.github.catvod.spider.merge.n;

import android.text.StaticLayout;
import android.widget.TextView;
import com.github.catvod.spider.merge.n.q;

final class r
extends q {
    r() {
    }

    @Override
    void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override
    boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}

