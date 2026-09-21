package com.github.catvod.spider.merge.e;

import com.github.catvod.spider.merge.cYh;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.e.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0116f implements Comparator<C0113c> {
    private final String a;
    private final String b;

    public C0116f(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static void a(String str, String str2, List<C0113c> list) {
        Collections.sort(list, new C0116f(str, str2));
    }

    @Override // java.util.Comparator
    public final int compare(C0113c c0113c, C0113c c0113c2) {
        char c;
        int compareTo;
        long e;
        long e2;
        C0113c c0113c3 = c0113c;
        C0113c c0113c4 = c0113c2;
        boolean equals = this.b.equals(cYh.d("062322"));
        String str = this.a;
        str.getClass();
        int hashCode = str.hashCode();
        if (hashCode == 3076014) {
            if (str.equals(cYh.d("03313534"))) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 3373707) {
            if (hashCode == 3530753 && str.equals(cYh.d("14393B34"))) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals(cYh.d("09312C34"))) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            compareTo = equals ? c0113c3.b().compareTo(c0113c4.b()) : c0113c4.b().compareTo(c0113c3.b());
        } else {
            if (c != 1) {
                if (c != 2) {
                    return -1;
                }
                if (equals) {
                    e = c0113c3.e();
                    e2 = c0113c4.e();
                } else {
                    e = c0113c4.e();
                    e2 = c0113c3.e();
                }
                return (e > e2 ? 1 : (e == e2 ? 0 : -1));
            }
            compareTo = equals ? c0113c3.c().compareTo(c0113c4.c()) : c0113c4.c().compareTo(c0113c3.c());
        }
        return compareTo;
    }
}
