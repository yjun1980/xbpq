/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.util.Log
 *  androidx.vectordrawable.graphics.drawable.e
 *  org.xmlpull.v1.XmlPullParser
 */
package com.github.catvod.spider.merge.n;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import androidx.vectordrawable.graphics.drawable.e;
import com.github.catvod.spider.merge.n.D;
import org.xmlpull.v1.XmlPullParser;

final class A
implements D {
    A() {
    }

    @Override
    public final Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        try {
            context = e.a((Context)context, (Resources)context.getResources(), (XmlPullParser)xmlPullParser, (AttributeSet)attributeSet, (Resources.Theme)theme);
            return context;
        }
        catch (Exception exception) {
            Log.e((String)"AvdcInflateDelegate", (String)"Exception while inflating <animated-vector>", (Throwable)exception);
            return null;
        }
    }
}

