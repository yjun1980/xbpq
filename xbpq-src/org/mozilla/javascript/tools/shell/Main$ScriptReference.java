/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.shell;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import org.mozilla.javascript.Script;

class Main$ScriptReference
extends SoftReference<Script> {
    byte[] digest;
    String path;

    Main$ScriptReference(String string, byte[] byArray, Script script, ReferenceQueue<Script> referenceQueue) {
        super(script, referenceQueue);
        this.path = string;
        this.digest = byArray;
    }
}

