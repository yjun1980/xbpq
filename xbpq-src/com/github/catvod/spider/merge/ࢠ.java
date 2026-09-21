/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u079b;
import com.github.catvod.spider.merge.\u07b1;
import com.github.catvod.spider.merge.\u0869;
import com.github.catvod.spider.merge.\u08a1;
import com.github.catvod.spider.merge.\u08a7;
import com.github.catvod.spider.merge.\u08aa;
import com.github.catvod.spider.merge.\u08af;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class \u08a0<Symbol, ATNInterpreter extends \u08af> {
    private List<\u079b> \u037f = new CopyOnWriteArrayList<\u079b>(this){
        final \u08a0 \u037f;
        {
            this.\u037f = \u08a02;
            this.add(\u07b1.\u037f);
        }
    };
    protected ATNInterpreter \u0528;
    private int \u0529 = -1;

    public void \u052c(\u08a1 \u08a12, int n2, int n3) {
    }

    public abstract \u08aa \u052d();

    public \u079b \u052e() {
        return new \u0869(this.\u052f());
    }

    public List<? extends \u079b> \u052f() {
        return this.\u037f;
    }

    public ATNInterpreter \u058f() {
        return this.\u0528;
    }

    public abstract String[] \u0620();

    public final int \u0780() {
        return this.\u0529;
    }

    public abstract \u08a7 \u0781();

    public boolean \u0782(\u08a1 \u08a12, int n2) {
        return true;
    }

    public boolean \u0783(\u08a1 \u08a12, int n2, int n3) {
        return true;
    }

    public final void \u0784(int n2) {
        this.\u0529 = n2;
    }
}

