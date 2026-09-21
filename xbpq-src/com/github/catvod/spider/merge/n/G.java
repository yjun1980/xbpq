/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.util.TypedValue
 *  android.util.Xml
 *  androidx.core.content.ContextCompat
 *  androidx.core.graphics.drawable.DrawableCompat
 *  androidx.vectordrawable.graphics.drawable.r
 *  org.xmlpull.v1.XmlPullParser
 */
package com.github.catvod.spider.merge.n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.r;
import com.github.catvod.spider.merge.Y1.a;
import com.github.catvod.spider.merge.n.A;
import com.github.catvod.spider.merge.n.B;
import com.github.catvod.spider.merge.n.C;
import com.github.catvod.spider.merge.n.D;
import com.github.catvod.spider.merge.n.E;
import com.github.catvod.spider.merge.n.F;
import com.github.catvod.spider.merge.n.J;
import com.github.catvod.spider.merge.n.f;
import com.github.catvod.spider.merge.n.v;
import com.github.catvod.spider.merge.n.z;
import com.github.catvod.spider.merge.q.n;
import com.github.catvod.spider.merge.q.o;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

public final class G {
    private static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    private static G i;
    private static final B j;
    private WeakHashMap<Context, o<ColorStateList>> a;
    private n<String, D> b;
    private o<String> c;
    private final WeakHashMap<Context, com.github.catvod.spider.merge.q.f<WeakReference<Drawable.ConstantState>>> d = new WeakHashMap(0);
    private TypedValue e;
    private boolean f;
    private E g;

    static {
        j = new B();
    }

    private void a(String string, D d2) {
        if (this.b == null) {
            this.b = new n();
        }
        this.b.put(string, d2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean b(Context object, long l2, Drawable object2) {
        synchronized (this) {
            Drawable.ConstantState constantState = object2.getConstantState();
            if (constantState == null) return false;
            com.github.catvod.spider.merge.q.f<WeakReference<Drawable.ConstantState>> f2 = this.d.get(object);
            object2 = f2;
            if (f2 == null) {
                object2 = new com.github.catvod.spider.merge.q.f();
                this.d.put((Context)object, (com.github.catvod.spider.merge.q.f<WeakReference<Drawable.ConstantState>>)object2);
            }
            WeakReference<Drawable.ConstantState> weakReference = new WeakReference<Drawable.ConstantState>(constantState);
            ((com.github.catvod.spider.merge.q.f)object2).e(l2, weakReference);
            return true;
        }
    }

    private Drawable c(Context context, int n2) {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(n2, typedValue, true);
        long l2 = (long)typedValue.assetCookie << 32 | (long)typedValue.data;
        Object object = this.e(context, l2);
        if (object != null) {
            return object;
        }
        object = this.g;
        object = object == null ? null : ((f)object).c(this, context, n2);
        if (object != null) {
            object.setChangingConfigurations(typedValue.changingConfigurations);
            this.b(context, l2, (Drawable)object);
        }
        return object;
    }

    public static G d() {
        synchronized (G.class) {
            G g2;
            if (i == null) {
                i = g2 = new G();
                G.j(g2);
            }
            g2 = i;
            return g2;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private Drawable e(Context context, long l2) {
        synchronized (this) {
            com.github.catvod.spider.merge.q.f<WeakReference<Drawable.ConstantState>> f2;
            block8: {
                block7: {
                    f2 = this.d.get(context);
                    if (f2 != null) break block7;
                    return null;
                }
                WeakReference weakReference = f2.d(l2, null);
                if (weakReference == null) return null;
                weakReference = (Drawable.ConstantState)weakReference.get();
                if (weakReference == null) break block8;
                return weakReference.newDrawable(context.getResources());
            }
            f2.f(l2);
            return null;
        }
    }

    public static PorterDuffColorFilter h(int n2, PorterDuff.Mode mode) {
        synchronized (G.class) {
            PorterDuffColorFilter porterDuffColorFilter;
            block6: {
                PorterDuffColorFilter porterDuffColorFilter2;
                B b2 = j;
                Objects.requireNonNull(b2);
                int n3 = (n2 + 31) * 31;
                porterDuffColorFilter = porterDuffColorFilter2 = (PorterDuffColorFilter)b2.a(mode.hashCode() + n3);
                if (porterDuffColorFilter2 != null) break block6;
                porterDuffColorFilter = new PorterDuffColorFilter(n2, mode);
                Objects.requireNonNull(b2);
                mode = b2.b(mode.hashCode() + n3, porterDuffColorFilter);
            }
            return porterDuffColorFilter;
            finally {
            }
        }
    }

    private static void j(G g2) {
        if (Build.VERSION.SDK_INT < 24) {
            g2.a("vector", new F());
            g2.a("animated-vector", new A());
            g2.a("animated-selector", new z());
            g2.a("drawable", new C());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Drawable k(Context object, int n2) {
        Object object2 = this.b;
        if (object2 != null && !((n)object2).isEmpty()) {
            object2 = this.c;
            if (object2 != null) {
                if ("appcompat_skip_skip".equals(object2 = (String)((o)object2).c(n2, null)) || object2 != null && this.b.getOrDefault(object2, null) == null) {
                    return null;
                }
            } else {
                this.c = new o();
            }
            if (this.e == null) {
                this.e = new TypedValue();
            }
            TypedValue typedValue = this.e;
            object2 = object.getResources();
            object2.getValue(n2, typedValue, true);
            long l2 = (long)typedValue.assetCookie << 32 | (long)typedValue.data;
            Drawable drawable = this.e((Context)object, l2);
            if (drawable != null) {
                return drawable;
            }
            CharSequence charSequence = typedValue.string;
            Object object3 = drawable;
            if (charSequence != null) {
                object3 = drawable;
                if (charSequence.toString().endsWith(".xml")) {
                    object3 = drawable;
                    try {
                        int n3;
                        charSequence = object2.getXml(n2);
                        object3 = drawable;
                        AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)charSequence);
                        do {
                            object3 = drawable;
                        } while ((n3 = charSequence.next()) != 2 && n3 != 1);
                        if (n3 != 2) {
                            object3 = drawable;
                            object3 = drawable;
                            object = new a("No start tag found");
                            object3 = drawable;
                            throw object;
                        }
                        object3 = drawable;
                        object2 = charSequence.getName();
                        object3 = drawable;
                        this.c.a(n2, (String)object2);
                        object3 = drawable;
                        D d2 = this.b.getOrDefault(object2, null);
                        object2 = drawable;
                        if (d2 != null) {
                            object3 = drawable;
                            object2 = d2.a((Context)object, (XmlPullParser)charSequence, attributeSet, object.getTheme());
                        }
                        object3 = object2;
                        if (object2 != null) {
                            object3 = object2;
                            object2.setChangingConfigurations(typedValue.changingConfigurations);
                            object3 = object2;
                            this.b((Context)object, l2, (Drawable)object2);
                            object3 = object2;
                        }
                    }
                    catch (Exception exception) {
                        Log.e((String)"ResourceManagerInternal", (String)"Exception while inflating drawable", (Throwable)exception);
                    }
                }
            }
            if (object3 == null) {
                this.c.a(n2, "appcompat_skip_skip");
            }
            return object3;
        }
        return null;
    }

    private Drawable m(Context object, int n2, Drawable drawable) {
        ColorStateList colorStateList = this.i((Context)object, n2);
        if (colorStateList != null) {
            object = drawable;
            if (v.a(drawable)) {
                object = drawable.mutate();
            }
            Drawable drawable2 = DrawableCompat.wrap((Drawable)object);
            DrawableCompat.setTintList((Drawable)drawable2, (ColorStateList)colorStateList);
            object = this.g != null && n2 == 2131165249 ? PorterDuff.Mode.MULTIPLY : null;
            drawable = drawable2;
            if (object != null) {
                DrawableCompat.setTintMode((Drawable)drawable2, (PorterDuff.Mode)object);
                drawable = drawable2;
            }
        } else {
            E e2 = this.g;
            if (e2 != null && ((f)e2).g((Context)object, n2, drawable) || (e2 = this.g) == null || !((f)e2).h((Context)object, n2, drawable)) {
                // empty if block
            }
        }
        return drawable;
    }

    static void n(Drawable drawable, J j2, int[] nArray) {
        if (v.a(drawable) && drawable.mutate() != drawable) {
            Log.d((String)"ResourceManagerInternal", (String)"Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean bl = j2.d;
        if (!bl && !j2.c) {
            drawable.clearColorFilter();
        } else {
            PorterDuffColorFilter porterDuffColorFilter = null;
            ColorStateList colorStateList = bl ? j2.a : null;
            j2 = j2.c ? j2.b : h;
            PorterDuffColorFilter porterDuffColorFilter2 = porterDuffColorFilter;
            if (colorStateList != null) {
                porterDuffColorFilter2 = j2 == null ? porterDuffColorFilter : G.h(colorStateList.getColorForState(nArray, 0), (PorterDuff.Mode)j2);
            }
            drawable.setColorFilter(porterDuffColorFilter2);
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public final Drawable f(Context context, int n2) {
        synchronized (this) {
            context = this.g(context, n2);
            return context;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final Drawable g(Context object, int n2) {
        synchronized (this) {
            block11: {
                Drawable drawable;
                Drawable drawable2;
                block10: {
                    if (this.f) break block10;
                    boolean bl = true;
                    this.f = true;
                    drawable2 = this.f((Context)object, 2131165262);
                    if (drawable2 == null) break block11;
                    boolean bl2 = bl;
                    if (!(drawable2 instanceof r)) {
                        bl2 = "android.graphics.drawable.VectorDrawable".equals(drawable2.getClass().getName()) ? bl : false;
                    }
                    if (!bl2) break block11;
                }
                drawable2 = drawable = this.k((Context)object, n2);
                if (drawable == null) {
                    drawable2 = this.c((Context)object, n2);
                }
                drawable = drawable2;
                if (drawable2 == null) {
                    drawable = ContextCompat.getDrawable((Context)object, (int)n2);
                }
                drawable2 = drawable;
                if (drawable != null) {
                    drawable2 = this.m((Context)object, n2, drawable);
                }
                if (drawable2 != null) {
                    v.b(drawable2);
                }
                return drawable2;
            }
            this.f = false;
            IllegalStateException illegalStateException = new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            throw illegalStateException;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final ColorStateList i(Context context, int n2) {
        synchronized (this) {
            try {
                Object object = this.a;
                o<ColorStateList> o2 = null;
                object = object != null && (object = ((WeakHashMap)object).get(context)) != null ? (ColorStateList)((o)object).c(n2, null) : null;
                o<Object> o3 = object;
                if (object != null) return o3;
                object = this.g;
                object = object == null ? o2 : ((f)object).e(context, n2);
                if (object == null) return object;
                if (this.a == null) {
                    o3 = new o<Object>();
                    this.a = o3;
                }
                o2 = this.a.get(context);
                o3 = o2;
                if (o2 == null) {
                    o3 = new o<Object>();
                    this.a.put(context, o3);
                }
                o3.a(n2, object);
                return object;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void l(E e2) {
        synchronized (this) {
            this.g = e2;
            return;
        }
    }
}

