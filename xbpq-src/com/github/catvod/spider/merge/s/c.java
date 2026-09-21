/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.s;

import com.github.catvod.spider.merge.cYh;
import java.util.HashMap;
import java.util.Map;

public final class c
extends Enum<c> {
    private static final Map<Integer, c> e;
    private static final Map<String, c> f;
    private static final c[] g;
    private final int[] c;
    private final String[] d;

    static {
        c[] cArray = new c(new int[]{0, 2}, new String[0]);
        String object24 = cYh.d("2E030E7C6F6252696C60");
        c c2 = new c(new int[]{1, 3}, object24);
        String[] stringArray = cYh.d("2E030E7C6F6252696C63");
        stringArray = new c(4, new String[]{stringArray});
        Object object23 = cYh.d("2E030E7C6F6252696C62");
        object23 = new c(5, new String[]{object23});
        Object object2 = cYh.d("2E030E7C6F6252696C65");
        object2 = new c(6, new String[]{object2});
        Object object3 = cYh.d("2E030E7C6F6252696C64");
        object3 = new c(7, new String[]{object3});
        Object object4 = cYh.d("2E030E7C6F6252696C67");
        object4 = new c(8, new String[]{object4});
        Object object5 = cYh.d("2E030E7C6F6252696C66");
        object5 = new c(9, new String[]{object5});
        Object object6 = cYh.d("2E030E7C6F6252696C69");
        object6 = new c(10, new String[]{object6});
        Object object7 = cYh.d("2E030E7C6F6252696C68");
        object7 = new c(11, new String[]{object7});
        Object object8 = cYh.d("2E030E7C6F6252696C6067");
        object8 = new c(12, new String[]{object8});
        Object object9 = cYh.d("2E030E7C6F6252696C6066");
        object9 = new c(13, new String[]{object9});
        Object object10 = cYh.d("2E030E7C6F6252696C6064");
        object10 = new c(15, new String[]{object10});
        Object object11 = cYh.d("2E030E7C6F6252696C6063");
        object11 = new c(16, new String[]{object11});
        Object object12 = cYh.d("2E030E7C6F6252696C6062");
        object12 = new c(17, new String[]{object12});
        Object object13 = cYh.d("2E030E7C6F6252696C6061");
        object13 = new c(18, new String[]{object13});
        Object object14 = cYh.d("3438283723052D1912");
        object14 = new c(20, new String[]{object14});
        Object object15 = cYh.d("10392F35382D147D7063626A");
        object15 = new c(21, new String[]{object15});
        Object object16 = cYh.d("10392F35382D147D7063626B");
        object16 = new c(22, new String[]{object16});
        Object object17 = cYh.d("10392F35382D147D70636268");
        object17 = new c(23, new String[]{object17});
        Object object18 = cYh.d("10392F35382D147D7063626C");
        object18 = new c(24, new String[]{object18});
        Object object19 = cYh.d("3204077C666C2515");
        Object object20 = cYh.d("323E2832383E02122836");
        object20 = new c(25, new String[]{object19, object20});
        object19 = cYh.d("3204077C6F");
        object19 = new c(26, new String[]{object19});
        Object object21 = cYh.d("32036C1004192E19");
        c c3 = new c(new int[]{27, 170}, new String[]{object21});
        object21 = new c(new int[]{28}, new String[0]);
        Object object22 = cYh.d("201273626668");
        String string = cYh.d("2205020E1414");
        String string2 = cYh.d("20120A");
        object22 = new c(29, new String[]{object22, string, string2});
        string = cYh.d("2205027C1C08");
        g = new c[]{cArray, c2, stringArray, object23, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17, object18, object20, object19, c3, object21, object22, new c(30, string)};
        e = new HashMap<Integer, c>();
        f = new HashMap<String, c>();
        for (c c4 : com.github.catvod.spider.merge.s.c.values()) {
            for (String string3 : (String[])c4.c) {
                ((HashMap)e).put((int)string3, c4);
            }
            ((HashMap)f).put(c4.name(), c4);
            for (Object object23 : c4.d) {
                ((HashMap)f).put(object23, c4);
            }
        }
    }

    private c(int n3, String ... stringArray) {
        this.c = new int[]{n3};
        this.d = stringArray;
    }

    private c(int[] nArray, String ... stringArray) {
        this.c = nArray;
        this.d = stringArray;
    }

    public static c a(String string) {
        return (c)((Object)((HashMap)f).get(string));
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    public static c[] values() {
        return (c[])g.clone();
    }

    public final int b() {
        return this.c[0];
    }
}

