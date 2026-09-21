/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.typedarrays;

import org.mozilla.javascript.ScriptRuntime;

public class Conversions {
    public static int toInt16(Object object) {
        return (short)ScriptRuntime.toInt32(object);
    }

    public static int toInt32(Object object) {
        return ScriptRuntime.toInt32(object);
    }

    public static int toInt8(Object object) {
        return (byte)ScriptRuntime.toInt32(object);
    }

    public static int toUint16(Object object) {
        return ScriptRuntime.toInt32(object) & 0xFFFF;
    }

    public static long toUint32(Object object) {
        return ScriptRuntime.toUint32(object);
    }

    public static int toUint8(Object object) {
        return ScriptRuntime.toInt32(object) & 0xFF;
    }

    public static int toUint8Clamp(Object object) {
        int n2;
        double d2 = ScriptRuntime.toNumber(object);
        if (d2 <= 0.0) {
            return 0;
        }
        if (d2 >= 255.0) {
            return 255;
        }
        double d3 = Math.floor(d2);
        double d4 = 0.5 + d3;
        if (d4 < d2) {
            return (int)(d3 + 1.0);
        }
        if (d2 < d4) {
            return (int)d3;
        }
        int n3 = n2 = (int)d3;
        if (n2 % 2 != 0) {
            n3 = n2 + 1;
        }
        return n3;
    }
}

