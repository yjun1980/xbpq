/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import com.github.catvod.spider.merge.C.a;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionCall;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdFunctionObjectES6;
import org.mozilla.javascript.IdScriptableObject$PrototypeValues;
import org.mozilla.javascript.NativeSymbol;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Symbol;
import org.mozilla.javascript.SymbolKey;

public abstract class IdScriptableObject
extends ScriptableObject
implements IdFunctionCall {
    private static final long serialVersionUID = -3744239272168621609L;
    private transient IdScriptableObject$PrototypeValues prototypeValues;

    public IdScriptableObject() {
    }

    public IdScriptableObject(Scriptable scriptable, Scriptable scriptable2) {
        super(scriptable, scriptable2);
    }

    protected static <T> T ensureType(Object object, Class<T> clazz, IdFunctionObject idFunctionObject) {
        if (clazz.isInstance(object)) {
            return (T)object;
        }
        if (object == null) {
            throw ScriptRuntime.typeErrorById("msg.incompat.call.details", idFunctionObject.getFunctionName(), "null", clazz.getName());
        }
        throw ScriptRuntime.typeErrorById("msg.incompat.call.details", idFunctionObject.getFunctionName(), object.getClass().getName(), clazz.getName());
    }

    private ScriptableObject getBuiltInDescriptor(String string) {
        int n2;
        Object object = this.getParentScope();
        Scriptable scriptable = object;
        if (object == null) {
            scriptable = this;
        }
        if ((n2 = this.findInstanceIdInfo(string)) != 0) {
            return ScriptableObject.buildDataDescriptor(scriptable, this.getInstanceIdValue(0xFFFF & n2), n2 >>> 16);
        }
        object = this.prototypeValues;
        if (object != null && (n2 = ((IdScriptableObject$PrototypeValues)object).findId(string)) != 0) {
            return ScriptableObject.buildDataDescriptor(scriptable, this.prototypeValues.get(n2), this.prototypeValues.getAttributes(n2));
        }
        return null;
    }

    private ScriptableObject getBuiltInDescriptor(Symbol symbol) {
        int n2;
        Object object = this.getParentScope();
        Scriptable scriptable = object;
        if (object == null) {
            scriptable = this;
        }
        if ((object = this.prototypeValues) != null && (n2 = ((IdScriptableObject$PrototypeValues)object).findId(symbol)) != 0) {
            return ScriptableObject.buildDataDescriptor(scriptable, this.prototypeValues.get(n2), this.prototypeValues.getAttributes(n2));
        }
        return null;
    }

    protected static int instanceIdInfo(int n2, int n3) {
        return n2 << 16 | n3;
    }

    private IdFunctionObject newIdFunction(Object object, int n2, String string, int n3, Scriptable scriptable) {
        object = Context.getContext().getLanguageVersion() < 200 ? new IdFunctionObject(this, object, n2, string, n3, scriptable) : new IdFunctionObjectES6(this, object, n2, string, n3, scriptable);
        if (this.isSealed()) {
            ((ScriptableObject)object).sealObject();
        }
        return object;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int n2 = objectInputStream.readInt();
        if (n2 != 0) {
            this.activatePrototypeMap(n2);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        IdScriptableObject$PrototypeValues idScriptableObject$PrototypeValues = this.prototypeValues;
        int n2 = idScriptableObject$PrototypeValues != null ? idScriptableObject$PrototypeValues.getMaxId() : 0;
        objectOutputStream.writeInt(n2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void activatePrototypeMap(int n2) {
        Serializable serializable = new IdScriptableObject$PrototypeValues(this, n2);
        synchronized (this) {
            if (this.prototypeValues == null) {
                this.prototypeValues = serializable;
                return;
            }
            serializable = new IllegalStateException();
            throw serializable;
        }
    }

    protected void addIdFunctionProperty(Scriptable scriptable, Object object, int n2, String string, int n3) {
        this.newIdFunction(object, n2, string, n3, ScriptableObject.getTopLevelScope(scriptable)).addAsProperty(scriptable);
    }

    protected final Object defaultGet(String string) {
        return super.get(string, (Scriptable)this);
    }

    protected final boolean defaultHas(String string) {
        return super.has(string, (Scriptable)this);
    }

    protected final void defaultPut(String string, Object object) {
        super.put(string, (Scriptable)this, object);
    }

    @Override
    protected void defineOwnProperty(Context object, Object object2, ScriptableObject scriptableObject, boolean bl) {
        if (object2 instanceof String) {
            IdScriptableObject$PrototypeValues idScriptableObject$PrototypeValues;
            int n2;
            String string = (String)object2;
            int n3 = this.findInstanceIdInfo(string);
            if (n3 != 0) {
                n2 = 0xFFFF & n3;
                if (ScriptableObject.isAccessorDescriptor(scriptableObject)) {
                    this.delete(n2);
                } else {
                    this.checkPropertyDefinition(scriptableObject);
                    this.checkPropertyChange(string, this.getOwnPropertyDescriptor((Context)object, object2), scriptableObject);
                    object = ScriptableObject.getProperty((Scriptable)scriptableObject, "value");
                    if (!(object == Scriptable.NOT_FOUND || ((n3 >>>= 16) & 1) != 0 && (n3 & 4) != 0 || this.sameValue(object, this.getInstanceIdValue(n2)))) {
                        this.setInstanceIdValue(n2, object);
                    }
                    this.setAttributes(string, this.applyDescriptorToAttributeBitset(n3, scriptableObject));
                    return;
                }
            }
            if ((idScriptableObject$PrototypeValues = this.prototypeValues) != null && (n3 = idScriptableObject$PrototypeValues.findId(string)) != 0) {
                if (ScriptableObject.isAccessorDescriptor(scriptableObject)) {
                    this.prototypeValues.delete(n3);
                } else {
                    this.checkPropertyDefinition(scriptableObject);
                    this.checkPropertyChange(string, this.getOwnPropertyDescriptor((Context)object, object2), scriptableObject);
                    n2 = this.prototypeValues.getAttributes(n3);
                    object = ScriptableObject.getProperty((Scriptable)scriptableObject, "value");
                    if (object != Scriptable.NOT_FOUND && (n2 & 1) == 0 && !this.sameValue(object, this.prototypeValues.get(n3))) {
                        this.prototypeValues.set(n3, this, object);
                    }
                    this.prototypeValues.setAttributes(n3, this.applyDescriptorToAttributeBitset(n2, scriptableObject));
                    if (super.has(string, (Scriptable)this)) {
                        super.delete(string);
                    }
                    return;
                }
            }
        }
        super.defineOwnProperty((Context)object, object2, scriptableObject, bl);
    }

    @Override
    public void delete(String string) {
        int n2 = this.findInstanceIdInfo(string);
        if (n2 != 0 && !this.isSealed()) {
            if ((n2 >>> 16 & 4) != 0) {
                if (Context.getContext().isStrictMode()) {
                    throw ScriptRuntime.typeErrorById("msg.delete.property.with.configurable.false", string);
                }
            } else {
                this.setInstanceIdValue(0xFFFF & n2, Scriptable.NOT_FOUND);
            }
            return;
        }
        IdScriptableObject$PrototypeValues idScriptableObject$PrototypeValues = this.prototypeValues;
        if (idScriptableObject$PrototypeValues != null && (n2 = idScriptableObject$PrototypeValues.findId(string)) != 0) {
            if (!this.isSealed()) {
                this.prototypeValues.delete(n2);
            }
            return;
        }
        super.delete(string);
    }

    @Override
    public void delete(Symbol symbol) {
        int n2 = this.findInstanceIdInfo(symbol);
        if (n2 != 0 && !this.isSealed()) {
            if ((n2 >>> 16 & 4) != 0) {
                if (Context.getContext().isStrictMode()) {
                    throw ScriptRuntime.typeErrorById("msg.delete.property.with.configurable.false", new Object[0]);
                }
            } else {
                this.setInstanceIdValue(0xFFFF & n2, Scriptable.NOT_FOUND);
            }
            return;
        }
        IdScriptableObject$PrototypeValues idScriptableObject$PrototypeValues = this.prototypeValues;
        if (idScriptableObject$PrototypeValues != null && (n2 = idScriptableObject$PrototypeValues.findId(symbol)) != 0) {
            if (!this.isSealed()) {
                this.prototypeValues.delete(n2);
            }
            return;
        }
        super.delete(symbol);
    }

    @Override
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        throw idFunctionObject.unknown();
    }

    public final IdFunctionObject exportAsJSClass(int n2, Scriptable scriptable, boolean bl) {
        if (scriptable != this && scriptable != null) {
            this.setParentScope(scriptable);
            this.setPrototype(ScriptableObject.getObjectPrototype(scriptable));
        }
        this.activatePrototypeMap(n2);
        scriptable = this.prototypeValues.createPrecachedConstructor();
        if (bl) {
            this.sealObject();
        }
        this.fillConstructorProperties((IdFunctionObject)scriptable);
        if (bl) {
            ((ScriptableObject)scriptable).sealObject();
        }
        ((IdFunctionObject)scriptable).exportAsScopeProperty();
        return scriptable;
    }

    protected void fillConstructorProperties(IdFunctionObject idFunctionObject) {
    }

    protected int findInstanceIdInfo(String string) {
        return 0;
    }

    protected int findInstanceIdInfo(Symbol symbol) {
        return 0;
    }

    protected int findPrototypeId(String string) {
        throw new IllegalStateException(string);
    }

    protected int findPrototypeId(Symbol symbol) {
        return 0;
    }

    @Override
    public Object get(String object, Scriptable object2) {
        Object object3 = super.get((String)object, (Scriptable)object2);
        if (object3 != (object2 = Scriptable.NOT_FOUND)) {
            return object3;
        }
        int n2 = this.findInstanceIdInfo((String)object);
        if (n2 != 0 && (object3 = this.getInstanceIdValue(n2 & 0xFFFF)) != object2) {
            return object3;
        }
        object3 = this.prototypeValues;
        if (object3 != null && (n2 = ((IdScriptableObject$PrototypeValues)object3).findId((String)object)) != 0 && (object = this.prototypeValues.get(n2)) != object2) {
            return object;
        }
        return object2;
    }

    @Override
    public Object get(Symbol object, Scriptable object2) {
        Object object3 = super.get((Symbol)object, (Scriptable)object2);
        if (object3 != (object2 = Scriptable.NOT_FOUND)) {
            return object3;
        }
        int n2 = this.findInstanceIdInfo((Symbol)object);
        if (n2 != 0 && (object3 = this.getInstanceIdValue(n2 & 0xFFFF)) != object2) {
            return object3;
        }
        object3 = this.prototypeValues;
        if (object3 != null && (n2 = ((IdScriptableObject$PrototypeValues)object3).findId((Symbol)object)) != 0 && (object = this.prototypeValues.get(n2)) != object2) {
            return object;
        }
        return object2;
    }

    @Override
    public int getAttributes(String string) {
        int n2 = this.findInstanceIdInfo(string);
        if (n2 != 0) {
            return n2 >>> 16;
        }
        IdScriptableObject$PrototypeValues idScriptableObject$PrototypeValues = this.prototypeValues;
        if (idScriptableObject$PrototypeValues != null && (n2 = idScriptableObject$PrototypeValues.findId(string)) != 0) {
            return this.prototypeValues.getAttributes(n2);
        }
        return super.getAttributes(string);
    }

    @Override
    public int getAttributes(Symbol symbol) {
        int n2 = this.findInstanceIdInfo(symbol);
        if (n2 != 0) {
            return n2 >>> 16;
        }
        IdScriptableObject$PrototypeValues idScriptableObject$PrototypeValues = this.prototypeValues;
        if (idScriptableObject$PrototypeValues != null && (n2 = idScriptableObject$PrototypeValues.findId(symbol)) != 0) {
            return this.prototypeValues.getAttributes(n2);
        }
        return super.getAttributes(symbol);
    }

    @Override
    Object[] getIds(boolean bl, boolean bl2) {
        Object[] objectArray;
        block9: {
            int n2;
            Object[] objectArray2 = super.getIds(bl, bl2);
            objectArray = this.prototypeValues;
            Object[] objectArray3 = objectArray2;
            if (objectArray != null) {
                objectArray3 = objectArray.getNames(bl, bl2, objectArray2);
            }
            objectArray = objectArray3;
            if (n2 == 0) break block9;
            objectArray2 = null;
            int n3 = 0;
            for (n2 = this.getMaxInstanceId(); n2 != 0; --n2) {
                int n4;
                block10: {
                    String string;
                    block12: {
                        int n5;
                        block11: {
                            string = this.getInstanceIdName(n2);
                            n5 = this.findInstanceIdInfo(string);
                            objectArray = objectArray2;
                            n4 = n3;
                            if (n5 == 0) break block10;
                            if (((n5 >>>= 16) & 4) != 0 || Scriptable.NOT_FOUND != this.getInstanceIdValue(n2)) break block11;
                            objectArray = objectArray2;
                            n4 = n3;
                            break block10;
                        }
                        if (bl) break block12;
                        objectArray = objectArray2;
                        n4 = n3;
                        if ((n5 & 2) != 0) break block10;
                    }
                    if (n3 == 0) {
                        objectArray2 = new Object[n2];
                    }
                    objectArray2[n3] = string;
                    n4 = n3 + 1;
                    objectArray = objectArray2;
                }
                objectArray2 = objectArray;
                n3 = n4;
            }
            objectArray = objectArray3;
            if (n3 != 0) {
                if (objectArray3.length == 0 && objectArray2.length == n3) {
                    objectArray = objectArray2;
                } else {
                    objectArray = new Object[objectArray3.length + n3];
                    System.arraycopy(objectArray3, 0, objectArray, 0, objectArray3.length);
                    System.arraycopy(objectArray2, 0, objectArray, objectArray3.length, n3);
                }
            }
        }
        return objectArray;
    }

    protected String getInstanceIdName(int n2) {
        throw new IllegalArgumentException(String.valueOf(n2));
    }

    protected Object getInstanceIdValue(int n2) {
        throw new IllegalStateException(String.valueOf(n2));
    }

    protected int getMaxInstanceId() {
        return 0;
    }

    @Override
    protected ScriptableObject getOwnPropertyDescriptor(Context object, Object object2) {
        ScriptableObject scriptableObject = super.getOwnPropertyDescriptor((Context)object, object2);
        object = scriptableObject;
        if (scriptableObject == null) {
            if (object2 instanceof String) {
                return this.getBuiltInDescriptor((String)object2);
            }
            object = scriptableObject;
            if (ScriptRuntime.isSymbol(object2)) {
                if (object2 instanceof SymbolKey) {
                    return this.getBuiltInDescriptor((SymbolKey)object2);
                }
                object = this.getBuiltInDescriptor(((NativeSymbol)object2).getKey());
            }
        }
        return object;
    }

    @Override
    public boolean has(String string, Scriptable scriptable) {
        int n2 = this.findInstanceIdInfo(string);
        if (n2 != 0) {
            boolean bl = true;
            if ((n2 >>> 16 & 4) != 0) {
                return true;
            }
            if (Scriptable.NOT_FOUND == this.getInstanceIdValue(0xFFFF & n2)) {
                bl = false;
            }
            return bl;
        }
        IdScriptableObject$PrototypeValues idScriptableObject$PrototypeValues = this.prototypeValues;
        if (idScriptableObject$PrototypeValues != null && (n2 = idScriptableObject$PrototypeValues.findId(string)) != 0) {
            return this.prototypeValues.has(n2);
        }
        return super.has(string, scriptable);
    }

    @Override
    public boolean has(Symbol symbol, Scriptable scriptable) {
        int n2 = this.findInstanceIdInfo(symbol);
        if (n2 != 0) {
            boolean bl = true;
            if ((n2 >>> 16 & 4) != 0) {
                return true;
            }
            if (Scriptable.NOT_FOUND == this.getInstanceIdValue(0xFFFF & n2)) {
                bl = false;
            }
            return bl;
        }
        IdScriptableObject$PrototypeValues idScriptableObject$PrototypeValues = this.prototypeValues;
        if (idScriptableObject$PrototypeValues != null && (n2 = idScriptableObject$PrototypeValues.findId(symbol)) != 0) {
            return this.prototypeValues.has(n2);
        }
        return super.has(symbol, scriptable);
    }

    public final boolean hasPrototypeMap() {
        boolean bl = this.prototypeValues != null;
        return bl;
    }

    public final void initPrototypeConstructor(IdFunctionObject idFunctionObject) {
        int n2 = this.prototypeValues.constructorId;
        if (n2 != 0) {
            if (idFunctionObject.methodId() == n2) {
                if (this.isSealed()) {
                    idFunctionObject.sealObject();
                }
                this.prototypeValues.initValue(n2, "constructor", (Object)idFunctionObject, 2);
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalStateException();
    }

    protected void initPrototypeId(int n2) {
        throw new IllegalStateException(String.valueOf(n2));
    }

    public final IdFunctionObject initPrototypeMethod(Object object, int n2, String string, int n3) {
        return this.initPrototypeMethod(object, n2, string, string, n3);
    }

    public final IdFunctionObject initPrototypeMethod(Object object, int n2, String string, String string2, int n3) {
        Scriptable scriptable = ScriptableObject.getTopLevelScope(this);
        if (string2 == null) {
            string2 = string;
        }
        object = this.newIdFunction(object, n2, string2, n3, scriptable);
        this.prototypeValues.initValue(n2, string, object, 2);
        return object;
    }

    public final IdFunctionObject initPrototypeMethod(Object object, int n2, Symbol symbol, String string, int n3) {
        object = this.newIdFunction(object, n2, string, n3, ScriptableObject.getTopLevelScope(this));
        this.prototypeValues.initValue(n2, symbol, object, 2);
        return object;
    }

    public final void initPrototypeValue(int n2, String string, Object object, int n3) {
        this.prototypeValues.initValue(n2, string, object, n3);
    }

    public final void initPrototypeValue(int n2, Symbol symbol, Object object, int n3) {
        this.prototypeValues.initValue(n2, symbol, object, n3);
    }

    @Override
    public void put(String string, Scriptable scriptable, Object object) {
        int n2 = this.findInstanceIdInfo(string);
        if (n2 != 0) {
            if (scriptable == this && this.isSealed()) {
                throw Context.reportRuntimeErrorById("msg.modify.sealed", string);
            }
            if ((n2 >>> 16 & 1) == 0) {
                if (scriptable == this) {
                    this.setInstanceIdValue(0xFFFF & n2, object);
                } else {
                    scriptable.put(string, scriptable, object);
                }
            }
            return;
        }
        IdScriptableObject$PrototypeValues idScriptableObject$PrototypeValues = this.prototypeValues;
        if (idScriptableObject$PrototypeValues != null && (n2 = idScriptableObject$PrototypeValues.findId(string)) != 0) {
            if (scriptable == this && this.isSealed()) {
                throw Context.reportRuntimeErrorById("msg.modify.sealed", string);
            }
            this.prototypeValues.set(n2, scriptable, object);
            return;
        }
        super.put(string, scriptable, object);
    }

    @Override
    public void put(Symbol symbol, Scriptable scriptable, Object object) {
        int n2 = this.findInstanceIdInfo(symbol);
        if (n2 != 0) {
            if (scriptable == this && this.isSealed()) {
                throw Context.reportRuntimeErrorById("msg.modify.sealed", new Object[0]);
            }
            if ((n2 >>> 16 & 1) == 0) {
                if (scriptable == this) {
                    this.setInstanceIdValue(0xFFFF & n2, object);
                } else {
                    ScriptableObject.ensureSymbolScriptable(scriptable).put(symbol, scriptable, object);
                }
            }
            return;
        }
        IdScriptableObject$PrototypeValues idScriptableObject$PrototypeValues = this.prototypeValues;
        if (idScriptableObject$PrototypeValues != null && (n2 = idScriptableObject$PrototypeValues.findId(symbol)) != 0) {
            if (scriptable == this && this.isSealed()) {
                throw Context.reportRuntimeErrorById("msg.modify.sealed", new Object[0]);
            }
            this.prototypeValues.set(n2, scriptable, object);
            return;
        }
        super.put(symbol, scriptable, object);
    }

    @Override
    public void setAttributes(String string, int n2) {
        ScriptableObject.checkValidAttributes(n2);
        int n3 = this.findInstanceIdInfo(string);
        if (n3 != 0) {
            if (n2 != n3 >>> 16) {
                this.setInstanceIdAttributes(0xFFFF & n3, n2);
            }
            return;
        }
        IdScriptableObject$PrototypeValues idScriptableObject$PrototypeValues = this.prototypeValues;
        if (idScriptableObject$PrototypeValues != null && (n3 = idScriptableObject$PrototypeValues.findId(string)) != 0) {
            this.prototypeValues.setAttributes(n3, n2);
            return;
        }
        super.setAttributes(string, n2);
    }

    protected void setInstanceIdAttributes(int n2, int n3) {
        StringBuilder stringBuilder = a.c("Changing attributes not supported for ");
        stringBuilder.append(this.getClassName());
        stringBuilder.append(" ");
        stringBuilder.append(this.getInstanceIdName(n2));
        stringBuilder.append(" property");
        throw ScriptRuntime.constructError("InternalError", stringBuilder.toString());
    }

    protected void setInstanceIdValue(int n2, Object object) {
        throw new IllegalStateException(String.valueOf(n2));
    }
}

