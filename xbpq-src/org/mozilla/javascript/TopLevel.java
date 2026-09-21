/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.EnumMap;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.TopLevel$Builtins;
import org.mozilla.javascript.TopLevel$NativeErrors;

public class TopLevel
extends IdScriptableObject {
    static final boolean $assertionsDisabled = false;
    private static final long serialVersionUID = -4648046356662472260L;
    private EnumMap<TopLevel$Builtins, BaseFunction> ctors;
    private EnumMap<TopLevel$NativeErrors, BaseFunction> errors;

    public static Function getBuiltinCtor(Context context, Scriptable scriptable, TopLevel$Builtins object) {
        BaseFunction baseFunction;
        if (scriptable instanceof TopLevel && (baseFunction = ((TopLevel)scriptable).getBuiltinCtor((TopLevel$Builtins)((Object)object))) != null) {
            return baseFunction;
        }
        object = object == TopLevel$Builtins.GeneratorFunction ? "__GeneratorFunction" : object.name();
        return ScriptRuntime.getExistingCtor(context, scriptable, (String)object);
    }

    public static Scriptable getBuiltinPrototype(Scriptable scriptable, TopLevel$Builtins object) {
        Scriptable scriptable2;
        if (scriptable instanceof TopLevel && (scriptable2 = ((TopLevel)scriptable).getBuiltinPrototype((TopLevel$Builtins)((Object)object))) != null) {
            return scriptable2;
        }
        object = object == TopLevel$Builtins.GeneratorFunction ? "__GeneratorFunction" : object.name();
        return ScriptableObject.getClassPrototype(scriptable, (String)object);
    }

    static Function getNativeErrorCtor(Context context, Scriptable scriptable, TopLevel$NativeErrors topLevel$NativeErrors) {
        BaseFunction baseFunction;
        if (scriptable instanceof TopLevel && (baseFunction = ((TopLevel)scriptable).getNativeErrorCtor(topLevel$NativeErrors)) != null) {
            return baseFunction;
        }
        return ScriptRuntime.getExistingCtor(context, scriptable, topLevel$NativeErrors.name());
    }

    public void cacheBuiltins(Scriptable object, boolean bl) {
        TopLevel$NativeErrors[] topLevel$NativeErrorsArray;
        int n2;
        this.ctors = new EnumMap(TopLevel$Builtins.class);
        Object object2 = TopLevel$Builtins.values();
        int n3 = ((TopLevel$Builtins[])object2).length;
        int n4 = 0;
        for (n2 = 0; n2 < n3; ++n2) {
            topLevel$NativeErrorsArray = object2[n2];
            Object object3 = ScriptableObject.getProperty((Scriptable)this, topLevel$NativeErrorsArray.name());
            if (object3 instanceof BaseFunction) {
                this.ctors.put((TopLevel$Builtins)topLevel$NativeErrorsArray, (BaseFunction)object3);
                continue;
            }
            if (topLevel$NativeErrorsArray != TopLevel$Builtins.GeneratorFunction) continue;
            this.ctors.put((TopLevel$Builtins)topLevel$NativeErrorsArray, (BaseFunction)BaseFunction.initAsGeneratorFunction((Scriptable)object, bl));
        }
        this.errors = new EnumMap(TopLevel$NativeErrors.class);
        topLevel$NativeErrorsArray = TopLevel$NativeErrors.values();
        n3 = topLevel$NativeErrorsArray.length;
        for (n2 = n4; n2 < n3; ++n2) {
            object2 = topLevel$NativeErrorsArray[n2];
            object = ScriptableObject.getProperty((Scriptable)this, object2.name());
            if (!(object instanceof BaseFunction)) continue;
            this.errors.put((TopLevel$NativeErrors)((Object)object2), (BaseFunction)object);
        }
    }

    void clearCache() {
        this.ctors = null;
        this.errors = null;
    }

    public BaseFunction getBuiltinCtor(TopLevel$Builtins object) {
        EnumMap<TopLevel$Builtins, BaseFunction> enumMap = this.ctors;
        object = enumMap != null ? enumMap.get(object) : null;
        return object;
    }

    public Scriptable getBuiltinPrototype(TopLevel$Builtins object) {
        object = this.getBuiltinCtor((TopLevel$Builtins)((Object)object));
        Scriptable scriptable = null;
        if ((object = object != null ? ((BaseFunction)object).getPrototypeProperty() : null) instanceof Scriptable) {
            scriptable = (Scriptable)object;
        }
        return scriptable;
    }

    @Override
    public String getClassName() {
        return "global";
    }

    BaseFunction getNativeErrorCtor(TopLevel$NativeErrors object) {
        EnumMap<TopLevel$NativeErrors, BaseFunction> enumMap = this.errors;
        object = enumMap != null ? enumMap.get(object) : null;
        return object;
    }
}

