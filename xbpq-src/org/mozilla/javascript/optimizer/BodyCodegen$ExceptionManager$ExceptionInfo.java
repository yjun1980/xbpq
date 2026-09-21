/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.optimizer;

import org.mozilla.javascript.Node;
import org.mozilla.javascript.ast.Jump;
import org.mozilla.javascript.optimizer.BodyCodegen$ExceptionManager;

class BodyCodegen$ExceptionManager$ExceptionInfo {
    Node currentFinally;
    int[] exceptionStarts;
    Node finallyBlock;
    int[] handlerLabels;
    final BodyCodegen.ExceptionManager this$1;

    BodyCodegen$ExceptionManager$ExceptionInfo(BodyCodegen.ExceptionManager exceptionManager, Jump jump, Node node) {
        this.this$1 = exceptionManager;
        this.finallyBlock = node;
        this.handlerLabels = new int[5];
        this.exceptionStarts = new int[5];
        this.currentFinally = null;
    }
}

