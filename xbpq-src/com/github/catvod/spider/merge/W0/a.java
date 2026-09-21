/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.W0;

import com.github.catvod.spider.merge.U0.c;
import com.github.catvod.spider.merge.U0.d;
import com.github.catvod.spider.merge.Y0.b;
import java.util.Arrays;

public final class a
implements com.github.catvod.spider.merge.U0.a {
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private int d;
    private com.github.catvod.spider.merge.U0.a e;
    private boolean f;

    public a(com.github.catvod.spider.merge.U0.a a2) {
        this.e = a2;
        this.d = 16;
        this.a = new byte[16];
        this.b = new byte[16];
        this.c = new byte[16];
    }

    @Override
    public final int a(byte[] byArray, int n2, byte[] byArray2, int n3) {
        block7: {
            block6: {
                int n4;
                block4: {
                    block5: {
                        boolean bl = this.f;
                        n4 = 0;
                        if (!bl) break block4;
                        if (this.d + n2 > byArray.length) break block5;
                        for (int i2 = 0; i2 < this.d; ++i2) {
                            byte[] byArray3 = this.b;
                            byArray3[i2] = (byte)(byArray3[i2] ^ byArray[n2 + i2]);
                        }
                        n2 = this.e.a(this.b, 0, byArray2, n3);
                        byArray = this.b;
                        System.arraycopy(byArray2, n3, byArray, 0, byArray.length);
                        break block6;
                    }
                    throw new d("input buffer too short");
                }
                int n5 = this.d;
                if (n2 + n5 > byArray.length) break block7;
                System.arraycopy(byArray, n2, this.c, 0, n5);
                n5 = this.e.a(byArray, n2, byArray2, n3);
                for (n2 = n4; n2 < this.d; ++n2) {
                    n4 = n3 + n2;
                    byArray2[n4] = (byte)(byArray2[n4] ^ this.b[n2]);
                }
                byArray = this.b;
                this.b = this.c;
                this.c = byArray;
                n2 = n5;
            }
            return n2;
        }
        throw new d("input buffer too short");
    }

    @Override
    public final int b() {
        return this.e.b();
    }

    @Override
    public final void c(boolean bl, c c2) {
        block11: {
            block9: {
                boolean bl2;
                block10: {
                    Object object;
                    block8: {
                        block5: {
                            block6: {
                                block7: {
                                    bl2 = this.f;
                                    this.f = bl;
                                    if (!(c2 instanceof b)) break block5;
                                    object = ((b)(c2 = (b)c2)).a();
                                    if (((byte[])object).length != this.d) break block6;
                                    System.arraycopy(object, 0, this.a, 0, ((Object)object).length);
                                    this.reset();
                                    if (((b)c2).b() == null) break block7;
                                    object = this.e;
                                    c2 = ((b)c2).b();
                                    break block8;
                                }
                                if (bl2 != bl) {
                                    throw new IllegalArgumentException("cannot change encrypting state without providing key.");
                                }
                                break block9;
                            }
                            throw new IllegalArgumentException("initialisation vector must be the same length as block size");
                        }
                        this.reset();
                        if (c2 == null) break block10;
                        object = this.e;
                    }
                    object.c(bl, c2);
                    break block9;
                }
                if (bl2 != bl) break block11;
            }
            return;
        }
        throw new IllegalArgumentException("cannot change encrypting state without providing key.");
    }

    @Override
    public final void reset() {
        byte[] byArray = this.a;
        System.arraycopy(byArray, 0, this.b, 0, byArray.length);
        Arrays.fill(this.c, (byte)0);
        this.e.reset();
    }
}

