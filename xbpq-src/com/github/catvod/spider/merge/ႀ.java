/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u08a7;
import com.github.catvod.spider.merge.\u107f;
import com.github.catvod.spider.merge.\u1081;
import java.util.Arrays;

public class \u1080 {
    private final \u107f \u037f;
    private final \u08a7 \u0528;

    public \u1080(\u107f \u107f2, \u08a7 \u08a72) {
        this.\u037f = \u107f2;
        this.\u0528 = \u08a72;
    }

    public String toString() {
        if (this.\u037f.\u0528 == null) {
            return null;
        }
        CharSequence charSequence = new StringBuilder();
        for (\u1081 \u10812 : this.\u037f.\u0528()) {
            Object object = \u10812.\u0529;
            int n2 = object != null ? ((\u1081[])object).length : 0;
            for (int i2 = 0; i2 < n2; ++i2) {
                object = \u10812.\u0529[i2];
                if (object == null || object.\u037f == Integer.MAX_VALUE) continue;
                ((StringBuilder)charSequence).append(this.\u0528(\u10812));
                String string = this.\u037f(i2);
                ((StringBuilder)charSequence).append(SOY.d("57"));
                ((StringBuilder)charSequence).append(string);
                ((StringBuilder)charSequence).append(SOY.d("576C"));
                ((StringBuilder)charSequence).append(this.\u0528((\u1081)object));
                ((StringBuilder)charSequence).append('\n');
            }
        }
        if (((String)(charSequence = ((StringBuilder)charSequence).toString())).length() == 0) {
            return null;
        }
        return charSequence;
    }

    protected String \u037f(int n2) {
        return this.\u0528.\u0529(n2 - 1);
    }

    protected String \u0528(\u1081 \u10812) {
        int n2 = \u10812.\u037f;
        Object object = new StringBuilder();
        boolean bl = \u10812.\u052a;
        String string = "";
        String string2 = bl ? SOY.d("40") : "";
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(SOY.d("09"));
        ((StringBuilder)object).append(n2);
        string2 = string;
        if (\u10812.\u052d) {
            string2 = SOY.d("24");
        }
        ((StringBuilder)object).append(string2);
        string = ((StringBuilder)object).toString();
        if (\u10812.\u052a) {
            object = \u10812.\u052e;
            string2 = SOY.d("476C");
            if (object != null) {
                object = new StringBuilder();
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append(string2);
                ((StringBuilder)object).append(Arrays.toString(\u10812.\u052e));
                return ((StringBuilder)object).toString();
            }
            object = new StringBuilder();
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append(\u10812.\u052b);
            return ((StringBuilder)object).toString();
        }
        return string;
    }
}

