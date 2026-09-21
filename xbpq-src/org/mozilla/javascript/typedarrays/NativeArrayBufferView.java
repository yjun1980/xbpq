/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.typedarrays;

import java.util.Objects;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Symbol;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;

public abstract class NativeArrayBufferView
extends IdScriptableObject {
    private static final int Id_buffer = 1;
    private static final int Id_byteLength = 3;
    private static final int Id_byteOffset = 2;
    protected static final int MAX_INSTANCE_ID = 3;
    private static final long serialVersionUID = 6884475582973958419L;
    private static Boolean useLittleEndian;
    protected final NativeArrayBuffer arrayBuffer;
    protected final int byteLength;
    protected final int offset;

    public NativeArrayBufferView() {
        this.arrayBuffer = new NativeArrayBuffer();
        this.offset = 0;
        this.byteLength = 0;
    }

    protected NativeArrayBufferView(NativeArrayBuffer nativeArrayBuffer, int n2, int n3) {
        this.offset = n2;
        this.byteLength = n3;
        this.arrayBuffer = nativeArrayBuffer;
    }

    protected static boolean isArg(Object[] objectArray, int n2) {
        boolean bl = objectArray.length > n2 && !Undefined.instance.equals(objectArray[n2]);
        return bl;
    }

    protected static boolean useLittleEndian() {
        if (useLittleEndian == null) {
            Context context = Context.getCurrentContext();
            if (context == null) {
                return false;
            }
            useLittleEndian = context.hasFeature(19);
        }
        return useLittleEndian;
    }

    @Override
    protected int findInstanceIdInfo(String string) {
        Objects.requireNonNull(string);
        int n2 = string.hashCode();
        int n3 = 2;
        int n4 = -1;
        switch (n2) {
            default: {
                break;
            }
            case 368036795: {
                if (!string.equals("byteOffset")) break;
                n4 = 2;
                break;
            }
            case 281453070: {
                if (!string.equals("byteLength")) break;
                n4 = 1;
                break;
            }
            case -1378118592: {
                if (!string.equals("buffer")) break;
                n4 = 0;
            }
        }
        switch (n4) {
            default: {
                n3 = 0;
                break;
            }
            case 1: {
                n3 = 3;
                break;
            }
            case 0: {
                n3 = 1;
            }
            case 2: 
        }
        if (n3 == 0) {
            return super.findInstanceIdInfo(string);
        }
        return IdScriptableObject.instanceIdInfo(5, n3);
    }

    @Override
    public Object get(Symbol symbol, Scriptable scriptable) {
        if (SymbolKey.TO_STRING_TAG.equals(symbol)) {
            return this.getClassName();
        }
        return super.get(symbol, scriptable);
    }

    public NativeArrayBuffer getBuffer() {
        return this.arrayBuffer;
    }

    public int getByteLength() {
        return this.byteLength;
    }

    public int getByteOffset() {
        return this.offset;
    }

    @Override
    protected String getInstanceIdName(int n2) {
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    return super.getInstanceIdName(n2);
                }
                return "byteLength";
            }
            return "byteOffset";
        }
        return "buffer";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected Object getInstanceIdValue(int n2) {
        if (n2 == 1) return this.arrayBuffer;
        if (n2 != 2) {
            if (n2 != 3) {
                return super.getInstanceIdValue(n2);
            }
            n2 = this.byteLength;
            return ScriptRuntime.wrapInt(n2);
        }
        n2 = this.offset;
        return ScriptRuntime.wrapInt(n2);
    }

    @Override
    protected int getMaxInstanceId() {
        return 3;
    }
}

