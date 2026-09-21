/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.y.A;
import com.github.catvod.spider.merge.y.N;
import com.github.catvod.spider.merge.y.z;
import java.math.BigDecimal;

final class p
extends A {
    private final long e;
    private final int f;
    private BigDecimal g;
    private Float h;
    private Double i;

    public p(String string, boolean bl, long l2, int n2) {
        super(string, bl);
        this.e = l2;
        this.f = n2;
    }

    @Override
    public final boolean a(N object, Object object2, Object object3, Object object4) {
        object = this.b((N)object, object2, object4);
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        boolean bl6 = false;
        boolean bl7 = false;
        boolean bl8 = false;
        boolean bl9 = false;
        boolean bl10 = false;
        boolean bl11 = false;
        boolean bl12 = false;
        boolean bl13 = false;
        boolean bl14 = false;
        boolean bl15 = false;
        boolean bl16 = false;
        boolean bl17 = false;
        boolean bl18 = false;
        boolean bl19 = false;
        boolean bl20 = false;
        boolean bl21 = false;
        boolean bl22 = false;
        boolean bl23 = false;
        boolean bl24 = false;
        if (object == null) {
            return false;
        }
        if (!(object instanceof Number)) {
            return false;
        }
        if (object instanceof BigDecimal) {
            if (this.g == null) {
                this.g = BigDecimal.valueOf(this.e);
            }
            int n2 = this.g.compareTo((BigDecimal)object);
            int n3 = z.c(this.f);
            if (n3 != 0) {
                if (n3 != 1) {
                    if (n3 != 2) {
                        if (n3 != 3) {
                            if (n3 != 4) {
                                if (n3 != 5) {
                                    return false;
                                }
                                bl12 = bl24;
                                if (n2 >= 0) {
                                    bl12 = true;
                                }
                                return bl12;
                            }
                            bl12 = bl;
                            if (n2 > 0) {
                                bl12 = true;
                            }
                            return bl12;
                        }
                        bl12 = bl2;
                        if (n2 <= 0) {
                            bl12 = true;
                        }
                        return bl12;
                    }
                    bl12 = bl3;
                    if (n2 < 0) {
                        bl12 = true;
                    }
                    return bl12;
                }
                bl12 = bl4;
                if (n2 != 0) {
                    bl12 = true;
                }
                return bl12;
            }
            bl12 = bl5;
            if (n2 == 0) {
                bl12 = true;
            }
            return bl12;
        }
        if (object instanceof Float) {
            if (this.h == null) {
                this.h = Float.valueOf(this.e);
            }
            int n4 = this.h.compareTo((Float)object);
            int n5 = z.c(this.f);
            if (n5 != 0) {
                if (n5 != 1) {
                    if (n5 != 2) {
                        if (n5 != 3) {
                            if (n5 != 4) {
                                if (n5 != 5) {
                                    return false;
                                }
                                bl12 = bl6;
                                if (n4 >= 0) {
                                    bl12 = true;
                                }
                                return bl12;
                            }
                            bl12 = bl7;
                            if (n4 > 0) {
                                bl12 = true;
                            }
                            return bl12;
                        }
                        bl12 = bl8;
                        if (n4 <= 0) {
                            bl12 = true;
                        }
                        return bl12;
                    }
                    bl12 = bl9;
                    if (n4 < 0) {
                        bl12 = true;
                    }
                    return bl12;
                }
                bl12 = bl10;
                if (n4 != 0) {
                    bl12 = true;
                }
                return bl12;
            }
            bl12 = bl11;
            if (n4 == 0) {
                bl12 = true;
            }
            return bl12;
        }
        if (object instanceof Double) {
            if (this.i == null) {
                this.i = this.e;
            }
            int n6 = this.i.compareTo((Double)object);
            int n7 = z.c(this.f);
            if (n7 != 0) {
                if (n7 != 1) {
                    if (n7 != 2) {
                        if (n7 != 3) {
                            if (n7 != 4) {
                                if (n7 != 5) {
                                    return false;
                                }
                                if (n6 >= 0) {
                                    bl12 = true;
                                }
                                return bl12;
                            }
                            bl12 = bl13;
                            if (n6 > 0) {
                                bl12 = true;
                            }
                            return bl12;
                        }
                        bl12 = bl14;
                        if (n6 <= 0) {
                            bl12 = true;
                        }
                        return bl12;
                    }
                    bl12 = bl15;
                    if (n6 < 0) {
                        bl12 = true;
                    }
                    return bl12;
                }
                bl12 = bl16;
                if (n6 != 0) {
                    bl12 = true;
                }
                return bl12;
            }
            bl12 = bl17;
            if (n6 == 0) {
                bl12 = true;
            }
            return bl12;
        }
        long l2 = com.github.catvod.spider.merge.H.A.n0((Number)object);
        int n8 = z.c(this.f);
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            if (n8 != 5) {
                                return false;
                            }
                            bl12 = bl18;
                            if (l2 <= this.e) {
                                bl12 = true;
                            }
                            return bl12;
                        }
                        bl12 = bl19;
                        if (l2 < this.e) {
                            bl12 = true;
                        }
                        return bl12;
                    }
                    bl12 = bl20;
                    if (l2 >= this.e) {
                        bl12 = true;
                    }
                    return bl12;
                }
                bl12 = bl21;
                if (l2 > this.e) {
                    bl12 = true;
                }
                return bl12;
            }
            bl12 = bl22;
            if (l2 != this.e) {
                bl12 = true;
            }
            return bl12;
        }
        bl12 = bl23;
        if (l2 == this.e) {
            bl12 = true;
        }
        return bl12;
    }
}

