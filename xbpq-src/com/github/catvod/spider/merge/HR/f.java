/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.HR.n;
import com.github.catvod.spider.merge.xc.E0.b;
import com.github.catvod.spider.merge.xc.F0.a;
import com.github.catvod.spider.merge.xc.F0.c;
import com.github.catvod.spider.merge.xc.F0.j;
import com.github.catvod.spider.merge.xc.F0.l;
import com.github.catvod.spider.merge.xc.F0.q;
import java.util.ArrayList;
import java.util.Collections;

public final class f
extends n {
    public final int a;
    public final String b;

    public f(String string, int n2) {
        this.a = n2;
        switch (n2) {
            default: {
                com.github.catvod.spider.merge.xc.D0.b.y(string);
                this.b = com.github.catvod.spider.merge.xc.D0.b.u(string);
                return;
            }
            case 5: {
                StringBuilder stringBuilder = com.github.catvod.spider.merge.xc.E0.b.b();
                com.github.catvod.spider.merge.xc.E0.b.a(stringBuilder, string, false);
                this.b = com.github.catvod.spider.merge.xc.D0.b.u(com.github.catvod.spider.merge.xc.E0.b.g(stringBuilder));
                return;
            }
            case 4: {
                super();
                StringBuilder stringBuilder = com.github.catvod.spider.merge.xc.E0.b.b();
                com.github.catvod.spider.merge.xc.E0.b.a(stringBuilder, string, false);
                this.b = com.github.catvod.spider.merge.xc.D0.b.u(com.github.catvod.spider.merge.xc.E0.b.g(stringBuilder));
                return;
            }
            case 3: 
        }
        super();
        this.b = com.github.catvod.spider.merge.xc.D0.b.u(string);
    }

    public /* synthetic */ f(String string, int n2, boolean bl) {
        this.a = n2;
        this.b = string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean a(l object, l arrayList) {
        switch (this.a) {
            default: {
                return ((l)((Object)arrayList)).d.b.endsWith(this.b);
            }
            case 9: {
                return ((l)((Object)arrayList)).d.b.equals(this.b);
            }
            case 8: {
                object = ((l)((Object)arrayList)).g;
                object = object != null ? ((c)object).e("id") : "";
                return this.b.equals(object);
            }
            case 7: {
                arrayList.getClass();
                object = com.github.catvod.spider.merge.xc.E0.b.b();
                com.github.catvod.spider.merge.xc.D0.b.O(new j(0, object), arrayList);
                return com.github.catvod.spider.merge.xc.E0.b.g((StringBuilder)object).contains(this.b);
            }
            case 6: {
                return ((l)((Object)arrayList)).P().contains(this.b);
            }
            case 5: {
                return com.github.catvod.spider.merge.xc.D0.b.u(((l)((Object)arrayList)).O()).contains(this.b);
            }
            case 4: {
                return com.github.catvod.spider.merge.xc.D0.b.u(((l)((Object)arrayList)).I()).contains(this.b);
            }
            case 3: {
                return com.github.catvod.spider.merge.xc.D0.b.u(((l)((Object)arrayList)).C()).contains(this.b);
            }
            case 2: {
                object = ((l)((Object)arrayList)).g;
                boolean bl = false;
                if (object == null) {
                    return bl;
                }
                arrayList = ((c)object).e("class");
                int n2 = ((String)((Object)arrayList)).length();
                object = this.b;
                int n3 = ((String)object).length();
                boolean bl2 = bl;
                if (n2 == 0) return bl2;
                if (n2 < n3) {
                    return bl;
                }
                if (n2 == n3) {
                    return ((String)object).equalsIgnoreCase((String)((Object)arrayList));
                }
                boolean bl3 = false;
                int n4 = 0;
                for (int i2 = 0; i2 < n2; ++i2) {
                    int n5;
                    boolean bl4;
                    if (Character.isWhitespace(((String)((Object)arrayList)).charAt(i2))) {
                        bl4 = bl3;
                        n5 = n4;
                        if (bl3) {
                            if (i2 - n4 == n3 && ((String)((Object)arrayList)).regionMatches(true, n4, (String)object, 0, n3)) {
                                return true;
                            }
                            bl4 = false;
                            n5 = n4;
                        }
                    } else {
                        bl4 = bl3;
                        n5 = n4;
                        if (!bl3) {
                            n5 = i2;
                            bl4 = true;
                        }
                    }
                    bl3 = bl4;
                    n4 = n5;
                }
                bl2 = bl;
                if (!bl3) return bl2;
                bl2 = bl;
                if (n2 - n4 != n3) return bl2;
                return ((String)((Object)arrayList)).regionMatches(true, n4, (String)object, 0, n3);
            }
            case 1: {
                object = ((l)((Object)arrayList)).d();
                object.getClass();
                arrayList = new ArrayList<a>(((c)object).a);
                boolean bl = false;
                for (int i4 = 0; i4 < ((c)object).a; ++i4) {
                    if (c.i(((c)object).b[i4])) continue;
                    arrayList.add(new a(((c)object).b[i4], (String)((c)object).c[i4], (c)object));
                }
                object = Collections.unmodifiableList(arrayList).iterator();
                do {
                    boolean bl5 = bl;
                    if (!object.hasNext()) return bl5;
                } while (!com.github.catvod.spider.merge.xc.D0.b.u(((a)object.next()).a).startsWith(this.b));
                return true;
            }
            case 0: 
        }
        return ((q)((Object)arrayList)).k(this.b);
    }

    public final String toString() {
        switch (this.a) {
            default: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.b);
                return stringBuilder.toString();
            }
            case 9: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.b);
                return stringBuilder.toString();
            }
            case 8: {
                StringBuilder stringBuilder = new StringBuilder("#");
                stringBuilder.append(this.b);
                return stringBuilder.toString();
            }
            case 7: {
                return m.h(new StringBuilder(":containsWholeText("), this.b, ")");
            }
            case 6: {
                return m.h(new StringBuilder(":containsWholeOwnText("), this.b, ")");
            }
            case 5: {
                return m.h(new StringBuilder(":contains("), this.b, ")");
            }
            case 4: {
                return m.h(new StringBuilder(":containsOwn("), this.b, ")");
            }
            case 3: {
                return m.h(new StringBuilder(":containsData("), this.b, ")");
            }
            case 2: {
                StringBuilder stringBuilder = new StringBuilder(".");
                stringBuilder.append(this.b);
                return stringBuilder.toString();
            }
            case 1: {
                return m.h(new StringBuilder("[^"), this.b, "]");
            }
            case 0: 
        }
        return m.h(new StringBuilder("["), this.b, "]");
    }
}

