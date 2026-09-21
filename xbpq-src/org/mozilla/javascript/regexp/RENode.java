/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.regexp;

class RENode {
    int bmsize;
    char chr;
    int flatIndex;
    boolean greedy;
    int index;
    RENode kid;
    RENode kid2;
    int kidlen;
    int length;
    int max;
    int min;
    RENode next;
    byte op;
    int parenCount;
    int parenIndex;
    boolean sense;
    int startIndex;

    RENode(byte by) {
        this.op = by;
    }
}

