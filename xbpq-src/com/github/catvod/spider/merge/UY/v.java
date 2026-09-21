/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.spider.InitOrigin
 *  okhttp3.Response
 */
package com.github.catvod.spider.merge.UY;

import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.KT.B;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.UY.c;
import com.github.catvod.spider.merge.UY.f;
import com.github.catvod.spider.merge.UY.s;
import com.github.catvod.spider.merge.UY.u;
import com.github.catvod.spider.merge.UY.z;
import com.github.catvod.spider.merge.xc.a.a;
import java.util.HashMap;
import java.util.Iterator;
import okhttp3.Response;

public final class v
implements Runnable {
    public final int a;
    public final z b;
    public final String c;

    public /* synthetic */ v(z z2, String string, int n2) {
        this.a = n2;
        this.b = z2;
        this.c = string;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        Throwable throwable222222;
        Response response;
        Object object;
        block14: {
            object = this.b;
            response = this.c;
            int n2 = this.a;
            object.getClass();
            switch (n2) {
                default: {
                    CharSequence charSequence = new StringBuilder("https://pan.quark.cn/account/info?st=");
                    ((StringBuilder)charSequence).append((String)response);
                    ((StringBuilder)charSequence).append("&lw=scan");
                    charSequence = ((StringBuilder)charSequence).toString();
                    response = new HashMap();
                    response.put("Accept", "application/json, text/plain, */*");
                    response.put("Referer", "https://pan.quark.cn/");
                    response = A.i((String)charSequence, response);
                    Object object2 = response.headers("set-cookie");
                    if (object2.isEmpty()) {
                        object = new s(2);
                        InitOrigin.run((Runnable)object);
                        response.close();
                        return;
                    }
                    charSequence = new StringBuilder();
                    Iterator iterator = object2.iterator();
                    while (iterator.hasNext()) {
                        object2 = ((String)iterator.next()).split(";")[0];
                        if (((StringBuilder)charSequence).length() > 0) {
                            ((StringBuilder)charSequence).append(";");
                        }
                        ((StringBuilder)charSequence).append((String)object2);
                    }
                    charSequence = ((StringBuilder)charSequence).toString();
                    response.close();
                    if (com.github.catvod.spider.merge.xc.A0.c.c(charSequence)) {
                        ((z)object).v((String)charSequence);
                        B.e("quark");
                        boolean bl = com.github.catvod.spider.merge.xc.L.a.c().b().c();
                        com.github.catvod.spider.merge.xc.a.a.i();
                        object = new u(0, bl);
                        InitOrigin.run((Runnable)object);
                        return;
                    }
                    object = new s(3);
                    InitOrigin.run((Runnable)object);
                    return;
                }
                case 0: 
            }
            String string = m.h(new StringBuilder("https://su.quark.cn/4_eMHBJ?uc_param_str=&token="), (String)response, "&client_id=532&uc_biz_str=S%3Acustom%7COPT%3ASAREA%400%7COPT%3AIMMERSIVE%401%7COPT%3ABACK_BTN_STYLE%400");
            if (!z.H(string)) {
                f f2 = new f(3, object);
                com.github.catvod.spider.merge.xc.U.z z2 = new com.github.catvod.spider.merge.xc.U.z(string, "\u5938\u514b\u7f51\u76d8", -15108398, f2);
                InitOrigin.run((Runnable)z2);
            }
            object = new c(object, m.j("token", (String)response), 4);
            catch (Exception exception) {
                return;
            }
            {
                catch (Throwable throwable222222) {
                    break block14;
                }
                catch (Exception exception) {}
                {
                    ((z)object).G(string);
                    object = new c(object, m.j("token", response), 4);
                }
            }
            InitOrigin.execute((Runnable)object);
            return;
        }
        InitOrigin.execute((Runnable)new c(object, m.j("token", (String)response), 4));
        throw throwable222222;
    }
}

