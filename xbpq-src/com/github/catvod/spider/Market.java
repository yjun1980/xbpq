/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ProgressDialog
 *  android.content.ClipData
 *  android.content.ClipboardManager
 *  android.content.Context
 *  com.github.catvod.crawler.Spider
 */
package com.github.catvod.spider;

import android.app.ProgressDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.af.c;
import com.github.catvod.spider.merge.ai.j;
import com.github.catvod.spider.merge.ai.k;
import com.github.catvod.spider.merge.ai.m;
import com.github.catvod.spider.merge.ai.o;
import com.github.catvod.spider.merge.ai.p;
import com.github.catvod.spider.merge.ai.r;
import com.github.catvod.spider.merge.ai.s;
import com.github.catvod.spider.merge.bk.e;
import com.github.catvod.spider.merge.bk.f;
import com.github.catvod.spider.merge.nIe;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Market
extends Spider {
    private ProgressDialog a;
    private List<o> b;
    private boolean c;

    /*
     * Exception decompiling
     */
    public static void a(Market var0, List var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [11[CATCHBLOCK]], but top level block is 8[TRYBLOCK]
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

    public static /* synthetic */ void b(Market market) {
        ((Object)((Object)market)).getClass();
        try {
            ProgressDialog progressDialog;
            market.a = progressDialog = new ProgressDialog((Context)Init.getActivity());
            progressDialog.setProgressStyle(1);
            market.a.setCancelable(false);
            if (market.isBusy()) {
                market.a.show();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static /* synthetic */ void c(Market market, int n2) {
        block3: {
            ((Object)((Object)market)).getClass();
            market = market.a;
            if (market == null) break block3;
            try {
                market.setProgress(n2);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public static /* synthetic */ void d(Market market) {
        block3: {
            ((Object)((Object)market)).getClass();
            market.setBusy(false);
            market = market.a;
            if (market == null) break block3;
            try {
                market.dismiss();
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    private void e(String string) {
        Object object = this.b.iterator();
        while (object.hasNext()) {
            o o2 = object.next();
            int n2 = o2.b().indexOf(new p(string));
            if (n2 == -1) continue;
            string = o2.b().get(n2).a();
            if (string.isEmpty()) break;
            n2 = f.a;
            ((ClipboardManager)Init.context().getSystemService(nIe.d("210A3A332B20231437"))).setPrimaryClip(ClipData.newPlainText((CharSequence)nIe.d("24093D242426"), (CharSequence)string));
            object = new StringBuilder();
            ((StringBuilder)object).append(nIe.d("A7D1E1ABEDC8AAC5EE63"));
            ((StringBuilder)object).append(string);
            e.b(((StringBuilder)object).toString());
            break;
        }
    }

    public String categoryContent(String object, String string, boolean bl, HashMap<String, String> hashMap) {
        for (o o2 : this.b) {
            if (!o2.c().equals(object)) continue;
            object = new k();
            ((k)object).a();
            ((k)object).d(o2.d());
            return ((k)object).toString();
        }
        return super.categoryContent((String)object, string, bl, hashMap);
    }

    public String detailContent(List<String> list) {
        Init.run(new s(this, 0));
        m m2 = new m();
        m2.a();
        m2.b();
        Init.execute(new r(this, list, 0));
        return k.b(m2);
    }

    public String homeContent(boolean bl) {
        ArrayList<j> arrayList = new ArrayList<j>();
        int n2 = this.b.size();
        if (n2 > 1) {
            for (int i2 = 1; i2 < this.b.size(); ++i2) {
                o o2 = this.b.get(i2);
                arrayList.add(new j(o2.c(), o2.c()));
            }
        }
        return k.c(arrayList, this.b.get(0).d());
    }

    public void init(Context object, String string) {
        object = string;
        if (string.startsWith(nIe.d("2A122733"))) {
            object = com.github.catvod.spider.merge.af.c.b(string);
        }
        this.b = o.a((String)object);
        Init.checkPermission();
    }

    public boolean isBusy() {
        return this.c;
    }

    public void setBusy(boolean bl) {
        this.c = bl;
    }
}

