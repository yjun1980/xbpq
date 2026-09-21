/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.D0.b;
import com.github.catvod.spider.merge.xc.G0.D;
import java.util.HashMap;

public final class E
implements Cloneable {
    public static final HashMap j;
    public static final String[] k;
    public static final String[] l;
    public static final String[] m;
    public static final String[] n;
    public static final String[] o;
    public static final String[] p;
    public String a;
    public final String b;
    public boolean c = true;
    public boolean d = true;
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;

    static {
        int n2;
        j = new HashMap();
        int n3 = 0;
        k = new String[]{"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "a", "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", "data", "bdi", "s", "strike", "nobr"};
        l = new String[]{"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};
        m = new String[]{"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", "s"};
        n = new String[]{"pre", "plaintext", "title", "textarea"};
        o = new String[]{"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};
        p = new String[]{"input", "keygen", "object", "select", "textarea"};
        for (n2 = 0; n2 < 69; ++n2) {
            E object2 = new E((new String[]{"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main", "svg", "math", "center", "template", "dir", "applet", "marquee", "listing"})[n2]);
            String string = object2.a;
            j.put(string, object2);
        }
        String[] stringArray = k;
        int n4 = stringArray.length;
        for (n2 = 0; n2 < n4; ++n2) {
            E e2 = new E(stringArray[n2]);
            e2.c = false;
            e2.d = false;
            String string = e2.a;
            j.put(string, e2);
        }
        for (String string : l) {
            E e3 = (E)j.get(string);
            com.github.catvod.spider.merge.xc.D0.b.A(e3);
            e3.e = true;
        }
        for (String string : m) {
            E e4 = (E)j.get(string);
            com.github.catvod.spider.merge.xc.D0.b.A(e4);
            e4.d = false;
        }
        for (String string : n) {
            E e5 = (E)j.get(string);
            com.github.catvod.spider.merge.xc.D0.b.A(e5);
            e5.g = true;
        }
        for (String string : o) {
            E e6 = (E)j.get(string);
            com.github.catvod.spider.merge.xc.D0.b.A(e6);
            e6.h = true;
        }
        String[] stringArray2 = p;
        n4 = stringArray2.length;
        for (n2 = n3; n2 < n4; ++n2) {
            String string = stringArray2[n2];
            E e7 = (E)j.get(string);
            com.github.catvod.spider.merge.xc.D0.b.A(e7);
            e7.i = true;
        }
    }

    public E(String string) {
        this.a = string;
        this.b = com.github.catvod.spider.merge.xc.D0.b.u(string);
    }

    public static E a(String object, D object2) {
        com.github.catvod.spider.merge.xc.D0.b.A(object);
        HashMap hashMap = j;
        E e2 = (E)hashMap.get(object);
        Object object3 = e2;
        if (e2 == null) {
            object2.getClass();
            object3 = ((String)object).trim();
            boolean bl = ((D)object2).a;
            object = object3;
            if (!bl) {
                object = com.github.catvod.spider.merge.xc.D0.b.u((String)object3);
            }
            com.github.catvod.spider.merge.xc.D0.b.y((String)object);
            object2 = com.github.catvod.spider.merge.xc.D0.b.u((String)object);
            object3 = (E)hashMap.get(object2);
            if (object3 == null) {
                object3 = new E((String)object);
                ((E)object3).c = false;
            } else if (bl && !((String)object).equals(object2)) {
                try {
                    object3 = (E)object3.clone();
                    ((E)object3).a = object;
                }
                catch (CloneNotSupportedException cloneNotSupportedException) {
                    throw new RuntimeException(cloneNotSupportedException);
                }
            }
        }
        return object3;
    }

    public final Object clone() {
        try {
            E e2 = (E)super.clone();
            return e2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
    }

    public final boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (!(object instanceof E)) {
            return false;
        }
        object = (E)object;
        if (!this.a.equals(((E)object).a)) {
            return false;
        }
        if (this.e != ((E)object).e) {
            return false;
        }
        if (this.d != ((E)object).d) {
            return false;
        }
        if (this.c != ((E)object).c) {
            return false;
        }
        if (this.g != ((E)object).g) {
            return false;
        }
        if (this.f != ((E)object).f) {
            return false;
        }
        if (this.h != ((E)object).h) {
            return false;
        }
        if (this.i != ((E)object).i) {
            bl = false;
        }
        return bl;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() * 31 + this.c) * 31 + this.d) * 31 + this.e) * 31 + this.f) * 31 + this.g) * 31 + this.h) * 31 + this.i;
    }

    public final String toString() {
        return this.a;
    }
}

