/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.B;

import com.github.catvod.spider.merge.y.a;

public final class p {
    private final String[] a = new String[4096];
    private final int b;

    public p() {
        this.b = 4095;
        this.a("$ref", 0, 4, 1185263);
        String string = com.github.catvod.spider.merge.y.a.c;
        this.a(string, 0, string.length(), com.github.catvod.spider.merge.y.a.c.hashCode());
    }

    public final String a(String object, int n2, int n3, int n4) {
        int n5 = this.b & n4;
        Object object2 = this.a[n5];
        if (object2 != null) {
            if (n4 == ((String)object2).hashCode() && n3 == ((String)object2).length() && ((String)object).startsWith((String)object2, n2)) {
                object = object2;
            } else {
                object2 = new char[n3];
                ((String)object).getChars(n2, n3 + n2, (char[])object2, 0);
                object = new String((char[])object2);
            }
        } else {
            if (n3 != ((String)object).length()) {
                object2 = new char[n3];
                ((String)object).getChars(n2, n3 + n2, (char[])object2, 0);
                object = new String((char[])object2);
            }
            object = ((String)object).intern();
            this.a[n5] = object;
        }
        return object;
    }

    public final String b(char[] object, int n2, int n3, int n4) {
        int n5 = this.b & n4;
        String string = this.a[n5];
        if (string != null) {
            block5: {
                int n6;
                int n7 = string.hashCode();
                n5 = n6 = 0;
                if (n4 == n7) {
                    n5 = n6;
                    if (n3 == string.length()) {
                        for (n4 = 0; n4 < n3; ++n4) {
                            if (object[n2 + n4] == string.charAt(n4)) continue;
                            n5 = n6;
                            break block5;
                        }
                        n5 = 1;
                    }
                }
            }
            if (n5 != 0) {
                return string;
            }
            return new String((char[])object, n2, n3);
        }
        object = new String((char[])object, n2, n3).intern();
        this.a[n5] = object;
        return object;
    }
}

