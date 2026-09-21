/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public interface RegExpProxy {
    public static final int RA_MATCH = 1;
    public static final int RA_REPLACE = 2;
    public static final int RA_REPLACE_ALL = 3;
    public static final int RA_SEARCH = 4;

    public Object action(Context var1, Scriptable var2, Scriptable var3, Object[] var4, int var5);

    public Object compileRegExp(Context var1, String var2, String var3);

    public int find_split(Context var1, Scriptable var2, String var3, String var4, Scriptable var5, int[] var6, int[] var7, boolean[] var8, String[][] var9);

    public boolean isRegExp(Scriptable var1);

    public Object js_split(Context var1, Scriptable var2, String var3, Object[] var4);

    public Scriptable wrapRegExp(Context var1, Scriptable var2, Object var3);
}

