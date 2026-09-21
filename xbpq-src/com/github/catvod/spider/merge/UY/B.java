/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.UY;

import com.github.catvod.spider.merge.xc.G0.a;

public final class B {
    public final int a;
    public String b;
    public String c;

    public B() {
        this.a = 1;
    }

    public /* synthetic */ B(int n2, String string, String string2) {
        this.a = n2;
        this.b = string;
        this.c = string2;
    }

    public B(a a2, String string) {
        this.a = 2;
        a2.getClass();
        this.b = a2.m();
        this.c = string;
    }

    public B(a a2, String string, Object[] objectArray) {
        this.a = 2;
        a2.getClass();
        this.b = a2.m();
        this.c = String.format(string, objectArray);
    }

    public String toString() {
        switch (this.a) {
            default: {
                return super.toString();
            }
            case 2: 
        }
        StringBuilder stringBuilder = new StringBuilder("<");
        stringBuilder.append(this.b);
        stringBuilder.append(">: ");
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }
}

