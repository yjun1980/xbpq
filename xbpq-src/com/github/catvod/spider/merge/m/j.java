/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.util.Log
 *  android.view.ActionProvider
 *  android.view.CollapsibleActionView
 *  android.view.ContextMenu$ContextMenuInfo
 *  android.view.MenuItem
 *  android.view.MenuItem$OnActionExpandListener
 *  android.view.MenuItem$OnMenuItemClickListener
 *  android.view.SubMenu
 *  android.view.View
 *  androidx.core.internal.view.SupportMenuItem
 *  androidx.core.view.ActionProvider
 */
package com.github.catvod.spider.merge.m;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.internal.view.SupportMenuItem;
import com.github.catvod.spider.merge.m.b;
import com.github.catvod.spider.merge.m.e;
import com.github.catvod.spider.merge.m.f;
import com.github.catvod.spider.merge.m.g;
import com.github.catvod.spider.merge.m.h;
import com.github.catvod.spider.merge.m.i;
import java.lang.reflect.Method;

public final class j
extends b
implements MenuItem {
    private final SupportMenuItem d;
    private Method e;

    public j(Context context, SupportMenuItem supportMenuItem) {
        super(context);
        if (supportMenuItem != null) {
            this.d = supportMenuItem;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final boolean collapseActionView() {
        return this.d.collapseActionView();
    }

    public final boolean expandActionView() {
        return this.d.expandActionView();
    }

    public final void f() {
        try {
            if (this.e == null) {
                this.e = this.d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.e.invoke(this.d, Boolean.TRUE);
        }
        catch (Exception exception) {
            Log.w((String)"MenuItemWrapper", (String)"Error while calling setExclusiveCheckable", (Throwable)exception);
        }
    }

    public final ActionProvider getActionProvider() {
        androidx.core.view.ActionProvider actionProvider = this.d.getSupportActionProvider();
        if (actionProvider instanceof e) {
            return ((e)actionProvider).a;
        }
        return null;
    }

    public final View getActionView() {
        View view;
        View view2 = view = this.d.getActionView();
        if (view instanceof g) {
            view2 = (View)((g)view).a;
        }
        return view2;
    }

    public final int getAlphabeticModifiers() {
        return this.d.getAlphabeticModifiers();
    }

    public final char getAlphabeticShortcut() {
        return this.d.getAlphabeticShortcut();
    }

    public final CharSequence getContentDescription() {
        return this.d.getContentDescription();
    }

    public final int getGroupId() {
        return this.d.getGroupId();
    }

    public final Drawable getIcon() {
        return this.d.getIcon();
    }

    public final ColorStateList getIconTintList() {
        return this.d.getIconTintList();
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.d.getIconTintMode();
    }

    public final Intent getIntent() {
        return this.d.getIntent();
    }

    public final int getItemId() {
        return this.d.getItemId();
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.d.getMenuInfo();
    }

    public final int getNumericModifiers() {
        return this.d.getNumericModifiers();
    }

    public final char getNumericShortcut() {
        return this.d.getNumericShortcut();
    }

    public final int getOrder() {
        return this.d.getOrder();
    }

    public final SubMenu getSubMenu() {
        return this.b(this.d.getSubMenu());
    }

    public final CharSequence getTitle() {
        return this.d.getTitle();
    }

    public final CharSequence getTitleCondensed() {
        return this.d.getTitleCondensed();
    }

    public final CharSequence getTooltipText() {
        return this.d.getTooltipText();
    }

    public final boolean hasSubMenu() {
        return this.d.hasSubMenu();
    }

    public final boolean isActionViewExpanded() {
        return this.d.isActionViewExpanded();
    }

    public final boolean isCheckable() {
        return this.d.isCheckable();
    }

    public final boolean isChecked() {
        return this.d.isChecked();
    }

    public final boolean isEnabled() {
        return this.d.isEnabled();
    }

    public final boolean isVisible() {
        return this.d.isVisible();
    }

    public final MenuItem setActionProvider(ActionProvider object) {
        f f2 = new f(this, this.a, (ActionProvider)object);
        SupportMenuItem supportMenuItem = this.d;
        object = object != null ? f2 : null;
        supportMenuItem.setSupportActionProvider((androidx.core.view.ActionProvider)object);
        return this;
    }

    public final MenuItem setActionView(int n2) {
        this.d.setActionView(n2);
        View view = this.d.getActionView();
        if (view instanceof CollapsibleActionView) {
            this.d.setActionView((View)new g(view));
        }
        return this;
    }

    public final MenuItem setActionView(View view) {
        Object object = view;
        if (view instanceof CollapsibleActionView) {
            object = new g(view);
        }
        this.d.setActionView(object);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c2) {
        this.d.setAlphabeticShortcut(c2);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c2, int n2) {
        this.d.setAlphabeticShortcut(c2, n2);
        return this;
    }

    public final MenuItem setCheckable(boolean bl) {
        this.d.setCheckable(bl);
        return this;
    }

    public final MenuItem setChecked(boolean bl) {
        this.d.setChecked(bl);
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.d.setContentDescription(charSequence);
        return this;
    }

    public final MenuItem setEnabled(boolean bl) {
        this.d.setEnabled(bl);
        return this;
    }

    public final MenuItem setIcon(int n2) {
        this.d.setIcon(n2);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.d.setIcon(drawable);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.d.setIconTintList(colorStateList);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.d.setIconTintMode(mode);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.d.setIntent(intent);
        return this;
    }

    public final MenuItem setNumericShortcut(char c2) {
        this.d.setNumericShortcut(c2);
        return this;
    }

    public final MenuItem setNumericShortcut(char c2, int n2) {
        this.d.setNumericShortcut(c2, n2);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        SupportMenuItem supportMenuItem = this.d;
        onActionExpandListener = onActionExpandListener != null ? new h(this, onActionExpandListener) : null;
        supportMenuItem.setOnActionExpandListener(onActionExpandListener);
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        SupportMenuItem supportMenuItem = this.d;
        onMenuItemClickListener = onMenuItemClickListener != null ? new i(this, onMenuItemClickListener) : null;
        supportMenuItem.setOnMenuItemClickListener(onMenuItemClickListener);
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3) {
        this.d.setShortcut(c2, c3);
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3, int n2, int n3) {
        this.d.setShortcut(c2, c3, n2, n3);
        return this;
    }

    public final void setShowAsAction(int n2) {
        this.d.setShowAsAction(n2);
    }

    public final MenuItem setShowAsActionFlags(int n2) {
        this.d.setShowAsActionFlags(n2);
        return this;
    }

    public final MenuItem setTitle(int n2) {
        this.d.setTitle(n2);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.d.setTitle(charSequence);
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.d.setTitleCondensed(charSequence);
        return this;
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.d.setTooltipText(charSequence);
        return this;
    }

    public final MenuItem setVisible(boolean bl) {
        return this.d.setVisible(bl);
    }
}

