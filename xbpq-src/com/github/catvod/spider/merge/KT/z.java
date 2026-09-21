/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.KT;

import com.github.catvod.spider.merge.KT.B;
import java.util.AbstractMap;
import java.util.HashMap;

public final class z
extends HashMap {
    public z(int n2) {
        switch (n2) {
            default: {
                ((AbstractMap)this).put("Content-Type", "application/json; charset=utf-8");
                ((AbstractMap)this).putAll(B.l.b("register"));
                return;
            }
            case 1: 
        }
        ((AbstractMap)this).put("Content-Type", "application/json; charset=utf-8");
        ((AbstractMap)this).putAll(B.l.b("torrent/register"));
    }
}

