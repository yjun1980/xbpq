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

public class NativeFloat32Array
extends NativeTypedArrayView<Float> {
    private static final int BYTES_PER_ELEMENT = 4;
    private static final String CLASS_NAME = "Float32Array";
    private static final long serialVersionUID = -8963461831950499340L;

    public NativeFloat32Array() {
    }

    public NativeFloat32Array(int n2) {
        this(new NativeArrayBuffer((double)n2 * 4.0), 0, n2);
    }

    public NativeFloat32Array(NativeArrayBuffer nativeArrayBuffer, int n2, int n3) {
        super(nativeArrayBuffer, n2, n3, n3 * 4);
    }

    public static void init(Context context, Scriptable scriptable, boolean bl) {
        ScriptRuntimeES6.addSymbolSpecies(context, scriptable, new NativeFloat32Array().exportAsJSClass(7, scriptable, bl));
    }

    protected NativeFloat32Array construct(NativeArrayBuffer nativeArrayBuffer, int n2, int n3) {
        return new NativeFloat32Array(nativeArrayBuffer, n2, n3);
    }

    @Override
    public Float get(int n2) {
        if (!this.checkIndex(n2)) {
            return (Float)this.js_get(n2);
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
        return ByteIo.readFloat32(this.arrayBuffer.buffer, n2 * 4 + this.offset, NativeArrayBufferView.useLittleEndian());
    }

    @Override
    protected Object js_set(int n2, Object object) {
        if (this.checkIndex(n2)) {
            return Undefined.instance;
        }
        double d2 = ScriptRuntime.toNumber(object);
        ByteIo.writeFloat32(this.arrayBuffer.buffer, n2 * 4 + this.offset, d2, NativeArrayBufferView.useLittleEndian());
        return null;
    }

    protected NativeFloat32Array realThis(Scriptable scriptable, IdFunctionObject idFunctionObject) {
        return IdScriptableObject.ensureType(scriptable, NativeFloat32Array.class, idFunctionObject);
    }

    @Override
    public Float set(int n2, Float f2) {
        if (!this.checkIndex(n2)) {
            return (Float)this.js_set(n2, f2);
        }
        throw new IndexOutOfBoundsException();
    }
}

