/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.A;

public final class j {
    public static final j e = new j(0, null, 0x56050000, 1);
    public static final j f = new j(1, null, 1509950721, 1);
    public static final j g = new j(2, null, 1124075009, 1);
    public static final j h = new j(3, null, 1107297537, 1);
    public static final j i = new j(4, null, 1392510721, 1);
    public static final j j = new j(5, null, 1224736769, 1);
    public static final j k = new j(6, null, 1174536705, 1);
    public static final j l = new j(7, null, 1241579778, 1);
    public static final j m = new j(8, null, 1141048066, 1);
    protected final int a;
    private final char[] b;
    private final int c;
    private final int d;

    private j(int n2, char[] cArray, int n3, int n4) {
        this.a = n2;
        this.b = cArray;
        this.c = n3;
        this.d = n4;
    }

    static j[] a(String jArray) {
        char[] cArray = jArray.toCharArray();
        int n2 = 1;
        int n3 = 1;
        int n4 = 0;
        while (true) {
            int n5;
            int n6 = n3 + 1;
            if ((n3 = cArray[n3]) == 41) {
                jArray = new j[n4];
                n4 = 0;
                n3 = n2;
                while (cArray[n3] != ')') {
                    jArray[n4] = com.github.catvod.spider.merge.A.j.f(cArray, n3);
                    n6 = jArray[n4].d;
                    n5 = jArray[n4].a == 10 ? 2 : 0;
                    n3 += n6 + n5;
                    ++n4;
                }
                return jArray;
            }
            if (n3 == 76) {
                while (true) {
                    n3 = n6 + 1;
                    if (cArray[n6] == ';') break;
                    n6 = n3;
                }
                ++n4;
                continue;
            }
            n5 = n4;
            if (n3 != 91) {
                n5 = n4 + 1;
            }
            n3 = n6;
            n4 = n5;
        }
    }

    public static j e(String string) {
        return com.github.catvod.spider.merge.A.j.f(string.toCharArray(), 0);
    }

    private static j f(char[] cArray, int n2) {
        int n3 = cArray[n2];
        if (n3 != 70) {
            if (n3 != 83) {
                if (n3 != 86) {
                    if (n3 != 73) {
                        if (n3 != 74) {
                            if (n3 != 90) {
                                int n4;
                                if (n3 != 91) {
                                    switch (n3) {
                                        default: {
                                            n3 = 1;
                                            while (cArray[n2 + n3] != ';') {
                                                ++n3;
                                            }
                                            return new j(10, cArray, n2 + 1, n3 - 1);
                                        }
                                        case 68: {
                                            return m;
                                        }
                                        case 67: {
                                            return g;
                                        }
                                        case 66: 
                                    }
                                    return h;
                                }
                                n3 = 1;
                                while (cArray[n4 = n2 + n3] == '[') {
                                    ++n3;
                                }
                                int n5 = n3;
                                if (cArray[n4] == 'L') {
                                    do {
                                        n5 = ++n3;
                                    } while (cArray[n2 + n3] != ';');
                                }
                                return new j(9, cArray, n2, n5 + 1);
                            }
                            return f;
                        }
                        return l;
                    }
                    return j;
                }
                return e;
            }
            return i;
        }
        return k;
    }

    protected final String b() {
        switch (this.a) {
            default: {
                return new String(this.b, this.c, this.d).replace('/', '.');
            }
            case 9: {
                Object object = this.b;
                int n2 = this.c;
                int n3 = 1;
                int n4 = 1;
                while (this.b[this.c + n4] == '[') {
                    ++n4;
                }
                object = new StringBuilder(com.github.catvod.spider.merge.A.j.f((char[])object, n2 + n4).b());
                n4 = n3;
                do {
                } while (this.b[this.c + n4] == '[');
                for (n3 = ++n4; n3 > 0; --n3) {
                    ((StringBuilder)object).append("[]");
                }
                return ((StringBuilder)object).toString();
            }
            case 8: {
                return "double";
            }
            case 7: {
                return "long";
            }
            case 6: {
                return "float";
            }
            case 5: {
                return "int";
            }
            case 4: {
                return "short";
            }
            case 3: {
                return "byte";
            }
            case 2: {
                return "char";
            }
            case 1: {
                return "boolean";
            }
            case 0: 
        }
        return "void";
    }

    final String c() {
        return new String(this.b, this.c, this.d);
    }

    public final String d() {
        return new String(this.b, this.c, this.d);
    }
}

