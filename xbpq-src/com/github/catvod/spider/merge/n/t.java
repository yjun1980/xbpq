/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.graphics.RectF
 *  android.os.Build$VERSION
 *  android.text.Layout$Alignment
 *  android.text.StaticLayout
 *  android.text.StaticLayout$Builder
 *  android.text.TextPaint
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.Log
 *  android.util.TypedValue
 *  android.view.View
 *  android.widget.TextView
 *  androidx.core.view.ViewCompat
 */
package com.github.catvod.spider.merge.n;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.github.catvod.spider.merge.g.a;
import com.github.catvod.spider.merge.n.q;
import com.github.catvod.spider.merge.n.r;
import com.github.catvod.spider.merge.n.s;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

final class t {
    private static final RectF l = new RectF();
    @SuppressLint(value={"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Method> m = new ConcurrentHashMap();
    @SuppressLint(value={"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Field> n = new ConcurrentHashMap();
    private int a = 0;
    private boolean b = false;
    private float c = -1.0f;
    private float d = -1.0f;
    private float e = -1.0f;
    private int[] f = new int[0];
    private boolean g = false;
    private TextPaint h;
    private final TextView i;
    private final Context j;
    private final s k;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    t(TextView object) {
        void var1_3;
        this.i = object;
        this.j = object.getContext();
        int n2 = Build.VERSION.SDK_INT;
        if (n2 >= 29) {
            r r2 = new r();
        } else if (n2 >= 23) {
            q q2 = new q();
        } else {
            s s2 = new s();
        }
        this.k = var1_3;
    }

    private int[] b(int[] nArray) {
        int n2;
        int n3 = nArray.length;
        if (n3 == 0) {
            return nArray;
        }
        Arrays.sort(nArray);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n4 = 0;
        for (n2 = 0; n2 < n3; ++n2) {
            int n5 = nArray[n2];
            if (n5 <= 0 || Collections.binarySearch(arrayList, n5) >= 0) continue;
            arrayList.add(n5);
        }
        if (n3 == arrayList.size()) {
            return nArray;
        }
        n3 = arrayList.size();
        nArray = new int[n3];
        for (n2 = n4; n2 < n3; ++n2) {
            nArray[n2] = (Integer)arrayList.get(n2);
        }
        return nArray;
    }

    private int c(RectF rectF) {
        int n2 = this.f.length;
        if (n2 != 0) {
            int n3 = n2 - 1;
            n2 = 1;
            int n4 = 0;
            while (n2 <= n3) {
                int n5 = (n2 + n3) / 2;
                int n6 = this.f[n5];
                CharSequence charSequence = this.i.getText();
                Object object = this.i.getTransformationMethod();
                CharSequence charSequence2 = charSequence;
                if (object != null) {
                    object = object.getTransformation(charSequence, (View)this.i);
                    charSequence2 = charSequence;
                    if (object != null) {
                        charSequence2 = object;
                    }
                }
                n4 = Build.VERSION.SDK_INT;
                int n7 = this.i.getMaxLines();
                charSequence = this.h;
                if (charSequence == null) {
                    this.h = new TextPaint();
                } else {
                    charSequence.reset();
                }
                this.h.set(this.i.getPaint());
                this.h.setTextSize((float)n6);
                object = t.j(this.i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
                n6 = Math.round(rectF.right);
                if (n4 >= 23) {
                    charSequence = StaticLayout.Builder.obtain((CharSequence)charSequence2, (int)0, (int)charSequence2.length(), (TextPaint)this.h, (int)n6);
                    object = charSequence.setAlignment((Layout.Alignment)object).setLineSpacing(this.i.getLineSpacingExtra(), this.i.getLineSpacingMultiplier()).setIncludePad(this.i.getIncludeFontPadding()).setBreakStrategy(this.i.getBreakStrategy()).setHyphenationFrequency(this.i.getHyphenationFrequency());
                    n4 = n7 == -1 ? Integer.MAX_VALUE : n7;
                    object.setMaxLines(n4);
                    try {
                        this.k.a((StaticLayout.Builder)charSequence, this.i);
                    }
                    catch (ClassCastException classCastException) {
                        Log.w((String)"ACTVAutoSizeHelper", (String)"Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                    }
                    charSequence = charSequence.build();
                } else {
                    float f2 = this.i.getLineSpacingMultiplier();
                    float f4 = this.i.getLineSpacingExtra();
                    boolean bl = this.i.getIncludeFontPadding();
                    charSequence = new StaticLayout(charSequence2, this.h, n6, (Layout.Alignment)object, f2, f4, bl);
                }
                n4 = n7 != -1 && (charSequence.getLineCount() > n7 || charSequence.getLineEnd(charSequence.getLineCount() - 1) != charSequence2.length()) || (float)charSequence.getHeight() > rectF.bottom ? 0 : 1;
                if (n4 != 0) {
                    n4 = n2;
                    n2 = n5 + 1;
                    continue;
                }
                n3 = n4 = n5 - 1;
            }
            return this.f[n4];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    private static Method i(String string) {
        Object object;
        block4: {
            Method method;
            try {
                method = m.get(string);
                object = method;
                if (method != null) break block4;
            }
            catch (Exception exception) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Failed to retrieve TextView#");
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append("() method");
                Log.w((String)"ACTVAutoSizeHelper", (String)((StringBuilder)object).toString(), (Throwable)exception);
                return null;
            }
            method = TextView.class.getDeclaredMethod(string, new Class[0]);
            object = method;
            if (method == null) break block4;
            ((AccessibleObject)method).setAccessible(true);
            m.put(string, method);
            object = method;
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static <T> T j(Object object, String string, T object2) {
        try {
            object = t.i(string).invoke(object, new Object[0]);
            object2 = object;
            return object2;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to invoke TextView#");
            stringBuilder.append(string);
            stringBuilder.append("() method");
            Log.w((String)"ACTVAutoSizeHelper", (String)stringBuilder.toString(), (Throwable)exception);
            return object2;
        }
    }

    private boolean q() {
        int n2 = this.a;
        if (n2 == 1) {
            if (!this.g || this.f.length == 0) {
                n2 = (int)Math.floor((this.e - this.d) / this.c) + 1;
                int[] nArray = new int[n2];
                for (int i2 = 0; i2 < n2; ++i2) {
                    float f2 = this.d;
                    nArray[i2] = Math.round((float)i2 * this.c + f2);
                }
                this.f = this.b(nArray);
            }
            this.b = true;
        } else {
            this.b = false;
        }
        return this.b;
    }

    private boolean r() {
        int[] nArray = this.f;
        int n2 = nArray.length;
        boolean bl = n2 > 0;
        this.g = bl;
        if (bl) {
            this.a = 1;
            this.d = nArray[0];
            this.e = nArray[n2 - 1];
            this.c = -1.0f;
        }
        return bl;
    }

    private void s(float f2, float f4, float f5) {
        if (!(f2 <= 0.0f)) {
            if (!(f4 <= f2)) {
                if (!(f5 <= 0.0f)) {
                    this.a = 1;
                    this.d = f2;
                    this.e = f4;
                    this.c = f5;
                    this.g = false;
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("The auto-size step granularity (");
                stringBuilder.append(f5);
                stringBuilder.append("px) is less or equal to (0px)");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Maximum auto-size text size (");
            stringBuilder.append(f4);
            stringBuilder.append("px) is less or equal to minimum auto-size text size (");
            stringBuilder.append(f2);
            stringBuilder.append("px)");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Minimum auto-size text size (");
        stringBuilder.append(f2);
        stringBuilder.append("px) is less or equal to (0px)");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void a() {
        if (this.a == 0) return;
        int n2 = 1;
        if (n2 == 0) {
            return;
        }
        if (this.b) {
            if (this.i.getMeasuredHeight() <= 0) return;
            if (this.i.getMeasuredWidth() <= 0) {
                return;
            }
            n2 = this.k.b(this.i) ? 0x100000 : this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft() - this.i.getTotalPaddingRight();
            int n3 = this.i.getHeight() - this.i.getCompoundPaddingBottom() - this.i.getCompoundPaddingTop();
            if (n2 <= 0) return;
            if (n3 <= 0) {
                return;
            }
            RectF rectF = l;
            synchronized (rectF) {
                rectF.setEmpty();
                rectF.right = n2;
                rectF.bottom = n3;
                float f2 = this.c(rectF);
                if (f2 != this.i.getTextSize()) {
                    this.p(0, f2);
                }
            }
        }
        this.b = true;
    }

    final int d() {
        return Math.round(this.e);
    }

    final int e() {
        return Math.round(this.d);
    }

    final int f() {
        return Math.round(this.c);
    }

    final int[] g() {
        return this.f;
    }

    final int h() {
        return this.a;
    }

    final boolean k() {
        boolean bl = this.a != 0;
        return bl;
    }

    final void l(AttributeSet attributeSet, int n2) {
        Context context = this.j;
        int[] nArray = com.github.catvod.spider.merge.g.a.g;
        int n3 = 0;
        context = context.obtainStyledAttributes(attributeSet, nArray, n2, 0);
        TextView textView = this.i;
        ViewCompat.saveAttributeDataForStyleable((View)textView, (Context)textView.getContext(), (int[])nArray, (AttributeSet)attributeSet, (TypedArray)context, (int)n2, (int)0);
        if (context.hasValue(5)) {
            this.a = context.getInt(5, 0);
        }
        float f2 = context.hasValue(4) ? context.getDimension(4, -1.0f) : -1.0f;
        float f4 = context.hasValue(2) ? context.getDimension(2, -1.0f) : -1.0f;
        float f5 = context.hasValue(1) ? context.getDimension(1, -1.0f) : -1.0f;
        if (context.hasValue(3) && (n2 = context.getResourceId(3, 0)) > 0) {
            attributeSet = context.getResources().obtainTypedArray(n2);
            int n4 = attributeSet.length();
            nArray = new int[n4];
            if (n4 > 0) {
                for (n2 = n3; n2 < n4; ++n2) {
                    nArray[n2] = attributeSet.getDimensionPixelSize(n2, -1);
                }
                this.f = this.b(nArray);
                this.r();
            }
            attributeSet.recycle();
        }
        context.recycle();
        if (this.a == 1) {
            if (!this.g) {
                attributeSet = this.j.getResources().getDisplayMetrics();
                float f6 = f4;
                if (f4 == -1.0f) {
                    f6 = TypedValue.applyDimension((int)2, (float)12.0f, (DisplayMetrics)attributeSet);
                }
                f4 = f5;
                if (f5 == -1.0f) {
                    f4 = TypedValue.applyDimension((int)2, (float)112.0f, (DisplayMetrics)attributeSet);
                }
                f5 = f2;
                if (f2 == -1.0f) {
                    f5 = 1.0f;
                }
                this.s(f6, f4, f5);
            }
            this.q();
        }
    }

    final void m(int n2, int n3, int n4, int n5) {
        DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
        this.s(TypedValue.applyDimension((int)n5, (float)n2, (DisplayMetrics)displayMetrics), TypedValue.applyDimension((int)n5, (float)n3, (DisplayMetrics)displayMetrics), TypedValue.applyDimension((int)n5, (float)n4, (DisplayMetrics)displayMetrics));
        if (this.q()) {
            this.a();
        }
    }

    final void n(int[] nArray, int n2) {
        int n3 = nArray.length;
        int n4 = 0;
        if (n3 > 0) {
            Object object;
            int[] nArray2 = new int[n3];
            if (n2 == 0) {
                object = Arrays.copyOf(nArray, n3);
            } else {
                DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                while (true) {
                    object = nArray2;
                    if (n4 >= n3) break;
                    nArray2[n4] = Math.round(TypedValue.applyDimension((int)n2, (float)nArray[n4], (DisplayMetrics)displayMetrics));
                    ++n4;
                }
            }
            this.f = this.b((int[])object);
            if (!this.r()) {
                object = com.github.catvod.spider.merge.C.a.c("None of the preset sizes is valid: ");
                ((StringBuilder)object).append(Arrays.toString(nArray));
                throw new IllegalArgumentException(((StringBuilder)object).toString());
            }
        } else {
            this.g = false;
        }
        if (this.q()) {
            this.a();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final void o(int n2) {
        if (n2 != 0) {
            if (n2 != 1) throw new IllegalArgumentException(com.github.catvod.spider.merge.I.r.a("Unknown auto-size text type: ", n2));
            DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
            this.s(TypedValue.applyDimension((int)2, (float)12.0f, (DisplayMetrics)displayMetrics), TypedValue.applyDimension((int)2, (float)112.0f, (DisplayMetrics)displayMetrics), 1.0f);
            if (!this.q()) return;
            this.a();
            return;
        } else {
            this.a = 0;
            this.d = -1.0f;
            this.e = -1.0f;
            this.c = -1.0f;
            this.f = new int[0];
            this.b = false;
        }
    }

    final void p(int n2, float f2) {
        Object object = this.j;
        object = object == null ? Resources.getSystem() : object.getResources();
        if ((f2 = TypedValue.applyDimension((int)n2, (float)f2, (DisplayMetrics)object.getDisplayMetrics())) != this.i.getPaint().getTextSize()) {
            this.i.getPaint().setTextSize(f2);
            boolean bl = this.i.isInLayout();
            if (this.i.getLayout() != null) {
                block7: {
                    this.b = false;
                    object = t.i("nullLayouts");
                    if (object == null) break block7;
                    try {
                        ((Method)object).invoke(this.i, new Object[0]);
                    }
                    catch (Exception exception) {
                        Log.w((String)"ACTVAutoSizeHelper", (String)"Failed to invoke TextView#nullLayouts() method", (Throwable)exception);
                    }
                }
                if (!bl) {
                    this.i.requestLayout();
                } else {
                    this.i.forceLayout();
                }
                this.i.invalidate();
            }
        }
    }
}

