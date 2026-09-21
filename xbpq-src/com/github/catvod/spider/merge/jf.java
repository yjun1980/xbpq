/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.Sj;
import com.github.catvod.spider.merge.Yg;
import com.github.catvod.spider.merge.gp;
import com.github.catvod.spider.merge.zE;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

public class jf
implements gp {
    final Map<String, Yg> S = new HashMap<String, Yg>();
    final LinkedBlockingQueue<zE> T4 = new LinkedBlockingQueue();
    boolean l8 = false;

    public void OL() {
        this.l8 = true;
    }

    public void S() {
        this.S.clear();
        this.T4.clear();
    }

    public LinkedBlockingQueue<zE> T4() {
        return this.T4;
    }

    public List<Yg> b() {
        return new ArrayList<Yg>(this.S.values());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Sj l8(String string) {
        synchronized (this) {
            Yg yg;
            Yg yg2 = yg = this.S.get(string);
            if (yg == null) {
                yg2 = new Yg(string, this.T4, this.l8);
                this.S.put(string, yg2);
            }
            return yg2;
        }
    }
}

