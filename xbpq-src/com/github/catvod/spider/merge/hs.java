/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.kA;
import com.github.catvod.spider.merge.rO;
import java.util.HashMap;
import java.util.Map;

public class hs
implements Cloneable {
    private static final String[] N;
    private static final String[] OL;
    private static final String[] S;
    private static final String[] T4;
    private static final String[] b;
    private static final String[] l;
    private static final Map<String, hs> l8;
    private static final String[] tT;
    private boolean A = true;
    private boolean E9 = false;
    private String HM;
    private boolean Kf = false;
    private boolean cD = false;
    private boolean hR = false;
    private String n;
    private boolean s = false;
    private boolean v = true;

    static {
        int n2;
        l8 = new HashMap<String, hs>();
        String[] stringArray = new String[64];
        int n3 = 0;
        stringArray[0] = "html";
        stringArray[1] = "head";
        stringArray[2] = "body";
        stringArray[3] = "frameset";
        stringArray[4] = "script";
        stringArray[5] = "noscript";
        stringArray[6] = "style";
        stringArray[7] = "meta";
        stringArray[8] = "link";
        stringArray[9] = "title";
        stringArray[10] = "frame";
        stringArray[11] = "noframes";
        stringArray[12] = "section";
        stringArray[13] = "nav";
        stringArray[14] = "aside";
        stringArray[15] = "hgroup";
        stringArray[16] = "header";
        stringArray[17] = "footer";
        stringArray[18] = "p";
        stringArray[19] = "h1";
        stringArray[20] = "h2";
        stringArray[21] = "h3";
        stringArray[22] = "h4";
        stringArray[23] = "h5";
        stringArray[24] = "h6";
        stringArray[25] = "ul";
        stringArray[26] = "ol";
        stringArray[27] = "pre";
        stringArray[28] = "div";
        stringArray[29] = "blockquote";
        stringArray[30] = "hr";
        stringArray[31] = "address";
        stringArray[32] = "figure";
        stringArray[33] = "figcaption";
        stringArray[34] = "form";
        stringArray[35] = "fieldset";
        stringArray[36] = "ins";
        stringArray[37] = "del";
        stringArray[38] = "dl";
        stringArray[39] = "dt";
        stringArray[40] = "dd";
        stringArray[41] = "li";
        stringArray[42] = "table";
        stringArray[43] = "caption";
        stringArray[44] = "thead";
        stringArray[45] = "tfoot";
        stringArray[46] = "tbody";
        stringArray[47] = "colgroup";
        stringArray[48] = "col";
        stringArray[49] = "tr";
        stringArray[50] = "th";
        stringArray[51] = "td";
        stringArray[52] = "video";
        stringArray[53] = "audio";
        stringArray[54] = "canvas";
        stringArray[55] = "details";
        stringArray[56] = "menu";
        stringArray[57] = "plaintext";
        stringArray[58] = "template";
        stringArray[59] = "article";
        stringArray[60] = "main";
        stringArray[61] = "svg";
        stringArray[62] = "math";
        stringArray[63] = "center";
        S = stringArray;
        T4 = new String[]{"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "a", "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", "data", "bdi", "s"};
        b = new String[]{"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};
        OL = new String[]{"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", "s"};
        l = new String[]{"pre", "plaintext", "title", "textarea"};
        tT = new String[]{"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};
        N = new String[]{"input", "keygen", "object", "select", "textarea"};
        int n4 = stringArray.length;
        for (n2 = 0; n2 < n4; ++n2) {
            hs.A(new hs(stringArray[n2]));
        }
        stringArray = T4;
        n4 = stringArray.length;
        for (n2 = 0; n2 < n4; ++n2) {
            hs object2 = new hs(stringArray[n2]);
            object2.v = false;
            object2.A = false;
            hs.A(object2);
        }
        for (String string : b) {
            hs hs2 = l8.get(string);
            Rc.HM(hs2);
            hs2.cD = true;
        }
        for (String string : OL) {
            hs hs3 = l8.get(string);
            Rc.HM(hs3);
            hs3.A = false;
        }
        for (String string : l) {
            hs hs4 = l8.get(string);
            Rc.HM(hs4);
            hs4.hR = true;
        }
        for (String string : tT) {
            hs hs5 = l8.get(string);
            Rc.HM(hs5);
            hs5.Kf = true;
        }
        stringArray = N;
        n4 = stringArray.length;
        for (n2 = n3; n2 < n4; ++n2) {
            String string = stringArray[n2];
            hs hs6 = l8.get(string);
            Rc.HM(hs6);
            hs6.E9 = true;
        }
    }

    private hs(String string) {
        this.HM = string;
        this.n = kA.l8(string);
    }

    private static void A(hs hs2) {
        l8.put(hs2.HM, hs2);
    }

    public static hs hR(String string, rO rO2) {
        hs hs2;
        block0: {
            Object object;
            block1: {
                Rc.HM(string);
                Map<String, hs> map = l8;
                object = map.get(string);
                hs2 = object;
                if (object != null) break block0;
                string = rO2.T4(string);
                Rc.tT(string);
                object = kA.l8(string);
                hs2 = map.get(object);
                if (hs2 != null) break block1;
                hs2 = new hs(string);
                hs2.v = false;
                break block0;
            }
            if (!rO2.OL() || string.equals(object)) break block0;
            hs2 = hs2.l8();
            hs2.HM = string;
        }
        return hs2;
    }

    public static hs s(String string) {
        return hs.hR(string, rO.S);
    }

    public boolean HM() {
        boolean bl = this.cD || this.s;
        return bl;
    }

    public boolean N() {
        return l8.containsKey(this.HM);
    }

    public boolean OL() {
        return this.cD;
    }

    public boolean S() {
        return this.A;
    }

    public String T4() {
        return this.HM;
    }

    public boolean b() {
        return this.v;
    }

    hs cD() {
        this.s = true;
        return this;
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (!(object instanceof hs)) {
            return false;
        }
        object = (hs)object;
        if (!this.HM.equals(((hs)object).HM)) {
            return false;
        }
        if (this.cD != ((hs)object).cD) {
            return false;
        }
        if (this.A != ((hs)object).A) {
            return false;
        }
        if (this.v != ((hs)object).v) {
            return false;
        }
        if (this.hR != ((hs)object).hR) {
            return false;
        }
        if (this.s != ((hs)object).s) {
            return false;
        }
        if (this.Kf != ((hs)object).Kf) {
            return false;
        }
        if (this.E9 != ((hs)object).E9) {
            bl = false;
        }
        return bl;
    }

    public int hashCode() {
        return ((((((this.HM.hashCode() * 31 + this.v) * 31 + this.A) * 31 + this.cD) * 31 + this.s) * 31 + this.hR) * 31 + this.Kf) * 31 + this.E9;
    }

    public boolean l() {
        return this.Kf;
    }

    protected hs l8() {
        try {
            hs hs2 = (hs)super.clone();
            return hs2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
    }

    public String n() {
        return this.n;
    }

    public boolean tT() {
        return this.v ^ true;
    }

    public String toString() {
        return this.HM;
    }

    public boolean v() {
        return this.hR;
    }
}

