/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.Iterator;
import java.util.Map;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ES6Iterator;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.WrapFactory;

final class NativeJavaMap$NativeJavaMapIterator
extends ES6Iterator {
    private static final String ITERATOR_TAG = "JavaMapIterator";
    private static final long serialVersionUID = 1L;
    private Iterator<Map.Entry<Object, Object>> iterator;

    private NativeJavaMap$NativeJavaMapIterator() {
    }

    NativeJavaMap$NativeJavaMapIterator(Scriptable scriptable, Map<Object, Object> map) {
        super(scriptable, ITERATOR_TAG);
        this.iterator = map.entrySet().iterator();
    }

    static void init(ScriptableObject scriptableObject, boolean bl) {
        ES6Iterator.init(scriptableObject, bl, new NativeJavaMap$NativeJavaMapIterator(), ITERATOR_TAG);
    }

    @Override
    public String getClassName() {
        return "Java Map Iterator";
    }

    @Override
    protected String getTag() {
        return ITERATOR_TAG;
    }

    @Override
    protected boolean isDone(Context context, Scriptable scriptable) {
        return this.iterator.hasNext() ^ true;
    }

    @Override
    protected Object nextValue(Context context, Scriptable scriptable) {
        if (!this.iterator.hasNext()) {
            Object object = Undefined.instance;
            return context.newArray(scriptable, new Object[]{object, object});
        }
        Class<Object> clazz = this.iterator.next();
        Object object = clazz.getKey();
        Object object2 = clazz.getValue();
        WrapFactory wrapFactory = context.getWrapFactory();
        Object var4_8 = null;
        clazz = object == null ? null : object.getClass();
        object = wrapFactory.wrap(context, this, object, clazz);
        clazz = object2 == null ? var4_8 : object2.getClass();
        return context.newArray(scriptable, new Object[]{object, wrapFactory.wrap(context, this, object2, clazz)});
    }
}

