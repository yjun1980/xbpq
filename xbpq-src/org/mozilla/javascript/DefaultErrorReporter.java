/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.ErrorReporter;
import org.mozilla.javascript.EvaluatorException;
import org.mozilla.javascript.ScriptRuntime;

class DefaultErrorReporter
implements ErrorReporter {
    static final DefaultErrorReporter instance = new DefaultErrorReporter();
    private ErrorReporter chainedReporter;
    private boolean forEval;

    private DefaultErrorReporter() {
    }

    static ErrorReporter forEval(ErrorReporter errorReporter) {
        DefaultErrorReporter defaultErrorReporter = new DefaultErrorReporter();
        defaultErrorReporter.forEval = true;
        defaultErrorReporter.chainedReporter = errorReporter;
        return defaultErrorReporter;
    }

    @Override
    public void error(String string, String string2, int n2, String string3, int n3) {
        if (this.forEval) {
            String string4;
            if (string.startsWith("TypeError: ")) {
                string = string.substring(11);
                string4 = "TypeError";
            } else {
                string4 = "SyntaxError";
            }
            throw ScriptRuntime.constructError(string4, string, string2, n2, string3, n3);
        }
        ErrorReporter errorReporter = this.chainedReporter;
        if (errorReporter != null) {
            errorReporter.error(string, string2, n2, string3, n3);
            return;
        }
        throw this.runtimeError(string, string2, n2, string3, n3);
    }

    @Override
    public EvaluatorException runtimeError(String string, String string2, int n2, String string3, int n3) {
        ErrorReporter errorReporter = this.chainedReporter;
        if (errorReporter != null) {
            return errorReporter.runtimeError(string, string2, n2, string3, n3);
        }
        return new EvaluatorException(string, string2, n2, string3, n3);
    }

    @Override
    public void warning(String string, String string2, int n2, String string3, int n3) {
        ErrorReporter errorReporter = this.chainedReporter;
        if (errorReporter != null) {
            errorReporter.warning(string, string2, n2, string3, n3);
        }
    }
}

