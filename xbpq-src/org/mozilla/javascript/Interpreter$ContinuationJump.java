/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.io.Serializable;
import org.mozilla.javascript.Interpreter$CallFrame;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.NativeContinuation;

final class Interpreter$ContinuationJump
implements Serializable {
    private static final long serialVersionUID = 7687739156004308247L;
    Interpreter$CallFrame branchFrame;
    Interpreter$CallFrame capturedFrame;
    Object result;
    double resultDbl;

    Interpreter$ContinuationJump(NativeContinuation serializable, Interpreter$CallFrame serializable2) {
        Interpreter$CallFrame interpreter$CallFrame;
        this.capturedFrame = interpreter$CallFrame = (Interpreter$CallFrame)serializable.getImplementation();
        if (interpreter$CallFrame != null && serializable2 != null) {
            int n2 = interpreter$CallFrame.frameIndex - serializable2.frameIndex;
            Serializable serializable3 = interpreter$CallFrame;
            serializable = serializable2;
            if (n2 != 0) {
                int n3;
                if (n2 < 0) {
                    n2 = -n2;
                } else {
                    serializable = interpreter$CallFrame;
                    interpreter$CallFrame = serializable2;
                    serializable2 = serializable;
                }
                do {
                    serializable = serializable2.parentFrame;
                    n2 = n3 = n2 - 1;
                    serializable2 = serializable;
                } while (n3 != 0);
                if (((Interpreter$CallFrame)serializable).frameIndex != interpreter$CallFrame.frameIndex) {
                    Kit.codeBug();
                }
                serializable3 = serializable;
                serializable = interpreter$CallFrame;
            }
            while (serializable3 != serializable && serializable3 != null) {
                serializable3 = serializable3.parentFrame;
                serializable = ((Interpreter$CallFrame)serializable).parentFrame;
            }
            this.branchFrame = serializable3;
            if (serializable3 != null && !serializable3.frozen) {
                Kit.codeBug();
            }
        } else {
            this.branchFrame = null;
        }
    }
}

