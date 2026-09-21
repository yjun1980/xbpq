/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.ValueCallback
 *  android.webkit.WebView
 */
package com.github.catvod.spider.merge.i0;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.github.catvod.spider.merge.R0.d;
import com.github.catvod.spider.merge.T0.a;
import com.github.catvod.spider.merge.i0.k;
import com.github.catvod.spider.merge.i0.m;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Objects;

final class j
implements ValueCallback<String> {
    final String a;
    final WebView b;
    final k c;

    j(k k2, String string, WebView webView) {
        this.c = k2;
        this.a = string;
        this.b = webView;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onReceiveValue(Object object) {
        object = (String)object;
        Object object2 = d.a;
        Objects.requireNonNull(object2);
        if (object == null) {
            object = null;
        } else {
            StringWriter stringWriter;
            try {
                stringWriter = new StringWriter(((String)object).length() * 2);
                int n2 = ((String)object).length();
                int n3 = 0;
                block3: while (n3 < n2) {
                    int n4;
                    int n5 = ((a)object2).a((CharSequence)object, n3, stringWriter);
                    if (n5 == 0) {
                        char c2 = ((String)object).charAt(n3);
                        ((Writer)stringWriter).write(c2);
                        n3 = n4 = n3 + 1;
                        if (!Character.isHighSurrogate(c2)) continue;
                        n3 = n4;
                        if (n4 >= n2) continue;
                        c2 = ((String)object).charAt(n4);
                        n3 = n4;
                        if (!Character.isLowSurrogate(c2)) continue;
                        ((Writer)stringWriter).write(c2);
                        n3 = n4 + 1;
                        continue;
                    }
                    int n6 = 0;
                    n4 = n3;
                    while (true) {
                        n3 = n4;
                        if (n6 >= n5) continue block3;
                        n4 += Character.charCount(Character.codePointAt((CharSequence)object, n4));
                        ++n6;
                    }
                }
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
            {
                object = stringWriter.toString();
            }
        }
        object2 = m.a(this.a);
        this.c.a.put("html", object);
        this.c.a.put("cookies", object2);
        object = this.c.b;
        if (object == null || object.isDone()) {
            this.c.a.put("_done", "1");
            this.b.destroy();
        }
    }
}

