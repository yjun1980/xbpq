/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.text.TextUtils
 *  com.github.catvod.crawler.SpiderDebug
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.Youtube;
import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.K.g;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.f0.d;
import com.github.catvod.spider.merge.i0.m;
import com.github.catvod.spider.merge.y.z;
import java.io.File;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public class Push
extends NetPan {
    public static final List<String> n = Arrays.asList("thunder", "magnet", "ed2k", "ftp");
    private String m = "http://127.0.0.1:8090";

    public static String extractFileName(String object) {
        object = Pattern.compile(".*/([^/?]+)").matcher((CharSequence)object);
        if (((Matcher)object).find()) {
            return ((Matcher)object).group(1);
        }
        return null;
    }

    public static boolean isThunder(String string) {
        return n.contains(Push.scheme(string));
    }

    private String o(String object) {
        Object object2;
        Object object3 = r.c(new StringBuilder(), this.m, "/torrents");
        int n2 = 0;
        object = com.github.catvod.spider.merge.f0.d.i((String)object3, String.format("{\"action\":\"add\",\"link\":\"%s\",\"title\":\"\",\"poster\":\"\",\"save_to_db\":true}", object), new HashMap<String, String>()).a();
        object3 = new StringBuilder();
        ((StringBuilder)object3).append("torr1 Torrent added");
        ((StringBuilder)object3).append((String)object);
        SpiderDebug.log((String)((StringBuilder)object3).toString());
        try {
            object3 = new JSONObject((String)object);
            object2 = object3.getString("hash");
        }
        catch (JSONException jSONException) {
            throw new RuntimeException(jSONException);
        }
        Object object4 = z.b(new StringBuilder(), this.m, "/playlist?hash=", (String)object2);
        object = new HashMap();
        object3 = null;
        object = object4 = com.github.catvod.spider.merge.f0.d.l((String)object4, (Map<String, String>)object, null);
        if (!((String)object4).contains("http")) {
            Thread.sleep(3000L);
            object = com.github.catvod.spider.merge.f0.d.l(z.b(new StringBuilder(), this.m, "/playlist?hash=", (String)object2), new HashMap<String, String>(), null);
        }
        object = Pattern.compile("http[^\n]+").matcher((CharSequence)object);
        object4 = new ArrayList();
        while (((Matcher)object).find()) {
            ((ArrayList)object4).add(((Matcher)object).group());
        }
        object2 = ((ArrayList)object4).iterator();
        while (true) {
            object = object3;
            if (!object2.hasNext()) break;
            object = (String)object2.next();
            System.out.println((String)object);
        }
        for (int i2 = n2; i2 < ((ArrayList)object4).size(); ++i2) {
            object2 = new StringBuilder();
            object3 = object;
            if (object == null) {
                object3 = "";
            }
            ((StringBuilder)object2).append((String)object3);
            ((StringBuilder)object2).append(URLDecoder.decode(Push.extractFileName((String)((ArrayList)object4).get(i2)), StandardCharsets.UTF_8.toString()));
            ((StringBuilder)object2).append("$");
            object = r.c((StringBuilder)object2, (String)((ArrayList)object4).get(i2), "#");
        }
        return object;
    }

    private List<g> p(String string) {
        Object object;
        CharSequence charSequence;
        Object object2;
        Object object32;
        ArrayList<g> arrayList = new ArrayList<g>();
        if (string.startsWith("file://") && ((File)(object32 = new File(string.replace("file://", "")))).getParentFile() != null) {
            object2 = ((File)object32).getParentFile().listFiles();
            Objects.requireNonNull(object2);
            for (Object object32 : object2) {
                charSequence = com.github.catvod.spider.merge.i0.m.k(((File)object32).getName());
                if (!com.github.catvod.spider.merge.i0.m.t((String)charSequence)) continue;
                object = new g();
                ((g)object).b(com.github.catvod.spider.merge.i0.m.z(((File)object32).getName()));
                object = ((g)object).a((String)charSequence);
                charSequence = com.github.catvod.spider.merge.C.a.c("file://");
                ((StringBuilder)charSequence).append(((File)object32).getAbsolutePath());
                ((g)object).c(((StringBuilder)charSequence).toString());
                arrayList.add((g)object);
            }
        }
        if (string.startsWith("http://")) {
            object2 = Arrays.asList("mp4", "mkv");
            object32 = Arrays.asList("srt", "ass");
            if (object2.contains(com.github.catvod.spider.merge.i0.m.k(string))) {
                object2 = object32.iterator();
                while (object2.hasNext()) {
                    object = (String)object2.next();
                    object32 = com.github.catvod.spider.merge.i0.m.z(string).concat(".").concat((String)object);
                    if (com.github.catvod.spider.merge.f0.d.k((String)object32).length() > 100) continue;
                    charSequence = Uri.parse((String)object32).getLastPathSegment();
                    g g2 = new g();
                    g2.b((String)charSequence);
                    object = g2.a((String)object);
                    ((g)object).c((String)object32);
                    arrayList.add((g)object);
                }
            }
        }
        return arrayList;
    }

    public static String scheme(String string) {
        string = (string = Uri.parse((String)string).getScheme()) == null ? "" : string.toLowerCase();
        return string;
    }

    public String detailContent(List<String> object) {
        if (NetPan.isNetPan(object.get(0))) {
            return super.detailContent("", "", (List)object);
        }
        if (com.github.catvod.spider.merge.R0.e.d(Youtube.hasYouTube(object.get(0)))) {
            return Youtube.get().detailContent((List<String>)object);
        }
        Iterator iterator = object.get(0);
        h h2 = new h();
        h2.l((String)((Object)iterator));
        h2.g("FongMi");
        object = ((String)((Object)iterator)).startsWith("file://") ? new File((String)((Object)iterator)).getName() : iterator;
        h2.m((String)object);
        h2.n("https://pic.rmb.bdstatic.com/bjh/1d0b02d0f57f0a42201f92caba5107ed.jpeg");
        if (Push.isThunder((String)((Object)iterator))) {
            CharSequence charSequence;
            object = null;
            try {
                charSequence = this.o((String)((Object)iterator));
                object = charSequence;
            }
            catch (Exception exception) {
                System.out.println("\u83b7\u53d6\u5728\u7ebfTorr\u5931\u8d25");
            }
            Object object2 = Arrays.asList("\u8fc5\u96f7\u78c1\u529b", "Torr\u5728\u7ebf\u78c1\u529b");
            charSequence = new StringBuilder();
            object2 = object2.iterator();
            if (object2.hasNext()) {
                while (true) {
                    ((StringBuilder)charSequence).append((CharSequence)object2.next());
                    if (!object2.hasNext()) break;
                    ((StringBuilder)charSequence).append((CharSequence)"$$$");
                }
            }
            h2.o(((StringBuilder)charSequence).toString());
            iterator = Arrays.asList(com.github.catvod.spider.merge.B.e.c("\u64ad\u653e$", (String)((Object)iterator)), object);
            object = new StringBuilder();
            iterator = iterator.iterator();
            if (iterator.hasNext()) {
                while (true) {
                    ((StringBuilder)object).append((CharSequence)iterator.next());
                    if (!iterator.hasNext()) break;
                    ((StringBuilder)object).append((CharSequence)"$$$");
                }
            }
            object = ((StringBuilder)object).toString();
        } else {
            h2.o(TextUtils.join((CharSequence)"$$$", Arrays.asList("\u76f4\u9023", "\u55c5\u63a2", "\u89e3\u6790")));
            object = TextUtils.join((CharSequence)"$$$", Arrays.asList(com.github.catvod.spider.merge.B.e.c("\u64ad\u653e$", (String)((Object)iterator)), com.github.catvod.spider.merge.B.e.c("\u64ad\u653e$", (String)((Object)iterator)), com.github.catvod.spider.merge.B.e.c("\u64ad\u653e$", (String)((Object)iterator))));
        }
        h2.p((String)object);
        return com.github.catvod.spider.merge.K.f.n(h2);
    }

    @Override
    public void init(Context context, String string) {
        super.init(context, string);
    }

    public String playerContent(String object, String string, List<String> list) {
        if (((String)object).equals("\u76f4\u9023")) {
            object = new f();
            ((f)object).w(string);
            ((f)object).v(this.p(string));
            return ((f)object).toString();
        }
        if (!((String)object).startsWith("Torr\u5728\u7ebf\u78c1\u529b") && !((String)object).startsWith("\u8fc5\u96f7")) {
            if (((String)object).equals("\u55c5\u63a2")) {
                object = new f();
                ((f)object).l();
                ((f)object).w(string);
                return ((f)object).toString();
            }
            if (((String)object).equals("\u89e3\u6790")) {
                object = new f();
                ((f)object).l();
                ((f)object).h();
                ((f)object).w(string);
                return ((f)object).toString();
            }
            if (com.github.catvod.spider.merge.R0.e.d(Youtube.hasYouTube(string))) {
                return Youtube.get().playerContent(null, string, null);
            }
            return super.playerContent((String)object, string, list);
        }
        object = new f();
        ((f)object).w(string);
        ((f)object).v(this.p(string));
        return ((f)object).toString();
    }
}

