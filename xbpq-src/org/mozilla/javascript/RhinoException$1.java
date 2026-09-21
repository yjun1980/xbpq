/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.StackStyle;

class RhinoException$1 {
    static final int[] $SwitchMap$org$mozilla$javascript$StackStyle;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int[] nArray = new int[StackStyle.values().length];
        $SwitchMap$org$mozilla$javascript$StackStyle = nArray;
        try {
            nArray[StackStyle.MOZILLA.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            RhinoException$1.$SwitchMap$org$mozilla$javascript$StackStyle[StackStyle.MOZILLA_LF.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            RhinoException$1.$SwitchMap$org$mozilla$javascript$StackStyle[StackStyle.V8.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            RhinoException$1.$SwitchMap$org$mozilla$javascript$StackStyle[StackStyle.RHINO.ordinal()] = 4;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

