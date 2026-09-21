/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Bk;

import com.github.catvod.spider.merge.Bk.b;
import com.github.catvod.spider.merge.Bk.g;
import com.github.catvod.spider.merge.Bk.k;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class a {
    public final HashMap a;
    public final Map b;

    public a(HashMap arrayList) {
        this.b = arrayList;
        this.a = new HashMap();
        for (Map.Entry entry : ((HashMap)((Object)arrayList)).entrySet()) {
            g g2 = (g)((Object)entry.getValue());
            List list = (List)this.a.get((Object)g2);
            arrayList = list;
            if (list == null) {
                arrayList = new ArrayList();
                this.a.put(g2, arrayList);
            }
            arrayList.add(entry.getKey());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(List list, k k2, g g2, Object object) {
        if (list == null) return;
        int n2 = list.size() - 1;
        while (n2 >= 0) {
            block8: {
                Object object2;
                block5: {
                    block6: {
                        block7: {
                            object2 = (b)list.get(n2);
                            object2.getClass();
                            try {
                                int n3 = ((b)object2).a;
                                object2 = ((b)object2).b;
                                if (n3 == 0) break block5;
                                if (n3 == 1) break block6;
                                if (n3 == 2) break block7;
                                break block8;
                            }
                            catch (IllegalAccessException illegalAccessException) {
                                throw new RuntimeException(illegalAccessException);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw new RuntimeException("Failed to call observer method", invocationTargetException.getCause());
                            }
                        }
                        ((Method)object2).invoke(object, new Object[]{k2, g2});
                        break block8;
                    }
                    ((Method)object2).invoke(object, k2);
                    break block8;
                }
                ((Method)object2).invoke(object, null);
            }
            --n2;
        }
    }
}

