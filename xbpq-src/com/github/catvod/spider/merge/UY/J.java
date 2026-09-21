/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.github.catvod.spider.merge.UY;

import android.text.TextUtils;
import com.github.catvod.spider.merge.UY.M;
import com.github.catvod.spider.merge.xc.O.a;

public final class J
implements Runnable {
    public final int a;
    public final M b;

    public /* synthetic */ J(M m2, int n2) {
        this.a = n2;
        this.b = m2;
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void run() {
        switch (this.a) {
            default: {
                Object object = this.b;
                ((M)object).e = true;
                object = ((M)object).p;
                if (object == null) return;
                object.shutdownNow();
                return;
            }
            case 1: {
                M m2 = this.b;
                m2.getClass();
                m2.B();
                return;
            }
            case 0: 
        }
        M m3 = this.b;
        m3.getClass();
        try {
            String string = M.j();
            if (!TextUtils.isEmpty((CharSequence)string)) {
                m3.a = string;
                com.github.catvod.spider.merge.xc.O.a.f().k(string);
            }
            m3.B();
            return;
        }
        catch (Exception exception) {
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

