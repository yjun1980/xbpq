/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.Sj;
import com.github.catvod.spider.merge.cL;
import com.github.catvod.spider.merge.mm;
import com.github.catvod.spider.merge.zE;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;

public class Yg
implements Sj {
    private Queue<zE> OL;
    private volatile Sj S;
    private Boolean T4;
    private Method b;
    private final boolean l;
    private final String l8;

    public Yg(String string, Queue<zE> queue, boolean bl) {
        this.l8 = string;
        this.OL = queue;
        this.l = bl;
    }

    public void OL(Sj sj) {
        this.S = sj;
    }

    public boolean S() {
        return this.S instanceof cL;
    }

    public boolean T4() {
        boolean bl = this.S == null;
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(mm mm2) {
        if (!this.l8()) return;
        try {
            this.b.invoke(this.S, mm2);
            return;
        }
        catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException exception) {
            return;
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && Yg.class == object.getClass()) {
            object = (Yg)object;
            return this.l8.equals(((Yg)object).l8);
        }
        return false;
    }

    @Override
    public String getName() {
        return this.l8;
    }

    public int hashCode() {
        return this.l8.hashCode();
    }

    public boolean l8() {
        Boolean bl = this.T4;
        if (bl != null) {
            return bl;
        }
        try {
            this.b = this.S.getClass().getMethod("log", mm.class);
            this.T4 = Boolean.TRUE;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            this.T4 = Boolean.FALSE;
        }
        return this.T4;
    }
}

