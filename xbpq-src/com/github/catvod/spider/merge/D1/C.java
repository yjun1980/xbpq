/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D1;

import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.K1.d;
import com.github.catvod.spider.merge.K1.i;
import com.github.catvod.spider.merge.K1.o;
import com.github.catvod.spider.merge.e.a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class C {
    private static final Pattern[] a = new Pattern[]{Pattern.compile("\\b(?:[a-zA-Z0-9_$]+)&&\\((?:[a-zA-Z0-9_$]+)=([a-zA-Z0-9_$]{2,})\\((\\d+,)decodeURIComponent\\((?:[a-zA-Z0-9_$]+)\\)\\)"), Pattern.compile("\\b(?:[a-zA-Z0-9_$]+)&&\\((?:[a-zA-Z0-9_$]+)=([a-zA-Z0-9_$]{2,})\\(decodeURIComponent\\((?:[a-zA-Z0-9_$]+)\\)\\)"), Pattern.compile("\\bm=([a-zA-Z0-9$]{2,})\\(decodeURIComponent\\(h\\.s\\)\\)"), Pattern.compile("\\bc&&\\(c=([a-zA-Z0-9$]{2,})\\(decodeURIComponent\\(c\\)\\)"), Pattern.compile("(?:\\b|[^a-zA-Z0-9$])([a-zA-Z0-9$]{2,})\\s*=\\s*function\\(\\s*a\\s*\\)\\s*\\{\\s*a\\s*=\\s*a\\.split\\(\\s*\"\"\\s*\\)"), Pattern.compile("([\\w$]+)\\s*=\\s*function\\((\\w+)\\)\\{\\s*\\2=\\s*\\2\\.split\\(\"\"\\)\\s*;")};
    private static final Pattern b = Pattern.compile("(var [A-z]=['\"].*['\"].split\\(\"[;{]\"\\))");
    private static final Pattern c = Pattern.compile("[;,]([A-Za-z0-9_$]{2,})\\[..");

    private static String a(String string, String string2) {
        string2 = Pattern.quote(string2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(");
        stringBuilder.append(string2);
        stringBuilder.append("=function\\([a-zA-Z0-9_]+\\)\\{.+?\\})");
        return e.c("var ", d.f(stringBuilder.toString(), string, 1));
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static String b(String object) {
        Object object2;
        String string;
        Object object3;
        try {
            object3 = d.h(a, (String)object);
            string = ((Matcher)object3).group(1);
            int n2 = ((Matcher)object3).groupCount();
            object3 = n2 > 1 ? ((Matcher)object3).group(2) : "";
            object2 = new i(string, object3);
            string = ((i)object2).a();
        }
        catch (o o2) {
            object = new com.github.catvod.spider.merge.n1.i("Could not find deobfuscation function with any of the known patterns", o2);
            throw object;
        }
        object2 = (String)((i)object2).b();
        {
            CharSequence charSequence;
            String string2;
            block7: {
                catch (Exception exception) {
                    throw new com.github.catvod.spider.merge.n1.i("Could not parse deobfuscation function", exception);
                }
                try {
                    object3 = new StringBuilder();
                    ((StringBuilder)object3).append(string);
                    ((StringBuilder)object3).append("=function");
                    string2 = ((StringBuilder)object3).toString();
                    charSequence = com.github.catvod.spider.merge.e.a.b((String)object, string2);
                    object3 = new StringBuilder();
                    ((StringBuilder)object3).append(string2);
                    ((StringBuilder)object3).append((String)charSequence);
                    object3 = ((StringBuilder)object3).toString();
                    break block7;
                }
                catch (Exception exception) {}
                object3 = C.a((String)object, string);
            }
            d.a((String)object3);
            string2 = d.g(b, (String)object, 1);
            charSequence = Pattern.quote(d.g(c, (String)object3, 1));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("(var ");
            stringBuilder.append((String)charSequence);
            stringBuilder.append("=\\{(?>.|\\n)+?\\}\\};)");
            object = d.f(stringBuilder.toString(), (String)object, 1).replace("\n", "");
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("function deobfuscate(a){return ");
            ((StringBuilder)charSequence).append(string);
            ((StringBuilder)charSequence).append("(");
            ((StringBuilder)charSequence).append((String)object2);
            ((StringBuilder)charSequence).append("a);}");
            string = ((StringBuilder)charSequence).toString();
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(string2);
            ((StringBuilder)object2).append(";");
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append((String)object3);
            ((StringBuilder)object2).append(";");
            ((StringBuilder)object2).append(string);
            return ((StringBuilder)object2).toString();
        }
    }
}

