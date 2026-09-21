/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.os.Bundle
 */
package com.github.catvod.spider.merge.Bk;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.github.catvod.spider.merge.Bk.g;
import com.github.catvod.spider.merge.Bk.p;
import com.github.catvod.spider.merge.Bk.r;

public final class q
implements Application.ActivityLifecycleCallbacks {
    public static void registerIn(Activity activity) {
        p.i(activity, new q());
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        r.a(activity, g.ON_CREATE);
    }

    public void onActivityPostResumed(Activity activity) {
        r.a(activity, g.ON_RESUME);
    }

    public void onActivityPostStarted(Activity activity) {
        r.a(activity, g.ON_START);
    }

    public void onActivityPreDestroyed(Activity activity) {
        r.a(activity, g.ON_DESTROY);
    }

    public void onActivityPrePaused(Activity activity) {
        r.a(activity, g.ON_PAUSE);
    }

    public void onActivityPreStopped(Activity activity) {
        r.a(activity, g.ON_STOP);
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}

