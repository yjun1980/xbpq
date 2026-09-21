/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.StaticLayout$Builder
 *  android.text.TextDirectionHeuristics
 *  android.widget.TextView
 */
package com.github.catvod.spider.merge.n;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;
import com.github.catvod.spider.merge.n.s;
import com.github.catvod.spider.merge.n.t;

class q
extends s {
    q() {
    }

    @Override
    void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(t.j(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
    }
}

