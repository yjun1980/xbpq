/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.io.Serializable;

public final class ScriptStackElement
implements Serializable {
    private static final long serialVersionUID = -6416688260860477449L;
    public final String fileName;
    public final String functionName;
    public final int lineNumber;

    public ScriptStackElement(String string, String string2, int n2) {
        this.fileName = string;
        this.functionName = string2;
        this.lineNumber = n2;
    }

    private void appendV8Location(StringBuilder stringBuilder) {
        stringBuilder.append(this.fileName);
        stringBuilder.append(':');
        int n2 = this.lineNumber;
        if (n2 <= -1) {
            n2 = 0;
        }
        stringBuilder.append(n2);
        stringBuilder.append(":0");
    }

    public void renderJavaStyle(StringBuilder stringBuilder) {
        stringBuilder.append("\tat ");
        stringBuilder.append(this.fileName);
        if (this.lineNumber > -1) {
            stringBuilder.append(':');
            stringBuilder.append(this.lineNumber);
        }
        if (this.functionName != null) {
            stringBuilder.append(" (");
            stringBuilder.append(this.functionName);
            stringBuilder.append(')');
        }
    }

    public void renderMozillaStyle(StringBuilder stringBuilder) {
        String string = this.functionName;
        if (string != null) {
            stringBuilder.append(string);
            stringBuilder.append("()");
        }
        stringBuilder.append('@');
        stringBuilder.append(this.fileName);
        if (this.lineNumber > -1) {
            stringBuilder.append(':');
            stringBuilder.append(this.lineNumber);
        }
    }

    public void renderV8Style(StringBuilder stringBuilder) {
        stringBuilder.append("    at ");
        String string = this.functionName;
        if (string != null && !"anonymous".equals(string) && !"undefined".equals(this.functionName)) {
            stringBuilder.append(this.functionName);
            stringBuilder.append(" (");
            this.appendV8Location(stringBuilder);
            stringBuilder.append(')');
        } else {
            this.appendV8Location(stringBuilder);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.renderMozillaStyle(stringBuilder);
        return stringBuilder.toString();
    }
}

