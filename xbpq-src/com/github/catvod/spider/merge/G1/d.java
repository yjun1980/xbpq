/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 */
package com.github.catvod.spider.merge.G1;

import com.google.gson.Gson;

public final class d {
    public static Object a(String string, Class clazz) {
        return new Gson().fromJson(string, clazz);
    }
}

