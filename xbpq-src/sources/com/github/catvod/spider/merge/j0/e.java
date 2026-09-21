package com.github.catvod.spider.merge.j0;

import com.github.catvod.spider.merge.Y.C0037c;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.x.C0244b;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class e implements com.github.catvod.spider.merge.h0.b {
    @Override // com.github.catvod.spider.merge.h0.b
    public final String a() {
        return cYh.d("013F333C362E4A34202532");
    }

    @Override // com.github.catvod.spider.merge.h0.b
    public final com.github.catvod.spider.merge.h0.e b(com.github.catvod.spider.merge.h0.d dVar, List<com.github.catvod.spider.merge.h0.e> list) {
        LinkedList linkedList = (LinkedList) list;
        String g = ((com.github.catvod.spider.merge.h0.e) linkedList.get(0)).g();
        String g2 = ((com.github.catvod.spider.merge.h0.e) linkedList.get(1)).g();
        try {
            if (linkedList.size() > 2 && linkedList.get(2) != null) {
                return new com.github.catvod.spider.merge.h0.e(new SimpleDateFormat(g2, Locale.forLanguageTag(((com.github.catvod.spider.merge.h0.e) linkedList.get(2)).g())).parse(g));
            }
            return new com.github.catvod.spider.merge.h0.e(C0037c.b(g2).c(g));
        } catch (ParseException e) {
            throw new C0244b(e);
        }
    }
}
