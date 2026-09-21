/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.y.T;

final class S
extends T {
    private final String e;

    public S(String string) {
        this.e = string;
        this.e();
        this.f();
    }

    @Override
    protected final void b() {
        char c2;
        int n2;
        int n3 = this.b;
        while ((n2 = n3 + 1) < this.e.length() && (c2 = this.e.charAt(n2)) != '\\') {
            n3 = n2;
            if (c2 != '\"') continue;
            String string = this.e;
            n3 = n2 + 1;
            this.c = string.charAt(n3);
            this.b = n3;
            return;
        }
        while (true) {
            this.e();
            n3 = this.c;
            if (n3 == 92) {
                this.e();
                if (this.c != 'u') continue;
                this.e();
                this.e();
                this.e();
                this.e();
                continue;
            }
            if (n3 == 34) {
                this.e();
                break;
            }
            if (this.a) break;
        }
    }

    @Override
    final void e() {
        int n2;
        this.b = n2 = this.b + 1;
        if (n2 >= this.e.length()) {
            this.c = '\u0000';
            this.a = true;
        } else {
            this.c = this.e.charAt(this.b);
        }
    }
}

