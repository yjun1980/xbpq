/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.view.ActionMode$Callback
 *  android.view.View
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputConnection
 *  android.view.textclassifier.TextClassifier
 *  android.widget.TextView
 *  androidx.core.graphics.TypefaceCompat
 *  androidx.core.view.TintableBackgroundView
 *  androidx.core.view.inputmethod.EditorInfoCompat
 *  androidx.core.widget.AutoSizeableTextView
 *  androidx.core.widget.TextViewCompat
 *  androidx.core.widget.TintableCompoundDrawablesView
 */
package com.github.catvod.spider.merge.n;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.widget.AutoSizeableTextView;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCompoundDrawablesView;
import com.github.catvod.spider.merge.i.b;
import com.github.catvod.spider.merge.n.H;
import com.github.catvod.spider.merge.n.I;
import com.github.catvod.spider.merge.n.e;
import com.github.catvod.spider.merge.n.h;
import com.github.catvod.spider.merge.n.l;
import com.github.catvod.spider.merge.n.o;
import java.util.Objects;

public class p
extends TextView
implements TintableBackgroundView,
TintableCompoundDrawablesView,
AutoSizeableTextView {
    private final e a;
    private final o b;
    private final l c;
    private boolean d;

    public p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public p(Context object, AttributeSet attributeSet, int n2) {
        I.a((Context)object);
        super((Context)object, attributeSet, n2);
        this.d = false;
        H.a((View)this, this.getContext());
        object = new e((View)this);
        this.a = object;
        ((e)object).d(attributeSet, n2);
        this.b = object = new o(this);
        ((o)object).m(attributeSet, n2);
        ((o)object).b();
        this.c = new l(this);
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        Object object = this.a;
        if (object != null) {
            ((e)object).a();
        }
        if ((object = this.b) != null) {
            ((o)object).b();
        }
    }

    public final int getAutoSizeMaxTextSize() {
        if (AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeMaxTextSize();
        }
        o o2 = this.b;
        if (o2 != null) {
            return o2.e();
        }
        return -1;
    }

    public final int getAutoSizeMinTextSize() {
        if (AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeMinTextSize();
        }
        o o2 = this.b;
        if (o2 != null) {
            return o2.f();
        }
        return -1;
    }

    public final int getAutoSizeStepGranularity() {
        if (AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeStepGranularity();
        }
        o o2 = this.b;
        if (o2 != null) {
            return o2.g();
        }
        return -1;
    }

    public final int[] getAutoSizeTextAvailableSizes() {
        if (AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeTextAvailableSizes();
        }
        o o2 = this.b;
        if (o2 != null) {
            return o2.h();
        }
        return new int[0];
    }

    @SuppressLint(value={"WrongConstant"})
    public final int getAutoSizeTextType() {
        boolean bl = AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE;
        int n2 = 0;
        if (bl) {
            if (super.getAutoSizeTextType() == 1) {
                n2 = 1;
            }
            return n2;
        }
        o o2 = this.b;
        if (o2 != null) {
            return o2.i();
        }
        return 0;
    }

    public final int getFirstBaselineToTopHeight() {
        return TextViewCompat.getFirstBaselineToTopHeight((TextView)this);
    }

    public final int getLastBaselineToBottomHeight() {
        return TextViewCompat.getLastBaselineToBottomHeight((TextView)this);
    }

    public final ColorStateList getSupportBackgroundTintList() {
        e e2 = this.a;
        e2 = e2 != null ? e2.b() : null;
        return e2;
    }

    public final PorterDuff.Mode getSupportBackgroundTintMode() {
        e e2 = this.a;
        e2 = e2 != null ? e2.c() : null;
        return e2;
    }

    public final ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.j();
    }

    public final PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.k();
    }

    public final CharSequence getText() {
        return super.getText();
    }

    public final TextClassifier getTextClassifier() {
        l l2;
        if (Build.VERSION.SDK_INT < 28 && (l2 = this.c) != null) {
            return l2.a();
        }
        return super.getTextClassifier();
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnection = super.onCreateInputConnection(editorInfo);
        Objects.requireNonNull(this.b);
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            EditorInfoCompat.setInitialSurroundingText((EditorInfo)editorInfo, (CharSequence)this.getText());
        }
        h.a(inputConnection, editorInfo, (View)this);
        return inputConnection;
    }

    protected final void onLayout(boolean bl, int n2, int n3, int n4, int n5) {
        super.onLayout(bl, n2, n3, n4, n5);
        o o2 = this.b;
        if (o2 != null) {
            o2.o();
        }
    }

    protected void onMeasure(int n2, int n3) {
        super.onMeasure(n2, n3);
    }

    protected final void onTextChanged(CharSequence object, int n2, int n3, int n4) {
        super.onTextChanged((CharSequence)object, n2, n3, n4);
        object = this.b;
        if (object != null && !AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE && ((o)object).l()) {
            this.b.c();
        }
    }

    public final void setAutoSizeTextTypeUniformWithConfiguration(int n2, int n3, int n4, int n5) {
        if (AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE) {
            super.setAutoSizeTextTypeUniformWithConfiguration(n2, n3, n4, n5);
        } else {
            o o2 = this.b;
            if (o2 != null) {
                o2.q(n2, n3, n4, n5);
            }
        }
    }

    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] nArray, int n2) {
        if (AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(nArray, n2);
        } else {
            o o2 = this.b;
            if (o2 != null) {
                o2.r(nArray, n2);
            }
        }
    }

    public final void setAutoSizeTextTypeWithDefaults(int n2) {
        if (AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE) {
            super.setAutoSizeTextTypeWithDefaults(n2);
        } else {
            o o2 = this.b;
            if (o2 != null) {
                o2.s(n2);
            }
        }
    }

    public final void setBackgroundDrawable(Drawable object) {
        super.setBackgroundDrawable((Drawable)object);
        object = this.a;
        if (object != null) {
            ((e)object).e();
        }
    }

    public final void setBackgroundResource(int n2) {
        super.setBackgroundResource(n2);
        e e2 = this.a;
        if (e2 != null) {
            e2.f(n2);
        }
    }

    public final void setCompoundDrawables(Drawable object, Drawable drawable, Drawable drawable2, Drawable drawable3) {
        super.setCompoundDrawables((Drawable)object, drawable, drawable2, drawable3);
        object = this.b;
        if (object != null) {
            ((o)object).b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable object, Drawable drawable, Drawable drawable2, Drawable drawable3) {
        super.setCompoundDrawablesRelative((Drawable)object, drawable, drawable2, drawable3);
        object = this.b;
        if (object != null) {
            ((o)object).b();
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int n2, int n3, int n4, int n5) {
        Context context = this.getContext();
        Drawable drawable = null;
        Object object = n2 != 0 ? com.github.catvod.spider.merge.i.b.b(context, n2) : null;
        Drawable drawable2 = n3 != 0 ? com.github.catvod.spider.merge.i.b.b(context, n3) : null;
        Drawable drawable3 = n4 != 0 ? com.github.catvod.spider.merge.i.b.b(context, n4) : null;
        if (n5 != 0) {
            drawable = com.github.catvod.spider.merge.i.b.b(context, n5);
        }
        this.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable)object, drawable2, drawable3, drawable);
        object = this.b;
        if (object != null) {
            ((o)object).b();
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable object, Drawable drawable, Drawable drawable2, Drawable drawable3) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable)object, drawable, drawable2, drawable3);
        object = this.b;
        if (object != null) {
            ((o)object).b();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int n2, int n3, int n4, int n5) {
        Context context = this.getContext();
        Drawable drawable = null;
        Object object = n2 != 0 ? com.github.catvod.spider.merge.i.b.b(context, n2) : null;
        Drawable drawable2 = n3 != 0 ? com.github.catvod.spider.merge.i.b.b(context, n3) : null;
        Drawable drawable3 = n4 != 0 ? com.github.catvod.spider.merge.i.b.b(context, n4) : null;
        if (n5 != 0) {
            drawable = com.github.catvod.spider.merge.i.b.b(context, n5);
        }
        this.setCompoundDrawablesWithIntrinsicBounds((Drawable)object, drawable2, drawable3, drawable);
        object = this.b;
        if (object != null) {
            ((o)object).b();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable object, Drawable drawable, Drawable drawable2, Drawable drawable3) {
        super.setCompoundDrawablesWithIntrinsicBounds((Drawable)object, drawable, drawable2, drawable3);
        object = this.b;
        if (object != null) {
            ((o)object).b();
        }
    }

    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback((TextView)this, (ActionMode.Callback)callback));
    }

    public final void setFirstBaselineToTopHeight(int n2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(n2);
        } else {
            TextViewCompat.setFirstBaselineToTopHeight((TextView)this, (int)n2);
        }
    }

    public final void setLastBaselineToBottomHeight(int n2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(n2);
        } else {
            TextViewCompat.setLastBaselineToBottomHeight((TextView)this, (int)n2);
        }
    }

    public final void setLineHeight(int n2) {
        TextViewCompat.setLineHeight((TextView)this, (int)n2);
    }

    public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e e2 = this.a;
        if (e2 != null) {
            e2.h(colorStateList);
        }
    }

    public final void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e e2 = this.a;
        if (e2 != null) {
            e2.i(mode);
        }
    }

    public final void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.b.t(colorStateList);
        this.b.b();
    }

    public final void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.b.u(mode);
        this.b.b();
    }

    public final void setTextAppearance(Context context, int n2) {
        super.setTextAppearance(context, n2);
        o o2 = this.b;
        if (o2 != null) {
            o2.p(context, n2);
        }
    }

    public final void setTextClassifier(TextClassifier textClassifier) {
        l l2;
        if (Build.VERSION.SDK_INT < 28 && (l2 = this.c) != null) {
            l2.b(textClassifier);
            return;
        }
        super.setTextClassifier(textClassifier);
    }

    public final void setTextSize(int n2, float f2) {
        if (AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE) {
            super.setTextSize(n2, f2);
        } else {
            o o2 = this.b;
            if (o2 != null) {
                o2.v(n2, f2);
            }
        }
    }

    public final void setTypeface(Typeface typeface, int n2) {
        Typeface typeface2;
        if (this.d) {
            return;
        }
        Typeface typeface3 = typeface2 = null;
        if (typeface != null) {
            typeface3 = typeface2;
            if (n2 > 0) {
                typeface3 = TypefaceCompat.create((Context)this.getContext(), (Typeface)typeface, (int)n2);
            }
        }
        this.d = true;
        if (typeface3 != null) {
            typeface = typeface3;
        }
        try {
            super.setTypeface(typeface, n2);
            return;
        }
        finally {
            this.d = false;
        }
    }
}

