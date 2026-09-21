/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.typedarrays;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.ScriptRuntimeES6;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.typedarrays.ByteIo;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeArrayBufferView;
import org.mozilla.javascript.typedarrays.NativeTypedArrayView;

public class NativeInt32Array
extends NativeTypedArrayView<Integer> {
    private static final int BYTES_PER_ELEMENT = 4;
    private static final String CLASS_NAME = "Int32Array";
    private static final long serialVersionUID = -8963461831950499340L;

    public NativeInt32Array() {
    }

    public NativeInt32Array(int n2) {
        this(new NativeArrayBuffer((double)n2 * 4.0), 0, n2);
    }

    public NativeInt32Array(NativeArrayBuffer nativeArrayBuffer, int n2, int n3) {
        super(nativeArrayBuffer, n2, n3, n3 * 4);
    }

    public static void init(Context context, Scriptable scriptable, boolean bl) {
        ScriptRuntimeES6.addSymbolSpecies(context, scriptable, new NativeInt32Array().exportAsJSClass(7, scriptable, bl));
    }

    protected NativeInt32Array construct(NativeArrayBuffer nativeArrayBuffer, int n2, int n3) {
        return new NativeInt32Array(nativeArrayBuffer, n2, n3);
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
        return 4;
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
        return ByteIo.readInt32(this.arrayBuffer.buffer, n2 * 4 + this.offset, NativeArrayBufferView.useLittleEndian());
    }

    @Override
    protected Object js_set(int n2, Object object) {
        if (this.checkIndex(n2)) {
            return Undefined.instance;
        }
        int n3 = ScriptRuntime.toInt32(object);
        ByteIo.writeInt32(this.arrayBuffer.buffer, n2 * 4 + this.offset, n3, NativeArrayBufferView.useLittleEndian());
        return null;
    }

    protected NativeInt32Array realThis(Scriptable scriptable, IdFunctionObject idFunctionObject) {
        return IdScriptableObject.ensureType(scriptable, NativeInt32Array.class, idFunctionObject);
    }

    @Override
    public Integer set(int n2, Integer n3) {
        if (!this.checkIndex(n2)) {
            return (Integer)this.js_set(n2, n3);
        }
        throw new IndexOutOfBoundsException();
    }
}

