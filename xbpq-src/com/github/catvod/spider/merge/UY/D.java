/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.UY;

import com.github.catvod.spider.merge.HR.o;
import com.github.catvod.spider.merge.MP.j;
import com.github.catvod.spider.merge.UY.B;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.C0.a;
import com.github.catvod.spider.merge.xc.F0.g;
import com.github.catvod.spider.merge.xc.F0.q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;

public final class D
implements o {
    public final Object a;
    public Object b;

    public D() {
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    public D(String string, List list) {
        this.a = string;
        this.b = list;
    }

    public D(StringBuilder stringBuilder, g g2) {
        this.a = stringBuilder;
        this.b = g2;
        g2.b();
    }

    public D(Matcher matcher, CharSequence charSequence) {
        i.e(charSequence, "input");
        this.a = matcher;
    }

    public void a(String object, ArrayList serializable) {
        ((ArrayList)this.a).add(object);
        object = (ArrayList)this.b;
        Object object2 = new ArrayList();
        Iterator iterator = ((ArrayList)serializable).iterator();
        while (iterator.hasNext()) {
            j j2 = (j)iterator.next();
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append(j2.a.replace("m3u8", ""));
            ((StringBuilder)serializable).append('$');
            ((StringBuilder)serializable).append(j2.b);
            ((ArrayList)object2).add(((StringBuilder)serializable).toString());
        }
        serializable = new StringBuilder();
        if ((object2 = ((ArrayList)object2).iterator()).hasNext()) {
            while (true) {
                ((StringBuilder)serializable).append((CharSequence)object2.next());
                if (!object2.hasNext()) break;
                ((StringBuilder)serializable).append((CharSequence)"#");
            }
        }
        ((ArrayList)object).add(((StringBuilder)serializable).toString());
    }

    @Override
    public void b(q q2, int n2) {
        if (!q2.o().equals("#text")) {
            try {
                q2.r((Appendable)this.a, n2, (g)this.b);
            }
            catch (IOException iOException) {
                throw new a(iOException);
            }
        }
    }

    @Override
    public void c(q q2, int n2) {
        try {
            q2.q((Appendable)this.a, n2, (g)this.b);
            return;
        }
        catch (IOException iOException) {
            throw new a(iOException);
        }
    }

    public B d() {
        B b2 = new B();
        Iterator iterator = (ArrayList)this.a;
        StringBuilder stringBuilder = new StringBuilder();
        if ((iterator = ((ArrayList)((Object)iterator)).iterator()).hasNext()) {
            while (true) {
                stringBuilder.append((CharSequence)iterator.next());
                if (!iterator.hasNext()) break;
                stringBuilder.append((CharSequence)"$$$");
            }
        }
        b2.b = stringBuilder.toString();
        iterator = (ArrayList)this.b;
        stringBuilder = new StringBuilder();
        if ((iterator = ((ArrayList)((Object)iterator)).iterator()).hasNext()) {
            while (true) {
                stringBuilder.append((CharSequence)iterator.next());
                if (!iterator.hasNext()) break;
                stringBuilder.append((CharSequence)"$$$");
            }
        }
        b2.c = stringBuilder.toString();
        return b2;
    }
}

