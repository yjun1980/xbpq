/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.SpiderDebug
 *  com.google.gson.Gson
 *  okhttp3.OkHttpClient
 */
package com.github.catvod.spider.merge.I;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.I.X0;
import com.github.catvod.spider.merge.I.Y0;
import com.github.catvod.spider.merge.I.Z0;
import com.github.catvod.spider.merge.I.t;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.K.g;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.R.a;
import com.github.catvod.spider.merge.R.c;
import com.github.catvod.spider.merge.c.b;
import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.i0.m;
import com.github.catvod.utils.server.Server;
import com.google.gson.Gson;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.OkHttpClient;

public final class a1 {
    private static final Pattern g = Pattern.compile("https?://(?:www\\.)?(?:123684\\.com|123865\\.com|123912\\.com|123pan\\.com|123pan\\.cn|123592\\.com)/s/([^/?#]+)", 2);
    private static final Pattern h = Pattern.compile("https?://[^/?#]+\\.(?:share|mshare)\\.(?:123684\\.com|123865\\.com|123912\\.com|123pan\\.com|123pan\\.cn|123592\\.com)/123pan/([^/?#]+)", 2);
    public static final int i = 0;
    public final Map<String, String> a = new ConcurrentHashMap<String, String>();
    private final OkHttpClient b = com.github.catvod.spider.merge.f0.d.a();
    private String c;
    private String d;
    private String e;
    public c f;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public a1() {
        try {
            Object object = com.github.catvod.spider.merge.c1.d.m(com.github.catvod.spider.merge.c.b.e("p123_user"));
            Gson gson = new Gson();
            c c2 = (c)gson.fromJson((String)object, c.class);
            object = c2;
            if (c2 == null) {
                object = new c();
            }
            this.f = object;
            return;
        }
        catch (Exception exception) {
            m.y("p123\u6388\u6743\u521d\u59cb\u5316\u5931\u8d25\uff0c\u8bf7\u5220\u9664\u6839\u76ee\u5f55TV\u6587\u4ef6\u5939\u4e0b\u6388\u6743\u6587\u4ef6\u540e\u91cd\u8bd5");
        }
    }

    public static a1 a() {
        return X0.a;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     * Exception decompiling
     */
    private Y0 e(String var1_1, List var2_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
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
     * Exception decompiling
     */
    private Y0<List<a>> f(String var1_1, long var2_3, Integer var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[TRYBLOCK]], but top level block is 14[WHILELOOP]
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
     * Exception decompiling
     */
    public final Y0<String> b(String var1_1, long var2_3, String var4_4, long var5_7, String var7_8) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String c(String string, String string2) {
        try {
            Map<String, String> map = X0.a.a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(string2);
            return (String)((ConcurrentHashMap)map).get(stringBuilder.toString());
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return "";
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Y0<List<a>> d(String y02) {
        Serializable serializable;
        try {
            serializable = new ArrayList();
            Iterator iterator = ((List)this.e((String)((Object)y02), (List)((Object)serializable)).b()).iterator();
            block3: while (true) {
                if (!iterator.hasNext()) return Y0.d(serializable);
                Z0 z02 = (Z0)iterator.next();
                int n2 = 0;
                while (true) {
                    if (n2 >= Integer.MAX_VALUE || !(y02 = this.f(z02.a, z02.b, n2)).c()) continue block3;
                    ((ArrayList)serializable).addAll((Collection)y02.b());
                    ++n2;
                }
                break;
            }
        }
        catch (Exception exception) {
            serializable = com.github.catvod.spider.merge.C.a.c("Failed to get files: ");
            ((StringBuilder)serializable).append(exception.getMessage());
            return Y0.a(((StringBuilder)serializable).toString());
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final h g(String iterator) {
        ArrayList<String> arrayList;
        Serializable serializable;
        Object object;
        h h2;
        Iterator iterator2;
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("p123\u539f\u756b");
        if (NetPan.containPuHua()) {
            arrayList2.add("p123\u666e\u756b");
        }
        try {
            iterator2 = X0.a.i((String)((Object)iterator)).b();
            h2 = new h();
            object = X0.a.d((String)((Object)iterator2)).b();
            serializable = new ArrayList();
            arrayList = object.iterator();
            while (arrayList.hasNext()) {
                object = arrayList.next();
                if (!com.github.catvod.spider.merge.R0.e.d(m.n(((a)object).j()))) continue;
                ((ArrayList)serializable).add(object);
            }
            SpiderDebug.log((String)"Comparator.comparing");
            arrayList = new ArrayList<String>();
            object = new Object();
            int n2 = 0;
            int n3 = 0;
            while (true) {
                if (n3 < ((ArrayList)serializable).size()) {
                    a a2 = (a)((ArrayList)serializable).get(n3);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(a2.b());
                    stringBuilder.append("$");
                    stringBuilder.append((String)((Object)iterator2));
                    stringBuilder.append("+");
                    stringBuilder.append(this.d);
                    stringBuilder.append("+");
                    stringBuilder.append(m.A(this.e));
                    stringBuilder.append("+");
                    stringBuilder.append(a2.j());
                    stringBuilder.append("+");
                    stringBuilder.append(a2.e());
                    stringBuilder.append("+");
                    stringBuilder.append(a2.h());
                    stringBuilder.append("+");
                    stringBuilder.append(a2.k());
                    stringBuilder.append("+");
                    stringBuilder.append(a2.l());
                    arrayList.add(stringBuilder.toString());
                    ++n3;
                    continue;
                }
                break;
            }
        }
        catch (Exception exception) {
            m.y(exception.getMessage());
            return BaseApi.fakeVod(arrayList2, "p123");
        }
        {
            for (int i2 = n2; i2 < arrayList2.size(); ++i2) {
                serializable = new StringBuilder();
                iterator2 = arrayList.iterator();
                if (iterator2.hasNext()) {
                    while (true) {
                        ((StringBuilder)serializable).append((CharSequence)iterator2.next());
                        if (!iterator2.hasNext()) break;
                        ((StringBuilder)serializable).append((CharSequence)"#");
                    }
                }
                ((ArrayList)object).add(((StringBuilder)serializable).toString());
            }
        }
        {
            h2.l((String)((Object)iterator));
            h2.j((String)((Object)iterator));
            h2.n("https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/c3/2b/fa/c32bfa72-c460-e1a4-d8a1-ba175f59bbce/AppIcon-0-0-1x_U007emarketing-0-8-0-85-220.png/350x350.png");
            h2.m(m.A(this.e));
            iterator = new Iterator();
            iterator2 = ((ArrayList)object).iterator();
            boolean bl = iterator2.hasNext();
            if (bl) {
                while (true) {
                    ((StringBuilder)((Object)iterator)).append((CharSequence)iterator2.next());
                    if (!iterator2.hasNext()) break;
                    ((StringBuilder)((Object)iterator)).append((CharSequence)"$$$");
                }
            }
            h2.p(((StringBuilder)((Object)iterator)).toString());
            iterator2 = new StringBuilder();
            iterator = arrayList2.iterator();
            if (iterator.hasNext()) {
                while (true) {
                    ((StringBuilder)((Object)iterator2)).append((CharSequence)iterator.next());
                    if (!iterator.hasNext()) break;
                    ((StringBuilder)((Object)iterator2)).append((CharSequence)"$$$");
                }
            }
            h2.o(((StringBuilder)((Object)iterator2)).toString());
            h2.g("p123");
            return h2;
        }
    }

    /*
     * Exception decompiling
     */
    public final Y0<String> h() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [7[CATCHBLOCK], 8[CATCHBLOCK]], but top level block is 6[TRYBLOCK]
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Y0<String> i(String object) {
        try {
            int n2;
            String string = ((String)object).replace("//123", "//www.123");
            Matcher matcher = g.matcher(string);
            object = matcher;
            if (!matcher.find()) {
                matcher = h.matcher(string);
                object = matcher;
                if (!matcher.find()) {
                    return Y0.a("Invalid share URL");
                }
            }
            if (((Matcher)(object = Pattern.compile("([A-Za-z0-9-]+)").matcher(((Matcher)object).group(1)))).find()) {
                this.c = ((Matcher)object).group(1);
            }
            if ((n2 = ((String)(object = string.replace("pwd=", "\u63d0\u53d6\u7801:"))).indexOf("\u63d0\u53d6\u7801")) != -1) {
                object = ((String)object).substring(n2 + 1);
                object = Pattern.compile("([A-Za-z0-9]+)").matcher((CharSequence)object);
                if (!((Matcher)object).find()) return Y0.d(this.c);
                object = ((Matcher)object).group(1);
            } else {
                object = "";
            }
            this.d = object;
            return Y0.d(this.c);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public final String j(String[] stringArray) {
        Object object;
        Object object2;
        Object object3;
        try {
            object3 = this.a;
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(stringArray[0]);
            ((StringBuilder)object2).append(stringArray[5]);
            if (!((ConcurrentHashMap)object3).containsKey(((StringBuilder)object2).toString())) {
                object3 = this.b(stringArray[0], Long.parseLong(stringArray[5]), stringArray[6], Long.parseLong(stringArray[7]), stringArray[4]).b();
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("p123 playerContent:");
                ((StringBuilder)object2).append((String)object3);
                SpiderDebug.log((String)((StringBuilder)object2).toString());
                object = this.a;
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(stringArray[0]);
                ((StringBuilder)object2).append(stringArray[5]);
                ((ConcurrentHashMap)object).put(((StringBuilder)object2).toString(), object3);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        object2 = this.c(stringArray[0], stringArray[5]);
        if (BaseApi.get().d.booleanValue()) {
            object3 = new StringBuilder();
            ((StringBuilder)object3).append(stringArray[2]);
            ((StringBuilder)object3).append(stringArray[3]);
            object3 = ((StringBuilder)object3).toString();
            BaseApi.get().downloadFileWithDownloadManager((String)object2, (String)object3, com.github.catvod.spider.merge.f0.d.b());
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("\u6b63\u5728\u4e0b\u8f7d ");
            ((StringBuilder)object2).append((String)object3);
            m.y(((StringBuilder)object2).toString());
            object3 = Server.B();
        } else {
            object3 = NetPan.getIsoDownloadUrl((String)object2);
        }
        object2 = new f();
        ((f)object2).w((String)object3);
        ((f)object2).j();
        ((f)object2).b(t.a.r(stringArray));
        ((f)object2).g(com.github.catvod.spider.merge.f0.d.b());
        object3 = new ArrayList();
        int n2 = stringArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            object = stringArray[i2];
            if (!((String)object).contains("@@@")) continue;
            Object object4 = ((String)object).split("@@@");
            object = object4[0];
            String string = object4[1];
            Object object5 = new StringBuilder();
            ((StringBuilder)object5).append(Proxy.getUrl());
            ((StringBuilder)object5).append("?do=ali&type=sub&shareId=");
            ((StringBuilder)object5).append(stringArray[0]);
            ((StringBuilder)object5).append("&fileId=");
            ((StringBuilder)object5).append(object4[2]);
            object4 = ((StringBuilder)object5).toString();
            object5 = new g();
            ((g)object5).b((String)object);
            object = ((g)object5).a(string);
            ((g)object).c((String)object4);
            ((ArrayList)object3).add(object);
        }
        ((f)object2).v((List<g>)object3);
        return ((f)object2).toString();
    }

    public final void k(String string, boolean bl) {
        if (com.github.catvod.spider.merge.R0.e.c(this.f.d()) || bl) {
            com.github.catvod.spider.merge.B.e.d("set new UserName:", string);
            String string2 = string;
            if (string != null) {
                string2 = string;
                if (string.startsWith("http")) {
                    string2 = com.github.catvod.spider.merge.f0.d.k(string).trim();
                }
            }
            if (com.github.catvod.spider.merge.R0.e.d(string2)) {
                this.f.i(string2.split("\\|")[0]);
                this.f.j(string2.split("\\|")[1]);
                this.f.f();
            }
        }
    }
}

