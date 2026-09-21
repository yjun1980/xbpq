/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u02b3;
import com.github.catvod.spider.merge.\u02c8;
import com.github.catvod.spider.merge.\u0559;
import com.github.catvod.spider.merge.\u081a;
import com.github.catvod.spider.merge.\u086a;
import com.github.catvod.spider.merge.\u08a1;
import com.github.catvod.spider.merge.\u08a3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class \u0868
extends \u08a1 {
    public List<\u02c8> \u052a;
    public \u08a3 \u052b;
    public \u08a3 \u052c;
    public \u086a \u052d;

    public \u0868() {
    }

    public \u0868(\u0868 \u08682, int n2) {
        super(\u08682, n2);
    }

    @Override
    public \u02c8 \u052b(int n2) {
        List<\u02c8> list = this.\u052a;
        list = list != null && n2 >= 0 && n2 < list.size() ? this.\u052a.get(n2) : null;
        return list;
    }

    @Override
    public int \u052c() {
        List<\u02c8> list = this.\u052a;
        int n2 = list != null ? list.size() : 0;
        return n2;
    }

    public <T extends \u02c8> T \u0780(T t2) {
        if (this.\u052a == null) {
            this.\u052a = new ArrayList<\u02c8>();
        }
        this.\u052a.add(t2);
        return t2;
    }

    public \u08a1 \u0781(\u08a1 \u08a12) {
        return this.\u0780(\u08a12);
    }

    public \u02b3 \u0782(\u02b3 \u02b32) {
        \u02b32.\u037f(this);
        return this.\u0780(\u02b32);
    }

    public \u081a \u0783(\u081a \u081a2) {
        \u081a2.\u037f(this);
        return this.\u0780(\u081a2);
    }

    public void \u0784(\u0559 \u05592) {
    }

    public void \u0785(\u0559 \u05592) {
    }

    public <T extends \u02c8> T \u0786(Class<? extends T> clazz, int n2) {
        List<\u02c8> list = this.\u052a;
        if (list != null && n2 >= 0 && n2 < list.size()) {
            int n3 = -1;
            for (\u02c8 \u02c82 : this.\u052a) {
                int n4;
                if (!clazz.isInstance(\u02c82)) continue;
                n3 = n4 = n3 + 1;
                if (n4 != n2) continue;
                return (T)((\u02c8)clazz.cast(\u02c82));
            }
        }
        return null;
    }

    public \u0868 \u0787() {
        return (\u0868)super.\u052d();
    }

    public <T extends \u0868> T \u0788(Class<? extends T> clazz, int n2) {
        return (T)((\u0868)this.\u0786(clazz, n2));
    }

    public <T extends \u0868> List<T> \u0789(Class<? extends T> clazz) {
        List<\u02c8> list = this.\u052a;
        if (list == null) {
            return Collections.emptyList();
        }
        List<\u02c8> list2 = null;
        for (\u02c8 \u02c82 : list) {
            if (!clazz.isInstance(\u02c82)) continue;
            list = list2;
            if (list2 == null) {
                list = new ArrayList<\u02c8>();
            }
            list.add((\u02c8)clazz.cast(\u02c82));
            list2 = list;
        }
        if (list2 == null) {
            return Collections.emptyList();
        }
        return list2;
    }

    public \u02b3 \u078a(int n2, int n3) {
        List<\u02c8> list = this.\u052a;
        if (list != null && n3 >= 0 && n3 < list.size()) {
            int n4 = -1;
            for (\u02c8 \u02c82 : this.\u052a) {
                int n5;
                if (!(\u02c82 instanceof \u02b3) || (\u02c82 = (\u02b3)\u02c82).\u0529().getType() != n2) continue;
                n4 = n5 = n4 + 1;
                if (n5 != n3) continue;
                return \u02c82;
            }
        }
        return null;
    }

    public void \u078b() {
        List<\u02c8> list = this.\u052a;
        if (list != null) {
            list.remove(list.size() - 1);
        }
    }
}

