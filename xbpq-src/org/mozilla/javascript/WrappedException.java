/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.EvaluatorException;

public class WrappedException
extends EvaluatorException {
    private static final long serialVersionUID = -1551979216966520648L;
    private Throwable exception;

    public WrappedException(Throwable object) {
        CharSequence charSequence = new StringBuilder();
        charSequence.append("Wrapped ");
        charSequence.append(object);
        super(charSequence.toString());
        this.exception = object;
        this.initCause((Throwable)object);
        object = new int[1];
        object[0] = false;
        charSequence = Context.getSourcePositionFromStack((int[])object);
        Object object2 = object[0];
        if (charSequence != null) {
            this.initSourceName((String)charSequence);
        }
        if (object2 != false) {
            this.initLineNumber((int)object2);
        }
    }

    public Throwable getWrappedException() {
        return this.exception;
    }

    @Deprecated
    public Object unwrap() {
        return this.getWrappedException();
    }
}

