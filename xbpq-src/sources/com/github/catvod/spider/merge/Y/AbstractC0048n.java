package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.cYh;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.github.catvod.spider.merge.Y.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC0048n extends AbstractC0049o {
    Pattern a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0048n() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.Y.AbstractC0049o
    public final boolean a() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.Y.AbstractC0049o
    public final boolean b(t tVar, Calendar calendar, String str, ParsePosition parsePosition, int i) {
        Matcher matcher = this.a.matcher(str.substring(parsePosition.getIndex()));
        if (!matcher.lookingAt()) {
            parsePosition.setErrorIndex(parsePosition.getIndex());
            return false;
        }
        parsePosition.setIndex(matcher.end(1) + parsePosition.getIndex());
        c(calendar, matcher.group(1));
        return true;
    }

    abstract void c(Calendar calendar, String str);

    public String toString() {
        return getClass().getSimpleName() + cYh.d("470B3130232E02222F6C") + this.a + cYh.d("3A");
    }
}
