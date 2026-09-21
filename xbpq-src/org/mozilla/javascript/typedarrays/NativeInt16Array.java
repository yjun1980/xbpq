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

public class NativeInt16Array
extends NativeTypedArrayView<Short> {
    private static final int BYTES_PER_ELEMENT = 2;
    private static final String CLASS_NAME = "Int16Array";
    private static final long serialVersionUID = -8592870435287581398L;

    public NativeInt16Array() {
    }

    public NativeInt16Array(int n2) {
        this(new NativeArrayBuffer((double)n2 * 2.0), 0, n2);
    }

    public NativeInt16Array(NativeArrayBuffer nativeArrayBuffer, int n2, int n3) {
        super(nativeArrayBuffer, n2, n3, n3 * 2);
    }

    public static void init(Context context, Scriptable scriptable, boolean bl) {
        ScriptRuntimeES6.addSymbolSpecies(context, scriptable, new NativeInt16Array().exportAsJSClass(7, scriptable, bl));
    }

    protected NativeInt16Array construct(NativeArrayBuffer nativeArrayBuffer, int n2, int n3) {
        return new NativeInt16Array(nativeArrayBuffer, n2, n3);
    }

    @Override
    public Short get(int n2) {
        if (!this.checkIndex(n2)) {
            return (Short)this.js_get(n2);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public int getBytesPerElement() {
        return 2;
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
        return ByteIo.readInt16(this.arrayBuffer.buffer, n2 * 2 + this.offset, NativeArrayBufferView.useLittleEndian());
    }

    @Override
    protected Object js_set(int n2, Object object) {
        if (this.checkIndex(n2)) {
            return Undefined.instance;
        }
        int n3 = Conversions.toInt16(object);
        ByteIo.writeInt16(this.arrayBuffer.buffer, n2 * 2 + this.offset, n3, NativeArrayBufferView.useLittleEndian());
        return null;
    }

    protected NativeInt16Array realThis(Scriptable scriptable, IdFunctionObject idFunctionObject) {
        return IdScriptableObject.ensureType(scriptable, NativeInt16Array.class, idFunctionObject);
    }

    @Override
    public Short set(int n2, Short s2) {
        if (!this.checkIndex(n2)) {
            return (Short)this.js_set(n2, s2);
        }
        throw new IndexOutOfBoundsException();
    }
}

