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

public class NativeFloat64Array
extends NativeTypedArrayView<Double> {
    private static final int BYTES_PER_ELEMENT = 8;
    private static final String CLASS_NAME = "Float64Array";
    private static final long serialVersionUID = -1255405650050639335L;

    public NativeFloat64Array() {
    }

    public NativeFloat64Array(int n2) {
        this(new NativeArrayBuffer((double)n2 * 8.0), 0, n2);
    }

    public NativeFloat64Array(NativeArrayBuffer nativeArrayBuffer, int n2, int n3) {
        super(nativeArrayBuffer, n2, n3, n3 * 8);
    }

    public static void init(Context context, Scriptable scriptable, boolean bl) {
        ScriptRuntimeES6.addSymbolSpecies(context, scriptable, new NativeFloat64Array().exportAsJSClass(7, scriptable, bl));
    }

    protected NativeFloat64Array construct(NativeArrayBuffer nativeArrayBuffer, int n2, int n3) {
        return new NativeFloat64Array(nativeArrayBuffer, n2, n3);
    }

    @Override
    public Double get(int n2) {
        if (!this.checkIndex(n2)) {
            return (Double)this.js_get(n2);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public int getBytesPerElement() {
        return 8;
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
        return Double.longBitsToDouble(ByteIo.readUint64Primitive(this.arrayBuffer.buffer, n2 * 8 + this.offset, NativeArrayBufferView.useLittleEndian()));
    }

    @Override
    protected Object js_set(int n2, Object object) {
        if (this.checkIndex(n2)) {
            return Undefined.instance;
        }
        long l2 = Double.doubleToLongBits(ScriptRuntime.toNumber(object));
        ByteIo.writeUint64(this.arrayBuffer.buffer, n2 * 8 + this.offset, l2, NativeArrayBufferView.useLittleEndian());
        return null;
    }

    protected NativeFloat64Array realThis(Scriptable scriptable, IdFunctionObject idFunctionObject) {
        return IdScriptableObject.ensureType(scriptable, NativeFloat64Array.class, idFunctionObject);
    }

    @Override
    public Double set(int n2, Double d2) {
        if (!this.checkIndex(n2)) {
            return (Double)this.js_set(n2, d2);
        }
        throw new IndexOutOfBoundsException();
    }
}

