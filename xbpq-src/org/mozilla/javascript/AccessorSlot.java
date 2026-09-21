/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.AccessorSlot$Getter;
import org.mozilla.javascript.AccessorSlot$Setter;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Slot;
import org.mozilla.javascript.Undefined;

public class AccessorSlot
extends Slot {
    private static final long serialVersionUID = 1677840254177335827L;
    transient AccessorSlot$Getter getter;
    transient AccessorSlot$Setter setter;

    AccessorSlot(Slot slot) {
        super(slot);
    }

    @Override
    Function getGetterFunction(String string, Scriptable scriptable) {
        AccessorSlot$Getter accessorSlot$Getter = this.getter;
        if (accessorSlot$Getter == null) {
            return null;
        }
        return accessorSlot$Getter.asGetterFunction(string, scriptable);
    }

    @Override
    ScriptableObject getPropertyDescriptor(Context object, Scriptable scriptable) {
        boolean bl;
        boolean bl2;
        int n2;
        int n3;
        ScriptableObject scriptableObject;
        block13: {
            block11: {
                block12: {
                    block10: {
                        scriptableObject = (ScriptableObject)((Context)object).newObject(scriptable);
                        n3 = this.getAttributes();
                        n2 = ((Context)object).getLanguageVersion();
                        bl2 = true;
                        n2 = n2 >= 200 ? 1 : 0;
                        object = this.getter;
                        if (n2 != 0) {
                            if (object == null && this.setter == null) {
                                bl = (n3 & 1) == 0;
                                scriptableObject.defineProperty("writable", (Object)bl, 0);
                            }
                        } else {
                            bl = object == null && this.setter == null;
                            scriptableObject.setCommonDescriptorProperties(n3, bl);
                        }
                        object = (object = this.name) == null ? "f" : object.toString();
                        Object object2 = this.getter;
                        if (object2 != null) {
                            Function function = object2.asGetterFunction((String)object, scriptable);
                            object2 = function;
                            if (function == null) {
                                object2 = Undefined.instance;
                            }
                            scriptableObject.defineProperty("get", object2, 0);
                        }
                        if ((object2 = this.setter) == null) break block10;
                        scriptable = object2.asSetterFunction((String)object, scriptable);
                        object = scriptable;
                        if (scriptable != null) break block11;
                        break block12;
                    }
                    if (n2 == 0) break block13;
                }
                object = Undefined.instance;
            }
            scriptableObject.defineProperty("set", object, 0);
        }
        if (n2 != 0) {
            bl = (n3 & 2) == 0;
            scriptableObject.defineProperty("enumerable", (Object)bl, 0);
            bl = (n3 & 4) == 0 ? bl2 : false;
            scriptableObject.defineProperty("configurable", (Object)bl, 0);
        }
        return scriptableObject;
    }

    @Override
    Function getSetterFunction(String string, Scriptable scriptable) {
        AccessorSlot$Setter accessorSlot$Setter = this.setter;
        if (accessorSlot$Setter == null) {
            return null;
        }
        return accessorSlot$Setter.asSetterFunction(string, scriptable);
    }

    @Override
    public Object getValue(Scriptable scriptable) {
        AccessorSlot$Getter accessorSlot$Getter = this.getter;
        if (accessorSlot$Getter != null) {
            return accessorSlot$Getter.getValue(scriptable);
        }
        return super.getValue(scriptable);
    }

    @Override
    boolean isSetterSlot() {
        return true;
    }

    @Override
    boolean isValueSlot() {
        return false;
    }

    @Override
    public boolean setValue(Object object, Scriptable scriptable, Scriptable scriptable2, boolean bl) {
        AccessorSlot$Setter accessorSlot$Setter = this.setter;
        if (accessorSlot$Setter == null) {
            if (this.getter != null) {
                this.throwNoSetterException(scriptable2, object);
                return true;
            }
            return super.setValue(object, scriptable, scriptable2, bl);
        }
        return accessorSlot$Setter.setValue(object, scriptable, scriptable2);
    }
}

