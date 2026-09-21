/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.io.Serializable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Symbol;
import org.mozilla.javascript.SymbolScriptable;
import org.mozilla.javascript.UniqueTag;

final class IdScriptableObject$PrototypeValues
implements Serializable {
    private static final int NAME_SLOT = 1;
    private static final int SLOT_SPAN = 2;
    private static final long serialVersionUID = 3038645279153854371L;
    private short[] attributeArray;
    private IdFunctionObject constructor;
    private short constructorAttrs;
    int constructorId;
    private int maxId;
    private IdScriptableObject obj;
    private Object[] valueArray;

    IdScriptableObject$PrototypeValues(IdScriptableObject idScriptableObject, int n2) {
        if (idScriptableObject != null) {
            if (n2 >= 1) {
                this.obj = idScriptableObject;
                this.maxId = n2;
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Object ensureId(int n2) {
        int n3;
        Object object = this.valueArray;
        Object object2 = object;
        if (object == null) {
            synchronized (this) {
                object = this.valueArray;
                object2 = object;
                if (object == null) {
                    n3 = this.maxId;
                    object2 = new Object[n3 * 2];
                    this.valueArray = object2;
                    this.attributeArray = new short[n3];
                }
            }
        }
        int n4 = (n2 - 1) * 2;
        Object object3 = object2[n4];
        object = object3;
        if (object3 != null) return object;
        n3 = this.constructorId;
        if (n2 == n3) {
            this.initSlot(n3, "constructor", this.constructor, this.constructorAttrs);
            this.constructor = null;
        } else {
            this.obj.initPrototypeId(n2);
        }
        object = object2[n4];
        if (object != null) {
            return object;
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append(this.obj.getClass().getName());
        ((StringBuilder)object2).append(".initPrototypeId(int id) did not initialize id=");
        ((StringBuilder)object2).append(n2);
        throw new IllegalStateException(((StringBuilder)object2).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void initSlot(int n2, Object object, Object object2, int n3) {
        Object[] objectArray = this.valueArray;
        if (objectArray == null) {
            throw new IllegalStateException();
        }
        Object object3 = object2;
        if (object2 == null) {
            object3 = UniqueTag.NULL_VALUE;
        }
        int n4 = n2 - 1;
        n2 = n4 * 2;
        synchronized (this) {
            if (objectArray[n2] == null) {
                objectArray[n2] = object3;
                objectArray[n2 + 1] = object;
                this.attributeArray[n4] = (short)n3;
            } else if (!object.equals(objectArray[n2 + 1])) {
                object = new IllegalStateException();
                throw object;
            }
            return;
        }
    }

    final IdFunctionObject createPrecachedConstructor() {
        if (this.constructorId == 0) {
            int n2;
            this.constructorId = n2 = this.obj.findPrototypeId("constructor");
            if (n2 != 0) {
                this.obj.initPrototypeId(n2);
                Serializable serializable = this.constructor;
                if (serializable != null) {
                    ((IdFunctionObject)serializable).initFunction(this.obj.getClassName(), ScriptableObject.getTopLevelScope(this.obj));
                    this.constructor.markAsConstructor(this.obj);
                    return this.constructor;
                }
                serializable = new StringBuilder();
                ((StringBuilder)serializable).append(this.obj.getClass().getName());
                ((StringBuilder)serializable).append(".initPrototypeId() did not initialize id=");
                ((StringBuilder)serializable).append(this.constructorId);
                throw new IllegalStateException(((StringBuilder)serializable).toString());
            }
            throw new IllegalStateException("No id for constructor property");
        }
        throw new IllegalStateException();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void delete(int n2) {
        this.ensureId(n2);
        short[] sArray = this.attributeArray;
        if ((sArray[--n2] & 4) == 0) {
            synchronized (this) {
                this.valueArray[n2 * 2] = Scriptable.NOT_FOUND;
                this.attributeArray[n2] = 0;
                return;
            }
        }
        if (!Context.getContext().isStrictMode()) {
            return;
        }
        throw ScriptRuntime.typeErrorById("msg.delete.property.with.configurable.false", (String)this.valueArray[n2 * 2 + 1]);
    }

    final int findId(String string) {
        return this.obj.findPrototypeId(string);
    }

    final int findId(Symbol symbol) {
        return this.obj.findPrototypeId(symbol);
    }

    final Object get(int n2) {
        Object object;
        Object object2 = object = this.ensureId(n2);
        if (object == UniqueTag.NULL_VALUE) {
            object2 = null;
        }
        return object2;
    }

    final int getAttributes(int n2) {
        this.ensureId(n2);
        return this.attributeArray[n2 - 1];
    }

    final int getMaxId() {
        return this.maxId;
    }

    /*
     * Enabled aggressive block sorting
     */
    final Object[] getNames(boolean bl, boolean bl2, Object[] objectArray) {
        Object[] objectArray2;
        int n2;
        Object[] objectArray3 = null;
        int n3 = 0;
        for (n2 = 1; n2 <= this.maxId; ++n2) {
            int n4;
            block10: {
                block12: {
                    Object object;
                    block11: {
                        block9: {
                            object = this.ensureId(n2);
                            if (bl) break block9;
                            objectArray2 = objectArray3;
                            n4 = n3;
                            if ((this.attributeArray[n2 - 1] & 2) != 0) break block10;
                        }
                        objectArray2 = objectArray3;
                        n4 = n3;
                        if (object == Scriptable.NOT_FOUND) break block10;
                        object = this.valueArray[(n2 - 1) * 2 + 1];
                        if (!(object instanceof String)) break block11;
                        objectArray2 = objectArray3;
                        if (objectArray3 == null) {
                            objectArray2 = new Object[this.maxId];
                        }
                        n4 = n3 + 1;
                        objectArray2[n3] = object;
                        n3 = n4;
                        break block12;
                    }
                    objectArray2 = objectArray3;
                    n4 = n3;
                    if (!bl2) break block10;
                    objectArray2 = objectArray3;
                    n4 = n3;
                    if (!(object instanceof Symbol)) break block10;
                    objectArray2 = objectArray3;
                    if (objectArray3 == null) {
                        objectArray2 = new Object[this.maxId];
                    }
                    n4 = n3 + 1;
                    objectArray2[n3] = object.toString();
                    n3 = n4;
                }
                n4 = n3;
            }
            objectArray3 = objectArray2;
            n3 = n4;
        }
        if (n3 == 0) {
            return objectArray;
        }
        if (objectArray != null && objectArray.length != 0) {
            n2 = objectArray.length;
            objectArray2 = new Object[n2 + n3];
            System.arraycopy(objectArray, 0, objectArray2, 0, n2);
            System.arraycopy(objectArray3, 0, objectArray2, n2, n3);
            return objectArray2;
        }
        objectArray = objectArray3;
        if (n3 != objectArray3.length) {
            objectArray = new Object[n3];
            System.arraycopy(objectArray3, 0, objectArray, 0, n3);
        }
        return objectArray;
    }

    final boolean has(int n2) {
        Object object = this.valueArray;
        boolean bl = true;
        if (object == null) {
            return true;
        }
        if ((object = object[(n2 - 1) * 2]) == null) {
            return true;
        }
        if (object == Scriptable.NOT_FOUND) {
            bl = false;
        }
        return bl;
    }

    final void initValue(int n2, String string, Object object, int n3) {
        if (1 <= n2 && n2 <= this.maxId) {
            if (string != null) {
                if (object != Scriptable.NOT_FOUND) {
                    ScriptableObject.checkValidAttributes(n3);
                    if (this.obj.findPrototypeId(string) == n2) {
                        if (n2 == this.constructorId) {
                            if (object instanceof IdFunctionObject) {
                                this.constructor = (IdFunctionObject)object;
                                this.constructorAttrs = (short)n3;
                                return;
                            }
                            throw new IllegalArgumentException("consructor should be initialized with IdFunctionObject");
                        }
                        this.initSlot(n2, string, object, n3);
                        return;
                    }
                    throw new IllegalArgumentException(string);
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    final void initValue(int n2, Symbol symbol, Object object, int n3) {
        if (1 <= n2 && n2 <= this.maxId) {
            if (symbol != null) {
                if (object != Scriptable.NOT_FOUND) {
                    ScriptableObject.checkValidAttributes(n3);
                    if (this.obj.findPrototypeId(symbol) == n2) {
                        if (n2 == this.constructorId) {
                            if (object instanceof IdFunctionObject) {
                                this.constructor = (IdFunctionObject)object;
                                this.constructorAttrs = (short)n3;
                                return;
                            }
                            throw new IllegalArgumentException("consructor should be initialized with IdFunctionObject");
                        }
                        this.initSlot(n2, symbol, object, n3);
                        return;
                    }
                    throw new IllegalArgumentException(symbol.toString());
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void set(int n2, Scriptable object, Object object2) {
        if (object2 == Scriptable.NOT_FOUND) throw new IllegalArgumentException();
        this.ensureId(n2);
        Object object3 = this.attributeArray;
        if ((object3[--n2] & 1) != 0) return;
        if (object == this.obj) {
            object = object2;
            if (object2 == null) {
                object = UniqueTag.NULL_VALUE;
            }
            synchronized (this) {
                this.valueArray[n2 * 2] = object;
                return;
            }
        }
        object3 = this.valueArray[n2 * 2 + 1];
        if (object3 instanceof Symbol) {
            if (!(object instanceof SymbolScriptable)) return;
            ((SymbolScriptable)object).put((Symbol)object3, (Scriptable)object, object2);
            return;
        }
        object.put((String)object3, (Scriptable)object, object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void setAttributes(int n2, int n3) {
        ScriptableObject.checkValidAttributes(n3);
        this.ensureId(n2);
        synchronized (this) {
            this.attributeArray[n2 - 1] = (short)n3;
            return;
        }
    }
}

