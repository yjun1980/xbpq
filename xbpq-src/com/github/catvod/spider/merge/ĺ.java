/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u0129;
import com.github.catvod.spider.merge.\u012b;
import com.github.catvod.spider.merge.\u0131;
import com.github.catvod.spider.merge.\u0140;
import com.github.catvod.spider.merge.\u01c3;
import com.github.catvod.spider.merge.\u01d0;
import com.github.catvod.spider.merge.\u0209;
import com.github.catvod.spider.merge.\u020b;
import com.github.catvod.spider.merge.\u027e;
import com.github.catvod.spider.merge.\u02cc;
import com.github.catvod.spider.merge.\u02cd;
import com.github.catvod.spider.merge.\u0393;
import com.github.catvod.spider.merge.\u0433;
import com.github.catvod.spider.merge.\u0582;
import com.github.catvod.spider.merge.\u06e6;
import com.github.catvod.spider.merge.\u07fa;
import com.github.catvod.spider.merge.\u0e33;
import com.github.catvod.spider.merge.\u0f6c;
import com.github.catvod.spider.merge.\u0f8b;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public class \u013a
extends \u0582 {
    private static final List<\u013a> \u052a = Collections.emptyList();
    private static final Pattern \u052b = Pattern.compile(SOY.d("26217A"));
    private static final String \u052c = \u0f8b.\u0787(SOY.d("18332213210513"));
    private \u0209 \u052d;
    @Nullable
    private WeakReference<List<\u013a>> \u052e;
    List<\u0582> \u052f;
    @Nullable
    private \u0f8b \u058f;

    public \u013a(\u0209 \u02092, String string) {
        this(\u02092, string, null);
    }

    public \u013a(\u0209 \u02092, @Nullable String string, @Nullable \u0f8b \u0f8b2) {
        \u01c3.\u052f(\u02092);
        this.\u052f = \u0582.\u037f;
        this.\u058f = \u0f8b2;
        this.\u052d = \u02092;
        if (string != null) {
            this.\u079a(string);
        }
    }

    public \u013a(String string) {
        this(\u0209.\u0782(string), "", null);
    }

    private static void \u07a1(\u013a \u013a2, \u0e33 \u0e332) {
        if ((\u013a2 = \u013a2.\u08ad()) != null && !\u013a2.\u08b8().equals(SOY.d("59203E1900"))) {
            \u0e332.add(\u013a2);
            \u013a.\u07a1(\u013a2, \u0e332);
        }
    }

    private static void \u07a4(StringBuilder stringBuilder, \u0140 \u01402) {
        String string = \u01402.\u07a3();
        if (!\u013a.\u08af(\u01402.\u0528) && !(\u01402 instanceof \u02cd)) {
            \u0131.\u037f(stringBuilder, string, \u0140.\u07a5(stringBuilder));
        } else {
            stringBuilder.append(string);
        }
    }

    private static void \u07b1(\u013a \u013a2, StringBuilder stringBuilder) {
        if (\u013a2.\u052d.\u0529().equals(SOY.d("1820")) && !\u0140.\u07a5(stringBuilder)) {
            stringBuilder.append(SOY.d("5A"));
        }
    }

    private static <E extends \u013a> int \u08a5(\u013a \u013a2, List<E> list) {
        int n2 = list.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (list.get(i2) != \u013a2) continue;
            return i2;
        }
        return 0;
    }

    private boolean \u08a7(\u01d0.\u037f \u03f3) {
        boolean bl = this.\u052d.\u0528() || this.\u08ad() != null && this.\u08ad().\u08b7().\u0528() || \u03f3.\u052d();
        return bl;
    }

    private boolean \u08a8(\u01d0.\u037f \u03f3) {
        boolean bl = this.\u08b7().\u052d() && !this.\u08b7().\u052b() && (this.\u08ad() == null || this.\u08ad().\u08a6()) && this.\u0792() != null && !\u03f3.\u052d();
        return bl;
    }

    private void \u08ac(StringBuilder stringBuilder) {
        for (\u0582 \u05822 : this.\u052f) {
            if (\u05822 instanceof \u0140) {
                \u013a.\u07a4(stringBuilder, (\u0140)\u05822);
                continue;
            }
            if (!(\u05822 instanceof \u013a)) continue;
            \u013a.\u07b1((\u013a)\u05822, stringBuilder);
        }
    }

    static boolean \u08af(@Nullable \u0582 \u05822) {
        if (\u05822 instanceof \u013a) {
            \u013a \u013a2;
            \u05822 = (\u013a)\u05822;
            int n2 = 0;
            do {
                if (((\u013a)\u05822).\u052d.\u0620()) {
                    return true;
                }
                \u013a2 = ((\u013a)\u05822).\u08ad();
                if (++n2 >= 6) break;
                \u05822 = \u013a2;
            } while (\u013a2 != null);
        }
        return false;
    }

    private static String \u08b2(\u013a \u013a2, String string) {
        while (\u013a2 != null) {
            \u0f8b \u0f8b2 = \u013a2.\u058f;
            if (\u0f8b2 != null && \u0f8b2.\u0781(string)) {
                return \u013a2.\u058f.\u0620(string);
            }
            \u013a2 = \u013a2.\u08ad();
        }
        return "";
    }

    @Override
    public \u0f8b \u052b() {
        if (this.\u058f == null) {
            this.\u058f = new \u0f8b();
        }
        return this.\u058f;
    }

    @Override
    public String \u052c() {
        return \u013a.\u08b2(this, \u052c);
    }

    @Override
    public int \u052f() {
        return this.\u052f.size();
    }

    @Override
    protected void \u0781(String string) {
        this.\u052b().\u078a(\u052c, string);
    }

    @Override
    protected List<\u0582> \u0783() {
        if (this.\u052f == \u0582.\u037f) {
            this.\u052f = new \u0528(this, 4);
        }
        return this.\u052f;
    }

    @Override
    protected boolean \u0785() {
        boolean bl = this.\u058f != null;
        return bl;
    }

    @Override
    public String \u0789() {
        return this.\u052d.\u0529();
    }

    @Override
    void \u078a() {
        super.\u078a();
        this.\u052e = null;
    }

    @Override
    void \u078d(Appendable appendable, int n2, \u01d0.\u037f \u03f3) {
        if (\u03f3.\u052f() && this.\u08a7(\u03f3) && !this.\u08a8(\u03f3)) {
            if (appendable instanceof StringBuilder) {
                if (((StringBuilder)appendable).length() > 0) {
                    this.\u0787(appendable, n2, \u03f3);
                }
            } else {
                this.\u0787(appendable, n2, \u03f3);
            }
        }
        appendable.append('<').append(this.\u08b8());
        \u0f8b \u0f8b2 = this.\u058f;
        if (\u0f8b2 != null) {
            \u0f8b2.\u0784(appendable, \u03f3);
        }
        if (this.\u052f.isEmpty() && this.\u052d.\u052f()) {
            if (\u03f3.\u058f() == \u01d0.\u037f.\u037f.\u037f && this.\u052d.\u052b()) {
                appendable.append('>');
            } else {
                appendable.append(SOY.d("5A7D6F"));
            }
        } else {
            appendable.append('>');
        }
    }

    @Override
    void \u078e(Appendable appendable, int n2, \u01d0.\u037f \u03f3) {
        if (!this.\u052f.isEmpty() || !this.\u052d.\u052f()) {
            if (\u03f3.\u052f() && !this.\u052f.isEmpty() && (this.\u052d.\u0528() || \u03f3.\u052d() && (this.\u052f.size() > 1 || this.\u052f.size() == 1 && !(this.\u052f.get(0) instanceof \u0140)))) {
                this.\u0787(appendable, n2, \u03f3);
            }
            appendable.append(SOY.d("467D")).append(this.\u08b8()).append('>');
        }
    }

    public \u013a \u07a2(\u0582 \u05822) {
        \u01c3.\u052f(\u05822);
        this.\u0796(\u05822);
        this.\u0783();
        this.\u052f.add(\u05822);
        \u05822.\u079c(this.\u052f.size() - 1);
        return this;
    }

    public \u013a \u07a3(String object) {
        object = new \u013a(\u0209.\u0783((String)object, \u0433.\u0528(this).\u052c()), this.\u052c());
        this.\u07a2((\u0582)object);
        return object;
    }

    public \u013a \u07a5(String string) {
        \u01c3.\u052f(string);
        this.\u07a2(new \u0140(string));
        return this;
    }

    public \u013a \u0860(String string, String string2) {
        super.\u052a(string, string2);
        return this;
    }

    public \u013a \u0861(\u0582 \u05822) {
        return (\u013a)super.\u052d(\u05822);
    }

    public \u013a \u0862(int n2) {
        return this.\u0863().get(n2);
    }

    List<\u013a> \u0863() {
        Object object;
        block6: {
            Object object2;
            block5: {
                if (this.\u052f() == 0) {
                    return \u052a;
                }
                object = this.\u052e;
                if (object == null) break block5;
                object2 = (List)((Reference)object).get();
                object = object2;
                if (object2 != null) break block6;
            }
            int n2 = this.\u052f.size();
            object = new ArrayList<\u013a>(n2);
            for (int i2 = 0; i2 < n2; ++i2) {
                object2 = this.\u052f.get(i2);
                if (!(object2 instanceof \u013a)) continue;
                object.add((\u013a)((\u013a)object2));
            }
            this.\u052e = new WeakReference<ArrayList<\u013a>>((ArrayList<\u013a>)object);
        }
        return object;
    }

    public \u0e33 \u0864() {
        return new \u0e33(this.\u0863());
    }

    public \u013a \u0865() {
        return (\u013a)super.\u0620();
    }

    public String \u0866() {
        StringBuilder stringBuilder = \u0131.\u0528();
        for (\u0582 \u05822 : this.\u052f) {
            if (\u05822 instanceof \u0129) {
                stringBuilder.append(((\u0129)\u05822).\u07a3());
                continue;
            }
            if (\u05822 instanceof \u012b) {
                stringBuilder.append(((\u012b)\u05822).\u07a3());
                continue;
            }
            if (\u05822 instanceof \u013a) {
                stringBuilder.append(((\u013a)\u05822).\u0866());
                continue;
            }
            if (!(\u05822 instanceof \u02cd)) continue;
            stringBuilder.append(((\u02cd)\u05822).\u07a3());
        }
        return \u0131.\u0781(stringBuilder);
    }

    protected \u013a \u0867(@Nullable \u0582 cloneable) {
        \u013a \u013a2 = (\u013a)super.\u0780((\u0582)cloneable);
        cloneable = this.\u058f;
        cloneable = cloneable != null ? ((\u0f8b)cloneable).\u052f() : null;
        \u013a2.\u058f = cloneable;
        cloneable = new \u0528(\u013a2, this.\u052f.size());
        \u013a2.\u052f = cloneable;
        cloneable.addAll(this.\u052f);
        return \u013a2;
    }

    public int \u0868() {
        if (this.\u08ad() == null) {
            return 0;
        }
        return \u013a.\u08a5(this, this.\u08ad().\u0863());
    }

    public \u013a \u0869() {
        this.\u052f.clear();
        return this;
    }

    public \u0e33 \u086a() {
        return \u07fa.\u037f(new \u020b.\u037f(), this);
    }

    public \u0e33 \u08a0(String string) {
        \u01c3.\u052d(string);
        return \u07fa.\u037f(new \u020b.\u079c(\u06e6.\u0528(string)), this);
    }

    public boolean \u08a1(String string) {
        Object object = this.\u058f;
        if (object == null) {
            return false;
        }
        object = ((\u0f8b)object).\u0780(SOY.d("193E300507"));
        int n2 = ((String)object).length();
        int n3 = string.length();
        if (n2 != 0 && n2 >= n3) {
            if (n2 == n3) {
                return string.equalsIgnoreCase((String)object);
            }
            boolean bl = false;
            int n4 = 0;
            for (int i2 = 0; i2 < n2; ++i2) {
                int n5;
                boolean bl2;
                if (Character.isWhitespace(((String)object).charAt(i2))) {
                    bl2 = bl;
                    n5 = n4;
                    if (bl) {
                        if (i2 - n4 == n3 && ((String)object).regionMatches(true, n4, string, 0, n3)) {
                            return true;
                        }
                        bl2 = false;
                        n5 = n4;
                    }
                } else {
                    bl2 = bl;
                    n5 = n4;
                    if (!bl) {
                        n5 = i2;
                        bl2 = true;
                    }
                }
                bl = bl2;
                n4 = n5;
            }
            if (bl && n2 - n4 == n3) {
                return ((String)object).regionMatches(true, n4, string, 0, n3);
            }
        }
        return false;
    }

    public <T extends Appendable> T \u08a2(T t2) {
        int n2 = this.\u052f.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.\u052f.get(i2).\u078c(t2);
        }
        return t2;
    }

    public String \u08a3() {
        CharSequence charSequence = \u0131.\u0528();
        this.\u08a2(charSequence);
        String string = \u0131.\u0781(charSequence);
        charSequence = string;
        if (\u0433.\u037f(this).\u052f()) {
            charSequence = string.trim();
        }
        return charSequence;
    }

    public String \u08a4() {
        Object object = this.\u058f;
        object = object != null ? ((\u0f8b)object).\u0780(SOY.d("1336")) : "";
        return object;
    }

    public boolean \u08a6() {
        return this.\u052d.\u052a();
    }

    @Nullable
    public \u013a \u08a9() {
        if (this.\u0528 == null) {
            return null;
        }
        List<\u013a> list = this.\u08ad().\u0863();
        int n2 = \u013a.\u08a5(this, list);
        int n3 = list.size();
        if (n3 > ++n2) {
            return list.get(n2);
        }
        return null;
    }

    public String \u08aa() {
        return this.\u052d.\u058f();
    }

    public String \u08ab() {
        StringBuilder stringBuilder = \u0131.\u0528();
        this.\u08ac(stringBuilder);
        return \u0131.\u0781(stringBuilder).trim();
    }

    public final \u013a \u08ad() {
        return (\u013a)this.\u0528;
    }

    public \u0e33 \u08ae() {
        \u0e33 \u0e332 = new \u0e33();
        \u013a.\u07a1(this, \u0e332);
        return \u0e332;
    }

    @Nullable
    public \u013a \u08b0() {
        if (this.\u0528 == null) {
            return null;
        }
        List<\u013a> list = this.\u08ad().\u0863();
        int n2 = \u013a.\u08a5(this, list);
        if (n2 > 0) {
            return list.get(n2 - 1);
        }
        return null;
    }

    public \u013a \u08b1() {
        return (\u013a)super.\u0799();
    }

    public \u0e33 \u08b3(String string) {
        return \u0393.\u0528(string, this);
    }

    @Nullable
    public \u013a \u08b4(String string) {
        return \u0393.\u052a(string, this);
    }

    public \u0e33 \u08b6() {
        if (this.\u0528 == null) {
            return new \u0e33(0);
        }
        Object object = this.\u08ad().\u0863();
        \u0e33 \u0e332 = new \u0e33(object.size() - 1);
        object = object.iterator();
        while (object.hasNext()) {
            \u013a \u013a2 = (\u013a)object.next();
            if (\u013a2 == this) continue;
            \u0e332.add(\u013a2);
        }
        return \u0e332;
    }

    public \u0209 \u08b7() {
        return this.\u052d;
    }

    public String \u08b8() {
        return this.\u052d.\u0529();
    }

    public String \u08b9() {
        StringBuilder stringBuilder = \u0131.\u0528();
        \u027e.\u0528(new \u0f6c(this, stringBuilder){
            final StringBuilder \u037f;
            final \u013a \u0528;
            {
                this.\u0528 = \u013a2;
                this.\u037f = stringBuilder;
            }

            @Override
            public void \u037f(\u0582 \u05822, int n2) {
                if (\u05822 instanceof \u013a && ((\u013a)\u05822).\u08a6() && \u05822.\u0788() instanceof \u0140 && !\u0140.\u07a5(this.\u037f)) {
                    this.\u037f.append(' ');
                }
            }

            @Override
            public void \u0528(\u0582 \u05822, int n2) {
                if (\u05822 instanceof \u0140) {
                    \u05822 = (\u0140)\u05822;
                    \u013a.\u07a4(this.\u037f, (\u0140)\u05822);
                } else if (\u05822 instanceof \u013a) {
                    \u05822 = (\u013a)\u05822;
                    if (this.\u037f.length() > 0 && (((\u013a)\u05822).\u08a6() || ((\u013a)\u05822).\u052d.\u0529().equals(SOY.d("1820"))) && !\u0140.\u07a5(this.\u037f)) {
                        this.\u037f.append(' ');
                    }
                }
            }
        }, this);
        return \u0131.\u0781(stringBuilder).trim();
    }

    public \u013a \u08ba(String string) {
        \u01c3.\u052f(string);
        this.\u0869();
        \u01d0 \u01d02 = this.\u078f();
        if (\u01d02 != null && \u01d02.\u0cf1().\u052a(this.\u08aa())) {
            this.\u07a2(new \u0129(string));
        } else {
            this.\u07a2(new \u0140(string));
        }
        return this;
    }

    public List<\u0140> \u08bb() {
        ArrayList<\u0140> arrayList = new ArrayList<\u0140>();
        for (\u0582 \u05822 : this.\u052f) {
            if (!(\u05822 instanceof \u0140)) continue;
            arrayList.add((\u0140)\u05822);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static final class \u0528
    extends \u02cc<\u0582> {
        private final \u013a \u037f;

        \u0528(\u013a \u013a2, int n2) {
            super(n2);
            this.\u037f = \u013a2;
        }

        @Override
        public void \u037f() {
            this.\u037f.\u078a();
        }
    }
}

