/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.typedarrays;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.ScriptRuntimeES6;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.typedarrays.ByteIo;
import org.mozilla.javascript.typedarrays.Conversions;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeTypedArrayView;

public class NativeUint8Array
extends NativeTypedArrayView<Integer> {
    private static final String CLASS_NAME = "Uint8Array";
    private static final long serialVersionUID = -3349419704390398895L;

    public NativeUint8Array() {
    }

    public NativeUint8Array(int n2) {
        this(new NativeArrayBuffer(n2), 0, n2);
    }

    public NativeUint8Array(NativeArrayBuffer nativeArrayBuffer, int n2, int n3) {
        super(nativeArrayBuffer, n2, n3, n3);
    }

    public static void init(Context context, Scriptable scriptable, boolean bl) {
        ScriptRuntimeES6.addSymbolSpecies(context, scriptable, new NativeUint8Array().exportAsJSClass(7, scriptable, bl));
    }

    protected NativeUint8Array construct(NativeArrayBuffer nativeArrayBuffer, int n2, int n3) {
        return new NativeUint8Array(nativeArrayBuffer, n2, n3);
    }

    @Override
    public Integer get(int n2) {
        if (!this.checkIndex(n2)) {
            return (Integer)this.js_get(n2);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public int getBytesPerElement() {
        return 1;
    }

    @Override
    public String getClassName() {
        return CLASS_NAME;
    }

    @Override
    protected Object js_get(int n2) {
        if (this.checkIndex(n2)) {
            return Undefined.instance;
        }
        return ByteIo.readUint8(this.arrayBuffer.buffer, n2 + this.offset);
    }

    @Override
    protected Object js_set(int n2, Object object) {
        if (this.checkIndex(n2)) {
            return Undefined.instance;
        }
        int n3 = Conversions.toUint8(object);
        ByteIo.writeUint8(this.arrayBuffer.buffer, n2 + this.offset, n3);
        return null;
    }

    protected NativeUint8Array realThis(Scriptable scriptable, IdFunctionObject idFunctionObject) {
        return IdScriptableObject.ensureType(scriptable, NativeUint8Array.class, idFunctionObject);
    }

    @Override
    public Integer set(int n2, Integer n3) {
        if (!this.checkIndex(n2)) {
            return (Integer)this.js_set(n2, n3);
        }
        throw new IndexOutOfBoundsException();
    }
}

