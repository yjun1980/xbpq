/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u0155;
import com.github.catvod.spider.merge.\u03aa;
import com.github.catvod.spider.merge.\u068c;
import com.github.catvod.spider.merge.\u0774;
import com.github.catvod.spider.merge.\u07e0;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

public class \u0b3d
implements \u03aa {
    @Override
    public String name() {
        return SOY.d("1C3D231B15035736300211");
    }

    @Override
    public \u07e0 \u037f(\u0155 object, List<\u07e0> object2) {
        object = object2.get(0).\u052d();
        String string = object2.get(1).\u052d();
        try {
            if (object2.size() > 2 && object2.get(2) != null) {
                Locale locale = Locale.forLanguageTag(object2.get(2).\u052d());
                object2 = new SimpleDateFormat(string, locale);
                return \u07e0.\u058f(((DateFormat)object2).parse((String)object));
            }
            object = \u07e0.\u058f(\u0774.\u037f(string).\u0529((String)object));
            return object;
        }
        catch (ParseException parseException) {
            throw new \u068c(SOY.d("1E332513541115203C1700571F2A32130403133D3F57"), parseException);
        }
    }
}

