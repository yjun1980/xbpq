/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.debug.DebugFrame;
import org.mozilla.javascript.tools.debugger.Dim;
import org.mozilla.javascript.tools.debugger.Dim$1;
import org.mozilla.javascript.tools.debugger.Dim$ContextData;
import org.mozilla.javascript.tools.debugger.Dim$FunctionSource;
import org.mozilla.javascript.tools.debugger.Dim$SourceInfo;

public class Dim$StackFrame
implements DebugFrame {
    private boolean[] breakpoints;
    private Dim$ContextData contextData;
    private Dim dim;
    private Dim$FunctionSource fsource;
    private int lineNumber;
    private Scriptable scope;
    private Scriptable thisObj;

    private Dim$StackFrame(Context context, Dim dim, Dim$FunctionSource dim$FunctionSource) {
        this.dim = dim;
        this.contextData = Dim$ContextData.get(context);
        this.fsource = dim$FunctionSource;
        this.breakpoints = Dim$SourceInfo.access$2500(dim$FunctionSource.sourceInfo());
        this.lineNumber = dim$FunctionSource.firstLine();
    }

    /* synthetic */ Dim$StackFrame(Context context, Dim dim, Dim$FunctionSource dim$FunctionSource, Dim$1 dim$1) {
        this(context, dim, dim$FunctionSource);
    }

    static /* synthetic */ Scriptable access$1600(Dim$StackFrame dim$StackFrame) {
        return dim$StackFrame.scope;
    }

    static /* synthetic */ Scriptable access$1700(Dim$StackFrame dim$StackFrame) {
        return dim$StackFrame.thisObj;
    }

    public Dim$ContextData contextData() {
        return this.contextData;
    }

    public String getFunctionName() {
        return this.fsource.name();
    }

    public int getLineNumber() {
        return this.lineNumber;
    }

    public String getUrl() {
        return this.fsource.sourceInfo().url();
    }

    @Override
    public void onDebuggerStatement(Context context) {
        Dim.access$2800(this.dim, this, context);
    }

    @Override
    public void onEnter(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        Dim$ContextData.access$2600(this.contextData, this);
        this.scope = scriptable;
        this.thisObj = scriptable2;
        if (Dim.access$2700(this.dim)) {
            Dim.access$2800(this.dim, this, context);
        }
    }

    @Override
    public void onExceptionThrown(Context context, Throwable throwable) {
        Dim.access$3000(this.dim, context, throwable, this);
    }

    @Override
    public void onExit(Context context, boolean bl, Object object) {
        if (Dim.access$3100(this.dim) && !bl) {
            Dim.access$2800(this.dim, this, context);
        }
        Dim$ContextData.access$3200(this.contextData);
    }

    @Override
    public void onLineChange(Context context, int n2) {
        this.lineNumber = n2;
        if (!this.breakpoints[n2] && !Dim.access$2900(this.dim)) {
            boolean bl;
            boolean bl2 = bl = Dim$ContextData.access$1400(this.contextData);
            if (bl) {
                bl2 = bl;
                if (Dim$ContextData.access$1500(this.contextData) >= 0) {
                    bl2 = this.contextData.frameCount() <= Dim$ContextData.access$1500(this.contextData);
                }
            }
            if (!bl2) {
                return;
            }
            Dim$ContextData.access$1502(this.contextData, -1);
            Dim$ContextData.access$1402(this.contextData, false);
        }
        Dim.access$2800(this.dim, this, context);
    }

    public Object scope() {
        return this.scope;
    }

    public Dim$SourceInfo sourceInfo() {
        return this.fsource.sourceInfo();
    }

    public Object thisObj() {
        return this.thisObj;
    }
}

