/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.R;

import com.github.catvod.spider.merge.P.H;
import com.github.catvod.spider.merge.P.I;
import com.github.catvod.spider.merge.R.a;
import com.github.catvod.spider.merge.R.b;
import com.github.catvod.spider.merge.R.e;
import com.github.catvod.spider.merge.cYh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public final class c {
    private final b a;
    private final H b;

    public c(b b2, H h2) {
        this.a = b2;
        this.b = h2;
    }

    protected final String a(e object) {
        int n2 = ((e)object).a;
        CharSequence charSequence = new StringBuilder();
        boolean bl = ((e)object).d;
        String string = "";
        Object object2 = bl ? cYh.d("5D") : "";
        charSequence.append((String)object2);
        charSequence.append(cYh.d("14"));
        charSequence.append(n2);
        object2 = string;
        if (((e)object).g) {
            object2 = cYh.d("39");
        }
        charSequence.append((String)object2);
        charSequence = charSequence.toString();
        if (((e)object).d) {
            object2 = ((e)object).h;
            string = cYh.d("5A6E");
            if (object2 != null) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)charSequence);
                ((StringBuilder)object2).append(string);
                ((StringBuilder)object2).append(Arrays.toString(((e)object).h));
                object = object2;
            } else {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)charSequence);
                ((StringBuilder)object2).append(string);
                ((StringBuilder)object2).append(((e)object).e);
                object = object2;
            }
            return ((StringBuilder)object).toString();
        }
        return charSequence;
    }

    public final String toString() {
        if (this.a.b == null) {
            return null;
        }
        CharSequence charSequence = new StringBuilder();
        Iterator iterator = this.a;
        iterator.getClass();
        iterator = new ArrayList(((HashMap)((b)((Object)iterator)).a).keySet());
        Collections.sort(iterator, new a());
        iterator = ((ArrayList)((Object)iterator)).iterator();
        while (iterator.hasNext()) {
            e e2 = (e)iterator.next();
            Object object = e2.c;
            int n2 = object != null ? ((e[])object).length : 0;
            for (int i2 = 0; i2 < n2; ++i2) {
                e e3 = e2.c[i2];
                if (e3 == null || e3.a == Integer.MAX_VALUE) continue;
                ((StringBuilder)charSequence).append(this.a(e2));
                object = ((I)this.b).a(i2 - 1);
                ((StringBuilder)charSequence).append(cYh.d("4A"));
                ((StringBuilder)charSequence).append((String)object);
                ((StringBuilder)charSequence).append(cYh.d("4A6E"));
                ((StringBuilder)charSequence).append(this.a(e3));
                ((StringBuilder)charSequence).append('\n');
            }
        }
        if (((String)(charSequence = ((StringBuilder)charSequence).toString())).length() == 0) {
            return null;
        }
        return charSequence;
    }
}

