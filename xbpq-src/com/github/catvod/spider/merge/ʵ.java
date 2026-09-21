/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u02b6;
import com.github.catvod.spider.merge.\u02cf;

@Deprecated
public class \u02b5
extends \u02cf {
    public \u02b5(int n2, int n3, boolean bl) {
        super(n2, n3, bl);
    }

    public static \u02b5 \u052e(int n2, int n3) {
        return new \u02b5(n2, n3, false);
    }

    @Override
    protected String \u052d(int n2) {
        char[] cArray = Character.toChars(n2);
        StringBuilder stringBuilder = new StringBuilder();
        String string = SOY.d("2627");
        stringBuilder.append(string);
        stringBuilder.append(\u02b6.\u037f(cArray[0]));
        stringBuilder.append(string);
        stringBuilder.append(\u02b6.\u037f(cArray[1]));
        return stringBuilder.toString();
    }
}

