/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.optimizer;

import java.util.LinkedList;
import java.util.ListIterator;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.ast.Jump;
import org.mozilla.javascript.optimizer.BodyCodegen;
import org.mozilla.javascript.optimizer.BodyCodegen$ExceptionManager$ExceptionInfo;

class BodyCodegen$ExceptionManager {
    private LinkedList<BodyCodegen$ExceptionManager$ExceptionInfo> exceptionInfo;
    final BodyCodegen this$0;

    BodyCodegen$ExceptionManager(BodyCodegen bodyCodegen) {
        this.this$0 = bodyCodegen;
        this.exceptionInfo = new LinkedList();
    }

    private void endCatch(BodyCodegen$ExceptionManager$ExceptionInfo bodyCodegen$ExceptionManager$ExceptionInfo, int n2, int n3) {
        int[] nArray = bodyCodegen$ExceptionManager$ExceptionInfo.exceptionStarts;
        if (nArray[n2] != 0) {
            int n4 = nArray[n2];
            if (this.this$0.cfw.getLabelPC(n4) != this.this$0.cfw.getLabelPC(n3)) {
                this.this$0.cfw.addExceptionHandler(bodyCodegen$ExceptionManager$ExceptionInfo.exceptionStarts[n2], n3, bodyCodegen$ExceptionManager$ExceptionInfo.handlerLabels[n2], BodyCodegen.access$100(n2));
            }
            return;
        }
        throw new IllegalStateException("bad exception start");
    }

    private BodyCodegen$ExceptionManager$ExceptionInfo getTop() {
        return this.exceptionInfo.getLast();
    }

    void addHandler(int n2, int n3, int n4) {
        BodyCodegen$ExceptionManager$ExceptionInfo bodyCodegen$ExceptionManager$ExceptionInfo = this.getTop();
        bodyCodegen$ExceptionManager$ExceptionInfo.handlerLabels[n2] = n3;
        bodyCodegen$ExceptionManager$ExceptionInfo.exceptionStarts[n2] = n4;
    }

    void markInlineFinallyEnd(Node node, int n2) {
        Object object = this.exceptionInfo;
        ListIterator<BodyCodegen$ExceptionManager$ExceptionInfo> listIterator = ((LinkedList)object).listIterator(((LinkedList)object).size());
        while (listIterator.hasPrevious()) {
            object = listIterator.previous();
            for (int i2 = 0; i2 < 5; ++i2) {
                if (((BodyCodegen$ExceptionManager$ExceptionInfo)object).handlerLabels[i2] == 0 || ((BodyCodegen$ExceptionManager$ExceptionInfo)object).currentFinally != node) continue;
                ((BodyCodegen$ExceptionManager$ExceptionInfo)object).exceptionStarts[i2] = n2;
                ((BodyCodegen$ExceptionManager$ExceptionInfo)object).currentFinally = null;
            }
            if (((BodyCodegen$ExceptionManager$ExceptionInfo)object).finallyBlock != node) continue;
        }
    }

    void markInlineFinallyStart(Node node, int n2) {
        Object object = this.exceptionInfo;
        ListIterator<BodyCodegen$ExceptionManager$ExceptionInfo> listIterator = ((LinkedList)object).listIterator(((LinkedList)object).size());
        while (listIterator.hasPrevious()) {
            object = listIterator.previous();
            for (int i2 = 0; i2 < 5; ++i2) {
                if (((BodyCodegen$ExceptionManager$ExceptionInfo)object).handlerLabels[i2] == 0 || ((BodyCodegen$ExceptionManager$ExceptionInfo)object).currentFinally != null) continue;
                this.endCatch((BodyCodegen$ExceptionManager$ExceptionInfo)object, i2, n2);
                ((BodyCodegen$ExceptionManager$ExceptionInfo)object).exceptionStarts[i2] = 0;
                ((BodyCodegen$ExceptionManager$ExceptionInfo)object).currentFinally = node;
            }
            if (((BodyCodegen$ExceptionManager$ExceptionInfo)object).finallyBlock != node) continue;
        }
    }

    void popExceptionInfo() {
        this.exceptionInfo.removeLast();
    }

    void pushExceptionInfo(Jump object) {
        object = new BodyCodegen$ExceptionManager$ExceptionInfo(this, (Jump)object, BodyCodegen.access$000(((Jump)object).getFinally()));
        this.exceptionInfo.add((BodyCodegen$ExceptionManager$ExceptionInfo)object);
    }

    int removeHandler(int n2, int n3) {
        BodyCodegen$ExceptionManager$ExceptionInfo bodyCodegen$ExceptionManager$ExceptionInfo = this.getTop();
        int[] nArray = bodyCodegen$ExceptionManager$ExceptionInfo.handlerLabels;
        if (nArray[n2] != 0) {
            int n4 = nArray[n2];
            this.endCatch(bodyCodegen$ExceptionManager$ExceptionInfo, n2, n3);
            bodyCodegen$ExceptionManager$ExceptionInfo.handlerLabels[n2] = 0;
            return n4;
        }
        return 0;
    }

    void setHandlers(int[] nArray, int n2) {
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            if (nArray[i2] == 0) continue;
            this.addHandler(i2, nArray[i2], n2);
        }
    }
}

