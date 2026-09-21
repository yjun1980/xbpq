/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.regexp;

import org.mozilla.javascript.regexp.REGlobalData;
import org.mozilla.javascript.regexp.REProgState;

class REBackTrackData {
    final int continuationOp;
    final int continuationPc;
    final int cp;
    final int op;
    final long[] parens;
    final int pc;
    final REBackTrackData previous;
    final REProgState stateStackTop;

    REBackTrackData(REGlobalData rEGlobalData, int n2, int n3, int n4, int n5, int n6) {
        this.previous = rEGlobalData.backTrackStackTop;
        this.op = n2;
        this.pc = n3;
        this.cp = n4;
        this.continuationOp = n5;
        this.continuationPc = n6;
        this.parens = rEGlobalData.parens;
        this.stateStackTop = rEGlobalData.stateStackTop;
    }
}

