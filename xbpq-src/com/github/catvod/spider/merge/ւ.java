/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u0131;
import com.github.catvod.spider.merge.\u01c3;
import com.github.catvod.spider.merge.\u01d0;
import com.github.catvod.spider.merge.\u027e;
import com.github.catvod.spider.merge.\u0433;
import com.github.catvod.spider.merge.\u0672;
import com.github.catvod.spider.merge.\u0f6c;
import com.github.catvod.spider.merge.\u0f8b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Nullable;

public abstract class \u0582
implements Cloneable {
    static final List<\u0582> \u037f = Collections.emptyList();
    @Nullable
    \u0582 \u0528;
    int \u0529;

    protected \u0582() {
    }

    private void \u0793(int n2) {
        List<\u0582> list = this.\u0783();
        while (n2 < list.size()) {
            list.get(n2).\u079c(n2);
            ++n2;
        }
    }

    public boolean equals(Object object) {
        boolean bl = this == object;
        return bl;
    }

    public String toString() {
        return this.\u078b();
    }

    public String \u037f(String string) {
        \u01c3.\u052d(string);
        if (this.\u0785() && this.\u052b().\u0782(string)) {
            return \u0131.\u0782(this.\u052c(), this.\u052b().\u0780(string));
        }
        return "";
    }

    protected void \u0528(int n2, \u0582 ... \u0582Array) {
        int n3;
        int n4;
        \u01c3.\u052f(\u0582Array);
        if (\u0582Array.length == 0) {
            return;
        }
        List<\u0582> list = this.\u0783();
        int n5 = 0;
        \u0582 \u05822 = \u0582Array[0].\u0790();
        if (\u05822 != null && \u05822.\u052f() == \u0582Array.length) {
            block7: {
                List<\u0582> list2 = \u05822.\u0783();
                n4 = \u0582Array.length;
                while (true) {
                    n3 = n4 - 1;
                    if (n4 <= 0) break;
                    if (\u0582Array[n3] != list2.get(n3)) {
                        n4 = 0;
                        break block7;
                    }
                    n4 = n3;
                }
                n4 = 1;
            }
            if (n4 != 0) {
                \u05822.\u0782();
                list.addAll(n2, Arrays.asList(\u0582Array));
                n4 = \u0582Array.length;
                while (true) {
                    n5 = n4 - 1;
                    if (n4 <= 0) break;
                    \u0582Array[n5].\u0528 = this;
                    n4 = n5;
                }
                this.\u0793(n2);
                return;
            }
        }
        \u01c3.\u052b(\u0582Array);
        n3 = \u0582Array.length;
        for (n4 = n5; n4 < n3; ++n4) {
            this.\u0796(\u0582Array[n4]);
        }
        list.addAll(n2, Arrays.asList(\u0582Array));
        this.\u0793(n2);
    }

    public String \u0529(String string) {
        \u01c3.\u052f(string);
        if (!this.\u0785()) {
            return "";
        }
        String string2 = this.\u052b().\u0780(string);
        if (string2.length() > 0) {
            return string2;
        }
        if (string.startsWith(SOY.d("1B30224C"))) {
            return this.\u037f(string.substring(4));
        }
        return "";
    }

    public \u0582 \u052a(String string, String string2) {
        string = \u0433.\u0528(this).\u052c().\u037f(string);
        this.\u052b().\u078c(string, string2);
        return this;
    }

    public abstract \u0f8b \u052b();

    public abstract String \u052c();

    public \u0582 \u052d(\u0582 \u05822) {
        \u01c3.\u052f(\u05822);
        \u01c3.\u052f(this.\u0528);
        this.\u0528.\u0528(this.\u0529, \u05822);
        return this;
    }

    public \u0582 \u052e(int n2) {
        return this.\u0783().get(n2);
    }

    public abstract int \u052f();

    public List<\u0582> \u058f() {
        if (this.\u052f() == 0) {
            return \u037f;
        }
        List<\u0582> list = this.\u0783();
        ArrayList<\u0582> arrayList = new ArrayList<\u0582>(list.size());
        arrayList.addAll(list);
        return Collections.unmodifiableList(arrayList);
    }

    public \u0582 \u0620() {
        \u0582 \u05822 = this.\u0780(null);
        LinkedList<\u0582> linkedList = new LinkedList<\u0582>();
        linkedList.add(\u05822);
        while (!linkedList.isEmpty()) {
            \u0582 \u05823 = (\u0582)linkedList.remove();
            int n2 = \u05823.\u052f();
            for (int i2 = 0; i2 < n2; ++i2) {
                List<\u0582> list = \u05823.\u0783();
                \u0582 \u05824 = list.get(i2).\u0780(\u05823);
                list.set(i2, \u05824);
                linkedList.add(\u05824);
            }
        }
        return \u05822;
    }

    protected \u0582 \u0780(@Nullable \u0582 \u05822) {
        try {
            \u0582 \u05823 = (\u0582)super.clone();
            \u05823.\u0528 = \u05822;
            int n2 = \u05822 == null ? 0 : this.\u0529;
            \u05823.\u0529 = n2;
            return \u05823;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
    }

    protected abstract void \u0781(String var1);

    public abstract \u0582 \u0782();

    protected abstract List<\u0582> \u0783();

    public boolean \u0784(String string) {
        \u01c3.\u052f(string);
        if (!this.\u0785()) {
            return false;
        }
        if (string.startsWith(SOY.d("1B30224C"))) {
            String string2 = string.substring(4);
            if (this.\u052b().\u0782(string2) && !this.\u037f(string2).isEmpty()) {
                return true;
            }
        }
        return this.\u052b().\u0782(string);
    }

    protected abstract boolean \u0785();

    public boolean \u0786() {
        boolean bl = this.\u0528 != null;
        return bl;
    }

    protected void \u0787(Appendable appendable, int n2, \u01d0.\u037f \u03f3) {
        appendable.append('\n').append(\u0131.\u0780(n2 * \u03f3.\u052c()));
    }

    @Nullable
    public \u0582 \u0788() {
        Object object = this.\u0528;
        if (object == null) {
            return null;
        }
        object = ((\u0582)object).\u0783();
        int n2 = this.\u0529 + 1;
        if (object.size() > n2) {
            return (\u0582)object.get(n2);
        }
        return null;
    }

    public abstract String \u0789();

    void \u078a() {
    }

    public String \u078b() {
        StringBuilder stringBuilder = \u0131.\u0528();
        this.\u078c(stringBuilder);
        return \u0131.\u0781(stringBuilder);
    }

    protected void \u078c(Appendable appendable) {
        \u027e.\u0528(new \u037f(appendable, \u0433.\u037f(this)), this);
    }

    abstract void \u078d(Appendable var1, int var2, \u01d0.\u037f var3);

    abstract void \u078e(Appendable var1, int var2, \u01d0.\u037f var3);

    @Nullable
    public \u01d0 \u078f() {
        \u0582 \u05822 = this.\u0799();
        \u05822 = \u05822 instanceof \u01d0 ? (\u01d0)\u05822 : null;
        return \u05822;
    }

    @Nullable
    public \u0582 \u0790() {
        return this.\u0528;
    }

    @Nullable
    public final \u0582 \u0791() {
        return this.\u0528;
    }

    @Nullable
    public \u0582 \u0792() {
        \u0582 \u05822 = this.\u0528;
        if (\u05822 == null) {
            return null;
        }
        if (this.\u0529 > 0) {
            return \u05822.\u0783().get(this.\u0529 - 1);
        }
        return null;
    }

    public void \u0794() {
        \u01c3.\u052f(this.\u0528);
        this.\u0528.\u0795(this);
    }

    protected void \u0795(\u0582 \u05822) {
        boolean bl = \u05822.\u0528 == this;
        \u01c3.\u0529(bl);
        int n2 = \u05822.\u0529;
        this.\u0783().remove(n2);
        this.\u0793(n2);
        \u05822.\u0528 = null;
    }

    protected void \u0796(\u0582 \u05822) {
        \u05822.\u079b(this);
    }

    protected void \u0797(\u0582 \u05822, \u0582 \u05823) {
        boolean bl = \u05822.\u0528 == this;
        \u01c3.\u0529(bl);
        \u01c3.\u052f(\u05823);
        \u0582 \u05824 = \u05823.\u0528;
        if (\u05824 != null) {
            \u05824.\u0795(\u05823);
        }
        int n2 = \u05822.\u0529;
        this.\u0783().set(n2, \u05823);
        \u05823.\u0528 = this;
        \u05823.\u079c(n2);
        \u05822.\u0528 = null;
    }

    public void \u0798(\u0582 \u05822) {
        \u01c3.\u052f(\u05822);
        \u01c3.\u052f(this.\u0528);
        this.\u0528.\u0797(this, \u05822);
    }

    public \u0582 \u0799() {
        \u0582 \u05822;
        \u0582 \u05823 = this;
        while ((\u05822 = \u05823.\u0528) != null) {
            \u05823 = \u05822;
        }
        return \u05823;
    }

    public void \u079a(String string) {
        \u01c3.\u052f(string);
        this.\u0781(string);
    }

    protected void \u079b(\u0582 \u05822) {
        \u01c3.\u052f(\u05822);
        \u0582 \u05823 = this.\u0528;
        if (\u05823 != null) {
            \u05823.\u0795(this);
        }
        this.\u0528 = \u05822;
    }

    protected void \u079c(int n2) {
        this.\u0529 = n2;
    }

    public int \u079d() {
        return this.\u0529;
    }

    public List<\u0582> \u079e() {
        Cloneable cloneable = this.\u0528;
        if (cloneable == null) {
            return Collections.emptyList();
        }
        Object object = ((\u0582)cloneable).\u0783();
        cloneable = new ArrayList(object.size() - 1);
        Iterator<\u0582> iterator = object.iterator();
        while (iterator.hasNext()) {
            object = iterator.next();
            if (object == this) continue;
            cloneable.add(object);
        }
        return cloneable;
    }

    private static class \u037f
    implements \u0f6c {
        private final Appendable \u037f;
        private final \u01d0.\u037f \u0528;

        \u037f(Appendable appendable, \u01d0.\u037f \u03f3) {
            this.\u037f = appendable;
            this.\u0528 = \u03f3;
            \u03f3.\u052e();
        }

        @Override
        public void \u037f(\u0582 \u05822, int n2) {
            if (!\u05822.\u0789().equals(SOY.d("5926340E00"))) {
                try {
                    \u05822.\u078e(this.\u037f, n2, this.\u0528);
                }
                catch (IOException iOException) {
                    throw new \u0672(iOException);
                }
            }
        }

        @Override
        public void \u0528(\u0582 \u05822, int n2) {
            try {
                \u05822.\u078d(this.\u037f, n2, this.\u0528);
                return;
            }
            catch (IOException iOException) {
                throw new \u0672(iOException);
            }
        }
    }
}

