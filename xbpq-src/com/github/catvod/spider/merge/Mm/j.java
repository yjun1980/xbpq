/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.spider.merge.Mm.f
 *  com.github.catvod.spider.merge.gu.I
 */
package com.github.catvod.spider.merge.Mm;

import com.github.catvod.spider.merge.Mm.f;
import com.github.catvod.spider.merge.Mm.i;
import com.github.catvod.spider.merge.gu.H;
import com.github.catvod.spider.merge.gu.I;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public final class j
implements f {
    protected List<i> a;
    protected boolean b;

    static {
        j.g(0, 0x10FFFF).i();
        new j(new int[0]).i();
    }

    public j(int ... nArray) {
        this.a = new ArrayList<i>(nArray.length);
        int n2 = nArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            this.a(nArray[i2]);
        }
    }

    public static j g(int n2, int n3) {
        j j2 = new j(new int[0]);
        j2.b(n2, n3);
        return j2;
    }

    public static j k(j object, j j2) {
        j j3;
        block6: {
            boolean bl = ((j)object).f();
            int n2 = 0;
            if (bl) {
                return new j(new int[0]);
            }
            j3 = new j(new int[0]);
            j3.c((f)object);
            if (j2.f()) break block6;
            int n3 = 0;
            while (n2 < ((ArrayList)j3.a).size() && n3 < ((ArrayList)j2.a).size()) {
                List<i> list;
                block10: {
                    block7: {
                        i i2;
                        block9: {
                            block8: {
                                i2 = (i)((ArrayList)j3.a).get(n2);
                                object = (i)((ArrayList)j2.a).get(n3);
                                int n4 = ((i)object).b;
                                int n5 = i2.a;
                                if (n4 < n5) break block7;
                                int n6 = ((i)object).a;
                                int n7 = i2.b;
                                if (n6 > n7) break block8;
                                i2 = null;
                                object = n6 > n5 ? new i(n5, n6 - 1) : null;
                                if (n4 < n7) {
                                    i2 = new i(n4 + 1, n7);
                                }
                                list = j3.a;
                                if (object == null) break block9;
                                ((ArrayList)list).set(n2, (i)object);
                                if (i2 == null) break block8;
                                object = j3.a;
                                ((ArrayList)object).add(++n2, (i)i2);
                                break block7;
                            }
                            ++n2;
                            continue;
                        }
                        if (i2 == null) break block10;
                        ((ArrayList)list).set(n2, i2);
                    }
                    ++n3;
                    continue;
                }
                ((ArrayList)list).remove(n2);
            }
        }
        return j3;
    }

    public final void a(int n2) {
        if (!this.b) {
            this.b(n2, n2);
            return;
        }
        throw new IllegalStateException("can't alter readonly IntervalSet");
    }

    public final void b(int n2, int n3) {
        i i2 = i.b(n2, n3);
        if (!this.b) {
            block6: {
                if (i2.b >= i2.a) {
                    ListIterator<i> listIterator = ((ArrayList)this.a).listIterator();
                    while (listIterator.hasNext()) {
                        i i4 = (i)listIterator.next();
                        if (i2.equals(i4)) break block6;
                        int n4 = i2.a;
                        n2 = i4.b;
                        n3 = 1;
                        n2 = n4 != n2 + 1 && i2.b != i4.a - 1 ? 0 : 1;
                        if (n2 == 0 && i2.a(i4)) {
                            n2 = i2.a;
                            n4 = i4.a;
                            n2 = n2 < n4 && i2.b < n4 ? n3 : 0;
                            if (n2 == 0) continue;
                            listIterator.previous();
                            listIterator.add(i2);
                            break block6;
                        }
                        i4 = i2.c(i4);
                        listIterator.set(i4);
                        while (listIterator.hasNext()) {
                            i2 = (i)listIterator.next();
                            n2 = i4.a != i2.b + 1 && i4.b != i2.a - 1 ? 0 : 1;
                            if (n2 != 0 || !i4.a(i2)) {
                                listIterator.remove();
                                listIterator.previous();
                                listIterator.set(i4.c(i2));
                                listIterator.next();
                                continue;
                            }
                            break block6;
                        }
                        break block6;
                    }
                    ((ArrayList)this.a).add(i2);
                }
            }
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("can't alter readonly IntervalSet");
        throw illegalStateException;
    }

    public final j c(f object) {
        int n2;
        if (object == null) {
            return this;
        }
        boolean bl = object instanceof j;
        int n3 = 0;
        if (bl) {
            object = (j)object;
            n3 = ((ArrayList)((j)object).a).size();
            for (n2 = 0; n2 < n3; ++n2) {
                i i2 = (i)((ArrayList)((j)object).a).get(n2);
                this.b(i2.a, i2.b);
            }
        } else {
            j j2 = (j)object;
            object = new ArrayList();
            int n4 = ((ArrayList)j2.a).size();
            for (n2 = n3; n2 < n4; ++n2) {
                i i4 = (i)((ArrayList)j2.a).get(n2);
                int n5 = i4.b;
                for (n3 = i4.a; n3 <= n5; ++n3) {
                    ((ArrayList)object).add(n3);
                }
            }
            object = ((ArrayList)object).iterator();
            while (object.hasNext()) {
                this.a((Integer)object.next());
            }
        }
        return this;
    }

    public final boolean d(int n2) {
        int n3 = ((ArrayList)this.a).size() - 1;
        int n4 = 0;
        while (n4 <= n3) {
            int n5 = (n4 + n3) / 2;
            i i2 = (i)((ArrayList)this.a).get(n5);
            int n6 = i2.a;
            if (i2.b < n2) {
                n4 = n5 + 1;
                continue;
            }
            if (n6 > n2) {
                n3 = n5 - 1;
                continue;
            }
            return true;
        }
        return false;
    }

    public final int e() {
        if (!this.f()) {
            return ((i)((ArrayList)this.a).get((int)0)).a;
        }
        throw new RuntimeException("set is empty");
    }

    public final boolean equals(Object object) {
        if (object != null && object instanceof j) {
            object = (j)object;
            return this.a.equals(((j)object).a);
        }
        return false;
    }

    public final boolean f() {
        List<i> list = this.a;
        boolean bl = list == null || ((ArrayList)list).isEmpty();
        return bl;
    }

    public final void h() {
        if (!this.b) {
            int n2 = ((ArrayList)this.a).size();
            for (int i2 = 0; i2 < n2; ++i2) {
                i i4 = (i)((ArrayList)this.a).get(i2);
                int n3 = i4.a;
                int n4 = i4.b;
                if (-2 < n3) break;
                if (-2 == n3 && -2 == n4) {
                    ((ArrayList)this.a).remove(i2);
                    break;
                }
                if (-2 == n3) {
                    i4.a = n3 + 1;
                    break;
                }
                if (-2 == n4) {
                    i4.b = n4 - 1;
                    break;
                }
                if (-2 <= n3 || -2 >= n4) continue;
                i4.b = -3;
                this.b(-1, n4);
            }
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("can't alter readonly IntervalSet");
        throw illegalStateException;
    }

    public final int hashCode() {
        Iterator iterator = ((ArrayList)this.a).iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            i i2 = (i)iterator.next();
            n2 = com.github.catvod.spider.merge.Dw.i.o(com.github.catvod.spider.merge.Dw.i.o(n2, i2.a), i2.b);
        }
        return com.github.catvod.spider.merge.Dw.i.b(n2, ((ArrayList)this.a).size() * 2);
    }

    public final void i() {
        boolean bl = this.b;
        this.b = true;
    }

    public final int j() {
        int n2 = ((ArrayList)this.a).size();
        if (n2 == 1) {
            i i2 = (i)((ArrayList)this.a).get(0);
            return i2.b - i2.a + 1;
        }
        int n3 = 0;
        for (int i4 = 0; i4 < n2; ++i4) {
            i i5 = (i)((ArrayList)this.a).get(i4);
            n3 += i5.b - i5.a + 1;
        }
        return n3;
    }

    public final String l(H h2) {
        StringBuilder stringBuilder = new StringBuilder();
        List<i> list = this.a;
        if (list != null && !((ArrayList)list).isEmpty()) {
            if (this.j() > 1) {
                stringBuilder.append("{");
            }
            Iterator iterator = ((ArrayList)this.a).iterator();
            while (iterator.hasNext()) {
                list = (i)iterator.next();
                int n2 = ((i)((Object)list)).a;
                int n3 = ((i)((Object)list)).b;
                list = "<EPSILON>";
                if (n2 == n3) {
                    if (n2 == -1) {
                        list = "<EOF>";
                    } else if (n2 != -2) {
                        list = ((I)h2).a(n2);
                    }
                    stringBuilder.append((String)((Object)list));
                } else {
                    for (int i2 = n2; i2 <= n3; ++i2) {
                        if (i2 > n2) {
                            stringBuilder.append(", ");
                        }
                        list = i2 == -1 ? "<EOF>" : (i2 == -2 ? "<EPSILON>" : ((I)h2).a(i2));
                        stringBuilder.append((String)((Object)list));
                    }
                }
                if (!iterator.hasNext()) continue;
                stringBuilder.append(", ");
            }
            if (this.j() > 1) {
                stringBuilder.append("}");
            }
            return stringBuilder.toString();
        }
        return "{}";
    }

    public final String toString() {
        CharSequence charSequence = new StringBuilder();
        List<i> list = this.a;
        if (list != null && !((ArrayList)list).isEmpty()) {
            if (this.j() > 1) {
                ((StringBuilder)charSequence).append("{");
            }
            Iterator iterator = ((ArrayList)this.a).iterator();
            while (iterator.hasNext()) {
                list = (i)iterator.next();
                int n2 = ((i)((Object)list)).a;
                int n3 = ((i)((Object)list)).b;
                if (n2 == n3) {
                    if (n2 == -1) {
                        ((StringBuilder)charSequence).append("<EOF>");
                    } else {
                        ((StringBuilder)charSequence).append(n2);
                    }
                } else {
                    ((StringBuilder)charSequence).append(n2);
                    ((StringBuilder)charSequence).append("..");
                    ((StringBuilder)charSequence).append(n3);
                }
                if (!iterator.hasNext()) continue;
                ((StringBuilder)charSequence).append(", ");
            }
            if (this.j() > 1) {
                ((StringBuilder)charSequence).append("}");
            }
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = "{}";
        }
        return charSequence;
    }
}

