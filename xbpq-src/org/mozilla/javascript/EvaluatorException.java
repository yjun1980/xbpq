/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.RhinoException;

public class EvaluatorException
extends RhinoException {
    private static final long serialVersionUID = -8743165779676009808L;

    public EvaluatorException(String string) {
        super(string);
    }

    public EvaluatorException(String string, String string2, int n2) {
        this(string, string2, n2, null, 0);
    }

    public EvaluatorException(String string, String string2, int n2, String string3, int n3) {
        super(string);
        this.recordErrorOrigin(string2, n2, string3, n3);
    }

    @Deprecated
    public int getColumnNumber() {
        return this.columnNumber();
    }

    @Deprecated
    public int getLineNumber() {
        return this.lineNumber();
    }

    @Deprecated
    public String getLineSource() {
        return this.lineSource();
    }

    @Deprecated
    public String getSourceName() {
        return this.sourceName();
    }
}

