/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.ClassShutter;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Context$ClassShutterSetter;

class Context$1
implements Context$ClassShutterSetter {
    final Context this$0;

    Context$1(Context context) {
        this.this$0 = context;
    }

    @Override
    public ClassShutter getClassShutter() {
        return Context.access$000(this.this$0);
    }

    @Override
    public void setClassShutter(ClassShutter classShutter) {
        Context.access$002(this.this$0, classShutter);
    }
}

