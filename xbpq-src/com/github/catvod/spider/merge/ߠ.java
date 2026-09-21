/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u013a;
import com.github.catvod.spider.merge.\u02d1;
import com.github.catvod.spider.merge.\u02e2;
import com.github.catvod.spider.merge.\u0640;
import com.github.catvod.spider.merge.\u068c;
import com.github.catvod.spider.merge.\u07d6;
import com.github.catvod.spider.merge.\u0e33;
import com.github.catvod.spider.merge.\u0ec0;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class \u07e0
implements Comparable<\u07e0> {
    private Object \u037f;
    private boolean \u0528 = false;
    private boolean \u0529 = false;

    public \u07e0(Object object) {
        this.\u037f = object;
    }

    public static \u07e0 \u058f(Object object) {
        return new \u07e0(object);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && \u07e0.class == object.getClass()) {
            object = (\u07e0)object;
            return \u0ec0.\u037f(this.\u037f, ((\u07e0)object).\u037f);
        }
        return false;
    }

    public int hashCode() {
        return \u07d6.\u037f(this.\u037f);
    }

    public String toString() {
        \u02e2 \u02e22 = new \u02e2(this);
        Object object = this.\u037f;
        object = \u02e22.\u037f(SOY.d("0C333D0311"), object);
        boolean bl = this.\u0528;
        object = ((\u02e2)object).\u0528(SOY.d("132110020005"), bl);
        bl = this.\u0529;
        return ((\u02e2)object).\u0528(SOY.d("1321140E0405292623"), bl).toString();
    }

    public Boolean \u037f() {
        Object object = this.\u037f;
        if (object instanceof Boolean) {
            return (Boolean)object;
        }
        boolean bl = object != null && !\u02d1.\u052f(this.\u052d());
        return bl;
    }

    public Date \u0528() {
        Object object = this.\u037f;
        boolean bl = object instanceof String;
        String string = SOY.d("1933220254031572351700125A34301F18595A24301A11574772");
        if (bl) {
            try {
                object = \u0640.\u052b.\u0529((String)object);
                return object;
            }
            catch (ParseException parseException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append(this.\u037f);
                throw new \u068c(stringBuilder.toString());
            }
        }
        if (object instanceof Date) {
            return (Date)object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(this.\u037f);
        throw new \u068c(((StringBuilder)object).toString());
    }

    public Double \u0529() {
        Object object = this.\u037f;
        if (object instanceof String) {
            return new BigDecimal((String)this.\u037f).doubleValue();
        }
        if (object instanceof Number) {
            return ((Number)object).doubleValue();
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(SOY.d("19332202540315723F0319151F207110151E167C7100151B1F726C56"));
        ((StringBuilder)object).append(this.\u037f);
        throw new \u068c(((StringBuilder)object).toString());
    }

    public \u0e33 \u052a() {
        return (\u0e33)this.\u037f;
    }

    public List<String> \u052b() {
        return (List)this.\u037f;
    }

    public Long \u052c() {
        Object object = this.\u037f;
        if (object instanceof String) {
            return new BigDecimal((String)this.\u037f).setScale(0, 4).longValue();
        }
        if (object instanceof Number) {
            return ((Number)object).longValue();
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(SOY.d("19332202540315723F0319151F207110151E167C7100151B1F726C56"));
        ((StringBuilder)object).append(this.\u037f);
        throw new \u068c(((StringBuilder)object).toString());
    }

    public String \u052d() {
        if (this.\u0783()) {
            StringBuilder stringBuilder = new StringBuilder();
            Iterator iterator = this.\u052a().iterator();
            while (iterator.hasNext()) {
                stringBuilder.append(((\u013a)iterator.next()).\u08ab());
            }
            return stringBuilder.toString();
        }
        Object object = this.\u037f;
        if (object instanceof \u013a && \u0ec0.\u037f(((\u013a)object).\u08b8(), SOY.d("300A0E22312F2E"))) {
            return ((\u013a)this.\u037f).\u08ab();
        }
        object = this.\u037f;
        if (object instanceof List) {
            return \u02d1.\u0780((List)object, SOY.d("56"));
        }
        return String.valueOf(object).trim();
    }

    public \u07e0 \u052e() {
        this.\u0528 = true;
        return this;
    }

    public int \u052f(\u07e0 comparable) {
        if (this.equals(comparable)) {
            return 0;
        }
        if (comparable != null && ((\u07e0)comparable).\u037f != null) {
            if (this.\u037f == null) {
                return -1;
            }
            if (this.\u0787()) {
                return this.\u052d().compareTo(((\u07e0)comparable).\u052d());
            }
            if (this.\u0786()) {
                return this.\u0529().compareTo(((\u07e0)comparable).\u0529());
            }
            comparable = new StringBuilder();
            ((StringBuilder)comparable).append(SOY.d("2F3C22030407152025131057193D3C0615051B303D13542F2C333D0311574772"));
            ((StringBuilder)comparable).append(this.toString());
            throw new \u068c(((StringBuilder)comparable).toString());
        }
        return 1;
    }

    public \u07e0 \u0620() {
        this.\u0529 = true;
        String string = String.valueOf(this.\u037f);
        String string2 = SOY.d("5D");
        string = \u02d1.\u0784(string, string2);
        String string3 = SOY.d("58");
        this.\u037f = \u02d1.\u0783(\u02d1.\u0783(\u02d1.\u0784(string, string3), string2), string3);
        return this;
    }

    public boolean \u0780() {
        return this.\u0528;
    }

    public boolean \u0781() {
        return this.\u037f instanceof Boolean;
    }

    public boolean \u0782() {
        return this.\u037f instanceof Date;
    }

    public boolean \u0783() {
        return this.\u037f instanceof \u0e33;
    }

    public boolean \u0784() {
        return this.\u0529;
    }

    public boolean \u0785() {
        return this.\u037f instanceof List;
    }

    public boolean \u0786() {
        return this.\u037f instanceof Number;
    }

    public boolean \u0787() {
        return this.\u037f instanceof String;
    }

    public Class \u0788() {
        Object object = this.\u037f;
        if (object == null) {
            return Object.class;
        }
        return object.getClass();
    }
}

