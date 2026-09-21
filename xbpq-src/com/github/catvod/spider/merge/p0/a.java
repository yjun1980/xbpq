/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.p0;

import com.github.catvod.spider.merge.p0.b;
import com.github.catvod.spider.merge.p0.c;
import com.github.catvod.spider.merge.p0.d;
import com.github.catvod.spider.merge.p0.e;
import com.github.catvod.spider.merge.p0.f;
import com.github.catvod.spider.merge.p0.g;
import com.github.catvod.spider.merge.p0.h;
import com.github.catvod.spider.merge.p0.i;
import com.github.catvod.spider.merge.p0.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a
implements c {
    private static final String[] e = new String[]{"\\b[cs]\\s*&&\\s*[adf]\\.set\\([^,]+\\s*,\\s*encodeURIComponent\\s*\\(\\s*([a-zA-Z0-9$]+)\\(", "\\b[a-zA-Z0-9]+\\s*&&\\s*[a-zA-Z0-9]+\\.set\\([^,]+\\s*,\\s*encodeURIComponent\\s*\\(\\s*([a-zA-Z0-9$]+)\\(", "(?:\\b|[^a-zA-Z0-9$])([a-zA-Z0-9$]{2})\\s*=\\s*function\\(\\s*a\\s*\\)\\s*\\{\\s*a\\s*=\\s*a\\.split\\(\\s*\"\"\\s*\\)", "([a-zA-Z0-9$]+)\\s*=\\s*function\\(\\s*a\\s*\\)\\s*\\{\\s*a\\s*=\\s*a\\.split\\(\\s*\"\"\\s*\\)", "([\"'])signature\\1\\s*,\\s*([a-zA-Z0-9$]+)\\(", "\\.sig\\|\\|([a-zA-Z0-9$]+)\\(", "yt\\.akamaized\\.net/\\)\\s*\\|\\|\\s*.*?\\s*[cs]\\s*&&\\s*[adf]\\.set\\([^,]+\\s*,\\s*(?:encodeURIComponent\\s*\\()?\\s*()$", "\\b[cs]\\s*&&\\s*[adf]\\.set\\([^,]+\\s*,\\s*([a-zA-Z0-9$]+)\\(", "\\b[a-zA-Z0-9]+\\s*&&\\s*[a-zA-Z0-9]+\\.set\\([^,]+\\s*,\\s*([a-zA-Z0-9$]+)\\(", "\\bc\\s*&&\\s*a\\.set\\([^,]+\\s*,\\s*\\([^)]*\\)\\s*\\(\\s*([a-zA-Z0-9$]+)\\(", "\\bc\\s*&&\\s*[a-zA-Z0-9]+\\.set\\([^,]+\\s*,\\s*\\([^)]*\\)\\s*\\(\\s*([a-zA-Z0-9$]+)\\("};
    private static final Pattern[] f = new Pattern[]{Pattern.compile("\\w+\\.(\\w+)\\(\\w,(\\d+)\\)"), Pattern.compile("\\w+\\[(\\\"\\w+\\\")\\]\\(\\w,(\\d+)\\)")};
    private com.github.catvod.spider.merge.q0.a a;
    private List<Pattern> b = new ArrayList<Pattern>();
    private Map<Pattern, d> c = new HashMap<Pattern, d>();
    private Map<String, b> d = new HashMap<String, b>();

    public a(com.github.catvod.spider.merge.q0.a object) {
        this.a = object;
        object = e;
        for (int i2 = 0; i2 < 11; ++i2) {
            String string = object[i2];
            int n2 = ((ArrayList)this.b).size();
            ((ArrayList)this.b).add(n2, Pattern.compile(string));
        }
        this.a("\\{\\w\\.reverse\\(\\)\\}", new g());
        this.a("\\{\\w\\.splice\\(0,\\w\\)\\}", new h());
        this.a("\\{var\\s\\w=\\w\\[0];\\w\\[0]=\\w\\[\\w%\\w.length];\\w\\[\\w]=\\w\\}", new i());
        object = new j();
        this.a("\\{var\\s\\w=\\w\\[0];\\w\\[0]=\\w\\[\\w%\\w.length];\\w\\[\\w%\\w.length]=\\w\\}", (d)object);
        this.a("function\\(\\w+,\\w+\\)\\{var\\s\\w=\\w\\[0];\\w\\[0]=\\w\\[\\w%\\w.length];\\w\\[\\w%\\w.length]=\\w\\}", (d)object);
    }

    public final void a(String string, d d2) {
        ((HashMap)this.c).put(Pattern.compile(string), d2);
    }

    public final b b(String string) {
        Object object;
        block11: {
            Object object2 = (b)((HashMap)this.d).get(string);
            object = object2;
            if (object2 == null) {
                object = (com.github.catvod.spider.merge.s0.c)this.a.b(new com.github.catvod.spider.merge.r0.h(string));
                if (((com.github.catvod.spider.merge.s0.c)object).f()) {
                    Object object3 = (String)((com.github.catvod.spider.merge.s0.c)object).a();
                    object = ((ArrayList)this.b).iterator();
                    while (object.hasNext()) {
                        object2 = ((Pattern)object.next()).matcher((CharSequence)object3);
                        if (!object2.find()) continue;
                        object2 = object2.group(1).replaceAll("[^$A-Za-z0-9_]", "");
                        object = new StringBuilder();
                        ((StringBuilder)object).append(Pattern.quote((String)object2));
                        ((StringBuilder)object).append("=function\\(\\w\\)\\{[a-z=\\.\\(\\\"\\)]*;(.*);(?:.+)\\}");
                        object = Pattern.compile(((StringBuilder)object).toString()).matcher((CharSequence)object3);
                        if (((Matcher)object).find()) {
                            Object object4;
                            object = ((Matcher)object).group(1).split(";");
                            ArrayList<f> arrayList = new ArrayList<f>(((String[])object).length);
                            block1: for (String string2 : object) {
                                object2 = f;
                                int n2 = ((Pattern[])object2).length;
                                for (int i2 = 0; i2 < n2; ++i2) {
                                    object4 = object2[i2].matcher(string2);
                                    if (!((Matcher)object4).find()) continue;
                                    String[] stringArray = string2.split("\\.");
                                    if (stringArray.length > 1) {
                                        object2 = stringArray[0];
                                    } else {
                                        String[] stringArray2 = string2.split("\\[");
                                        if (stringArray2.length <= 1) continue;
                                        object2 = stringArray2[0];
                                    }
                                    arrayList.add(new f((String)object2, ((Matcher)object4).group(1), ((Matcher)object4).group(2)));
                                    continue block1;
                                }
                                throw new com.github.catvod.spider.merge.n0.f("Could not parse js function");
                            }
                            object = Pattern.compile(String.format("var %s=\\{(.*?)\\};", Pattern.quote(((f)arrayList.get(0)).c().replaceAll("[^$A-Za-z0-9_]", ""))), 32).matcher((CharSequence)object3);
                            if (((Matcher)object).find()) {
                                object2 = ((Matcher)object).group(1).replaceAll("\n", " ").split(", ");
                                object3 = new HashMap();
                                int n3 = ((Object[])object2).length;
                                block3: for (int i4 = 0; i4 < n3; ++i4) {
                                    String string2;
                                    object4 = ((String)object2[i4]).split(":", 2);
                                    object = object4[0];
                                    string2 = object4[1];
                                    for (Map.Entry entry : ((HashMap)this.c).entrySet()) {
                                        if (!((Pattern)entry.getKey()).matcher(string2).find()) continue;
                                        ((HashMap)object3).put(object, (d)entry.getValue());
                                        continue block3;
                                    }
                                    throw new com.github.catvod.spider.merge.n0.f("Map function not found");
                                }
                                object = new e(arrayList, (Map<String, d>)object3);
                                ((HashMap)this.d).put(string, (b)object);
                                break block11;
                            }
                            throw new com.github.catvod.spider.merge.n0.f("Transform object not found");
                        }
                        throw new com.github.catvod.spider.merge.n0.f("Transformation functions not found");
                    }
                    throw new com.github.catvod.spider.merge.n0.f("Initial function name not found");
                }
                throw new com.github.catvod.spider.merge.n0.g(String.format("Could not load url: %s, exception: %s", string, ((com.github.catvod.spider.merge.s0.c)object).c().getMessage()));
            }
        }
        return object;
    }
}

