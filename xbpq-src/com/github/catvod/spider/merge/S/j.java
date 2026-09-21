/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.S;

import com.github.catvod.spider.merge.N.a;
import com.github.catvod.spider.merge.P.H;
import com.github.catvod.spider.merge.P.I;
import com.github.catvod.spider.merge.S.f;
import com.github.catvod.spider.merge.S.i;
import com.github.catvod.spider.merge.cYh;
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
                                object = (i)((ArrayList)j3.a).get(n2);
                                i2 = (i)((ArrayList)j2.a).get(n3);
                                int n4 = i2.b;
                                int n5 = ((i)object).a;
                                if (n4 < n5) break block7;
                                int n6 = i2.a;
                                int n7 = ((i)object).b;
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
        throw new IllegalStateException(cYh.d("04312F76237A063C3534257A1535203538340B296118392E022237303B090224"));
    }

    public final void b(int n2, int n3) {
        i i2 = i.b(n2, n3);
        if (!this.b) {
            block6: {
                if (i2.b >= i2.a) {
                    ListIterator<i> listIterator = ((ArrayList)this.a).listIterator();
                    while (listIterator.hasNext()) {
                        i i3 = (i)listIterator.next();
                        if (i2.equals(i3)) break block6;
                        int n4 = i2.a;
                        n2 = i3.b;
                        n3 = 1;
                        n2 = n4 != n2 + 1 && i2.b != i3.a - 1 ? 0 : 1;
                        if (n2 == 0 && i2.a(i3)) {
                            n4 = i2.a;
                            n2 = i3.a;
                            n2 = n4 < n2 && i2.b < n2 ? n3 : 0;
                            if (n2 == 0) continue;
                            listIterator.previous();
                            listIterator.add(i2);
                            break block6;
                        }
                        i2 = i2.c(i3);
                        listIterator.set(i2);
                        while (listIterator.hasNext()) {
                            i3 = (i)listIterator.next();
                            n2 = i2.a != i3.b + 1 && i2.b != i3.a - 1 ? 0 : 1;
                            if (n2 != 0 || !i2.a(i3)) {
                                listIterator.remove();
                                listIterator.previous();
                                listIterator.set(i2.c(i3));
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
        IllegalStateException illegalStateException = new IllegalStateException(cYh.d("04312F76237A063C3534257A1535203538340B296118392E022237303B090224"));
        throw illegalStateException;
    }

    public final j c(f iterator) {
        int n2;
        if (iterator == null) {
            return this;
        }
        boolean bl = iterator instanceof j;
        int n3 = 0;
        if (bl) {
            j j2 = (j)((Object)iterator);
            n3 = ((ArrayList)j2.a).size();
            for (n2 = 0; n2 < n3; ++n2) {
                iterator = (i)((ArrayList)j2.a).get(n2);
                this.b(((i)((Object)iterator)).a, ((i)((Object)iterator)).b);
            }
        } else {
            j j3 = (j)((Object)iterator);
            iterator = new ArrayList();
            int n4 = ((ArrayList)j3.a).size();
            for (n2 = n3; n2 < n4; ++n2) {
                i i2 = (i)((ArrayList)j3.a).get(n2);
                int n5 = i2.b;
                for (n3 = i2.a; n3 <= n5; ++n3) {
                    ((ArrayList)((Object)iterator)).add(n3);
                }
            }
            iterator = ((ArrayList)((Object)iterator)).iterator();
            while (iterator.hasNext()) {
                this.a((Integer)iterator.next());
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
        throw new RuntimeException(cYh.d("143535713E2947352C212323"));
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
                i i3 = (i)((ArrayList)this.a).get(i2);
                int n3 = i3.a;
                int n4 = i3.b;
                if (-2 < n3) break;
                if (-2 == n3 && -2 == n4) {
                    ((ArrayList)this.a).remove(i2);
                    break;
                }
                if (-2 == n3) {
                    i3.a = n3 + 1;
                    break;
                }
                if (-2 == n4) {
                    i3.b = n4 - 1;
                    break;
                }
                if (-2 <= n3 || -2 >= n4) continue;
                i3.b = -3;
                this.b(-1, n4);
            }
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(cYh.d("04312F76237A063C3534257A1535203538340B296118392E022237303B090224"));
        throw illegalStateException;
    }

    public final int hashCode() {
        Iterator iterator = ((ArrayList)this.a).iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            i i2 = (i)iterator.next();
            n2 = com.github.catvod.spider.merge.N.a.o(com.github.catvod.spider.merge.N.a.o(n2, i2.a), i2.b);
        }
        return com.github.catvod.spider.merge.N.a.b(n2, ((ArrayList)this.a).size() * 2);
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
        for (int i3 = 0; i3 < n2; ++i3) {
            i i4 = (i)((ArrayList)this.a).get(i3);
            n3 += i4.b - i4.a + 1;
        }
        return n3;
    }

    public final String l(H h2) {
        StringBuilder stringBuilder = new StringBuilder();
        List<i> list = this.a;
        if (list != null && !((ArrayList)list).isEmpty()) {
            if (this.j() > 1) {
                stringBuilder.append(cYh.d("1C"));
            }
            Iterator iterator = ((ArrayList)this.a).iterator();
            while (iterator.hasNext()) {
                list = (i)iterator.next();
                int n2 = ((i)((Object)list)).a;
                int n3 = ((i)((Object)list)).b;
                String string = cYh.d("4B70");
                String string2 = cYh.d("5B1511021E16281E7F");
                String string3 = cYh.d("5B150E1769");
                if (n2 == n3) {
                    list = n2 == -1 ? string3 : (n2 == -2 ? string2 : ((I)h2).a(n2));
                    stringBuilder.append((String)((Object)list));
                } else {
                    for (int i2 = n2; i2 <= n3; ++i2) {
                        if (i2 > n2) {
                            stringBuilder.append(string);
                        }
                        list = i2 == -1 ? string3 : (i2 == -2 ? string2 : ((I)h2).a(i2));
                        stringBuilder.append((String)((Object)list));
                    }
                }
                if (!iterator.hasNext()) continue;
                stringBuilder.append(string);
            }
            if (this.j() > 1) {
                stringBuilder.append(cYh.d("1A"));
            }
            return stringBuilder.toString();
        }
        return cYh.d("1C2D");
    }

    public final String toString() {
        CharSequence charSequence = new StringBuilder();
        List<i> list = this.a;
        if (list != null && !((ArrayList)list).isEmpty()) {
            if (this.j() > 1) {
                ((StringBuilder)charSequence).append(cYh.d("1C"));
            }
            list = ((ArrayList)this.a).iterator();
            while (list.hasNext()) {
                i i2 = (i)list.next();
                int n2 = i2.a;
                int n3 = i2.b;
                if (n2 == n3) {
                    if (n2 == -1) {
                        ((StringBuilder)charSequence).append(cYh.d("5B150E1769"));
                    } else {
                        ((StringBuilder)charSequence).append(n2);
                    }
                } else {
                    ((StringBuilder)charSequence).append(n2);
                    ((StringBuilder)charSequence).append(cYh.d("497E"));
                    ((StringBuilder)charSequence).append(n3);
                }
                if (!list.hasNext()) continue;
                ((StringBuilder)charSequence).append(cYh.d("4B70"));
            }
            if (this.j() > 1) {
                ((StringBuilder)charSequence).append(cYh.d("1A"));
            }
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = cYh.d("1C2D");
        }
        return charSequence;
    }
}

