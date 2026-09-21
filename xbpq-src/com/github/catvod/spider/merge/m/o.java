/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.view.KeyEvent
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.SubMenu
 *  androidx.core.internal.view.SupportMenu
 */
package com.github.catvod.spider.merge.m;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.core.internal.view.SupportMenu;
import com.github.catvod.spider.merge.m.b;

public class o
extends b
implements Menu {
    private final SupportMenu d;

    public o(Context context, SupportMenu supportMenu) {
        super(context);
        if (supportMenu != null) {
            this.d = supportMenu;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final MenuItem add(int n2) {
        return this.a(this.d.add(n2));
    }

    public final MenuItem add(int n2, int n3, int n4, int n5) {
        return this.a(this.d.add(n2, n3, n4, n5));
    }

    public final MenuItem add(int n2, int n3, int n4, CharSequence charSequence) {
        return this.a(this.d.add(n2, n3, n4, charSequence));
    }

    public final MenuItem add(CharSequence charSequence) {
        return this.a(this.d.add(charSequence));
    }

    public final int addIntentOptions(int n2, int n3, int n4, ComponentName componentName, Intent[] intentArray, Intent intent, int n5, MenuItem[] menuItemArray) {
        MenuItem[] menuItemArray2 = menuItemArray != null ? new MenuItem[menuItemArray.length] : null;
        n4 = this.d.addIntentOptions(n2, n3, n4, componentName, intentArray, intent, n5, menuItemArray2);
        if (menuItemArray2 != null) {
            n3 = menuItemArray2.length;
            for (n2 = 0; n2 < n3; ++n2) {
                menuItemArray[n2] = this.a(menuItemArray2[n2]);
            }
        }
        return n4;
    }

    public final SubMenu addSubMenu(int n2) {
        return this.b(this.d.addSubMenu(n2));
    }

    public final SubMenu addSubMenu(int n2, int n3, int n4, int n5) {
        return this.b(this.d.addSubMenu(n2, n3, n4, n5));
    }

    public final SubMenu addSubMenu(int n2, int n3, int n4, CharSequence charSequence) {
        return this.b(this.d.addSubMenu(n2, n3, n4, charSequence));
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.b(this.d.addSubMenu(charSequence));
    }

    public final void clear() {
        this.c();
        this.d.clear();
    }

    public final void close() {
        this.d.close();
    }

    public final MenuItem findItem(int n2) {
        return this.a(this.d.findItem(n2));
    }

    public final MenuItem getItem(int n2) {
        return this.a(this.d.getItem(n2));
    }

    public final boolean hasVisibleItems() {
        return this.d.hasVisibleItems();
    }

    public final boolean isShortcutKey(int n2, KeyEvent keyEvent) {
        return this.d.isShortcutKey(n2, keyEvent);
    }

    public final boolean performIdentifierAction(int n2, int n3) {
        return this.d.performIdentifierAction(n2, n3);
    }

    public final boolean performShortcut(int n2, KeyEvent keyEvent, int n3) {
        return this.d.performShortcut(n2, keyEvent, n3);
    }

    public final void removeGroup(int n2) {
        this.d(n2);
        this.d.removeGroup(n2);
    }

    public final void removeItem(int n2) {
        this.e(n2);
        this.d.removeItem(n2);
    }

    public final void setGroupCheckable(int n2, boolean bl, boolean bl2) {
        this.d.setGroupCheckable(n2, bl, bl2);
    }

    public final void setGroupEnabled(int n2, boolean bl) {
        this.d.setGroupEnabled(n2, bl);
    }

    public final void setGroupVisible(int n2, boolean bl) {
        this.d.setGroupVisible(n2, bl);
    }

    public final void setQwertyMode(boolean bl) {
        this.d.setQwertyMode(bl);
    }

    public final int size() {
        return this.d.size();
    }
}

