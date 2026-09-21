/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.j0;

import com.github.catvod.spider.merge.Y.c;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.h0.b;
import com.github.catvod.spider.merge.h0.d;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public final class e
implements b {
    @Override
    public final String a() {
        return cYh.d("013F333C362E4A34202532");
    }

    @Override
    public final com.github.catvod.spider.merge.h0.e b(d object, List<com.github.catvod.spider.merge.h0.e> object2) {
        Cloneable cloneable = (LinkedList)object2;
        object = ((com.github.catvod.spider.merge.h0.e)cloneable.get(0)).g();
        object2 = ((com.github.catvod.spider.merge.h0.e)cloneable.get(1)).g();
        try {
            if (cloneable.size() > 2 && cloneable.get(2) != null) {
                cloneable = Locale.forLanguageTag(((com.github.catvod.spider.merge.h0.e)cloneable.get(2)).g());
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat((String)object2, (Locale)cloneable);
                return new com.github.catvod.spider.merge.h0.e(simpleDateFormat.parse((String)object));
            }
            object = new com.github.catvod.spider.merge.h0.e(c.b((String)object2).c((String)object));
            return object;
        }
        catch (ParseException parseException) {
            throw new com.github.catvod.spider.merge.x.b(parseException);
        }
    }
}

