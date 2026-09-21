/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u02c6;
import com.github.catvod.spider.merge.\u02cb;
import com.github.catvod.spider.merge.\u08a7;
import com.github.catvod.spider.merge.\u10ff;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class \u0674
implements \u10ff {
    public static final \u0674 \u037f;
    public static final \u0674 \u0528;
    protected List<\u02cb> \u0529;
    protected boolean \u052a;

    static {
        \u0674 \u06742;
        \u037f = \u06742 = \u0674.\u0780(0, 0x10FFFF);
        \u06742.\u0783(true);
        \u0528 = \u06742 = new \u0674(new int[0]);
        \u06742.\u0783(true);
    }

    public \u0674(\u0674 \u06742) {
        this(new int[0]);
        this.\u052c(\u06742);
    }

    public \u0674(int ... nArray) {
        if (nArray == null) {
            this.\u0529 = new ArrayList<\u02cb>(2);
        } else {
            this.\u0529 = new ArrayList<\u02cb>(nArray.length);
            int n2 = nArray.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                this.\u0529(nArray[i2]);
            }
        }
    }

    public static \u0674 \u0620(int n2) {
        \u0674 \u06742 = new \u0674(new int[0]);
        \u06742.\u0529(n2);
        return \u06742;
    }

    public static \u0674 \u0780(int n2, int n3) {
        \u0674 \u06742 = new \u0674(new int[0]);
        \u06742.\u052a(n2, n3);
        return \u06742;
    }

    /*
     * Unable to fully structure code
     */
    public static \u0674 \u0786(\u0674 var0, \u0674 var1_1) {
        block7: {
            block8: {
                var2_2 = 0;
                if (var0 == null || var0.\u0528()) break block7;
                var7_3 = new \u0674((\u0674)var0);
                if (var1_1 == null || var1_1.\u0528()) break block8;
                var3_4 = 0;
                block0: while (var2_2 < var7_3.\u0529.size() && var3_4 < var1_1.\u0529.size()) {
                    block9: {
                        block10: {
                            var9_9 = var7_3.\u0529.get(var2_2);
                            var8_8 = var1_1.\u0529.get(var3_4);
                            var5_6 = var8_8.\u052e;
                            var4_5 = var9_9.\u052d;
                            if (var5_6 < var4_5) lbl-1000:
                            // 3 sources

                            {
                                while (true) {
                                    ++var3_4;
                                    continue block0;
                                    break;
                                }
                            }
                            var5_6 = var8_8.\u052d;
                            if (var5_6 > var9_9.\u052e) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    ++var2_2;
                                    continue block0;
                                    break;
                                }
                            }
                            var6_7 = null;
                            var0 = var5_6 > var4_5 ? new \u02cb(var9_9.\u052d, var8_8.\u052d - 1) : null;
                            if (var8_8.\u052e < var9_9.\u052e) {
                                var6_7 = new \u02cb(var8_8.\u052e + 1, var9_9.\u052e);
                            }
                            if (var0 == null) break block9;
                            if (var6_7 == null) break block10;
                            var7_3.\u0529.set(var2_2, (\u02cb)var0);
                            var0 = var7_3.\u0529;
                            var0.add(++var2_2, (\u02cb)var6_7);
                            ** GOTO lbl-1000
                        }
                        var7_3.\u0529.set(var2_2, (\u02cb)var0);
                        ** continue;
                    }
                    if (var6_7 != null) {
                        var7_3.\u0529.set(var2_2, var6_7);
                        ** continue;
                    }
                    var7_3.\u0529.remove(var2_2);
                }
            }
            return var7_3;
        }
        return new \u0674(new int[0]);
    }

    public boolean equals(Object object) {
        if (object != null && object instanceof \u0674) {
            object = (\u0674)object;
            return this.\u0529.equals(((\u0674)object).\u0529);
        }
        return false;
    }

    public int hashCode() {
        int n2 = \u02c6.\u0529();
        for (\u02cb \u02cb2 : this.\u0529) {
            n2 = \u02c6.\u052b(\u02c6.\u052b(n2, \u02cb2.\u052d), \u02cb2.\u052e);
        }
        return \u02c6.\u037f(n2, this.\u0529.size() * 2);
    }

    public String toString() {
        return this.\u0788(false);
    }

    @Override
    public List<Integer> \u037f() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n2 = this.\u0529.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            \u02cb \u02cb2 = this.\u0529.get(i2);
            int n3 = \u02cb2.\u052e;
            for (int i4 = \u02cb2.\u052d; i4 <= n3; ++i4) {
                arrayList.add(i4);
            }
        }
        return arrayList;
    }

    @Override
    public boolean \u0528() {
        List<\u02cb> list = this.\u0529;
        boolean bl = list == null || list.isEmpty();
        return bl;
    }

    public void \u0529(int n2) {
        if (!this.\u052a) {
            this.\u052a(n2, n2);
            return;
        }
        throw new IllegalStateException(SOY.d("19333F5100571B3E25130657083730121B19162B713F1A031F20271718241F26"));
    }

    public void \u052a(int n2, int n3) {
        this.\u052b(\u02cb.\u0529(n2, n3));
    }

    protected void \u052b(\u02cb object) {
        if (!this.\u052a) {
            if (((\u02cb)object).\u052e < ((\u02cb)object).\u052d) {
                return;
            }
            ListIterator<\u02cb> listIterator = this.\u0529.listIterator();
            while (listIterator.hasNext()) {
                \u02cb \u02cb2 = listIterator.next();
                if (((\u02cb)object).equals(\u02cb2)) {
                    return;
                }
                if (!((\u02cb)object).\u037f(\u02cb2) && ((\u02cb)object).\u0528(\u02cb2)) {
                    if (!((\u02cb)object).\u052b(\u02cb2)) continue;
                    listIterator.previous();
                    listIterator.add((\u02cb)object);
                    return;
                }
                \u02cb2 = ((\u02cb)object).\u052c(\u02cb2);
                listIterator.set(\u02cb2);
                while (listIterator.hasNext() && (\u02cb2.\u037f((\u02cb)(object = listIterator.next())) || !\u02cb2.\u0528((\u02cb)object))) {
                    listIterator.remove();
                    listIterator.previous();
                    listIterator.set(\u02cb2.\u052c((\u02cb)object));
                    listIterator.next();
                }
                return;
            }
            this.\u0529.add((\u02cb)object);
            return;
        }
        object = new IllegalStateException(SOY.d("19333F5100571B3E25130657083730121B19162B713F1A031F20271718241F26"));
        throw object;
    }

    public \u0674 \u052c(\u10ff object) {
        if (object == null) {
            return this;
        }
        if (object instanceof \u0674) {
            object = (\u0674)object;
            int n2 = ((\u0674)object).\u0529.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                \u02cb \u02cb2 = ((\u0674)object).\u0529.get(i2);
                this.\u052a(\u02cb2.\u052d, \u02cb2.\u052e);
            }
        } else {
            object = object.\u037f().iterator();
            while (object.hasNext()) {
                this.\u0529((Integer)object.next());
            }
        }
        return this;
    }

    public \u0674 \u052d(\u10ff \u10ff2) {
        if (\u10ff2 != null && !\u10ff2.\u0528()) {
            if (\u10ff2 instanceof \u0674) {
                \u10ff2 = (\u0674)\u10ff2;
            } else {
                \u0674 \u06742 = new \u0674(new int[0]);
                \u06742.\u052c(\u10ff2);
                \u10ff2 = \u06742;
            }
            return ((\u0674)\u10ff2).\u0785(this);
        }
        return null;
    }

    public boolean \u052e(int n2) {
        int n3 = this.\u0529.size() - 1;
        int n4 = 0;
        while (n4 <= n3) {
            int n5 = (n4 + n3) / 2;
            \u02cb \u02cb2 = this.\u0529.get(n5);
            int n6 = \u02cb2.\u052d;
            if (\u02cb2.\u052e < n2) {
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

    protected String \u052f(\u08a7 \u08a72, int n2) {
        if (n2 == -1) {
            return SOY.d("46171E304A");
        }
        if (n2 == -2) {
            return SOY.d("461701253D3B351C6F");
        }
        return \u08a72.\u0529(n2);
    }

    public int \u058f() {
        if (!this.\u0528()) {
            return this.\u0529.get((int)0).\u052d;
        }
        throw new RuntimeException(SOY.d("093725561D045A373C06000E"));
    }

    public \u0674 \u0781(\u10ff \u10ff2) {
        \u0674 \u06742 = new \u0674(new int[0]);
        \u06742.\u052c(this);
        \u06742.\u052c(\u10ff2);
        return \u06742;
    }

    public void \u0782(int n2) {
        if (!this.\u052a) {
            int n3 = this.\u0529.size();
            for (int i2 = 0; i2 < n3; ++i2) {
                \u02cb \u02cb2 = this.\u0529.get(i2);
                int n4 = \u02cb2.\u052d;
                int n5 = \u02cb2.\u052e;
                if (n2 < n4) break;
                if (n2 == n4 && n2 == n5) {
                    this.\u0529.remove(i2);
                    break;
                }
                if (n2 == n4) {
                    \u02cb2.\u052d = n4 + 1;
                    break;
                }
                if (n2 == n5) {
                    \u02cb2.\u052e = n5 - 1;
                    break;
                }
                if (n2 <= n4 || n2 >= n5) continue;
                \u02cb2.\u052e = n2 - 1;
                this.\u052a(n2 + 1, n5);
            }
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(SOY.d("19333F5100571B3E25130657083730121B19162B713F1A031F20271718241F26"));
        throw illegalStateException;
    }

    public void \u0783(boolean bl) {
        if (this.\u052a && !bl) {
            throw new IllegalStateException(SOY.d("19333F5100571B3E25130657083730121B19162B713F1A031F20271718241F26"));
        }
        this.\u052a = bl;
    }

    public int \u0784() {
        int n2 = this.\u0529.size();
        if (n2 == 1) {
            \u02cb \u02cb2 = this.\u0529.get(0);
            return \u02cb2.\u052e - \u02cb2.\u052d + 1;
        }
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            \u02cb \u02cb3 = this.\u0529.get(i2);
            n3 += \u02cb3.\u052e - \u02cb3.\u052d + 1;
        }
        return n3;
    }

    public \u0674 \u0785(\u10ff \u10ff2) {
        if (\u10ff2 != null && !\u10ff2.\u0528()) {
            if (\u10ff2 instanceof \u0674) {
                return \u0674.\u0786(this, (\u0674)\u10ff2);
            }
            \u0674 \u06742 = new \u0674(new int[0]);
            \u06742.\u052c(\u10ff2);
            return \u0674.\u0786(this, \u06742);
        }
        return new \u0674(this);
    }

    public String \u0787(\u08a7 \u08a72) {
        StringBuilder stringBuilder = new StringBuilder();
        List<\u02cb> list = this.\u0529;
        if (list != null && !list.isEmpty()) {
            if (this.\u0784() > 1) {
                stringBuilder.append(SOY.d("01"));
            }
            list = this.\u0529.iterator();
            while (list.hasNext()) {
                Object object = (\u02cb)list.next();
                int n2 = ((\u02cb)object).\u052d;
                int n3 = ((\u02cb)object).\u052e;
                object = SOY.d("5672");
                if (n2 == n3) {
                    stringBuilder.append(this.\u052f(\u08a72, n2));
                } else {
                    for (int i2 = n2; i2 <= n3; ++i2) {
                        if (i2 > n2) {
                            stringBuilder.append((String)object);
                        }
                        stringBuilder.append(this.\u052f(\u08a72, i2));
                    }
                }
                if (!list.hasNext()) continue;
                stringBuilder.append((String)object);
            }
            if (this.\u0784() > 1) {
                stringBuilder.append(SOY.d("07"));
            }
            return stringBuilder.toString();
        }
        return SOY.d("012F");
    }

    public String \u0788(boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        List<\u02cb> list = this.\u0529;
        if (list != null && !list.isEmpty()) {
            if (this.\u0784() > 1) {
                stringBuilder.append(SOY.d("01"));
            }
            list = this.\u0529.iterator();
            while (list.hasNext()) {
                Object object = (\u02cb)list.next();
                int n2 = ((\u02cb)object).\u052d;
                int n3 = ((\u02cb)object).\u052e;
                object = SOY.d("5D");
                if (n2 == n3) {
                    if (n2 == -1) {
                        stringBuilder.append(SOY.d("46171E304A"));
                    } else if (bl) {
                        stringBuilder.append((String)object);
                        stringBuilder.appendCodePoint(n2).append((String)object);
                    } else {
                        stringBuilder.append(n2);
                    }
                } else if (bl) {
                    stringBuilder.append((String)object);
                    StringBuilder stringBuilder2 = stringBuilder.appendCodePoint(n2);
                    stringBuilder2.append(SOY.d("5D7C7F51"));
                    stringBuilder2.appendCodePoint(n3).append((String)object);
                } else {
                    stringBuilder.append(n2);
                    stringBuilder.append(SOY.d("547C"));
                    stringBuilder.append(n3);
                }
                if (!list.hasNext()) continue;
                stringBuilder.append(SOY.d("5672"));
            }
            if (this.\u0784() > 1) {
                stringBuilder.append(SOY.d("07"));
            }
            return stringBuilder.toString();
        }
        return SOY.d("012F");
    }
}

