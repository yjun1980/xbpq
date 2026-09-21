/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.InflateException
 *  android.view.MenuItem
 *  android.view.MenuItem$OnMenuItemClickListener
 */
package com.github.catvod.spider.merge.l;

import android.view.InflateException;
import android.view.MenuItem;
import com.github.catvod.spider.merge.B.h;
import java.lang.reflect.Method;

final class c
implements MenuItem.OnMenuItemClickListener {
    private static final Class<?>[] c = new Class[]{MenuItem.class};
    private Object a;
    private Method b;

    public c(Object object, String string) {
        this.a = object;
        Class<?> clazz = object.getClass();
        try {
            this.b = clazz.getMethod(string, c);
            return;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Couldn't resolve menu item onClick handler ");
            stringBuilder.append(string);
            stringBuilder.append(" in class ");
            string = new InflateException(h.e(clazz, stringBuilder));
            ((Throwable)((Object)string)).initCause(exception);
            throw string;
        }
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        try {
            if (this.b.getReturnType() == Boolean.TYPE) {
                return (Boolean)this.b.invoke(this.a, menuItem);
            }
            this.b.invoke(this.a, menuItem);
            return true;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }
}

