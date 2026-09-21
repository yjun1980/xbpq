/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.regexp;

import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.regexp.NativeRegExp;
import org.mozilla.javascript.regexp.NativeRegExpCallable;
import org.mozilla.javascript.regexp.RECompiled;

public class NativeRegExpInstantiator {
    private NativeRegExpInstantiator() {
    }

    static NativeRegExp withLanguageVersion(int n2) {
        if (n2 < 200) {
            return new NativeRegExpCallable();
        }
        return new NativeRegExp();
    }

    static NativeRegExp withLanguageVersionScopeCompiled(int n2, Scriptable scriptable, RECompiled rECompiled) {
        if (n2 < 200) {
            return new NativeRegExpCallable(scriptable, rECompiled);
        }
        return new NativeRegExp(scriptable, rECompiled);
    }
}

