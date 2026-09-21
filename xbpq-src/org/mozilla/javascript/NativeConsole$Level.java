/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

public final class NativeConsole$Level
extends Enum<NativeConsole$Level> {
    private static final NativeConsole$Level[] $VALUES;
    public static final /* enum */ NativeConsole$Level DEBUG;
    public static final /* enum */ NativeConsole$Level ERROR;
    public static final /* enum */ NativeConsole$Level INFO;
    public static final /* enum */ NativeConsole$Level TRACE;
    public static final /* enum */ NativeConsole$Level WARN;

    static {
        NativeConsole$Level nativeConsole$Level;
        NativeConsole$Level nativeConsole$Level2;
        NativeConsole$Level nativeConsole$Level3;
        NativeConsole$Level nativeConsole$Level4;
        NativeConsole$Level nativeConsole$Level5;
        TRACE = nativeConsole$Level5 = new NativeConsole$Level();
        DEBUG = nativeConsole$Level4 = new NativeConsole$Level();
        INFO = nativeConsole$Level3 = new NativeConsole$Level();
        WARN = nativeConsole$Level2 = new NativeConsole$Level();
        ERROR = nativeConsole$Level = new NativeConsole$Level();
        $VALUES = new NativeConsole$Level[]{nativeConsole$Level5, nativeConsole$Level4, nativeConsole$Level3, nativeConsole$Level2, nativeConsole$Level};
    }

    public static NativeConsole$Level valueOf(String string) {
        return Enum.valueOf(NativeConsole$Level.class, string);
    }

    public static NativeConsole$Level[] values() {
        return (NativeConsole$Level[])$VALUES.clone();
    }
}

