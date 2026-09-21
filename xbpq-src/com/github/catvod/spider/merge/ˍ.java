/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u0140;
import com.github.catvod.spider.merge.\u01d0;
import com.github.catvod.spider.merge.\u037a;
import java.io.IOException;

public class \u02cd
extends \u0140 {
    public \u02cd(String string) {
        super(string);
    }

    @Override
    public String \u0789() {
        return SOY.d("593135170016");
    }

    @Override
    void \u078d(Appendable appendable, int n2, \u01d0.\u037f \u03f3) {
        appendable.append(SOY.d("46730A3530362E130A")).append(this.\u07a3());
    }

    @Override
    void \u078e(Appendable appendable, int n2, \u01d0.\u037f \u03f3) {
        try {
            appendable.append(SOY.d("270F6F"));
            return;
        }
        catch (IOException iOException) {
            throw new \u037a(iOException);
        }
    }

    public \u02cd \u07b1() {
        return (\u02cd)super.\u07a2();
    }
}

