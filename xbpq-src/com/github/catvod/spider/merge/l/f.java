/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.l;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.l.d;

final class f
extends d {
    static final int b = Integer.numberOfLeadingZeros(31);
    static final f c = new f();

    f() {
        super(cYh.d("243820231A3B133329342574103828253229173122347F73"));
    }

    @Override
    public final boolean b(char c2) {
        int n2 = b;
        boolean bl = cYh.d("85D0C3B2D7DA6A92C4B3D7D085D0C4B3D7DA84D0C1B3D7F36CB3C1D1B5DAEFB2C1D2B5DBF8B3C1D1B6C0E75961B3D7DC85D0C0B3D7F5A5F04DB3D7D384D0C1B3D7DE84D0C1B2D7DA85D0E95BB5DAE0B3C1D1").charAt(1682554634 * c2 >>> n2) == c2;
        return bl;
    }
}

