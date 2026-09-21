/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.ActionMode$Callback
 *  android.view.View
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputConnection
 *  android.widget.AutoCompleteTextView
 *  android.widget.TextView
 *  androidx.core.view.TintableBackgroundView
 *  androidx.core.widget.TextViewCompat
 */
package com.github.catvod.spider.merge.n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TextViewCompat;
import com.github.catvod.spider.merge.i.b;
import com.github.catvod.spider.merge.n.H;
import com.github.catvod.spider.merge.n.I;
import com.github.catvod.spider.merge.n.L;
import com.github.catvod.spider.merge.n.e;
import com.github.catvod.spider.merge.n.h;
import com.github.catvod.spider.merge.n.o;

public class d
extends AutoCompleteTextView
implements TintableBackgroundView {
    private static final int[] c = new int[]{16843126};
    private final e a;
    private final o b;

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130903095);
    }

    public d(Context object, AttributeSet attributeSet, int n2) {
        I.a((Context)object);
        super((Context)object, attributeSet, 2130903095);
        H.a((View)this, this.getContext());
        object = L.s(this.getContext(), attributeSet, c, 2130903095, 0);
        if (((L)object).p(0)) {
            this.setDropDownBackgroundDrawable(((L)object).f(0));
        }
        ((L)object).t();
        this.a = object = new e((View)this);
        ((e)object).d(attributeSet, 2130903095);
        this.b = object = new o((TextView)this);
        ((o)object).m(attributeSet, 2130903095);
        ((o)object).b();
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

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnection = super.onCreateInputConnection(editorInfo);
        h.a(inputConnection, editorInfo, (View)this);
        return inputConnection;
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

    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback((TextView)this, (ActionMode.Callback)callback));
    }

    public final void setDropDownBackgroundResource(int n2) {
        this.setDropDownBackgroundDrawable(com.github.catvod.spider.merge.i.b.b(this.getContext(), n2));
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

    public final void setTextAppearance(Context context, int n2) {
        super.setTextAppearance(context, n2);
        o o2 = this.b;
        if (o2 != null) {
            o2.p(context, n2);
        }
    }
}

