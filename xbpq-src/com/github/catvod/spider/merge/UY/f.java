/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.view.View
 *  android.widget.TextView
 *  androidx.core.view.ViewKt
 *  com.github.catvod.crawler.SpiderDebug
 *  com.github.catvod.spider.InitOrigin
 */
package com.github.catvod.spider.merge.UY;

import android.app.AlertDialog;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.ViewKt;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.KT.B;
import com.github.catvod.spider.merge.KT.F;
import com.github.catvod.spider.merge.KT.c;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.UY.E;
import com.github.catvod.spider.merge.UY.h;
import com.github.catvod.spider.merge.UY.l;
import com.github.catvod.spider.merge.UY.r;
import com.github.catvod.spider.merge.UY.z;
import com.github.catvod.spider.merge.by.a;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.D0.b;
import com.github.catvod.spider.merge.xc.U.o;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.concurrent.ScheduledExecutorService;

public final class f
implements Runnable {
    public final int a;
    public final Object b;

    public /* synthetic */ f() {
        this.a = 1;
        l l2 = l.c;
        this.b = l2;
    }

    public /* synthetic */ f(int n2, Object object) {
        this.a = n2;
        this.b = object;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        switch (this.a) {
            default: {
                ViewKt.a((a)((a)this.b));
                return;
            }
            case 10: {
                var2_1 = (c)this.b;
                i.e(var2_1, "$server");
                try {
                    var2_1.i();
                    return;
                }
                catch (Exception var2_2) {
                    if (F.d == false) return;
                    m.o("ProxyServer start error: ", var2_2.getMessage());
                }
                return;
            }
            case 9: {
                var3_13 = (B)this.b;
                var3_13.getClass();
                try {
                    var2_3 = var3_13.f() != false ? "Go\u4ee3\u7406\u542f\u52a8\u6210\u529f" : "Go\u4ee3\u7406\u542f\u52a8\u5931\u8d25\uff0c\u5df2\u56de\u9000Java\u4ee3\u7406";
                }
                catch (Throwable var2_4) {
                    ** GOTO lbl26
                }
                A.m(var2_3);
                var3_13.d = false;
                return;
lbl26:
                // 1 sources

                var3_13.d = false;
                throw var2_4;
            }
            case 8: {
                var3_14 = (Process)this.b;
                var4_17 = new InputStreamReader(var3_14.getInputStream());
                var2_5 = new BufferedReader((Reader)var4_17);
                try {
                    while ((var4_17 = var2_5.readLine()) != null) {
                        var3_14 = new StringBuilder();
                        var3_14.append("[GoProxy] ");
                        var3_14.append((String)var4_17);
                        SpiderDebug.log((String)var3_14.toString());
                    }
                }
                catch (Throwable var3_15) {
                    ** GOTO lbl50
                }
                var2_5.close();
                return;
                {
                    catch (Throwable var2_11) {
                        return;
                    }
                }
lbl50:
                // 1 sources

                try {
                    var2_5.close();
                    throw var3_15;
                }
                catch (Throwable var2_6) {
                    try {}
                    catch (Exception var2_12) {
                        throw var3_15;
                    }
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(var3_15, new Object[]{var2_6});
                    throw var3_15;
                }
            }
            case 7: {
                ((View)this.b).requestFocus();
                return;
            }
            case 6: {
                var1_18 = B.l.f();
                ((AlertDialog)this.b).dismiss();
                var2_7 = var1_18 != false ? "Go\u4ee3\u7406\u5df2\u542f\u7528" : "Go\u4ee3\u7406\u542f\u52a8\u5931\u8d25";
                var3_16 = var1_18 != false ? B.l() : "\u8bf7\u68c0\u67e5 Go \u4e8c\u8fdb\u5236\u76f4\u94fe\u662f\u5426\u53ef\u8bbf\u95ee\uff0c\u5df2\u81ea\u52a8\u56de\u9000 Java \u4ee3\u7406\u3002";
                com.github.catvod.spider.merge.xc.D0.b.L(var2_7, var3_16);
                return;
            }
            case 5: {
                var1_19 = B.l.f();
                InitOrigin.run((Runnable)new o((TextView)this.b, var1_19));
                return;
            }
            case 4: {
                var2_8 = new StringBuilder("[\u5929\u7ffc\u4e91\u76d8] \u767b\u5f55\u5931\u8d25: ");
                var2_8.append(((E)this.b).b);
                A.m(var2_8.toString());
                return;
            }
            case 3: {
                var2_9 = (z)this.b;
                var2_9.i = true;
                var2_9 = var2_9.h;
                if (var2_9 == null) return;
                var2_9.shutdownNow();
                return;
            }
            case 2: {
                ((r)this.b).a = true;
                return;
            }
            case 1: {
                ((l)this.b).a = true;
                return;
            }
            case 0: 
        }
        var2_10 = (h)this.b;
        i.e(var2_10, "this$0");
        var2_10 = (ScheduledExecutorService)var2_10.a;
        if (var2_10 == null) return;
        var2_10.shutdownNow();
    }
}

