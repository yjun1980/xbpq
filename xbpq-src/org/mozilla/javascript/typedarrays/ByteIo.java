/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.typedarrays;

public class ByteIo {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static short doReadInt16(byte[] byArray, int n2, boolean bl) {
        int n3;
        if (bl) {
            n3 = byArray[n2] & 0xFF;
            n2 = (byArray[n2 + 1] & 0xFF) << 8;
            return (short)(n2 | n3);
        }
        n3 = (byArray[n2] & 0xFF) << 8;
        n2 = byArray[n2 + 1] & 0xFF;
        return (short)(n2 | n3);
    }

    private static void doWriteInt16(byte[] byArray, int n2, int n3, boolean bl) {
        if (bl) {
            byArray[n2] = (byte)(n3 & 0xFF);
            byArray[n2 + 1] = (byte)(n3 >>> 8 & 0xFF);
        } else {
            byArray[n2] = (byte)(n3 >>> 8 & 0xFF);
            byArray[n2 + 1] = (byte)(n3 & 0xFF);
        }
    }

    public static Float readFloat32(byte[] byArray, int n2, boolean bl) {
        return Float.valueOf(Float.intBitsToFloat((int)ByteIo.readUint32Primitive(byArray, n2, bl)));
    }

    public static Double readFloat64(byte[] byArray, int n2, boolean bl) {
        return Double.longBitsToDouble(ByteIo.readUint64Primitive(byArray, n2, bl));
    }

    public static Short readInt16(byte[] byArray, int n2, boolean bl) {
        return ByteIo.doReadInt16(byArray, n2, bl);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Integer readInt32(byte[] byArray, int n2, boolean bl) {
        int n3;
        if (bl) {
            n3 = byArray[n2] & 0xFF | (byArray[n2 + 1] & 0xFF) << 8 | (byArray[n2 + 2] & 0xFF) << 16;
            n2 = (byArray[n2 + 3] & 0xFF) << 24;
            return n2 | n3;
        }
        n3 = (byArray[n2] & 0xFF) << 24 | (byArray[n2 + 1] & 0xFF) << 16 | (byArray[n2 + 2] & 0xFF) << 8;
        n2 = byArray[n2 + 3] & 0xFF;
        return n2 | n3;
    }

    public static Byte readInt8(byte[] byArray, int n2) {
        return byArray[n2];
    }

    public static Integer readUint16(byte[] byArray, int n2, boolean bl) {
        return ByteIo.doReadInt16(byArray, n2, bl) & 0xFFFF;
    }

    public static Object readUint32(byte[] byArray, int n2, boolean bl) {
        return ByteIo.readUint32Primitive(byArray, n2, bl);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static long readUint32Primitive(byte[] byArray, int n2, boolean bl) {
        long l2;
        long l3;
        if (bl) {
            l3 = byArray[n2];
            l2 = byArray[n2 + 1];
            l3 = ((long)byArray[n2 + 2] & 0xFFL) << 16 | (l3 & 0xFFL | (l2 & 0xFFL) << 8);
            l2 = ((long)byArray[n2 + 3] & 0xFFL) << 24;
            return (l2 | l3) & 0xFFFFFFFFL;
        }
        l2 = byArray[n2];
        l3 = ((long)byArray[n2 + 1] & 0xFFL) << 16 | (l2 & 0xFFL) << 24 | ((long)byArray[n2 + 2] & 0xFFL) << 8;
        l2 = (long)byArray[n2 + 3] & 0xFFL;
        return (l2 | l3) & 0xFFFFFFFFL;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static long readUint64Primitive(byte[] byArray, int n2, boolean bl) {
        long l2;
        long l3;
        if (bl) {
            l3 = byArray[n2];
            l2 = byArray[n2 + 1];
            l3 = ((long)byArray[n2 + 2] & 0xFFL) << 16 | (l3 & 0xFFL | (l2 & 0xFFL) << 8) | ((long)byArray[n2 + 3] & 0xFFL) << 24 | ((long)byArray[n2 + 4] & 0xFFL) << 32 | ((long)byArray[n2 + 5] & 0xFFL) << 40 | ((long)byArray[n2 + 6] & 0xFFL) << 48;
            l2 = ((long)byArray[n2 + 7] & 0xFFL) << 56;
            return l2 | l3;
        }
        l3 = byArray[n2];
        l3 = ((long)byArray[n2 + 1] & 0xFFL) << 48 | (l3 & 0xFFL) << 56 | ((long)byArray[n2 + 2] & 0xFFL) << 40 | ((long)byArray[n2 + 3] & 0xFFL) << 32 | ((long)byArray[n2 + 4] & 0xFFL) << 24 | ((long)byArray[n2 + 5] & 0xFFL) << 16 | ((long)byArray[n2 + 6] & 0xFFL) << 8;
        l2 = ((long)byArray[n2 + 7] & 0xFFL) << 0;
        return l2 | l3;
    }

    public static Integer readUint8(byte[] byArray, int n2) {
        return byArray[n2] & 0xFF;
    }

    public static void writeFloat32(byte[] byArray, int n2, double d2, boolean bl) {
        ByteIo.writeUint32(byArray, n2, Float.floatToIntBits((float)d2), bl);
    }

    public static void writeFloat64(byte[] byArray, int n2, double d2, boolean bl) {
        ByteIo.writeUint64(byArray, n2, Double.doubleToLongBits(d2), bl);
    }

    public static void writeInt16(byte[] byArray, int n2, int n3, boolean bl) {
        ByteIo.doWriteInt16(byArray, n2, n3, bl);
    }

    public static void writeInt32(byte[] byArray, int n2, int n3, boolean bl) {
        if (bl) {
            byArray[n2] = (byte)(n3 & 0xFF);
            byArray[n2 + 1] = (byte)(n3 >>> 8 & 0xFF);
            byArray[n2 + 2] = (byte)(n3 >>> 16 & 0xFF);
            byArray[n2 + 3] = (byte)(n3 >>> 24 & 0xFF);
        } else {
            byArray[n2] = (byte)(n3 >>> 24 & 0xFF);
            byArray[n2 + 1] = (byte)(n3 >>> 16 & 0xFF);
            byArray[n2 + 2] = (byte)(n3 >>> 8 & 0xFF);
            byArray[n2 + 3] = (byte)(n3 & 0xFF);
        }
    }

    public static void writeInt8(byte[] byArray, int n2, int n3) {
        byArray[n2] = (byte)n3;
    }

    public static void writeUint16(byte[] byArray, int n2, int n3, boolean bl) {
        ByteIo.doWriteInt16(byArray, n2, n3 & 0xFFFF, bl);
    }

    public static void writeUint32(byte[] byArray, int n2, long l2, boolean bl) {
        if (bl) {
            byArray[n2] = (byte)(l2 & 0xFFL);
            byArray[n2 + 1] = (byte)(l2 >>> 8 & 0xFFL);
            byArray[n2 + 2] = (byte)(l2 >>> 16 & 0xFFL);
            byArray[n2 + 3] = (byte)(l2 >>> 24 & 0xFFL);
        } else {
            byArray[n2] = (byte)(l2 >>> 24 & 0xFFL);
            byArray[n2 + 1] = (byte)(l2 >>> 16 & 0xFFL);
            byArray[n2 + 2] = (byte)(l2 >>> 8 & 0xFFL);
            byArray[n2 + 3] = (byte)(l2 & 0xFFL);
        }
    }

    public static void writeUint64(byte[] byArray, int n2, long l2, boolean bl) {
        if (bl) {
            byArray[n2] = (byte)(l2 & 0xFFL);
            byArray[n2 + 1] = (byte)(l2 >>> 8 & 0xFFL);
            byArray[n2 + 2] = (byte)(l2 >>> 16 & 0xFFL);
            byArray[n2 + 3] = (byte)(l2 >>> 24 & 0xFFL);
            byArray[n2 + 4] = (byte)(l2 >>> 32 & 0xFFL);
            byArray[n2 + 5] = (byte)(l2 >>> 40 & 0xFFL);
            byArray[n2 + 6] = (byte)(l2 >>> 48 & 0xFFL);
            byArray[n2 + 7] = (byte)(l2 >>> 56 & 0xFFL);
        } else {
            byArray[n2] = (byte)(l2 >>> 56 & 0xFFL);
            byArray[n2 + 1] = (byte)(l2 >>> 48 & 0xFFL);
            byArray[n2 + 2] = (byte)(l2 >>> 40 & 0xFFL);
            byArray[n2 + 3] = (byte)(l2 >>> 32 & 0xFFL);
            byArray[n2 + 4] = (byte)(l2 >>> 24 & 0xFFL);
            byArray[n2 + 5] = (byte)(l2 >>> 16 & 0xFFL);
            byArray[n2 + 6] = (byte)(l2 >>> 8 & 0xFFL);
            byArray[n2 + 7] = (byte)(l2 & 0xFFL);
        }
    }

    public static void writeUint8(byte[] byArray, int n2, int n3) {
        byArray[n2] = (byte)(n3 & 0xFF);
    }
}

