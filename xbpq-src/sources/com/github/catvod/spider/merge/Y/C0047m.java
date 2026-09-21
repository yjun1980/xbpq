package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;
import java.text.ParsePosition;
import java.util.Calendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.Y.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0047m extends AbstractC0049o {
    private final int a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0047m(int i) {
        super(null);
        this.a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.Y.AbstractC0049o
    public final boolean a() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.Y.AbstractC0049o
    public final boolean b(t tVar, Calendar calendar, String str, ParsePosition parsePosition, int i) {
        int index = parsePosition.getIndex();
        int length = str.length();
        if (i == 0) {
            while (index < length && Character.isWhitespace(str.charAt(index))) {
                index++;
            }
            parsePosition.setIndex(index);
        } else {
            int i2 = i + index;
            if (length > i2) {
                length = i2;
            }
        }
        while (index < length && Character.isDigit(str.charAt(index))) {
            index++;
        }
        if (parsePosition.getIndex() == index) {
            parsePosition.setErrorIndex(index);
            return false;
        }
        int parseInt = Integer.parseInt(str.substring(parsePosition.getIndex(), index));
        parsePosition.setIndex(index);
        calendar.set(this.a, c(tVar, parseInt));
        return true;
    }

    int c(t tVar, int i) {
        return i;
    }

    public final String toString() {
        StringBuilder b = C0059d.b(cYh.d("29252C33322834243330233F0029610A3133023C256C"));
        b.append(this.a);
        b.append(cYh.d("3A"));
        return b.toString();
    }
}
