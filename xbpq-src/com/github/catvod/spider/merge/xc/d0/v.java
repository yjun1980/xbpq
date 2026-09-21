/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.d0;

import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.D0.b;
import com.github.catvod.spider.merge.xc.d0.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class v
extends b {
    public static int S(int n2) {
        if (n2 >= 0) {
            n2 = n2 < 3 ? ++n2 : (n2 < 0x40000000 ? (int)((float)n2 / 0.75f + 1.0f) : Integer.MAX_VALUE);
        }
        return n2;
    }

    public static Map T(com.github.catvod.spider.merge.xc.c0.b object) {
        i.e(object, "pair");
        object = Collections.singletonMap(((com.github.catvod.spider.merge.xc.c0.b)object).a, ((com.github.catvod.spider.merge.xc.c0.b)object).b);
        i.d(object, "singletonMap(...)");
        return object;
    }

    public static Map U(com.github.catvod.spider.merge.xc.c0.b ... object) {
        if (((com.github.catvod.spider.merge.xc.c0.b[])object).length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(v.S(((com.github.catvod.spider.merge.xc.c0.b[])object).length));
            v.V(linkedHashMap, object);
            object = linkedHashMap;
        } else {
            object = r.a;
        }
        return object;
    }

    public static final void V(LinkedHashMap linkedHashMap, com.github.catvod.spider.merge.xc.c0.b[] bArray) {
        for (com.github.catvod.spider.merge.xc.c0.b b2 : bArray) {
            linkedHashMap.put(b2.a, b2.b);
        }
    }

    public static Map W(ArrayList object) {
        Object object2 = r.a;
        int n2 = object.size();
        if (n2 != 0) {
            if (n2 != 1) {
                LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(v.S(object.size()));
                object = ((ArrayList)object).iterator();
                while (true) {
                    object2 = linkedHashMap;
                    if (object.hasNext()) {
                        object2 = (com.github.catvod.spider.merge.xc.c0.b)object.next();
                        linkedHashMap.put(((com.github.catvod.spider.merge.xc.c0.b)object2).a, ((com.github.catvod.spider.merge.xc.c0.b)object2).b);
                        continue;
                    }
                    break;
                }
            } else {
                object2 = v.T((com.github.catvod.spider.merge.xc.c0.b)object.get(0));
            }
        }
        return object2;
    }

    public static LinkedHashMap X(Map map) {
        i.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}

