/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u02c6;
import com.github.catvod.spider.merge.\u0824;
import com.github.catvod.spider.merge.\u08a0;
import com.github.catvod.spider.merge.\u08a1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public abstract class \u1076 {
    public static final \u1076 \u037f = new \u052e();

    public static \u1076 \u0528(\u1076 \u10762, \u1076 \u1076Array) {
        \u1076 \u10763;
        if (\u10762 != null && \u10762 != (\u10763 = \u037f)) {
            if (\u1076Array != null && \u1076Array != \u10763) {
                \u10762 = new \u037f(\u10762, (\u1076)\u1076Array);
                \u1076Array = ((\u037f)\u10762).\u0528;
                if (\u1076Array.length == 1) {
                    return \u1076Array[0];
                }
                return \u10762;
            }
            return \u10762;
        }
        return \u1076Array;
    }

    private static List<\u052c> \u052b(Collection<? extends \u1076> collection) {
        Iterator<? extends \u1076> iterator = collection.iterator();
        Collection<? extends \u1076> collection2 = null;
        while (iterator.hasNext()) {
            \u1076 \u10762 = iterator.next();
            if (!(\u10762 instanceof \u052c)) continue;
            collection = collection2;
            if (collection2 == null) {
                collection = new ArrayList<\u1076>();
            }
            ((ArrayList)collection).add((\u052c)\u10762);
            iterator.remove();
            collection2 = collection;
        }
        if (collection2 == null) {
            return Collections.emptyList();
        }
        return collection2;
    }

    public static \u1076 \u052c(\u1076 \u1076Array, \u1076 \u10762) {
        \u1076 \u10763;
        if (\u1076Array == null) {
            return \u10762;
        }
        if (\u10762 == null) {
            return \u1076Array;
        }
        \u1076 \u10764 = \u10763 = \u037f;
        if (\u1076Array != \u10763) {
            if (\u10762 == \u10763) {
                \u10764 = \u10763;
            } else {
                \u10764 = new \u0528((\u1076)\u1076Array, \u10762);
                \u1076Array = ((\u0528)\u10764).\u0528;
                if (\u1076Array.length == 1) {
                    return \u1076Array[0];
                }
            }
        }
        return \u10764;
    }

    public abstract boolean \u0529(\u08a0<?, ?> var1, \u08a1 var2);

    public \u1076 \u052a(\u08a0<?, ?> \u08a02, \u08a1 \u08a12) {
        return this;
    }

    public static class \u037f
    extends \u052a {
        public final \u1076[] \u0528;

        public \u037f(\u1076 object, \u1076 \u10762) {
            HashSet<\u1076> hashSet = new HashSet<\u1076>();
            if (object instanceof \u037f) {
                hashSet.addAll(Arrays.asList(((\u037f)object).\u0528));
            } else {
                hashSet.add((\u1076)object);
            }
            if (\u10762 instanceof \u037f) {
                hashSet.addAll(Arrays.asList(((\u037f)\u10762).\u0528));
            } else {
                hashSet.add(\u10762);
            }
            object = \u1076.\u052b(hashSet);
            if (!object.isEmpty()) {
                hashSet.add((\u052c)Collections.min(object));
            }
            this.\u0528 = hashSet.toArray(new \u1076[hashSet.size()]);
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof \u037f)) {
                return false;
            }
            object = (\u037f)object;
            return Arrays.equals(this.\u0528, ((\u037f)object).\u0528);
        }

        public int hashCode() {
            return \u02c6.\u0528(this.\u0528, \u037f.class.hashCode());
        }

        public String toString() {
            return \u0824.\u0528(Arrays.asList(this.\u0528).iterator(), SOY.d("5C74"));
        }

        @Override
        public boolean \u0529(\u08a0<?, ?> \u08a02, \u08a1 \u08a12) {
            \u1076[] \u1076Array = this.\u0528;
            int n2 = \u1076Array.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (\u1076Array[i2].\u0529(\u08a02, \u08a12)) continue;
                return false;
            }
            return true;
        }

        @Override
        public \u1076 \u052a(\u08a0<?, ?> object, \u08a1 \u08a12) {
            ArrayList<\u1076> arrayList = new ArrayList<\u1076>();
            \u1076[] \u1076Array = this.\u0528;
            int n2 = \u1076Array.length;
            int n3 = 0;
            int n4 = 0;
            while (true) {
                int n5 = 1;
                int n6 = 1;
                if (n3 >= n2) break;
                \u1076 \u10762 = \u1076Array[n3];
                \u1076 \u10763 = \u10762.\u052a((\u08a0<?, ?>)object, \u08a12);
                n5 = \u10763 != \u10762 ? n6 : 0;
                n4 |= n5;
                if (\u10763 == null) {
                    return null;
                }
                if (\u10763 != \u037f) {
                    arrayList.add(\u10763);
                }
                ++n3;
            }
            if (n4 == 0) {
                return this;
            }
            if (arrayList.isEmpty()) {
                return \u037f;
            }
            object = (\u1076)arrayList.get(0);
            for (n3 = n5; n3 < arrayList.size(); ++n3) {
                object = \u1076.\u0528((\u1076)object, (\u1076)arrayList.get(n3));
            }
            return object;
        }
    }

    public static class \u0528
    extends \u052a {
        public final \u1076[] \u0528;

        public \u0528(\u1076 object, \u1076 \u10762) {
            HashSet<\u1076> hashSet = new HashSet<\u1076>();
            if (object instanceof \u0528) {
                hashSet.addAll(Arrays.asList(((\u0528)object).\u0528));
            } else {
                hashSet.add((\u1076)object);
            }
            if (\u10762 instanceof \u0528) {
                hashSet.addAll(Arrays.asList(((\u0528)\u10762).\u0528));
            } else {
                hashSet.add(\u10762);
            }
            object = \u1076.\u052b(hashSet);
            if (!object.isEmpty()) {
                hashSet.add((\u052c)Collections.max(object));
            }
            this.\u0528 = hashSet.toArray(new \u1076[hashSet.size()]);
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof \u0528)) {
                return false;
            }
            object = (\u0528)object;
            return Arrays.equals(this.\u0528, ((\u0528)object).\u0528);
        }

        public int hashCode() {
            return \u02c6.\u0528(this.\u0528, \u0528.class.hashCode());
        }

        public String toString() {
            return \u0824.\u0528(Arrays.asList(this.\u0528).iterator(), SOY.d("062E"));
        }

        @Override
        public boolean \u0529(\u08a0<?, ?> \u08a02, \u08a1 \u08a12) {
            \u1076[] \u1076Array = this.\u0528;
            int n2 = \u1076Array.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (!\u1076Array[i2].\u0529(\u08a02, \u08a12)) continue;
                return true;
            }
            return false;
        }

        @Override
        public \u1076 \u052a(\u08a0<?, ?> object, \u08a1 \u08a12) {
            ArrayList<\u1076> arrayList = new ArrayList<\u1076>();
            \u1076[] \u1076Array = this.\u0528;
            int n2 = \u1076Array.length;
            int n3 = 0;
            int n4 = 0;
            while (true) {
                int n5 = 1;
                int n6 = 1;
                if (n3 >= n2) break;
                \u1076 \u10762 = \u1076Array[n3];
                \u1076 \u10763 = \u10762.\u052a((\u08a0<?, ?>)object, \u08a12);
                n5 = \u10763 != \u10762 ? n6 : 0;
                n4 |= n5;
                \u10762 = \u037f;
                if (\u10763 == \u10762) {
                    return \u10762;
                }
                if (\u10763 != null) {
                    arrayList.add(\u10763);
                }
                ++n3;
            }
            if (n4 == 0) {
                return this;
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            object = (\u1076)arrayList.get(0);
            for (n4 = n5; n4 < arrayList.size(); ++n4) {
                object = \u1076.\u052c((\u1076)object, (\u1076)arrayList.get(n4));
            }
            return object;
        }
    }

    public static abstract class \u052a
    extends \u1076 {
    }

    public static class \u052c
    extends \u1076
    implements Comparable<\u052c> {
        public final int \u0528;

        protected \u052c() {
            this.\u0528 = 0;
        }

        public \u052c(int n2) {
            this.\u0528 = n2;
        }

        public boolean equals(Object object) {
            boolean bl = object instanceof \u052c;
            boolean bl2 = false;
            if (!bl) {
                return false;
            }
            if (this == object) {
                return true;
            }
            object = (\u052c)object;
            if (this.\u0528 == ((\u052c)object).\u0528) {
                bl2 = true;
            }
            return bl2;
        }

        public int hashCode() {
            return 31 + this.\u0528;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(SOY.d("01"));
            stringBuilder.append(this.\u0528);
            stringBuilder.append(SOY.d("446F21041114076D"));
            return stringBuilder.toString();
        }

        @Override
        public boolean \u0529(\u08a0<?, ?> \u08a02, \u08a1 \u08a12) {
            return \u08a02.\u0782(\u08a12, this.\u0528);
        }

        @Override
        public \u1076 \u052a(\u08a0<?, ?> \u08a02, \u08a1 \u08a12) {
            if (\u08a02.\u0782(\u08a12, this.\u0528)) {
                return \u037f;
            }
            return null;
        }

        public int \u052d(\u052c \u052d) {
            return this.\u0528 - \u052d.\u0528;
        }
    }

    public static class \u052e
    extends \u1076 {
        public final int \u0528;
        public final int \u0529;
        public final boolean \u052a;

        protected \u052e() {
            this.\u0528 = -1;
            this.\u0529 = -1;
            this.\u052a = false;
        }

        public \u052e(int n2, int n3, boolean bl) {
            this.\u0528 = n2;
            this.\u0529 = n3;
            this.\u052a = bl;
        }

        public boolean equals(Object object) {
            boolean bl = object instanceof \u052e;
            boolean bl2 = false;
            if (!bl) {
                return false;
            }
            if (this == object) {
                return true;
            }
            object = (\u052e)object;
            bl = bl2;
            if (this.\u0528 == ((\u052e)object).\u0528) {
                bl = bl2;
                if (this.\u0529 == ((\u052e)object).\u0529) {
                    bl = bl2;
                    if (this.\u052a == ((\u052e)object).\u052a) {
                        bl = true;
                    }
                }
            }
            return bl;
        }

        public int hashCode() {
            return \u02c6.\u037f(\u02c6.\u052b(\u02c6.\u052b(\u02c6.\u052b(\u02c6.\u0529(), this.\u0528), this.\u0529), this.\u052a ? 1 : 0), 3);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(SOY.d("01"));
            stringBuilder.append(this.\u0528);
            stringBuilder.append(SOY.d("40"));
            stringBuilder.append(this.\u0529);
            stringBuilder.append(SOY.d("076D"));
            return stringBuilder.toString();
        }

        @Override
        public boolean \u0529(\u08a0<?, ?> \u08a02, \u08a1 \u08a12) {
            if (!this.\u052a) {
                \u08a12 = null;
            }
            return \u08a02.\u0783(\u08a12, this.\u0528, this.\u0529);
        }
    }
}

