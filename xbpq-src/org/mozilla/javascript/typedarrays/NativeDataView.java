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
import org.mozilla.javascript.typedarrays.ByteIo;
import org.mozilla.javascript.typedarrays.Conversions;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeArrayBufferView;

public class NativeDataView
extends NativeArrayBufferView {
    public static final String CLASS_NAME = "DataView";
    private static final int Id_constructor = 1;
    private static final int Id_getFloat32 = 8;
    private static final int Id_getFloat64 = 9;
    private static final int Id_getInt16 = 4;
    private static final int Id_getInt32 = 6;
    private static final int Id_getInt8 = 2;
    private static final int Id_getUint16 = 5;
    private static final int Id_getUint32 = 7;
    private static final int Id_getUint8 = 3;
    private static final int Id_setFloat32 = 16;
    private static final int Id_setFloat64 = 17;
    private static final int Id_setInt16 = 12;
    private static final int Id_setInt32 = 14;
    private static final int Id_setInt8 = 10;
    private static final int Id_setUint16 = 13;
    private static final int Id_setUint32 = 15;
    private static final int Id_setUint8 = 11;
    private static final int MAX_PROTOTYPE_ID = 17;
    private static final long serialVersionUID = 1427967607557438968L;

    public NativeDataView() {
    }

    public NativeDataView(NativeArrayBuffer nativeArrayBuffer, int n2, int n3) {
        super(nativeArrayBuffer, n2, n3);
    }

    private static int determinePos(Object[] objectArray) {
        if (NativeArrayBufferView.isArg(objectArray, 0)) {
            double d2 = ScriptRuntime.toNumber(objectArray[0]);
            if (!Double.isInfinite(d2)) {
                return ScriptRuntime.toInt32(d2);
            }
            throw ScriptRuntime.rangeError("offset out of range");
        }
        return 0;
    }

    public static void init(Context context, Scriptable scriptable, boolean bl) {
        new NativeDataView().exportAsJSClass(17, scriptable, bl);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static NativeDataView js_constructor(Object[] objectArray) {
        int n2;
        double d2;
        int n3 = 0;
        if (!NativeArrayBufferView.isArg(objectArray, 0) || !(objectArray[0] instanceof NativeArrayBuffer)) throw ScriptRuntime.constructError("TypeError", "Missing parameters");
        NativeArrayBuffer nativeArrayBuffer = (NativeArrayBuffer)objectArray[0];
        if (NativeArrayBufferView.isArg(objectArray, 1)) {
            d2 = ScriptRuntime.toNumber(objectArray[1]);
            if (Double.isInfinite(d2)) throw ScriptRuntime.rangeError("offset out of range");
            n3 = ScriptRuntime.toInt32(d2);
        }
        if (NativeArrayBufferView.isArg(objectArray, 2)) {
            d2 = ScriptRuntime.toNumber(objectArray[2]);
            if (Double.isInfinite(d2)) throw ScriptRuntime.rangeError("offset out of range");
            n2 = ScriptRuntime.toInt32(d2);
        } else {
            n2 = nativeArrayBuffer.getLength() - n3;
        }
        if (n2 < 0) throw ScriptRuntime.rangeError("length out of range");
        if (n3 < 0 || n3 + n2 > nativeArrayBuffer.getLength()) throw ScriptRuntime.rangeError("offset out of range");
        return new NativeDataView(nativeArrayBuffer, n3, n2);
    }

    private Object js_getFloat(int n2, Object[] objectArray) {
        int n3 = NativeDataView.determinePos(objectArray);
        this.rangeCheck(n3, n2);
        boolean bl = true;
        if (!NativeArrayBufferView.isArg(objectArray, 1) || n2 <= 1 || !ScriptRuntime.toBoolean(objectArray[1])) {
            bl = false;
        }
        if (n2 != 4) {
            if (n2 == 8) {
                return ByteIo.readFloat64(this.arrayBuffer.buffer, this.offset + n3, bl);
            }
            throw new AssertionError();
        }
        return ByteIo.readFloat32(this.arrayBuffer.buffer, this.offset + n3, bl);
    }

    private Object js_getInt(int n2, boolean bl, Object[] object) {
        int n3 = NativeDataView.determinePos(object);
        this.rangeCheck(n3, n2);
        boolean bl2 = NativeArrayBufferView.isArg(object, 1) && n2 > 1 && ScriptRuntime.toBoolean(object[1]);
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 == 4) {
                    object = this.arrayBuffer.buffer;
                    object = bl ? ByteIo.readInt32((byte[])object, this.offset + n3, bl2) : ByteIo.readUint32((byte[])object, this.offset + n3, bl2);
                    return object;
                }
                throw new AssertionError();
            }
            object = this.arrayBuffer.buffer;
            if (bl) {
                return ByteIo.readInt16((byte[])object, this.offset + n3, bl2);
            }
            return ByteIo.readUint16((byte[])object, this.offset + n3, bl2);
        }
        object = this.arrayBuffer.buffer;
        if (bl) {
            return ByteIo.readInt8((byte[])object, this.offset + n3);
        }
        return ByteIo.readUint8((byte[])object, this.offset + n3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void js_setFloat(int n2, Object[] objectArray) {
        int n3 = NativeDataView.determinePos(objectArray);
        if (n3 < 0) throw ScriptRuntime.rangeError("offset out of range");
        boolean bl = NativeArrayBufferView.isArg(objectArray, 2) && n2 > 1 && ScriptRuntime.toBoolean(objectArray[2]);
        double d2 = Double.NaN;
        if (objectArray.length > 1) {
            d2 = ScriptRuntime.toNumber(objectArray[1]);
        }
        if (n3 + n2 > this.byteLength) throw ScriptRuntime.rangeError("offset out of range");
        if (n2 != 4) {
            if (n2 != 8) throw new AssertionError();
            ByteIo.writeFloat64(this.arrayBuffer.buffer, this.offset + n3, d2, bl);
            return;
        } else {
            ByteIo.writeFloat32(this.arrayBuffer.buffer, this.offset + n3, d2, bl);
        }
    }

    private void js_setInt(int n2, boolean bl, Object[] objectArray) {
        block4: {
            block17: {
                block10: {
                    Object object;
                    int n3;
                    block15: {
                        block16: {
                            block5: {
                                block14: {
                                    boolean bl2;
                                    block12: {
                                        block13: {
                                            block6: {
                                                block7: {
                                                    block11: {
                                                        block8: {
                                                            block9: {
                                                                n3 = NativeDataView.determinePos(objectArray);
                                                                if (n3 < 0) break block4;
                                                                bl2 = NativeArrayBufferView.isArg(objectArray, 2) && n2 > 1 && ScriptRuntime.toBoolean(objectArray[2]);
                                                                object = ScriptRuntime.zeroObj;
                                                                if (objectArray.length > 1) {
                                                                    object = objectArray[1];
                                                                }
                                                                if (n2 == 1) break block5;
                                                                if (n2 == 2) break block6;
                                                                if (n2 != 4) break block7;
                                                                if (!bl) break block8;
                                                                int n4 = Conversions.toInt32(object);
                                                                if (n2 + n3 > this.byteLength) break block9;
                                                                ByteIo.writeInt32(this.arrayBuffer.buffer, this.offset + n3, n4, bl2);
                                                                break block10;
                                                            }
                                                            throw ScriptRuntime.rangeError("offset out of range");
                                                        }
                                                        long l2 = Conversions.toUint32(object);
                                                        if (n2 + n3 > this.byteLength) break block11;
                                                        ByteIo.writeUint32(this.arrayBuffer.buffer, this.offset + n3, l2, bl2);
                                                        break block10;
                                                    }
                                                    throw ScriptRuntime.rangeError("offset out of range");
                                                }
                                                throw new AssertionError();
                                            }
                                            if (!bl) break block12;
                                            int n5 = Conversions.toInt16(object);
                                            if (n2 + n3 > this.byteLength) break block13;
                                            ByteIo.writeInt16(this.arrayBuffer.buffer, this.offset + n3, n5, bl2);
                                            break block10;
                                        }
                                        throw ScriptRuntime.rangeError("offset out of range");
                                    }
                                    int n6 = Conversions.toUint16(object);
                                    if (n2 + n3 > this.byteLength) break block14;
                                    ByteIo.writeUint16(this.arrayBuffer.buffer, this.offset + n3, n6, bl2);
                                    break block10;
                                }
                                throw ScriptRuntime.rangeError("offset out of range");
                            }
                            if (!bl) break block15;
                            int n7 = Conversions.toInt8(object);
                            if (n2 + n3 > this.byteLength) break block16;
                            ByteIo.writeInt8(this.arrayBuffer.buffer, this.offset + n3, n7);
                            break block10;
                        }
                        throw ScriptRuntime.rangeError("offset out of range");
                    }
                    int n8 = Conversions.toUint8(object);
                    if (n2 + n3 > this.byteLength) break block17;
                    ByteIo.writeUint8(this.arrayBuffer.buffer, this.offset + n3, n8);
                }
                return;
            }
            throw ScriptRuntime.rangeError("offset out of range");
        }
        throw ScriptRuntime.rangeError("offset out of range");
    }

    private void rangeCheck(int n2, int n3) {
        if (n2 >= 0 && n2 + n3 <= this.byteLength) {
            return;
        }
        throw ScriptRuntime.rangeError("offset out of range");
    }

    private static NativeDataView realThis(Scriptable scriptable, IdFunctionObject idFunctionObject) {
        return IdScriptableObject.ensureType(scriptable, NativeDataView.class, idFunctionObject);
    }

    @Override
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        if (!idFunctionObject.hasTag(this.getClassName())) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objectArray);
        }
        int n2 = idFunctionObject.methodId();
        switch (n2) {
            default: {
                throw new IllegalArgumentException(String.valueOf(n2));
            }
            case 17: {
                NativeDataView.realThis(scriptable2, idFunctionObject).js_setFloat(8, objectArray);
                return Undefined.instance;
            }
            case 16: {
                NativeDataView.realThis(scriptable2, idFunctionObject).js_setFloat(4, objectArray);
                return Undefined.instance;
            }
            case 15: {
                NativeDataView.realThis(scriptable2, idFunctionObject).js_setInt(4, false, objectArray);
                return Undefined.instance;
            }
            case 14: {
                NativeDataView.realThis(scriptable2, idFunctionObject).js_setInt(4, true, objectArray);
                return Undefined.instance;
            }
            case 13: {
                NativeDataView.realThis(scriptable2, idFunctionObject).js_setInt(2, false, objectArray);
                return Undefined.instance;
            }
            case 12: {
                NativeDataView.realThis(scriptable2, idFunctionObject).js_setInt(2, true, objectArray);
                return Undefined.instance;
            }
            case 11: {
                NativeDataView.realThis(scriptable2, idFunctionObject).js_setInt(1, false, objectArray);
                return Undefined.instance;
            }
            case 10: {
                NativeDataView.realThis(scriptable2, idFunctionObject).js_setInt(1, true, objectArray);
                return Undefined.instance;
            }
            case 9: {
                return NativeDataView.realThis(scriptable2, idFunctionObject).js_getFloat(8, objectArray);
            }
            case 8: {
                return NativeDataView.realThis(scriptable2, idFunctionObject).js_getFloat(4, objectArray);
            }
            case 7: {
                return NativeDataView.realThis(scriptable2, idFunctionObject).js_getInt(4, false, objectArray);
            }
            case 6: {
                return NativeDataView.realThis(scriptable2, idFunctionObject).js_getInt(4, true, objectArray);
            }
            case 5: {
                return NativeDataView.realThis(scriptable2, idFunctionObject).js_getInt(2, false, objectArray);
            }
            case 4: {
                return NativeDataView.realThis(scriptable2, idFunctionObject).js_getInt(2, true, objectArray);
            }
            case 3: {
                return NativeDataView.realThis(scriptable2, idFunctionObject).js_getInt(1, false, objectArray);
            }
            case 2: {
                return NativeDataView.realThis(scriptable2, idFunctionObject).js_getInt(1, true, objectArray);
            }
            case 1: 
        }
        return NativeDataView.js_constructor(objectArray);
    }

    @Override
    protected int findPrototypeId(String string) {
        Objects.requireNonNull(string);
        int n2 = string.hashCode();
        int n3 = 16;
        int n4 = -1;
        switch (n2) {
            default: {
                break;
            }
            case 1984665003: {
                if (!string.equals("setInt8")) break;
                n4 = 16;
                break;
            }
            case 1967114856: {
                if (!string.equals("getUint8")) break;
                n4 = 15;
                break;
            }
            case 1956185304: {
                if (!string.equals("getInt32")) break;
                n4 = 14;
                break;
            }
            case 1956185246: {
                if (!string.equals("getInt16")) break;
                n4 = 13;
                break;
            }
            case 1406002396: {
                if (!string.equals("setUint8")) break;
                n4 = 12;
                break;
            }
            case 1395072844: {
                if (!string.equals("setInt32")) break;
                n4 = 11;
                break;
            }
            case 1395072786: {
                if (!string.equals("setInt16")) break;
                n4 = 10;
                break;
            }
            case 851018287: {
                if (!string.equals("getUint32")) break;
                n4 = 9;
                break;
            }
            case 851018229: {
                if (!string.equals("getUint16")) break;
                n4 = 8;
                break;
            }
            case 636401211: {
                if (!string.equals("setUint32")) break;
                n4 = 7;
                break;
            }
            case 636401153: {
                if (!string.equals("setUint16")) break;
                n4 = 6;
                break;
            }
            case 270417380: {
                if (!string.equals("getFloat64")) break;
                n4 = 5;
                break;
            }
            case 270417285: {
                if (!string.equals("getFloat32")) break;
                n4 = 4;
                break;
            }
            case -75444577: {
                if (!string.equals("getInt8")) break;
                n4 = 3;
                break;
            }
            case -1588406278: {
                if (!string.equals("constructor")) break;
                n4 = 2;
                break;
            }
            case -2087744680: {
                if (!string.equals("setFloat64")) break;
                n4 = 1;
                break;
            }
            case -2087744775: {
                if (!string.equals("setFloat32")) break;
                n4 = 0;
            }
        }
        switch (n4) {
            default: {
                n3 = 0;
                break;
            }
            case 16: {
                n3 = 10;
                break;
            }
            case 15: {
                n3 = 3;
                break;
            }
            case 14: {
                n3 = 6;
                break;
            }
            case 13: {
                n3 = 4;
                break;
            }
            case 12: {
                n3 = 11;
                break;
            }
            case 11: {
                n3 = 14;
                break;
            }
            case 10: {
                n3 = 12;
                break;
            }
            case 9: {
                n3 = 7;
                break;
            }
            case 8: {
                n3 = 5;
                break;
            }
            case 7: {
                n3 = 15;
                break;
            }
            case 6: {
                n3 = 13;
                break;
            }
            case 5: {
                n3 = 9;
                break;
            }
            case 4: {
                n3 = 8;
                break;
            }
            case 3: {
                n3 = 2;
                break;
            }
            case 2: {
                n3 = 1;
                break;
            }
            case 1: {
                n3 = 17;
            }
            case 0: 
        }
        return n3;
    }

    @Override
    public String getClassName() {
        return CLASS_NAME;
    }

    @Override
    protected void initPrototypeId(int n2) {
        String string;
        int n3;
        block19: {
            n3 = 2;
            switch (n2) {
                default: {
                    throw new IllegalArgumentException(String.valueOf(n2));
                }
                case 17: {
                    string = "setFloat64";
                    break block19;
                }
                case 16: {
                    string = "setFloat32";
                    break block19;
                }
                case 15: {
                    string = "setUint32";
                    break block19;
                }
                case 14: {
                    string = "setInt32";
                    break block19;
                }
                case 13: {
                    string = "setUint16";
                    break block19;
                }
                case 12: {
                    string = "setInt16";
                    break block19;
                }
                case 11: {
                    string = "setUint8";
                    break block19;
                }
                case 10: {
                    string = "setInt8";
                    break block19;
                }
                case 9: {
                    string = "getFloat64";
                    break;
                }
                case 8: {
                    string = "getFloat32";
                    break;
                }
                case 7: {
                    string = "getUint32";
                    break;
                }
                case 6: {
                    string = "getInt32";
                    break;
                }
                case 5: {
                    string = "getUint16";
                    break;
                }
                case 4: {
                    string = "getInt16";
                    break;
                }
                case 3: {
                    string = "getUint8";
                    break;
                }
                case 2: {
                    string = "getInt8";
                    break;
                }
                case 1: {
                    string = "constructor";
                }
            }
            n3 = 1;
        }
        this.initPrototypeMethod(this.getClassName(), n2, string, n3);
    }
}

