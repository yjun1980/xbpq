/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.regexp;

import java.io.Serializable;

final class RECharSet
implements Serializable {
    private static final long serialVersionUID = 7931787979395898394L;
    volatile transient byte[] bits;
    volatile transient boolean converted;
    final int length;
    final boolean sense;
    final int startIndex;
    final int strlength;

    RECharSet(int n2, int n3, int n4, boolean bl) {
        this.length = n2;
        this.startIndex = n3;
        this.strlength = n4;
        this.sense = bl;
    }
}

