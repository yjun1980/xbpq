/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.ObjArray;
import org.mozilla.javascript.tools.debugger.Dim$StackFrame;

public class Dim$ContextData {
    private boolean breakNextLine;
    private boolean eventThreadFlag;
    private ObjArray frameStack = new ObjArray();
    private Throwable lastProcessedException;
    private int stopAtFrameDepth = -1;

    static /* synthetic */ boolean access$1400(Dim$ContextData dim$ContextData) {
        return dim$ContextData.breakNextLine;
    }

    static /* synthetic */ boolean access$1402(Dim$ContextData dim$ContextData, boolean bl) {
        dim$ContextData.breakNextLine = bl;
        return bl;
    }

    static /* synthetic */ int access$1500(Dim$ContextData dim$ContextData) {
        return dim$ContextData.stopAtFrameDepth;
    }

    static /* synthetic */ int access$1502(Dim$ContextData dim$ContextData, int n2) {
        dim$ContextData.stopAtFrameDepth = n2;
        return n2;
    }

    static /* synthetic */ void access$2600(Dim$ContextData dim$ContextData, Dim$StackFrame dim$StackFrame) {
        dim$ContextData.pushFrame(dim$StackFrame);
    }

    static /* synthetic */ Throwable access$300(Dim$ContextData dim$ContextData) {
        return dim$ContextData.lastProcessedException;
    }

    static /* synthetic */ Throwable access$302(Dim$ContextData dim$ContextData, Throwable throwable) {
        dim$ContextData.lastProcessedException = throwable;
        return throwable;
    }

    static /* synthetic */ void access$3200(Dim$ContextData dim$ContextData) {
        dim$ContextData.popFrame();
    }

    static /* synthetic */ boolean access$400(Dim$ContextData dim$ContextData) {
        return dim$ContextData.eventThreadFlag;
    }

    static /* synthetic */ boolean access$402(Dim$ContextData dim$ContextData, boolean bl) {
        dim$ContextData.eventThreadFlag = bl;
        return bl;
    }

    public static Dim$ContextData get(Context context) {
        return (Dim$ContextData)context.getDebuggerContextData();
    }

    private void popFrame() {
        this.frameStack.pop();
    }

    private void pushFrame(Dim$StackFrame dim$StackFrame) {
        this.frameStack.push(dim$StackFrame);
    }

    public int frameCount() {
        return this.frameStack.size();
    }

    public Dim$StackFrame getFrame(int n2) {
        int n3 = this.frameStack.size();
        return (Dim$StackFrame)this.frameStack.get(n3 - n2 - 1);
    }
}

