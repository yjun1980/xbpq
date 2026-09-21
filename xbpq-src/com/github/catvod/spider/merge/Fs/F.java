/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Dw.i;
import com.github.catvod.spider.merge.Dw.s;
import com.github.catvod.spider.merge.Fs.D;
import java.util.HashMap;
import java.util.Map;

public final class F
implements Cloneable {
    private static final Map<String, F> l;
    private static final String[] m;
    private static final String[] n;
    private static final String[] o;
    private static final String[] p;
    private static final String[] q;
    private static final String[] r;
    private String c;
    private String d;
    private boolean e = true;
    private boolean f = true;
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;
    private boolean k = false;

    static {
        int n2;
        l = new HashMap<String, F>();
        int n3 = 0;
        m = new String[]{"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "a", "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", "data", "bdi", "s"};
        n = new String[]{"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};
        o = new String[]{"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", "s"};
        p = new String[]{"pre", "plaintext", "title", "textarea"};
        q = new String[]{"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};
        r = new String[]{"input", "keygen", "object", "select", "textarea"};
        for (n2 = 0; n2 < 64; ++n2) {
            F object2 = new F((new String[]{"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main", "svg", "math", "center"})[n2]);
            ((HashMap)l).put(object2.c, object2);
        }
        String[] stringArray = m;
        int n4 = stringArray.length;
        for (n2 = 0; n2 < n4; ++n2) {
            F f2 = new F(stringArray[n2]);
            f2.e = false;
            f2.f = false;
            ((HashMap)l).put(f2.c, f2);
        }
        for (String string : n) {
            F f4 = (F)((HashMap)l).get(string);
            com.github.catvod.spider.merge.Dw.i.k(f4);
            f4.g = true;
        }
        for (String string : o) {
            F f5 = (F)((HashMap)l).get(string);
            com.github.catvod.spider.merge.Dw.i.k(f5);
            f5.f = false;
        }
        for (String string : p) {
            F f6 = (F)((HashMap)l).get(string);
            com.github.catvod.spider.merge.Dw.i.k(f6);
            f6.i = true;
        }
        for (String string : q) {
            F f7 = (F)((HashMap)l).get(string);
            com.github.catvod.spider.merge.Dw.i.k(f7);
            f7.j = true;
        }
        String[] stringArray2 = r;
        n4 = stringArray2.length;
        for (n2 = n3; n2 < n4; ++n2) {
            String string = stringArray2[n2];
            F f8 = (F)((HashMap)l).get(string);
            com.github.catvod.spider.merge.Dw.i.k(f8);
            f8.k = true;
        }
    }

    private F(String string) {
        this.c = string;
        this.d = s.c(string);
    }

    public static F l(String string, D d2) {
        com.github.catvod.spider.merge.Dw.i.k(string);
        Map<String, F> map = l;
        Object object = (F)((HashMap)map).get(string);
        F f2 = object;
        if (object == null) {
            string = d2.c(string);
            com.github.catvod.spider.merge.Dw.i.i(string);
            object = s.c(string);
            f2 = (F)((HashMap)map).get(object);
            if (f2 == null) {
                f2 = new F(string);
                f2.e = false;
            } else if (d2.e() && !string.equals(object)) {
                try {
                    f2 = (F)super.clone();
                    f2.c = string;
                }
                catch (CloneNotSupportedException cloneNotSupportedException) {
                    throw new RuntimeException(cloneNotSupportedException);
                }
            }
        }
        return f2;
    }

    public final boolean a() {
        return this.f;
    }

    public final String b() {
        return this.c;
    }

    public final boolean c() {
        return this.e;
    }

    protected final Object clone() {
        try {
            F f2 = (F)super.clone();
            return f2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
    }

    public final boolean d() {
        return this.g;
    }

    public final boolean e() {
        return this.j;
    }

    public final boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (!(object instanceof F)) {
            return false;
        }
        object = (F)object;
        if (!this.c.equals(((F)object).c)) {
            return false;
        }
        if (this.g != ((F)object).g) {
            return false;
        }
        if (this.f != ((F)object).f) {
            return false;
        }
        if (this.e != ((F)object).e) {
            return false;
        }
        if (this.i != ((F)object).i) {
            return false;
        }
        if (this.h != ((F)object).h) {
            return false;
        }
        if (this.j != ((F)object).j) {
            return false;
        }
        if (this.k != ((F)object).k) {
            bl = false;
        }
        return bl;
    }

    public final boolean f() {
        return this.e ^ true;
    }

    public final boolean g() {
        return ((HashMap)l).containsKey(this.c);
    }

    public final boolean h() {
        boolean bl = this.g || this.h;
        return bl;
    }

    public final int hashCode() {
        return ((((((this.c.hashCode() * 31 + this.e) * 31 + this.f) * 31 + this.g) * 31 + this.h) * 31 + this.i) * 31 + this.j) * 31 + this.k;
    }

    public final String i() {
        return this.d;
    }

    public final boolean j() {
        return this.i;
    }

    final F k() {
        this.h = true;
        return this;
    }

    public final String toString() {
        return this.c;
    }
}

