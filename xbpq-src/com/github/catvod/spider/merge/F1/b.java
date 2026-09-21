/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.F1;

import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.D1.A;
import com.github.catvod.spider.merge.K1.p;
import com.github.catvod.spider.merge.n1.i;
import com.github.catvod.spider.merge.o1.a;
import com.github.catvod.spider.merge.o1.c;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public final class b
extends c {
    private static final b a = new b();

    private b() {
    }

    public static b m() {
        return a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final String c(String object) {
        try {
            object = p.q((String)object);
            if (p.i((URL)object) && (A.B((URL)object) || A.x((URL)object))) {
                String string = ((URL)object).getPath();
                if (!string.equals("/watch") && !string.equals("/playlist")) {
                    object = new i("the url given is neither a video nor a playlist URL");
                    throw object;
                }
                if ((object = p.f((URL)object, "list")) == null) {
                    object = new i("the URL given does not include a playlist");
                    throw object;
                }
                if (((String)object).matches("[a-zA-Z0-9_-]{10,}")) {
                    return object;
                }
                object = new i("the list-ID given in the URL does not match the list pattern");
                throw object;
            }
            object = new i("the url given is not a YouTube-URL");
            throw object;
        }
        catch (Exception exception) {
            throw new i(e.c("Error could not parse URL: ", exception.getMessage()), exception);
        }
    }

    @Override
    public final boolean h(String string) {
        try {
            this.c(string);
            return true;
        }
        catch (i i2) {
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final com.github.catvod.spider.merge.o1.b j(String object) {
        try {
            Object object2 = p.q((String)object);
            String string = p.f((URL)object2, "list");
            if (string == null) return super.j((String)object);
            int n2 = A.j;
            if (!string.startsWith("RD")) return super.j((String)object);
            CharSequence charSequence = p.f((URL)object2, "v");
            object2 = charSequence;
            if (charSequence == null) {
                object2 = A.f(string);
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("https://www.youtube.com/watch?v=");
            ((StringBuilder)charSequence).append((String)object2);
            ((StringBuilder)charSequence).append("&list=");
            ((StringBuilder)charSequence).append(string);
            charSequence = ((StringBuilder)charSequence).toString();
            object2 = new a((String)object, (String)charSequence, string);
            return new com.github.catvod.spider.merge.o1.b((a)object2);
        }
        catch (MalformedURLException malformedURLException) {
            throw new i(e.c("Error could not parse URL: ", malformedURLException.getMessage()), malformedURLException);
        }
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    @Override
    public final String k(String string, List list) {
        return e.c("https://www.youtube.com/playlist?list=", string);
    }
}

