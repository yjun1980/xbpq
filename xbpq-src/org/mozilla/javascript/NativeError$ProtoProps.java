/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.io.Serializable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.NativeError$1;
import org.mozilla.javascript.Undefined;

final class NativeError$ProtoProps
implements Serializable {
    static final String KEY = "_ErrorPrototypeProps";
    private static final long serialVersionUID = 1907180507775337939L;
    Function prepareStackTrace;
    int stackTraceLimit = -1;

    private NativeError$ProtoProps() {
    }

    /* synthetic */ NativeError$ProtoProps(NativeError$1 nativeError$1) {
        this();
    }

    public Object getPrepareStackTrace() {
        Function function = this.prepareStackTrace;
        Object object = function;
        if (function == null) {
            object = Undefined.instance;
        }
        return object;
    }

    public Object getStackTraceLimit() {
        int n2 = this.stackTraceLimit;
        if (n2 >= 0) {
            return n2;
        }
        return Double.POSITIVE_INFINITY;
    }

    public void setPrepareStackTrace(Object object) {
        block1: {
            block2: {
                block0: {
                    if (object == null || Undefined.isUndefined(object)) break block0;
                    if (!(object instanceof Function)) break block1;
                    object = (Function)object;
                    break block2;
                }
                object = null;
            }
            this.prepareStackTrace = object;
        }
    }

    public void setStackTraceLimit(Object object) {
        double d2 = Context.toNumber(object);
        int n2 = !Double.isNaN(d2) && !Double.isInfinite(d2) ? (int)d2 : -1;
        this.stackTraceLimit = n2;
    }
}

