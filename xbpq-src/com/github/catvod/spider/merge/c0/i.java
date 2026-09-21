/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.c0;

import com.github.catvod.spider.merge.N.a;
import com.github.catvod.spider.merge.b0.b;
import com.github.catvod.spider.merge.c0.g;
import com.github.catvod.spider.merge.c0.p;
import com.github.catvod.spider.merge.c0.r;
import com.github.catvod.spider.merge.cYh;

public final class i
extends p {
    public i(String string, String string2, String string3) {
        block4: {
            block3: {
                block2: {
                    a.k(string);
                    a.k(string2);
                    a.k(string3);
                    super.b(cYh.d("09312C34"), string);
                    string = cYh.d("1725233D3E392E34");
                    super.b(string, string2);
                    string2 = cYh.d("1429322532372E34");
                    super.b(string2, string3);
                    if (!this.K(string)) break block2;
                    string = cYh.d("3705031D1E19");
                    break block3;
                }
                if (!this.K(string2)) break block4;
                string = cYh.d("340912051217");
            }
            super.b(cYh.d("172523022E292C3538"), string);
        }
    }

    private boolean K(String string) {
        return b.c(super.c(string)) ^ true;
    }

    public final void L(String string) {
        if (string != null) {
            super.b(cYh.d("172523022E292C3538"), string);
        }
    }

    @Override
    public final r m() {
        return this;
    }

    @Override
    public final String t() {
        return cYh.d("44342E3223231735");
    }

    @Override
    final void w(Appendable appendable, int n2, g object) {
        n2 = ((g)object).g();
        String string = cYh.d("1429322532372E34");
        String string2 = cYh.d("1725233D3E392E34");
        object = n2 == 1 && !this.K(string2) && !this.K(string) ? cYh.d("5B71253E342E1E2024") : cYh.d("5B71051E140E3E0004");
        appendable.append((CharSequence)object);
        String string3 = cYh.d("09312C34");
        boolean bl = this.K(string3);
        object = cYh.d("47");
        if (bl) {
            appendable.append((CharSequence)object).append(super.c(string3));
        }
        if (this.K(string3 = cYh.d("172523022E292C3538"))) {
            appendable.append((CharSequence)object).append(super.c(string3));
        }
        bl = this.K(string2);
        object = cYh.d("4772");
        if (bl) {
            appendable.append((CharSequence)object).append(super.c(string2)).append('\"');
        }
        if (this.K(string)) {
            appendable.append((CharSequence)object).append(super.c(string)).append('\"');
        }
        appendable.append('>');
    }

    @Override
    final void x(Appendable appendable, int n2, g g2) {
    }
}

