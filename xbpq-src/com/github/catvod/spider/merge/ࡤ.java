/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u02c9;
import com.github.catvod.spider.merge.\u02ca;
import com.github.catvod.spider.merge.\u02cb;
import com.github.catvod.spider.merge.\u079f;
import com.github.catvod.spider.merge.\u07a4;
import com.github.catvod.spider.merge.\u0865;
import com.github.catvod.spider.merge.\u08a0;
import com.github.catvod.spider.merge.\u08a3;
import com.github.catvod.spider.merge.\u08a4;
import com.github.catvod.spider.merge.\u08a5;
import com.github.catvod.spider.merge.\u0c80;
import java.util.EmptyStackException;

public abstract class \u0864
extends \u08a0<Integer, \u0c80>
implements \u08a5 {
    public \u079f \u052a;
    protected \u02c9<\u08a5, \u079f> \u052b;
    protected \u08a4<?> \u052c = \u07a4.\u037f;
    public \u08a3 \u052d;
    public int \u052e = -1;
    public int \u052f;
    public int \u058f;
    public boolean \u0620;
    public int \u0780;
    public int \u0781;
    public final \u02ca \u0782 = new \u02ca();
    public int \u0783 = 0;
    public String \u0784;

    public \u0864(\u079f \u079f2) {
        this.\u052a = \u079f2;
        this.\u052b = new \u02c9<\u0864, \u079f>(this, \u079f2);
    }

    @Override
    public int \u037f() {
        return ((\u0c80)this.\u058f()).\u0783();
    }

    @Override
    public \u079f \u0528() {
        return this.\u052a;
    }

    @Override
    public int \u0529() {
        return ((\u0c80)this.\u058f()).\u0786();
    }

    public \u08a4<? extends \u08a3> \u052a() {
        return this.\u052c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public \u08a3 \u052b() {
        Object object = this.\u052a;
        if (object == null) {
            object = new IllegalStateException(SOY.d("14372902201811373F5606120B27380411045A3371181B19573C241A1857133C2103005709262313151A54"));
            throw object;
        }
        int n2 = object.\u037f();
        try {
            block6: while (true) {
                int n3;
                if (this.\u0620) {
                    this.\u0787();
                    object = this.\u052d;
                    return object;
                }
                this.\u052d = null;
                this.\u0780 = 0;
                this.\u052e = this.\u052a.\u052d();
                this.\u058f = ((\u0c80)this.\u058f()).\u0783();
                this.\u052f = ((\u0c80)this.\u058f()).\u0786();
                this.\u0784 = null;
                do {
                    this.\u0781 = 0;
                    try {
                        n3 = ((\u0c80)this.\u058f()).\u0789(this.\u052a, this.\u0783);
                    }
                    catch (\u0865 \u08652) {
                        this.\u078d(\u08652);
                        this.\u0790(\u08652);
                        n3 = -3;
                    }
                    if (this.\u052a.\u052c(1) == -1) {
                        this.\u0620 = true;
                    }
                    if (this.\u0781 == 0) {
                        this.\u0781 = n3;
                    }
                    if ((n3 = this.\u0781) == -3) continue block6;
                } while (n3 == -2);
                break;
            }
            if (this.\u052d == null) {
                this.\u0785();
            }
            object = this.\u052d;
            return object;
        }
        finally {
            this.\u052a.\u058f(n2);
        }
    }

    public \u08a3 \u0785() {
        Object obj = this.\u052c.\u037f(this.\u052b, this.\u0781, this.\u0784, this.\u0780, this.\u052e, this.\u0788() - 1, this.\u052f, this.\u058f);
        this.\u0786((\u08a3)obj);
        return obj;
    }

    public void \u0786(\u08a3 \u08a32) {
        this.\u052d = \u08a32;
    }

    public \u08a3 \u0787() {
        int n2 = this.\u037f();
        int n3 = this.\u0529();
        Object obj = this.\u052c.\u037f(this.\u052b, -1, null, 0, this.\u052a.\u052d(), this.\u052a.\u052d() - 1, n3, n2);
        this.\u0786((\u08a3)obj);
        return obj;
    }

    public int \u0788() {
        return this.\u052a.\u052d();
    }

    public String \u0789(int n2) {
        String string = String.valueOf((char)n2);
        if (n2 != -1) {
            if (n2 != 13) {
                if (n2 != 9) {
                    if (n2 == 10) {
                        string = SOY.d("263C");
                    }
                } else {
                    string = SOY.d("2626");
                }
            } else {
                string = SOY.d("2620");
            }
        } else {
            string = SOY.d("46171E304A");
        }
        return string;
    }

    public String \u078a(String object) {
        StringBuilder stringBuilder = new StringBuilder();
        object = ((String)object).toCharArray();
        int n2 = ((Object)object).length;
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append(this.\u0789((int)object[i2]));
        }
        return stringBuilder.toString();
    }

    public void \u078b(int n2) {
        this.\u0783 = n2;
    }

    public void \u078c() {
        this.\u0781 = -2;
    }

    public void \u078d(\u0865 \u08652) {
        Object object = this.\u052a;
        String string = object.\u052e(\u02cb.\u0529(this.\u052e, object.\u052d()));
        object = new StringBuilder();
        ((StringBuilder)object).append(SOY.d("0E3D3A131A57083732191319132638191A571F20231906571B266B5653"));
        ((StringBuilder)object).append(this.\u078a(string));
        ((StringBuilder)object).append(SOY.d("5D"));
        object = ((StringBuilder)object).toString();
        this.\u052e().\u0529(this, null, this.\u052f, this.\u058f, (String)object, \u08652);
    }

    public int \u078e() {
        if (!this.\u0782.\u052b()) {
            this.\u078b(this.\u0782.\u058f());
            return this.\u0783;
        }
        throw new EmptyStackException();
    }

    public void \u078f(int n2) {
        this.\u0782.\u0620(this.\u0783);
        this.\u078b(n2);
    }

    public void \u0790(\u0865 \u08652) {
        if (this.\u052a.\u052c(1) != -1) {
            ((\u0c80)this.\u058f()).\u0620(this.\u052a);
        }
    }

    public void \u0791(int n2) {
        this.\u0780 = n2;
    }

    public void \u0792(int n2) {
        this.\u0781 = n2;
    }

    public void \u0793() {
        this.\u0781 = -3;
    }
}

