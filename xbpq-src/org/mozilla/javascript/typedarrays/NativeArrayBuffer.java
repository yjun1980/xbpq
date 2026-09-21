/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.typedarrays;

import java.util.Objects;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.typedarrays.NativeArrayBufferView;

public class NativeArrayBuffer
extends IdScriptableObject {
    public static final String CLASS_NAME = "ArrayBuffer";
    private static final int ConstructorId_isView = -1;
    private static final byte[] EMPTY_BUF = new byte[0];
    private static final int Id_byteLength = 1;
    private static final int Id_constructor = 1;
    private static final int Id_slice = 2;
    private static final int MAX_INSTANCE_ID = 1;
    private static final int MAX_PROTOTYPE_ID = 2;
    private static final long serialVersionUID = 3110411773054879549L;
    final byte[] buffer;

    public NativeArrayBuffer() {
        this.buffer = EMPTY_BUF;
    }

    public NativeArrayBuffer(double d2) {
        if (!(d2 >= 2.147483647E9)) {
            if (d2 != Double.NEGATIVE_INFINITY) {
                if (!(d2 <= -1.0)) {
                    int n2 = ScriptRuntime.toInt32(d2);
                    if (n2 >= 0) {
                        this.buffer = n2 == 0 ? EMPTY_BUF : new byte[n2];
                        return;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Negative array length ");
                    stringBuilder.append(d2);
                    throw ScriptRuntime.rangeError(stringBuilder.toString());
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Negative array length ");
                stringBuilder.append(d2);
                throw ScriptRuntime.rangeError(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Negative array length ");
            stringBuilder.append(d2);
            throw ScriptRuntime.rangeError(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("length parameter (");
        stringBuilder.append(d2);
        stringBuilder.append(") is too large ");
        throw ScriptRuntime.rangeError(stringBuilder.toString());
    }

    public static void init(Context context, Scriptable scriptable, boolean bl) {
        new NativeArrayBuffer().exportAsJSClass(2, scriptable, bl);
    }

    private static boolean isArg(Object[] objectArray, int n2) {
        boolean bl = objectArray.length > n2 && !Undefined.instance.equals(objectArray[n2]);
        return bl;
    }

    private static NativeArrayBuffer realThis(Scriptable scriptable, IdFunctionObject idFunctionObject) {
        return IdScriptableObject.ensureType(scriptable, NativeArrayBuffer.class, idFunctionObject);
    }

    @Override
    public Object execIdCall(IdFunctionObject idScriptableObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        if (!((IdFunctionObject)idScriptableObject).hasTag(CLASS_NAME)) {
            return super.execIdCall((IdFunctionObject)idScriptableObject, context, scriptable, scriptable2, objectArray);
        }
        int n2 = ((IdFunctionObject)idScriptableObject).methodId();
        boolean bl = true;
        if (n2 != -1) {
            double d2 = 0.0;
            if (n2 != 1) {
                if (n2 == 2) {
                    idScriptableObject = NativeArrayBuffer.realThis(scriptable2, (IdFunctionObject)idScriptableObject);
                    if (NativeArrayBuffer.isArg(objectArray, 0)) {
                        d2 = ScriptRuntime.toNumber(objectArray[0]);
                    }
                    double d3 = NativeArrayBuffer.isArg(objectArray, 1) ? ScriptRuntime.toNumber(objectArray[1]) : (double)((NativeArrayBuffer)idScriptableObject).buffer.length;
                    return ((NativeArrayBuffer)idScriptableObject).slice(d2, d3);
                }
                throw new IllegalArgumentException(String.valueOf(n2));
            }
            if (NativeArrayBuffer.isArg(objectArray, 0)) {
                d2 = ScriptRuntime.toNumber(objectArray[0]);
            }
            return new NativeArrayBuffer(d2);
        }
        if (!NativeArrayBuffer.isArg(objectArray, 0) || !(objectArray[0] instanceof NativeArrayBufferView)) {
            bl = false;
        }
        return bl;
    }

    @Override
    protected void fillConstructorProperties(IdFunctionObject idFunctionObject) {
        this.addIdFunctionProperty(idFunctionObject, CLASS_NAME, -1, "isView", 1);
    }

    @Override
    protected int findInstanceIdInfo(String string) {
        if ("byteLength".equals(string)) {
            return IdScriptableObject.instanceIdInfo(5, 1);
        }
        return super.findInstanceIdInfo(string);
    }

    @Override
    protected int findPrototypeId(String string) {
        Objects.requireNonNull(string);
        int n2 = !string.equals("constructor") ? (!string.equals("slice") ? 0 : 2) : 1;
        return n2;
    }

    public byte[] getBuffer() {
        return this.buffer;
    }

    @Override
    public String getClassName() {
        return CLASS_NAME;
    }

    @Override
    protected String getInstanceIdName(int n2) {
        if (n2 == 1) {
            return "byteLength";
        }
        return super.getInstanceIdName(n2);
    }

    @Override
    protected Object getInstanceIdValue(int n2) {
        if (n2 == 1) {
            return ScriptRuntime.wrapInt(this.buffer.length);
        }
        return super.getInstanceIdValue(n2);
    }

    public int getLength() {
        return this.buffer.length;
    }

    @Override
    protected int getMaxInstanceId() {
        return 1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected void initPrototypeId(int n2) {
        String string;
        int n3 = 2;
        if (n2 != 1) {
            if (n2 != 2) throw new IllegalArgumentException(String.valueOf(n2));
            string = "slice";
        } else {
            string = "constructor";
            n3 = 1;
        }
        this.initPrototypeMethod(CLASS_NAME, n2, string, n3);
    }

    public NativeArrayBuffer slice(double d2, double d3) {
        Object object = this.buffer;
        double d4 = ((byte[])object).length;
        double d5 = d3;
        if (d3 < 0.0) {
            d5 = d3 + (double)((byte[])object).length;
        }
        int n2 = ScriptRuntime.toInt32(Math.max(0.0, Math.min(d4, d5)));
        d5 = n2;
        d3 = d2;
        if (d2 < 0.0) {
            d3 = d2 + (double)this.buffer.length;
        }
        int n3 = ScriptRuntime.toInt32(Math.min(d5, Math.max(0.0, d3)));
        object = new NativeArrayBuffer(n2 -= n3);
        System.arraycopy(this.buffer, n3, object.buffer, 0, n2);
        return object;
    }
}

