package com.github.catvod.spider.merge.s;

import com.github.catvod.spider.merge.cYh;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.github.catvod.spider.merge.s.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0233c {
    /* JADX INFO: Fake field, exist only in values array */
    EF17(new int[]{0, 2}, new String[0]),
    /* JADX INFO: Fake field, exist only in values array */
    EF44(new int[]{1, 3}, cYh.d("2E030E7C6F6252696C60")),
    /* JADX INFO: Fake field, exist only in values array */
    EF66(4, cYh.d("2E030E7C6F6252696C63")),
    /* JADX INFO: Fake field, exist only in values array */
    EF89(5, cYh.d("2E030E7C6F6252696C62")),
    /* JADX INFO: Fake field, exist only in values array */
    EF111(6, cYh.d("2E030E7C6F6252696C65")),
    /* JADX INFO: Fake field, exist only in values array */
    EF133(7, cYh.d("2E030E7C6F6252696C64")),
    /* JADX INFO: Fake field, exist only in values array */
    EF156(8, cYh.d("2E030E7C6F6252696C67")),
    /* JADX INFO: Fake field, exist only in values array */
    EF179(9, cYh.d("2E030E7C6F6252696C66")),
    /* JADX INFO: Fake field, exist only in values array */
    EF202(10, cYh.d("2E030E7C6F6252696C69")),
    /* JADX INFO: Fake field, exist only in values array */
    EF225(11, cYh.d("2E030E7C6F6252696C68")),
    /* JADX INFO: Fake field, exist only in values array */
    EF250(12, cYh.d("2E030E7C6F6252696C6067")),
    /* JADX INFO: Fake field, exist only in values array */
    EF276(13, cYh.d("2E030E7C6F6252696C6066")),
    /* JADX INFO: Fake field, exist only in values array */
    EF305(15, cYh.d("2E030E7C6F6252696C6064")),
    /* JADX INFO: Fake field, exist only in values array */
    EF334(16, cYh.d("2E030E7C6F6252696C6063")),
    /* JADX INFO: Fake field, exist only in values array */
    EF363(17, cYh.d("2E030E7C6F6252696C6062")),
    /* JADX INFO: Fake field, exist only in values array */
    EF392(18, cYh.d("2E030E7C6F6252696C6061")),
    /* JADX INFO: Fake field, exist only in values array */
    EF421(20, cYh.d("3438283723052D1912")),
    /* JADX INFO: Fake field, exist only in values array */
    EF450(21, cYh.d("10392F35382D147D7063626A")),
    /* JADX INFO: Fake field, exist only in values array */
    EF479(22, cYh.d("10392F35382D147D7063626B")),
    /* JADX INFO: Fake field, exist only in values array */
    EF508(23, cYh.d("10392F35382D147D70636268")),
    /* JADX INFO: Fake field, exist only in values array */
    EF537(24, cYh.d("10392F35382D147D7063626C")),
    /* JADX INFO: Fake field, exist only in values array */
    EF575(25, cYh.d("3204077C666C2515"), cYh.d("323E2832383E02122836")),
    /* JADX INFO: Fake field, exist only in values array */
    EF604(26, cYh.d("3204077C6F")),
    /* JADX INFO: Fake field, exist only in values array */
    EF637(new int[]{27, 170}, cYh.d("32036C1004192E19")),
    /* JADX INFO: Fake field, exist only in values array */
    EF662(new int[]{28}, new String[0]),
    /* JADX INFO: Fake field, exist only in values array */
    EF710(29, cYh.d("201273626668"), cYh.d("2205020E1414"), cYh.d("20120A")),
    /* JADX INFO: Fake field, exist only in values array */
    EF740(30, cYh.d("2205027C1C08"));

    private static final Map<Integer, EnumC0233c> e = new HashMap();
    private static final Map<String, EnumC0233c> f = new HashMap();
    private final int[] c;
    private final String[] d;

    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.s.c>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.s.c>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.HashMap, java.util.Map<java.lang.Integer, com.github.catvod.spider.merge.s.c>] */
    static {
        for (EnumC0233c enumC0233c : values()) {
            for (int i : enumC0233c.c) {
                e.put(Integer.valueOf(i), enumC0233c);
            }
            f.put(enumC0233c.name(), enumC0233c);
            for (String str : enumC0233c.d) {
                f.put(str, enumC0233c);
            }
        }
    }

    EnumC0233c(int i, String... strArr) {
        this.c = new int[]{i};
        this.d = strArr;
    }

    EnumC0233c(int[] iArr, String... strArr) {
        this.c = iArr;
        this.d = strArr;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.s.c>, java.util.HashMap] */
    public static EnumC0233c a(String str) {
        return (EnumC0233c) f.get(str);
    }

    public final int b() {
        return this.c[0];
    }
}
