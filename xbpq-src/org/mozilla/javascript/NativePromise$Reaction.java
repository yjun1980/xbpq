/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativePromise;
import org.mozilla.javascript.NativePromise$1;
import org.mozilla.javascript.NativePromise$Capability;
import org.mozilla.javascript.NativePromise$ReactionType;
import org.mozilla.javascript.RhinoException;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Undefined;

class NativePromise$Reaction {
    NativePromise$Capability capability;
    Callable handler;
    NativePromise$ReactionType reaction;

    NativePromise$Reaction(NativePromise$Capability nativePromise$Capability, NativePromise$ReactionType nativePromise$ReactionType, Callable callable) {
        NativePromise$ReactionType nativePromise$ReactionType2 = NativePromise$ReactionType.REJECT;
        this.capability = nativePromise$Capability;
        this.reaction = nativePromise$ReactionType;
        this.handler = callable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void invoke(Context context, Scriptable scriptable, Object object) {
        try {
            Object object2 = this.handler;
            if (object2 == null) {
                int n2 = NativePromise$1.$SwitchMap$org$mozilla$javascript$NativePromise$ReactionType[this.reaction.ordinal()];
                object2 = object;
                if (n2 != 1) {
                    if (n2 == 2) {
                        this.capability.reject.call(context, scriptable, Undefined.SCRIPTABLE_UNDEFINED, new Object[]{object});
                        return;
                    }
                    object2 = null;
                }
            } else {
                object2 = object2.call(context, scriptable, Undefined.SCRIPTABLE_UNDEFINED, new Object[]{object});
            }
            this.capability.resolve.call(context, scriptable, Undefined.SCRIPTABLE_UNDEFINED, new Object[]{object2});
            return;
        }
        catch (RhinoException rhinoException) {
            this.capability.reject.call(context, scriptable, Undefined.SCRIPTABLE_UNDEFINED, new Object[]{NativePromise.access$300(context, scriptable, rhinoException)});
        }
    }
}

