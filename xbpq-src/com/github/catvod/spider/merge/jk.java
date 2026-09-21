/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.Iw;
import com.github.catvod.spider.merge.tv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class jk
extends ArrayList<Iw> {
    public jk() {
    }

    public jk(int n2) {
        super(n2);
    }

    public jk(List<Iw> list) {
        super(list);
    }

    public String OL() {
        StringBuilder stringBuilder = tv.S();
        for (Iw iw : this) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(iw.GO());
        }
        return tv.cD(stringBuilder);
    }

    public jk S() {
        jk jk2 = new jk(this.size());
        Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            jk2.add(((Iw)iterator.next()).H());
        }
        return jk2;
    }

    @Nullable
    public Iw T4() {
        Iw iw = this.isEmpty() ? null : (Iw)this.get(this.size() - 1);
        return iw;
    }

    public String b() {
        StringBuilder stringBuilder = tv.S();
        for (Iw iw : this) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append("\n");
            }
            stringBuilder.append(iw.C());
        }
        return tv.cD(stringBuilder);
    }

    public String l8(String string) {
        for (Iw iw : this) {
            if (!iw.Kf(string)) continue;
            return iw.T4(string);
        }
        return "";
    }

    @Override
    public String toString() {
        return this.b();
    }
}

