/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.io.Closeable;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IteratorLikeIterable$Itr;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Undefined;

public class IteratorLikeIterable
implements Iterable<Object>,
Closeable {
    private boolean closed;
    private final Context cx;
    private final Scriptable iterator;
    private final Callable next;
    private final Callable returnFunc;
    private final Scriptable scope;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public IteratorLikeIterable(Context object, Scriptable scriptable, Object object2) {
        this.cx = object;
        this.scope = scriptable;
        this.next = ScriptRuntime.getPropFunctionAndThis(object2, "next", (Context)object, scriptable);
        this.iterator = ScriptRuntime.lastStoredScriptable((Context)object);
        object = ScriptRuntime.getObjectPropNoWarn(object2, "return", (Context)object, scriptable);
        if (object != null && !Undefined.isUndefined(object)) {
            if (!(object instanceof Callable)) throw ScriptRuntime.notFunctionError(object2, object, "return");
            object = (Callable)object;
        } else {
            object = null;
        }
        this.returnFunc = object;
    }

    static /* synthetic */ Context access$000(IteratorLikeIterable iteratorLikeIterable) {
        return iteratorLikeIterable.cx;
    }

    static /* synthetic */ Scriptable access$100(IteratorLikeIterable iteratorLikeIterable) {
        return iteratorLikeIterable.scope;
    }

    static /* synthetic */ Scriptable access$200(IteratorLikeIterable iteratorLikeIterable) {
        return iteratorLikeIterable.iterator;
    }

    static /* synthetic */ Callable access$300(IteratorLikeIterable iteratorLikeIterable) {
        return iteratorLikeIterable.next;
    }

    @Override
    public void close() {
        if (!this.closed) {
            this.closed = true;
            Callable callable = this.returnFunc;
            if (callable != null) {
                callable.call(this.cx, this.scope, this.iterator, ScriptRuntime.emptyArgs);
            }
        }
    }

    public IteratorLikeIterable$Itr iterator() {
        return new IteratorLikeIterable$Itr(this);
    }
}

