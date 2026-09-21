/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u02b3;
import com.github.catvod.spider.merge.\u02bb;
import com.github.catvod.spider.merge.\u02be;
import com.github.catvod.spider.merge.\u02ca;
import com.github.catvod.spider.merge.\u0559;
import com.github.catvod.spider.merge.\u0674;
import com.github.catvod.spider.merge.\u079c;
import com.github.catvod.spider.merge.\u081a;
import com.github.catvod.spider.merge.\u0860;
import com.github.catvod.spider.merge.\u0863;
import com.github.catvod.spider.merge.\u0868;
import com.github.catvod.spider.merge.\u086a;
import com.github.catvod.spider.merge.\u08a0;
import com.github.catvod.spider.merge.\u08a1;
import com.github.catvod.spider.merge.\u08a3;
import com.github.catvod.spider.merge.\u08a4;
import com.github.catvod.spider.merge.\u08a6;
import com.github.catvod.spider.merge.\u08aa;
import com.github.catvod.spider.merge.\u08af;
import com.github.catvod.spider.merge.\u1028;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public abstract class \u0867
extends \u08a0<\u08a3, \u1028> {
    private static final Map<String, \u08aa> \u052a = new WeakHashMap<String, \u08aa>();
    protected \u079c \u052b = new \u0860();
    protected \u08a6 \u052c;
    protected final \u02ca \u052d;
    protected \u0868 \u052e;
    protected boolean \u052f;
    private \u037f \u058f;
    protected List<\u0559> \u0620;
    protected int \u0780;
    protected boolean \u0781;

    public \u0867(\u08a6 \u08a62) {
        \u02ca \u02ca2;
        this.\u052d = \u02ca2 = new \u02ca();
        \u02ca2.\u0620(0);
        this.\u052f = true;
        this.\u0798(\u08a62);
    }

    public \u08a4<?> \u052a() {
        return this.\u052c.\u052a().\u052a();
    }

    @Override
    public boolean \u0782(\u08a1 \u08a12, int n2) {
        boolean bl = n2 >= this.\u052d.\u052f();
        return bl;
    }

    protected void \u0785() {
        \u0868 \u08682 = this.\u052e;
        \u0868 \u08683 = (\u0868)\u08682.\u0528;
        if (\u08683 != null) {
            \u08683.\u0781(\u08682);
        }
    }

    public void \u0786(\u0559 \u05592) {
        if (\u05592 != null) {
            if (this.\u0620 == null) {
                this.\u0620 = new ArrayList<\u0559>();
            }
            this.\u0620.add(\u05592);
            return;
        }
        throw new NullPointerException(SOY.d("163B220211191F20"));
    }

    public \u08a3 \u0787() {
        \u08a3 \u08a32;
        block4: {
            Object object;
            block5: {
                \u08a32 = this.\u078e();
                if (\u08a32.getType() != -1) {
                    this.\u0790().\u052f();
                }
                boolean bl = (object = this.\u0620) != null && !object.isEmpty();
                if (!this.\u052f && !bl) break block4;
                if (!this.\u052b.\u052c(this)) break block5;
                object = this.\u052e;
                object = ((\u0868)object).\u0783(this.\u0788((\u0868)object, \u08a32));
                List<\u0559> list = this.\u0620;
                if (list == null) break block4;
                list = list.iterator();
                while (list.hasNext()) {
                    ((\u0559)list.next()).\u037f((\u081a)object);
                }
                break block4;
            }
            object = this.\u052e;
            object = ((\u0868)object).\u0782(this.\u0789((\u0868)object, \u08a32));
            List<\u0559> list = this.\u0620;
            if (list != null) {
                list = list.iterator();
                while (list.hasNext()) {
                    ((\u0559)list.next()).\u0528((\u02b3)object);
                }
            }
        }
        return \u08a32;
    }

    public \u081a \u0788(\u0868 \u08682, \u08a3 \u08a32) {
        return new \u02bb(\u08a32);
    }

    public \u02b3 \u0789(\u0868 \u08682, \u08a3 \u08a32) {
        return new \u02be(\u08a32);
    }

    public void \u078a(\u0868 \u08682, int n2) {
        \u0868 \u08683;
        \u08682.\u058f(n2);
        if (this.\u052f && (\u08683 = this.\u052e) != \u08682 && (\u08683 = (\u0868)\u08683.\u0528) != null) {
            \u08683.\u078b();
            \u08683.\u0781(\u08682);
        }
        this.\u052e = \u08682;
    }

    public void \u078b(\u0868 \u08682, int n2, int n3) {
        this.\u0784(n2);
        this.\u052e = \u08682;
        \u08682.\u052b = this.\u052c.\u052b(1);
        if (this.\u052f) {
            this.\u0785();
        }
        if (this.\u0620 != null) {
            this.\u079b();
        }
    }

    public void \u078c() {
        this.\u052e.\u052c = this.\u0781 ? this.\u052c.\u052b(1) : this.\u052c.\u052b(-1);
        if (this.\u0620 != null) {
            this.\u079c();
        }
        this.\u0784(this.\u052e.\u0529);
        this.\u052e = (\u0868)this.\u052e.\u0528;
    }

    public \u0868 \u078d() {
        return this.\u052e;
    }

    public \u08a3 \u078e() {
        return this.\u052c.\u052b(1);
    }

    public \u0674 \u078f() {
        return this.\u052d().\u052a(this.\u0780(), this.\u078d());
    }

    public \u08a6 \u0790() {
        return this.\u0792();
    }

    public final int \u0791() {
        if (this.\u052d.\u052b()) {
            return -1;
        }
        return this.\u052d.\u052f();
    }

    public \u08a6 \u0792() {
        return this.\u052c;
    }

    public \u08a3 \u0793(int n2) {
        Object object = this.\u078e();
        if (object.getType() == n2) {
            if (n2 == -1) {
                this.\u0781 = true;
            }
            this.\u052b.\u0528(this);
            this.\u0787();
        } else {
            \u08a3 \u08a32 = this.\u052b.\u037f(this);
            object = \u08a32;
            if (this.\u052f) {
                object = \u08a32;
                if (\u08a32.\u052b() == -1) {
                    object = this.\u052e;
                    ((\u0868)object).\u0783(this.\u0788((\u0868)object, \u08a32));
                    object = \u08a32;
                }
            }
        }
        return object;
    }

    public void \u0794(\u08a3 \u08a32, String string, \u086a \u086a2) {
        ++this.\u0780;
        int n2 = \u08a32.\u0529();
        int n3 = \u08a32.\u037f();
        this.\u052e().\u0529(this, \u08a32, n2, n3, string, \u086a2);
    }

    public void \u0795(\u0559 \u05592) {
        List<\u0559> list = this.\u0620;
        if (list != null && list.remove(\u05592) && this.\u0620.isEmpty()) {
            this.\u0620 = null;
        }
    }

    public void \u0796() {
        if (this.\u0790() != null) {
            this.\u0790().\u0529(0);
        }
        this.\u052b.\u052a(this);
        this.\u052e = null;
        this.\u0780 = 0;
        this.\u0781 = false;
        this.\u079a(false);
        this.\u052d.\u0528();
        this.\u052d.\u0620(0);
        Object ATNInterpreter = this.\u058f();
        if (ATNInterpreter != null) {
            ((\u08af)ATNInterpreter).\u0528();
        }
    }

    public void \u0797(\u079c \u079c2) {
        this.\u052b = \u079c2;
    }

    public final void \u0798(\u0863 \u08632) {
        this.\u0799((\u08a6)\u08632);
    }

    public void \u0799(\u08a6 \u08a62) {
        this.\u052c = null;
        this.\u0796();
        this.\u052c = \u08a62;
    }

    public void \u079a(boolean bl) {
        if (!bl) {
            this.\u0795(this.\u058f);
            this.\u058f = null;
        } else {
            \u037f \u03f3 = this.\u058f;
            if (\u03f3 != null) {
                this.\u0795(\u03f3);
            } else {
                this.\u058f = new \u037f(this);
            }
            this.\u0786(this.\u058f);
        }
    }

    protected void \u079b() {
        for (\u0559 \u05592 : this.\u0620) {
            \u05592.\u078a(this.\u052e);
            this.\u052e.\u0784(\u05592);
        }
    }

    protected void \u079c() {
        for (int i2 = this.\u0620.size() - 1; i2 >= 0; --i2) {
            \u0559 \u05592 = this.\u0620.get(i2);
            this.\u052e.\u0785(\u05592);
            \u05592.\u0793(this.\u052e);
        }
    }

    public class \u037f
    implements \u0559 {
        final \u0867 \u037f;

        public \u037f(\u0867 \u08672) {
            this.\u037f = \u08672;
        }

        @Override
        public void \u037f(\u081a \u081a2) {
        }

        @Override
        public void \u0528(\u02b3 \u02b32) {
            PrintStream printStream = System.out;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(SOY.d("193D3F05011A1F72"));
            stringBuilder.append(\u02b32.\u0529());
            stringBuilder.append(SOY.d("5A20241A1157"));
            stringBuilder.append(this.\u037f.\u0620()[this.\u037f.\u052e.\u052e()]);
            printStream.println(stringBuilder.toString());
        }

        @Override
        public void \u078a(\u0868 \u08682) {
            PrintStream printStream = System.out;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(SOY.d("1F3C251306575A72"));
            stringBuilder.append(this.\u037f.\u0620()[\u08682.\u052e()]);
            stringBuilder.append(SOY.d("56721D225C46536F"));
            stringBuilder.append(this.\u037f.\u052c.\u052b(1).\u0528());
            printStream.println(stringBuilder.toString());
        }

        @Override
        public void \u0793(\u0868 \u08682) {
            PrintStream printStream = System.out;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(SOY.d("1F2A380254575A72"));
            stringBuilder.append(this.\u037f.\u0620()[\u08682.\u052e()]);
            stringBuilder.append(SOY.d("56721D225C46536F"));
            stringBuilder.append(this.\u037f.\u052c.\u052b(1).\u0528());
            printStream.println(stringBuilder.toString());
        }
    }
}

