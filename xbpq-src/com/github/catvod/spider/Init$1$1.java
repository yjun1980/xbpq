/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.ValueCallback
 */
package com.github.catvod.spider;

import android.webkit.ValueCallback;
import java.io.PrintStream;

class Init$1$1
implements ValueCallback<String> {
    Init$1$1() {
    }

    public void onReceiveValue(String string) {
        if (string != null && !string.isEmpty()) {
            PrintStream printStream = System.out;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("result");
            stringBuilder.append(string);
            printStream.println(stringBuilder.toString());
        }
    }
}

