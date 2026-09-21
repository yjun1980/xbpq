/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.en.NetPan;
import com.github.catvod.en.NetPan$TermuxService;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.m0;
import com.github.catvod.spider.merge.I.u;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.g0.a;
import com.github.catvod.spider.merge.g0.b;
import com.github.catvod.spider.merge.g0.c;
import com.github.catvod.spider.merge.g0.d;
import com.github.catvod.spider.merge.g0.e;
import com.github.catvod.spider.merge.g0.f;
import com.github.catvod.spider.merge.g0.g;
import com.github.catvod.spider.merge.g0.i;
import com.github.catvod.spider.merge.g0.j;
import com.github.catvod.spider.merge.i0.m;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class ConfigCenter
extends NetPan {
    public static final String n;
    public static final String o;
    private final Map<String, Runnable> m = new HashMap<String, Runnable>();

    static {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("http://");
        stringBuilder.append(com.github.catvod.spider.merge.i0.m.m());
        stringBuilder.append(":8080");
        n = stringBuilder.toString();
        stringBuilder = com.github.catvod.spider.merge.C.a.c("http://");
        stringBuilder.append(com.github.catvod.spider.merge.i0.m.m());
        stringBuilder.append(":5244");
        o = stringBuilder.toString();
    }

    public ConfigCenter() {
        this.p();
    }

    public static void executeAction(String string) {
        new ConfigCenter().action(string);
    }

    private h o(String string, String string2, String string3, String string4) {
        return new h(string, string2, string2, string3, string4);
    }

    private void p() {
        ((HashMap)this.m).put("\u5f00\u542ffilebrowser", com.github.catvod.spider.merge.g0.h.b);
        ((HashMap)this.m).put("\u5f00\u542falist", com.github.catvod.spider.merge.g0.i.c);
        ((HashMap)this.m).put("\u5f00\u542fsing-box", com.github.catvod.spider.merge.g0.g.d);
        ((HashMap)this.m).put("\u624b\u52a8\u9009\u62e9\u8282\u70b9", com.github.catvod.spider.merge.g0.a.d);
        ((HashMap)this.m).put("\u5f00\u542ftgsou", com.github.catvod.spider.merge.g0.b.d);
        ((HashMap)this.m).put("go\u4ee3\u7406\u72b6\u6001", com.github.catvod.spider.merge.g0.c.d);
        ((HashMap)this.m).put("\u963f\u91cc\u7ebf\u7a0b", com.github.catvod.spider.merge.g0.d.d);
        ((HashMap)this.m).put("\u8bbe\u7f6e\u963f\u91cctoken", com.github.catvod.spider.merge.g0.f.d);
        ((HashMap)this.m).put("\u6446\u6e21\u7ebf\u7a0b", com.github.catvod.spider.merge.g0.e.d);
        ((HashMap)this.m).put("\u5938\u514b\u7ebf\u7a0b", com.github.catvod.spider.merge.g0.h.e);
        ((HashMap)this.m).put("\u8bbe\u7f6e\u5938\u514b cookie", com.github.catvod.spider.merge.g0.i.b);
        ((HashMap)this.m).put("\u6e05\u9664\u672c\u5730\u5938\u514b cookie", com.github.catvod.spider.merge.g0.g.b);
        ((HashMap)this.m).put("UC\u7ebf\u7a0b", com.github.catvod.spider.merge.g0.j.b);
        ((HashMap)this.m).put("\u8bbe\u7f6eUC cookie", com.github.catvod.spider.merge.g0.a.b);
        ((HashMap)this.m).put("\u8bbe\u7f6eUC token", com.github.catvod.spider.merge.g0.b.b);
        ((HashMap)this.m).put("UC UT", com.github.catvod.spider.merge.g0.c.b);
        ((HashMap)this.m).put("\u6e05\u9664\u672c\u5730UC\u6388\u6743", com.github.catvod.spider.merge.g0.d.b);
        ((HashMap)this.m).put("\u8bbe\u7f6e115 cookie", com.github.catvod.spider.merge.g0.f.b);
        ((HashMap)this.m).put("\u6e05\u9664\u672c\u5730115 cookie", com.github.catvod.spider.merge.g0.e.b);
        ((HashMap)this.m).put("115\u5b89\u5168\u5220\u9664\u7801", com.github.catvod.spider.merge.g0.h.c);
        ((HashMap)this.m).put("\u8bbe\u7f6e123\u76d8\u8d26\u53f7", com.github.catvod.spider.merge.g0.g.c);
        ((HashMap)this.m).put("\u6e05\u9664\u672c\u5730_123\u8d26\u53f7\u5bc6\u7801", com.github.catvod.spider.merge.g0.j.c);
        ((HashMap)this.m).put("\u8bbe\u7f6e\u5149\u9e2dtoken", com.github.catvod.spider.merge.g0.a.c);
        ((HashMap)this.m).put("\u6e05\u9664\u5149\u9e2d\u672c\u5730\u6388\u6743", com.github.catvod.spider.merge.g0.b.c);
        ((HashMap)this.m).put("\u8bbe\u7f6e\u5f02\u52a8cookie", com.github.catvod.spider.merge.g0.c.c);
        ((HashMap)this.m).put("\u8bbe\u7f6e\u5929\u610f\u8d26\u53f7", com.github.catvod.spider.merge.g0.d.c);
        ((HashMap)this.m).put("\u8bbe\u7f6e\u8fc5\u96f7\u8d26\u53f7", com.github.catvod.spider.merge.g0.f.c);
        ((HashMap)this.m).put("\u6e05\u9664\u8fc5\u96f7\u672c\u5730\u8d26\u53f7", com.github.catvod.spider.merge.g0.e.c);
        ((HashMap)this.m).put("\u7f51\u76d8\u987a\u5e8f\u3001\u753b\u8d28", com.github.catvod.spider.merge.g0.h.d);
        ((HashMap)this.m).put("\u7f51\u76d8\u4e0b\u8f7d\u5f00\u5173", com.github.catvod.spider.merge.g0.i.d);
        ((HashMap)this.m).put("\u539f\u76d8\u8c03\u7528\u5916\u90e8\u64ad\u653e\u5668", com.github.catvod.spider.merge.g0.j.d);
    }

    /*
     * Unable to fully structure code
     */
    public String action(String var1_1) {
        block7: {
            block6: {
                if (var1_1 != null) {
                    if (!var1_1.startsWith("termux_service_")) break block6;
                    var1_1 = var1_1.substring(15);
                    var2_3 = new m0(var1_1, 3);
                    Init.run(var2_3);
                    return "";
                }
            }
            if (this.m.isEmpty()) {
                this.p();
            }
            if ((var2_4 = (Runnable)this.m.get(var1_1)) == null) ** GOTO lbl16
            try {
                Init.run((Runnable)var2_4);
                break block7;
lbl16:
                // 1 sources

                var2_4 = new StringBuilder();
                var2_4.append("\u672a\u77e5\u64cd\u4f5c: ");
                var2_4.append(var1_1);
                com.github.catvod.spider.merge.i0.m.y(var2_4.toString());
            }
            catch (Exception var1_2) {
                var2_4 = com.github.catvod.spider.merge.C.a.c("\u64cd\u4f5c\u5931\u8d25: ");
                var2_4.append(var1_2.getMessage());
                com.github.catvod.spider.merge.i0.m.y(var2_4.toString());
                var1_2.printStackTrace();
            }
        }
        return "";
    }

    public String categoryContent(String object, String object2, boolean bl, HashMap<String, String> object3) {
        object2 = new ArrayList();
        if ("1".equals(object)) {
            object = new StringBuilder();
            ((StringBuilder)object).append(u.p().c);
            ((StringBuilder)object).append("/api/ping");
            object = com.github.catvod.spider.merge.R0.e.d(com.github.catvod.spider.merge.f0.d.k(((StringBuilder)object).toString())) ? "\u5df2\u542f\u52a8" : "\u672a\u542f\u52a8";
            try {
                ((ArrayList)object2).add(this.o("go\u4ee3\u7406\u72b6\u6001", "go\u4ee3\u7406\u72b6\u6001", "https://is1-ssl.mzstatic.com/image/thumb/Purple221/v4/14/68/e7/1468e7d6-a1d4-e561-ddce-e5c539a4c53f/AppIcon-0-0-1x_U007emarketing-0-4-85-220.png/350x350.png", (String)object));
            }
            catch (Exception exception) {
                ((ArrayList)object2).add(this.o("go\u4ee3\u7406\u72b6\u6001", "go\u4ee3\u7406\u72b6\u6001", "https://is1-ssl.mzstatic.com/image/thumb/Purple221/v4/14/68/e7/1468e7d6-a1d4-e561-ddce-e5c539a4c53f/AppIcon-0-0-1x_U007emarketing-0-4-85-220.png/350x350.png", "\u68c0\u67e5\u5931\u8d25"));
            }
            ((ArrayList)object2).add(this.o("\u5f00\u542fsing-box", "\u5f00\u542fsing-box", "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/c4/25/60/c42560fd-bdd6-a6db-6fbf-0bf4017686d5/AppIcon-0-0-1x_U007emarketing-0-11-0-85-220.png/350x350.png", "\u5f00\u542fsing-box"));
            ((ArrayList)object2).add(this.o("\u5f00\u542ftgsou", "\u5f00\u542ftgsou", "https://is1-ssl.mzstatic.com/image/thumb/Purple221/v4/15/f9/a4/15f9a4ec-71a6-732a-65ef-89dd9b69b8cf/AppIconLLC-0-0-1x_U007emarketing-0-8-0-0-85-220.png/350x350.png", "\u5f00\u542ftgsou"));
            ((ArrayList)object2).add(this.o("\u5f00\u542falist", "\u5f00\u542falist", "https://tse3-mm.cn.bing.net/th/id/OIP-C.MeDRTpt92G3S-_kU9BZJEQHaHa?rs=1&pid=ImgDetMain", o));
            ((ArrayList)object2).add(this.o("\u5f00\u542ffilebrowser", "\u5f00\u542ffilebrowser", "https://is1-ssl.mzstatic.com/image/thumb/Purple114/v4/25/f7/fb/25f7fb4e-f365-3fc6-faed-5aca2925a679/AppIcon-1x_U007emarketing-0-7-0-85-220.png/350x350.png?", n));
            for (NetPan$TermuxService netPan$TermuxService : NetPan.getTermuxServices()) {
                object = com.github.catvod.spider.merge.C.a.c("termux_service_");
                ((StringBuilder)object).append(netPan$TermuxService.a);
                ((ArrayList)object2).add(this.o(((StringBuilder)object).toString(), netPan$TermuxService.b, netPan$TermuxService.c, ""));
            }
        } else if ("2".equals(object)) {
            ((ArrayList)object2).add(this.o("\u7f51\u76d8\u987a\u5e8f\u3001\u753b\u8d28", "\u7f51\u76d8\u987a\u5e8f\u3001\u753b\u8d28", "data:image/jpeg;base64,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", "\u7f51\u76d8\u987a\u5e8f\u3001\u753b\u8d28"));
            ((ArrayList)object2).add(this.o("\u539f\u76d8\u8c03\u7528\u5916\u90e8\u64ad\u653e\u5668", "\u539f\u76d8\u8c03\u7528\u5916\u90e8\u64ad\u653e\u5668", "https://p2.itc.cn/q_70/images03/20220512/0d79a8e7087440b8bc89659252bd6e7f.png", "\u539f\u76d8\u8c03\u7528\u5916\u90e8\u64ad\u653e\u5668"));
            ((ArrayList)object2).add(this.o("\u7f51\u76d8\u4e0b\u8f7d\u5f00\u5173", "\u7f51\u76d8\u4e0b\u8f7d\u5f00\u5173", "https://ts1.cn.mm.bing.net/th/id/R-C.b835f6ba65fadeaf12212ad75b1b7639?rik=Bd%2fdNYLXjLftMA&riu=http%3a%2f%2ffile.keoaeic.org%2fuploads%2fueditor%2fimage%2f20190408%2f%e4%b8%8b%e8%bd%bd%e5%9b%be%e6%a0%87.png&ehk=aYv%2b4gyYoOZ3uswYkr7BYnvi7PRvy0eOu3dzO3d7HNA%3d&risl=&pid=ImgRaw&r=0", "\u7f51\u76d8\u4e0b\u8f7d\u5f00\u5173"));
            if (NetPan.isAliPan("")) {
                ((ArrayList)object2).add(this.o("\u963f\u91cc\u7ebf\u7a0b", "\u963f\u91cc\u7ebf\u7a0b", "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/48/5e/29/485e292b-ed09-47b8-8c41-3402a7fb8936/AppIcon-0-1x_U007epad-0-1-0-85-220-0.png/350x350.png", "\u963f\u91cc\u7ebf\u7a0b"));
                ((ArrayList)object2).add(this.o("\u8bbe\u7f6e\u963f\u91cctoken", "\u8bbe\u7f6e\u963f\u91cctoken", "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/48/5e/29/485e292b-ed09-47b8-8c41-3402a7fb8936/AppIcon-0-1x_U007epad-0-1-0-85-220-0.png/350x350.png", "\u8bbe\u7f6e\u963f\u91cctoken"));
            }
            if (NetPan.isBaidu("")) {
                ((ArrayList)object2).add(this.o("\u6446\u6e21\u7ebf\u7a0b", "\u6446\u6e21\u7ebf\u7a0b", "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/df/92/ee/df92ee21-b113-91fd-d6a9-c63827f1ae28/AppIcon-0-0-1x_U007ephone-0-11-0-0-sRGB-85-220.png/350x350.png", "\u6446\u6e21\u7ebf\u7a0b"));
            }
            if (NetPan.isQuark("")) {
                ((ArrayList)object2).add(this.o("\u5938\u514b\u7ebf\u7a0b", "\u5938\u514b\u7ebf\u7a0b", "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/c7/6c/55/c76c5544-64a5-882a-3862-c68b28f16299/AppIcon-0-0-1x_U007ephone-0-11-0-0-85-220.png/350x350.png", "\u5938\u514b\u7ebf\u7a0b"));
                ((ArrayList)object2).add(this.o("\u8bbe\u7f6e\u5938\u514b cookie", "\u8bbe\u7f6e\u5938\u514b cookie", "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/c7/6c/55/c76c5544-64a5-882a-3862-c68b28f16299/AppIcon-0-0-1x_U007ephone-0-11-0-0-85-220.png/350x350.png", "\u8bbe\u7f6e\u5938\u514b cookie"));
                ((ArrayList)object2).add(this.o("\u6e05\u9664\u672c\u5730\u5938\u514b cookie", "\u6e05\u9664\u672c\u5730\u5938\u514b cookie", "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/c7/6c/55/c76c5544-64a5-882a-3862-c68b28f16299/AppIcon-0-0-1x_U007ephone-0-11-0-0-85-220.png/350x350.png", "\u6e05\u9664\u672c\u5730\u5938\u514b cookie"));
            }
            if (NetPan.isUc("")) {
                ((ArrayList)object2).add(this.o("UC\u7ebf\u7a0b", "UC\u7ebf\u7a0b", "https://ts1.cn.mm.bing.net/th/id/R-C.421c96e47df7c9719403654ee4f7c281?rik=yiiEoGCTgDDc3w&riu=http%3a%2f%2fpic.9663.com%2fupload%2f2023-5%2f20235111411256277.png&ehk=R81N%2flXMrl%2bxpRlST8DtHXDfab6rzaMb83gihuD71Fk%3d&risl=&pid=ImgRaw&r=0", "UC\u7ebf\u7a0b"));
                ((ArrayList)object2).add(this.o("\u8bbe\u7f6eUC cookie", "\u8bbe\u7f6eUC cookie", "https://ts1.cn.mm.bing.net/th/id/R-C.421c96e47df7c9719403654ee4f7c281?rik=yiiEoGCTgDDc3w&riu=http%3a%2f%2fpic.9663.com%2fupload%2f2023-5%2f20235111411256277.png&ehk=R81N%2flXMrl%2bxpRlST8DtHXDfab6rzaMb83gihuD71Fk%3d&risl=&pid=ImgRaw&r=0", "\u8bbe\u7f6eUC cookie"));
                ((ArrayList)object2).add(this.o("\u8bbe\u7f6eUC token", "\u8bbe\u7f6eUC token", "https://ts1.cn.mm.bing.net/th/id/R-C.421c96e47df7c9719403654ee4f7c281?rik=yiiEoGCTgDDc3w&riu=http%3a%2f%2fpic.9663.com%2fupload%2f2023-5%2f20235111411256277.png&ehk=R81N%2flXMrl%2bxpRlST8DtHXDfab6rzaMb83gihuD71Fk%3d&risl=&pid=ImgRaw&r=0", "\u8bbe\u7f6eUC token"));
                ((ArrayList)object2).add(this.o("\u6e05\u9664\u672c\u5730UC\u6388\u6743", "\u6e05\u9664\u672c\u5730UC\u6388\u6743", "https://ts1.cn.mm.bing.net/th/id/R-C.421c96e47df7c9719403654ee4f7c281?rik=yiiEoGCTgDDc3w&riu=http%3a%2f%2fpic.9663.com%2fupload%2f2023-5%2f20235111411256277.png&ehk=R81N%2flXMrl%2bxpRlST8DtHXDfab6rzaMb83gihuD71Fk%3d&risl=&pid=ImgRaw&r=0", "\u6e05\u9664\u672c\u5730UC\u6388\u6743"));
            }
            if (NetPan.isYun115("")) {
                ((ArrayList)object2).add(this.o("\u8bbe\u7f6e115 cookie", "\u8bbe\u7f6e115 cookie", "https://is1-ssl.mzstatic.com/image/thumb/Purple221/v4/5f/ed/bf/5fedbfb2-1431-a324-97c5-327487d5817d/AppIcon-0-0-1x_U007emarketing-0-8-0-0-sRGB-85-220.png/350x350.png", "\u8bbe\u7f6e115 cookie"));
                ((ArrayList)object2).add(this.o("\u6e05\u9664\u672c\u5730115 cookie", "\u6e05\u9664\u672c\u5730115 cookie", "https://is1-ssl.mzstatic.com/image/thumb/Purple221/v4/5f/ed/bf/5fedbfb2-1431-a324-97c5-327487d5817d/AppIcon-0-0-1x_U007emarketing-0-8-0-0-sRGB-85-220.png/350x350.png", "\u6e05\u9664\u672c\u5730115 cookie"));
                ((ArrayList)object2).add(this.o("115\u5b89\u5168\u5220\u9664\u7801", "115\u5b89\u5168\u5220\u9664\u7801", "https://is1-ssl.mzstatic.com/image/thumb/Purple221/v4/5f/ed/bf/5fedbfb2-1431-a324-97c5-327487d5817d/AppIcon-0-0-1x_U007emarketing-0-8-0-0-sRGB-85-220.png/350x350.png", "115\u5b89\u5168\u5220\u9664\u7801"));
            }
            if (NetPan.isYun123("")) {
                ((ArrayList)object2).add(this.o("\u8bbe\u7f6e123\u76d8\u8d26\u53f7", "\u8bbe\u7f6e123\u76d8\u8d26\u53f7", "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/c3/2b/fa/c32bfa72-c460-e1a4-d8a1-ba175f59bbce/AppIcon-0-0-1x_U007emarketing-0-8-0-85-220.png/350x350.png", "\u8bbe\u7f6e123\u76d8\u8d26\u53f7"));
                ((ArrayList)object2).add(this.o("\u6e05\u9664\u672c\u5730_123\u8d26\u53f7\u5bc6\u7801", "\u6e05\u9664\u672c\u5730_123\u8d26\u53f7\u5bc6\u7801", "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/c3/2b/fa/c32bfa72-c460-e1a4-d8a1-ba175f59bbce/AppIcon-0-0-1x_U007emarketing-0-8-0-85-220.png/350x350.png", "\u6e05\u9664\u672c\u5730_123\u8d26\u53f7\u5bc6\u7801"));
            }
            if (NetPan.isGuangYa("")) {
                ((ArrayList)object2).add(this.o("\u8bbe\u7f6e\u5149\u9e2dtoken", "\u8bbe\u7f6e\u5149\u9e2dtoken", "https://pp.myapp.com/ma_icon/0/icon_54641066_1776429411/256", "\u8bbe\u7f6e\u5149\u9e2dtoken"));
                ((ArrayList)object2).add(this.o("\u6e05\u9664\u5149\u9e2d\u672c\u5730\u6388\u6743", "\u6e05\u9664\u5149\u9e2d\u672c\u5730\u6388\u6743", "https://pp.myapp.com/ma_icon/0/icon_54641066_1776429411/256", "\u6e05\u9664\u5149\u9e2d\u672c\u5730\u6388\u6743"));
            }
            if (NetPan.isYunPan189("")) {
                ((ArrayList)object2).add(this.o("\u8bbe\u7f6e\u5929\u610f\u8d26\u53f7", "\u8bbe\u7f6e\u5929\u610f\u8d26\u53f7", "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/a8/fa/f0/a8faf032-0fa4-d9c5-ac70-920d9c84dff1/AppIcon-0-0-1x_U007emarketing-0-7-0-0-sRGB-85-220.png/350x350.png", "\u8bbe\u7f6e\u5929\u610f\u8d26\u53f7"));
            }
            if (NetPan.isYunPan139("")) {
                ((ArrayList)object2).add(this.o("\u8bbe\u7f6e\u5f02\u52a8cookie", "\u8bbe\u7f6e\u5f02\u52a8cookie", "https://is1-ssl.mzstatic.com/image/thumb/Purple221/v4/87/17/34/871734bc-6a96-b3bb-55d4-72908f285eef/AppIcon-0-0-1x_U007ephone-0-5-0-85-220-0.png/460x0w.webp", "\u8bbe\u7f6e\u5f02\u52a8cookie"));
            }
            if (NetPan.isXunlei("")) {
                ((ArrayList)object2).add(this.o("\u8bbe\u7f6e\u8fc5\u96f7\u8d26\u53f7", "\u8bbe\u7f6e\u8fc5\u96f7\u8d26\u53f7", "https://pp.myapp.com/ma_icon/0/icon_113692_1776673175/256", "\u8bbe\u7f6e\u8fc5\u96f7\u8d26\u53f7"));
                ((ArrayList)object2).add(this.o("\u6e05\u9664\u8fc5\u96f7\u672c\u5730\u8d26\u53f7", "\u6e05\u9664\u8fc5\u96f7\u672c\u5730\u8d26\u53f7", "https://pp.myapp.com/ma_icon/0/icon_113692_1776673175/256", "\u6e05\u9664\u8fc5\u96f7\u672c\u5730\u8d26\u53f7"));
            }
        }
        object = new com.github.catvod.spider.merge.K.f();
        ((com.github.catvod.spider.merge.K.f)object).y((List<h>)object2);
        ((com.github.catvod.spider.merge.K.f)object).k(1, 1, 0, 1);
        return ((com.github.catvod.spider.merge.K.f)object).toString();
    }

    public String homeContent(boolean bl) {
        ArrayList<com.github.catvod.spider.merge.K.a> arrayList = new ArrayList<com.github.catvod.spider.merge.K.a>();
        arrayList.add(new com.github.catvod.spider.merge.K.a("1", "\u5e94\u7528\u4e2d\u5fc3"));
        arrayList.add(new com.github.catvod.spider.merge.K.a("2", "\u7f51\u76d8\u914d\u7f6e"));
        return com.github.catvod.spider.merge.K.f.r(arrayList, new ArrayList<h>());
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void init(Context object, String string) {
        String string2;
        super.init((Context)object, string2);
        try {
            JsonObject jsonObject = JsonParser.parseString((String)string2).getAsJsonObject();
            if (jsonObject.get("services") != null) {
                void var1_5;
                JSONObject jSONObject;
                String string3 = string2 = jsonObject.get("services").getAsString();
                if (string2.startsWith("http")) {
                    String string4 = com.github.catvod.spider.merge.f0.d.k(string2);
                }
                NetPan.l = jSONObject = new JSONObject(var1_5.trim());
            }
        }
        catch (JSONException jSONException) {}
        this.p();
    }
}

