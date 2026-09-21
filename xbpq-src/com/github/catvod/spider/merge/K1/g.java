/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.K1;

import com.github.catvod.spider.merge.F0.e;
import com.github.catvod.spider.merge.K1.p;
import com.github.catvod.spider.merge.k1.c;
import com.github.catvod.spider.merge.s1.a;
import com.github.catvod.spider.merge.x1.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public final class g {
    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Optional a(String object) {
        void var0_3;
        if (((String)object).contains("-")) {
            String[] stringArray = ((String)object).split("-", -1);
            if (stringArray.length > 2) {
                Locale locale = new Locale(stringArray[0], stringArray[1], stringArray[2]);
                return Optional.of(var0_3);
            }
            if (stringArray.length > 1) {
                Locale locale = new Locale(stringArray[0], stringArray[1]);
                return Optional.of(var0_3);
            }
            if (stringArray.length != 1) return Optional.empty();
            Locale locale = new Locale(stringArray[0]);
            return Optional.of(var0_3);
        }
        if (((String)object).contains("_")) {
            String[] stringArray = ((String)object).split("_", -1);
            if (stringArray.length > 2) {
                Locale locale = new Locale(stringArray[0], stringArray[1], stringArray[2]);
                return Optional.of(var0_3);
            }
            if (stringArray.length > 1) {
                Locale locale = new Locale(stringArray[0], stringArray[1]);
                return Optional.of(var0_3);
            }
            if (stringArray.length != 1) return Optional.empty();
            Locale locale = new Locale(stringArray[0]);
            return Optional.of(var0_3);
        }
        Locale locale = new Locale((String)object);
        return Optional.of(var0_3);
    }

    public static List b(String object, e arrayList) {
        Serializable serializable = ((e)((Object)arrayList)).b("avatars");
        if (!p.k(serializable)) {
            object = serializable.c().filter(b.a).map(new a((String)object, 1)).collect(Collectors.toList());
        } else {
            serializable = ((e)((Object)arrayList)).g("avatar");
            if (!p.j((String)((Object)(arrayList = ((e)serializable).i("path", null))))) {
                serializable = new c(com.github.catvod.spider.merge.B.e.c(object, (String)((Object)arrayList)), -1, ((e)serializable).e("width", -1), 4);
                arrayList = new ArrayList<Object>(1);
                for (int i2 = 0; i2 < 1; ++i2) {
                    object = (new Object[]{serializable})[i2];
                    Objects.requireNonNull(object);
                    arrayList.add(object);
                }
                object = Collections.unmodifiableList(arrayList);
            } else {
                object = Collections.emptyList();
            }
        }
        return object;
    }

    public static List c(String string, e object) {
        ArrayList<c> arrayList = new ArrayList<c>(2);
        String string2 = ((e)object).i("thumbnailPath", null);
        if (!p.j(string2)) {
            arrayList.add(new c(com.github.catvod.spider.merge.B.e.c(string, string2), -1, -1, 3));
        }
        if (!p.j((String)(object = ((e)object).i("previewPath", null)))) {
            arrayList.add(new c(com.github.catvod.spider.merge.B.e.c(string, (String)object), -1, -1, 2));
        }
        return Collections.unmodifiableList(arrayList);
    }
}

