/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Parser$1;
import org.mozilla.javascript.ast.AstNode;

class Parser$ConditionData {
    AstNode condition;
    int lp = -1;
    int rp = -1;

    private Parser$ConditionData() {
    }

    /* synthetic */ Parser$ConditionData(Parser$1 parser$1) {
        this();
    }
}

