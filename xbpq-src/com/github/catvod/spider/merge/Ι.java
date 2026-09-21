/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u0131;
import com.github.catvod.spider.merge.\u01c3;
import com.github.catvod.spider.merge.\u01d0;
import com.github.catvod.spider.merge.\u02d0;

public class \u0399
extends \u02d0 {
    public \u0399(String string, String string2, String string3) {
        \u01c3.\u052f(string);
        \u01c3.\u052f(string2);
        \u01c3.\u052f(string3);
        this.\u052a(SOY.d("14333C13"), string);
        this.\u052a(SOY.d("0A27331A1D143336"), string2);
        this.\u052a(SOY.d("092B2202111A3336"), string3);
        this.\u07a4();
    }

    private boolean \u07a2(String string) {
        return \u0131.\u052c(this.\u0529(string)) ^ true;
    }

    private void \u07a4() {
        boolean bl = this.\u07a2(SOY.d("0A27331A1D143336"));
        String string = SOY.d("0A2733250D04313728");
        if (bl) {
            this.\u052a(string, SOY.d("2A07133A3D34"));
        } else if (this.\u07a2(SOY.d("092B2202111A3336"))) {
            this.\u052a(string, SOY.d("290B0222313A"));
        }
    }

    @Override
    public String \u0789() {
        return SOY.d("59363E15000E0A37");
    }

    @Override
    void \u078d(Appendable appendable, int n2, \u01d0.\u037f object) {
        Object object2 = ((\u01d0.\u037f)object).\u058f();
        Object object3 = \u01d0.\u037f.\u037f.\u037f;
        object = SOY.d("092B2202111A3336");
        String string = SOY.d("0A27331A1D143336");
        if (object2 == object3 && !this.\u07a2(string) && !this.\u07a2((String)object)) {
            appendable.append(SOY.d("467335191703032234"));
        } else {
            appendable.append(SOY.d("467315393723230214"));
        }
        object3 = SOY.d("14333C13");
        boolean bl = this.\u07a2((String)object3);
        object2 = SOY.d("5A");
        if (bl) {
            appendable.append((CharSequence)object2).append(this.\u0529((String)object3));
        }
        if (this.\u07a2((String)(object3 = SOY.d("0A2733250D04313728")))) {
            appendable.append((CharSequence)object2).append(this.\u0529((String)object3));
        }
        bl = this.\u07a2(string);
        object2 = SOY.d("5A70");
        if (bl) {
            appendable.append((CharSequence)object2).append(this.\u0529(string)).append('\"');
        }
        if (this.\u07a2((String)object)) {
            appendable.append((CharSequence)object2).append(this.\u0529((String)object)).append('\"');
        }
        appendable.append('>');
    }

    @Override
    void \u078e(Appendable appendable, int n2, \u01d0.\u037f \u03f3) {
    }

    public void \u07a3(String string) {
        if (string != null) {
            this.\u052a(SOY.d("0A2733250D04313728"), string);
        }
    }
}

