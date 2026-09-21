/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u0620;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class \u0782
implements Comparator<\u0620> {
    private final String \u037f;
    private final String \u0528;

    public \u0782(String string, String string2) {
        this.\u037f = string;
        this.\u0528 = string2;
    }

    public static void \u0528(String string, String string2, List<\u0620> list) {
        Collections.sort(list, new \u0782(string, string2));
    }

    /*
     * Enabled aggressive block sorting
     */
    public int \u037f(\u0620 \u06202, \u0620 \u06203) {
        int n2;
        boolean bl;
        block11: {
            block12: {
                bl = this.\u0528.equals(SOY.d("1B2132"));
                String string = this.\u037f;
                string.hashCode();
                switch (string.hashCode()) {
                    case 3530753: {
                        if (!string.equals(SOY.d("093B2B13"))) break;
                        n2 = 2;
                        break block11;
                    }
                    case 3373707: {
                        if (!string.equals(SOY.d("14333C13"))) break;
                        n2 = 1;
                        break block11;
                    }
                    case 3076014: {
                        if (string.equals(SOY.d("1E332513"))) break block12;
                    }
                }
                n2 = -1;
                break block11;
            }
            n2 = 0;
        }
        switch (n2) {
            default: {
                return -1;
            }
            case 2: {
                long l2;
                long l3;
                if (bl) {
                    l3 = \u06202.\u052f();
                    l2 = \u06203.\u052f();
                    return l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
                }
                l3 = \u06203.\u052f();
                l2 = \u06202.\u052f();
                return l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
            }
            case 1: {
                if (!bl) return \u06203.\u052b().compareTo(\u06202.\u052b());
                return \u06202.\u052b().compareTo(\u06203.\u052b());
            }
            case 0: 
        }
        if (!bl) return \u06203.\u0528().compareTo(\u06202.\u0528());
        return \u06202.\u0528().compareTo(\u06203.\u0528());
    }
}

