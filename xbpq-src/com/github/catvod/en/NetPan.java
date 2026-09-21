/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.github.catvod.crawler.Spider
 *  org.json.JSONObject
 */
package com.github.catvod.en;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.en.NetPan$TermuxService;
import com.github.catvod.spider.GuangYaPan;
import com.github.catvod.spider.Quark;
import com.github.catvod.spider.Uc;
import com.github.catvod.spider.XunleiSpider;
import com.github.catvod.spider.Yun115;
import com.github.catvod.spider.YunPan123;
import com.github.catvod.spider.YunPan139;
import com.github.catvod.spider.YunPan189;
import com.github.catvod.spider.merge.J.k;
import com.github.catvod.spider.merge.K.h;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/*
 * Exception performing whole class analysis ignored.
 */
public class NetPan
extends Spider {
    public static final Pattern a = Pattern.compile("(www.aliyundrive.com|www.alipan.com)/s/([^/]+)(/folder/([^/]+))?");
    public static Quark b = new Quark();
    public static Uc c = new Uc();
    public static YunPan139 d = new YunPan139();
    public static YunPan189 e = new YunPan189();
    public static YunPan123 f = new YunPan123();
    public static Yun115 g = new Yun115();
    public static k h = new k();
    public static XunleiSpider i = new XunleiSpider();
    public static GuangYaPan j = new GuangYaPan();
    public static JSONObject k;
    public static JSONObject l;

    public native NetPan();

    public static native /* synthetic */ void a(NetPan var0, String var1, Map var2, String var3);

    public static native /* synthetic */ void b(Context var0);

    private native void c(String var1, String var2, Map var3);

    public static native boolean containNoTransFrom();

    public static native boolean containPuHua();

    private static native void d(Context var0);

    private static native void e(File var0, File var1);

    public static native void exeSb();

    public static native String extractNetName(String var0);

    private static native void f(File var0, File var1);

    public static native List filterNetPanLinks(List var0, Integer var1);

    public static native List findMatches(String var0, String var1);

    private static native void g(File var0, File var1);

    public static native String getIsoDownloadUrl(String var0);

    public static native String getNetPanType(String var0);

    public static native List getTermuxServices();

    public static native String getYunPanPic(String var0);

    private static native void h(File var0);

    private static native File i(File var0, File var1);

    public static native void initOrder(List var0);

    public static native void initOrderByVodId(List var0);

    public static native void initProxy(JSONObject var0);

    public static native void initTg(boolean var0, JSONObject var1);

    public static native boolean isAliPan(String var0);

    public static native boolean isBaidu(String var0);

    public static native boolean isGuangYa(String var0);

    public static native boolean isNetPan(String var0);

    public static native boolean isQuark(String var0);

    public static native boolean isUc(String var0);

    public static native boolean isXunlei(String var0);

    public static native boolean isYun115(String var0);

    public static native boolean isYun123(String var0);

    public static native boolean isYunPan139(String var0);

    public static native boolean isYunPan189(String var0);

    public static native boolean isYunSelf115(String var0);

    public static native boolean isYunSelfBaidu(String var0);

    public static native boolean isYunSelfGuangya(String var0);

    public static native boolean isYunSelfQuark(String var0);

    public static native boolean isYunSelfUc(String var0);

    private static native File j(File var0, String var1);

    private static native void k(String var0, JSONObject var1);

    private static native void l(JSONObject var0);

    private native h m(String var1, String var2, Matcher var3, String var4);

    private static native void n(File var0, InputStream var1);

    public static native Object[] proxy(Map var0);

    public static native void runTermuxServiceCommand(Context var0, NetPan$TermuxService var1, String var2, Boolean var3);

    public static native void showTermuxServiceInput(Context var0, String var1, Boolean var2);

    public static native void writeTvTg();

    public native String detailContent(String var1, String var2, List var3);

    public native String detailContent(List var1);

    public native String detailContentVodPlayFrom(List var1);

    public native String detailContentVodPlayUrl(String var1, List var2);

    public native void init(Context var1, String var2);

    public native String playerContent(String var1, String var2, List var3);
}

