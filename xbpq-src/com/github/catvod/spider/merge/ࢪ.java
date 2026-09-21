/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u0674;
import com.github.catvod.spider.merge.\u08a1;
import com.github.catvod.spider.merge.\u08b0;
import com.github.catvod.spider.merge.\u08b1;
import com.github.catvod.spider.merge.\u08bb;
import com.github.catvod.spider.merge.\u09fc;
import com.github.catvod.spider.merge.\u0cf1;
import com.github.catvod.spider.merge.\u106f;
import com.github.catvod.spider.merge.\u1070;
import com.github.catvod.spider.merge.\u1075;
import com.github.catvod.spider.merge.\u107c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class \u08aa {
    public final List<\u08b0> \u037f = new ArrayList<\u08b0>();
    public final List<\u08bb> \u0528 = new ArrayList<\u08bb>();
    public \u106f[] \u0529;
    public \u1070[] \u052a;
    public final Map<String, \u107c> \u052b = new LinkedHashMap<String, \u107c>();
    public final \u08b1 \u052c;
    public final int \u052d;
    public int[] \u052e;
    public \u0cf1[] \u052f;
    public final List<\u107c> \u058f = new ArrayList<\u107c>();

    public \u08aa(\u08b1 \u08b12, int n2) {
        this.\u052c = \u08b12;
        this.\u052d = n2;
    }

    public void \u037f(\u08b0 \u08b02) {
        if (\u08b02 != null) {
            \u08b02.\u0528 = this;
            \u08b02.\u0529 = this.\u037f.size();
        }
        this.\u037f.add(\u08b02);
    }

    public int \u0528(\u08bb \u08bb2) {
        int n2;
        this.\u0528.add(\u08bb2);
        \u08bb2.\u052e = n2 = this.\u0528.size() - 1;
        return n2;
    }

    public \u08bb \u0529(int n2) {
        if (!this.\u0528.isEmpty()) {
            return this.\u0528.get(n2);
        }
        return null;
    }

    public \u0674 \u052a(int n2, \u08a1 object) {
        if (n2 >= 0 && n2 < this.\u037f.size()) {
            \u0674 \u06742 = this.\u052c(this.\u037f.get(n2));
            if (!\u06742.\u052e(-2)) {
                return \u06742;
            }
            \u0674 \u06743 = new \u0674(new int[0]);
            \u06743.\u052c(\u06742);
            \u06743.\u0782(-2);
            while (object != null && ((\u08a1)object).\u0529 >= 0 && \u06742.\u052e(-2)) {
                \u06742 = this.\u052c(((\u1075)this.\u037f.get((int)((\u08a1)object).\u0529).\u052e((int)0)).\u052c);
                \u06743.\u052c(\u06742);
                \u06743.\u0782(-2);
                object = ((\u08a1)object).\u0528;
            }
            if (\u06742.\u052e(-2)) {
                \u06743.\u0529(-1);
            }
            return \u06743;
        }
        object = new IllegalArgumentException(SOY.d("333C2717181E1E72220215031F723F0319151F207F"));
        throw object;
    }

    public int \u052b() {
        return this.\u0528.size();
    }

    public \u0674 \u052c(\u08b0 \u08b02) {
        \u0674 \u06742 = \u08b02.\u052d;
        if (\u06742 != null) {
            return \u06742;
        }
        \u08b02.\u052d = \u06742 = this.\u052d(\u08b02, null);
        \u06742.\u0783(true);
        return \u08b02.\u052d;
    }

    public \u0674 \u052d(\u08b0 \u08b02, \u08a1 \u08a12) {
        return new \u09fc(this).\u037f(\u08b02, \u08a12);
    }
}

