/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.SpiderDebug
 *  com.google.gson.Gson
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge.I;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.I.K0;
import com.github.catvod.spider.merge.I.M0;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.I.r0;
import com.github.catvod.spider.merge.I.s;
import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.K.i;
import com.github.catvod.spider.merge.S.a;
import com.github.catvod.spider.merge.S.c;
import com.github.catvod.spider.merge.S.d;
import com.github.catvod.spider.merge.i0.m;
import com.google.gson.Gson;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class u0 {
    public final int a;

    public /* synthetic */ u0() {
        this.a = 0;
        this(0);
    }

    public /* synthetic */ u0(int n2) {
        this.a = n2;
    }

    public /* synthetic */ u0(e e2) {
        this.a = 1;
        this(1);
    }

    public static String a(String string, List object) {
        String string2 = ((String)object.get(0)).trim();
        object = string2.contains("_") && ((String[])(object = string2.split("_", 2))).length > 1 && !object[1].equals("root") ? object[1] : "0";
        return f.n(t0.a.j(string2, "selfquark", (String)object, string));
    }

    public static String b(String string, List object) {
        String string2 = ((String)object.get(0)).trim();
        object = string2.contains("_") && ((String[])(object = string2.split("_", 2))).length > 1 && !object[1].equals("root") ? object[1] : "0";
        return f.n(M0.a.j(string2, "selfuc", (String)object, string));
    }

    private String c(String object, List object2) {
        Object object3 = new ArrayList();
        String string = m.z((String)object).toLowerCase();
        Iterator iterator = object2.iterator();
        while (iterator.hasNext()) {
            object = (a)iterator.next();
            String string2 = m.z(((a)object).k()).toLowerCase();
            if (!string.contains(string2) && !string2.contains(string)) continue;
            ((ArrayList)object3).add(object);
        }
        if (((ArrayList)object3).isEmpty()) {
            ((ArrayList)object3).addAll(object2);
        }
        object = new StringBuilder();
        object3 = ((ArrayList)object3).iterator();
        while (object3.hasNext()) {
            object2 = (a)object3.next();
            ((StringBuilder)object).append("+");
            ((StringBuilder)object).append(m.z(((a)object2).k()));
            ((StringBuilder)object).append("@@@");
            ((StringBuilder)object).append(((a)object2).h());
            ((StringBuilder)object).append("@@@");
            ((StringBuilder)object).append(((a)object2).i());
        }
        return ((StringBuilder)object).toString();
    }

    private String d(String charSequence, List object) {
        Object object2 = new ArrayList();
        String string = m.z((String)charSequence).toLowerCase();
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            a a2 = (a)iterator.next();
            charSequence = m.z(a2.k()).toLowerCase();
            if (!string.contains(charSequence) && !((String)charSequence).contains(string)) continue;
            ((ArrayList)object2).add(a2);
        }
        if (((ArrayList)object2).isEmpty()) {
            ((ArrayList)object2).addAll(object);
        }
        charSequence = new StringBuilder();
        object2 = ((ArrayList)object2).iterator();
        while (object2.hasNext()) {
            object = (a)object2.next();
            ((StringBuilder)charSequence).append("+");
            ((StringBuilder)charSequence).append(m.z(((a)object).k()));
            ((StringBuilder)charSequence).append("@@@");
            ((StringBuilder)charSequence).append(((a)object).h());
            ((StringBuilder)charSequence).append("@@@");
            ((StringBuilder)charSequence).append(((a)object).i());
        }
        return ((StringBuilder)charSequence).toString();
    }

    public static u0 e() {
        return t0.a;
    }

    private String f(String string) {
        String string2 = string.startsWith("https") ? string : e.c("https://drive-pc.quark.cn/", string);
        Serializable serializable = r0.a.s("");
        string = null;
        for (int i2 = 2; i2 > 0; --i2) {
            string = com.github.catvod.spider.merge.f0.d.l(string2, serializable, null);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("quarkSelf get result:");
            stringBuilder.append(string);
            SpiderDebug.log((String)stringBuilder.toString());
            if (string.length() > 10) break;
            Thread.sleep(500L);
        }
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append("quarkSelf get url:");
        ((StringBuilder)serializable).append(string2);
        ((StringBuilder)serializable).append(" result:");
        ((StringBuilder)serializable).append(string);
        SpiderDebug.log((String)((StringBuilder)serializable).toString());
        return string;
    }

    public static u0 g() {
        return M0.a;
    }

    private String h(String string) {
        String string2 = string.startsWith("https") ? string : e.c("https://drive-pc.quark.cn/", string);
        Serializable serializable = K0.a.w("");
        string = null;
        for (int i2 = 2; i2 > 0; --i2) {
            string = com.github.catvod.spider.merge.f0.d.l(string2, serializable, null);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ucSelf get result:");
            stringBuilder.append(string);
            SpiderDebug.log((String)stringBuilder.toString());
            if (string.length() > 10) break;
            Thread.sleep(500L);
        }
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append("ucSelf get url:");
        ((StringBuilder)serializable).append(string2);
        ((StringBuilder)serializable).append(" result:");
        ((StringBuilder)serializable).append(string);
        SpiderDebug.log((String)((StringBuilder)serializable).toString());
        return string;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void l(HashMap var1_1, boolean var2_3, a var3_4, List var4_5, List var5_6, List var6_7, int var7_8) {
        var8_9 = var6_7;
        if (!var2_3) ** GOTO lbl7
        var8_9 = var6_7;
        if (var6_7 != null) ** GOTO lbl7
        var8_9 = new ArrayList<a>();
lbl7:
        // 3 sources

        var6_7 = "updated_at";
        if (var1_1 == null || !"updated_at".equals(var1_1.get("type"))) {
            var6_7 = "file_type:asc,file_name";
        }
        if (var1_1 != null && var1_1.get("order") != null) {
            var9_10 = ((String)var1_1.get("order")).toLowerCase();
        } else {
            var9_11 = "asc";
        }
        var10_19 = new StringBuilder();
        var10_19.append("1/clouddrive/file/sort?pr=ucpro&fr=pc&uc_param_str=&pdir_fid=");
        var10_19.append(var3_4.i());
        var10_19.append("&_page=");
        var10_19.append(var7_8);
        var10_19.append("&_size=50&_fetch_total=1&_fetch_sub_dirs=0&_sort=");
        var10_19.append((String)var6_7);
        var10_19.append(":");
        var10_19.append((String)var9_12);
        var9_13 = this.f(var10_19.toString());
        var6_7 = new StringBuilder();
        var6_7.append("quarkSelf listFiles >> ");
        var6_7.append(var9_13);
        SpiderDebug.log((String)var6_7.toString());
        var6_7 = new JSONObject(var9_13);
        if (var6_7.getInt("status") == 401) {
            m.y("\u5938\u514b cookie \u5df2\u5931\u6548\uff0c\u8bf7\u91cd\u65b0\u914d\u7f6e");
            return;
        }
        var11_20 = com.github.catvod.spider.merge.S.a.q(var6_7.getJSONObject("data").toString());
        {
            catch (Exception var1_2) {
                var3_4 = new StringBuilder();
                var3_4.append("quarkSelf listFiles error:");
                var3_4.append(var1_2);
                SpiderDebug.log((String)var3_4.toString());
                var1_2.printStackTrace();
                return;
            }
            try {
                if (!var11_20.j().isEmpty()) {
                    d.a(var11_20.j());
                }
                ** GOTO lbl64
            }
            catch (Exception var9_14) {}
            {
                var10_19 = new StringBuilder();
                var10_19.append("quarkSelf listFiles sort error:");
                var10_19.append(var9_14.getMessage());
                SpiderDebug.log((String)var10_19.toString());
lbl64:
                // 6 sources

                for (a var9_17 : var11_20.j()) {
                    if ("folder".equals(var9_17.p())) {
                        var8_9.add(var9_17);
                        continue;
                    }
                    if (!BaseApi.get().d.booleanValue() && !com.github.catvod.spider.merge.R0.e.d(m.n(var9_17.k()))) {
                        if (!m.t(var9_17.h())) continue;
                        var5_6.add(var9_17);
                        continue;
                    }
                    var9_17.r(var3_4.k());
                    var4_5.add(var9_17);
                }
                var9_18 = new Gson();
                var6_7 = (c)var9_18.fromJson(var6_7.getJSONObject("metadata").toString(), c.class);
                var7_8 = var6_7.c();
                if ((var6_7.b() - 1) * var7_8 + var6_7.a() < var6_7.d()) {
                    this.l(var1_1, var2_3, (a)var3_4, var4_5, var5_6, var8_9, var6_7.b() + 1);
                }
                if (!var2_3) return;
                var3_4 = var8_9.iterator();
                while (var3_4.hasNext()) {
                    this.l(var1_1, var2_3, (a)var3_4.next(), var4_5, var5_6, null, 1);
                }
            }
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void m(HashMap var1_1, boolean var2_3, a var3_4, List var4_5, List var5_6, List var6_7, int var7_8) {
        var8_9 = var6_7;
        if (!var2_3) ** GOTO lbl7
        var8_9 = var6_7;
        if (var6_7 != null) ** GOTO lbl7
        var8_9 = new ArrayList<a>();
lbl7:
        // 3 sources

        var6_7 = "updated_at";
        if (var1_1 == null || !"updated_at".equals(var1_1.get("type"))) {
            var6_7 = "file_type:asc,file_name";
        }
        var9_10 = var1_1 != null && var1_1.get("order") != null ? ((String)var1_1.get("order")).toLowerCase() : "asc";
        var10_12 = new StringBuilder();
        var10_12.append("1/clouddrive/file/sort?pr=UCBrowser&fr=pc&uc_param_str=&pdir_fid=");
        var10_12.append(var3_4.i());
        var10_12.append("&_page=");
        var10_12.append(var7_8);
        var10_12.append("&_size=50&_fetch_total=1&_fetch_sub_dirs=0&_sort=");
        var10_12.append((String)var6_7);
        var10_12.append(":");
        var10_12.append((String)var9_10);
        var9_10 = this.h(var10_12.toString());
        var6_7 = new StringBuilder();
        var6_7.append("ucSelf listFiles >> ");
        var6_7.append((String)var9_10);
        SpiderDebug.log((String)var6_7.toString());
        var6_7 = new JSONObject((String)var9_10);
        if (var6_7.getInt("status") == 401) {
            m.y("UC cookie \u5df2\u5931\u6548\uff0c\u8bf7\u91cd\u65b0\u914d\u7f6e");
            return;
        }
        var11_17 = com.github.catvod.spider.merge.S.a.q(var6_7.getJSONObject("data").toString());
        {
            catch (Exception var1_2) {
                var3_4 = new StringBuilder();
                var3_4.append("ucSelf listFiles error:");
                var3_4.append(var1_2);
                SpiderDebug.log((String)var3_4.toString());
                var1_2.printStackTrace();
                return;
            }
            try {
                if (!var11_17.j().isEmpty()) {
                    d.a(var11_17.j());
                }
                ** GOTO lbl61
            }
            catch (Exception var9_11) {}
            {
                var10_13 = new StringBuilder();
                var10_13.append("ucSelf listFiles sort error:");
                var10_13.append(var9_11.getMessage());
                SpiderDebug.log((String)var10_13.toString());
lbl61:
                // 6 sources

                for (a var10_16 : var11_17.j()) {
                    if ("folder".equals(var10_16.p())) {
                        var8_9.add(var10_16);
                        continue;
                    }
                    if (!BaseApi.get().d.booleanValue() && !com.github.catvod.spider.merge.R0.e.d(m.n(var10_16.k()))) {
                        if (!m.t(var10_16.h())) continue;
                        var5_6.add(var10_16);
                        continue;
                    }
                    var10_16.r(var3_4.k());
                    var4_5.add(var10_16);
                }
                var9_10 = new Gson();
                var6_7 = (c)var9_10.fromJson(var6_7.getJSONObject("metadata").toString(), c.class);
                var7_8 = var6_7.c();
                if ((var6_7.b() - 1) * var7_8 + var6_7.a() < var6_7.d()) {
                    this.m(var1_1, var2_3, (a)var3_4, var4_5, var5_6, var8_9, var6_7.b() + 1);
                }
                if (!var2_3) return;
                var3_4 = var8_9.iterator();
                while (var3_4.hasNext()) {
                    this.m(var1_1, var2_3, (a)var3_4.next(), var4_5, var5_6, null, 1);
                }
            }
        }
    }

    public final List i() {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                ArrayList<String> arrayList = new ArrayList<String>();
                arrayList.add("\u5938\u514b\u539f\u756b");
                if (NetPan.containPuHua()) {
                    arrayList.add("\u5938\u514b\u666e\u756b");
                }
                return arrayList;
            }
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("UC\u539f\u756b");
        if (NetPan.containPuHua()) {
            arrayList.add("UC\u666e\u756b");
        }
        return arrayList;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final h j(String var1_1, String var2_8, String var3_9, String var4_10) {
        block33: {
            switch (this.a) {
                default: {
                    break;
                }
                case 0: {
                    var7_11 = this.i();
                    try {
                        var10_13 = new Iterator<E>();
                        var6_15 = new ArrayList();
                        var8_17 = new ArrayList<String>(var3_9);
                        var3_9 = var6_15;
                        var6_15 = "#";
                    }
                    catch (Exception var1_4) {
                        // empty catch block
                        ** GOTO lbl99
                    }
                    try {
                        this.l(null, true, (a)var8_17, (List)var10_13, (List)var3_9, null, 1);
                        var9_19 = new ArrayList<String>();
                        var8_17 = new ArrayList<String>();
                        var10_13 = var10_13.iterator();
                        while (var10_13.hasNext()) {
                            var12_23 = (a)var10_13.next();
                            var11_21 = new StringBuilder();
                            var11_21.append(var12_23.e());
                            var11_21.append("$");
                            var11_21.append((String)var2_8);
                            var11_21.append('+');
                            var11_21.append(var12_23.i());
                            var11_21.append('+');
                            var11_21.append(m.A(var4_10));
                            var11_21.append('+');
                            var11_21.append(var12_23.k());
                            var11_21.append(this.c(var12_23.k(), (List)var3_9));
                            var9_19.add(var11_21.toString());
                        }
                        var2_8 = var6_15;
                        for (var5_25 = 0; var5_25 < (var3_9 = (ArrayList)var7_11).size(); ++var5_25) {
                            var6_15 = new StringBuilder();
                            var10_13 = var9_19.iterator();
                            var3_9 = var2_8;
                            if (var10_13.hasNext()) {
                                while (true) {
                                    var6_15.append((CharSequence)var10_13.next());
                                    var3_9 = var2_8;
                                    if (!var10_13.hasNext()) break;
                                    var6_15.append((CharSequence)var2_8);
                                }
                            }
                            var8_17.add(var6_15.toString());
                            var2_8 = var3_9;
                        }
                    }
                    catch (Exception var1_3) {
                        ** GOTO lbl99
                    }
                    {
                        var2_8 = new h();
                        var2_8.l((String)var1_1);
                        var2_8.j((String)var1_1);
                        var2_8.n("https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/c7/6c/55/c76c5544-64a5-882a-3862-c68b28f16299/AppIcon-0-0-1x_U007ephone-0-11-0-0-85-220.png/350x350.png");
                        var2_8.m((String)var4_10);
                        var1_1 = new StringBuilder();
                        var4_10 = var8_17.iterator();
                        if (var4_10.hasNext()) {
                            while (true) {
                                var1_1.append((CharSequence)var4_10.next());
                                if (!var4_10.hasNext()) break;
                                var1_1.append((CharSequence)"$$$");
                            }
                        }
                        var2_8.p(var1_1.toString());
                        var1_1 = new StringBuilder();
                        var3_9 = var3_9.iterator();
                        if (var3_9.hasNext()) {
                            while (true) {
                                var1_1.append((CharSequence)var3_9.next());
                                if (!var3_9.hasNext()) break;
                                var1_1.append((CharSequence)"$$$");
                            }
                        }
                        var2_8.o(var1_1.toString());
                    }
                    try {
                        var2_8.g("\u5938\u514b\u96f2\u76e4");
                        return var2_8;
                    }
                    catch (Exception var1_2) {}
lbl99:
                    // 3 sources

                    var2_8 = new StringBuilder();
                    var2_8.append("quarkSelf getVod error:");
                    var2_8.append(var1_1);
                    SpiderDebug.log((String)var2_8.toString());
                    return BaseApi.fakeVod(var7_11, "\u5938\u514b\u96f2\u76e4");
                }
            }
            var8_18 = this.i();
            try {
                var10_14 = new ArrayList();
                var7_12 = new ArrayList();
                var9_20 = new ArrayList<String>(var3_9);
                var3_9 = var7_12;
                var6_16 = "#";
            }
            catch (Exception var1_7) {
                // empty catch block
                break block33;
            }
            this.m(null, true, (a)var9_20, (List)var10_14, var7_12, null, 1);
            var9_20 = new ArrayList<String>();
            var7_12 = new ArrayList();
            var10_14 = var10_14.iterator();
            while (var10_14.hasNext()) {
                var11_22 = (a)var10_14.next();
                var12_24 = new StringBuilder();
                var12_24.append(var11_22.e());
                var12_24.append("$");
                var12_24.append((String)var2_8);
                var12_24.append('+');
                var12_24.append(var11_22.i());
                var12_24.append('+');
                var12_24.append(m.A(var4_10));
                var12_24.append('+');
                var12_24.append(var11_22.k());
                var12_24.append(this.d(var11_22.k(), (List)var3_9));
                var9_20.add(var12_24.toString());
            }
            var2_8 = var6_16;
            try {
                for (var5_26 = 0; var5_26 < (var3_9 = (ArrayList)var8_18).size(); ++var5_26) {
                    var10_14 = new StringBuilder();
                    var6_16 = var9_20.iterator();
                    var3_9 = var2_8;
                    if (var6_16.hasNext()) {
                        while (true) {
                            var10_14.append((CharSequence)var6_16.next());
                            var3_9 = var2_8;
                            if (!var6_16.hasNext()) break;
                            var10_14.append((CharSequence)var2_8);
                        }
                    }
                    var7_12.add(var10_14.toString());
                    var2_8 = var3_9;
                }
            }
            catch (Exception var1_5) {
                break block33;
            }
            {
                var2_8 = new h();
                var2_8.l((String)var1_1);
                var2_8.j((String)var1_1);
                var2_8.n("https://ts1.cn.mm.bing.net/th/id/R-C.421c96e47df7c9719403654ee4f7c281?rik=yiiEoGCTgDDc3w&riu=http%3a%2f%2fpic.9663.com%2fupload%2f2023-5%2f20235111411256277.png&ehk=R81N%2flXMrl%2bxpRlST8DtHXDfab6rzaMb83gihuD71Fk%3d&risl=&pid=ImgRaw&r=0");
                var2_8.m((String)var4_10);
                var1_1 = new StringBuilder();
                var4_10 = var7_12.iterator();
                if (var4_10.hasNext()) {
                    while (true) {
                        var1_1.append((CharSequence)var4_10.next());
                        if (!var4_10.hasNext()) break;
                        var1_1.append((CharSequence)"$$$");
                    }
                }
                var2_8.p(var1_1.toString());
                var1_1 = new StringBuilder();
                var3_9 = var3_9.iterator();
                if (var3_9.hasNext()) {
                    while (true) {
                        var1_1.append((CharSequence)var3_9.next());
                        if (!var3_9.hasNext()) break;
                        var1_1.append((CharSequence)"$$$");
                    }
                }
                var2_8.o(var1_1.toString());
                var2_8.g("UC\u96f2\u76e4");
                return var2_8;
            }
            catch (Exception var1_6) {}
        }
        var2_8 = new StringBuilder();
        var2_8.append("ucSelf getVod error:");
        var2_8.append(var1_1);
        SpiderDebug.log((String)var2_8.toString());
        return BaseApi.fakeVod(var8_18, "UC\u96f2\u76e4");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final List k(i object) {
        Comparable<a> comparable;
        int n2 = this.a;
        ArrayList<Object> arrayList = "0";
        switch (n2) {
            default: {
                break;
            }
            case 0: {
                Serializable serializable;
                Object object2 = ((i)object).c();
                String string = ((i)object).f();
                String string2 = ((i)object).e();
                if (!com.github.catvod.spider.merge.R0.e.b(((i)object).b())) {
                    arrayList = ((i)object).b();
                }
                Object object3 = ((i)object).a();
                Object object4 = new ArrayList();
                Object object5 = new ArrayList();
                try {
                    if (com.github.catvod.spider.merge.R0.e.c(r0.a.m.d())) {
                        m.y("\u8bf7\u5148\u914d\u7f6e\u5938\u514b cookie");
                        return new ArrayList();
                    }
                    serializable = new ArrayList();
                    object = new a((String)((Object)arrayList));
                    this.l((HashMap)object3, false, (a)object, (List)object4, (List)((Object)serializable), (List)object5, 1);
                }
                catch (Exception exception) {
                    s.b("quarkSelf getVodFolder error:", exception);
                }
                arrayList = new ArrayList();
                object5 = ((ArrayList)object5).iterator();
                while (object5.hasNext()) {
                    object = (a)object5.next();
                    object3 = new h();
                    serializable = r.d((String)object2, "*#");
                    ((StringBuilder)serializable).append(((a)object).i());
                    ((StringBuilder)serializable).append("*#");
                    ((StringBuilder)serializable).append(((a)object).k());
                    ((h)object3).l(((StringBuilder)serializable).toString());
                    ((h)object3).m(((a)object).k());
                    ((h)object3).r(((a)object).p());
                    arrayList.add(object3);
                }
                object2 = ((ArrayList)object4).iterator();
                while (true) {
                    object = arrayList;
                    if (!object2.hasNext()) return object;
                    object4 = (a)object2.next();
                    object = new h();
                    object5 = r.d(string2, "_");
                    ((StringBuilder)object5).append(((a)object4).l());
                    ((StringBuilder)object5).append("*#");
                    ((StringBuilder)object5).append(string);
                    ((h)object).l(((StringBuilder)object5).toString());
                    ((h)object).m(((a)object4).e());
                    ((h)object).r(((a)object4).p());
                    ((h)object).n(((a)object4).o());
                    arrayList.add(object);
                }
            }
        }
        Object object6 = ((i)object).c();
        String string = ((i)object).f();
        String string3 = ((i)object).e();
        if (!com.github.catvod.spider.merge.R0.e.b(((i)object).b())) {
            arrayList = ((i)object).b();
        }
        Object object7 = ((i)object).a();
        Object object8 = new ArrayList();
        Object object9 = new ArrayList();
        try {
            if (com.github.catvod.spider.merge.R0.e.c(K0.a.n.c())) {
                m.y("\u8bf7\u5148\u914d\u7f6eUC cookie");
                return new ArrayList();
            }
            object = new ArrayList();
            comparable = new Comparable<a>(arrayList);
            this.m((HashMap)object7, false, (a)comparable, (List)object8, (List)object, (List)object9, 1);
        }
        catch (Exception exception) {
            s.b("ucSelf getVodFolder error:", exception);
        }
        arrayList = new ArrayList<Object>();
        object = ((ArrayList)object9).iterator();
        while (object.hasNext()) {
            object9 = (a)object.next();
            object7 = new h();
            comparable = r.d((String)object6, "*#");
            ((StringBuilder)comparable).append(((a)object9).i());
            ((StringBuilder)comparable).append("*#");
            ((StringBuilder)comparable).append(((a)object9).k());
            ((h)object7).l(((StringBuilder)comparable).toString());
            ((h)object7).m(((a)object9).k());
            ((h)object7).r(((a)object9).p());
            arrayList.add(object7);
        }
        object6 = ((ArrayList)object8).iterator();
        while (true) {
            object = arrayList;
            if (!object6.hasNext()) return object;
            object8 = (a)object6.next();
            object9 = new h();
            object = r.d(string3, "_");
            ((StringBuilder)object).append(((a)object8).l());
            ((StringBuilder)object).append("*#");
            ((StringBuilder)object).append(string);
            ((h)object9).l(((StringBuilder)object).toString());
            ((h)object9).m(((a)object8).e());
            ((h)object9).r(((a)object8).p());
            ((h)object9).n(((a)object8).o());
            arrayList.add(object9);
        }
    }
}

