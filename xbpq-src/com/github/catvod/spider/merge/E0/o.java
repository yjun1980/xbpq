/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.n;

final class o {
    static String a(n n2) {
        StringBuilder stringBuilder = new StringBuilder(n2.size());
        for (int i2 = 0; i2 < n2.size(); ++i2) {
            String string;
            block14: {
                block10: {
                    block11: {
                        block12: {
                            int n3;
                            block13: {
                                n3 = n2.a(i2);
                                if (n3 == 34) break block10;
                                if (n3 == 39) break block11;
                                if (n3 == 92) break block12;
                                switch (n3) {
                                    default: {
                                        if (n3 < 32 || n3 > 126) break;
                                        break block13;
                                    }
                                    case 13: {
                                        string = "\\r";
                                        break block14;
                                    }
                                    case 12: {
                                        string = "\\f";
                                        break block14;
                                    }
                                    case 11: {
                                        string = "\\v";
                                        break block14;
                                    }
                                    case 10: {
                                        string = "\\n";
                                        break block14;
                                    }
                                    case 9: {
                                        string = "\\t";
                                        break block14;
                                    }
                                    case 8: {
                                        string = "\\b";
                                        break block14;
                                    }
                                    case 7: {
                                        string = "\\a";
                                        break block14;
                                    }
                                }
                                stringBuilder.append('\\');
                                stringBuilder.append((char)((n3 >>> 6 & 3) + 48));
                                stringBuilder.append((char)((n3 >>> 3 & 7) + 48));
                                n3 = (n3 & 7) + 48;
                            }
                            stringBuilder.append((char)n3);
                            continue;
                        }
                        string = "\\\\";
                        break block14;
                    }
                    string = "\\'";
                    break block14;
                }
                string = "\\\"";
            }
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }
}

