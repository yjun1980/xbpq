/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D1;

import com.github.catvod.spider.merge.K1.d;
import com.github.catvod.spider.merge.K1.o;
import com.github.catvod.spider.merge.e.a;
import com.github.catvod.spider.merge.n1.i;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class E {
    private static final Pattern a = Pattern.compile("[&?]n=([^&]+)");
    private static final Pattern[] b = new Pattern[]{Pattern.compile("([A-Za-z0-9_\\$]{2,})=function.*return [A-Z]\\[\\d+\\]"), Pattern.compile("[a-zA-Z0-9$_]=\"nn\"\\[\\+[a-zA-Z0-9$_]+\\.[a-zA-Z0-9$_]+],[a-zA-Z0-9$_]+\\([a-zA-Z0-9$_]+\\),[a-zA-Z0-9$_]+=[a-zA-Z0-9$_]+\\.[a-zA-Z0-9$_]+\\[[a-zA-Z0-9$_]+]\\|\\|null\\)&&\\([a-zA-Z0-9$_]+=([a-zA-Z0-9$_]+)\\[(\\d+)]"), Pattern.compile("[a-zA-Z0-9$_]=\"nn\"\\[\\+[a-zA-Z0-9$_]+\\.[a-zA-Z0-9$_]+],[a-zA-Z0-9$_]+\\([a-zA-Z0-9$_]+\\),[a-zA-Z0-9$_]+=[a-zA-Z0-9$_]+\\.[a-zA-Z0-9$_]+\\[[a-zA-Z0-9$_]+]\\|\\|null\\).+\\|\\|([a-zA-Z0-9$_]+)\\(\"\"\\)"), Pattern.compile(",[a-zA-Z0-9$_]+\\([a-zA-Z0-9$_]+\\),[a-zA-Z0-9$_]+=[a-zA-Z0-9$_]+\\.[a-zA-Z0-9$_]+\\[[a-zA-Z0-9$_]+]\\|\\|null\\)&&\\(\\b[a-zA-Z0-9$_]+=([a-zA-Z0-9$_]+)\\[(\\d+)]\\([a-zA-Z0-9$_]\\),[a-zA-Z0-9$_]+\\.set\\((?:\"n+\"|[a-zA-Z0-9$_]+),[a-zA-Z0-9$_]+\\)"), Pattern.compile("[a-zA-Z0-9$_]=\"nn\"\\[\\+[a-zA-Z0-9$_]+\\.[a-zA-Z0-9$_]+],[a-zA-Z0-9$_]+=[a-zA-Z0-9$_]+\\.get\\([a-zA-Z0-9$_]+\\)\\).+\\|\\|([a-zA-Z0-9$_]+)\\(\"\"\\)"), Pattern.compile("[a-zA-Z0-9$_]=\"nn\"\\[\\+[a-zA-Z0-9$_]+\\.[a-zA-Z0-9$_]+],[a-zA-Z0-9$_]+=[a-zA-Z0-9$_]+\\.get\\([a-zA-Z0-9$_]+\\)\\)&&\\([a-zA-Z0-9$_]+=([a-zA-Z0-9$_]+)\\[(\\d+)]"), Pattern.compile("\\([a-zA-Z0-9$_]=String\\.fromCharCode\\(110\\),[a-zA-Z0-9$_]=[a-zA-Z0-9$_]\\.get\\([a-zA-Z0-9$_]\\)\\)&&\\([a-zA-Z0-9$_]=([a-zA-Z0-9$_]+)(?:\\[(\\d+)])?\\([a-zA-Z0-9$_]\\)"), Pattern.compile("\\.get\\(\"n\"\\)\\)&&\\([a-zA-Z0-9$_]=([a-zA-Z0-9$_]+)(?:\\[(\\d+)])?\\([a-zA-Z0-9$_]\\)")};

    static String a(String charSequence, String string) {
        CharSequence charSequence2;
        try {
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append(string);
            ((StringBuilder)charSequence2).append("=function");
            String string2 = ((StringBuilder)charSequence2).toString();
            String string3 = com.github.catvod.spider.merge.e.a.b(charSequence, string2);
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append(string2);
            ((StringBuilder)charSequence2).append(string3);
            ((StringBuilder)charSequence2).append(";");
            charSequence2 = ((StringBuilder)charSequence2).toString();
            charSequence = charSequence2;
        }
        catch (Exception exception) {
            charSequence2 = Pattern.quote(string);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)charSequence2);
            stringBuilder.append("=\\s*function([\\S\\s]*?\\}\\s*return [\\w$]+?\\.join\\(\"\"\\)\\s*\\};)");
            charSequence = d.g(Pattern.compile(stringBuilder.toString(), 32), charSequence, 1);
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append("function ");
            ((StringBuilder)charSequence2).append(string);
            ((StringBuilder)charSequence2).append((String)charSequence);
            charSequence = ((StringBuilder)charSequence2).toString();
            d.a(charSequence);
        }
        string = d.f("=\\s*function\\s*\\(\\s*([^)]*)\\s*\\)", charSequence, 1).split(",")[0].trim();
        charSequence2 = new StringBuilder();
        ((StringBuilder)charSequence2).append(";\\s*if\\s*\\(\\s*typeof\\s+[a-zA-Z0-9$_]++\\s*===?\\s*([\"'])undefined\\1\\s*\\)\\s*return\\s+");
        ((StringBuilder)charSequence2).append(string);
        ((StringBuilder)charSequence2).append(";");
        return Pattern.compile(((StringBuilder)charSequence2).toString(), 32).matcher(charSequence).replaceFirst(";");
    }

    static String b(String string) {
        String string2;
        Object object;
        block2: {
            try {
                object = d.h(b, string);
                string2 = ((Matcher)object).group(1);
                if (((Matcher)object).groupCount() != 1) break block2;
                return string2;
            }
            catch (o o2) {
                throw new i("Could not find deobfuscation function with any of the known patterns in the base JavaScript player code", o2);
            }
        }
        int n2 = Integer.parseInt(((Matcher)object).group(2));
        string2 = Pattern.quote(string2);
        object = new StringBuilder();
        ((StringBuilder)object).append("var ");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append("\\s*=\\s*\\[(.+?)][;,]");
        return d.g(Pattern.compile(((StringBuilder)object).toString()), string, 1).split(",")[n2];
    }

    static String c(String string) {
        if (!string.contains("&n=") && !string.contains("?n=")) {
            return null;
        }
        try {
            string = d.g(a, string, 1);
            return string;
        }
        catch (o o2) {
            return null;
        }
    }
}

