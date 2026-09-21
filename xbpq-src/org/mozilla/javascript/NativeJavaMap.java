/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.ArrayList;
import java.util.Map;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeJavaMap$NativeJavaMapIterator;
import org.mozilla.javascript.NativeJavaObject;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Symbol;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.WrapFactory;
import org.mozilla.javascript.m;

public class NativeJavaMap
extends NativeJavaObject {
    static final boolean $assertionsDisabled = false;
    private static final long serialVersionUID = -3786257752907047381L;
    private static Callable symbol_iterator = m.b;
    private Map<Object, Object> map;

    public NativeJavaMap(Scriptable scriptable, Object object) {
        super(scriptable, object, object.getClass());
        this.map = (Map)object;
    }

    public static /* synthetic */ Object b(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeJavaMap.lambda$static$0(context, scriptable, scriptable2, objectArray);
    }

    static void init(ScriptableObject scriptableObject, boolean bl) {
        NativeJavaMap$NativeJavaMapIterator.init(scriptableObject, bl);
    }

    private static /* synthetic */ Object lambda$static$0(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        if (scriptable2 instanceof NativeJavaMap) {
            return new NativeJavaMap$NativeJavaMapIterator(scriptable, ((NativeJavaMap)scriptable2).map);
        }
        throw ScriptRuntime.typeErrorById("msg.incompat.call", SymbolKey.ITERATOR);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @Override
    public Object get(int n2, Scriptable object) {
        Context context = Context.getCurrentContext();
        if (context != null && context.hasFeature(21) && this.map.containsKey(n2)) {
            Object object2 = this.map.get(n2);
            WrapFactory wrapFactory = context.getWrapFactory();
            object = object2 == null ? null : object2.getClass();
            return wrapFactory.wrap(context, this, object2, (Class<?>)object);
        }
        return super.get(n2, (Scriptable)object);
    }

    @Override
    public Object get(String object, Scriptable object2) {
        Context context = Context.getCurrentContext();
        if (context != null && context.hasFeature(21) && this.map.containsKey(object)) {
            Object object3 = this.map.get(object);
            object2 = context.getWrapFactory();
            object = object3 == null ? null : object3.getClass();
            return ((WrapFactory)object2).wrap(context, this, object3, (Class<?>)object);
        }
        return super.get((String)object, (Scriptable)object2);
    }

    @Override
    public Object get(Symbol symbol, Scriptable scriptable) {
        if (SymbolKey.ITERATOR.equals(symbol)) {
            return symbol_iterator;
        }
        return super.get(symbol, scriptable);
    }

    @Override
    public String getClassName() {
        return "JavaMap";
    }

    @Override
    public Object[] getIds() {
        Object object2 = Context.getCurrentContext();
        if (object2 != null && ((Context)object2).hasFeature(21)) {
            ArrayList<Object> arrayList = new ArrayList<Object>(this.map.size());
            for (Object object2 : this.map.keySet()) {
                if (!(object2 instanceof Integer)) {
                    object2 = ScriptRuntime.toString(object2);
                }
                arrayList.add(object2);
            }
            return arrayList.toArray();
        }
        return super.getIds();
    }

    @Override
    public boolean has(int n2, Scriptable scriptable) {
        Context context = Context.getCurrentContext();
        if (context != null && context.hasFeature(21) && this.map.containsKey(n2)) {
            return true;
        }
        return super.has(n2, scriptable);
    }

    @Override
    public boolean has(String string, Scriptable scriptable) {
        Context context = Context.getCurrentContext();
        if (context != null && context.hasFeature(21) && this.map.containsKey(string)) {
            return true;
        }
        return super.has(string, scriptable);
    }

    @Override
    public boolean has(Symbol symbol, Scriptable scriptable) {
        return SymbolKey.ITERATOR.equals(symbol);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void put(int n2, Scriptable scriptable, Object object) {
        Context context = Context.getContext();
        if (context != null && context.hasFeature(21)) {
            this.map.put(n2, Context.jsToJava(object, Object.class));
        } else {
            super.put(n2, scriptable, object);
        }
    }

    @Override
    public void put(String string, Scriptable scriptable, Object object) {
        Context context = Context.getCurrentContext();
        if (context != null && context.hasFeature(21)) {
            this.map.put(string, Context.jsToJava(object, Object.class));
        } else {
            super.put(string, scriptable, object);
        }
    }
}

