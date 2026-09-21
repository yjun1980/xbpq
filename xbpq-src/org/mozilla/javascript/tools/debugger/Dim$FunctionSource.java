/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger;

import org.mozilla.javascript.tools.debugger.Dim$1;
import org.mozilla.javascript.tools.debugger.Dim$SourceInfo;

public class Dim$FunctionSource {
    private int firstLine;
    private String name;
    private Dim.SourceInfo sourceInfo;

    private Dim$FunctionSource(Dim.SourceInfo sourceInfo, int n2, String string) {
        if (string != null) {
            this.sourceInfo = sourceInfo;
            this.firstLine = n2;
            this.name = string;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* synthetic */ Dim$FunctionSource(Dim.SourceInfo sourceInfo, int n2, String string, Dim$1 dim$1) {
        this(sourceInfo, n2, string);
    }

    public int firstLine() {
        return this.firstLine;
    }

    public String name() {
        return this.name;
    }

    public Dim.SourceInfo sourceInfo() {
        return this.sourceInfo;
    }
}

