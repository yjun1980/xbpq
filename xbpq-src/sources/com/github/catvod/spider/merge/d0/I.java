package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;

/* loaded from: classes.dex */
final class I extends O {
    private final StringBuilder b = new StringBuilder();
    private String c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public I() {
        this.a = 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.O
    public final O g() {
        O.h(this.b);
        this.c = null;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final I i(char c) {
        String str = this.c;
        if (str != null) {
            this.b.append(str);
            this.c = null;
        }
        this.b.append(c);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final I j(String str) {
        String str2 = this.c;
        if (str2 != null) {
            this.b.append(str2);
            this.c = null;
        }
        if (this.b.length() == 0) {
            this.c = str;
        } else {
            this.b.append(str);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String k() {
        String str = this.c;
        return str != null ? str : this.b.toString();
    }

    public final String toString() {
        StringBuilder b = C0059d.b(cYh.d("5B716C7C"));
        String str = this.c;
        if (str == null) {
            str = this.b.toString();
        }
        return com.github.catvod.spider.merge.b.n.b(b, str, cYh.d("4A7D7F"));
    }
}
