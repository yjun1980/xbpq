/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.github.catvod.crawler.Spider
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.s;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.e1.m;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class Kugou
extends Spider {
    public String categoryContent(String string, String string2, boolean bl, HashMap<String, String> hashMap) {
        string = !"1".equals(string2) ? "" : this.getKuGouRank(string);
        return string;
    }

    public String detailContent(List<String> object) {
        if (((String)(object = object.get(0))).startsWith("kugou")) {
            return this.getKuGouMusicList(((String)object).split("_")[1]);
        }
        if (((String)object).startsWith("aiting")) {
            return this.getAiTingMusicList(((String)object).split("_")[1]);
        }
        return "";
    }

    public String getAiTingMusicList(String string) {
        try {
            Object object = new StringBuilder();
            ((StringBuilder)object).append("https://catbox.n13.club/yy.php?ac=videolist&ids=");
            ((StringBuilder)object).append(string);
            String string2 = ((StringBuilder)object).toString();
            object = new JSONObject(com.github.catvod.spider.merge.f0.d.k(string2));
            string2 = object.optJSONArray("list").optJSONObject(0);
            object = new h();
            ((h)object).l(string);
            ((h)object).m(string2.optString("vod_name"));
            ((h)object).q("\u7231\u97f3\u4e50\u7231\u751f\u6d3b");
            ((h)object).j("\u82b1\u8bed\u63d0\u9192\u4f60:\u5982\u65e0\u6cd5\u64ad\u653e\u8bf7\u4f7f\u7528\u5f71\u89c6...");
            ((h)object).o("\u7231\u97f3\u4e50:\u7231\u751f\u6d3b");
            ((h)object).p(string2.optString("vod_play_url").replace("$http", "$aiting-http"));
            string = f.n((h)object);
            return string;
        }
        catch (Exception exception) {
            return "";
        }
    }

    public String getAiTingMusicPlayUrl(String string) {
        f f2 = new f();
        f2.w(string);
        f2.l();
        return f2.toString();
    }

    public String getAiTingRank() {
        Object object = new JSONObject(com.github.catvod.spider.merge.f0.d.k("https://catbox.n13.club/yy.php?ac=videolist&t=djwuqu&pg=1"));
        JSONArray jSONArray = object.optJSONArray("list");
        ArrayList<h> arrayList = new ArrayList<h>();
        int n2 = 0;
        while (true) {
            if (n2 >= jSONArray.length()) break;
            JSONObject jSONObject = jSONArray.optJSONObject(n2);
            object = new h();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("aiting_");
            stringBuilder.append(jSONObject.optString("vod_id"));
            ((h)object).l(stringBuilder.toString());
            ((h)object).m(jSONObject.optString("vod_name"));
            ((h)object).n(jSONObject.optString("vod_pic"));
            arrayList.add((h)object);
            ++n2;
            continue;
            break;
        }
        try {
            object = f.o(arrayList);
            return object;
        }
        catch (Exception exception) {
            return "";
        }
    }

    public String getKuGouMusicList(String charSequence) {
        Object object = new StringBuilder();
        ((StringBuilder)object).append("http://mobilecdnbj.kugou.com/api/v3/rank/song?version=9108&ranktype=0&plat=0&pagesize=200&area_code=1&page=1&volid=35050&rankid=");
        ((StringBuilder)object).append((String)charSequence);
        ((StringBuilder)object).append("&with_res_tag=0");
        CharSequence charSequence2 = ((StringBuilder)object).toString();
        object = new JSONObject(com.github.catvod.spider.merge.f0.d.k((String)charSequence2));
        JSONArray jSONArray = object.optJSONObject("data").optJSONArray("info");
        ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<String> arrayList2 = new ArrayList<String>();
        new ArrayList();
        int n2 = 0;
        while (true) {
            if (n2 >= jSONArray.length()) break;
            JSONObject jSONObject = jSONArray.optJSONObject(n2);
            String string = jSONObject.optString("filename");
            String string2 = jSONObject.optString("album_id");
            String string3 = jSONObject.optString("album_audio_id");
            charSequence2 = jSONObject.optString("sqhash");
            object = charSequence2;
            if (TextUtils.isEmpty((CharSequence)charSequence2)) {
                object = jSONObject.optString("hash");
            }
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append(string);
            ((StringBuilder)charSequence2).append("$kugou-mp3_");
            ((StringBuilder)charSequence2).append((String)object);
            ((StringBuilder)charSequence2).append("_");
            ((StringBuilder)charSequence2).append(string2);
            ((StringBuilder)charSequence2).append("_");
            ((StringBuilder)charSequence2).append(string3);
            arrayList.add(((StringBuilder)charSequence2).toString());
            object = jSONObject.optString("mvhash");
            if (!TextUtils.isEmpty((CharSequence)object)) {
                charSequence2 = new StringBuilder();
                ((StringBuilder)charSequence2).append(string);
                ((StringBuilder)charSequence2).append("$kugou-mv_");
                ((StringBuilder)charSequence2).append((String)object);
                arrayList2.add(((StringBuilder)charSequence2).toString());
            }
            ++n2;
            continue;
            break;
        }
        try {
            object = new h();
            ((h)object).l((String)charSequence);
            ((h)object).m("\u9177\u72d7\u97f3\u4e50");
            ((h)object).q("\u7231\u97f3\u4e50\u7231\u751f\u6d3b");
            ((h)object).j("\u82b1\u8bed\u63d0\u9192\u4f60:\u5982\u65e0\u6cd5\u64ad\u653e\u8bf7\u4f7f\u7528\u5f71\u89c6...");
            ((h)object).o("MP3$$$MV");
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(TextUtils.join((CharSequence)"#", arrayList));
            ((StringBuilder)charSequence).append("$$$");
            ((StringBuilder)charSequence).append(TextUtils.join((CharSequence)"#", arrayList2));
            ((h)object).p(((StringBuilder)charSequence).toString());
            charSequence = f.n((h)object);
            return charSequence;
        }
        catch (Exception exception) {
            return "";
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String getKuGouRank(String string) {
        try {
            JSONObject jSONObject = new JSONObject(com.github.catvod.spider.merge.f0.d.k("http://mobilecdnbj.kugou.com/api/v3/rank/list?version=9108&plat=0&showtype=2&parentid=0&apiver=6&area_code=1&withsong=0&with_res_tag=0"));
            JSONArray jSONArray = jSONObject.optJSONObject("data").optJSONArray("info");
            ArrayList<h> arrayList = new ArrayList<h>();
            int n2 = 0;
            while (n2 < jSONArray.length()) {
                block7: {
                    void var4_7;
                    h h2;
                    block8: {
                        StringBuilder stringBuilder;
                        JSONObject jSONObject2;
                        block9: {
                            block6: {
                                jSONObject2 = jSONArray.optJSONObject(n2);
                                boolean bl = "hot".equals(string);
                                if (!bl) break block6;
                                if (!"1".equals(jSONObject2.optString("classify")) && !"2".equals(jSONObject2.optString("classify"))) break block7;
                                h2 = new h();
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("kugou_");
                                stringBuilder.append(jSONObject2.optString("rankid"));
                                h2.l(stringBuilder.toString());
                                h2.m(jSONObject2.optString("rankname"));
                                String string2 = jSONObject2.optString("imgurl").replace("{size}", "400");
                                break block8;
                            }
                            if (!"special".equals(string)) break block9;
                            if (!"3".equals(jSONObject2.optString("classify")) && !"5".equals(jSONObject2.optString("classify"))) break block7;
                            h2 = new h();
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("kugou_");
                            stringBuilder.append(jSONObject2.optString("rankid"));
                            h2.l(stringBuilder.toString());
                            h2.m(jSONObject2.optString("rankname"));
                            String string3 = jSONObject2.optString("imgurl").replace("{size}", "400");
                            break block8;
                        }
                        if (!"global".equals(string) || !"4".equals(jSONObject2.optString("classify")) && !"2".equals(jSONObject2.optString("classify"))) break block7;
                        h2 = new h();
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("kugou_");
                        stringBuilder.append(jSONObject2.optString("rankid"));
                        h2.l(stringBuilder.toString());
                        h2.m(jSONObject2.optString("rankname"));
                        String string4 = jSONObject2.optString("imgurl").replace("{size}", "400");
                    }
                    h2.n((String)var4_7);
                    arrayList.add(h2);
                }
                ++n2;
            }
            return f.o(arrayList);
        }
        catch (Exception exception) {
            return "";
        }
    }

    public String getKugouMusicPlayUrl(String object) {
        boolean bl = ((String)object).startsWith("mp3");
        Object object2 = "";
        object = ((String)object).split("_");
        if (bl) {
            Object object3 = new JSONObject(com.github.catvod.spider.merge.f0.d.k(e.c("https://m.kugou.com/app/i/getSongInfo.php?cmd=playInfo&hash=", object[1])));
            if (object3.optString("error").contains("\u8981\u4ed8\u8d39")) {
                block8: {
                    object = object3.optString("songName");
                    object3 = object3.optString("author_name");
                    StringBuilder stringBuilder = a.c("https://www.sq0527.cn/search?ac=");
                    stringBuilder.append(URLEncoder.encode((String)object));
                    for (m m2 : d.l(com.github.catvod.spider.merge.f0.d.k(stringBuilder.toString())).m0("ul.mul > li > a")) {
                        String string = m2.s0();
                        if (!string.contains((CharSequence)object) || !string.contains((CharSequence)object3)) continue;
                        object = m2.c("href");
                        break block8;
                    }
                    object = "";
                }
                if (TextUtils.isEmpty((CharSequence)object)) {
                    object = object2;
                } else {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("https://www.sq0527.cn");
                    ((StringBuilder)object2).append((String)object);
                    object = d.l(com.github.catvod.spider.merge.f0.d.k(((StringBuilder)object2).toString())).m0("#btn-download-mp3").a("href");
                }
            } else {
                object = !TextUtils.isEmpty((CharSequence)object3.optString("url")) ? object3.optString("url") : object3.optJSONArray("backup_url").optString(0);
            }
            object2 = new f();
            ((f)object2).w((String)object);
            ((f)object2).l();
            return ((f)object2).toString();
        }
        if ((object = new JSONObject(com.github.catvod.spider.merge.f0.d.k(s.a("https://m.kugou.com/app/i/mv.php?cmd=100&hash=", object[1], "&ismp3=1&ext=mp4"))).optJSONObject("mvdata")).has("sq")) {
            object2 = new f();
            ((f)object2).w(object.optJSONObject("sq").optString("downurl"));
            ((f)object2).l();
            object = new HashMap();
            ((HashMap)object).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
            ((f)object2).g((Map<String, String>)object);
            return ((f)object2).toString();
        }
        if (object.has("le")) {
            object2 = new f();
            ((f)object2).w(object.optJSONObject("le").optString("downurl"));
            ((f)object2).l();
            object = new HashMap();
            ((HashMap)object).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
            ((f)object2).g((Map<String, String>)object);
            return ((f)object2).toString();
        }
        return "";
    }

    public String homeContent(boolean bl) {
        ArrayList<com.github.catvod.spider.merge.K.a> arrayList = new ArrayList<com.github.catvod.spider.merge.K.a>();
        JSONObject jSONObject = new JSONObject("{\"\u70ed\u95e8\u699c\":\"hot\",\"\u7279\u8272\u699c\":\"special\",\"\u5168\u7403\u699c\":\"global\"}");
        Iterator iterator = jSONObject.keys();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            arrayList.add(new com.github.catvod.spider.merge.K.a(jSONObject.optString(string), string));
        }
        return f.r(arrayList, new ArrayList<h>());
    }

    public String playerContent(String string, String string2, List<String> list) {
        if (string2.startsWith("kugou")) {
            return this.getKugouMusicPlayUrl(string2.split("-")[1]);
        }
        if (string2.startsWith("aiting")) {
            return this.getAiTingMusicPlayUrl(string2.split("-")[1]);
        }
        return "";
    }
}

