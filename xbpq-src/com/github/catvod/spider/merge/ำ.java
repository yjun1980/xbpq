/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u0131;
import com.github.catvod.spider.merge.\u013a;
import com.github.catvod.spider.merge.\u0393;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class \u0e33
extends ArrayList<\u013a> {
    public \u0e33() {
    }

    public \u0e33(int n2) {
        super(n2);
    }

    public \u0e33(List<\u013a> list) {
        super(list);
    }

    public \u0e33(\u013a ... \u013aArray) {
        super(Arrays.asList(\u013aArray));
    }

    @Override
    public String toString() {
        return this.\u052c();
    }

    public String \u037f(String string) {
        for (\u013a \u013a2 : this) {
            if (!\u013a2.\u0784(string)) continue;
            return \u013a2.\u0529(string);
        }
        return "";
    }

    public \u0e33 \u0528() {
        \u0e33 \u0e332 = new \u0e33(this.size());
        Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            \u0e332.add(((\u013a)iterator.next()).\u0865());
        }
        return \u0e332;
    }

    @Nullable
    public \u013a \u0529() {
        \u013a \u013a2 = this.isEmpty() ? null : (\u013a)this.get(0);
        return \u013a2;
    }

    public String \u052a() {
        StringBuilder stringBuilder = \u0131.\u0528();
        for (\u013a \u013a2 : this) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append(SOY.d("70"));
            }
            stringBuilder.append(\u013a2.\u08a3());
        }
        return \u0131.\u0781(stringBuilder);
    }

    @Nullable
    public \u013a \u052b() {
        \u013a \u013a2 = this.isEmpty() ? null : (\u013a)this.get(this.size() - 1);
        return \u013a2;
    }

    public String \u052c() {
        StringBuilder stringBuilder = \u0131.\u0528();
        for (\u013a \u013a2 : this) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append(SOY.d("70"));
            }
            stringBuilder.append(\u013a2.\u078b());
        }
        return \u0131.\u0781(stringBuilder);
    }

    public \u0e33 \u052d(String string) {
        return \u0393.\u037f(string, this);
    }

    public String \u052e() {
        StringBuilder stringBuilder = \u0131.\u0528();
        for (\u013a \u013a2 : this) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append(SOY.d("5A"));
            }
            stringBuilder.append(\u013a2.\u08b9());
        }
        return \u0131.\u0781(stringBuilder);
    }
}

