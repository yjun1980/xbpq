/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u0130;
import com.github.catvod.spider.merge.\u0159;
import com.github.catvod.spider.merge.\u019a;
import com.github.catvod.spider.merge.\u01c0;
import com.github.catvod.spider.merge.\u0211;
import com.github.catvod.spider.merge.\u0213;
import com.github.catvod.spider.merge.\u024d;
import com.github.catvod.spider.merge.\u0268;
import com.github.catvod.spider.merge.\u0269;
import com.github.catvod.spider.merge.\u026a;
import com.github.catvod.spider.merge.\u0294;
import com.github.catvod.spider.merge.\u0295;
import com.github.catvod.spider.merge.\u02b2;
import com.github.catvod.spider.merge.\u0390;
import com.github.catvod.spider.merge.\u03a4;
import com.github.catvod.spider.merge.\u03aa;
import com.github.catvod.spider.merge.\u03af;
import com.github.catvod.spider.merge.\u0453;
import com.github.catvod.spider.merge.\u0491;
import com.github.catvod.spider.merge.\u05e8;
import com.github.catvod.spider.merge.\u0629;
import com.github.catvod.spider.merge.\u062f;
import com.github.catvod.spider.merge.\u0630;
import com.github.catvod.spider.merge.\u0647;
import com.github.catvod.spider.merge.\u0688;
import com.github.catvod.spider.merge.\u06c0;
import com.github.catvod.spider.merge.\u06d5;
import com.github.catvod.spider.merge.\u06ee;
import com.github.catvod.spider.merge.\u07cc;
import com.github.catvod.spider.merge.\u07d1;
import com.github.catvod.spider.merge.\u07d3;
import com.github.catvod.spider.merge.\u07d4;
import com.github.catvod.spider.merge.\u07d9;
import com.github.catvod.spider.merge.\u0846;
import com.github.catvod.spider.merge.\u0930;
import com.github.catvod.spider.merge.\u09fb;
import com.github.catvod.spider.merge.\u0b3d;
import com.github.catvod.spider.merge.\u0e32;
import com.github.catvod.spider.merge.\u0e40;
import com.github.catvod.spider.merge.\u0ec2;
import com.github.catvod.spider.merge.\u0ec3;
import com.github.catvod.spider.merge.\u0ec4;
import com.github.catvod.spider.merge.\u0f41;
import com.github.catvod.spider.merge.\u0f47;
import java.util.HashMap;
import java.util.Map;

public class \u04af {
    private static Map<String, \u0130> \u037f = new HashMap<String, \u0130>();
    private static Map<String, \u07d9> \u0528 = new HashMap<String, \u07d9>();
    private static Map<String, \u03aa> \u0529 = new HashMap<String, \u03aa>();
    private static \u0f41 \u052a = \u024d.\u052f(\u04af.class);

    static {
        \u04af.\u052a(\u0269.class, \u0e40.class, \u0211.class, \u05e8.class, \u0846.class, \u0647.class, \u06d5.class, \u062f.class, \u07d3.class, \u0213.class, \u0930.class, \u03a4.class, \u0159.class, \u0ec4.class);
        \u04af.\u052b(\u07cc.class, \u07d1.class, \u0295.class, \u0ec2.class, \u0ec3.class, \u0e32.class, \u0268.class, \u09fb.class, \u03af.class, \u0630.class, \u06ee.class, \u0453.class, \u06c0.class, \u0b3d.class, \u026a.class, \u0294.class);
        \u04af.\u052c(\u07d4.class, \u0f47.class, \u0491.class, \u01c0.class, \u0390.class, \u0688.class);
    }

    public static \u03aa \u037f(String string) {
        Object object = \u0529.get(string);
        if (object != null) {
            return object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(SOY.d("143D255607020A223E0400571C273F15001E153C6B56"));
        ((StringBuilder)object).append(string);
        throw new \u0629(((StringBuilder)object).toString());
    }

    public static \u07d9 \u0528(String string) {
        Object object = \u0528.get(string);
        if (object != null) {
            return object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(SOY.d("143D255607020A223E040057143D3513201209266B56"));
        ((StringBuilder)object).append(string);
        throw new \u0629(((StringBuilder)object).toString());
    }

    public static \u0130 \u0529(String string) {
        Object object = \u037f.get(string);
        if (object != null) {
            return object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(SOY.d("143D255607020A223E0400571B2A38054E57"));
        ((StringBuilder)object).append(string);
        throw new \u019a(((StringBuilder)object).toString());
    }

    public static void \u052a(Class<? extends \u0130> ... classArray) {
        int n2 = classArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            \u04af.\u052d(classArray[i2]);
        }
    }

    public static void \u052b(Class<? extends \u03aa> ... classArray) {
        int n2 = classArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            \u04af.\u052e(classArray[i2]);
        }
    }

    public static void \u052c(Class<? extends \u07d9> ... classArray) {
        int n2 = classArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            \u04af.\u052f(classArray[i2]);
        }
    }

    public static void \u052d(Class<? extends \u0130> object) {
        try {
            object = ((Class)object).newInstance();
            \u037f.put(object.name(), (\u0130)object);
        }
        catch (Exception exception) {
            \u052a.\u037f(\u02b2.\u0529(exception), exception);
        }
    }

    public static void \u052e(Class<? extends \u03aa> object) {
        try {
            object = ((Class)object).newInstance();
            \u0529.put(object.name(), (\u03aa)object);
        }
        catch (Exception exception) {
            \u052a.\u037f(\u02b2.\u0529(exception), exception);
        }
    }

    public static void \u052f(Class<? extends \u07d9> object) {
        try {
            object = ((Class)object).newInstance();
            \u0528.put(object.name(), (\u07d9)object);
        }
        catch (Exception exception) {
            \u052a.\u037f(\u02b2.\u0529(exception), exception);
        }
    }
}

