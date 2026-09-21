/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.P1;

import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.P1.a;
import com.github.catvod.spider.merge.P1.f;
import com.github.catvod.spider.merge.P1.u;
import com.github.catvod.spider.merge.W1.b;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public final class n
extends InputStream {
    private final a a;
    private DataInputStream b;
    private com.github.catvod.spider.merge.U1.a c;
    private b d;
    private com.github.catvod.spider.merge.V1.f e;
    private int f = 0;
    private boolean g = false;
    private boolean h = true;
    private boolean i = true;
    private boolean j = false;
    private IOException k = null;
    private final byte[] l = new byte[1];

    n(InputStream inputStream, int n2, a a2) {
        Objects.requireNonNull(inputStream);
        this.a = a2;
        this.b = new DataInputStream(inputStream);
        this.d = new b(a2);
        this.c = new com.github.catvod.spider.merge.U1.a(n.b(n2), a2);
    }

    private void a() {
        block16: {
            block15: {
                int n2;
                block9: {
                    block14: {
                        int n3;
                        block13: {
                            block10: {
                                block11: {
                                    block12: {
                                        n2 = this.b.readUnsignedByte();
                                        if (n2 == 0) {
                                            this.j = true;
                                            this.d();
                                            return;
                                        }
                                        if (n2 < 224 && n2 != 1) {
                                            if (this.h) {
                                                throw new f();
                                            }
                                        } else {
                                            this.i = true;
                                            this.h = false;
                                            this.c.j();
                                        }
                                        if (n2 < 128) break block9;
                                        this.g = true;
                                        this.f = n3 = (n2 & 0x1F) << 16;
                                        this.f = this.b.readUnsignedShort() + 1 + n3;
                                        n3 = this.b.readUnsignedShort();
                                        if (n2 < 192) break block10;
                                        this.i = false;
                                        int n4 = this.b.readUnsignedByte();
                                        if (n4 > 224) break block11;
                                        n2 = n4 / 45;
                                        int n5 = n4 - n2 * 9 * 5;
                                        if ((n5 -= (n4 = n5 / 9) * 9) + n4 > 4) break block12;
                                        this.e = new com.github.catvod.spider.merge.V1.f(this.c, this.d, n5, n4, n2);
                                        break block13;
                                    }
                                    throw new f();
                                }
                                throw new f();
                            }
                            if (this.i) break block14;
                            if (n2 >= 160) {
                                this.e.d();
                            }
                        }
                        this.d.h(this.b, n3 + 1);
                        break block15;
                    }
                    throw new f();
                }
                if (n2 > 2) break block16;
                this.g = false;
                this.f = this.b.readUnsignedShort() + 1;
            }
            return;
        }
        throw new f();
    }

    private static int b(int n2) {
        if (n2 >= 4096 && n2 <= 0x7FFFFFF0) {
            return n2 + 15 & 0xFFFFFFF0;
        }
        throw new IllegalArgumentException(r.a("Unsupported dictionary size ", n2));
    }

    public static int c(int n2) {
        return n.b(n2) / 1024 + 104;
    }

    private void d() {
        Object object = this.c;
        if (object != null) {
            Object object2 = this.a;
            Objects.requireNonNull(object);
            Objects.requireNonNull(object2);
            this.c = null;
            object2 = this.d;
            object = this.a;
            Objects.requireNonNull(object2);
            Objects.requireNonNull(object);
            this.d = null;
        }
    }

    @Override
    public final int available() {
        DataInputStream dataInputStream = this.b;
        if (dataInputStream != null) {
            IOException iOException = this.k;
            if (iOException == null) {
                int n2 = this.g ? this.f : Math.min(this.f, ((InputStream)dataInputStream).available());
                return n2;
            }
            throw iOException;
        }
        throw new u("Stream closed");
    }

    @Override
    public final void close() {
        if (this.b != null) {
            this.d();
            try {
                ((InputStream)this.b).close();
            }
            finally {
                this.b = null;
            }
        }
    }

    @Override
    public final int read() {
        int n2 = this.read(this.l, 0, 1);
        int n3 = -1;
        if (n2 != -1) {
            n3 = this.l[0] & 0xFF;
        }
        return n3;
    }

    @Override
    public final int read(byte[] object, int n2, int n3) {
        int n4;
        if (n2 >= 0 && n3 >= 0 && (n4 = n2 + n3) >= 0 && n4 <= ((byte[])object).length) {
            n4 = 0;
            if (n3 == 0) {
                return 0;
            }
            if (this.b != null) {
                IOException iOException = this.k;
                if (iOException == null) {
                    boolean bl = this.j;
                    int n5 = -1;
                    if (bl) {
                        return -1;
                    }
                    while (n3 > 0) {
                        block15: {
                            block14: {
                                try {
                                    if (this.f != 0) break block14;
                                    this.a();
                                    if (!this.j) break block14;
                                    n2 = n4 == 0 ? n5 : n4;
                                    return n2;
                                }
                                catch (IOException iOException2) {
                                    this.k = iOException2;
                                    throw iOException2;
                                }
                            }
                            int n6 = Math.min(this.f, n3);
                            if (!this.g) {
                                this.c.a(this.b, n6);
                            } else {
                                this.c.k(n6);
                                this.e.c();
                            }
                            int n7 = this.c.b((byte[])object, n2);
                            int n8 = n2 + n7;
                            int n9 = n3 - n7;
                            n6 = n4 + n7;
                            this.f = n7 = this.f - n7;
                            n4 = n6;
                            n2 = n8;
                            n3 = n9;
                            if (n7 != 0) continue;
                            if (!this.d.g() || this.c.e()) break block15;
                            n4 = n6;
                            n2 = n8;
                            n3 = n9;
                            continue;
                        }
                        object = new f;
                        object();
                        throw object;
                    }
                    return n4;
                }
                throw iOException;
            }
            throw new u("Stream closed");
        }
        throw new IndexOutOfBoundsException();
    }
}

