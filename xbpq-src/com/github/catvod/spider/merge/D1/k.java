/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D1;

import com.github.catvod.spider.merge.B1.a;
import com.github.catvod.spider.merge.D1.A;
import com.github.catvod.spider.merge.D1.e;
import com.github.catvod.spider.merge.D1.f;
import com.github.catvod.spider.merge.D1.g;
import com.github.catvod.spider.merge.D1.h;
import com.github.catvod.spider.merge.D1.i;
import com.github.catvod.spider.merge.D1.j;
import com.github.catvod.spider.merge.I.s;
import com.github.catvod.spider.merge.K1.p;
import com.github.catvod.spider.merge.e1.o;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class k {
    private static final Pattern a = Pattern.compile("(?s)^ +[/\u2022] +(.*?) +$");
    public static final int b = 0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(List list, List list2, com.github.catvod.spider.merge.F0.e object) {
        boolean bl;
        int n2;
        int n3;
        Object object2;
        block4: {
            block5: {
                object2 = ((com.github.catvod.spider.merge.F0.e)object).g("onTap").g("innertubeCommand");
                n3 = ((com.github.catvod.spider.merge.F0.e)object).e("startIndex", -1);
                n2 = ((com.github.catvod.spider.merge.F0.e)object).e("length", 0);
                if (n3 < 0) return;
                boolean bl2 = true;
                if (n2 < 1) return;
                if (object2 == null) {
                    return;
                }
                if ((object2 = A.r((com.github.catvod.spider.merge.F0.e)object2)) == null) {
                    return;
                }
                try {
                    URL uRL = new URL((String)object2);
                    bl = bl2;
                    if (A.B(uRL)) break block4;
                    boolean bl3 = A.A(uRL);
                    if (!bl3) break block5;
                    bl = bl2;
                }
                catch (MalformedURLException malformedURLException) {}
            }
            bl = false;
        }
        object2 = s.a("<a href=\"", o.d((String)object2), "\">");
        object = ((com.github.catvod.spider.merge.F0.e)object).g("onTapOptions").g("accessibilityInfo").i("accessibilityLabel", "").replaceFirst(" Channel Link", "");
        object = !(bl || ((String)object).isEmpty() || ((String)object).startsWith("YouTube: ")) ? new f(object, 0) : g.b;
        list.add(new j((String)object2, "</a>", n3, (Function<String, String>)object));
        list2.add(new j((String)object2, "</a>", n3 + n2, (Function<String, String>)object));
    }

    public static /* synthetic */ String b(String string) {
        Matcher matcher = a.matcher(string);
        if (matcher.find()) {
            string = matcher.group(1);
        }
        return string;
    }

    public static String c(com.github.catvod.spider.merge.F0.e serializable) {
        if (p.l(serializable)) {
            return null;
        }
        String string = ((com.github.catvod.spider.merge.F0.e)serializable).i("content", null);
        if (string == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ((com.github.catvod.spider.merge.F0.e)serializable).b("commandRuns").c().forEach(new a(arrayList, arrayList2));
        ((com.github.catvod.spider.merge.F0.e)serializable).b("styleRuns").c().forEach(new e(arrayList, arrayList2));
        Collections.sort(arrayList, Comparator.comparingInt(h.a));
        Collections.sort(arrayList2, Comparator.comparingInt(i.a));
        string = string.replace('\u00a0', ' ');
        Stack<j> stack = new Stack<j>();
        Stack<j> stack2 = new Stack<j>();
        serializable = new StringBuilder();
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        while (n2 < arrayList2.size()) {
            int n5;
            j j2;
            int n6 = n4 < arrayList.size() ? Math.min(((j)arrayList2.get((int)n2)).c, ((j)arrayList.get((int)n4)).c) : ((j)arrayList2.get((int)n2)).c;
            ((StringBuilder)serializable).append(o.d(string.substring(n3, n6)));
            if (((j)arrayList2.get((int)n2)).c == n6) {
                j j3 = (j)arrayList2.get(n2);
                n3 = n2 + 1;
                while (!stack.empty()) {
                    j2 = (j)stack.pop();
                    if (j2.a.equals(j3.a)) {
                        if (j2.d != null && (n2 = j2.e) >= 0) {
                            ((StringBuilder)serializable).replace(n2, ((StringBuilder)serializable).length(), j2.d.apply(((StringBuilder)serializable).substring(j2.e)));
                        }
                        ((StringBuilder)serializable).append(j2.b);
                        break;
                    }
                    ((StringBuilder)serializable).append(j2.b);
                    stack2.push(j2);
                }
                while (true) {
                    n2 = n3;
                    n5 = n4;
                    if (!stack2.empty()) {
                        j2 = (j)stack2.pop();
                        ((StringBuilder)serializable).append(j2.a);
                        stack.push(j2);
                        continue;
                    }
                    break;
                }
            } else {
                j2 = (j)arrayList.get(n4);
                ((StringBuilder)serializable).append(j2.a);
                j2.e = ((StringBuilder)serializable).length();
                stack.push(j2);
                n5 = n4 + 1;
            }
            n3 = n6;
            n4 = n5;
        }
        ((StringBuilder)serializable).append(o.d(string.substring(n3)));
        return ((StringBuilder)serializable).toString().replace("\n", "<br>").replace("  ", " &nbsp;");
    }
}

