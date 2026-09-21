/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.typedarrays;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Optional;
import java.util.RandomAccess;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ExternalArrayData;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeArrayIterator;
import org.mozilla.javascript.NativeArrayIterator$ARRAY_ITERATOR_TYPE;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Symbol;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.Wrapper;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeArrayBufferView;
import org.mozilla.javascript.typedarrays.NativeTypedArrayIterator;

public abstract class NativeTypedArrayView<T>
extends NativeArrayBufferView
implements List<T>,
RandomAccess,
ExternalArrayData {
    private static final int Id_BYTES_PER_ELEMENT = 5;
    private static final int Id_at = 6;
    private static final int Id_constructor = 1;
    private static final int Id_get = 3;
    private static final int Id_length = 4;
    private static final int Id_set = 4;
    private static final int Id_subarray = 5;
    private static final int Id_toString = 2;
    private static final int MAX_INSTANCE_ID = 5;
    protected static final int MAX_PROTOTYPE_ID = 7;
    private static final int SymbolId_iterator = 7;
    private static final long serialVersionUID = -4963053773152251274L;
    protected final int length;

    protected NativeTypedArrayView() {
        this.length = 0;
    }

    protected NativeTypedArrayView(NativeArrayBuffer nativeArrayBuffer, int n2, int n3, int n4) {
        super(nativeArrayBuffer, n2, n4);
        this.length = n3;
    }

    private Object js_at(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        long l2 = objectArray.length >= 1 ? (long)ScriptRuntime.toInteger(objectArray[0]) : 0L;
        if (l2 < 0L) {
            l2 += (long)this.length;
        }
        if (l2 >= 0L && l2 < (long)this.length) {
            return ScriptableObject.getProperty(scriptable2, (int)l2);
        }
        return Undefined.instance;
    }

    private NativeTypedArrayView<T> js_constructor(Context object, Scriptable object2, Object[] objectArray) {
        int n2;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        if (!NativeArrayBufferView.isArg(objectArray, 0)) {
            return this.construct(new NativeArrayBuffer(), 0, 0);
        }
        NativeTypedArrayView<T> nativeTypedArrayView = objectArray[0];
        if (nativeTypedArrayView == null) {
            return this.construct(new NativeArrayBuffer(), 0, 0);
        }
        if (!(nativeTypedArrayView instanceof Number) && !(nativeTypedArrayView instanceof String)) {
            if (nativeTypedArrayView instanceof NativeTypedArrayView) {
                objectArray = nativeTypedArrayView;
                object = this.construct(this.makeArrayBuffer((Context)object, (Scriptable)object2, objectArray.length), 0, objectArray.length);
                for (n2 = n5; n2 < objectArray.length; ++n2) {
                    ((NativeTypedArrayView)object).js_set(n2, objectArray.js_get(n2));
                }
                return object;
            }
            if (nativeTypedArrayView instanceof NativeArrayBuffer) {
                object = (NativeArrayBuffer)((Object)nativeTypedArrayView);
                n2 = n3;
                if (NativeArrayBufferView.isArg(objectArray, 1)) {
                    n2 = ScriptRuntime.toInt32(objectArray[1]);
                }
                if (NativeArrayBufferView.isArg(objectArray, 2)) {
                    n3 = ScriptRuntime.toInt32(objectArray[2]);
                    n3 = this.getBytesPerElement() * n3;
                } else {
                    n3 = ((NativeArrayBuffer)object).getLength() - n2;
                }
                if (n2 >= 0 && n2 <= ((Object)(object2 = (Object)((NativeArrayBuffer)object).buffer)).length) {
                    if (n3 >= 0 && n2 + n3 <= ((Object)object2).length) {
                        if (n2 % this.getBytesPerElement() == 0) {
                            if (n3 % this.getBytesPerElement() == 0) {
                                return this.construct((NativeArrayBuffer)object, n2, n3 / this.getBytesPerElement());
                            }
                            throw ScriptRuntime.rangeError("offset and buffer must be a multiple of the byte size");
                        }
                        throw ScriptRuntime.rangeError("offset must be a multiple of the byte size");
                    }
                    throw ScriptRuntime.rangeError("length out of range");
                }
                throw ScriptRuntime.rangeError("offset out of range");
            }
            if (nativeTypedArrayView instanceof NativeArray) {
                objectArray = (NativeArray)((Object)nativeTypedArrayView);
                nativeTypedArrayView = this.construct(this.makeArrayBuffer((Context)object, (Scriptable)object2, objectArray.size()), 0, objectArray.size());
                for (n2 = 0; n2 < objectArray.size(); ++n2) {
                    object2 = objectArray.get(n2, (Scriptable)objectArray);
                    if (object2 != Scriptable.NOT_FOUND && object2 != Undefined.instance) {
                        object = object2;
                        if (object2 instanceof Wrapper) {
                            object = ((Wrapper)object2).unwrap();
                        }
                    } else {
                        object = ScriptRuntime.NaNobj;
                    }
                    nativeTypedArrayView.js_set(n2, object);
                }
                return nativeTypedArrayView;
            }
            if (ScriptRuntime.isArrayObject(nativeTypedArrayView)) {
                objectArray = ScriptRuntime.getArrayElements(nativeTypedArrayView);
                object = this.construct(this.makeArrayBuffer((Context)object, (Scriptable)object2, objectArray.length), 0, objectArray.length);
                for (n2 = n4; n2 < objectArray.length; ++n2) {
                    ((NativeTypedArrayView)object).js_set(n2, objectArray[n2]);
                }
                return object;
            }
            throw ScriptRuntime.constructError("Error", "invalid argument");
        }
        n2 = ScriptRuntime.toInt32(nativeTypedArrayView);
        return this.construct(this.makeArrayBuffer((Context)object, (Scriptable)object2, n2), 0, n2);
    }

    private Object js_subarray(Context context, Scriptable scriptable, int n2, int n3) {
        int n4 = n2;
        if (n2 < 0) {
            n4 = n2 + this.length;
        }
        n2 = n3;
        if (n3 < 0) {
            n2 = n3 + this.length;
        }
        n3 = Math.max(0, n4);
        n2 = Math.max(0, Math.min(this.length, n2) - n3);
        n4 = this.getByteOffset();
        n3 = Math.min(this.getBytesPerElement() * n3 + n4, this.arrayBuffer.getLength());
        return context.newObject(scriptable, this.getClassName(), new Object[]{this.arrayBuffer, n3, n2});
    }

    private NativeArrayBuffer makeArrayBuffer(Context context, Scriptable scriptable, int n2) {
        return (NativeArrayBuffer)context.newObject(scriptable, "ArrayBuffer", new Object[]{(double)n2 * (double)this.getBytesPerElement()});
    }

    private void setRange(NativeArray object, int n2) {
        if (n2 <= this.length) {
            if (((NativeArray)object).size() + n2 <= this.length) {
                object = ((NativeArray)object).iterator();
                while (object.hasNext()) {
                    this.js_set(n2, object.next());
                    ++n2;
                }
                return;
            }
            throw ScriptRuntime.rangeError("offset + length out of range");
        }
        throw ScriptRuntime.rangeError("offset out of range");
    }

    private void setRange(NativeTypedArrayView<T> nativeTypedArrayView, int n2) {
        int n3 = this.length;
        if (n2 < n3) {
            int n4 = nativeTypedArrayView.length;
            if (n4 <= n3 - n2) {
                NativeArrayBuffer nativeArrayBuffer = nativeTypedArrayView.arrayBuffer;
                Object[] objectArray = this.arrayBuffer;
                int n5 = 0;
                if (nativeArrayBuffer == objectArray) {
                    objectArray = new Object[n4];
                    n4 = 0;
                    while (true) {
                        if (n4 >= nativeTypedArrayView.length) break;
                        objectArray[n4] = nativeTypedArrayView.js_get(n4);
                        ++n4;
                    }
                    for (n3 = n5; n3 < nativeTypedArrayView.length; ++n3) {
                        this.js_set(n3 + n2, objectArray[n3]);
                    }
                } else {
                    for (n3 = 0; n3 < nativeTypedArrayView.length; ++n3) {
                        this.js_set(n3 + n2, nativeTypedArrayView.js_get(n3));
                    }
                }
                return;
            }
            throw ScriptRuntime.rangeError("source array too long");
        }
        throw ScriptRuntime.rangeError("offset out of range");
    }

    private static int toIndex(double d2) {
        int n2 = (int)d2;
        if ((double)n2 == d2 && n2 >= 0) {
            return n2;
        }
        return -1;
    }

    @Override
    public void add(int n2, T t2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean add(T t2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int n2, Collection<? extends T> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException();
    }

    protected boolean checkIndex(int n2) {
        boolean bl = n2 < 0 || n2 >= this.length;
        return bl;
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    protected abstract NativeTypedArrayView<T> construct(NativeArrayBuffer var1, int var2, int var3);

    @Override
    public boolean contains(Object object) {
        boolean bl = this.indexOf(object) >= 0;
        return bl;
    }

    @Override
    public boolean containsAll(Collection<?> object) {
        object = object.iterator();
        while (object.hasNext()) {
            if (this.contains(object.next())) continue;
            return false;
        }
        return true;
    }

    @Override
    public void delete(int n2) {
    }

    @Override
    public void delete(String string) {
        if (!ScriptRuntime.canonicalNumericIndexString(string).isPresent()) {
            super.delete(string);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean equals(Object object) {
        int n2;
        if (object == null) {
            return false;
        }
        try {
            object = (NativeTypedArrayView)object;
            if (this.length != ((NativeTypedArrayView)object).length) {
                return false;
            }
            n2 = 0;
        }
        catch (ClassCastException classCastException) {
            return false;
        }
        while (true) {
            if (n2 >= this.length) return true;
            boolean bl = this.js_get(n2).equals(((NativeTypedArrayView)object).js_get(n2));
            if (!bl) {
                return false;
            }
            ++n2;
            continue;
            break;
        }
    }

    @Override
    public Object execIdCall(IdFunctionObject serializable, Context object, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        if (!((IdFunctionObject)serializable).hasTag(this.getClassName())) {
            return super.execIdCall((IdFunctionObject)serializable, (Context)object, scriptable, scriptable2, objectArray);
        }
        int n2 = ((IdFunctionObject)serializable).methodId();
        int n3 = 1;
        int n4 = 0;
        switch (n2) {
            default: {
                throw new IllegalArgumentException(String.valueOf(n2));
            }
            case 7: {
                return new NativeArrayIterator(scriptable, scriptable2, NativeArrayIterator$ARRAY_ITERATOR_TYPE.VALUES);
            }
            case 6: {
                serializable = this.realThis(scriptable2, (IdFunctionObject)serializable);
                if (((Context)object).getLanguageVersion() < 200 && objectArray.length <= 0) {
                    throw ScriptRuntime.constructError("Error", "invalid arguments");
                }
                return super.js_at((Context)object, scriptable, scriptable2, objectArray);
            }
            case 5: {
                serializable = this.realThis(scriptable2, (IdFunctionObject)serializable);
                if (NativeArrayBufferView.isArg(objectArray, 0)) {
                    n4 = ScriptRuntime.toInt32(objectArray[0]);
                }
                n3 = NativeArrayBufferView.isArg(objectArray, 1) ? ScriptRuntime.toInt32(objectArray[1]) : ((NativeTypedArrayView)serializable).length;
                if (((Context)object).getLanguageVersion() < 200 && objectArray.length <= 0) {
                    throw ScriptRuntime.constructError("Error", "invalid arguments");
                }
                return super.js_subarray((Context)object, scriptable, n4, n3);
            }
            case 4: {
                if (objectArray.length > 0) {
                    serializable = this.realThis(scriptable2, (IdFunctionObject)serializable);
                    if (objectArray[0] instanceof NativeTypedArrayView) {
                        n4 = NativeArrayBufferView.isArg(objectArray, 1) ? ScriptRuntime.toInt32(objectArray[1]) : 0;
                        super.setRange((NativeTypedArrayView)objectArray[0], n4);
                        return Undefined.instance;
                    }
                    if (objectArray[0] instanceof NativeArray) {
                        n4 = NativeArrayBufferView.isArg(objectArray, 1) ? ScriptRuntime.toInt32(objectArray[1]) : 0;
                        super.setRange((NativeArray)objectArray[0], n4);
                        return Undefined.instance;
                    }
                    if (objectArray[0] instanceof Scriptable) {
                        return Undefined.instance;
                    }
                    if (NativeArrayBufferView.isArg(objectArray, 2)) {
                        return ((NativeTypedArrayView)serializable).js_set(ScriptRuntime.toInt32(objectArray[0]), objectArray[1]);
                    }
                }
                throw ScriptRuntime.constructError("Error", "invalid arguments");
            }
            case 3: {
                if (objectArray.length > 0) {
                    return this.realThis(scriptable2, (IdFunctionObject)serializable).js_get(ScriptRuntime.toInt32(objectArray[0]));
                }
                throw ScriptRuntime.constructError("Error", "invalid arguments");
            }
            case 2: {
                object = this.realThis(scriptable2, (IdFunctionObject)serializable);
                n2 = ((NativeTypedArrayView)object).getArrayLength();
                serializable = new StringBuilder();
                n4 = n3;
                if (n2 > 0) {
                    ((StringBuilder)serializable).append(ScriptRuntime.toString(((NativeTypedArrayView)object).js_get(0)));
                    n4 = n3;
                }
                while (n4 < n2) {
                    ((StringBuilder)serializable).append(',');
                    ((StringBuilder)serializable).append(ScriptRuntime.toString(((NativeTypedArrayView)object).js_get(n4)));
                    ++n4;
                }
                return ((StringBuilder)serializable).toString();
            }
            case 1: 
        }
        if (scriptable2 != null && ((Context)object).getLanguageVersion() >= 200) {
            throw ScriptRuntime.typeErrorById("msg.only.from.new", this.getClassName());
        }
        return this.js_constructor((Context)object, scriptable, objectArray);
    }

    @Override
    protected void fillConstructorProperties(IdFunctionObject idFunctionObject) {
        idFunctionObject.defineProperty("BYTES_PER_ELEMENT", (Object)ScriptRuntime.wrapInt(this.getBytesPerElement()), 7);
        super.fillConstructorProperties(idFunctionObject);
    }

    @Override
    protected int findInstanceIdInfo(String string) {
        Objects.requireNonNull(string);
        int n2 = !string.equals("length") ? (!string.equals("BYTES_PER_ELEMENT") ? 0 : 5) : 4;
        if (n2 == 0) {
            return super.findInstanceIdInfo(string);
        }
        if (n2 == 5) {
            return IdScriptableObject.instanceIdInfo(7, n2);
        }
        return IdScriptableObject.instanceIdInfo(5, n2);
    }

    @Override
    protected int findPrototypeId(String string) {
        Objects.requireNonNull(string);
        int n2 = string.hashCode();
        int n3 = 5;
        int n4 = -1;
        switch (n2) {
            default: {
                break;
            }
            case 113762: {
                if (!string.equals("set")) break;
                n4 = 5;
                break;
            }
            case 102230: {
                if (!string.equals("get")) break;
                n4 = 4;
                break;
            }
            case 3123: {
                if (!string.equals("at")) break;
                n4 = 3;
                break;
            }
            case -1588406278: {
                if (!string.equals("constructor")) break;
                n4 = 2;
                break;
            }
            case -1776922004: {
                if (!string.equals("toString")) break;
                n4 = 1;
                break;
            }
            case -2077778919: {
                if (!string.equals("subarray")) break;
                n4 = 0;
            }
        }
        switch (n4) {
            default: {
                n3 = 0;
                break;
            }
            case 5: {
                n3 = 4;
                break;
            }
            case 4: {
                n3 = 3;
                break;
            }
            case 3: {
                n3 = 6;
                break;
            }
            case 2: {
                n3 = 1;
                break;
            }
            case 1: {
                n3 = 2;
            }
            case 0: 
        }
        return n3;
    }

    @Override
    protected int findPrototypeId(Symbol symbol) {
        if (SymbolKey.ITERATOR.equals(symbol)) {
            return 7;
        }
        return 0;
    }

    @Override
    public Object get(int n2, Scriptable scriptable) {
        return this.js_get(n2);
    }

    @Override
    public Object get(String string, Scriptable scriptable) {
        int n2;
        Optional<Double> optional = ScriptRuntime.canonicalNumericIndexString(string);
        if (optional.isPresent() && (n2 = NativeTypedArrayView.toIndex(optional.get())) >= 0) {
            return this.js_get(n2);
        }
        return super.get(string, scriptable);
    }

    @Override
    public Object getArrayElement(int n2) {
        return this.js_get(n2);
    }

    @Override
    public int getArrayLength() {
        return this.length;
    }

    public abstract int getBytesPerElement();

    @Override
    public Object[] getIds() {
        Object[] objectArray = new Object[this.length];
        for (int i2 = 0; i2 < this.length; ++i2) {
            objectArray[i2] = i2;
        }
        return objectArray;
    }

    @Override
    protected String getInstanceIdName(int n2) {
        if (n2 != 4) {
            if (n2 != 5) {
                return super.getInstanceIdName(n2);
            }
            return "BYTES_PER_ELEMENT";
        }
        return "length";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected Object getInstanceIdValue(int n2) {
        if (n2 != 4) {
            if (n2 != 5) {
                return super.getInstanceIdValue(n2);
            }
            n2 = this.getBytesPerElement();
            return ScriptRuntime.wrapInt(n2);
        }
        n2 = this.length;
        return ScriptRuntime.wrapInt(n2);
    }

    @Override
    protected int getMaxInstanceId() {
        return 5;
    }

    @Override
    public boolean has(int n2, Scriptable scriptable) {
        return this.checkIndex(n2) ^ true;
    }

    @Override
    public boolean has(String string, Scriptable scriptable) {
        int n2;
        Optional<Double> optional = ScriptRuntime.canonicalNumericIndexString(string);
        if (optional.isPresent() && (n2 = NativeTypedArrayView.toIndex(optional.get())) >= 0) {
            return this.checkIndex(n2) ^ true;
        }
        return super.has(string, scriptable);
    }

    @Override
    public int hashCode() {
        int n2 = 0;
        for (int i2 = 0; i2 < this.length; ++i2) {
            n2 += this.js_get(i2).hashCode();
        }
        return n2;
    }

    @Override
    public int indexOf(Object object) {
        for (int i2 = 0; i2 < this.length; ++i2) {
            if (!object.equals(this.js_get(i2))) continue;
            return i2;
        }
        return -1;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected void initPrototypeId(int var1_1) {
        block9: {
            if (var1_1 == 7) {
                this.initPrototypeMethod((Object)this.getClassName(), var1_1, SymbolKey.ITERATOR, "[Symbol.iterator]", 0);
                return;
            }
            switch (var1_1) {
                default: {
                    throw new IllegalArgumentException(String.valueOf(var1_1));
                }
                case 6: {
                    var3_2 = "at";
                    ** GOTO lbl20
                }
                case 5: {
                    var3_2 = "subarray";
                    ** GOTO lbl16
                }
                case 4: {
                    var3_2 = "set";
lbl16:
                    // 2 sources

                    var2_3 = 2;
                    break block9;
                }
                case 3: {
                    var3_2 = "get";
lbl20:
                    // 2 sources

                    var2_3 = 1;
                    break block9;
                }
                case 2: {
                    var3_2 = "toString";
                    var2_3 = 0;
                    break block9;
                }
                case 1: 
            }
            var3_2 = "constructor";
            var2_3 = 3;
        }
        this.initPrototypeMethod((Object)this.getClassName(), var1_1, var3_2, null, var2_3);
    }

    @Override
    public boolean isEmpty() {
        boolean bl = this.length == 0;
        return bl;
    }

    @Override
    public Iterator<T> iterator() {
        return new NativeTypedArrayIterator(this, 0);
    }

    protected abstract Object js_get(int var1);

    protected abstract Object js_set(int var1, Object var2);

    @Override
    public int lastIndexOf(Object object) {
        for (int i2 = this.length - 1; i2 >= 0; --i2) {
            if (!object.equals(this.js_get(i2))) continue;
            return i2;
        }
        return -1;
    }

    @Override
    public ListIterator<T> listIterator() {
        return new NativeTypedArrayIterator(this, 0);
    }

    @Override
    public ListIterator<T> listIterator(int n2) {
        if (!this.checkIndex(n2)) {
            return new NativeTypedArrayIterator(this, n2);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public void put(int n2, Scriptable scriptable, Object object) {
        this.js_set(n2, object);
    }

    @Override
    public void put(String string, Scriptable scriptable, Object object) {
        Optional<Double> optional = ScriptRuntime.canonicalNumericIndexString(string);
        if (optional.isPresent()) {
            int n2 = NativeTypedArrayView.toIndex(optional.get());
            if (n2 >= 0) {
                this.js_set(n2, object);
            }
        } else {
            super.put(string, scriptable, object);
        }
    }

    protected abstract NativeTypedArrayView<T> realThis(Scriptable var1, IdFunctionObject var2);

    @Override
    public T remove(int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setArrayElement(int n2, Object object) {
        this.js_set(n2, object);
    }

    @Override
    public int size() {
        return this.length;
    }

    @Override
    public List<T> subList(int n2, int n3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray() {
        Object[] objectArray = new Object[this.length];
        for (int i2 = 0; i2 < this.length; ++i2) {
            objectArray[i2] = this.js_get(i2);
        }
        return objectArray;
    }

    @Override
    public <U> U[] toArray(U[] objectArray) {
        if (objectArray.length < this.length) {
            objectArray = (Object[])Array.newInstance(objectArray.getClass().getComponentType(), this.length);
        }
        for (int i2 = 0; i2 < this.length; ++i2) {
            try {
                objectArray[i2] = this.js_get(i2);
                continue;
            }
            catch (ClassCastException classCastException) {
                throw new ArrayStoreException();
            }
        }
        return objectArray;
    }
}

