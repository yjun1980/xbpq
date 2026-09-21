/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.regexp;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.regexp.RENode;

class CompilerState {
    int backReferenceLimit;
    int classCount;
    int cp;
    char[] cpbegin;
    int cpend;
    Context cx;
    int flags;
    int maxBackReference;
    int parenCount;
    int parenNesting;
    int progLength;
    RENode result;

    CompilerState(Context context, char[] cArray, int n2, int n3) {
        this.cx = context;
        this.cpbegin = cArray;
        this.cp = 0;
        this.cpend = n2;
        this.flags = n3;
        this.backReferenceLimit = Integer.MAX_VALUE;
        this.maxBackReference = 0;
        this.parenCount = 0;
        this.classCount = 0;
        this.progLength = 0;
    }
}

