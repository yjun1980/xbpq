/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.os.IInterface
 */
package com.github.catvod.spider.merge.ZP;

import android.app.Notification;
import android.os.IInterface;

public interface c
extends IInterface {
    public static final String a = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    public void cancel(String var1, int var2, String var3);

    public void cancelAll(String var1);

    public void notify(String var1, int var2, String var3, Notification var4);
}

