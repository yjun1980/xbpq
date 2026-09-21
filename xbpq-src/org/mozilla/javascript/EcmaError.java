/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.RhinoException;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;

public class EcmaError
extends RhinoException {
    private static final long serialVersionUID = -6261226256957286699L;
    private String errorMessage;
    private String errorName;

    EcmaError(String string, String string2, String string3, int n2, String string4, int n3) {
        this.recordErrorOrigin(string3, n2, string4, n3);
        this.errorName = string;
        this.errorMessage = string2;
    }

    @Deprecated
    public EcmaError(Scriptable scriptable, String string, int n2, int n3, String string2) {
        this("InternalError", ScriptRuntime.toString(scriptable), string, n2, string2, n3);
    }

    @Override
    public String details() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.errorName);
        stringBuilder.append(": ");
        stringBuilder.append(this.errorMessage);
        return stringBuilder.toString();
    }

    @Deprecated
    public int getColumnNumber() {
        return this.columnNumber();
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    @Deprecated
    public Scriptable getErrorObject() {
        return null;
    }

    @Deprecated
    public int getLineNumber() {
        return this.lineNumber();
    }

    @Deprecated
    public String getLineSource() {
        return this.lineSource();
    }

    public String getName() {
        return this.errorName;
    }

    @Deprecated
    public String getSourceName() {
        return this.sourceName();
    }
}

