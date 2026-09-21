/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.Ref;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Undefined;

class SpecialRef
extends Ref {
    private static final int SPECIAL_NONE = 0;
    private static final int SPECIAL_PARENT = 2;
    private static final int SPECIAL_PROTO = 1;
    private static final long serialVersionUID = -7521596632456797847L;
    private String name;
    private Scriptable target;
    private int type;

    private SpecialRef(Scriptable scriptable, int n2, String string) {
        this.target = scriptable;
        this.type = n2;
        this.name = string;
    }

    static Ref createSpecial(Context context, Scriptable scriptable, Object object, String string) {
        block4: {
            block7: {
                int n2;
                block6: {
                    block5: {
                        if ((scriptable = ScriptRuntime.toObjectOrNull(context, object, scriptable)) == null) break block4;
                        if (!string.equals("__proto__")) break block5;
                        n2 = 1;
                        break block6;
                    }
                    if (!string.equals("__parent__")) break block7;
                    n2 = 2;
                }
                if (!context.hasFeature(5)) {
                    n2 = 0;
                }
                return new SpecialRef(scriptable, n2, string);
            }
            throw new IllegalArgumentException(string);
        }
        throw ScriptRuntime.undefReadError(object, string);
    }

    @Override
    public boolean delete(Context context) {
        if (this.type == 0) {
            return ScriptRuntime.deleteObjectElem(this.target, this.name, context);
        }
        return false;
    }

    @Override
    public Object get(Context context) {
        int n2 = this.type;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 == 2) {
                    return this.target.getParentScope();
                }
                throw Kit.codeBug();
            }
            return this.target.getPrototype();
        }
        return ScriptRuntime.getObjectProp(this.target, this.name, context);
    }

    @Override
    public boolean has(Context context) {
        if (this.type == 0) {
            return ScriptRuntime.hasObjectElem(this.target, this.name, context);
        }
        return true;
    }

    @Override
    @Deprecated
    public Object set(Context context, Object object) {
        throw new IllegalStateException();
    }

    @Override
    public Object set(Context object, Scriptable object2, Object object3) {
        int n2 = this.type;
        if (n2 != 0) {
            Scriptable scriptable;
            block13: {
                if (n2 != 1 && n2 != 2) {
                    throw Kit.codeBug();
                }
                scriptable = ScriptRuntime.toObjectOrNull((Context)object, object3, (Scriptable)object2);
                if (scriptable != null) {
                    Scriptable scriptable2 = scriptable;
                    while (scriptable2 != this.target) {
                        object2 = this.type == 1 ? scriptable2.getPrototype() : scriptable2.getParentScope();
                        scriptable2 = object2;
                        if (object2 != null) continue;
                        break block13;
                    }
                    throw Context.reportRuntimeErrorById("msg.cyclic.value", this.name);
                }
            }
            if (this.type == 1) {
                object2 = this.target;
                if (object2 instanceof ScriptableObject && !((ScriptableObject)object2).isExtensible() && ((Context)object).getLanguageVersion() >= 180) {
                    throw ScriptRuntime.typeErrorById("msg.not.extensible", new Object[0]);
                }
                if (((Context)object).getLanguageVersion() >= 200) {
                    object2 = ScriptRuntime.typeof(this.target);
                    if ("function".equals(object2)) {
                        if (object3 == null) {
                            this.target.setPrototype(Undefined.SCRIPTABLE_UNDEFINED);
                            return object3;
                        }
                        object = ScriptRuntime.typeof(object3);
                        if ("object".equals(object) || "function".equals(object)) {
                            this.target.setPrototype(scriptable);
                        }
                        return object3;
                    }
                    object = ScriptRuntime.typeof(object3);
                    if ("symbol".equals(object2)) {
                        return object3;
                    }
                    if (object3 != null && !"object".equals(object) || !"object".equals(object2)) {
                        return Undefined.instance;
                    }
                }
                this.target.setPrototype(scriptable);
            } else {
                this.target.setParentScope(scriptable);
            }
            return scriptable;
        }
        return ScriptRuntime.setObjectProp(this.target, this.name, object3, (Context)object);
    }
}

