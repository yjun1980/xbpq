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
import com.github.catvod.spider.merge.n.D;
import org.xmlpull.v1.XmlPullParser;

final class C
implements D {
    C() {
    }

    @Override
    public final Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String string = attributeSet.getClassAttribute();
        if (string != null) {
            try {
                string = C.class.getClassLoader().loadClass(string).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                string.inflate(context.getResources(), xmlPullParser, attributeSet, theme);
                return string;
            }
            catch (Exception exception) {
                Log.e((String)"DrawableDelegate", (String)"Exception while inflating <drawable>", (Throwable)exception);
            }
        }
        return null;
    }
}

