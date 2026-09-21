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

public class NativeInt8Array
extends NativeTypedArrayView<Byte> {
    private static final String CLASS_NAME = "Int8Array";
    private static final long serialVersionUID = -3349419704390398895L;

    public NativeInt8Array() {
    }

    public NativeInt8Array(int n2) {
        this(new NativeArrayBuffer(n2), 0, n2);
    }

    public NativeInt8Array(NativeArrayBuffer nativeArrayBuffer, int n2, int n3) {
        super(nativeArrayBuffer, n2, n3, n3);
    }

    public static void init(Context context, Scriptable scriptable, boolean bl) {
        ScriptRuntimeES6.addSymbolSpecies(context, scriptable, new NativeInt8Array().exportAsJSClass(7, scriptable, bl));
    }

    protected NativeInt8Array construct(NativeArrayBuffer nativeArrayBuffer, int n2, int n3) {
        return new NativeInt8Array(nativeArrayBuffer, n2, n3);
    }

    @Override
    public Byte get(int n2) {
        if (!this.checkIndex(n2)) {
            return (Byte)this.js_get(n2);
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
        return ByteIo.readInt8(this.arrayBuffer.buffer, n2 + this.offset);
    }

    @Override
    protected Object js_set(int n2, Object object) {
        if (this.checkIndex(n2)) {
            return Undefined.instance;
        }
        int n3 = Conversions.toInt8(object);
        ByteIo.writeInt8(this.arrayBuffer.buffer, n2 + this.offset, n3);
        return null;
    }

    protected NativeInt8Array realThis(Scriptable scriptable, IdFunctionObject idFunctionObject) {
        return IdScriptableObject.ensureType(scriptable, NativeInt8Array.class, idFunctionObject);
    }

    @Override
    public Byte set(int n2, Byte by) {
        if (!this.checkIndex(n2)) {
            return (Byte)this.js_set(n2, by);
        }
        throw new IndexOutOfBoundsException();
    }
}

