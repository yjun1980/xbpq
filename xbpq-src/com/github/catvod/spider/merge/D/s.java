/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.B.b;
import com.github.catvod.spider.merge.C.v;
import com.github.catvod.spider.merge.y.a;
import com.github.catvod.spider.merge.y.d;
import java.lang.reflect.Type;
import java.util.Collection;

public final class s
implements v {
    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final <T> T c(b object, Type object2, Object iterator) {
        iterator = ((b)object).f;
        int n2 = iterator.p();
        object2 = null;
        if (n2 == 4) {
            object = iterator.K();
            iterator.o(16);
        } else if (iterator.p() == 2) {
            object = iterator.i();
            iterator.o(16);
            object = object.toString();
        } else if ((object = ((b)object).o(null)) instanceof String) {
            object = (String)object;
        } else {
            if (object instanceof Collection) {
                block10: {
                    object = (Collection)object;
                    object2 = object.iterator();
                    do {
                        boolean bl = object2.hasNext();
                        n2 = 1;
                        if (!bl) break block10;
                    } while (!((iterator = object2.next()) instanceof String) || ((String)((Object)iterator)).length() == 1);
                    n2 = 0;
                }
                if (n2 == 0) throw new d("can not cast to char[]");
                object2 = new char[object.size()];
                iterator = object.iterator();
                n2 = 0;
                while (true) {
                    object = object2;
                    if (!iterator.hasNext()) return (T)object;
                    object2[n2] = ((String)iterator.next()).charAt(0);
                    ++n2;
                }
            }
            if (object == null) {
                object = object2;
                return (T)object;
            }
            object = a.m(object);
        }
        object = ((String)object).toCharArray();
        return (T)object;
    }

    @Override
    public final int e() {
        return 4;
    }
}

