/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H;

import java.util.AbstractMap;
import java.util.HashMap;

final class x
extends HashMap<Class, String> {
    x() {
        super(8);
        ((AbstractMap)this).put(Boolean.TYPE, "Z");
        ((AbstractMap)this).put(Character.TYPE, "C");
        ((AbstractMap)this).put(Byte.TYPE, "B");
        ((AbstractMap)this).put(Short.TYPE, "S");
        ((AbstractMap)this).put(Integer.TYPE, "I");
        ((AbstractMap)this).put(Long.TYPE, "J");
        ((AbstractMap)this).put(Float.TYPE, "F");
        ((AbstractMap)this).put(Double.TYPE, "D");
    }
}

