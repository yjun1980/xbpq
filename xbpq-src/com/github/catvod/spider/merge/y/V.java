/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

public final class V
extends Enum<V> {
    public static final /* enum */ V a;
    public static final /* enum */ V b;
    private static final V[] c;

    static {
        V v2;
        V v3;
        a = v3 = new V();
        V v4 = new V();
        V v5 = new V();
        V v6 = new V();
        V v7 = new V();
        b = v2 = new V();
        c = new V[]{v3, v4, v5, v6, v7, v2};
    }

    public static V valueOf(String string) {
        return Enum.valueOf(V.class, string);
    }

    public static V[] values() {
        return (V[])c.clone();
    }

    public final String b(String object) {
        int n2;
        int n3 = this.ordinal();
        int n4 = 0;
        if (n3 != 0) {
            if (n3 != 1) {
                if (n3 != 2) {
                    if (n3 != 3) {
                        return object;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    for (n2 = 0; n2 < ((String)object).length(); ++n2) {
                        char c2;
                        char c3 = c2 = ((String)object).charAt(n2);
                        if (c2 >= 'A') {
                            c3 = c2;
                            if (c2 <= 'Z') {
                                c3 = c2 = (char)(c2 + 32);
                                if (n2 > 0) {
                                    stringBuilder.append('-');
                                    c3 = c2;
                                }
                            }
                        }
                        stringBuilder.append(c3);
                    }
                    return stringBuilder.toString();
                }
                StringBuilder stringBuilder = new StringBuilder();
                for (n2 = n4; n2 < ((String)object).length(); ++n2) {
                    char c4;
                    char c5 = c4 = ((String)object).charAt(n2);
                    if (c4 >= 'A') {
                        c5 = c4;
                        if (c4 <= 'Z') {
                            c5 = c4 = (char)(c4 + 32);
                            if (n2 > 0) {
                                stringBuilder.append('_');
                                c5 = c4;
                            }
                        }
                    }
                    stringBuilder.append(c5);
                }
                return stringBuilder.toString();
            }
            n2 = ((String)object).charAt(0);
            if (n2 >= 97 && n2 <= 122) {
                object = ((String)object).toCharArray();
                object[0] = (char)(object[0] - 32);
                return new String((char[])object);
            }
            return object;
        }
        n2 = ((String)object).charAt(0);
        if (n2 >= 65 && n2 <= 90) {
            object = ((String)object).toCharArray();
            object[0] = (char)(object[0] + 32);
            return new String((char[])object);
        }
        return object;
    }
}

