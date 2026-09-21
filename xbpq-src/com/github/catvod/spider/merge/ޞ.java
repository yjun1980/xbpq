/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u02cb;
import com.github.catvod.spider.merge.\u08a3;
import com.github.catvod.spider.merge.\u08a5;
import com.github.catvod.spider.merge.\u08a6;
import com.github.catvod.spider.merge.\u08a9;
import java.util.ArrayList;
import java.util.List;

public class \u079e
implements \u08a6 {
    protected \u08a5 \u037f;
    protected List<\u08a3> \u0528 = new ArrayList<\u08a3>(100);
    protected int \u0529 = -1;
    protected boolean \u052a;

    public \u079e(\u08a5 \u08a52) {
        if (\u08a52 != null) {
            this.\u037f = \u08a52;
            return;
        }
        throw new NullPointerException(SOY.d("0E3D3A131A2415272315115719333F181B035A3034561A02163E"));
    }

    @Override
    public \u08a3 get(int n2) {
        if (n2 >= 0 && n2 < this.\u0528.size()) {
            return this.\u0528.get(n2);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(SOY.d("0E3D3A131A57133C35130C57"));
        stringBuilder.append(n2);
        stringBuilder.append(SOY.d("5A3D240254181C7223171A101F7261585A"));
        stringBuilder.append(this.\u0528.size() - 1);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    @Override
    public int size() {
        return this.\u0528.size();
    }

    @Override
    public int \u037f() {
        return 0;
    }

    @Override
    public String \u0528(\u08a3 \u08a32, \u08a3 \u08a33) {
        if (\u08a32 != null && \u08a33 != null) {
            return this.\u052e(\u02cb.\u0529(\u08a32.\u052b(), \u08a33.\u052b()));
        }
        return "";
    }

    @Override
    public void \u0529(int n2) {
        this.\u0782();
        this.\u0529 = this.\u0620(n2);
    }

    @Override
    public \u08a5 \u052a() {
        return this.\u037f;
    }

    @Override
    public \u08a3 \u052b(int n2) {
        throw null;
    }

    @Override
    public int \u052c(int n2) {
        return this.\u052b(n2).getType();
    }

    @Override
    public int \u052d() {
        return this.\u0529;
    }

    public String \u052e(\u02cb object) {
        int n2 = ((\u02cb)object).\u052d;
        int n3 = ((\u02cb)object).\u052e;
        if (n2 >= 0 && n3 >= 0) {
            this.\u0781();
            int n4 = n3;
            if (n3 >= this.\u0528.size()) {
                n4 = this.\u0528.size() - 1;
            }
            StringBuilder stringBuilder = new StringBuilder();
            while (n2 <= n4 && (object = this.\u0528.get(n2)).getType() != -1) {
                stringBuilder.append(object.\u0528());
                ++n2;
            }
            return stringBuilder.toString();
        }
        return "";
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void \u052f() {
        boolean bl;
        block5: {
            block7: {
                boolean bl2;
                int n2;
                block6: {
                    n2 = this.\u0529;
                    bl = bl2 = false;
                    if (n2 < 0) break block5;
                    if (!this.\u052a) break block6;
                    bl = bl2;
                    if (n2 >= this.\u0528.size() - 1) break block5;
                    break block7;
                }
                bl = bl2;
                if (n2 >= this.\u0528.size()) break block5;
            }
            bl = true;
        }
        if (!bl && this.\u052c(1) == -1) {
            throw new IllegalStateException(SOY.d("19333F181B035A313E180702173771333B31"));
        }
        if (this.\u0786(this.\u0529 + 1)) {
            this.\u0529 = this.\u0620(this.\u0529 + 1);
        }
    }

    @Override
    public void \u058f(int n2) {
    }

    protected int \u0620(int n2) {
        throw null;
    }

    protected int \u0780(int n2) {
        boolean bl = this.\u052a;
        if (bl) {
            return 0;
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            \u08a3 \u08a32 = this.\u037f.\u052b();
            if (\u08a32 instanceof \u08a9) {
                ((\u08a9)\u08a32).\u052c(this.\u0528.size());
            }
            this.\u0528.add(\u08a32);
            if (\u08a32.getType() != -1) continue;
            this.\u052a = true;
            return i2 + 1;
        }
        return n2;
    }

    public void \u0781() {
        this.\u0782();
        while (this.\u0780(1000) >= 1000) {
        }
    }

    protected final void \u0782() {
        if (this.\u0529 == -1) {
            this.\u0785();
        }
    }

    protected int \u0783(int n2, int n3) {
        this.\u0786(n2);
        if (n2 >= this.size()) {
            return this.size() - 1;
        }
        \u08a3 \u08a32 = this.\u0528.get(n2);
        while (\u08a32.getChannel() != n3) {
            if (\u08a32.getType() == -1) {
                return n2;
            }
            this.\u0786(++n2);
            \u08a32 = this.\u0528.get(n2);
        }
        return n2;
    }

    protected int \u0784(int n2, int n3) {
        \u08a3 \u08a32;
        int n4;
        this.\u0786(n2);
        if (n2 >= this.size()) {
            return this.size() - 1;
        }
        for (n4 = n2; n4 >= 0 && (\u08a32 = this.\u0528.get(n4)).getType() != -1 && \u08a32.getChannel() != n3; --n4) {
        }
        return n4;
    }

    protected void \u0785() {
        this.\u0786(0);
        this.\u0529 = this.\u0620(0);
    }

    protected boolean \u0786(int n2) {
        int n3 = this.\u0528.size();
        boolean bl = true;
        n2 = n2 - n3 + 1;
        boolean bl2 = bl;
        if (n2 > 0) {
            bl2 = this.\u0780(n2) >= n2 ? bl : false;
        }
        return bl2;
    }
}

