/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  com.github.catvod.crawler.SpiderDebug
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.I.O0;
import com.github.catvod.spider.merge.I.u;
import com.github.catvod.spider.merge.K.a;
import com.github.catvod.spider.merge.K.b;
import com.github.catvod.spider.merge.K.c;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.R0.e;
import com.github.catvod.spider.merge.f0.d;
import com.github.catvod.spider.merge.i0.m;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public class Emby
extends NetPan {
    private static final ConcurrentHashMap<String, JSONObject> u = new ConcurrentHashMap();
    private String m = "";
    private String n = "";
    private String o = "";
    private Map<String, String> p;
    private String q = "";
    private String r = "0.2.3";
    private String s = "";
    private String t = "";

    public static long getRandomPositionTicksSafe(long l2) {
        long l3;
        while ((l3 = new Random().nextLong() % l2) < 0L) {
        }
        return l3;
    }

    private String o(String charSequence, Map<String, String> object) {
        if (!object.isEmpty()) {
            charSequence = new StringBuilder((String)charSequence);
            ((StringBuilder)charSequence).append("?");
            for (Map.Entry exception : object.entrySet()) {
                try {
                    ((StringBuilder)charSequence).append(URLEncoder.encode((String)exception.getKey(), "UTF-8"));
                    ((StringBuilder)charSequence).append("=");
                    ((StringBuilder)charSequence).append(URLEncoder.encode((String)exception.getValue(), "UTF-8"));
                    ((StringBuilder)charSequence).append("&");
                }
                catch (Exception exception2) {}
            }
            if (((StringBuilder)charSequence).charAt(((StringBuilder)charSequence).length() - 1) == '&') {
                ((StringBuilder)charSequence).deleteCharAt(((StringBuilder)charSequence).length() - 1);
            }
            charSequence = ((StringBuilder)charSequence).toString();
        }
        return charSequence;
    }

    private String p(String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return "";
        }
        return string.replace("\u00a0", " ").replace("&nbsp;", " ").replace("&amp;", "&").trim();
    }

    private JSONObject q() {
        Object object;
        ConcurrentHashMap<String, JSONObject> concurrentHashMap;
        String string;
        block3: {
            try {
                string = String.format("emby_%s_%s_%s", this.m, this.n, this.o);
                concurrentHashMap = u;
                object = concurrentHashMap.get(string);
                if (object == null) break block3;
                return object;
            }
            catch (Exception exception) {
                SpiderDebug.log((Throwable)exception);
                return null;
            }
        }
        String string2 = String.format("%s/emby/Users/AuthenticateByName", this.m);
        object = new HashMap(this.p);
        ((HashMap)object).put("Content-Type", "application/json; charset=UTF-8");
        Serializable serializable = new HashMap();
        ((HashMap)serializable).put("Username", this.n);
        ((HashMap)serializable).put("Password", this.o);
        ((HashMap)serializable).put("Pw", this.o);
        ((HashMap)serializable).put("X-Emby-Client", this.q);
        ((HashMap)serializable).put("X-Emby-Device-Name", this.s);
        ((HashMap)serializable).put("X-Emby-Device-Id", this.t);
        ((HashMap)serializable).put("X-Emby-Client-Version", this.r);
        string2 = this.o(string2, (Map<String, String>)((Object)serializable));
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append("Username=");
        ((StringBuilder)serializable).append(this.n);
        ((StringBuilder)serializable).append("&Pw=");
        ((StringBuilder)serializable).append(this.o);
        object = com.github.catvod.spider.merge.f0.d.h(((StringBuilder)serializable).toString(), string2, (Map<String, String>)object);
        string2 = new JSONObject((String)object);
        concurrentHashMap.put(string, (JSONObject)string2);
        return string2;
    }

    private List<c> r() {
        ArrayList<c> arrayList = new ArrayList<c>();
        Object object = com.github.catvod.spider.merge.i0.m.a;
        int n2 = Calendar.getInstance().get(1);
        ArrayList<b> arrayList2 = new ArrayList<b>();
        for (int i2 = 0; i2 < 10; ++i2) {
            object = String.valueOf(n2 - i2);
            arrayList2.add(new b((String)object, (String)object));
        }
        arrayList.add(new c("year", "\u5e74\u4efd\u7b5b\u9009", arrayList2));
        arrayList.add(new c("type", "\u6392\u5e8f\u7c7b\u578b", Arrays.asList(new b("IMDb\u8bc4\u5206", "CommunityRating,SortName"), new b("\u52a0\u5165\u65e5\u671f", "DateCreated,SortName"), new b("\u64ad\u653e\u65e5\u671f", "SeriesDatePlayed,SortName"), new b("\u5e74\u4efd", "ProductionYear,SortName"), new b("\u53d1\u884c\u65e5\u671f", "ProductionYear,PremiereDate,SortName"))));
        arrayList.add(new c("order", "\u6392\u5e8f\u65b9\u5f0f", Arrays.asList(new b("\u2b06", "Ascending"), new b("\u2b07", "Descending"))));
        return arrayList;
    }

    private void s(JSONObject object, String[] stringArray, Map<String, String> map, JSONObject object2) {
        long l2;
        String string = String.format("%s/emby/Sessions/Playing", this.m);
        Object object3 = new HashMap<String, String>();
        ((HashMap)object3).put("X-Emby-Client", object.getJSONObject("SessionInfo").getString("Client"));
        ((HashMap)object3).put("X-Emby-Device-Name", object.getJSONObject("SessionInfo").getString("DeviceName"));
        ((HashMap)object3).put("X-Emby-Device-Id", object.getJSONObject("SessionInfo").getString("DeviceId"));
        ((HashMap)object3).put("X-Emby-Client-Version", object.getJSONObject("SessionInfo").getString("ApplicationVersion"));
        ((HashMap)object3).put("X-Emby-Token", object.getString("AccessToken"));
        ((HashMap)object3).put("reqformat", "json");
        object3 = this.o(string, (Map<String, String>)object3);
        object = object2.getJSONArray("MediaSources").getJSONObject(0).getString("Id");
        string = object2.getString("PlaySessionId");
        try {
            l2 = object2.getJSONArray("MediaSources").getJSONObject(0).getLong("RunTimeTicks");
        }
        catch (Exception exception) {
            l2 = 255L;
        }
        long l3 = Emby.getRandomPositionTicksSafe(l2);
        long l4 = System.currentTimeMillis();
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("{\"VolumeLevel\":100,\"IsMuted\":false,\"IsPaused\":false,\"RepeatMode\":\"RepeatNone\",\"Shuffle\":false,\"SubtitleOffset\":0,\"PlaybackRate\":1,\"MaxStreamingBitrate\":3570000,\"PositionTicks\":");
        ((StringBuilder)object2).append(l3);
        ((StringBuilder)object2).append(",\"PlaybackStartTimeTicks\":");
        ((StringBuilder)object2).append(l4 * 10000L);
        ((StringBuilder)object2).append(",\"SubtitleStreamIndex\":-1,\"AudioStreamIndex\":1,\"BufferedRanges\":[{\"start\":3269220000.0000005,\"end\":3302400000},{\"start\":5224970000,\"end\":5283330000}],\"SeekableRanges\":[{\"start\":0,\"end\":");
        ((StringBuilder)object2).append(l2);
        ((StringBuilder)object2).append("}],\"PlayMethod\":\"DirectStream\",\"PlaySessionId\":\"");
        O0.a((StringBuilder)object2, string, "\",\"MediaSourceId\":\"", (String)object, "\",\"CanSeek\":true,\"ItemId\":\"");
        ((StringBuilder)object2).append(stringArray[0]);
        ((StringBuilder)object2).append("\",\"PlaylistIndex\":0,\"PlaylistLength\":15,\"NowPlayingQueue\":[{\"Id\":\"");
        ((StringBuilder)object2).append(stringArray[0]);
        ((StringBuilder)object2).append("\",\"PlaylistItemId\":\"playlistItem0\"},{\"Id\":\"50175\",\"PlaylistItemId\":\"playlistItem1\"},{\"Id\":\"50173\",\"PlaylistItemId\":\"playlistItem2\"},{\"Id\":\"50172\",\"PlaylistItemId\":\"playlistItem3\"},{\"Id\":\"50174\",\"PlaylistItemId\":\"playlistItem4\"},{\"Id\":\"50171\",\"PlaylistItemId\":\"playlistItem5\"},{\"Id\":\"50176\",\"PlaylistItemId\":\"playlistItem6\"},{\"Id\":\"50377\",\"PlaylistItemId\":\"playlistItem7\"},{\"Id\":\"50378\",\"PlaylistItemId\":\"playlistItem8\"},{\"Id\":\"51133\",\"PlaylistItemId\":\"playlistItem9\"},{\"Id\":\"51134\",\"PlaylistItemId\":\"playlistItem10\"},{\"Id\":\"51332\",\"PlaylistItemId\":\"playlistItem11\"},{\"Id\":\"51452\",\"PlaylistItemId\":\"playlistItem12\"},{\"Id\":\"51608\",\"PlaylistItemId\":\"playlistItem13\"},{\"Id\":\"51938\",\"PlaylistItemId\":\"playlistItem14\"}]}");
        com.github.catvod.spider.merge.f0.d.f((String)object3, ((StringBuilder)object2).toString(), map).a();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String categoryContent(String var1_1, String var2_3, boolean var3_4, HashMap<String, String> var4_5) {
        var13_6 = this.q();
        if (var13_6 == null) {
            return com.github.catvod.spider.merge.K.f.d("\u83b7\u53d6Emby\u670d\u52a1\u5668\u4fe1\u606f\u51fa\u9519");
        }
        var6_7 = Integer.parseInt((String)var2_3);
        var10_8 = new HashMap(this.p);
        var10_8.put((String)"Content-Type", (String)"application/json; charset=UTF-8");
        var2_3 = this.m;
        var8_9 = "Primary";
        var12_10 = String.format("%s/emby/Users/%s/Items", new Object[]{var2_3, var13_6.getJSONObject("User").getString("Id")});
        var11_11 = new HashMap();
        var2_3 = var13_6.getJSONObject("SessionInfo");
        var9_12 = "ImageTags";
        var11_11.put("X-Emby-Client", var2_3.getString("Client"));
        var11_11.put("X-Emby-Device-Name", var13_6.getJSONObject("SessionInfo").getString("DeviceName"));
        var11_11.put("X-Emby-Device-Id", var13_6.getJSONObject("SessionInfo").getString("DeviceId"));
        var11_11.put("X-Emby-Client-Version", var13_6.getJSONObject("SessionInfo").getString("ApplicationVersion"));
        var11_11.put("X-Emby-Token", var13_6.getString("AccessToken"));
        var2_3 = com.github.catvod.spider.merge.R0.e.b((CharSequence)var4_5.get("type")) != false ? "DateCreated,SortName" : (String)var4_5.get("type");
        var11_11.put("SortBy", var2_3);
        var11_11.put("IncludeItemTypes", "Movie,Series");
        var2_3 = com.github.catvod.spider.merge.R0.e.b((CharSequence)var4_5.get("order")) != false ? "Descending" : (String)var4_5.get("order");
        var11_11.put("SortOrder", var2_3);
        var11_11.put("ParentId", var1_1);
        if (com.github.catvod.spider.merge.R0.e.d((CharSequence)var4_5.get("year"))) {
            var11_11.put("Years", (String)var4_5.get("year"));
        }
        var11_11.put("Recursive", "true");
        var11_11.put("Limit", "30");
        var11_11.put("ImageTypeLimit", "1");
        var11_11.put("StartIndex", String.valueOf((var6_7 - 1) * 30));
        var11_11.put("EnableImageTypes", "Primary,Backdrop,Thumb,Banner");
        var11_11.put("Fields", "BasicSyncInfo,CanDelete,Container,PrimaryImageAspectRatio,ProductionYear,CommunityRating,Status,CriticRating,EndDate,Path");
        var11_11.put("EnableUserData", "true");
        var1_1 = com.github.catvod.spider.merge.f0.d.l(this.o((String)var12_10, (Map<String, String>)var11_11), var10_8, null);
        var4_5 = new JSONObject((String)var1_1);
        var11_11 = var4_5.getJSONArray("Items");
        var10_8 = new ArrayList();
        var1_1 = var8_9;
        var2_3 = var9_12;
        for (var5_14 = 0; var5_14 < var11_11.length(); ++var5_14) {
            var9_12 = var11_11.getJSONObject(var5_14);
            var8_9 = new h();
            var8_9.l(var9_12.getString("Id"));
            var8_9.m(this.p(var9_12.getString("Name")));
            if (!var9_12.has((String)var2_3) || !(var12_10 = var9_12.getJSONObject((String)var2_3)).has((String)var1_1)) ** break block10
            var8_9.n(String.format("%s/emby/Items/%s/Images/Primary?maxWidth=400&tag=%s&quality=90", new Object[]{this.m, var9_12.getString("Id"), var9_12.getJSONObject((String)var2_3).getString((String)var1_1)}));
        }
        ** GOTO lbl92
        {
            try {
                var12_10 = new StringBuilder();
                var12_10.append("\u2b50");
                var12_10.append(var9_12.getString("CommunityRating"));
                var12_10.append(" \ud83d\udcfa");
                var12_10.append(var9_12.getJSONObject("UserData").getString("UnplayedItemCount"));
                var12_10.append(" ");
                var12_10.append(var9_12.getInt("ProductionYear"));
                var12_10.append("\u5e74");
                var8_9.q(var12_10.toString());
                ** GOTO lbl88
            }
            catch (Exception var9_13) {
                SpiderDebug.log((Throwable)var9_13);
lbl88:
                // 2 sources

                var10_8.add(var8_9);
                continue;
lbl92:
                // 2 sources

                var7_15 = var4_5.optInt("TotalRecordCount", 0);
                var5_14 = var6_7 * 30 < var7_15 ? var6_7 + 1 : var6_7;
                try {
                    var1_1 = new f();
                    var1_1.y((List<h>)var10_8);
                    var1_1.k(var6_7, var5_14, 30, var7_15);
                    return var1_1.toString();
                }
                catch (Exception var1_2) {
                    SpiderDebug.log((Throwable)var1_2);
                    var2_3 = new StringBuilder();
                    var2_3.append("\u83b7\u53d6\u5931\u8d25: ");
                    var2_3.append(var1_2.getMessage());
                    return com.github.catvod.spider.merge.K.f.d(var2_3.toString());
                    break;
                }
            }
        }
    }

    /*
     * Exception decompiling
     */
    public String detailContent(List<String> var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [40[CATCHBLOCK]], but top level block is 60[UNCONDITIONALDOLOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String homeContent(boolean bl) {
        Object object;
        JSONObject jSONObject;
        Object object2;
        try {
            object2 = this.q();
            if (object2 == null) {
                return com.github.catvod.spider.merge.K.f.d("\u83b7\u53d6Emby\u670d\u52a1\u5668\u4fe1\u606f\u51fa\u9519");
            }
            jSONObject = new JSONObject(this.p);
            jSONObject.put("Content-Type", "application/json; charset=UTF-8");
            object = this.m;
            Object object3 = String.format("%s/emby/Users/%s/Views", object, object2.getJSONObject("User").getString("Id"));
            object = new Object();
            ((HashMap)object).put("X-Emby-Client", object2.getJSONObject("SessionInfo").getString("Client"));
            ((HashMap)object).put("X-Emby-Device-Name", object2.getJSONObject("SessionInfo").getString("DeviceName"));
            ((HashMap)object).put("X-Emby-Device-Id", object2.getJSONObject("SessionInfo").getString("DeviceId"));
            ((HashMap)object).put("X-Emby-Client-Version", object2.getJSONObject("SessionInfo").getString("ApplicationVersion"));
            ((HashMap)object).put("X-Emby-Token", object2.getString("AccessToken"));
            jSONObject = com.github.catvod.spider.merge.f0.d.l(this.o((String)object3, (Map<String, String>)object), (Map<String, String>)jSONObject, null);
            object2 = new JSONObject((String)jSONObject);
            JSONArray jSONArray = object2.getJSONArray("Items");
            object2 = new ArrayList();
            for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
                jSONObject = jSONArray.getJSONObject(i2);
                object = jSONObject.getString("Name");
                if (((String)object).contains("\u64ad\u653e\u5217\u8868") || ((String)object).contains("\u76f8\u673a")) continue;
                object3 = new a(jSONObject.getString("Id"), (String)object);
                ((ArrayList)object2).add(object3);
            }
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            jSONObject = new StringBuilder();
            jSONObject.append("\u83b7\u53d6\u5931\u8d25: ");
            jSONObject.append(exception.getMessage());
            return com.github.catvod.spider.merge.K.f.d(jSONObject.toString());
        }
        {
            jSONObject = new JSONObject();
            object = ((ArrayList)object2).iterator();
            while (object.hasNext()) {
                jSONObject.put((String)((a)object.next()).a(), this.r());
            }
            return com.github.catvod.spider.merge.K.f.q((List<a>)object2, jSONObject);
        }
    }

    public String homeVideoContent() {
        return com.github.catvod.spider.merge.K.f.r(new ArrayList<a>(), new ArrayList<h>());
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void init(Context object, String string) {
        void var2_7;
        super.init((Context)object, (String)var2_7);
        try {
            void var1_4;
            JSONObject jSONObject = new JSONObject((String)var2_7);
            this.m = jSONObject.optString("server", "").replaceAll("/$", "");
            this.n = jSONObject.optString("username", "");
            this.o = jSONObject.optString("password", "");
            this.s = jSONObject.optString("deviceName", "");
            if (com.github.catvod.spider.merge.R0.e.d(jSONObject.optString("deviceId"))) {
                String string2 = jSONObject.optString("deviceId", "");
            } else {
                String string3 = UUID.randomUUID().toString();
            }
            this.t = var1_4;
            this.q = jSONObject.optString("client", "");
            if (com.github.catvod.spider.merge.R0.e.d(jSONObject.optString("clientVersion"))) {
                this.r = jSONObject.optString("clientVersion", "");
            }
            HashMap<String, String> hashMap = new HashMap<String, String>();
            this.p = hashMap;
            boolean bl = com.github.catvod.spider.merge.R0.e.d(jSONObject.optString("ua"));
            if (bl) {
                ((HashMap)this.p).put("User-Agent", jSONObject.optString("ua"));
                return;
            }
            ((HashMap)this.p).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
            return;
        }
        catch (Exception exception) {
            this.m = "";
            this.n = "";
            this.o = "";
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String playerContent(String charSequence, String serializable, List<String> object) {
        try {
            if (BaseApi.isOk("emby")) {
                return "";
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("emby playerContent pid:");
            ((StringBuilder)charSequence).append((String)((Object)serializable));
            SpiderDebug.log((String)((StringBuilder)charSequence).toString());
            charSequence = ((String)((Object)serializable)).split("\\+");
            object = this.q();
            if (object == null) {
                return com.github.catvod.spider.merge.K.f.d("\u83b7\u53d6Emby\u670d\u52a1\u5668\u4fe1\u606f\u51fa\u9519");
            }
            serializable = new HashMap(this.p);
            ((HashMap)serializable).put("Content-Type", "application/json; charset=UTF-8");
            CharSequence charSequence2 = String.format("%s/emby/Items/%s/PlaybackInfo", this.m, charSequence[0]);
            HashMap<String, String> hashMap = new HashMap<String, String>();
            hashMap.put("UserId", object.getJSONObject("User").getString("Id"));
            hashMap.put("IsPlayback", "false");
            hashMap.put("AutoOpenLiveStream", "false");
            hashMap.put("StartTimeTicks", "0");
            hashMap.put("MaxStreamingBitrate", "2147483647");
            hashMap.put("X-Emby-Client", object.getJSONObject("SessionInfo").getString("Client"));
            hashMap.put("X-Emby-Device-Name", object.getJSONObject("SessionInfo").getString("DeviceName"));
            hashMap.put("X-Emby-Device-Id", object.getJSONObject("SessionInfo").getString("DeviceId"));
            hashMap.put("X-Emby-Client-Version", object.getJSONObject("SessionInfo").getString("ApplicationVersion"));
            hashMap.put("X-Emby-Token", object.getString("AccessToken"));
            charSequence2 = com.github.catvod.spider.merge.f0.d.f(this.o((String)charSequence2, hashMap), "{\"DeviceProfile\":{\"SubtitleProfiles\":[{\"Method\":\"Embed\",\"Format\":\"ass\"},{\"Format\":\"ssa\",\"Method\":\"Embed\"},{\"Format\":\"subrip\",\"Method\":\"Embed\"},{\"Format\":\"sub\",\"Method\":\"Embed\"},{\"Method\":\"Embed\",\"Format\":\"pgssub\"},{\"Format\":\"subrip\",\"Method\":\"External\"},{\"Method\":\"External\",\"Format\":\"sub\"},{\"Method\":\"External\",\"Format\":\"ass\"},{\"Format\":\"ssa\",\"Method\":\"External\"},{\"Method\":\"External\",\"Format\":\"vtt\"},{\"Method\":\"External\",\"Format\":\"ass\"},{\"Format\":\"ssa\",\"Method\":\"External\"}],\"CodecProfiles\":[{\"Codec\":\"h264\",\"Type\":\"Video\",\"ApplyConditions\":[{\"Property\":\"IsAnamorphic\",\"Value\":\"true\",\"Condition\":\"NotEquals\",\"IsRequired\":false},{\"IsRequired\":false,\"Value\":\"high|main|baseline|constrained baseline\",\"Condition\":\"EqualsAny\",\"Property\":\"VideoProfile\"},{\"IsRequired\":false,\"Value\":\"80\",\"Condition\":\"LessThanEqual\",\"Property\":\"VideoLevel\"},{\"IsRequired\":false,\"Value\":\"true\",\"Condition\":\"NotEquals\",\"Property\":\"IsInterlaced\"}]},{\"Codec\":\"hevc\",\"ApplyConditions\":[{\"Property\":\"IsAnamorphic\",\"Value\":\"true\",\"Condition\":\"NotEquals\",\"IsRequired\":false},{\"IsRequired\":false,\"Value\":\"high|main|main 10\",\"Condition\":\"EqualsAny\",\"Property\":\"VideoProfile\"},{\"Property\":\"VideoLevel\",\"Value\":\"175\",\"Condition\":\"LessThanEqual\",\"IsRequired\":false},{\"IsRequired\":false,\"Value\":\"true\",\"Condition\":\"NotEquals\",\"Property\":\"IsInterlaced\"}],\"Type\":\"Video\"}],\"MaxStreamingBitrate\":40000000,\"TranscodingProfiles\":[{\"Container\":\"ts\",\"AudioCodec\":\"aac,mp3,wav,ac3,eac3,flac,opus\",\"VideoCodec\":\"hevc,h264,mpeg4\",\"BreakOnNonKeyFrames\":true,\"Type\":\"Video\",\"MaxAudioChannels\":\"6\",\"Protocol\":\"hls\",\"Context\":\"Streaming\",\"MinSegments\":2}],\"DirectPlayProfiles\":[{\"Container\":\"mov,mp4,mkv,hls,webm\",\"Type\":\"Video\",\"VideoCodec\":\"h264,hevc,dvhe,dvh1,h264,hevc,hev1,mpeg4,vp9\",\"AudioCodec\":\"aac,mp3,wav,ac3,eac3,flac,truehd,dts,dca,opus,pcm,pcm_s24le\"}],\"ResponseProfiles\":[{\"MimeType\":\"video/mp4\",\"Type\":\"Video\",\"Container\":\"m4v\"}],\"ContainerProfiles\":[],\"MusicStreamingTranscodingBitrate\":40000000,\"MaxStaticBitrate\":40000000}}", (Map<String, String>)((Object)serializable)).a();
            JSONObject jSONObject = new JSONObject((String)charSequence2);
            this.s((JSONObject)object, (String[])charSequence, (Map<String, String>)((Object)serializable), jSONObject);
            object = jSONObject.getJSONArray("MediaSources");
            serializable = new ArrayList();
            for (int n2 = 0; n2 < object.length(); charSequence2 = ((StringBuilder)charSequence2).toString(), ++n2) {
                String string = object.getJSONObject(n2).getString("DirectStreamUrl");
                charSequence2 = new StringBuilder();
                ((StringBuilder)charSequence2).append("[");
                ((StringBuilder)charSequence2).append(com.github.catvod.spider.merge.i0.m.o(Double.parseDouble(object.getJSONObject(n2).getString("Size"))));
                ((StringBuilder)charSequence2).append("]");
                ((StringBuilder)charSequence2).append(object.getJSONObject(n2).getString("Name"));
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.m);
                stringBuilder.append("/emby");
                stringBuilder.append(string);
                String string2 = stringBuilder.toString();
                ((ArrayList)serializable).add(charSequence2);
                ((ArrayList)serializable).add(string2);
            }
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append("\u64ad\u653e\u5931\u8d25: ");
            ((StringBuilder)serializable).append(exception.getMessage());
            return com.github.catvod.spider.merge.K.f.d(((StringBuilder)serializable).toString());
        }
        {
            object = new f();
            ((f)object).x((List<String>)((Object)serializable));
            ((f)object).b(com.github.catvod.spider.merge.I.u.p().r((String[])charSequence));
            ((f)object).g(this.p);
            ((f)object).m(0);
            return ((f)object).toString();
        }
    }

    public String searchContent(String string, boolean bl) {
        return this.searchContent(string, bl, "1");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String searchContent(String var1_1, boolean var2_2, String var3_3) {
        var5_5 = this.q();
        if (var5_5 == null) {
            return com.github.catvod.spider.merge.K.f.d("\u83b7\u53d6Emby\u670d\u52a1\u5668\u4fe1\u606f\u51fa\u9519");
        }
        var4_6 = Integer.parseInt(var3_3);
        var6_7 = new HashMap(this.p);
        var6_7.put((String)"Content-Type", (String)"application/json; charset=UTF-8");
        var7_9 = String.format("%s/emby/Users/%s/Items", new Object[]{this.m, var5_5.getJSONObject("User").getString("Id")});
        var3_3 = new ArrayList<h>();
        var3_3.put("X-Emby-Client", var5_5.getJSONObject("SessionInfo").getString("Client"));
        var3_3.put("X-Emby-Device-Name", var5_5.getJSONObject("SessionInfo").getString("DeviceName"));
        var3_3.put("X-Emby-Device-Id", var5_5.getJSONObject("SessionInfo").getString("DeviceId"));
        var3_3.put("X-Emby-Client-Version", var5_5.getJSONObject("SessionInfo").getString("ApplicationVersion"));
        var3_3.put("X-Emby-Token", var5_5.getString("AccessToken"));
        var3_3.put("SortBy", "SortName");
        var3_3.put("SortOrder", "Ascending");
        var3_3.put("Fields", "BasicSyncInfo,CanDelete,Container,PrimaryImageAspectRatio,ProductionYear,Status,EndDate,CommunityRating");
        var3_3.put("StartIndex", String.valueOf((var4_6 - 1) * 50));
        var3_3.put("EnableImageTypes", "Primary,Backdrop,Thumb");
        var3_3.put("ImageTypeLimit", "1");
        var3_3.put("Recursive", "true");
        var3_3.put("SearchTerm", var1_1);
        var3_3.put("IncludeItemTypes", "Movie,Series,BoxSet");
        var3_3.put("GroupProgramsBySeries", "true");
        var3_3.put("Limit", "50");
        var3_3.put("EnableTotalRecordCount", "true");
        var3_3 = com.github.catvod.spider.merge.f0.d.l(this.o((String)var7_9, (Map<String, String>)var3_3), var6_7, null);
        var1_1 = new JSONObject((String)var3_3);
        var1_1 = var1_1.getJSONArray("Items");
        var3_3 = new ArrayList<h>();
        for (var4_6 = 0; var4_6 < var1_1.length(); ++var4_6) {
            var6_7 = var1_1.getJSONObject(var4_6);
            var5_5 = new h();
            var5_5.l(var6_7.getString("Id"));
            var5_5.m(this.p(var6_7.getString("Name")));
            if (!var6_7.has("ImageTags") || !var6_7.getJSONObject("ImageTags").has("Primary")) ** break block8
            var5_5.n(String.format("%s/emby/Items/%s/Images/Primary?maxWidth=400&tag=%s&quality=90", new Object[]{this.m, var6_7.getString("Id"), var6_7.getJSONObject("ImageTags").getString("Primary")}));
        }
        ** GOTO lbl82
        {
            try {
                var7_9 = new StringBuilder();
                var7_9.append("\u2b50");
                var7_9.append(var6_7.getString("CommunityRating"));
                var7_9.append(" \ud83d\udcfa");
                var7_9.append(var6_7.getJSONObject("UserData").getString("UnplayedItemCount"));
                var7_9.append(" ");
                var7_9.append(var6_7.getInt("ProductionYear"));
                var7_9.append("\u5e74");
                var5_5.q(var7_9.toString());
                ** GOTO lbl79
            }
            catch (Exception var6_8) {
                SpiderDebug.log((Throwable)var6_8);
lbl79:
                // 2 sources

                var3_3.add((h)var5_5);
                continue;
lbl82:
                // 1 sources

                try {
                    return com.github.catvod.spider.merge.K.f.o(var3_3);
                }
                catch (Exception var3_4) {
                    SpiderDebug.log((Throwable)var3_4);
                    var1_1 = new StringBuilder();
                    var1_1.append("\u641c\u7d22\u5931\u8d25: ");
                    var1_1.append(var3_4.getMessage());
                    return com.github.catvod.spider.merge.K.f.d(var1_1.toString());
                    break;
                }
            }
        }
    }
}

