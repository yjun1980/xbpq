/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.regexp;

import org.mozilla.javascript.regexp.REBackTrackData;
import org.mozilla.javascript.regexp.RECompiled;
import org.mozilla.javascript.regexp.REProgState;

class REGlobalData {
    REBackTrackData backTrackStackTop;
    int cp;
    boolean multiline;
    long[] parens;
    RECompiled regexp;
    int skipped;
    REProgState stateStackTop;

    REGlobalData() {
    }

    int parensIndex(int n2) {
        return (int)this.parens[n2];
    }

    int parensLength(int n2) {
        return (int)(this.parens[n2] >>> 32);
    }

    void setParens(int n2, int n3, int n4) {
        long[] lArray;
        Object object = this.backTrackStackTop;
        if (object != null && (lArray = ((REBackTrackData)object).parens) == (object = (Object)this.parens)) {
            this.parens = (long[])object.clone();
        }
        object = this.parens;
        long l2 = n3;
        object[n2] = (long)n4 << 32 | l2 & 0xFFFFFFFFL;
    }
}

