/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  com.github.catvod.crawler.SpiderDebug
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge.I;

import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.A.c;
import com.github.catvod.spider.merge.G1.d;
import com.github.catvod.spider.merge.I.M0;
import com.github.catvod.spider.merge.I.t;
import com.github.catvod.spider.merge.K.g;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.Z.a;
import com.github.catvod.spider.merge.Z.b;
import com.github.catvod.spider.merge.Z.e;
import com.github.catvod.spider.merge.Z.f;
import com.github.catvod.spider.merge.f0.i;
import com.github.catvod.spider.merge.i0.m;
import com.github.catvod.utils.server.Server;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class b1 {
    public String a;

    b1() {
    }

    public static b1 a() {
        return M0.b;
    }

    private List<b> b(String string, h object) {
        Object object2 = this.h("yun-share/richlifeApp/devapp/IOutLink/getOutLinkInfoV6", String.format("{\"getOutLinkInfoReq\":{\"account\":\"\",\"linkID\":\"%s\",\"passwd\":\"\",\"caSrt\":0,\"coSrt\":0,\"srtDr\":1,\"bNum\":1,\"pCaID\":\"root\",\"eNum\":200}}", string), false);
        ArrayList<b> arrayList = new ArrayList<b>();
        object2 = (e)d.a((String)object2, e.class);
        ((h)object).m(((e)object2).c.h);
        object = new StringBuilder();
        ((StringBuilder)object).append("shareMediaEntity:");
        ((StringBuilder)object).append(object2);
        SpiderDebug.log((String)((StringBuilder)object).toString());
        object = ((e)object2).c.c;
        if (object != null) {
            Collections.sort(object, new f());
            arrayList.addAll(((e)object2).c.c);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("shareMediaEntity:");
        ((StringBuilder)object).append(object2);
        SpiderDebug.log((String)((StringBuilder)object).toString());
        this.f(string, arrayList, (e)object2);
        return arrayList;
    }

    private void f(String string, List<b> list, e list2) {
        list2 = ((e)((Object)list2)).c.b;
        if (list2 != null) {
            Iterator iterator = list2.iterator();
            while (iterator.hasNext()) {
                list2 = (e)d.a(this.h("yun-share/richlifeApp/devapp/IOutLink/getOutLinkInfoV6", String.format("{\"getOutLinkInfoReq\":{\"extInfo\":{\"isReturnCdnDownloadUrl\":\"1\"},\"account\":\"\",\"linkID\":\"%s\",\"passwd\":\"\",\"caSrt\":0,\"coSrt\":0,\"srtDr\":1,\"bNum\":1,\"pCaID\":\"%s\",\"eNum\":200}}", string, ((a)iterator.next()).f), false), e.class);
                List<b> list3 = ((e)((Object)list2)).c.c;
                if (list3 != null) {
                    Collections.sort(list3, new f());
                    list.addAll(((e)((Object)list2)).c.c);
                }
                this.f(string, list, (e)((Object)list2));
            }
        }
    }

    private String h(String string, String object, boolean bl) {
        Object object2;
        if (!string.startsWith("https")) {
            string = com.github.catvod.spider.merge.B.e.c("https://caiyun.139.com/", string);
        }
        m.f((String)object);
        Object object3 = m.f((String)object);
        if (bl) {
            object = new HashMap<String, String>();
            object2 = com.github.catvod.spider.merge.C.a.c("Authorization ");
            ((StringBuilder)object2).append(this.a);
            SpiderDebug.log((String)((StringBuilder)object2).toString());
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Basic ");
            ((StringBuilder)object2).append(this.a);
            ((HashMap)object).put((String)"Authorization", (String)((StringBuilder)object2).toString());
            ((HashMap)object).put("Content-Type", "application/json;charset=UTF-8");
            ((HashMap)object).put("hcy-cool-flag", "1");
            ((HashMap)object).put("x-DeviceInfo", "||9|12.27.0|chrome|120.0.0.0|||windows 10|746X932|zh-CN|||");
        } else {
            object = this.d();
        }
        object3 = com.github.catvod.spider.merge.f0.d.i(string, (String)object3, object);
        object2 = com.github.catvod.spider.merge.Z0.a.a(((i)object3).a());
        byte[] byArray = "PVGDwmcvfs1uV3d1".getBytes();
        byte[] byArray2 = new byte[16];
        System.arraycopy(object2, 0, byArray2, 0, 16);
        object = new com.github.catvod.spider.merge.X0.a(new com.github.catvod.spider.merge.W0.a(new com.github.catvod.spider.merge.V0.a()));
        ((com.github.catvod.spider.merge.X0.a)object).e(false, new com.github.catvod.spider.merge.Y0.b(new com.github.catvod.spider.merge.Y0.a(byArray), byArray2));
        byArray = new byte[((com.github.catvod.spider.merge.X0.a)object).d(((Object)object2).length - 16)];
        int n2 = ((com.github.catvod.spider.merge.X0.a)object).f((byte[])object2, 16, ((Object)object2).length - 16, byArray, 0);
        try {
            int n3 = ((com.github.catvod.spider.merge.X0.a)object).c(byArray, n2);
            object = new String(byArray, 0, n2 + n3, "UTF-8");
        }
        catch (Exception exception) {
            exception.printStackTrace();
            object = null;
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append(((i)object3).b());
        ((StringBuilder)object2).append(",");
        ((StringBuilder)object2).append(string);
        ((StringBuilder)object2).append(",");
        ((StringBuilder)object2).append((String)object);
        SpiderDebug.log((String)((StringBuilder)object2).toString());
        return object;
    }

    public final String c(String object, String string) {
        try {
            Object[] objectArray = Base64.decode((String)this.a, (int)0);
            String string2 = new String((byte[])objectArray);
            objectArray = string2.split(":", 3);
            if (objectArray.length >= 2) {
                SpiderDebug.log((String)objectArray[1]);
                object = this.h("yun-share/richlifeApp/devapp/IOutLink/dlFromOutLinkV3", String.format("{\"dlFromOutLinkReqV3\":{\"account\":\"%s\",\"linkID\":\"%s\",\"coIDLst\":{\"item\":[\"%s\"]},\"extInfo\":{\"isReturnCdnDownloadUrl\":\"1\"}}}", objectArray[1], object, string), true);
                string = new JSONObject((String)object);
                return string.getJSONObject("data").getString("redrUrl");
            }
            object = new IllegalArgumentException("Authorization is invalid, splits < 2");
            throw object;
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return "";
        }
    }

    public final HashMap<String, String> d() {
        HashMap hashMap = c.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36", "Content-Type", "application/json;charset=UTF-8");
        hashMap.put("hcy-cool-flag", "1");
        hashMap.put("x-DeviceInfo", "||9|12.27.0|chrome|120.0.0.0|||windows 10|746X932|zh-CN|||");
        return hashMap;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final h e(String iterator, String object, String iterator2) {
        int n2;
        ArrayList<String> arrayList;
        ArrayList<ArrayList<String>> arrayList2;
        Object object22;
        h h2;
        List<String> list = Arrays.asList("\u5f02\u52a8\u666e\u756b", "\u5f02\u52a8\u539f\u756b");
        try {
            h2 = new h();
            object22 = this.b((String)((Object)iterator2), h2);
            SpiderDebug.log((String)"getCoLsts(shareId)");
            arrayList2 = new ArrayList<ArrayList<String>>();
            for (Object object22 : (ArrayList)object22) {
                if (!com.github.catvod.spider.merge.R0.e.d(m.n(((b)object22).a()))) continue;
                arrayList2.add((ArrayList<String>)object22);
            }
            SpiderDebug.log((String)"Comparator.comparing");
            arrayList = new ArrayList<String>();
            object22 = new Object();
            for (n2 = 0; n2 < arrayList2.size(); ++n2) {
                b b2 = (b)arrayList2.get(n2);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(b2.b());
                stringBuilder.append("$");
                stringBuilder.append((String)((Object)iterator2));
                stringBuilder.append("+");
                stringBuilder.append(b2.p);
                stringBuilder.append("+");
                stringBuilder.append((String)((Object)iterator));
                stringBuilder.append("+");
                stringBuilder.append(b2.a());
                stringBuilder.append("+");
                stringBuilder.append(b2.i);
                arrayList.add(stringBuilder.toString());
            }
        }
        catch (Exception exception) {
            return BaseApi.fakeVod(list, "\u5f02\u52a8\u96f2\u76e4");
        }
        {
            for (n2 = 0; n2 < list.size(); ++n2) {
                iterator = new Iterator();
                iterator2 = arrayList.iterator();
                if (iterator2.hasNext()) {
                    while (true) {
                        ((StringBuilder)((Object)iterator)).append((CharSequence)iterator2.next());
                        if (!iterator2.hasNext()) break;
                        ((StringBuilder)((Object)iterator)).append((CharSequence)"#");
                    }
                }
                ((ArrayList)object22).add(((StringBuilder)((Object)iterator)).toString());
            }
        }
        {
            h2.l((String)object);
            h2.j((String)object);
            h2.n(((b)arrayList2.get((int)0)).h);
            iterator = new Iterator();
            object = ((ArrayList)object22).iterator();
            boolean bl = object.hasNext();
            if (bl) {
                while (true) {
                    ((StringBuilder)((Object)iterator)).append((CharSequence)object.next());
                    if (!object.hasNext()) break;
                    ((StringBuilder)((Object)iterator)).append((CharSequence)"$$$");
                }
            }
            h2.p(((StringBuilder)((Object)iterator)).toString());
            object = new StringBuilder();
            iterator = list.iterator();
            if (iterator.hasNext()) {
                while (true) {
                    ((StringBuilder)object).append((CharSequence)iterator.next());
                    if (!iterator.hasNext()) break;
                    ((StringBuilder)object).append((CharSequence)"$$$");
                }
            }
            h2.o(((StringBuilder)object).toString());
            h2.g("\u5f02\u52a8");
            return h2;
        }
    }

    public final String g(String[] object, boolean bl) {
        if (bl) {
            Object object2;
            Object object3;
            try {
                object3 = System.out;
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("https://danmu.lxian74a.repl.co/danmuku/?vodName=");
                ((StringBuilder)object2).append((String)object[2]);
                ((StringBuilder)object2).append("&jishu=");
                ((StringBuilder)object2).append((String)object[3]);
                ((PrintStream)object3).println(((StringBuilder)object2).toString());
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            object2 = Server.v(object[0], object[1]);
            if (BaseApi.get().d.booleanValue()) {
                object3 = new StringBuilder();
                ((StringBuilder)object3).append((String)object[2]);
                ((StringBuilder)object3).append((String)object[3]);
                object3 = ((StringBuilder)object3).toString();
                BaseApi.get().downloadFileWithDownloadManager((String)object2, (String)object3, this.d());
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("\u6b63\u5728\u4e0b\u8f7d ");
                ((StringBuilder)object2).append((String)object3);
                m.y(((StringBuilder)object2).toString());
                object3 = Server.B();
            } else {
                object3 = NetPan.getIsoDownloadUrl((String)object2);
            }
            object2 = new com.github.catvod.spider.merge.K.f();
            ((com.github.catvod.spider.merge.K.f)object2).w((String)object3);
            ((com.github.catvod.spider.merge.K.f)object2).j();
            ((com.github.catvod.spider.merge.K.f)object2).b(t.a.r((String[])object));
            object3 = new ArrayList<g>();
            int n2 = ((Object)object).length;
            for (int i2 = 0; i2 < n2; ++i2) {
                Object object4 = object[i2];
                if (!((String)object4).contains("@@@")) continue;
                Object object5 = ((String)object4).split("@@@");
                object4 = object5[0];
                String string = object5[1];
                CharSequence charSequence = new StringBuilder();
                charSequence.append(Proxy.getUrl());
                charSequence.append("?do=ali&type=sub&shareId=");
                charSequence.append((String)object[0]);
                charSequence.append("&fileId=");
                charSequence.append(object5[2]);
                charSequence = charSequence.toString();
                object5 = new g();
                ((g)object5).b((String)object4);
                object4 = ((g)object5).a(string);
                ((g)object4).c((String)charSequence);
                ((ArrayList)object3).add(object4);
            }
            ((com.github.catvod.spider.merge.K.f)object2).v((List<g>)object3);
            ((com.github.catvod.spider.merge.K.f)object2).g(this.d());
            return ((com.github.catvod.spider.merge.K.f)object2).toString();
        }
        try {
            com.github.catvod.spider.merge.K.f f2 = new com.github.catvod.spider.merge.K.f();
            f2.w(object[4]);
            f2.g(this.d());
            object = f2.toString();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            object = new com.github.catvod.spider.merge.K.f();
            ((com.github.catvod.spider.merge.K.f)object).w("");
            object = ((com.github.catvod.spider.merge.K.f)object).toString();
        }
        return object;
    }
}

