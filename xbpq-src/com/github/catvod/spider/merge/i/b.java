/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.util.Log
 *  android.util.SparseArray
 *  android.util.TypedValue
 *  androidx.core.content.ContextCompat
 *  androidx.core.content.res.ColorStateListInflaterCompat
 *  org.xmlpull.v1.XmlPullParser
 */
package com.github.catvod.spider.merge.i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ColorStateListInflaterCompat;
import com.github.catvod.spider.merge.i.a;
import com.github.catvod.spider.merge.n.G;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

@SuppressLint(value={"RestrictedAPI"})
public final class b {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal();
    private static final WeakHashMap<Context, SparseArray<a>> b = new WeakHashMap(0);
    private static final Object c = new Object();

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ColorStateList a(Context var0, int var1_1) {
        if (Build.VERSION.SDK_INT >= 23) {
            return var0.getColorStateList(var1_1);
        }
        var6_2 = com.github.catvod.spider.merge.i.b.c;
        synchronized (var6_2) {
            var4_3 = com.github.catvod.spider.merge.i.b.b.get(var0);
            var5_5 = null;
            if (var4_3 == null || var4_3.size() <= 0 || (var7_6 = (a)var4_3.get(var1_1)) == null) ** GOTO lbl12
            if (var7_6.b.equals(var0.getResources().getConfiguration())) {
                var4_3 = var7_6.a;
            } else {
                var4_3.remove(var1_1);
lbl12:
                // 2 sources

                // MONITOREXIT @DISABLED, blocks:[4, 12] lbl13 : MonitorExitStatement: MONITOREXIT : var6_2
                var4_3 = null;
            }
        }
        if (var4_3 != null) {
            return var4_3;
        }
        var7_6 = var0.getResources();
        var8_7 = com.github.catvod.spider.merge.i.b.a;
        var6_2 = var8_7.get();
        var4_3 = var6_2;
        if (var6_2 == null) {
            var4_3 = new TypedValue();
            var8_7.set((TypedValue)var4_3);
        }
        var2_8 = true;
        var7_6.getValue(var1_1, (TypedValue)var4_3, true);
        var3_9 = var4_3.type;
        if (var3_9 < 28 || var3_9 > 31) {
            var2_8 = false;
        }
        if (var2_8) {
            var4_3 = var5_5;
        } else {
            var4_3 = var0.getResources();
            var6_2 = var4_3.getXml(var1_1);
            try {
                var4_3 = ColorStateListInflaterCompat.createFromXml((Resources)var4_3, (XmlPullParser)var6_2, (Resources.Theme)var0.getTheme());
            }
            catch (Exception var4_4) {
                Log.e((String)"AppCompatResources", (String)"Failed to inflate ColorStateList, leaving it to the framework", (Throwable)var4_4);
                var4_3 = var5_5;
            }
        }
        if (var4_3 == null) {
            return ContextCompat.getColorStateList((Context)var0, (int)var1_1);
        }
        var7_6 = com.github.catvod.spider.merge.i.b.c;
        synchronized (var7_6) {
            var8_7 = com.github.catvod.spider.merge.i.b.b;
            var5_5 = var6_2 = (SparseArray)var8_7.get(var0);
            if (var6_2 == null) {
                var5_5 = new SparseArray();
                var8_7.put(var0, var5_5);
            }
            var6_2 = new a(var4_3, var0.getResources().getConfiguration());
            var5_5.append(var1_1, var6_2);
            return var4_3;
        }
    }

    public static Drawable b(Context context, int n2) {
        return G.d().f(context, n2);
    }
}

