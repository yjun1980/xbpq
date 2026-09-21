/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.L;

import com.github.catvod.spider.merge.E.f;
import com.github.catvod.spider.merge.L.s;
import com.github.catvod.spider.merge.b.n;
import com.github.catvod.spider.merge.cYh;

public final class a
extends s {
    private static final int d;
    public static final a e;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        int n2;
        block15: {
            block8: {
                Integer n3;
                String string;
                block7: {
                    int n4;
                    char c2;
                    int n5;
                    int n6;
                    Integer n7;
                    block13: {
                        block14: {
                            block10: {
                                block12: {
                                    block11: {
                                        block9: {
                                            e = new a();
                                            n7 = null;
                                            try {
                                                string = System.getProperty(cYh.d("0C3F353D3E341F7E223E25351224283F322949342437362F0B246F213628063C2D343B33143D"));
                                            }
                                            catch (Throwable throwable) {
                                                string = null;
                                            }
                                            if (string == null) break block8;
                                            com.github.catvod.spider.merge.K.a.b(10);
                                            n6 = string.length();
                                            if (n6 != 0) break block9;
                                            n3 = n7;
                                            break block7;
                                        }
                                        n5 = 0;
                                        c2 = string.charAt(0);
                                        n2 = f.f(c2, 48);
                                        n4 = -2147483647;
                                        if (n2 >= 0) break block10;
                                        if (n6 != 1) break block11;
                                        n3 = n7;
                                        break block7;
                                    }
                                    if (c2 != '-') break block12;
                                    n4 = Integer.MIN_VALUE;
                                    n2 = 1;
                                    c2 = '\u0001';
                                    break block13;
                                }
                                n3 = n7;
                                if (c2 != '+') break block7;
                                n2 = 1;
                                break block14;
                            }
                            n2 = 0;
                        }
                        c2 = '\u0000';
                    }
                    int n8 = -59652323;
                    for (int i2 = n2; i2 < n6; ++i2) {
                        int n9 = Character.digit((int)string.charAt(i2), 10);
                        if (n9 < 0) {
                            n3 = n7;
                            break block7;
                        }
                        n2 = n8;
                        if (n5 < n8) {
                            n3 = n7;
                            if (n8 != -59652323) break block7;
                            n2 = n8 = n4 / 10;
                            if (n5 < n8) {
                                n3 = n7;
                                break block7;
                            }
                        }
                        if ((n5 *= 10) < n4 + n9) {
                            n3 = n7;
                            break block7;
                        }
                        n5 -= n9;
                        n8 = n2;
                    }
                    n3 = c2 != '\u0000' ? Integer.valueOf(n5) : Integer.valueOf(-n5);
                }
                if (n3 == null || n3 < 1) throw new IllegalStateException(n.a(cYh.d("22283134342E0234612138290E242827327A09252C33322847392F713C35133C283F2F74043F333E222E0E3E2422793E023620243B2E4920202336360B352D3824374B702324237A0F313271"), string).toString());
                n2 = n3;
                break block15;
            }
            n2 = -1;
        }
        d = n2;
    }

    private a() {
    }

    @Override
    public final void close() {
        throw new IllegalStateException(cYh.d("243C2E22327A04312F3F382E473224713E34113F2A34337A083E611238370A3F2F0138350B").toString());
    }

    @Override
    public final String toString() {
        return cYh.d("243F2C3C3834373F2E3D");
    }
}

