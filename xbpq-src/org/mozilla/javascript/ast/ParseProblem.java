/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.ast.ParseProblem$Type;

public class ParseProblem {
    private int length;
    private String message;
    private int offset;
    private String sourceName;
    private ParseProblem$Type type;

    public ParseProblem(ParseProblem$Type parseProblem$Type, String string, String string2, int n2, int n3) {
        this.setType(parseProblem$Type);
        this.setMessage(string);
        this.setSourceName(string2);
        this.setFileOffset(n2);
        this.setLength(n3);
    }

    public int getFileOffset() {
        return this.offset;
    }

    public int getLength() {
        return this.length;
    }

    public String getMessage() {
        return this.message;
    }

    public String getSourceName() {
        return this.sourceName;
    }

    public ParseProblem$Type getType() {
        return this.type;
    }

    public void setFileOffset(int n2) {
        this.offset = n2;
    }

    public void setLength(int n2) {
        this.length = n2;
    }

    public void setMessage(String string) {
        this.message = string;
    }

    public void setSourceName(String string) {
        this.sourceName = string;
    }

    public void setType(ParseProblem$Type parseProblem$Type) {
        this.type = parseProblem$Type;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(200);
        stringBuilder.append(this.sourceName);
        stringBuilder.append(":");
        stringBuilder.append("offset=");
        stringBuilder.append(this.offset);
        stringBuilder.append(",");
        stringBuilder.append("length=");
        stringBuilder.append(this.length);
        stringBuilder.append(",");
        String string = this.type == ParseProblem$Type.Error ? "error: " : "warning: ";
        stringBuilder.append(string);
        stringBuilder.append(this.message);
        return stringBuilder.toString();
    }
}

