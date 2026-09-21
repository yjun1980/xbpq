/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge.I;

import com.github.catvod.spider.merge.I.Z;
import com.github.catvod.spider.merge.I.a0;
import com.github.catvod.spider.merge.i0.m;
import java.util.Comparator;
import org.json.JSONObject;

final class Y
implements Comparator<JSONObject> {
    final a0 a = Z.a;

    Y() {
    }

    @Override
    public final int compare(Object object, Object object2) {
        object = (JSONObject)object;
        object2 = (JSONObject)object2;
        object = m.x(object.optString("fileName", ""));
        String string = m.x(object2.optString("fileName", ""));
        Integer n2 = a0.a(this.a, (String)object);
        object2 = a0.a(this.a, string);
        int n3 = n2 != null && object2 != null && !n2.equals(object2) ? n2.compareTo((Integer)object2) : ((String)object).compareToIgnoreCase(string);
        return n3;
    }
}

