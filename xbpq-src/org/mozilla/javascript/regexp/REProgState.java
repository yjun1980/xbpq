/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.regexp;

import org.mozilla.javascript.regexp.REBackTrackData;

class REProgState {
    final REBackTrackData backTrack;
    final int continuationOp;
    final int continuationPc;
    final int index;
    final int max;
    final int min;
    final REProgState previous;

    REProgState(REProgState rEProgState, int n2, int n3, int n4, REBackTrackData rEBackTrackData, int n5, int n6) {
        this.previous = rEProgState;
        this.min = n2;
        this.max = n3;
        this.index = n4;
        this.continuationOp = n5;
        this.continuationPc = n6;
        this.backTrack = rEBackTrackData;
    }
}

