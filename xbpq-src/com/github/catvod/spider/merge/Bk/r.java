/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Fragment
 *  android.os.Build$VERSION
 *  android.os.Bundle
 */
package com.github.catvod.spider.merge.Bk;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import com.github.catvod.spider.merge.Bk.g;
import com.github.catvod.spider.merge.Bk.k;
import com.github.catvod.spider.merge.Bk.l;

public final class r
extends Fragment {
    public static final int a = 0;

    public static void a(Activity object, g g2) {
        if (object instanceof k && (object = ((k)object).getLifecycle()) instanceof l) {
            object = (l)object;
            ((l)object).b("handleLifecycleEvent");
            ((l)object).c(g2.a());
        }
    }

    public final void b(g g2) {
        if (Build.VERSION.SDK_INT < 29) {
            r.a(this.getActivity(), g2);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.b(g.ON_CREATE);
    }

    public final void onDestroy() {
        super.onDestroy();
        this.b(g.ON_DESTROY);
    }

    public final void onPause() {
        super.onPause();
        this.b(g.ON_PAUSE);
    }

    public final void onResume() {
        super.onResume();
        this.b(g.ON_RESUME);
    }

    public final void onStart() {
        super.onStart();
        this.b(g.ON_START);
    }

    public final void onStop() {
        super.onStop();
        this.b(g.ON_STOP);
    }
}

