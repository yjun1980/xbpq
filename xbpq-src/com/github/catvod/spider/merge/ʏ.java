/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u013a;
import com.github.catvod.spider.merge.\u0155;
import com.github.catvod.spider.merge.\u02d1;
import com.github.catvod.spider.merge.\u0582;
import com.github.catvod.spider.merge.\u0e33;
import java.util.Iterator;

public class \u028f {
    public static \u0e33 \u037f(\u013a \u013a2) {
        \u0e33 \u0e332 = new \u0e33();
        for (\u013a2 = \u013a2.\u08a9(); \u013a2 != null; \u013a2 = \u013a2.\u08a9()) {
            \u0e332.add(\u013a2);
        }
        if (\u0e332.size() > 0) {
            return \u0e332;
        }
        return null;
    }

    public static int \u0528(\u013a \u013a2, \u0155 \u01552) {
        Iterator iterator = \u013a2.\u08ad().\u0864().iterator();
        int n2 = 1;
        while (iterator.hasNext()) {
            \u013a \u013a3 = (\u013a)iterator.next();
            if (!\u013a2.\u08b8().equals(\u013a3.\u08b8()) || !\u01552.\u037f().contains(\u013a3)) continue;
            if (\u013a2.equals(\u013a3)) break;
            ++n2;
        }
        return n2;
    }

    public static int \u0529(\u013a object) {
        if (\u02d1.\u052f((CharSequence)(object = ((\u0582)object).\u0529(SOY.d("3F1E0E25353A3F0D05373328331C15332C28311708"))))) {
            return -1;
        }
        return Integer.parseInt((String)object);
    }

    public static \u0e33 \u052a(\u013a \u013a2) {
        \u0e33 \u0e332 = new \u0e33();
        for (\u013a2 = \u013a2.\u08b0(); \u013a2 != null; \u013a2 = \u013a2.\u08b0()) {
            \u0e332.add(\u013a2);
        }
        if (\u0e332.size() > 0) {
            return \u0e332;
        }
        return null;
    }

    public static int \u052b(\u013a \u013a22, \u0155 \u01552) {
        \u0e33 \u0e332 = new \u0e33();
        for (\u013a \u013a22 : \u013a22.\u08ad().\u08a0(\u013a22.\u08b8())) {
            if (!\u01552.\u037f().contains(\u013a22)) continue;
            \u0e332.add(\u013a22);
        }
        return \u0e332.size();
    }

    public static void \u052c(\u013a \u013a2, int n2) {
        if (\u013a2 == null) {
            return;
        }
        \u013a2.\u0860(SOY.d("3F1E0E25353A3F0D05373328331C15332C28311708"), String.valueOf(n2));
    }
}

