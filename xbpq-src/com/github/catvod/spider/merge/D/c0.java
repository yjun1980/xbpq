/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

public final class c0 {
    public final c0 a;
    public final Object b;
    public final Object c;
    public final int d;

    public c0(c0 c02, Object object, Object object2, int n2) {
        this.a = c02;
        this.b = object;
        this.c = object2;
        this.d = n2;
    }

    protected final void a(StringBuilder stringBuilder) {
        block12: {
            Object object;
            block10: {
                int n2;
                String string;
                block6: {
                    block11: {
                        int n3;
                        block8: {
                            block9: {
                                block7: {
                                    object = this.a;
                                    if (object != null) break block7;
                                    n3 = 36;
                                    break block8;
                                }
                                ((c0)object).a(stringBuilder);
                                object = this.c;
                                if (object != null) break block9;
                                object = ".null";
                                break block10;
                            }
                            if (!(object instanceof Integer)) break block11;
                            stringBuilder.append('[');
                            stringBuilder.append((Integer)this.c);
                            n3 = 93;
                        }
                        stringBuilder.append((char)n3);
                        break block12;
                    }
                    stringBuilder.append('.');
                    string = this.c.toString();
                    int n4 = 0;
                    for (n2 = 0; n2 < string.length(); ++n2) {
                        char c2 = string.charAt(n2);
                        if (c2 >= '0' && c2 <= '9' || c2 >= 'A' && c2 <= 'Z' || c2 >= 'a' && c2 <= 'z' || c2 > '\u0080') {
                            continue;
                        }
                        n2 = 1;
                        break block6;
                    }
                    n2 = 0;
                }
                object = string;
                if (n2 == 0) break block10;
                for (n2 = n4; n2 < string.length(); ++n2) {
                    char c3;
                    block14: {
                        block15: {
                            block13: {
                                c3 = string.charAt(n2);
                                if (c3 == '\\') break block13;
                                if (c3 >= '0' && c3 <= '9' || c3 >= 'A' && c3 <= 'Z' || c3 >= 'a' && c3 <= 'z' || c3 > '\u0080') break block14;
                                if (c3 != '\"') break block15;
                            }
                            stringBuilder.append('\\');
                        }
                        stringBuilder.append('\\');
                        stringBuilder.append('\\');
                    }
                    stringBuilder.append(c3);
                }
                break block12;
            }
            stringBuilder.append((String)object);
        }
    }

    public final String toString() {
        if (this.a == null) {
            return "$";
        }
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder);
        return stringBuilder.toString();
    }
}

