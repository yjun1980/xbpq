/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.content.Context
 *  com.google.gson.JsonObject
 */
package com.github.catvod.spider;

import android.app.AlertDialog;
import android.content.Context;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.Douban;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/*
 * Exception performing whole class analysis.
 * Exception performing whole class analysis ignored.
 */
public class TgYunDouBanPan
extends NetPan {
    public static final int u = 0;
    private ScheduledExecutorService m;
    private String n;
    private AlertDialog o;
    private JsonObject p;
    private String q;
    private Integer r;
    private boolean s;
    private final Douban t;

    public native TgYunDouBanPan();

    public static native void o(TgYunDouBanPan var0);

    public static native void p(TgYunDouBanPan var0);

    public static native void q(TgYunDouBanPan var0);

    public static native void r(TgYunDouBanPan var0);

    public static native void s(TgYunDouBanPan var0);

    public static native /* synthetic */ void t(TgYunDouBanPan var0);

    public static native void u(TgYunDouBanPan var0, String var1);

    private native String v(String var1);

    private native void w(String var1);

    private native void x();

    public native String categoryContent(String var1, String var2, boolean var3, HashMap var4);

    @Override
    public native String detailContent(List var1);

    public native void extracted(String var1, List var2, String var3);

    public native String homeContent(boolean var1);

    @Override
    public native void init(Context var1, String var2);

    public native String searchContent(String var1, boolean var2);

    public native String searchContent(String var1, boolean var2, String var3);

    public native void showTgInput();

    public native void startTgFlow();
}

