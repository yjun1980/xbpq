/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 */
package com.github.catvod.spider.merge.D0;

import com.github.catvod.spider.merge.D0.a;
import com.github.catvod.spider.merge.D0.b;
import com.github.catvod.spider.merge.D0.c;
import com.github.catvod.spider.merge.D0.d;
import com.github.catvod.spider.merge.D0.e;
import com.github.catvod.spider.merge.D0.f;
import com.github.catvod.spider.merge.D0.g;
import com.github.catvod.spider.merge.D0.h;
import com.github.catvod.spider.merge.D0.i;
import com.github.catvod.spider.merge.I.s;
import java.io.PrintStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Scanner;
import org.json.JSONException;

public final class j {
    private final com.github.catvod.spider.merge.n0.c a;
    private final com.github.catvod.spider.merge.q0.a b;
    private final com.github.catvod.spider.merge.t0.a c;
    private final com.github.catvod.spider.merge.p0.c d;

    public j(com.github.catvod.spider.merge.n0.c c2, com.github.catvod.spider.merge.q0.a a2, com.github.catvod.spider.merge.t0.a a3, com.github.catvod.spider.merge.p0.c c3) {
        this.a = c2;
        this.b = a2;
        this.c = a3;
        this.d = c3;
    }

    public static /* synthetic */ Optional a(com.github.catvod.spider.merge.y.b b2) {
        return b2.stream().filter(g.a).findFirst();
    }

    private com.github.catvod.spider.merge.w0.c b(com.github.catvod.spider.merge.y.b a2, String string) {
        if (((com.github.catvod.spider.merge.y.b)a2).size() > 1 && ((com.github.catvod.spider.merge.y.b)a2).p(1).containsKey("continuationItemRenderer")) {
            a2 = ((com.github.catvod.spider.merge.y.b)a2).p(1).u("continuationItemRenderer").u("continuationEndpoint");
            return new com.github.catvod.spider.merge.w0.c(((com.github.catvod.spider.merge.y.e)a2).u("continuationCommand").x("token"), string, ((com.github.catvod.spider.merge.y.e)a2).x("clickTrackingParams"));
        }
        return null;
    }

    private void c(String object, String object2, List<com.github.catvod.spider.merge.v0.c> list, String string) {
        com.github.catvod.spider.merge.y.e e2 = new com.github.catvod.spider.merge.y.e();
        com.github.catvod.spider.merge.y.e e3 = new com.github.catvod.spider.merge.y.e();
        com.github.catvod.spider.merge.y.e e4 = new com.github.catvod.spider.merge.y.e();
        e4.o("clientName", "WEB");
        e4.o("clientVersion", "2.20201021.03.00");
        e3.o("client", e4);
        e2.o("context", e3);
        e2.o("continuation", object);
        object = new com.github.catvod.spider.merge.y.e();
        ((com.github.catvod.spider.merge.y.e)object).o("clickTrackingParams", object2);
        e2.o("clickTracking", object);
        object = new com.github.catvod.spider.merge.r0.h("https://www.youtube.com/youtubei/v1/browse?key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8", "POST", e2.a());
        ((com.github.catvod.spider.merge.r0.a)object).b("X-YouTube-Client-Name", "1");
        ((com.github.catvod.spider.merge.r0.a)object).b("X-YouTube-Client-Version", string);
        ((com.github.catvod.spider.merge.r0.a)object).b("Content-Type", "application/json");
        object = (com.github.catvod.spider.merge.s0.c)this.b.b((com.github.catvod.spider.merge.r0.h)object);
        if (((com.github.catvod.spider.merge.s0.c)object).f()) {
            block6: {
                object = (String)((com.github.catvod.spider.merge.s0.c)object).a();
                object = com.github.catvod.spider.merge.y.a.i((String)object);
                if (!((com.github.catvod.spider.merge.y.e)object).containsKey("continuationContents")) break block6;
                object2 = ((com.github.catvod.spider.merge.y.e)object).u("continuationContents");
                object = "playlistVideoListContinuation";
            }
            object2 = ((com.github.catvod.spider.merge.y.e)object).t("onResponseReceivedActions").p(0);
            object = "appendContinuationItemsAction";
            try {
                this.v(((com.github.catvod.spider.merge.y.e)object2).u((String)object), list, string);
                return;
            }
            catch (Exception exception) {
                throw new com.github.catvod.spider.merge.n0.e("Could not parse playlist continuation json");
            }
            catch (com.github.catvod.spider.merge.n0.h h2) {
                throw h2;
            }
        }
        throw new com.github.catvod.spider.merge.n0.g(String.format("Could not load url: %s, exception: %s", "https://www.youtube.com/youtubei/v1/browse?key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8", ((com.github.catvod.spider.merge.s0.c)object).c().getMessage()));
    }

    private List<com.github.catvod.spider.merge.z0.a> d(com.github.catvod.spider.merge.y.e a2) {
        if (!((com.github.catvod.spider.merge.y.e)a2).containsKey("captions")) {
            return Collections.emptyList();
        }
        if ((a2 = ((com.github.catvod.spider.merge.y.e)a2).u("captions").u("playerCaptionsTracklistRenderer")) != null && !((com.github.catvod.spider.merge.y.e)a2).isEmpty()) {
            if ((a2 = ((com.github.catvod.spider.merge.y.e)a2).t("captionTracks")) != null && !((com.github.catvod.spider.merge.y.b)a2).isEmpty()) {
                ArrayList<com.github.catvod.spider.merge.z0.a> arrayList = new ArrayList<com.github.catvod.spider.merge.z0.a>();
                for (int i2 = 0; i2 < ((com.github.catvod.spider.merge.y.b)a2).size(); ++i2) {
                    Object object = ((com.github.catvod.spider.merge.y.b)a2).p(i2);
                    String string = ((com.github.catvod.spider.merge.y.e)object).x("languageCode");
                    String string2 = ((com.github.catvod.spider.merge.y.e)object).x("baseUrl");
                    object = ((com.github.catvod.spider.merge.y.e)object).x("vssId");
                    if (string == null || string2 == null || object == null) continue;
                    ((String)object).startsWith("a.");
                    arrayList.add(new com.github.catvod.spider.merge.z0.a(string2));
                }
                return arrayList;
            }
            return Collections.emptyList();
        }
        return Collections.emptyList();
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    private com.github.catvod.spider.merge.v0.b f(String object) {
        Object object2;
        block5: {
            block3: {
                block4: {
                    if (((String)object).length() != 24 || !((String)object).startsWith("UC")) break block4;
                    StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("UU");
                    stringBuilder.append(((String)object).substring(2));
                    object = stringBuilder.toString();
                    break block3;
                }
                object2 = s.a("https://www.youtube.com/c/", (String)object, "/videos?view=57");
                if (!((com.github.catvod.spider.merge.s0.c)(object = (com.github.catvod.spider.merge.s0.c)this.b.b(new com.github.catvod.spider.merge.r0.h((String)object2)))).f()) break block5;
                object2 = new Scanner((String)((com.github.catvod.spider.merge.s0.c)object).a());
                ((Scanner)object2).useDelimiter("list=");
                while (((Scanner)object2).hasNext()) {
                    object = ((Scanner)object2).next();
                    if (!((String)object).startsWith("UU")) continue;
                    object = ((String)object).substring(0, 24);
                    break block3;
                }
                object = null;
            }
            if (object != null) {
                return this.k((String)object);
            }
            throw new com.github.catvod.spider.merge.n0.e("Upload Playlist not found");
        }
        throw new com.github.catvod.spider.merge.n0.g(String.format("Could not load url: %s, exception: %s", object2, ((com.github.catvod.spider.merge.s0.c)object).c().getMessage()));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private com.github.catvod.spider.merge.B0.c g(com.github.catvod.spider.merge.y.e e2, String charSequence, com.github.catvod.spider.merge.B0.e e3, boolean bl, String string) {
        int n2;
        int n3;
        boolean bl2 = e2.containsKey("signatureCipher");
        int n4 = 1;
        if (bl2) {
            Object object;
            Object object2 = new com.github.catvod.spider.merge.y.e();
            Object object3 = e2.x("signatureCipher").replace("\\u0026", "&").split("&");
            n3 = ((String[])object3).length;
            for (n2 = 0; n2 < n3; ++n2) {
                object = object3[n2].split("=");
                ((com.github.catvod.spider.merge.y.e)object2).y(object[0], object[1]);
            }
            if (!((com.github.catvod.spider.merge.y.e)object2).containsKey("url")) throw new com.github.catvod.spider.merge.n0.e("Could not found url in cipher data");
            object = ((com.github.catvod.spider.merge.y.e)object2).x("url");
            try {
                object3 = URLDecoder.decode((String)object, "UTF-8");
                object = object3;
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                unsupportedEncodingException.printStackTrace();
            }
            if (!((String)object).contains("signature") && (((com.github.catvod.spider.merge.y.e)object2).containsKey("s") || !((String)object).contains("&sig=") && !((String)object).contains("&lsig="))) {
                if (charSequence == null) throw new com.github.catvod.spider.merge.n0.e("deciphering is required but no js url");
                object3 = ((com.github.catvod.spider.merge.y.e)object2).x("s");
                try {
                    object2 = URLDecoder.decode((String)object3, "UTF-8");
                    object3 = object2;
                }
                catch (UnsupportedEncodingException unsupportedEncodingException) {
                    unsupportedEncodingException.printStackTrace();
                }
                object3 = ((com.github.catvod.spider.merge.p0.a)this.d).b((String)charSequence).a((String)object3);
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append((String)object);
                ((StringBuilder)charSequence).append("&sig=");
                ((StringBuilder)charSequence).append((String)object3);
                e2.y("url", ((StringBuilder)charSequence).toString());
            }
        }
        n2 = !(e3.h() || e2.containsKey("size") || e2.containsKey("width")) ? 0 : 1;
        n3 = n4;
        if (!e3.e()) {
            n3 = e2.containsKey("audioQuality") ? n4 : 0;
        }
        if (n2 != 0 && n3 != 0) {
            return new com.github.catvod.spider.merge.B0.g(e2, bl, string);
        }
        if (n2 == 0) return new com.github.catvod.spider.merge.B0.a(e2, bl, string);
        return new com.github.catvod.spider.merge.B0.f(e2, bl, string);
    }

    private List<com.github.catvod.spider.merge.B0.c> h(com.github.catvod.spider.merge.y.e a2, String string, String string2) {
        if (((com.github.catvod.spider.merge.y.e)a2).containsKey("streamingData")) {
            Cloneable cloneable = ((com.github.catvod.spider.merge.y.e)a2).u("streamingData");
            com.github.catvod.spider.merge.y.b b2 = new com.github.catvod.spider.merge.y.b();
            if (cloneable.containsKey("formats")) {
                b2.addAll((Collection<?>)cloneable.t("formats"));
            }
            a2 = new com.github.catvod.spider.merge.y.b();
            if (cloneable.containsKey("adaptiveFormats")) {
                ((com.github.catvod.spider.merge.y.b)a2).addAll((Collection<?>)cloneable.t("adaptiveFormats"));
            }
            int n2 = b2.size();
            cloneable = new ArrayList(((com.github.catvod.spider.merge.y.b)a2).size() + n2);
            this.u((List<com.github.catvod.spider.merge.B0.c>)((Object)cloneable), b2, string, false, string2);
            this.u((List<com.github.catvod.spider.merge.B0.c>)((Object)cloneable), (com.github.catvod.spider.merge.y.b)a2, string, true, string2);
            return cloneable;
        }
        throw new com.github.catvod.spider.merge.n0.e("streamingData not found");
    }

    private com.github.catvod.spider.merge.w0.d i(String object) {
        Object object2 = (com.github.catvod.spider.merge.s0.c)this.b.b(new com.github.catvod.spider.merge.r0.h((String)object));
        if (((com.github.catvod.spider.merge.s0.c)object2).f()) {
            com.github.catvod.spider.merge.t0.a a2;
            object = (String)((com.github.catvod.spider.merge.s0.c)object2).a();
            object2 = ((com.github.catvod.spider.merge.t0.b)this.c).b((String)object);
            try {
                object = ((com.github.catvod.spider.merge.y.e)object2).u("contents").u("twoColumnSearchResultsRenderer").u("primaryContents").u("sectionListRenderer").t("contents");
                a2 = this.c;
            }
            catch (NullPointerException nullPointerException) {
                throw new com.github.catvod.spider.merge.n0.e("Search result root contents not found");
            }
            String string = ((com.github.catvod.spider.merge.y.e)object2).x("estimatedResults");
            long l2 = ((com.github.catvod.spider.merge.t0.b)a2).e(string);
            a2 = this.c;
            object2 = ((com.github.catvod.spider.merge.y.e)object2).u("responseContext");
            return this.p(l2, (com.github.catvod.spider.merge.y.b)object, this.b((com.github.catvod.spider.merge.y.b)object, ((com.github.catvod.spider.merge.t0.b)a2).a((com.github.catvod.spider.merge.y.e)object2)));
        }
        throw new com.github.catvod.spider.merge.n0.g(String.format("Could not load url: %s, exception: %s", object, ((com.github.catvod.spider.merge.s0.c)object2).c().getMessage()));
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    private com.github.catvod.spider.merge.v0.b k(String object) {
        Object object2 = com.github.catvod.spider.merge.B.e.c("https://www.youtube.com/playlist?list=", (String)object);
        if (((com.github.catvod.spider.merge.s0.c)(object = (com.github.catvod.spider.merge.s0.c)this.b.b(new com.github.catvod.spider.merge.r0.h((String)object2)))).f()) {
            block7: {
                object = (String)((com.github.catvod.spider.merge.s0.c)object).a();
                object2 = ((com.github.catvod.spider.merge.t0.b)this.c).b((String)object);
                if (!((com.github.catvod.spider.merge.y.e)object2).containsKey("metadata")) break block7;
                String string = ((com.github.catvod.spider.merge.y.e)object2).u("metadata").u("playlistMetadataRenderer").x("title");
                Object object3 = ((com.github.catvod.spider.merge.y.e)object2).u("sidebar").u("playlistSidebarRenderer").t("items");
                try {
                    object = ((com.github.catvod.spider.merge.y.b)object3).p(1).u("playlistSidebarSecondaryInfoRenderer").u("videoOwner").u("videoOwnerRenderer").u("title").t("runs").p(0).x("text");
                }
                catch (Exception exception) {
                    object = null;
                }
                object3 = ((com.github.catvod.spider.merge.y.b)object3).p(0).u("playlistSidebarPrimaryInfoRenderer").t("stats");
                com.github.catvod.spider.merge.t0.a a2 = this.c;
                Object object4 = ((com.github.catvod.spider.merge.y.b)object3).p(0).t("runs").p(0).x("text");
                int n2 = ((com.github.catvod.spider.merge.t0.b)a2).c((String)object4);
                object4 = this.c;
                object3 = ((com.github.catvod.spider.merge.y.b)object3).p(1).x("simpleText");
                ((com.github.catvod.spider.merge.t0.b)object4).e((String)object3);
                object = new com.github.catvod.spider.merge.v0.a(string, (String)object, n2);
                object2 = this.l((com.github.catvod.spider.merge.y.e)object2, ((com.github.catvod.spider.merge.v0.a)object).c());
                return new com.github.catvod.spider.merge.v0.b((com.github.catvod.spider.merge.v0.a)object, (List<com.github.catvod.spider.merge.v0.c>)object2);
            }
            throw new com.github.catvod.spider.merge.n0.e("Invalid initial data json");
        }
        throw new com.github.catvod.spider.merge.n0.g(String.format("Could not load url: %s, exception: %s", object2, ((com.github.catvod.spider.merge.s0.c)object).c().getMessage()));
    }

    private List<com.github.catvod.spider.merge.v0.c> l(com.github.catvod.spider.merge.y.e e2, int n2) {
        AbstractList abstractList;
        com.github.catvod.spider.merge.y.e e3;
        try {
            e3 = e2.u("contents").u("twoColumnBrowseResultsRenderer").t("tabs").p(0).u("tabRenderer").u("content").u("sectionListRenderer").t("contents").p(0).u("itemSectionRenderer").t("contents").p(0).u("playlistVideoListRenderer");
            abstractList = n2 > 0 ? new ArrayList(n2) : new LinkedList();
        }
        catch (NullPointerException nullPointerException) {
            throw new com.github.catvod.spider.merge.n0.e("Playlist initial data not found");
        }
        e2 = e2.u("responseContext");
        this.v(e3, abstractList, ((com.github.catvod.spider.merge.t0.b)this.c).a(e2));
        return abstractList;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    private com.github.catvod.spider.merge.w0.d n(com.github.catvod.spider.merge.w0.c object) {
        Object object2 = new com.github.catvod.spider.merge.y.e();
        com.github.catvod.spider.merge.y.a a2 = new com.github.catvod.spider.merge.y.e();
        Object object3 = new com.github.catvod.spider.merge.y.e();
        ((com.github.catvod.spider.merge.y.e)object3).o("clientName", "WEB");
        ((com.github.catvod.spider.merge.y.e)object3).o("clientVersion", "2.20201021.03.00");
        a2.o("client", object3);
        ((com.github.catvod.spider.merge.y.e)object2).o("context", a2);
        ((com.github.catvod.spider.merge.y.e)object2).o("continuation", ((com.github.catvod.spider.merge.w0.c)object).c());
        a2 = new com.github.catvod.spider.merge.y.e();
        a2.o("clickTrackingParams", ((com.github.catvod.spider.merge.w0.c)object).a());
        ((com.github.catvod.spider.merge.y.e)object2).o("clickTracking", a2);
        object2 = new com.github.catvod.spider.merge.r0.h("https://www.youtube.com/youtubei/v1/search?key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8&prettyPrint=false", "POST", ((com.github.catvod.spider.merge.y.a)object2).a());
        ((com.github.catvod.spider.merge.r0.a)object2).b("X-YouTube-Client-Name", "1");
        ((com.github.catvod.spider.merge.r0.a)object2).b("X-YouTube-Client-Version", ((com.github.catvod.spider.merge.w0.c)object).b());
        ((com.github.catvod.spider.merge.r0.a)object2).b("Content-Type", "application/json");
        object2 = (com.github.catvod.spider.merge.s0.c)this.b.b((com.github.catvod.spider.merge.r0.h)object2);
        if (((com.github.catvod.spider.merge.s0.c)object2).f()) {
            block5: {
                object2 = (String)((com.github.catvod.spider.merge.s0.c)object2).a();
                object3 = com.github.catvod.spider.merge.y.a.i((String)object2);
                if (!((com.github.catvod.spider.merge.y.e)object3).containsKey("onResponseReceivedCommands")) break block5;
                a2 = ((com.github.catvod.spider.merge.y.e)object3).t("onResponseReceivedCommands").p(0).u("appendContinuationItemsAction").t("continuationItems");
                object2 = this.c;
                object3 = ((com.github.catvod.spider.merge.y.e)object3).x("estimatedResults");
                return this.p(((com.github.catvod.spider.merge.t0.b)object2).e((String)object3), (com.github.catvod.spider.merge.y.b)a2, this.b((com.github.catvod.spider.merge.y.b)a2, ((com.github.catvod.spider.merge.w0.c)object).b()));
            }
            try {
                object = new com.github.catvod.spider.merge.n0.e("Could not find continuation data");
                throw object;
            }
            catch (Exception exception) {
                throw new com.github.catvod.spider.merge.n0.e("Could not parse search continuation json");
            }
            catch (com.github.catvod.spider.merge.n0.h h2) {
                throw h2;
            }
        }
        throw new com.github.catvod.spider.merge.n0.g(String.format("Could not load url: %s, exception: %s", "https://www.youtube.com/youtubei/v1/search?key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8&prettyPrint=false", ((com.github.catvod.spider.merge.s0.c)object2).c().getMessage()));
    }

    private com.github.catvod.spider.merge.w0.d p(long l2, com.github.catvod.spider.merge.y.b object, com.github.catvod.spider.merge.w0.c c2) {
        com.github.catvod.spider.merge.y.b b2;
        try {
            b2 = ((com.github.catvod.spider.merge.y.b)object).p(0).u("itemSectionRenderer").t("contents");
        }
        catch (NullPointerException nullPointerException) {
            throw new com.github.catvod.spider.merge.n0.e("Search result contents not found");
        }
        ArrayList<com.github.catvod.spider.merge.w0.g> arrayList = new ArrayList<com.github.catvod.spider.merge.w0.g>(b2.size());
        HashMap<com.github.catvod.spider.merge.y0.c, com.github.catvod.spider.merge.y0.b> hashMap = new HashMap<com.github.catvod.spider.merge.y0.c, com.github.catvod.spider.merge.y0.b>();
        for (int i2 = 0; i2 < b2.size(); ++i2) {
            com.github.catvod.spider.merge.y.e e2 = b2.p(i2);
            object = e2.keySet().iterator().next();
            Object object2 = e2.u((String)object);
            Objects.requireNonNull(object);
            int n2 = -1;
            switch (((String)object).hashCode()) {
                default: {
                    break;
                }
                case 2018804603: {
                    if (!((String)object).equals("showingResultsForRenderer")) break;
                    n2 = 7;
                    break;
                }
                case 1681382120: {
                    if (!((String)object).equals("didYouMeanRenderer")) break;
                    n2 = 6;
                    break;
                }
                case 481670163: {
                    if (!((String)object).equals("movieRenderer")) break;
                    n2 = 5;
                    break;
                }
                case 208942261: {
                    if (!((String)object).equals("playlistRenderer")) break;
                    n2 = 4;
                    break;
                }
                case 199047437: {
                    if (!((String)object).equals("shelfRenderer")) break;
                    n2 = 3;
                    break;
                }
                case -26775834: {
                    if (!((String)object).equals("channelRenderer")) break;
                    n2 = 2;
                    break;
                }
                case -761721250: {
                    if (!((String)object).equals("videoRenderer")) break;
                    n2 = 1;
                    break;
                }
                case -2010540299: {
                    if (!((String)object).equals("horizontalCardListRenderer")) break;
                    n2 = 0;
                }
            }
            switch (n2) {
                default: {
                    object2 = System.out;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown search result element type ");
                    stringBuilder.append((String)object);
                    ((PrintStream)object2).println(stringBuilder.toString());
                    System.out.println(e2);
                    object = null;
                    break;
                }
                case 7: {
                    object = new com.github.catvod.spider.merge.y0.a((com.github.catvod.spider.merge.y.e)object2);
                    break;
                }
                case 6: {
                    object = new com.github.catvod.spider.merge.y0.f((com.github.catvod.spider.merge.y.e)object2);
                    break;
                }
                case 5: {
                    object = new com.github.catvod.spider.merge.w0.j((com.github.catvod.spider.merge.y.e)object2, true);
                    break;
                }
                case 4: {
                    object = new com.github.catvod.spider.merge.w0.h((com.github.catvod.spider.merge.y.e)object2);
                    break;
                }
                case 3: {
                    object = new com.github.catvod.spider.merge.w0.i((com.github.catvod.spider.merge.y.e)object2);
                    break;
                }
                case 2: {
                    object = new com.github.catvod.spider.merge.w0.e((com.github.catvod.spider.merge.y.e)object2);
                    break;
                }
                case 1: {
                    object = new com.github.catvod.spider.merge.w0.j((com.github.catvod.spider.merge.y.e)object2, false);
                    break;
                }
                case 0: {
                    object = new com.github.catvod.spider.merge.y0.e((com.github.catvod.spider.merge.y.e)object2);
                }
            }
            if (object == null) continue;
            if (object instanceof com.github.catvod.spider.merge.w0.g) {
                arrayList.add((com.github.catvod.spider.merge.w0.g)object);
                continue;
            }
            object = (com.github.catvod.spider.merge.y0.b)object;
            hashMap.put(object.type(), (com.github.catvod.spider.merge.y0.b)object);
        }
        if (c2 == null) {
            return new com.github.catvod.spider.merge.w0.d(arrayList, hashMap);
        }
        return new com.github.catvod.spider.merge.w0.b(l2, arrayList, hashMap, c2);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    private com.github.catvod.spider.merge.w0.d q(String object, String string) {
        String string2;
        try {
            string2 = URLEncoder.encode((String)object, "UTF-8");
            object = string2;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            unsupportedEncodingException.printStackTrace();
        }
        string2 = com.github.catvod.spider.merge.B.e.c("https://www.youtube.com/results?search_query=", (String)object);
        object = string2;
        if (string != null) {
            object = s.a(string2, "&sp=", string);
        }
        object = this.i((String)object);
        return object;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private com.github.catvod.spider.merge.A0.b r(String object) {
        Object object4;
        Object object3;
        Object object2;
        block17: {
            object2 = com.github.catvod.spider.merge.m0.a.a();
            object3 = com.github.catvod.spider.merge.m0.a.c();
            try {
                object2 = com.github.catvod.spider.merge.m0.a.d((String)object2, this.a.b(), object);
            }
            catch (JSONException jSONException) {
                throw new RuntimeException(jSONException);
            }
            object3 = new com.github.catvod.spider.merge.r0.h(String.format("https://youtubei.googleapis.com/youtubei/v1/reel/reel_item_watch?prettyPrint=false&t=%s&id=%s&fields=playerResponse", object3, object), "POST", object2.toString());
            ((com.github.catvod.spider.merge.r0.a)object3).b("User-Agent", "com.google.android.youtube/19.28.35 (Linux; U; Android 15; GB) gzip");
            ((com.github.catvod.spider.merge.r0.a)object3).b("X-Goog-Api-Format-Version", "2");
            ((com.github.catvod.spider.merge.r0.a)object3).b("Content-Type", "application/json");
            ((com.github.catvod.spider.merge.r0.a)object3).b("Accept-Language", "en-GB, en;q=0.9");
            object2 = (com.github.catvod.spider.merge.s0.c)this.b.b((com.github.catvod.spider.merge.r0.h)object3);
            boolean bl = ((com.github.catvod.spider.merge.s0.c)object2).f();
            object3 = null;
            if (bl) {
                block16: {
                    try {
                        object2 = com.github.catvod.spider.merge.y.a.i((String)((com.github.catvod.spider.merge.s0.c)object2).a());
                        object2 = ((com.github.catvod.spider.merge.y.e)object2).u("playerResponse");
                        object3 = this.t((String)((Object)object), (com.github.catvod.spider.merge.y.e)object2);
                        if (!((com.github.catvod.spider.merge.A0.a)object3).j()) break block16;
                        object4 = ((com.github.catvod.spider.merge.t0.b)this.c).a((com.github.catvod.spider.merge.y.e)object2);
                    }
                    catch (Exception exception) {
                        // empty catch block
                        break block17;
                    }
                    object4 = this.h((com.github.catvod.spider.merge.y.e)object2, null, (String)object4);
                    object3 = new com.github.catvod.spider.merge.A0.b((com.github.catvod.spider.merge.A0.a)object3, (List<com.github.catvod.spider.merge.B0.c>)object4, this.d((com.github.catvod.spider.merge.y.e)object2));
                }
                object3 = new com.github.catvod.spider.merge.A0.b((com.github.catvod.spider.merge.A0.a)object3, Collections.<com.github.catvod.spider.merge.B0.c>emptyList(), Collections.<com.github.catvod.spider.merge.z0.a>emptyList());
            }
        }
        object2 = object3;
        if (object3 != null) return object2;
        object3 = com.github.catvod.spider.merge.B.e.c("https://www.youtube.com/watch?v=", object);
        object2 = (com.github.catvod.spider.merge.s0.c)this.b.b(new com.github.catvod.spider.merge.r0.h((String)object3));
        if (!((com.github.catvod.spider.merge.s0.c)object2).f()) {
            throw new com.github.catvod.spider.merge.n0.g(String.format("Could not load url: %s, exception: %s", object3, ((com.github.catvod.spider.merge.s0.c)object2).c().getMessage()));
        }
        object3 = (String)((com.github.catvod.spider.merge.s0.c)object2).a();
        object4 = ((com.github.catvod.spider.merge.t0.b)this.c).f((String)object3);
        object2 = ((com.github.catvod.spider.merge.y.e)object4).u("args").u("player_response");
        if (!((com.github.catvod.spider.merge.y.e)object2).containsKey("streamingData")) {
            if (!((com.github.catvod.spider.merge.y.e)object2).containsKey("videoDetails")) throw new com.github.catvod.spider.merge.n0.e("streamingData and videoDetails not found");
        }
        object3 = this.t((String)((Object)object), (com.github.catvod.spider.merge.y.e)object2);
        if (!((com.github.catvod.spider.merge.A0.a)object3).j()) {
            return new com.github.catvod.spider.merge.A0.b((com.github.catvod.spider.merge.A0.a)object3, Collections.<com.github.catvod.spider.merge.B0.c>emptyList(), Collections.<com.github.catvod.spider.merge.z0.a>emptyList());
        }
        object = ((com.github.catvod.spider.merge.t0.b)this.c).d((com.github.catvod.spider.merge.y.e)object4, (String)((Object)object));
        object4 = ((com.github.catvod.spider.merge.y.e)object4).u("args").u("player_response").u("responseContext");
        object4 = ((com.github.catvod.spider.merge.t0.b)this.c).a((com.github.catvod.spider.merge.y.e)object4);
        object = this.h((com.github.catvod.spider.merge.y.e)object2, (String)((Object)object), (String)object4);
        return new com.github.catvod.spider.merge.A0.b((com.github.catvod.spider.merge.A0.a)object3, object, this.d((com.github.catvod.spider.merge.y.e)object2));
    }

    private com.github.catvod.spider.merge.A0.a t(String object, com.github.catvod.spider.merge.y.e e2) {
        if (!e2.containsKey("videoDetails")) {
            return new com.github.catvod.spider.merge.A0.a((String)object);
        }
        object = e2.u("videoDetails");
        if (((com.github.catvod.spider.merge.y.e)object).p("isLive") && e2.containsKey("streamingData")) {
            e2.u("streamingData").x("hlsManifestUrl");
        }
        return new com.github.catvod.spider.merge.A0.a((com.github.catvod.spider.merge.y.e)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void u(List<com.github.catvod.spider.merge.B0.c> list, com.github.catvod.spider.merge.y.b b2, String string, boolean bl, String string2) {
        int i2 = 0;
        while (true) {
            block9: {
                if (i2 >= b2.size()) {
                    return;
                }
                Serializable serializable = b2.p(i2);
                if (!"FORMAT_STREAM_TYPE_OTF".equals(((com.github.catvod.spider.merge.y.e)serializable).x("type"))) {
                    Object object;
                    int n2 = ((com.github.catvod.spider.merge.y.e)serializable).r("itag");
                    try {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("i");
                        ((StringBuilder)object).append(n2);
                        object = com.github.catvod.spider.merge.B0.e.valueOf(((StringBuilder)object).toString());
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        object = System.err;
                        serializable = new StringBuilder();
                        ((StringBuilder)serializable).append("Error parsing format: unknown itag ");
                        ((StringBuilder)serializable).append(n2);
                        ((PrintStream)object).println(((StringBuilder)serializable).toString());
                        break block9;
                    }
                    try {
                        list.add(this.g((com.github.catvod.spider.merge.y.e)serializable, string, (com.github.catvod.spider.merge.B0.e)((Object)object), bl, string2));
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                    catch (com.github.catvod.spider.merge.n0.h h2) {
                        PrintStream printStream = System.err;
                        object = com.github.catvod.spider.merge.C.a.c("Error ");
                        ((StringBuilder)object).append(h2.getMessage());
                        ((StringBuilder)object).append(" parsing format: ");
                        ((StringBuilder)object).append(serializable);
                        printStream.println(((StringBuilder)object).toString());
                    }
                    catch (com.github.catvod.spider.merge.n0.f f2) {
                        throw f2;
                    }
                }
            }
            ++i2;
        }
    }

    private void v(com.github.catvod.spider.merge.y.e a2, List<com.github.catvod.spider.merge.v0.c> list, String string) {
        block10: {
            int n2;
            Object object;
            block9: {
                if (list.size() > 49) {
                    return;
                }
                object = "contents";
                boolean bl = ((com.github.catvod.spider.merge.y.e)a2).containsKey("contents");
                n2 = 0;
                if (bl) break block9;
                object = "continuationItems";
                if (!((com.github.catvod.spider.merge.y.e)a2).containsKey("continuationItems")) break block10;
            }
            a2 = ((com.github.catvod.spider.merge.y.e)a2).t((String)object);
            while (n2 < ((com.github.catvod.spider.merge.y.b)a2).size()) {
                object = ((com.github.catvod.spider.merge.y.b)a2).p(n2);
                if (((com.github.catvod.spider.merge.y.e)object).containsKey("playlistVideoRenderer")) {
                    list.add(new com.github.catvod.spider.merge.v0.c(((com.github.catvod.spider.merge.y.e)object).u("playlistVideoRenderer")));
                } else if (((com.github.catvod.spider.merge.y.e)object).containsKey("continuationItemRenderer")) {
                    object = (com.github.catvod.spider.merge.y.e)Optional.ofNullable(((com.github.catvod.spider.merge.y.e)object).u("continuationItemRenderer")).map(com.github.catvod.spider.merge.D0.c.a).orElseThrow(i.a);
                    this.c((String)Optional.ofNullable(((com.github.catvod.spider.merge.y.e)object).u("commandExecutorCommand")).map(com.github.catvod.spider.merge.D0.d.a).flatMap(com.github.catvod.spider.merge.D0.a.a).map(com.github.catvod.spider.merge.D0.b.a).map(e.a).map(f.a).orElseThrow(h.a), ((com.github.catvod.spider.merge.y.e)object).x("clickTrackingParams"), list, string);
                }
                ++n2;
            }
            return;
        }
        if (((com.github.catvod.spider.merge.y.e)a2).containsKey("continuations")) {
            a2 = ((com.github.catvod.spider.merge.y.e)a2).t("continuations").p(0).u("nextContinuationData");
            this.c(((com.github.catvod.spider.merge.y.e)a2).x("continuation"), ((com.github.catvod.spider.merge.y.e)a2).x("clickTrackingParams"), list, string);
        }
    }

    public final com.github.catvod.spider.merge.s0.a<com.github.catvod.spider.merge.v0.b> e(com.github.catvod.spider.merge.r0.b object) {
        try {
            object = com.github.catvod.spider.merge.s0.c.d(this.f(((com.github.catvod.spider.merge.r0.b)object).c()));
            return object;
        }
        catch (com.github.catvod.spider.merge.n0.h h2) {
            return com.github.catvod.spider.merge.s0.c.b(h2);
        }
    }

    public final com.github.catvod.spider.merge.s0.a<com.github.catvod.spider.merge.v0.b> j(com.github.catvod.spider.merge.r0.c object) {
        try {
            object = com.github.catvod.spider.merge.s0.c.d(this.k(((com.github.catvod.spider.merge.r0.c)object).c()));
            return object;
        }
        catch (com.github.catvod.spider.merge.n0.h h2) {
            return com.github.catvod.spider.merge.s0.c.b(h2);
        }
    }

    public final com.github.catvod.spider.merge.s0.a<com.github.catvod.spider.merge.w0.d> m(com.github.catvod.spider.merge.r0.d object) {
        try {
            object = com.github.catvod.spider.merge.s0.c.d(this.n(((com.github.catvod.spider.merge.r0.d)object).c()));
            return object;
        }
        catch (com.github.catvod.spider.merge.n0.h h2) {
            return com.github.catvod.spider.merge.s0.c.b(h2);
        }
    }

    public final com.github.catvod.spider.merge.s0.a<com.github.catvod.spider.merge.w0.d> o(com.github.catvod.spider.merge.r0.f object) {
        try {
            object = com.github.catvod.spider.merge.s0.c.d(this.q(((com.github.catvod.spider.merge.r0.f)object).d(), ((com.github.catvod.spider.merge.r0.f)object).c()));
            return object;
        }
        catch (com.github.catvod.spider.merge.n0.h h2) {
            return com.github.catvod.spider.merge.s0.c.b(h2);
        }
    }

    public final com.github.catvod.spider.merge.s0.a<com.github.catvod.spider.merge.A0.b> s(com.github.catvod.spider.merge.r0.g object) {
        try {
            object = com.github.catvod.spider.merge.s0.c.d(this.r(((com.github.catvod.spider.merge.r0.g)object).c()));
            return object;
        }
        catch (com.github.catvod.spider.merge.n0.h h2) {
            return com.github.catvod.spider.merge.s0.c.b(h2);
        }
    }
}

