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
import org.mozilla.javascript.typedarrays.NativeArrayBufferView;
import org.mozilla.javascript.typedarrays.NativeTypedArrayView;

public class NativeUint32Array
extends NativeTypedArrayView<Long> {
    private static final int BYTES_PER_ELEMENT = 4;
    private static final String CLASS_NAME = "Uint32Array";
    private static final long serialVersionUID = -7987831421954144244L;

    public NativeUint32Array() {
    }

    public NativeUint32Array(int n2) {
        this(new NativeArrayBuffer((double)n2 * 4.0), 0, n2);
    }

    public NativeUint32Array(NativeArrayBuffer nativeArrayBuffer, int n2, int n3) {
        super(nativeArrayBuffer, n2, n3, n3 * 4);
    }

    public static void init(Context context, Scriptable scriptable, boolean bl) {
        ScriptRuntimeES6.addSymbolSpecies(context, scriptable, new NativeUint32Array().exportAsJSClass(7, scriptable, bl));
    }

    protected NativeUint32Array construct(NativeArrayBuffer nativeArrayBuffer, int n2, int n3) {
        return new NativeUint32Array(nativeArrayBuffer, n2, n3);
    }

    @Override
    public Long get(int n2) {
        if (!this.checkIndex(n2)) {
            return (Long)this.js_get(n2);
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
        return ByteIo.readUint32(this.arrayBuffer.buffer, n2 * 4 + this.offset, NativeArrayBufferView.useLittleEndian());
    }

    @Override
    protected Object js_set(int n2, Object object) {
        if (this.checkIndex(n2)) {
            return Undefined.instance;
        }
        long l2 = Conversions.toUint32(object);
        ByteIo.writeUint32(this.arrayBuffer.buffer, n2 * 4 + this.offset, l2, NativeArrayBufferView.useLittleEndian());
        return null;
    }

    protected NativeUint32Array realThis(Scriptable scriptable, IdFunctionObject idFunctionObject) {
        return IdScriptableObject.ensureType(scriptable, NativeUint32Array.class, idFunctionObject);
    }

    @Override
    public Long set(int n2, Long l2) {
        if (!this.checkIndex(n2)) {
            return (Long)this.js_set(n2, l2);
        }
        throw new IndexOutOfBoundsException();
    }
}

