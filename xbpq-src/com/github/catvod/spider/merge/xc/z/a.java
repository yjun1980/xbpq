/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.core.widget.ContentLoadingProgressBar
 */
package com.github.catvod.spider.merge.xc.z;

import androidx.core.widget.ContentLoadingProgressBar;

public final class a
implements Runnable {
    public final int a;
    public final ContentLoadingProgressBar b;

    public /* synthetic */ a(ContentLoadingProgressBar contentLoadingProgressBar, int n2) {
        this.a = n2;
        this.b = contentLoadingProgressBar;
    }

    @Override
    public final void run() {
        switch (this.a) {
            default: {
                ContentLoadingProgressBar.b((ContentLoadingProgressBar)this.b);
                return;
            }
            case 2: {
                ContentLoadingProgressBar.a((ContentLoadingProgressBar)this.b);
                return;
            }
            case 1: {
                ContentLoadingProgressBar.c((ContentLoadingProgressBar)this.b);
                return;
            }
            case 0: 
        }
        ContentLoadingProgressBar.d((ContentLoadingProgressBar)this.b);
    }
}

