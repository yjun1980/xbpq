/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.UrlQuerySanitizer
 *  android.text.TextUtils
 *  com.github.catvod.crawler.Spider
 *  com.github.catvod.crawler.SpiderDebug
 *  okhttp3.Call
 *  okhttp3.Response
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge;

import android.content.Context;
import android.net.UrlQuerySanitizer;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.Iw;
import com.github.catvod.spider.merge.YS;
import com.github.catvod.spider.merge.Yy;
import com.github.catvod.spider.merge.ZP;
import com.github.catvod.spider.merge.jk;
import com.github.catvod.spider.merge.xx;
import com.github.catvod.spider.u;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

public class zm
extends Spider {
    public static String HM;
    public static Pattern N;
    private static final Map<String, Map<String, String>> OL;
    private static long S = 0L;
    private static final Map<String, String> T4;
    private static final Map<String, Long> b;
    private static final ReentrantLock l;
    private static String l8 = "";
    private static final Pattern tT;

    static {
        T4 = new HashMap<String, String>();
        b = new HashMap<String, Long>();
        OL = new HashMap<String, Map<String, String>>();
        l = new ReentrantLock();
        tT = Pattern.compile("(https://www.aliyundrive.com/s/[^\"]+)");
        N = Pattern.compile("www.aliyundrive.com/s/([^/]+)(/folder/([^/]+))?");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String OL(String string, String string2) {
        synchronized (zm.class) {
            Throwable throwable2222;
            block7: {
                Object object;
                Map<String, Long> map;
                Map<String, String> map2;
                long l2;
                block6: {
                    long l3;
                    l2 = zm.T4();
                    map2 = T4;
                    String string3 = map2.get(string);
                    map = b;
                    object = map.get(string);
                    if (TextUtils.isEmpty((CharSequence)string3) || (l3 = ((Long)object).longValue()) - l2 <= 600L) break block6;
                    return string3;
                }
                object = new JSONObject();
                object.put("share_id", (Object)string);
                object.put("share_pwd", (Object)string2);
                object = object.toString();
                string2 = new JSONObject(zm.S("https://api.aliyundrive.com/v2/share_link/get_share_token", (String)object, zm.l8()));
                object = string2.optString("share_token");
                map.put(string, l2 + string2.getLong("expires_in"));
                map2.put(string, (String)object);
                return object;
                {
                    catch (Throwable throwable2222) {
                        break block7;
                    }
                    catch (Exception exception) {}
                    {
                        SpiderDebug.log((Throwable)exception);
                    }
                    return "";
                }
            }
            throw throwable2222;
        }
    }

    public static Object[] ProxyMedia(Map<String, String> object) {
        try {
            String string = object.get("share_id");
            String string2 = object.get("file_id");
            String string3 = object.get("media_id");
            String string4 = zm.OL(string, "");
            xx.aA aA2 = l;
            ((ReentrantLock)((Object)aA2)).lock();
            Map<String, Map<String, String>> map = OL;
            object = map.get(string2).get(string3);
            UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer((String)object);
            Long l2 = new Long(urlQuerySanitizer.getValue("x-oss-expires"));
            if (l2 - zm.T4() <= 60L) {
                zm.b(string, string4, string2);
                object = map.get(string2).get(string3);
            }
            ((ReentrantLock)((Object)aA2)).unlock();
            new HashMap();
            aA2 = new xx.aA(){

                @Override
                protected void onFailure(Call call, Exception exception) {
                }

                @Override
                public String onResponse(Response response) {
                    return null;
                }
            };
            Yy.b(Yy.T4(), (String)object, null, zm.l8(), aA2);
            object = ((Response)aA2.getResult()).body().byteStream();
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return null;
        }
        return new Object[]{200, "video/MP2T", object};
    }

    private static String S(String string, String string2, Map<String, String> map) {
        xx.ut ut2 = new xx.ut(){

            @Override
            protected void onFailure(Call call, Exception exception) {
            }

            @Override
            public String onResponse(String string) {
                return string;
            }
        };
        Yy.N(Yy.T4(), string, string2, map, ut2);
        return (String)ut2.getResult();
    }

    protected static long T4() {
        return System.currentTimeMillis() / 1000L + 0L;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String b(String string, String object, String string2) {
        int n2;
        int n3;
        String[] stringArray;
        String string3;
        HashMap<String, Object> hashMap;
        int n4;
        int n5;
        Object object2;
        Object object3;
        try {
            object3 = new JSONObject();
            object3.put("share_id", (Object)string);
            object3.put("category", (Object)"live_transcoding");
            object3.put("file_id", (Object)string2);
            object3.put("template_id", (Object)"");
            object2 = zm.l8();
            ((HashMap)object2).put((String)"x-share-token", (String)object);
            ((HashMap)object2).put((String)"authorization", (String)l8);
            object3 = object3.toString();
            object = new JSONObject(zm.S("https://api.aliyundrive.com/v2/file/get_share_link_video_preview_play_info", (String)object3, object2));
            object2 = new ArrayList();
            ((ArrayList)object2).add("FHD");
            ((ArrayList)object2).add("HD");
            ((ArrayList)object2).add("SD");
            object3 = object.optJSONObject("video_preview_play_info").getJSONArray("live_transcoding_task_list");
            object2 = ((ArrayList)object2).iterator();
            object = "";
            block4: while (true) {
                block14: {
                    block13: {
                        boolean bl = object2.hasNext();
                        n5 = 0;
                        n4 = 0;
                        if (!bl) break block13;
                        hashMap = (String)object2.next();
                        if (((String)object).isEmpty()) break block14;
                    }
                    object2 = object;
                    if (TextUtils.isEmpty((CharSequence)object)) {
                        object2 = object3.optJSONObject(0).optString("url");
                    }
                    object = new HashMap();
                    Yy.Kf((String)object2, zm.l8(), (Map<String, List<String>>)object);
                    object3 = Yy.OL((Map<String, List<String>>)object);
                    object = Yy.v((String)object3, zm.l8());
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append(((String)object3).substring(0, ((String)object3).lastIndexOf("/")));
                    ((StringBuilder)object2).append("/");
                    string3 = ((StringBuilder)object2).toString();
                    object3 = new ArrayList();
                    hashMap = new HashMap<String, Object>();
                    stringArray = ((String)object).split("\n");
                    n3 = stringArray.length;
                    n2 = 0;
                    break;
                }
                while (true) {
                    if (n5 >= object3.length()) {
                        continue;
                    }
                    object = object3.optJSONObject(n5);
                    if (object.optString("template_id").equals(hashMap)) {
                        object = object.optString("url");
                        continue block4;
                    }
                    ++n5;
                }
                break;
            }
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return "";
        }
        for (n5 = n4; n5 < n3; ++n5) {
            object2 = stringArray[n5];
            n4 = n2;
            object = object2;
            {
                if (((String)object2).contains("x-oss-expires")) {
                    n4 = n2 + 1;
                    object = new StringBuilder();
                    ((StringBuilder)object).append(string3);
                    ((StringBuilder)object).append((String)object2);
                    object = ((StringBuilder)object).toString();
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("");
                    ((StringBuilder)object2).append(n4);
                    hashMap.put(((StringBuilder)object2).toString(), object);
                    object = new StringBuilder();
                    ((StringBuilder)object).append(u.localProxyUrl());
                    ((StringBuilder)object).append("?do=push&type=media&share_id=");
                    ((StringBuilder)object).append(string);
                    ((StringBuilder)object).append("&file_id=");
                    ((StringBuilder)object).append(string2);
                    ((StringBuilder)object).append("&media_id=");
                    ((StringBuilder)object).append(n4);
                    object = ((StringBuilder)object).toString();
                }
                ((ArrayList)object3).add(object);
                n2 = n4;
                continue;
            }
        }
        OL.put(string2, hashMap);
        return TextUtils.join((CharSequence)"\n", (Iterable)object3);
    }

    public static Object[] getFile(Map<String, String> object) {
        try {
            String string = object.get("share_id");
            object = new ByteArrayInputStream(zm.b(string, zm.OL(string, ""), object.get("file_id")).getBytes());
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return null;
        }
        return new Object[]{200, "application/octet-stream", object};
    }

    private static void l() {
        long l2 = zm.T4();
        if (l8.isEmpty() || S - l2 <= 600L) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("refresh_token", (Object)HM);
                CharSequence charSequence = jSONObject.toString();
                HashMap<String, String> hashMap = zm.l8();
                jSONObject = new JSONObject(zm.S("https://api.aliyundrive.com/token/refresh", (String)charSequence, hashMap));
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(jSONObject.optString("token_type"));
                ((StringBuilder)charSequence).append(" ");
                ((StringBuilder)charSequence).append(jSONObject.optString("access_token"));
                l8 = ((StringBuilder)charSequence).toString();
                S = l2 + jSONObject.getLong("expires_in");
            }
            catch (Exception exception) {
                SpiderDebug.log((Throwable)exception);
            }
        }
    }

    private static HashMap<String, String> l8() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
        hashMap.put("Referer", "https://www.aliyundrive.com/");
        return hashMap;
    }

    private static HashMap<String, String> tT() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
        return hashMap;
    }

    public static Object[] vod(Map<String, String> map) {
        String string = map.get("type");
        if (string.equals("m3u8")) {
            return zm.getFile(map);
        }
        if (string.equals("media")) {
            return zm.ProxyMedia(map);
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String detailContent(List<String> object) {
        CharSequence charSequence;
        CharSequence charSequence2;
        Matcher matcher;
        Matcher matcher2;
        Object object2;
        String string;
        Object object3;
        Object object4;
        block237: {
            block234: {
                block236: {
                    block235: {
                        block233: {
                            block228: {
                                JSONArray jSONArray;
                                block238: {
                                    block229: {
                                        block232: {
                                            block230: {
                                                block225: {
                                                    String string2;
                                                    JSONObject jSONObject;
                                                    block227: {
                                                        block226: {
                                                            block224: {
                                                                object3 = object4 = "";
                                                                string = (String)object.get(0);
                                                                object3 = object4;
                                                                object2 = N;
                                                                object3 = object4;
                                                                matcher2 = tT.matcher(string);
                                                                object3 = object4;
                                                                matcher = ((Pattern)object2).matcher(string);
                                                                object3 = object4;
                                                                boolean bl = ZP.l(string);
                                                                charSequence2 = "vod_remarks";
                                                                object2 = "vod_area";
                                                                if (!bl) break block224;
                                                                object3 = object4;
                                                                if (string.contains("qq.com")) break block224;
                                                                object3 = object4;
                                                                if (string.contains("mgtv.com")) break block224;
                                                                object3 = object4;
                                                                CharSequence charSequence3 = YS.l8(Yy.v(string, null)).LD("head > title").OL();
                                                                object3 = object4;
                                                                object3 = object4;
                                                                object2 = new JSONObject();
                                                                object3 = object4;
                                                                object3 = object4;
                                                                charSequence2 = new JSONArray();
                                                                object3 = object4;
                                                                object3 = object4;
                                                                object = new JSONObject();
                                                                object3 = object4;
                                                                object.put("vod_id", (Object)string);
                                                                object3 = object4;
                                                                object.put("vod_name", (Object)charSequence3);
                                                                object3 = object4;
                                                                object.put("vod_pic", (Object)"https://img.zcool.cn/community/0123545c74c5aea801213f261297df.png");
                                                                object3 = object4;
                                                                object.put("type_name", (Object)"\u5b98\u6e90");
                                                                object3 = object4;
                                                                object.put("vod_year", (Object)"");
                                                                object3 = object4;
                                                                object.put("vod_area", (Object)"");
                                                                object3 = object4;
                                                                object.put("vod_remarks", (Object)"");
                                                                object3 = object4;
                                                                object.put("vod_actor", (Object)"");
                                                                object3 = object4;
                                                                object.put("vod_director", (Object)"");
                                                                object3 = object4;
                                                                object.put("vod_content", (Object)"");
                                                                object3 = object4;
                                                                object.put("vod_play_from", (Object)"jx");
                                                                object3 = object4;
                                                                object3 = object4;
                                                                charSequence3 = new StringBuilder();
                                                                object3 = object4;
                                                                ((StringBuilder)charSequence3).append("\u7acb\u5373\u64ad\u653e$");
                                                                object3 = object4;
                                                                ((StringBuilder)charSequence3).append(string);
                                                                object3 = object4;
                                                                object.put("vod_play_url", (Object)((StringBuilder)charSequence3).toString());
                                                                object3 = object4;
                                                                charSequence2.put(object);
                                                                object3 = object4;
                                                                object2.put("list", (Object)charSequence2);
                                                                object3 = object4;
                                                                return object2.toString();
                                                            }
                                                            object3 = object4;
                                                            if (!ZP.l(string)) break block225;
                                                            object3 = object4;
                                                            if (!string.contains("qq.com")) break block225;
                                                            object3 = object4;
                                                            object3 = object4;
                                                            ArrayList<String> arrayList = new ArrayList<String>();
                                                            object3 = object4;
                                                            object3 = object4;
                                                            jSONObject = new JSONObject();
                                                            object3 = object4;
                                                            object3 = object4;
                                                            matcher2 = new JSONArray();
                                                            object3 = object4;
                                                            object3 = object4;
                                                            matcher = new JSONObject();
                                                            object3 = object4;
                                                            object = YS.l8(Yy.v(string, zm.tT()));
                                                            object3 = object4;
                                                            string2 = ((Iw)object).LD("head > title").OL();
                                                            object3 = object4;
                                                            jk jk2 = ((Iw)object).LD("div.episode-list-rect__item");
                                                            object3 = object4;
                                                            if (jk2.isEmpty()) break block226;
                                                            int n2 = 0;
                                                            object = object4;
                                                            while (true) {
                                                                object3 = object;
                                                                if (n2 >= jk2.size()) break;
                                                                object3 = object;
                                                                object4 = (Iw)jk2.get(n2);
                                                                object3 = object;
                                                                String string3 = ((Iw)object4).LD("div").l8("data-vid");
                                                                object3 = object;
                                                                String string4 = ((Iw)object4).LD("div").l8("data-cid");
                                                                object3 = object;
                                                                StringBuilder stringBuilder = new StringBuilder();
                                                                object = object3 = object;
                                                                stringBuilder.append("https://v.qq.com/x/cover/");
                                                                object = object3;
                                                                stringBuilder.append(string4);
                                                                object = object3;
                                                                stringBuilder.append("/");
                                                                object = object3;
                                                                stringBuilder.append(string3);
                                                                object = object3;
                                                                String string5 = stringBuilder.toString();
                                                                object = object3;
                                                                string4 = ((Iw)object4).LD("div span").OL();
                                                                object = object3;
                                                                object = object3;
                                                                object4 = new StringBuilder();
                                                                object = object3;
                                                                ((StringBuilder)object4).append(string4);
                                                                object = object3;
                                                                ((StringBuilder)object4).append("$");
                                                                object = object3;
                                                                ((StringBuilder)object4).append(string5);
                                                                object = object3;
                                                                arrayList.add(((StringBuilder)object4).toString());
                                                                ++n2;
                                                                object = object3;
                                                                continue;
                                                                break;
                                                            }
                                                            object3 = object;
                                                            object4 = object2;
                                                            object = object3;
                                                            try {
                                                                matcher.put("vod_play_url", TextUtils.join((CharSequence)"#", arrayList));
                                                                object2 = charSequence2;
                                                                break block227;
                                                            }
                                                            catch (Throwable throwable) {
                                                                return object;
                                                            }
                                                        }
                                                        object3 = "";
                                                        object2 = "vod_remarks";
                                                        object4 = "vod_area";
                                                        object = object3;
                                                        object = object3;
                                                        charSequence2 = new StringBuilder();
                                                        object = object3;
                                                        ((StringBuilder)charSequence2).append("\u7acb\u5373\u64ad\u653e$");
                                                        object = object3;
                                                        ((StringBuilder)charSequence2).append(string);
                                                        object = object3;
                                                        matcher.put("vod_play_url", ((StringBuilder)charSequence2).toString());
                                                    }
                                                    object = object3;
                                                    matcher.put("vod_id", string);
                                                    object = object3;
                                                    matcher.put("vod_name", string2);
                                                    object = object3;
                                                    matcher.put("vod_pic", "https://img2.baidu.com/it/u=2655029475,2190949369&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=593");
                                                    object = object3;
                                                    matcher.put("type_name", "\u817e\u8bafTV");
                                                    object3 = object = object3;
                                                    matcher.put("vod_year", object);
                                                    object3 = object;
                                                    matcher.put((String)object4, object);
                                                    object3 = object;
                                                    matcher.put((String)object2, object);
                                                    object3 = object;
                                                    matcher.put("vod_actor", object);
                                                    object3 = object;
                                                    matcher.put("vod_director", object);
                                                    object3 = object;
                                                    matcher.put("vod_content", string);
                                                    object3 = object;
                                                    matcher.put("vod_play_from", "jx");
                                                    object3 = object;
                                                    matcher2.put(matcher);
                                                    object3 = object;
                                                    jSONObject.put("list", (Object)matcher2);
                                                    object3 = object;
                                                    return jSONObject.toString();
                                                }
                                                charSequence = "list";
                                                object3 = object4;
                                                if (!ZP.l(string)) break block228;
                                                object3 = object4;
                                                if (!string.contains("mgtv.com")) break block228;
                                                object3 = object4;
                                                object3 = object4;
                                                ArrayList<String> arrayList = new ArrayList<String>();
                                                object3 = object4;
                                                object3 = object4;
                                                matcher2 = new JSONObject();
                                                object3 = object4;
                                                object3 = object4;
                                                jSONArray = new JSONArray();
                                                object3 = object4;
                                                object3 = object4;
                                                matcher = new JSONObject();
                                                object3 = object4;
                                                Matcher matcher3 = Pattern.compile("https://\\S+mgtv.com/b/(\\d+)/(\\d+).html.*").matcher(string);
                                                object3 = object4;
                                                if (!matcher3.find()) break block229;
                                                object3 = object4;
                                                object3 = object4;
                                                object = new StringBuilder();
                                                object3 = object4;
                                                ((StringBuilder)object).append("https://pcweb.api.mgtv.com/episode/list?video_id=");
                                                object3 = object4;
                                                ((StringBuilder)object).append(matcher3.group(2));
                                                object3 = object4;
                                                object2 = ((StringBuilder)object).toString();
                                                object3 = object4;
                                                object3 = object4;
                                                object = new JSONObject(Yy.v((String)object2, zm.l8()));
                                                object3 = object4;
                                                charSequence2 = object.optJSONObject("data").optJSONObject("info").optString("title");
                                                object3 = object4;
                                                object3 = object4;
                                                object2 = new JSONArray(object.optJSONObject("data").optString("list"));
                                                object3 = object4;
                                                if (object2.length() <= 0) break block230;
                                                int n3 = 0;
                                                object = charSequence;
                                                while (true) {
                                                    block231: {
                                                        object3 = object4;
                                                        if (n3 >= object2.length()) break;
                                                        object3 = object4;
                                                        JSONObject jSONObject = object2.optJSONObject(n3);
                                                        object3 = object4;
                                                        if (!jSONObject.optString("isIntact").equals("1")) break block231;
                                                        object3 = object4;
                                                        charSequence = jSONObject.optString("t4");
                                                        object3 = object4;
                                                        String string6 = jSONObject.optString("video_id");
                                                        object3 = object4;
                                                        object3 = object4;
                                                        StringBuilder stringBuilder = new StringBuilder();
                                                        object3 = object4;
                                                        stringBuilder.append("https://www.mgtv.com/b/");
                                                        object3 = object4;
                                                        stringBuilder.append(matcher3.group(1));
                                                        object3 = object4;
                                                        stringBuilder.append("/");
                                                        object3 = object4;
                                                        stringBuilder.append(string6);
                                                        object3 = object4;
                                                        stringBuilder.append(".html");
                                                        object3 = object4;
                                                        String string7 = stringBuilder.toString();
                                                        object3 = object4;
                                                        object3 = object4;
                                                        stringBuilder = new StringBuilder();
                                                        object3 = object4;
                                                        stringBuilder.append((String)charSequence);
                                                        object3 = object4;
                                                        stringBuilder.append("$");
                                                        object3 = object4;
                                                        stringBuilder.append(string7);
                                                        object3 = object4;
                                                        arrayList.add(stringBuilder.toString());
                                                    }
                                                    ++n3;
                                                }
                                                object3 = object4;
                                                try {
                                                    matcher.put("vod_play_url", TextUtils.join((CharSequence)"#", arrayList));
                                                    break block232;
                                                }
                                                catch (Throwable throwable) {
                                                    return object3;
                                                }
                                            }
                                            object = "list";
                                            object3 = object4;
                                            object3 = object4;
                                            object2 = new StringBuilder();
                                            object3 = object4;
                                            ((StringBuilder)object2).append("\u7acb\u5373\u64ad\u653e$");
                                            object3 = object4;
                                            ((StringBuilder)object2).append(string);
                                            object3 = object4;
                                            matcher.put("vod_play_url", ((StringBuilder)object2).toString());
                                        }
                                        object2 = charSequence2;
                                        break block238;
                                    }
                                    object = "list";
                                    object2 = "";
                                }
                                object3 = object4;
                                matcher.put("vod_id", string);
                                object3 = object4;
                                matcher.put("vod_name", object2);
                                object3 = object4;
                                matcher.put("vod_pic", "https://img2.baidu.com/it/u=2562822927,704100654&fm=253&fmt=auto&app=138&f=JPEG?w=600&h=380");
                                object3 = object4;
                                matcher.put("type_name", "\u8292\u679cTV");
                                object3 = object4;
                                matcher.put("vod_year", "");
                                object3 = object4;
                                matcher.put("vod_area", "");
                                object3 = object4;
                                matcher.put("vod_remarks", "");
                                object3 = object4;
                                matcher.put("vod_actor", "");
                                object3 = object4;
                                matcher.put("vod_director", "");
                                object3 = object4;
                                matcher.put("vod_content", string);
                                object3 = object4;
                                matcher.put("vod_play_from", "jx");
                                object3 = object4;
                                jSONArray.put((Object)matcher);
                                object3 = object4;
                                matcher2.put((String)object, jSONArray);
                                object3 = object4;
                                return matcher2.toString();
                            }
                            object3 = object4;
                            if (!ZP.OL(string)) break block233;
                            object3 = object4;
                            object3 = object4;
                            object = new JSONObject();
                            object3 = object4;
                            object3 = object4;
                            charSequence = new JSONArray();
                            object3 = object4;
                            object3 = object4;
                            charSequence2 = new JSONObject();
                            object3 = object4;
                            charSequence2.put("vod_id", (Object)string);
                            object3 = object4;
                            charSequence2.put("vod_name", (Object)string);
                            object3 = object4;
                            charSequence2.put("vod_pic", (Object)"https://img.zcool.cn/community/0123545c74c5aea801213f261297df.png");
                            object3 = object4;
                            charSequence2.put("type_name", (Object)"\u76f4\u8fde");
                            object3 = object4;
                            charSequence2.put("vod_play_from", (Object)"player");
                            object3 = object4;
                            object3 = object4;
                            object2 = new StringBuilder();
                            object3 = object4;
                            ((StringBuilder)object2).append("\u7acb\u5373\u64ad\u653e$");
                            object3 = object4;
                            ((StringBuilder)object2).append(string);
                            object3 = object4;
                            charSequence2.put("vod_play_url", (Object)((StringBuilder)object2).toString());
                            object3 = object4;
                            charSequence.put((Object)charSequence2);
                            object3 = object4;
                            object.put("list", (Object)charSequence);
                            object3 = object4;
                            return object.toString();
                        }
                        object3 = object4;
                        if (!string.startsWith("magnet")) break block234;
                        object3 = object4;
                        if (string.length() <= 100) break block235;
                        object3 = object4;
                        object3 = object4;
                        object = new StringBuilder();
                        object3 = object4;
                        ((StringBuilder)object).append(string.substring(0, 30));
                        object3 = object4;
                        ((StringBuilder)object).append("...");
                        object3 = object4;
                        ((StringBuilder)object).append(string.substring(string.length() - 10));
                        object3 = object4;
                        object = ((StringBuilder)object).toString();
                        break block236;
                    }
                    object = string;
                }
                object3 = object4;
                object3 = object4;
                charSequence = new JSONObject();
                object3 = object4;
                object3 = object4;
                object2 = new JSONArray();
                object3 = object4;
                object3 = object4;
                charSequence2 = new JSONObject();
                object3 = object4;
                charSequence2.put("vod_id", (Object)string);
                object3 = object4;
                charSequence2.put("vod_name", object);
                object3 = object4;
                charSequence2.put("vod_pic", (Object)"https://img2.baidu.com/it/u=1609185522,4130752057&fm=253&f=JPEG");
                object3 = object4;
                charSequence2.put("type_name", (Object)"\u78c1\u529b");
                object3 = object4;
                charSequence2.put("vod_play_from", (Object)"\u78c1\u529b\u6d4b\u8bd5");
                object3 = object4;
                object3 = object4;
                object = new StringBuilder();
                object3 = object4;
                ((StringBuilder)object).append("\u7acb\u5373\u64ad\u653e$");
                object3 = object4;
                ((StringBuilder)object).append(string);
                object3 = object4;
                charSequence2.put("vod_play_url", (Object)((StringBuilder)object).toString());
                object3 = object4;
                object2.put((Object)charSequence2);
                object3 = object4;
                charSequence.put("list", object2);
                object3 = object4;
                return charSequence.toString();
            }
            object3 = object4;
            if (!string.startsWith("http")) break block237;
            object3 = object4;
            if (!matcher2.find()) break block237;
            object3 = object4;
            return this.getAliContent((List<String>)object);
        }
        object = object4;
        object3 = object4;
        if (!string.startsWith("http")) return object;
        object = object4;
        object3 = object4;
        if (matcher.find()) return object;
        object = object4;
        object3 = object4;
        if (matcher2.find()) return object;
        object3 = object4;
        charSequence = YS.l8(Yy.v(string, null)).LD("head > title").OL();
        object3 = object4;
        object3 = object4;
        charSequence2 = new JSONObject();
        object3 = object4;
        object3 = object4;
        object = new JSONArray();
        object3 = object4;
        object3 = object4;
        object2 = new JSONObject();
        object3 = object4;
        object2.put("vod_id", (Object)string);
        object3 = object4;
        object2.put("vod_name", (Object)charSequence);
        object3 = object4;
        object2.put("vod_pic", (Object)"https://pic.rmb.bdstatic.com/bjh/1d0b02d0f57f0a42201f92caba5107ed.jpeg");
        object3 = object4;
        object2.put("type_name", (Object)"\u55c5\u63a2");
        object3 = object4;
        object2.put("vod_content", (Object)string);
        object3 = object4;
        object2.put("vod_play_from", (Object)"\u55c5\u63a2");
        object3 = object4;
        object3 = object4;
        charSequence = new StringBuilder();
        object3 = object4;
        ((StringBuilder)charSequence).append("\u7acb\u5373\u64ad\u653e\u55c5\u63a2$");
        object3 = object4;
        ((StringBuilder)charSequence).append(string);
        object3 = object4;
        object2.put("vod_play_url", (Object)((StringBuilder)charSequence).toString());
        object3 = object4;
        object.put(object2);
        object3 = object4;
        charSequence2.put("list", object);
        object3 = object4;
        return charSequence2.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String getAliContent(List<String> object) {
        int n2 = 0;
        try {
            int n3;
            Object object2;
            Object object3;
            JSONObject jSONObject;
            String string;
            ArrayList<String> arrayList;
            block14: {
                JSONArray jSONArray;
                block15: {
                    arrayList = ((String)object.get(0)).trim();
                    object = N.matcher((CharSequence)((Object)arrayList));
                    if (!((Matcher)object).find()) {
                        return "";
                    }
                    string = ((Matcher)object).group(1);
                    object = ((Matcher)object).groupCount() == 3 ? ((Matcher)object).group(3) : "";
                    jSONObject = new JSONObject();
                    jSONObject.put("share_id", (Object)string);
                    object3 = zm.l8();
                    object2 = new JSONObject(zm.S("https://api.aliyundrive.com/adrive/v3/share_link/get_share_by_anonymous", jSONObject.toString(), object3));
                    jSONArray = object2.getJSONArray("file_infos");
                    if (jSONArray.length() == 0) {
                        return "";
                    }
                    object3 = null;
                    boolean bl = TextUtils.isEmpty((CharSequence)object);
                    if (bl) break block15;
                    n3 = 0;
                    while (true) {
                        block18: {
                            block17: {
                                block16: {
                                    if (n3 < jSONArray.length()) break block16;
                                    jSONObject = object3;
                                    break block17;
                                }
                                jSONObject = jSONArray.optJSONObject(n3);
                                if (!jSONObject.optString("file_id").equals(jSONObject.optString("file_id"))) break block18;
                            }
                            object3 = jSONObject;
                            if (jSONObject == null) {
                                return "";
                            }
                            break block14;
                        }
                        ++n3;
                    }
                }
                object3 = jSONArray.optJSONObject(0);
                object = object3.optString("file_id");
            }
            jSONObject = new JSONObject();
            jSONObject.put("vod_id", (Object)arrayList);
            jSONObject.put("vod_name", (Object)object2.optString("share_name"));
            jSONObject.put("vod_pic", (Object)object2.optString("avatar"));
            jSONObject.put("vod_content", (Object)arrayList);
            jSONObject.put("vod_play_from", (Object)"AliYun");
            arrayList = new ArrayList<String>();
            if (!object3.optString("type").equals("folder")) {
                if (object3.optString("type").equals("file")) {
                    object3.optString("category").equals("video");
                }
                return "";
            }
            object2 = zm.OL(string, "");
            object3 = new HashMap();
            this.listFiles((Map<String, String>)object3, string, (String)object2, (String)object);
            object = new ArrayList(object3.keySet());
            Collections.sort(object);
            object = ((ArrayList)object).iterator();
            while (true) {
                if (!object.hasNext()) {
                    object = new ArrayList();
                    for (n3 = n2; n3 < 4; ++n3) {
                        ((ArrayList)object).add(TextUtils.join((CharSequence)"#", arrayList));
                    }
                    jSONObject.put("vod_play_url", (Object)TextUtils.join((CharSequence)"$$$", (Iterable)object));
                    object = new JSONObject();
                    object3 = new JSONArray();
                    object3.put((Object)jSONObject);
                    object.put("list", object3);
                    return object.toString();
                }
                string = (String)object.next();
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(string);
                ((StringBuilder)object2).append("$");
                ((StringBuilder)object2).append((String)object3.get(string));
                arrayList.add(((StringBuilder)object2).toString());
            }
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return "";
        }
    }

    public void init(Context context, String string) {
        super.init(context, string);
        HM = string.startsWith("http") ? Yy.v(string, null) : string;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void listFiles(Map<String, String> map, String string, String string2, String object) {
        void var1_5;
        block13: {
            String string3 = "_";
            String string4 = "https://api.aliyundrive.com/adrive/v3/file/list";
            try {
                HashMap<String, String> hashMap = zm.l8();
                hashMap.put("x-share-token", string2);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("image_thumbnail_process", (Object)"image/resize,w_160/format,jpeg");
                jSONObject.put("image_url_process", (Object)"image/resize,w_1920/format,jpeg");
                jSONObject.put("limit", 200);
                jSONObject.put("order_by", (Object)"updated_at");
                jSONObject.put("order_direction", (Object)"DESC");
                jSONObject.put("parent_file_id", object);
                jSONObject.put("share_id", (Object)string);
                jSONObject.put("video_thumbnail_process", (Object)"video/snapshot,t_1000,f_jpg,ar_auto,w_300");
                String string5 = "";
                ArrayList<String> arrayList = new ArrayList<String>();
                object = jSONObject;
                for (int i2 = 1; !(i2 > 50 || i2 >= 2 && TextUtils.isEmpty((CharSequence)string5)); ++i2) {
                    object.put("marker", (Object)string5);
                    jSONObject = new JSONObject(zm.S(string4, object.toString(), hashMap));
                    JSONArray jSONArray = jSONObject.getJSONArray("items");
                    for (int i4 = 0; i4 < jSONArray.length(); ++i4) {
                        StringBuilder stringBuilder;
                        JSONObject jSONObject2 = jSONArray.optJSONObject(i4);
                        boolean bl = jSONObject2.optString("type").equals("folder");
                        if (bl) {
                            arrayList.add(jSONObject2.optString("file_id"));
                            continue;
                        }
                        if (!jSONObject2.optString("mime_type").contains("video")) continue;
                        string5 = jSONObject2.optString("name").replace("#", string3).replace("$", string3);
                        if (string5.length() > 20) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(string5.substring(0, 10));
                            stringBuilder.append("...");
                            stringBuilder.append(string5.substring(string5.length() - 10));
                            string5 = stringBuilder.toString();
                        }
                        String string6 = jSONObject2.optString("file_id");
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(string);
                        stringBuilder.append("+");
                        stringBuilder.append(string2);
                        stringBuilder.append("+");
                        stringBuilder.append(string6);
                        map.put(string5, stringBuilder.toString());
                    }
                    string5 = jSONObject.optString("next_marker");
                }
                object = arrayList.iterator();
            }
            catch (Exception exception) {
                // empty catch block
                break block13;
            }
            while (object.hasNext()) {
                String string7 = (String)object.next();
                try {
                    this.listFiles(map, string, string2, string7);
                }
                catch (Exception exception) {
                    try {
                        SpiderDebug.log((Throwable)exception);
                        return;
                    }
                    catch (Exception exception2) {}
                    break block13;
                }
            }
            return;
        }
        SpiderDebug.log((Throwable)var1_5);
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String playerContent(String string, String jSONObject, List<String> object) {
        int n2 = -1;
        try {
            block14: {
                block12: {
                    block13: {
                        int n3 = string.hashCode();
                        if (n3 == -985752863) break block12;
                        if (n3 == 3406) break block13;
                        if (n3 != 706173) {
                            if (n3 == 1963852404 && string.equals("AliYun")) {
                                n2 = 3;
                            }
                            break block14;
                        } else if (string.equals("\u55c5\u63a2")) {
                            n2 = 2;
                        }
                        break block14;
                    }
                    if (string.equals("jx")) {
                        n2 = 0;
                    }
                    break block14;
                }
                boolean bl = string.equals("player");
                if (bl) {
                    n2 = 1;
                }
            }
            if (n2 == 0) {
                string = new JSONObject();
                string.put("parse", 1);
                string.put("jx", (Object)"1");
                string.put("url", (Object)jSONObject);
                return string.toString();
            }
            if (n2 == 1) {
                string = new JSONObject();
                string.put("parse", 0);
                string.put("playUrl", (Object)"");
                string.put("url", (Object)jSONObject);
                return string.toString();
            }
            if (n2 == 2) {
                string = new JSONObject();
                string.put("parse", 1);
                string.put("playUrl", (Object)"");
                string.put("url", (Object)jSONObject);
                return string.toString();
            }
            if (n2 != 3) {
                return "";
            }
            zm.l();
            jSONObject = jSONObject.split("\\+");
            string = jSONObject[0];
            jSONObject = jSONObject[2];
            object = new StringBuilder();
            ((StringBuilder)object).append(u.localProxyUrl());
            ((StringBuilder)object).append("?do=push&type=m3u8&share_id=");
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append("&file_id=");
            ((StringBuilder)object).append((String)jSONObject);
            string = ((StringBuilder)object).toString();
            jSONObject = new JSONObject();
            jSONObject.put("parse", (Object)"0");
            jSONObject.put("playUrl", (Object)"");
            jSONObject.put("url", (Object)string);
            jSONObject.put("header", (Object)"");
            return jSONObject.toString();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            SpiderDebug.log((Throwable)exception);
        }
        return "";
    }
}

