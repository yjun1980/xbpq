/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Z0;

import java.io.IOException;
import java.io.OutputStream;

public final class b {
    protected final byte[] a = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    protected final byte[] b = new byte[128];

    public b() {
        byte[] byArray;
        int n2 = 0;
        int n3 = 0;
        while (true) {
            byArray = this.b;
            if (n3 >= byArray.length) break;
            byArray[n3] = -1;
            ++n3;
        }
        for (int i2 = n2; i2 < (byArray = this.a).length; ++i2) {
            this.b[byArray[i2]] = (byte)i2;
        }
    }

    private boolean c(char c2) {
        boolean bl = c2 == '\n' || c2 == '\r' || c2 == '\t' || c2 == ' ';
        return bl;
    }

    private int d(String string, int n2, int n3) {
        while (n2 < n3 && this.c(string.charAt(n2))) {
            ++n2;
        }
        return n2;
    }

    public final int a(String object, OutputStream outputStream) {
        block16: {
            int n2;
            Object object2;
            block13: {
                int n3;
                Object object3;
                Object object4;
                Object object5;
                block14: {
                    block15: {
                        block10: {
                            block11: {
                                block12: {
                                    byte[] byArray = new byte[54];
                                    object2 = ((String)object).length();
                                    while (object2 > 0 && this.c(((String)object).charAt(n2 = object2 - 1))) {
                                        object2 = n2;
                                    }
                                    if (object2 == 0) {
                                        return 0;
                                    }
                                    object5 = object2;
                                    n2 = 0;
                                    while (object5 > 0 && n2 != 4) {
                                        object5 = object4 = object5 - 1;
                                        if (this.c(((String)object).charAt((int)object4))) continue;
                                        ++n2;
                                        object5 = object4;
                                    }
                                    object3 = this.d((String)object, 0, (int)object5);
                                    object4 = 0;
                                    n2 = 0;
                                    while (object3 < object5) {
                                        byte by;
                                        int n4 = this.b[((String)object).charAt((int)object3)];
                                        object3 = this.d((String)object, object3 + 1, (int)object5);
                                        n3 = this.b[((String)object).charAt((int)object3)];
                                        object3 = this.d((String)object, object3 + 1, (int)object5);
                                        byte by2 = this.b[((String)object).charAt((int)object3)];
                                        if ((n4 | n3 | by2 | (by = this.b[((String)object).charAt((int)(object3 = this.d((String)object, object3 + 1, (int)object5)))])) >= 0) {
                                            int n5 = object4 + 1;
                                            byArray[object4] = (byte)(n4 << 2 | n3 >> 4);
                                            n4 = n5 + 1;
                                            byArray[n5] = (byte)(n3 << 4 | by2 >> 2);
                                            object4 = n4 + 1;
                                            byArray[n4] = (byte)(by2 << 6 | by);
                                            n3 = n2 + 3;
                                            n2 = object4;
                                            if (object4 == 54) {
                                                outputStream.write(byArray);
                                                n2 = 0;
                                            }
                                            object3 = this.d((String)object, object3 + 1, (int)object5);
                                            object4 = n2;
                                            n2 = n3;
                                            continue;
                                        }
                                        throw new IOException("invalid characters encountered in base64 data");
                                    }
                                    if (object4 > 0) {
                                        outputStream.write(byArray, 0, (int)object4);
                                    }
                                    object3 = this.d((String)object, (int)object3, (int)object2);
                                    object5 = this.d((String)object, object3 + 1, (int)object2);
                                    object4 = this.d((String)object, object5 + 1, (int)object2);
                                    object2 = this.d((String)object, object4 + 1, (int)object2);
                                    n3 = ((String)object).charAt((int)object3);
                                    object5 = ((String)object).charAt((int)object5);
                                    object4 = ((String)object).charAt((int)object4);
                                    object3 = ((String)object).charAt((int)object2);
                                    object2 = 2;
                                    if (object4 != 61) break block10;
                                    if (object3 != 61) break block11;
                                    object = this.b;
                                    object2 = object[n3];
                                    if ((object2 | (object5 = (Object)object[object5])) < 0) break block12;
                                    outputStream.write(object5 >> 4 | object2 << 2);
                                    object2 = 1;
                                    break block13;
                                }
                                throw new IOException("invalid characters encountered at end of base64 data");
                            }
                            throw new IOException("invalid characters encountered at end of base64 data");
                        }
                        if (object3 != 61) break block14;
                        object = this.b;
                        object3 = object[n3];
                        if ((object3 | (object5 = (Object)object[object5]) | (object4 = (Object)object[object4])) < 0) break block15;
                        outputStream.write(object3 << 2 | object5 >> 4);
                        outputStream.write(object4 >> 2 | object5 << 4);
                        break block13;
                    }
                    throw new IOException("invalid characters encountered at end of base64 data");
                }
                object = this.b;
                object2 = object[n3];
                if ((object2 | (object5 = (Object)object[object5]) | (object4 = (Object)object[object4]) | (object3 = (Object)object[object3])) < 0) break block16;
                outputStream.write(object2 << 2 | object5 >> 4);
                outputStream.write(object5 << 4 | object4 >> 2);
                outputStream.write(object3 | object4 << 6);
                object2 = 3;
            }
            return n2 + object2;
        }
        throw new IOException("invalid characters encountered at end of base64 data");
    }

    public final int b(byte[] byArray, int n2, OutputStream outputStream) {
        byte[] byArray2 = new byte[72];
        int n3 = n2;
        n2 = 0;
        while (n3 > 0) {
            byte[] byArray3;
            int n4;
            int n5;
            int n6 = Math.min(54, n3);
            int n7 = n2 + n6;
            int n8 = 0;
            for (n5 = n2; n5 < n7 - 2; ++n5) {
                n4 = n5 + 1;
                int n9 = byArray[n5];
                n5 = n4 + 1;
                int n10 = byArray[n4] & 0xFF;
                n4 = byArray[n5] & 0xFF;
                int n11 = n8 + 1;
                byArray3 = this.a;
                byArray2[n8] = byArray3[n9 >>> 2 & 0x3F];
                n8 = n11 + 1;
                byArray2[n11] = byArray3[(n9 << 4 | n10 >>> 4) & 0x3F];
                n9 = n8 + 1;
                byArray2[n8] = byArray3[(n10 << 2 | n4 >>> 6) & 0x3F];
                n8 = n9 + 1;
                byArray2[n9] = byArray3[n4 & 0x3F];
            }
            if ((n2 = n6 - (n5 - n2)) != 1) {
                if (n2 == 2) {
                    n2 = byArray[n5] & 0xFF;
                    n5 = byArray[n5 + 1] & 0xFF;
                    n4 = n8 + 1;
                    byArray3 = this.a;
                    byArray2[n8] = byArray3[n2 >>> 2 & 0x3F];
                    n8 = n4 + 1;
                    byArray2[n4] = byArray3[(n2 << 4 | n5 >>> 4) & 0x3F];
                    n2 = n8 + 1;
                    byArray2[n8] = byArray3[n5 << 2 & 0x3F];
                    n8 = n2 + 1;
                    byArray2[n2] = 61;
                }
            } else {
                n4 = byArray[n5] & 0xFF;
                n5 = n8 + 1;
                byArray3 = this.a;
                byArray2[n8] = byArray3[n4 >>> 2 & 0x3F];
                n2 = n5 + 1;
                byArray2[n5] = byArray3[n4 << 4 & 0x3F];
                n5 = n2 + 1;
                byArray2[n2] = 61;
                n8 = n5 + 1;
                byArray2[n5] = 61;
            }
            outputStream.write(byArray2, 0, n8 - 0);
            n3 -= n6;
            n2 = n7;
        }
        return (n3 + 2) / 3 * 4;
    }
}

