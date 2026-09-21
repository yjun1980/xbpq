/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D1;

import com.github.catvod.spider.merge.D1.A;
import com.github.catvod.spider.merge.D1.n;
import com.github.catvod.spider.merge.D1.o;
import com.github.catvod.spider.merge.F0.c;
import com.github.catvod.spider.merge.F0.e;
import com.github.catvod.spider.merge.H1.d;
import com.github.catvod.spider.merge.k1.j;
import com.github.catvod.spider.merge.n1.i;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public final class p {
    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static List<j> a(c list222) {
        com.github.catvod.spider.merge.H1.c c2 = com.github.catvod.spider.merge.H1.c.c;
        ArrayList<j> arrayList = new ArrayList<j>();
        for (List list222 : list222) {
            if (!((AbstractMap)((Object)list222)).containsKey("itemSectionRenderer")) continue;
            for (Serializable serializable : ((e)((Object)list222)).g("itemSectionRenderer").b("contents")) {
                Object object;
                Object object2222;
                block28: {
                    Object object3;
                    Object object422;
                    block29: {
                        block26: {
                            block27: {
                                if (!((AbstractMap)((Object)serializable)).containsKey("infoPanelContentRenderer")) break block26;
                                object422 = ((e)serializable).g("infoPanelContentRenderer");
                                object3 = new j();
                                list222 = new StringBuilder();
                                for (Object object2222 : ((e)object422).b("paragraphs")) {
                                    if (((StringBuilder)((Object)list222)).length() != 0) {
                                        ((StringBuilder)((Object)list222)).append("<br>");
                                    }
                                    ((StringBuilder)((Object)list222)).append(A.o((e)object2222, false));
                                }
                                d.b(((StringBuilder)((Object)list222)).toString(), com.github.catvod.spider.merge.H1.c.a);
                                if (((AbstractMap)object422).containsKey("sourceEndpoint")) {
                                    void var0_3;
                                    object2222 = A.r(((e)object422).g("sourceEndpoint"));
                                    try {
                                        object2222 = A.c(object2222);
                                        Objects.requireNonNull(object2222);
                                        list222 = new URL((String)object2222);
                                        ((j)object3).a((URL)((Object)list222));
                                        list222 = "inlineSource";
                                    }
                                    catch (MalformedURLException malformedURLException) {
                                        throw new i("Could not get metadata info URL", (Throwable)var0_3);
                                    }
                                    catch (NullPointerException nullPointerException) {
                                        // empty catch block
                                    }
                                    if (!((AbstractMap)object422).containsKey("inlineSource")) {
                                        list222 = "disclaimer";
                                    }
                                    list222 = A.o(((e)object422).g((String)((Object)list222)), false);
                                    if (com.github.catvod.spider.merge.K1.p.j((String)((Object)list222))) throw new i("Could not get metadata info link text.");
                                    ((j)object3).b((String)((Object)list222));
                                    break block27;
                                    throw new i("Could not get metadata info URL", (Throwable)var0_3);
                                }
                            }
                            arrayList.add((j)object3);
                        }
                        if (!((AbstractMap)((Object)serializable)).containsKey("clarificationRenderer")) break block28;
                        object3 = ((e)serializable).g("clarificationRenderer");
                        object422 = new j();
                        list222 = A.o(((e)object3).g("contentTitle"), false);
                        object2222 = A.o(((e)object3).g("text"), false);
                        if (list222 == null || object2222 == null) throw new i("Could not extract clarification renderer content");
                        new d((String)object2222, c2);
                        if (((AbstractMap)object3).containsKey("actionButton")) {
                            void var0_6;
                            list222 = ((e)object3).g("actionButton").g("buttonRenderer");
                            try {
                                object = A.r(((e)((Object)list222)).g("command"));
                                object = A.c((String)object);
                                Objects.requireNonNull(object);
                                object2222 = new URL((String)object);
                                ((j)object422).a((URL)object2222);
                            }
                            catch (MalformedURLException malformedURLException) {
                                throw new i("Could not get metadata info URL", (Throwable)var0_6);
                            }
                            catch (NullPointerException nullPointerException) {
                                // empty catch block
                            }
                            list222 = A.o(((e)((Object)list222)).g("text"), false);
                            if (com.github.catvod.spider.merge.K1.p.j((String)((Object)list222))) throw new i("Could not get metadata info link text.");
                            ((j)object422).b((String)((Object)list222));
                            break block29;
                            throw new i("Could not get metadata info URL", (Throwable)var0_6);
                        }
                    }
                    if (((AbstractMap)object3).containsKey("secondaryEndpoint") && ((AbstractMap)object3).containsKey("secondarySource") && (list222 = A.r(((e)object3).g("secondaryEndpoint"))) != null && !A.w((String)((Object)list222))) {
                        block25: {
                            try {
                                object2222 = new URL((String)((Object)list222));
                                ((j)object422).a((URL)object2222);
                                object3 = A.o(((e)object3).g("secondarySource"), false);
                                if (object3 == null) break block25;
                                list222 = object3;
                            }
                            catch (MalformedURLException malformedURLException) {
                                throw new i("Could not get metadata info secondary URL", malformedURLException);
                            }
                        }
                        ((j)object422).b((String)((Object)list222));
                    }
                    arrayList.add((j)object422);
                }
                if (!((AbstractMap)((Object)serializable)).containsKey("emergencyOneboxRenderer")) continue;
                list222 = ((AbstractMap)((e)serializable).g("emergencyOneboxRenderer")).values().stream().filter(o.a).map(n.a).collect(Collectors.toList());
                if (list222.isEmpty()) throw new i("Could not extract any meta info from emergency renderer");
                for (Object object422 : list222) {
                    serializable = new j();
                    A.p(((e)object422).g("title"), "title");
                    if (((AbstractMap)object422).containsKey("actionText")) {
                        list222 = com.github.catvod.spider.merge.B.e.c("\n", A.p(((e)object422).g("actionText"), "action"));
                    } else if (((AbstractMap)object422).containsKey("contacts")) {
                        object2222 = ((e)object422).b("contacts");
                        list222 = new StringBuilder();
                        for (int i2 = 0; i2 < ((AbstractCollection)object2222).size(); ++i2) {
                            ((StringBuilder)((Object)list222)).append("\n");
                            ((StringBuilder)((Object)list222)).append(A.p(((c)object2222).a(i2).g("actionText"), "contacts.actionText"));
                        }
                        list222 = ((StringBuilder)((Object)list222)).toString();
                    } else {
                        list222 = "";
                    }
                    object = A.p(((e)object422).g("detailsText"), "details");
                    object2222 = A.p(((e)object422).g("navigationText"), "urlText");
                    new d(com.github.catvod.spider.merge.B.e.c((String)object, (String)((Object)list222)), c2);
                    ((j)serializable).b((String)object2222);
                    object422 = A.r(((e)object422).g("navigationEndpoint"));
                    if (object422 == null) throw new i("Could not extract emergency renderer url");
                    try {
                        list222 = new URL(com.github.catvod.spider.merge.K1.p.p((String)object422));
                        ((j)serializable).a((URL)((Object)list222));
                        arrayList.add((j)serializable);
                    }
                    catch (MalformedURLException malformedURLException) {
                        throw new i("Could not parse emergency renderer url", malformedURLException);
                    }
                }
            }
        }
        return arrayList;
    }
}

