/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.V;

import com.github.catvod.spider.merge.U.g;
import com.github.catvod.spider.merge.V.i;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.d;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class c
extends i {
    c() {
        this.H();
        this.J();
        this.y(cYh.d("1C"));
        this.x(cYh.d("1A"));
        this.w();
        this.v();
        this.A(cYh.d("4B"));
        this.z();
        this.C();
        this.G();
        this.F();
        this.E();
        this.D();
    }

    @Override
    public final void a(StringBuffer stringBuffer, Object object) {
        super.a(stringBuffer, object);
    }

    @Override
    protected final void c(StringBuffer stringBuffer, char c2) {
        stringBuffer.append('\"');
        stringBuffer.append(g.a(String.valueOf(c2)));
        stringBuffer.append('\"');
    }

    @Override
    protected final void e(StringBuffer stringBuffer, String string, Object object) {
        if (object == null) {
            this.l(stringBuffer);
            return;
        }
        if (!(object instanceof String) && !(object instanceof Character)) {
            if (!(object instanceof Number) && !(object instanceof Boolean)) {
                String string2 = object.toString();
                boolean bl = string2.startsWith(this.r());
                boolean bl2 = false;
                boolean bl3 = bl && string2.endsWith(this.q());
                if (!bl3) {
                    bl3 = bl2;
                    if (string2.startsWith(this.p())) {
                        bl3 = bl2;
                        if (string2.endsWith(this.o())) {
                            bl3 = true;
                        }
                    }
                    if (!bl3) {
                        this.e(stringBuffer, string, string2);
                        return;
                    }
                }
                stringBuffer.append(object);
                return;
            }
            stringBuffer.append(object);
            return;
        }
        string = object.toString();
        stringBuffer.append('\"');
        stringBuffer.append(g.a(string));
        stringBuffer.append('\"');
    }

    @Override
    protected final void f(StringBuffer stringBuffer, String string, Collection<?> object) {
        if (object != null && !object.isEmpty()) {
            stringBuffer.append(this.p());
            int n2 = 0;
            object = object.iterator();
            while (object.hasNext()) {
                this.d(stringBuffer, string, n2, object.next());
                ++n2;
            }
            stringBuffer.append(this.o());
            return;
        }
        stringBuffer.append(object);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    @Override
    protected final void g(StringBuffer stringBuffer, Map object) {
        if (object != null && !object.isEmpty()) {
            stringBuffer.append(this.r());
            Iterator iterator = object.entrySet().iterator();
            boolean bl = true;
            while (iterator.hasNext()) {
                Map.Entry entry = iterator.next();
                Object k2 = entry.getKey();
                object = null;
                if (k2 != null) {
                    object = k2.toString();
                }
                if (object == null) continue;
                if (bl) {
                    bl = false;
                } else {
                    this.i(stringBuffer);
                }
                this.j(stringBuffer, (String)object);
                entry = entry.getValue();
                if (entry == null) {
                    this.l(stringBuffer);
                    continue;
                }
                this.k(stringBuffer, (String)object, entry, true);
            }
            stringBuffer.append(this.q());
            return;
        }
        stringBuffer.append(object);
    }

    @Override
    protected final void j(StringBuffer stringBuffer, String string) {
        String string2 = cYh.d("45");
        StringBuilder stringBuilder = d.b(string2);
        stringBuilder.append(g.a(string));
        stringBuilder.append(string2);
        super.j(stringBuffer, stringBuilder.toString());
    }
}

