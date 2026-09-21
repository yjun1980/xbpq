/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  androidx.core.view.inputmethod.InputConnectionCompat
 *  androidx.core.view.inputmethod.InputConnectionCompat$OnCommitContentListener
 *  androidx.core.view.inputmethod.InputContentInfoCompat
 *  com.github.catvod.spider.InitOrigin
 */
package com.github.catvod.spider.merge.xc.F0;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.HR.o;
import com.github.catvod.spider.merge.UY.E;
import com.github.catvod.spider.merge.UY.X;
import com.github.catvod.spider.merge.UY.c;
import com.github.catvod.spider.merge.xc.F0.l;
import com.github.catvod.spider.merge.xc.F0.q;
import com.github.catvod.spider.merge.xc.U.K;

public final class j
implements o,
K,
InputConnectionCompat.OnCommitContentListener {
    public final int a;
    public final Object b;

    public /* synthetic */ j(int n2, Object object) {
        this.a = n2;
        this.b = object;
    }

    @Override
    public void a(String string) {
        switch (this.a) {
            default: {
                InitOrigin.execute((Runnable)new c((E)this.b, string, 7));
                return;
            }
            case 1: 
        }
        InitOrigin.execute((Runnable)new c((X)this.b, string, 6));
    }

    @Override
    public /* synthetic */ void b(q q2, int n2) {
    }

    @Override
    public void c(q q2, int n2) {
        l.z(q2, (StringBuilder)this.b);
    }

    public boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int n2, Bundle bundle) {
        return InputConnectionCompat.a((View)((View)this.b), (InputContentInfoCompat)inputContentInfoCompat, (int)n2, (Bundle)bundle);
    }
}

