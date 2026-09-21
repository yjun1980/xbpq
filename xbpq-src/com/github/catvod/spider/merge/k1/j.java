/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.k1;

import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public final class j
implements Serializable {
    private List<URL> a = new ArrayList<URL>();
    private List<String> b = new ArrayList<String>();

    public final void a(URL uRL) {
        ((ArrayList)this.a).add(uRL);
    }

    public final void b(String string) {
        ((ArrayList)this.b).add(string);
    }
}

