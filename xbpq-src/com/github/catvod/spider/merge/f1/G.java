/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.f1.E;
import java.util.HashMap;
import java.util.Map;

public final class G
implements Cloneable {
    private static final Map<String, G> j;
    private static final String[] k;
    private static final String[] l;
    private static final String[] m;
    private static final String[] n;
    private static final String[] o;
    private static final String[] p;
    private String a;
    private String b;
    private boolean c = true;
    private boolean d = true;
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;

    static {
        int n2;
        j = new HashMap<String, G>();
        k = new String[]{"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "a", "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", "data", "bdi", "s", "strike", "nobr"};
        l = new String[]{"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};
        m = new String[]{"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", "s"};
        n = new String[]{"pre", "plaintext", "title", "textarea"};
        o = new String[]{"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};
        p = new String[]{"input", "keygen", "object", "select", "textarea"};
        int n3 = 0;
        for (n2 = 0; n2 < 69; ++n2) {
            G object2 = new G((new String[]{"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main", "svg", "math", "center", "template", "dir", "applet", "marquee", "listing"})[n2]);
            ((HashMap)j).put(object2.a, object2);
        }
        String[] stringArray = k;
        int n4 = stringArray.length;
        for (n2 = 0; n2 < n4; ++n2) {
            G g2 = new G(stringArray[n2]);
            g2.c = false;
            g2.d = false;
            ((HashMap)j).put(g2.a, g2);
        }
        for (String string : l) {
            G g3 = (G)((HashMap)j).get(string);
            com.github.catvod.spider.merge.c1.d.j(g3);
            g3.e = true;
        }
        for (String string : m) {
            G g4 = (G)((HashMap)j).get(string);
            com.github.catvod.spider.merge.c1.d.j(g4);
            g4.d = false;
        }
        for (String string : n) {
            G g5 = (G)((HashMap)j).get(string);
            com.github.catvod.spider.merge.c1.d.j(g5);
            g5.g = true;
        }
        for (String string : o) {
            G g6 = (G)((HashMap)j).get(string);
            com.github.catvod.spider.merge.c1.d.j(g6);
            g6.h = true;
        }
        String[] stringArray2 = p;
        n4 = stringArray2.length;
        for (n2 = n3; n2 < n4; ++n2) {
            String string = stringArray2[n2];
            G g7 = (G)((HashMap)j).get(string);
            com.github.catvod.spider.merge.c1.d.j(g7);
            g7.i = true;
        }
    }

    private G(String string) {
        this.a = string;
        this.b = com.github.catvod.spider.merge.K1.d.e(string);
    }

    public static boolean h(String string) {
        return ((HashMap)j).containsKey(string);
    }

    public static G m(String string, E e2) {
        com.github.catvod.spider.merge.c1.d.j(string);
        Map<String, G> map = j;
        Object object = (G)((HashMap)map).get(string);
        G g2 = object;
        if (object == null) {
            string = e2.d(string);
            com.github.catvod.spider.merge.c1.d.h(string);
            object = com.github.catvod.spider.merge.K1.d.e(string);
            g2 = (G)((HashMap)map).get(object);
            if (g2 == null) {
                g2 = new G(string);
                g2.c = false;
            } else if (e2.f() && !string.equals(object)) {
                try {
                    g2 = (G)super.clone();
                    g2.a = string;
                }
                catch (CloneNotSupportedException cloneNotSupportedException) {
                    throw new RuntimeException(cloneNotSupportedException);
                }
            }
        }
        return g2;
    }

    public final boolean a() {
        return this.d;
    }

    public final String b() {
        return this.a;
    }

    public final boolean c() {
        return this.c;
    }

    protected final Object clone() {
        try {
            G g2 = (G)super.clone();
            return g2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
    }

    public final boolean d() {
        return this.e;
    }

    public final boolean e() {
        return this.h;
    }

    public final boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (!(object instanceof G)) {
            return false;
        }
        object = (G)object;
        if (!this.a.equals(((G)object).a)) {
            return false;
        }
        if (this.e != ((G)object).e) {
            return false;
        }
        if (this.d != ((G)object).d) {
            return false;
        }
        if (this.c != ((G)object).c) {
            return false;
        }
        if (this.g != ((G)object).g) {
            return false;
        }
        if (this.f != ((G)object).f) {
            return false;
        }
        if (this.h != ((G)object).h) {
            return false;
        }
        if (this.i != ((G)object).i) {
            bl = false;
        }
        return bl;
    }

    public final boolean f() {
        return this.c ^ true;
    }

    public final boolean g() {
        return ((HashMap)j).containsKey(this.a);
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() * 31 + this.c) * 31 + this.d) * 31 + this.e) * 31 + this.f) * 31 + this.g) * 31 + this.h) * 31 + this.i;
    }

    public final boolean i() {
        boolean bl = this.e || this.f;
        return bl;
    }

    public final String j() {
        return this.b;
    }

    public final boolean k() {
        return this.g;
    }

    final G l() {
        this.f = true;
        return this;
    }

    public final String toString() {
        return this.a;
    }
}

