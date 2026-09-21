/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.widget.EditText
 *  android.widget.Toast
 *  com.github.catvod.demo.MainActivity
 */
package com.github.catvod.spider.merge.I;

import android.content.Context;
import android.widget.EditText;
import android.widget.Toast;
import com.github.catvod.demo.MainActivity;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.M;
import com.github.catvod.spider.merge.I.k;
import com.github.catvod.spider.merge.I.p;
import com.github.catvod.spider.merge.I.t;
import com.github.catvod.spider.merge.I.u;
import com.github.catvod.spider.merge.L.g;
import com.github.catvod.spider.merge.i0.c;
import com.github.catvod.spider.merge.i0.m;
import com.github.catvod.spider.merge.j0.b;
import java.util.Objects;

public final class d
implements Runnable {
    public final int a;
    public final Object b;

    public /* synthetic */ d(Object object, int n2) {
        this.a = n2;
        this.b = object;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        int n2 = this.a;
        boolean bl = false;
        switch (n2) {
            default: {
                break;
            }
            case 5: {
                String string = (String)this.b;
                Toast.makeText((Context)Init.context(), (CharSequence)string, (int)1).show();
                return;
            }
            case 4: {
                Object object = (BaseApi)this.b;
                Objects.requireNonNull(object);
                if (!((BaseApi)object).d.booleanValue()) {
                    bl = true;
                }
                ((BaseApi)object).d = bl;
                com.github.catvod.spider.merge.c.b.f(((BaseApi)object).getNetPanDownCache(), String.valueOf(((BaseApi)object).d));
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("\u7f51\u76d8\u4e0b\u8f7d \u5f53\u524d\u4e3a");
                object = BaseApi.get().d != false ? "\u5f00" : "\u5173";
                stringBuilder.append((String)object);
                c.b(stringBuilder.toString());
                return;
            }
            case 3: {
                MainActivity.e((MainActivity)((MainActivity)this.b));
                return;
            }
            case 2: {
                g g2 = (g)this.b;
                Objects.requireNonNull(g2);
                Objects.requireNonNull(t.a);
                com.github.catvod.spider.merge.c.b.f(com.github.catvod.spider.merge.c.b.e("aliyundrive_oauth"), g2.toString());
                return;
            }
            case 1: {
                ((M)this.b).h();
                return;
            }
            case 0: {
                u u2 = (u)this.b;
                Objects.requireNonNull(u2);
                EditText editText = BaseApi.get().initEditText();
                editText.setHint((CharSequence)"\u8acb\u8f38\u5165Token");
                editText.setPadding(m.e(8), m.e(8), m.e(8), m.e(8));
                editText.setBackground(BaseApi.createRoundedBackground(-3355444, m.e(8)));
                Init.run(new k(u2, editText, new p(u2, editText), 0));
                return;
            }
        }
        com.github.catvod.spider.merge.j0.b.b((b)this.b);
        return;
        catch (Exception exception) {
            return;
        }
    }
}

