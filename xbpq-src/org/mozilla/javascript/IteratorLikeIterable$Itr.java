/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.mozilla.javascript.IteratorLikeIterable;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Undefined;

public final class IteratorLikeIterable$Itr
implements Iterator<Object> {
    private boolean isDone;
    private Object nextVal;
    final IteratorLikeIterable this$0;

    public IteratorLikeIterable$Itr(IteratorLikeIterable iteratorLikeIterable) {
        this.this$0 = iteratorLikeIterable;
    }

    @Override
    public boolean hasNext() {
        Object object;
        if (this.isDone) {
            return false;
        }
        Object object2 = IteratorLikeIterable.access$300(this.this$0).call(IteratorLikeIterable.access$000(this.this$0), IteratorLikeIterable.access$100(this.this$0), IteratorLikeIterable.access$200(this.this$0), ScriptRuntime.emptyArgs);
        Object object3 = object = ScriptableObject.getProperty(ScriptableObject.ensureScriptable(object2), "done");
        if (object == Scriptable.NOT_FOUND) {
            object3 = Undefined.instance;
        }
        if (ScriptRuntime.toBoolean(object3)) {
            this.isDone = true;
            return false;
        }
        this.nextVal = ScriptRuntime.getObjectPropNoWarn(object2, "value", IteratorLikeIterable.access$000(this.this$0), IteratorLikeIterable.access$100(this.this$0));
        return true;
    }

    public boolean isDone() {
        return this.isDone;
    }

    @Override
    public Object next() {
        if (!this.isDone) {
            return this.nextVal;
        }
        throw new NoSuchElementException();
    }

    public void setDone(boolean bl) {
        this.isDone = bl;
    }
}

