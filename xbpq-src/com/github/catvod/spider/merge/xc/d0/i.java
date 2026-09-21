/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.d0;

import com.github.catvod.spider.merge.xc.d0.a;
import com.github.catvod.spider.merge.xc.d0.o;
import com.github.catvod.spider.merge.xc.d0.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public abstract class i
extends o {
    public static Object J(List list) {
        list = list.size() > 0 ? list.get(0) : null;
        return list;
    }

    public static String K(Iterable object, String string, String string2, String string3, a a2, int n2) {
        if ((n2 & 2) != 0) {
            string2 = "";
        }
        if ((n2 & 4) != 0) {
            string3 = "";
        }
        if ((n2 & 0x20) != 0) {
            a2 = null;
        }
        com.github.catvod.spider.merge.mI.i.e(object, "<this>");
        com.github.catvod.spider.merge.mI.i.e(string2, "prefix");
        com.github.catvod.spider.merge.mI.i.e(string3, "postfix");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((CharSequence)string2);
        object = object.iterator();
        n2 = 0;
        while (object.hasNext()) {
            string2 = object.next();
            boolean bl = true;
            if (++n2 > 1) {
                stringBuilder.append((CharSequence)string);
            }
            if (a2 != null) {
                stringBuilder.append((CharSequence)a2.invoke(string2));
                continue;
            }
            if (string2 != null) {
                bl = string2 instanceof CharSequence;
            }
            if (bl) {
                stringBuilder.append((CharSequence)string2);
                continue;
            }
            if (string2 instanceof Character) {
                stringBuilder.append(((Character)((Object)string2)).charValue());
                continue;
            }
            stringBuilder.append((CharSequence)String.valueOf(string2));
        }
        stringBuilder.append((CharSequence)string3);
        object = stringBuilder.toString();
        com.github.catvod.spider.merge.mI.i.d(object, "toString(...)");
        return object;
    }

    public static List L(List list, int n2) {
        if (n2 >= 0) {
            q q2 = q.a;
            if (n2 == 0) {
                return q2;
            }
            if (n2 >= list.size()) {
                return i.M(list);
            }
            if (n2 == 1) {
                if (!list.isEmpty()) {
                    return com.github.catvod.spider.merge.xc.a.a.o(list.get(0));
                }
                throw new NoSuchElementException("List is empty.");
            }
            ArrayList arrayList = new ArrayList(n2);
            list = list.iterator();
            int n3 = 0;
            while (list.hasNext()) {
                int n4;
                arrayList.add(list.next());
                n3 = n4 = n3 + 1;
                if (n4 != n2) continue;
            }
            n2 = arrayList.size();
            list = q2;
            if (n2 != 0) {
                list = n2 != 1 ? arrayList : com.github.catvod.spider.merge.xc.a.a.o(arrayList.get(0));
            }
            return list;
        }
        list = new StringBuilder("Requested element count ");
        ((StringBuilder)((Object)list)).append(n2);
        ((StringBuilder)((Object)list)).append(" is less than zero.");
        list = new IllegalArgumentException(((StringBuilder)((Object)list)).toString().toString());
        throw list;
    }

    public static List M(Iterable arrayList) {
        com.github.catvod.spider.merge.mI.i.e(arrayList, "<this>");
        boolean bl = arrayList instanceof Collection;
        List list = q.a;
        if (bl) {
            Collection collection = arrayList;
            int n2 = collection.size();
            if (n2 != 0) {
                if (n2 != 1) {
                    list = new ArrayList(collection);
                } else {
                    arrayList = arrayList instanceof List ? ((List)arrayList).get(0) : arrayList.iterator().next();
                    list = com.github.catvod.spider.merge.xc.a.a.o(arrayList);
                }
            }
            return list;
        }
        if (bl) {
            arrayList = new ArrayList(arrayList);
        } else {
            ArrayList arrayList2 = new ArrayList();
            Iterator iterator = arrayList.iterator();
            while (true) {
                arrayList = arrayList2;
                if (!iterator.hasNext()) break;
                arrayList2.add(iterator.next());
            }
        }
        int n3 = arrayList.size();
        if (n3 != 0) {
            list = n3 != 1 ? arrayList : com.github.catvod.spider.merge.xc.a.a.o(arrayList.get(0));
        }
        return list;
    }
}

