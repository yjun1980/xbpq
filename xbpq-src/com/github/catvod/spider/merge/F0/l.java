/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.F0.m;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.BitSet;
import java.util.Collection;
import java.util.Map;

class l<SELF extends l<SELF>> {
    private static final char[] i = new char[]{'n', 'u', 'l', 'l'};
    private static final char[] j = new char[]{'t', 'r', 'u', 'e'};
    private static final char[] k = new char[]{'f', 'a', 'l', 's', 'e'};
    private static final char[] l = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final char[] m = new char[]{'\\', 'u', '0', '0'};
    private static final char[] n = new char[]{'\\', 'u'};
    protected final Appendable a;
    private final StringBuilder b;
    private BitSet c = new BitSet();
    private int d = 0;
    private boolean e = true;
    private boolean f;
    private String g;
    private int h = 0;

    l(Appendable appendable) {
        this.a = appendable;
        this.g = null;
        this.b = new StringBuilder(10240);
    }

    private void a() {
        this.p('\n');
    }

    /*
     * Enabled aggressive block sorting
     */
    private void f(String string) {
        this.p('\"');
        int n2 = 0;
        char c2 = '\u0000';
        while (true) {
            char c3;
            block17: {
                Object object;
                block18: {
                    block12: {
                        block13: {
                            block16: {
                                block14: {
                                    block15: {
                                        if (n2 >= string.length()) {
                                            this.p('\"');
                                            return;
                                        }
                                        c3 = string.charAt(n2);
                                        if (c3 == '\f') break block12;
                                        if (c3 == '\r') break block13;
                                        if (c3 == '\"') break block14;
                                        if (c3 == '/') break block15;
                                        if (c3 == '\\') break block14;
                                        switch (c3) {
                                            default: {
                                                Object object2;
                                                c2 = !(c3 < ' ' || c3 >= '\u0080' && c3 < '\u00a0' || c3 >= '\u2000' && c3 < '\u2100') ? (char)'\u0000' : '\u0001';
                                                if (c2 == '\u0000') break block16;
                                                if (c3 < '\u0100') {
                                                    this.r(m);
                                                    object = l;
                                                    this.p((char)object[c3 >> 4 & 0xF]);
                                                    object2 = object[c3 & 0xF];
                                                } else {
                                                    this.r(n);
                                                    object = l;
                                                    this.p((char)object[c3 >> 12 & 0xF]);
                                                    this.p((char)object[c3 >> 8 & 0xF]);
                                                    this.p((char)object[c3 >> 4 & 0xF]);
                                                    object2 = object[c3 & 0xF];
                                                }
                                                this.p((char)object2);
                                                break block17;
                                            }
                                            case '\n': {
                                                object = "\\n";
                                                break;
                                            }
                                            case '\t': {
                                                object = "\\t";
                                                break;
                                            }
                                            case '\b': {
                                                object = "\\b";
                                                break;
                                            }
                                        }
                                        break block18;
                                    }
                                    if (c2 != '<') break block16;
                                }
                                this.p('\\');
                            }
                            this.p(c3);
                            break block17;
                        }
                        object = "\\r";
                        break block18;
                    }
                    object = "\\f";
                }
                this.q((String)object);
            }
            ++n2;
            c2 = c3;
        }
    }

    private void h() {
        try {
            this.a.append(this.b.toString());
            this.b.setLength(0);
            return;
        }
        catch (IOException iOException) {
            throw new m(iOException);
        }
    }

    private void m() {
        block6: {
            block5: {
                block4: {
                    if (!this.e) break block4;
                    this.e = false;
                    break block5;
                }
                if (this.d == 0) break block6;
                this.p(',');
                if (this.g != null && this.f) {
                    this.a();
                }
            }
            return;
        }
        throw new m("Invalid call to emit a value in a finished JSON writer");
    }

    private void n() {
        if (!this.f) {
            this.m();
            return;
        }
        throw new m("Invalid call to emit a keyless value while writing an object");
    }

    private void o(String string) {
        if (this.f) {
            this.m();
            if (this.g != null) {
                for (int i2 = 0; i2 < this.h; ++i2) {
                    this.q(this.g);
                }
            }
            this.f(string);
            this.p(':');
            return;
        }
        throw new m("Invalid call to emit a key value while not writing an object");
    }

    private void p(char c2) {
        this.b.append(c2);
        if (this.b.length() > 10240) {
            this.h();
        }
    }

    private void q(String string) {
        this.b.append(string);
        if (this.b.length() > 10240) {
            this.h();
        }
    }

    private void r(char[] cArray) {
        this.b.append(cArray);
        if (this.b.length() > 10240) {
            this.h();
        }
    }

    public final SELF b() {
        this.n();
        BitSet bitSet = this.c;
        int n2 = this.d;
        this.d = n2 + 1;
        bitSet.set(n2, this.f);
        this.f = false;
        this.e = true;
        this.p('[');
        return (SELF)this;
    }

    public SELF c(String object) {
        this.o((String)object);
        object = this.c;
        int n2 = this.d;
        this.d = n2 + 1;
        ((BitSet)object).set(n2, this.f);
        this.f = false;
        this.e = true;
        this.p('[');
        return (SELF)this;
    }

    public final SELF d(String object, Collection<?> collection) {
        if (object == null) {
            this.b();
        } else {
            this.c((String)object);
        }
        object = collection.iterator();
        while (object.hasNext()) {
            this.t(object.next());
        }
        this.g();
        return (SELF)this;
    }

    protected final void e() {
        if (this.d <= 0) {
            if (!this.e) {
                this.h();
                return;
            }
            throw new m("Nothing was written to the JSON writer");
        }
        throw new m("Unclosed JSON objects and/or arrays when closing writer");
    }

    public SELF g() {
        if (this.d != 0) {
            char c2;
            int n2;
            if (this.f) {
                if (this.g != null) {
                    --this.h;
                    this.a();
                    for (n2 = 0; n2 < this.h; ++n2) {
                        this.q(this.g);
                    }
                }
                c2 = '}';
            } else {
                c2 = ']';
            }
            this.p(c2);
            this.e = false;
            BitSet bitSet = this.c;
            this.d = n2 = this.d - 1;
            this.f = bitSet.get(n2);
            return (SELF)this;
        }
        throw new m("Invalid call to end()");
    }

    public final SELF i(String string) {
        this.o(string);
        this.r(i);
        return (SELF)this;
    }

    public SELF j() {
        this.n();
        BitSet bitSet = this.c;
        int n2 = this.d;
        this.d = n2 + 1;
        bitSet.set(n2, this.f);
        this.f = true;
        this.e = true;
        this.p('{');
        if (this.g != null) {
            ++this.h;
            this.a();
        }
        return (SELF)this;
    }

    public SELF k(String object) {
        this.o((String)object);
        object = this.c;
        int n2 = this.d;
        this.d = n2 + 1;
        ((BitSet)object).set(n2, this.f);
        this.f = true;
        this.e = true;
        this.p('{');
        if (this.g != null) {
            ++this.h;
            this.a();
        }
        return (SELF)this;
    }

    public final SELF l(String object, Map<?, ?> object2) {
        if (object == null) {
            this.j();
        } else {
            this.k((String)object);
        }
        object = object2.entrySet().iterator();
        while (object.hasNext()) {
            Object object3 = (Map.Entry)object.next();
            object2 = object3.getValue();
            if (!(object3.getKey() instanceof String)) {
                object2 = com.github.catvod.spider.merge.C.a.c("Invalid key type for map: ");
                object = object3.getKey() == null ? "null" : object3.getKey().getClass();
                ((StringBuilder)object2).append(object);
                throw new m(((StringBuilder)object2).toString());
            }
            object3 = (String)object3.getKey();
            if (object2 == null) {
                this.i((String)object3);
                continue;
            }
            if (object2 instanceof String) {
                this.u((String)object3, (String)object2);
                continue;
            }
            if (object2 instanceof Number) {
                object2 = (Number)object2;
                this.o((String)object3);
                this.q(object2.toString());
                continue;
            }
            if (object2 instanceof Boolean) {
                this.v((String)object3, (Boolean)object2);
                continue;
            }
            if (object2 instanceof Collection) {
                this.d((String)object3, (Collection)object2);
                continue;
            }
            if (object2 instanceof Map) {
                this.l((String)object3, (Map)object2);
                continue;
            }
            if (object2.getClass().isArray()) {
                int n2 = Array.getLength(object2);
                this.c((String)object3);
                for (int i2 = 0; i2 < n2; ++i2) {
                    this.t(Array.get(object2, i2));
                }
                this.g();
                continue;
            }
            object = com.github.catvod.spider.merge.C.a.c("Unable to handle type: ");
            ((StringBuilder)object).append(object2.getClass());
            throw new m(((StringBuilder)object).toString());
        }
        this.g();
        return (SELF)this;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public l s() {
        this.o("utcOffsetMinutes");
        this.q(Integer.toString(0));
        return this;
    }

    public final SELF t(Object object) {
        if (object == null) {
            this.n();
            this.r(i);
            return (SELF)this;
        }
        if (object instanceof String) {
            object = (String)object;
            this.n();
            this.f((String)object);
            return (SELF)this;
        }
        if (object instanceof Number) {
            object = (Number)object;
            this.n();
            this.q(object.toString());
            return (SELF)this;
        }
        if (object instanceof Boolean) {
            boolean bl = (Boolean)object;
            this.n();
            object = bl ? (Object)j : (Object)k;
            this.r((char[])object);
            return (SELF)this;
        }
        if (object instanceof Collection) {
            this.d(null, (Collection)object);
            return (SELF)this;
        }
        if (object instanceof Map) {
            this.l(null, (Map)object);
            return (SELF)this;
        }
        if (object.getClass().isArray()) {
            int n2 = Array.getLength(object);
            this.b();
            for (int i2 = 0; i2 < n2; ++i2) {
                this.t(Array.get(object, i2));
            }
            this.g();
            return (SELF)this;
        }
        StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("Unable to handle type: ");
        stringBuilder.append(object.getClass());
        throw new m(stringBuilder.toString());
    }

    public SELF u(String string, String string2) {
        if (string2 == null) {
            this.i(string);
            return (SELF)this;
        }
        this.o(string);
        this.f(string2);
        return (SELF)this;
    }

    public SELF v(String object, boolean bl) {
        this.o((String)object);
        object = bl ? (Object)j : (Object)k;
        this.r((char[])object);
        return (SELF)this;
    }
}

