/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.B0;

import com.github.catvod.spider.merge.B0.a;
import com.github.catvod.spider.merge.B0.b;
import com.github.catvod.spider.merge.B0.d;
import com.github.catvod.spider.merge.B0.e;

public abstract class c {
    private final boolean a;
    protected final e b;
    protected final String c;
    protected final String d;
    protected final com.github.catvod.spider.merge.u0.c e;
    protected final Integer f;
    protected b g;
    protected b h;

    protected c(com.github.catvod.spider.merge.y.e object, boolean bl) {
        block12: {
            block10: {
                Object object2;
                block13: {
                    block11: {
                        this.a = bl;
                        try {
                            object2 = new StringBuilder();
                            ((StringBuilder)object2).append("i");
                            ((StringBuilder)object2).append(((com.github.catvod.spider.merge.y.e)object).s("itag"));
                            object2 = com.github.catvod.spider.merge.B0.e.valueOf(((StringBuilder)object2).toString());
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            int n2;
                            illegalArgumentException.printStackTrace();
                            object2 = com.github.catvod.spider.merge.B0.e.d;
                            ((d)((Object)object2)).a = n2 = ((com.github.catvod.spider.merge.y.e)object).r("itag");
                        }
                        this.b = object2;
                        this.c = ((com.github.catvod.spider.merge.y.e)object).x("url").replace("\\u0026", "&");
                        object2 = ((com.github.catvod.spider.merge.y.e)object).x("mimeType");
                        this.d = object2;
                        this.f = ((com.github.catvod.spider.merge.y.e)object).s("bitrate");
                        ((com.github.catvod.spider.merge.y.e)object).v("contentLength");
                        ((com.github.catvod.spider.merge.y.e)object).v("lastModified");
                        ((com.github.catvod.spider.merge.y.e)object).v("approxDurationMs");
                        com.github.catvod.spider.merge.y.e e2 = ((com.github.catvod.spider.merge.y.e)object).u("initRange");
                        if (e2 != null) {
                            this.g = new b(e2.w("start"), e2.w("end"));
                        }
                        if ((object = ((com.github.catvod.spider.merge.y.e)object).u("indexRange")) != null) {
                            this.h = new b(((com.github.catvod.spider.merge.y.e)object).w("start"), ((com.github.catvod.spider.merge.y.e)object).w("end"));
                        }
                        if (object2 == null || ((String)object2).isEmpty()) break block10;
                        object = com.github.catvod.spider.merge.u0.c.b;
                        if (!((String)object2).contains(((com.github.catvod.spider.merge.u0.c)object).a())) break block11;
                        if (this instanceof a) {
                            object = com.github.catvod.spider.merge.u0.c.f;
                        }
                        break block12;
                    }
                    object = com.github.catvod.spider.merge.u0.c.c;
                    if (!((String)object2).contains(((com.github.catvod.spider.merge.u0.c)object).a())) break block13;
                    if (this instanceof a) {
                        object = com.github.catvod.spider.merge.u0.c.g;
                    }
                    break block12;
                }
                object = com.github.catvod.spider.merge.u0.c.e;
                if (((String)object2).contains(((com.github.catvod.spider.merge.u0.c)object).a()) || ((String)object2).contains(((com.github.catvod.spider.merge.u0.c)(object = com.github.catvod.spider.merge.u0.c.d)).a())) break block12;
            }
            object = com.github.catvod.spider.merge.u0.c.h;
        }
        this.e = object;
    }

    public final Integer a() {
        return this.f;
    }

    public final com.github.catvod.spider.merge.u0.c b() {
        return this.e;
    }

    public final b c() {
        return this.h;
    }

    public final b d() {
        return this.g;
    }

    public final boolean e() {
        return this.a;
    }

    public final e f() {
        return this.b;
    }

    public final String g() {
        return this.d;
    }

    public final String h() {
        return this.c;
    }
}

