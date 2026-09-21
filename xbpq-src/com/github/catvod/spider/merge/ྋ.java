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
import com.github.catvod.spider.merge.\u05d5;
import com.github.catvod.spider.merge.\u0672;
import com.github.catvod.spider.merge.\u06e6;
import com.github.catvod.spider.merge.\u097d;
import com.github.catvod.spider.merge.\u09f2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class \u0f8b
implements Iterable<\u09f2>,
Cloneable {
    private int \u037f = 0;
    String[] \u0528 = new String[3];
    String[] \u0529 = new String[3];

    private void \u052d(int n2) {
        boolean bl = n2 >= this.\u037f;
        \u01c3.\u0529(bl);
        String[] stringArray = this.\u0528;
        int n3 = stringArray.length;
        if (n3 >= n2) {
            return;
        }
        int n4 = 3;
        if (n3 >= 3) {
            n4 = this.\u037f * 2;
        }
        if (n2 <= n4) {
            n2 = n4;
        }
        this.\u0528 = Arrays.copyOf(stringArray, n2);
        this.\u0529 = Arrays.copyOf(this.\u0529, n2);
    }

    static String \u052e(@Nullable String string) {
        String string2 = string;
        if (string == null) {
            string2 = "";
        }
        return string2;
    }

    private int \u0786(String string) {
        \u01c3.\u052f(string);
        for (int i2 = 0; i2 < this.\u037f; ++i2) {
            if (!string.equalsIgnoreCase(this.\u0528[i2])) continue;
            return i2;
        }
        return -1;
    }

    static String \u0787(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('/');
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    private boolean \u0788(String string) {
        boolean bl = true;
        if (string == null || string.length() <= 1 || string.charAt(0) != '/') {
            bl = false;
        }
        return bl;
    }

    private void \u078d(int n2) {
        boolean bl = n2 >= this.\u037f;
        \u01c3.\u0528(bl);
        int n3 = this.\u037f - n2 - 1;
        if (n3 > 0) {
            String[] stringArray = this.\u0528;
            int n4 = n2 + 1;
            System.arraycopy(stringArray, n4, stringArray, n2, n3);
            stringArray = this.\u0529;
            System.arraycopy(stringArray, n4, stringArray, n2, n3);
        }
        this.\u037f = n2 = this.\u037f - 1;
        this.\u0528[n2] = null;
        this.\u0529[n2] = null;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && \u0f8b.class == object.getClass()) {
            object = (\u0f8b)object;
            if (this.\u037f != ((\u0f8b)object).\u037f) {
                return false;
            }
            if (!Arrays.equals(this.\u0528, ((\u0f8b)object).\u0528)) {
                return false;
            }
            return Arrays.equals(this.\u0529, ((\u0f8b)object).\u0529);
        }
        return false;
    }

    public int hashCode() {
        return (this.\u037f * 31 + Arrays.hashCode(this.\u0528)) * 31 + Arrays.hashCode(this.\u0529);
    }

    public boolean isEmpty() {
        boolean bl = this.\u037f == 0;
        return bl;
    }

    @Override
    public Iterator<\u09f2> iterator() {
        return new Iterator<\u09f2>(this){
            int \u037f;
            final \u0f8b \u0528;
            {
                this.\u0528 = \u0f8b2;
                this.\u037f = 0;
            }

            @Override
            public boolean hasNext() {
                boolean bl;
                \u0f8b \u0f8b2;
                int n2;
                int n3;
                do {
                    n3 = ++this.\u037f;
                    n2 = this.\u0528.\u037f;
                    bl = true;
                } while (n3 < n2 && (\u0f8b2 = this.\u0528).\u0788(\u0f8b2.\u0528[this.\u037f]));
                if (this.\u037f >= this.\u0528.\u037f) {
                    bl = false;
                }
                return bl;
            }

            @Override
            public void remove() {
                int n2;
                \u0f8b \u0f8b2 = this.\u0528;
                this.\u037f = n2 = this.\u037f - 1;
                \u0f8b2.\u078d(n2);
            }

            public \u09f2 \u037f() {
                Cloneable cloneable = this.\u0528;
                String[] stringArray = cloneable.\u0528;
                int n2 = this.\u037f++;
                cloneable = new \u09f2(stringArray[n2], cloneable.\u0529[n2], (\u0f8b)cloneable);
                return cloneable;
            }
        };
    }

    public int size() {
        int n2 = 0;
        for (int i2 = 0; i2 < this.\u037f; ++i2) {
            int n3 = n2;
            if (!this.\u0788(this.\u0528[i2])) {
                n3 = n2 + 1;
            }
            n2 = n3;
        }
        return n2;
    }

    public String toString() {
        return this.\u0783();
    }

    public \u0f8b \u052a(String string, @Nullable String string2) {
        this.\u052d(this.\u037f + 1);
        String[] stringArray = this.\u0528;
        int n2 = this.\u037f;
        stringArray[n2] = string;
        this.\u0529[n2] = string2;
        this.\u037f = n2 + 1;
        return this;
    }

    public void \u052b(\u0f8b object) {
        if (((\u0f8b)object).size() == 0) {
            return;
        }
        this.\u052d(this.\u037f + ((\u0f8b)object).\u037f);
        object = ((\u0f8b)object).iterator();
        while (object.hasNext()) {
            this.\u078b((\u09f2)object.next());
        }
    }

    public List<\u09f2> \u052c() {
        ArrayList<\u09f2> arrayList = new ArrayList<\u09f2>(this.\u037f);
        for (int i2 = 0; i2 < this.\u037f; ++i2) {
            if (this.\u0788(this.\u0528[i2])) continue;
            arrayList.add(new \u09f2(this.\u0528[i2], this.\u0529[i2], this));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public \u0f8b \u052f() {
        \u0f8b \u0f8b2;
        try {
            \u0f8b2 = (\u0f8b)super.clone();
            \u0f8b2.\u037f = this.\u037f;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
        this.\u0528 = Arrays.copyOf(this.\u0528, this.\u037f);
        this.\u0529 = Arrays.copyOf(this.\u0529, this.\u037f);
        return \u0f8b2;
    }

    public int \u058f(\u097d stringArray) {
        boolean bl = this.isEmpty();
        int n2 = 0;
        if (bl) {
            return 0;
        }
        bl = stringArray.\u052a();
        int n3 = 0;
        while (n2 < this.\u0528.length) {
            int n4;
            int n5 = n4 = n2 + 1;
            while (n5 < (stringArray = this.\u0528).length && stringArray[n5] != null) {
                int n6;
                int n7;
                block7: {
                    block6: {
                        if (bl && stringArray[n2].equals(stringArray[n5])) break block6;
                        n7 = n3;
                        n6 = n5;
                        if (bl) break block7;
                        stringArray = this.\u0528;
                        n7 = n3;
                        n6 = n5;
                        if (!stringArray[n2].equalsIgnoreCase(stringArray[n5])) break block7;
                    }
                    n7 = n3 + 1;
                    this.\u078d(n5);
                    n6 = n5 - 1;
                }
                n5 = n6 + 1;
                n3 = n7;
            }
            n2 = n4;
        }
        return n3;
    }

    public String \u0620(String string) {
        int n2 = this.\u0785(string);
        string = n2 == -1 ? "" : \u0f8b.\u052e(this.\u0529[n2]);
        return string;
    }

    public String \u0780(String string) {
        int n2 = this.\u0786(string);
        string = n2 == -1 ? "" : \u0f8b.\u052e(this.\u0529[n2]);
        return string;
    }

    public boolean \u0781(String string) {
        boolean bl = this.\u0785(string) != -1;
        return bl;
    }

    public boolean \u0782(String string) {
        boolean bl = this.\u0786(string) != -1;
        return bl;
    }

    public String \u0783() {
        StringBuilder stringBuilder = \u0131.\u0528();
        try {
            \u01d0 \u01d02 = new \u01d0("");
            this.\u0784(stringBuilder, \u01d02.\u0af9());
        }
        catch (IOException iOException) {
            throw new \u0672(iOException);
        }
        return \u0131.\u0781(stringBuilder);
    }

    final void \u0784(Appendable appendable, \u01d0.\u037f \u03f3) {
        int n2 = this.\u037f;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.\u0788(this.\u0528[i2])) continue;
            String string = this.\u0528[i2];
            String string2 = this.\u0529[i2];
            appendable.append(' ').append(string);
            if (\u09f2.\u052f(string, string2, \u03f3)) continue;
            appendable.append(SOY.d("4770"));
            string = string2;
            if (string2 == null) {
                string = "";
            }
            \u05d5.\u052b(appendable, string, \u03f3, true, false, false);
            appendable.append('\"');
        }
    }

    int \u0785(String string) {
        \u01c3.\u052f(string);
        for (int i2 = 0; i2 < this.\u037f; ++i2) {
            if (!string.equals(this.\u0528[i2])) continue;
            return i2;
        }
        return -1;
    }

    public void \u0789() {
        for (int i2 = 0; i2 < this.\u037f; ++i2) {
            String[] stringArray = this.\u0528;
            stringArray[i2] = \u06e6.\u037f(stringArray[i2]);
        }
    }

    public \u0f8b \u078a(String string, String string2) {
        \u01c3.\u052f(string);
        int n2 = this.\u0785(string);
        if (n2 != -1) {
            this.\u0529[n2] = string2;
        } else {
            this.\u052a(string, string2);
        }
        return this;
    }

    public \u0f8b \u078b(\u09f2 \u09f22) {
        \u01c3.\u052f(\u09f22);
        this.\u078a(\u09f22.\u0528(), \u09f22.\u0529());
        \u09f22.\u052a = this;
        return this;
    }

    void \u078c(String string, @Nullable String string2) {
        int n2 = this.\u0786(string);
        if (n2 != -1) {
            this.\u0529[n2] = string2;
            if (!this.\u0528[n2].equals(string)) {
                this.\u0528[n2] = string;
            }
        } else {
            this.\u052a(string, string2);
        }
    }
}

