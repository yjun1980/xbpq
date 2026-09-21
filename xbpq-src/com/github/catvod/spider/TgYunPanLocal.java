/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.google.gson.JsonObject
 */
package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.g1.g;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.regex.Pattern;

/*
 * Exception performing whole class analysis.
 * Exception performing whole class analysis ignored.
 */
public class TgYunPanLocal
extends NetPan {
    static Pattern q = Pattern.compile("background-image:url\\('([^']+)'\\)");
    private JsonObject m;
    private String n;
    private Integer o;
    private boolean p;

    public native TgYunPanLocal();

    public static native String extractAllMessageTexts(g var0);

    public static native String[] extractMovieDescription(String var0);

    private native void extracted(String var1, List var2, String var3);

    public static native /* synthetic */ void o(TgYunPanLocal var0, String var1, List var2, String var3);

    private native String p(String var1);

    @Override
    public native String detailContent(List var1);

    @Override
    public native void init(Context var1, String var2);

    public native String searchContent(String var1, boolean var2);

    public native String searchContent(String var1, boolean var2, String var3);
}

