/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources$Theme
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.util.Log
 *  org.xmlpull.v1.XmlPullParser
 */
package com.github.catvod.spider.merge.n;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import com.github.catvod.spider.merge.j.g;
import com.github.catvod.spider.merge.n.D;
import org.xmlpull.v1.XmlPullParser;

final class z
implements D {
    z() {
    }

    @Override
    public final Drawable a(Context object, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        try {
            object = g.i(object, object.getResources(), xmlPullParser, attributeSet, theme);
            return object;
        }
        catch (Exception exception) {
            Log.e((String)"AsldcInflateDelegate", (String)"Exception while inflating <animated-selector>", (Throwable)exception);
            return null;
        }
    }
}

