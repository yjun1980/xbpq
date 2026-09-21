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
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/*
 * Exception performing whole class analysis.
 * Exception performing whole class analysis ignored.
 */
public class GuanYing
extends NetPan {
    private static String q = "";
    private String m;
    private String n;
    private String o;
    private ConcurrentHashMap<String, JsonObject> p;

    public native GuanYing();

    private native HashMap getHeader();

    private native void o();

    private native String p(String var1);

    private native String q();

    private static native String r();

    private native void s();

    private native boolean t(String var1);

    private native String u(String var1, String var2, String var3);

    public native String categoryContent(String var1, String var2, boolean var3, HashMap var4);

    @Override
    public native String detailContent(List var1);

    public native String homeContent(boolean var1);

    @Override
    public native void init(Context var1, String var2);

    public native String searchContent(String var1, boolean var2);
}

