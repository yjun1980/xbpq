/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.shell;

import org.mozilla.javascript.Function;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.tools.shell.Timers$1;

final class Timers$Timeout
implements Comparable<Timers$Timeout> {
    static final boolean $assertionsDisabled = false;
    long expiration;
    Function func;
    Object[] funcArgs = ScriptRuntime.emptyArgs;
    int id;

    private Timers$Timeout() {
    }

    /* synthetic */ Timers$Timeout(Timers$1 timers$1) {
        this();
    }

    @Override
    public int compareTo(Timers$Timeout timers$Timeout) {
        return Long.compare(this.expiration, timers$Timeout.expiration);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        boolean bl = false;
        try {
            long l2 = this.expiration;
            long l3 = ((Timers$Timeout)object).expiration;
            if (l2 != l3) return bl;
            return true;
        }
        catch (ClassCastException classCastException) {
            return bl;
        }
    }

    public int hashCode() {
        return (int)this.expiration;
    }
}

