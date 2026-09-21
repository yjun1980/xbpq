/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.r0;

import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.a.a;
import com.github.catvod.spider.merge.xc.d0.k;
import com.github.catvod.spider.merge.xc.o0.b;
import com.github.catvod.spider.merge.xc.o0.d;
import com.github.catvod.spider.merge.xc.q0.l;
import com.github.catvod.spider.merge.xc.r0.c;
import com.github.catvod.spider.merge.xc.r0.m;
import com.github.catvod.spider.merge.xc.r0.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public abstract class e
extends m {
    public static boolean M(CharSequence charSequence, String string, boolean bl) {
        i.e(charSequence, "<this>");
        boolean bl2 = false;
        if (e.R(charSequence, string, 0, bl, 2) >= 0) {
            bl2 = true;
        }
        return bl2;
    }

    public static final int N(CharSequence charSequence) {
        i.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int O(int n2, CharSequence charSequence, String string, boolean bl) {
        i.e(charSequence, "<this>");
        i.e(string, "string");
        n2 = !bl && charSequence instanceof String ? ((String)charSequence).indexOf(string, n2) : e.P(charSequence, string, n2, charSequence.length(), bl, false);
        return n2;
    }

    public static final int P(CharSequence charSequence, CharSequence charSequence2, int n2, int n3, boolean bl, boolean bl2) {
        block18: {
            int n4;
            int n5;
            block23: {
                block22: {
                    block19: {
                        block21: {
                            block20: {
                                b b2;
                                if (!bl2) {
                                    n5 = n2;
                                    if (n2 < 0) {
                                        n5 = 0;
                                    }
                                    n4 = charSequence.length();
                                    n2 = n3;
                                    if (n3 > n4) {
                                        n2 = n4;
                                    }
                                    b2 = new d(n5, n2);
                                } else {
                                    n4 = e.N(charSequence);
                                    n5 = n2;
                                    if (n2 > n4) {
                                        n5 = n4;
                                    }
                                    n2 = n3;
                                    if (n3 < 0) {
                                        n2 = 0;
                                    }
                                    b2 = new b(n5, n2, -1);
                                }
                                bl2 = charSequence instanceof String;
                                n5 = b2.c;
                                n4 = b2.b;
                                n2 = b2.a;
                                if (!bl2 || !(charSequence2 instanceof String)) break block19;
                                if (n5 <= 0) break block20;
                                n3 = n2;
                                if (n2 <= n4) break block21;
                            }
                            if (n5 >= 0 || n4 > n2) break block18;
                            n3 = n2;
                        }
                        while (true) {
                            if (m.J((String)charSequence2, (String)charSequence, n3, ((String)charSequence2).length(), bl)) {
                                return n3;
                            }
                            if (n3 != n4) {
                                n3 += n5;
                                continue;
                            }
                            break block18;
                            break;
                        }
                    }
                    if (n5 <= 0) break block22;
                    n3 = n2;
                    if (n2 <= n4) break block23;
                }
                if (n5 >= 0 || n4 > n2) break block18;
                n3 = n2;
            }
            while (true) {
                if (e.V(charSequence2, charSequence, n3, charSequence2.length(), bl)) {
                    return n3;
                }
                if (n3 == n4) break;
                n3 += n5;
            }
        }
        return -1;
    }

    public static int Q(CharSequence charSequence, char c2) {
        i.e(charSequence, "<this>");
        int n2 = !(charSequence instanceof String) ? e.S(charSequence, new char[]{c2}, 0, false) : ((String)charSequence).indexOf(c2, 0);
        return n2;
    }

    public static /* synthetic */ int R(CharSequence charSequence, String string, int n2, boolean bl, int n3) {
        if ((n3 & 2) != 0) {
            n2 = 0;
        }
        if ((n3 & 4) != 0) {
            bl = false;
        }
        return e.O(n2, charSequence, string, bl);
    }

    public static final int S(CharSequence charSequence, char[] cArray, int n2, boolean bl) {
        int n3;
        i.e(charSequence, "<this>");
        i.e(cArray, "chars");
        if (!bl && cArray.length == 1 && charSequence instanceof String) {
            int n4 = cArray.length;
            if (n4 != 0) {
                if (n4 == 1) {
                    n4 = cArray[0];
                    return ((String)charSequence).indexOf(n4, n2);
                }
                throw new IllegalArgumentException("Array has more than one element.");
            }
            throw new NoSuchElementException("Array is empty.");
        }
        int n5 = n2;
        if (n2 < 0) {
            n5 = 0;
        }
        if (n5 <= (n3 = e.N(charSequence))) {
            while (true) {
                char c2 = charSequence.charAt(n5);
                for (char c3 : cArray) {
                    char c4;
                    if (c3 != c2 && (!bl || (c4 = Character.toUpperCase(c3)) != (c3 = Character.toUpperCase(c2)) && Character.toLowerCase(c4) != Character.toLowerCase(c3))) {
                        continue;
                    }
                    return n5;
                }
                if (n5 == n3) break;
                ++n5;
            }
        }
        return -1;
    }

    public static boolean T(CharSequence charSequence) {
        boolean bl;
        block2: {
            i.e(charSequence, "<this>");
            boolean bl2 = false;
            for (int i2 = 0; i2 < charSequence.length(); ++i2) {
                char c2 = charSequence.charAt(i2);
                if (Character.isWhitespace(c2)) continue;
                bl = bl2;
                if (Character.isSpaceChar(c2)) {
                    continue;
                }
                break block2;
            }
            bl = true;
        }
        return bl;
    }

    public static int U(String string, CharSequence charSequence, int n2) {
        n2 = (n2 & 2) != 0 ? e.N(charSequence) : 0;
        i.e(charSequence, "<this>");
        i.e(string, "string");
        n2 = !(charSequence instanceof String) ? e.P(charSequence, string, n2, 0, false, true) : ((String)charSequence).lastIndexOf(string, n2);
        return n2;
    }

    public static final boolean V(CharSequence charSequence, CharSequence charSequence2, int n2, int n3, boolean bl) {
        i.e(charSequence, "<this>");
        i.e(charSequence2, "other");
        if (n2 >= 0 && charSequence.length() - n3 >= 0 && n2 <= charSequence2.length() - n3) {
            for (int i2 = 0; i2 < n3; ++i2) {
                char c2;
                char c3 = charSequence.charAt(i2);
                if (c3 == (c2 = charSequence2.charAt(n2 + i2)) || bl && ((c3 = Character.toUpperCase(c3)) == (c2 = Character.toUpperCase(c2)) || Character.toLowerCase(c3) == Character.toLowerCase(c2))) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public static final void W(int n2) {
        if (n2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(com.github.catvod.spider.merge.Bk.m.c(n2, "Limit must be non-negative, but was ").toString());
    }

    public static final List X(int n2, CharSequence charSequence, String string, boolean bl) {
        e.W(n2);
        int n3 = 0;
        int n4 = e.O(0, charSequence, string, bl);
        if (n4 != -1 && n2 != 1) {
            int n5;
            boolean bl2 = n2 > 0;
            int n6 = n5 = 10;
            if (bl2) {
                n6 = n2 > 10 ? n5 : n2;
            }
            ArrayList<String> arrayList = new ArrayList<String>(n6);
            n6 = n4;
            do {
                arrayList.add(((Object)charSequence.subSequence(n3, n6)).toString());
                n4 = string.length() + n6;
                if (bl2 && arrayList.size() == n2 - 1) break;
                n5 = e.O(n4, charSequence, string, bl);
                n3 = n4;
                n6 = n5;
            } while (n5 != -1);
            arrayList.add(((Object)charSequence.subSequence(n4, charSequence.length())).toString());
            return arrayList;
        }
        return com.github.catvod.spider.merge.xc.a.a.o(((Object)charSequence).toString());
    }

    public static List Y(CharSequence object, String[] object2, int n2, int n3) {
        Object object3;
        if ((n3 & 4) != 0) {
            n2 = 0;
        }
        i.e(object, "<this>");
        if (((String[])object2).length == 1 && ((String)(object3 = object2[0])).length() != 0) {
            object = e.X(n2, (CharSequence)object, (String)object3, false);
        } else {
            e.W(n2);
            object2 = Arrays.asList(object2);
            i.d(object2, "asList(...)");
            object3 = new c((CharSequence)object, 0, n2, new n(object2, false, 1));
            object2 = new ArrayList(k.H(new l((c)object3)));
            Iterator iterator = object3.iterator();
            while (iterator.hasNext()) {
                object3 = (d)iterator.next();
                i.e(object3, "range");
                n2 = ((b)object3).b;
                ((ArrayList)object2).add(((Object)object.subSequence(((b)object3).a, n2 + 1)).toString());
            }
            object = object2;
        }
        return object;
    }

    public static List Z(String object, char[] object2, int n2, int n3) {
        if ((n3 & 4) != 0) {
            n2 = 0;
        }
        i.e(object, "<this>");
        if (((char[])object2).length == 1) {
            object = e.X(n2, (CharSequence)object, String.valueOf(object2[0]), false);
        } else {
            e.W(n2);
            Object object3 = new c((CharSequence)object, 0, n2, new n(object2, false, 0));
            object2 = new ArrayList(k.H(new l((c)object3)));
            Iterator iterator = object3.iterator();
            while (iterator.hasNext()) {
                object3 = (d)iterator.next();
                i.e(object3, "range");
                n2 = ((b)object3).b;
                ((ArrayList)object2).add(((Object)((String)object).subSequence(((b)object3).a, n2 + 1)).toString());
            }
            object = object2;
        }
        return object;
    }

    public static String a0(String string, String string2, String string3) {
        i.e(string, "<this>");
        i.e(string3, "missingDelimiterValue");
        int n2 = e.R(string, string2, 0, false, 6);
        if (n2 != -1) {
            string3 = string.substring(string2.length() + n2, string.length());
            i.d(string3, "substring(...)");
        }
        return string3;
    }

    public static String b0(String string, char c2, String string2) {
        i.e(string, "<this>");
        i.e(string2, "missingDelimiterValue");
        c2 = (char)string.lastIndexOf(c2, e.N(string));
        if (c2 != '\uffffffff') {
            string2 = string.substring(c2 + '\u0001', string.length());
            i.d(string2, "substring(...)");
        }
        return string2;
    }

    public static String c0(String string, char c2) {
        int n2 = e.Q(string, c2);
        if (n2 != -1) {
            string = string.substring(0, n2);
            i.d(string, "substring(...)");
        }
        return string;
    }

    public static String d0(String string, String string2) {
        int n2 = e.R(string, string2, 0, false, 6);
        if (n2 != -1) {
            string = string.substring(0, n2);
            i.d(string, "substring(...)");
        }
        return string;
    }

    public static String e0(int n2, String charSequence) {
        i.e(charSequence, "<this>");
        if (n2 >= 0) {
            int n3 = ((String)charSequence).length();
            int n4 = n2;
            if (n2 > n3) {
                n4 = n3;
            }
            charSequence = ((String)charSequence).substring(0, n4);
            i.d(charSequence, "substring(...)");
            return charSequence;
        }
        charSequence = new StringBuilder("Requested character count ");
        ((StringBuilder)charSequence).append(n2);
        ((StringBuilder)charSequence).append(" is less than zero.");
        throw new IllegalArgumentException(((StringBuilder)charSequence).toString().toString());
    }

    public static CharSequence f0(CharSequence charSequence) {
        i.e(charSequence, "<this>");
        int n2 = charSequence.length() - 1;
        int n3 = 0;
        boolean bl = false;
        while (n3 <= n2) {
            int n4 = !bl ? n3 : n2;
            char c2 = charSequence.charAt(n4);
            n4 = !Character.isWhitespace(c2) && !Character.isSpaceChar(c2) ? 0 : 1;
            if (!bl) {
                if (n4 == 0) {
                    bl = true;
                    continue;
                }
                ++n3;
                continue;
            }
            if (n4 == 0) break;
            --n2;
        }
        return charSequence.subSequence(n3, n2 + 1);
    }
}

