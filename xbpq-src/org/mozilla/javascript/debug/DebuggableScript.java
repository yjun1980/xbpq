/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.debug;

public interface DebuggableScript {
    public DebuggableScript getFunction(int var1);

    public int getFunctionCount();

    public String getFunctionName();

    public int[] getLineNumbers();

    public int getParamAndVarCount();

    public int getParamCount();

    public String getParamOrVarName(int var1);

    public DebuggableScript getParent();

    public String getSourceName();

    public boolean isFunction();

    public boolean isGeneratedScript();

    public boolean isTopLevel();
}

