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
import com.github.catvod.spider.merge.e1.h;
import com.github.catvod.spider.merge.e1.m;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/*
 * Exception performing whole class analysis.
 * Exception performing whole class analysis ignored.
 */
public class Wogg
extends NetPan {
    private String m;
    private final Pattern n;
    private final Pattern o;
    private JsonObject p;

    public native Wogg();

    public static native String getIPAddress();

    public static native String o(Wogg var0, String var1);

    private native String p(m var1);

    private native void q(List var1, String var2);

    private native Map r();

    private native List s(h var1);

    private native String searchContent(String var1, String var2);

    public native String categoryContent(String var1, String var2, boolean var3, HashMap var4);

    @Override
    public native String detailContent(List var1);

    public native String homeContent(boolean var1);

    @Override
    public native void init(Context var1, String var2);

    public native String searchContent(String var1, boolean var2);

    public native String searchContent(String var1, boolean var2, String var3);
}

