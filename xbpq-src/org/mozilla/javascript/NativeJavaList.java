/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.ArrayList;
import java.util.List;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeJavaObject;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Symbol;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.WrapFactory;

public class NativeJavaList
extends NativeJavaObject {
    static final boolean $assertionsDisabled = false;
    private static final long serialVersionUID = 660285467829047519L;
    private List<Object> list;

    public NativeJavaList(Scriptable scriptable, Object object) {
        super(scriptable, object, object.getClass());
        this.list = (List)object;
    }

    private void ensureCapacity(int n2) {
        if (n2 > this.list.size()) {
            List<Object> list = this.list;
            if (list instanceof ArrayList) {
                ((ArrayList)list).ensureCapacity(n2);
            }
            while (n2 > this.list.size()) {
                this.list.add(null);
            }
        }
    }

    private boolean isWithValidIndex(int n2) {
        boolean bl = n2 >= 0 && n2 < this.list.size();
        return bl;
    }

    private void setLength(Object list) {
        double d2 = ScriptRuntime.toNumber(list);
        long l2 = ScriptRuntime.toUint32(d2);
        if ((double)l2 == d2 && l2 <= Integer.MAX_VALUE) {
            if (l2 < (long)this.list.size()) {
                list = this.list;
                list.subList((int)l2, list.size()).clear();
            } else {
                this.ensureCapacity((int)l2);
            }
            return;
        }
        throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.arraylength.bad", new Object[0]));
    }

    @Override
    public void delete(int n2) {
        if (this.isWithValidIndex(n2)) {
            this.list.set(n2, null);
        }
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @Override
    public Object get(int n2, Scriptable object) {
        if (this.isWithValidIndex(n2)) {
            Object object2;
            Context context = Context.getCurrentContext();
            object = object2 = this.list.get(n2);
            if (context != null) {
                WrapFactory wrapFactory = context.getWrapFactory();
                object = object2 == null ? null : object2.getClass();
                object = wrapFactory.wrap(context, this, object2, (Class<?>)object);
            }
            return object;
        }
        return Undefined.instance;
    }

    @Override
    public Object get(String string, Scriptable scriptable) {
        if ("length".equals(string)) {
            return this.list.size();
        }
        return super.get(string, scriptable);
    }

    @Override
    public Object get(Symbol symbol, Scriptable scriptable) {
        if (SymbolKey.IS_CONCAT_SPREADABLE.equals(symbol)) {
            return Boolean.TRUE;
        }
        return super.get(symbol, scriptable);
    }

    @Override
    public String getClassName() {
        return "JavaList";
    }

    @Override
    public Object[] getIds() {
        List list = (List)this.javaObject;
        Object[] objectArray = new Object[list.size()];
        int n2 = list.size();
        while (--n2 >= 0) {
            objectArray[n2] = n2;
        }
        return objectArray;
    }

    @Override
    public boolean has(int n2, Scriptable scriptable) {
        if (this.isWithValidIndex(n2)) {
            return true;
        }
        return super.has(n2, scriptable);
    }

    @Override
    public boolean has(String string, Scriptable scriptable) {
        if (string.equals("length")) {
            return true;
        }
        return super.has(string, scriptable);
    }

    @Override
    public boolean has(Symbol symbol, Scriptable scriptable) {
        if (SymbolKey.IS_CONCAT_SPREADABLE.equals(symbol)) {
            return true;
        }
        return super.has(symbol, scriptable);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void put(int n2, Scriptable object, Object object2) {
        if (n2 >= 0) {
            object = Context.jsToJava(object2, Object.class);
            if (n2 == this.list.size()) {
                this.list.add(object);
            } else {
                this.ensureCapacity(n2 + 1);
                this.list.set(n2, object);
            }
            return;
        }
        super.put(n2, (Scriptable)object, object2);
    }

    @Override
    public void put(String string, Scriptable scriptable, Object object) {
        if (this.list != null && "length".equals(string)) {
            this.setLength(object);
            return;
        }
        super.put(string, scriptable, object);
    }
}

