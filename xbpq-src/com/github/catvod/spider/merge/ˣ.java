/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u02b4;
import com.github.catvod.spider.merge.\u02d1;
import com.github.catvod.spider.merge.\u02e4;
import com.github.catvod.spider.merge.\u07f4;
import com.github.catvod.spider.merge.\u07f5;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;

public abstract class \u02e3
implements Serializable {
    public static final \u02e3 \u037f = new \u037f();
    public static final \u02e3 \u0528 = new \u052a();
    public static final \u02e3 \u0529 = new \u052e();
    public static final \u02e3 \u052a = new \u058f();
    public static final \u02e3 \u052b = new \u0620();
    public static final \u02e3 \u052c = new \u052c();
    public static final \u02e3 \u052d = new \u0528();
    private static final ThreadLocal<WeakHashMap<Object, Object>> \u052e = new ThreadLocal();
    private boolean \u052f = true;
    private boolean \u058f = true;
    private boolean \u0620;
    private boolean \u0780 = true;
    private String \u0781 = SOY.d("21");
    private String \u0782 = SOY.d("27");
    private String \u0783 = SOY.d("47");
    private boolean \u0784;
    private boolean \u0785;
    private String \u0786;
    private String \u0787;
    private String \u0788;
    private boolean \u0789;
    private String \u078a;
    private boolean \u078b;
    private String \u078c;
    private String \u078d;
    private String \u078e;
    private String \u078f;
    private String \u0790;

    protected \u02e3() {
        String string;
        this.\u0786 = string = SOY.d("56");
        this.\u0787 = SOY.d("01");
        this.\u0788 = string;
        this.\u0789 = true;
        this.\u078a = SOY.d("07");
        this.\u078b = true;
        this.\u078c = SOY.d("463C241A1849");
        this.\u078d = SOY.d("4621380C114A");
        this.\u078e = string = SOY.d("44");
        this.\u078f = SOY.d("46");
        this.\u0790 = string;
    }

    static Map<Object, Object> \u0861() {
        return \u052e.get();
    }

    static boolean \u0864(Object object) {
        Map<Object, Object> map = \u02e3.\u0861();
        boolean bl = map != null && map.containsKey(object);
        return bl;
    }

    static void \u0866(Object object) {
        if (object != null) {
            if (\u02e3.\u0861() == null) {
                \u052e.set(new WeakHashMap());
            }
            \u02e3.\u0861().put(object, null);
        }
    }

    static void \u08ad(Object object) {
        Map<Object, Object> map;
        if (object != null && (map = \u02e3.\u0861()) != null) {
            map.remove(object);
            if (map.isEmpty()) {
                \u052e.remove();
            }
        }
    }

    public void \u037f(StringBuffer stringBuffer, String string, Object object, Boolean bl) {
        this.\u0793(stringBuffer, string);
        if (object == null) {
            this.\u0796(stringBuffer, string);
        } else {
            this.\u0795(stringBuffer, string, object, this.\u0863(bl));
        }
        this.\u0791(stringBuffer, string);
    }

    public void \u0528(StringBuffer stringBuffer, String string, boolean bl) {
        this.\u0793(stringBuffer, string);
        this.\u0786(stringBuffer, string, bl);
        this.\u0791(stringBuffer, string);
    }

    protected void \u0529(StringBuffer stringBuffer, Object object) {
        if (this.\u058f && object != null) {
            \u02e3.\u0866(object);
            if (this.\u0620) {
                stringBuffer.append(this.\u0862(object.getClass()));
            } else {
                stringBuffer.append(object.getClass().getName());
            }
        }
    }

    protected void \u052a(StringBuffer stringBuffer) {
        stringBuffer.append(this.\u0782);
    }

    protected void \u052b(StringBuffer stringBuffer) {
        stringBuffer.append(this.\u0781);
    }

    protected void \u052c(StringBuffer stringBuffer, String string, Object object) {
        \u02b4.\u037f(stringBuffer, object);
    }

    protected void \u052d(StringBuffer stringBuffer, String string, byte by) {
        stringBuffer.append(by);
    }

    protected void \u052e(StringBuffer stringBuffer, String string, char c2) {
        stringBuffer.append(c2);
    }

    protected void \u052f(StringBuffer stringBuffer, String string, double d2) {
        stringBuffer.append(d2);
    }

    protected void \u058f(StringBuffer stringBuffer, String string, float f2) {
        stringBuffer.append(f2);
    }

    protected void \u0620(StringBuffer stringBuffer, String string, int n2) {
        stringBuffer.append(n2);
    }

    protected void \u0780(StringBuffer stringBuffer, String string, int n2, Object object) {
        if (n2 > 0) {
            stringBuffer.append(this.\u0788);
        }
        if (object == null) {
            this.\u0796(stringBuffer, string);
        } else {
            this.\u0795(stringBuffer, string, object, this.\u0789);
        }
    }

    protected void \u0781(StringBuffer stringBuffer, String string, long l2) {
        stringBuffer.append(l2);
    }

    protected void \u0782(StringBuffer stringBuffer, String string, Object object) {
        stringBuffer.append(object);
    }

    protected void \u0783(StringBuffer stringBuffer, String string, Collection<?> collection) {
        stringBuffer.append(collection);
    }

    protected void \u0784(StringBuffer stringBuffer, String string, Map<?, ?> map) {
        stringBuffer.append(map);
    }

    protected void \u0785(StringBuffer stringBuffer, String string, short s2) {
        stringBuffer.append(s2);
    }

    protected void \u0786(StringBuffer stringBuffer, String string, boolean bl) {
        stringBuffer.append(bl);
    }

    protected void \u0787(StringBuffer stringBuffer, String string, byte[] byArray) {
        stringBuffer.append(this.\u0787);
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            if (i2 > 0) {
                stringBuffer.append(this.\u0788);
            }
            this.\u052d(stringBuffer, string, byArray[i2]);
        }
        stringBuffer.append(this.\u078a);
    }

    protected void \u0788(StringBuffer stringBuffer, String string, char[] cArray) {
        stringBuffer.append(this.\u0787);
        for (int i2 = 0; i2 < cArray.length; ++i2) {
            if (i2 > 0) {
                stringBuffer.append(this.\u0788);
            }
            this.\u052e(stringBuffer, string, cArray[i2]);
        }
        stringBuffer.append(this.\u078a);
    }

    protected void \u0789(StringBuffer stringBuffer, String string, double[] dArray) {
        stringBuffer.append(this.\u0787);
        for (int i2 = 0; i2 < dArray.length; ++i2) {
            if (i2 > 0) {
                stringBuffer.append(this.\u0788);
            }
            this.\u052f(stringBuffer, string, dArray[i2]);
        }
        stringBuffer.append(this.\u078a);
    }

    protected void \u078a(StringBuffer stringBuffer, String string, float[] fArray) {
        stringBuffer.append(this.\u0787);
        for (int i2 = 0; i2 < fArray.length; ++i2) {
            if (i2 > 0) {
                stringBuffer.append(this.\u0788);
            }
            this.\u058f(stringBuffer, string, fArray[i2]);
        }
        stringBuffer.append(this.\u078a);
    }

    protected void \u078b(StringBuffer stringBuffer, String string, int[] nArray) {
        stringBuffer.append(this.\u0787);
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            if (i2 > 0) {
                stringBuffer.append(this.\u0788);
            }
            this.\u0620(stringBuffer, string, nArray[i2]);
        }
        stringBuffer.append(this.\u078a);
    }

    protected void \u078c(StringBuffer stringBuffer, String string, long[] lArray) {
        stringBuffer.append(this.\u0787);
        for (int i2 = 0; i2 < lArray.length; ++i2) {
            if (i2 > 0) {
                stringBuffer.append(this.\u0788);
            }
            this.\u0781(stringBuffer, string, lArray[i2]);
        }
        stringBuffer.append(this.\u078a);
    }

    protected void \u078d(StringBuffer stringBuffer, String string, Object[] objectArray) {
        stringBuffer.append(this.\u0787);
        for (int i2 = 0; i2 < objectArray.length; ++i2) {
            this.\u0780(stringBuffer, string, i2, objectArray[i2]);
        }
        stringBuffer.append(this.\u078a);
    }

    protected void \u078e(StringBuffer stringBuffer, String string, short[] sArray) {
        stringBuffer.append(this.\u0787);
        for (int i2 = 0; i2 < sArray.length; ++i2) {
            if (i2 > 0) {
                stringBuffer.append(this.\u0788);
            }
            this.\u0785(stringBuffer, string, sArray[i2]);
        }
        stringBuffer.append(this.\u078a);
    }

    protected void \u078f(StringBuffer stringBuffer, String string, boolean[] blArray) {
        stringBuffer.append(this.\u0787);
        for (int i2 = 0; i2 < blArray.length; ++i2) {
            if (i2 > 0) {
                stringBuffer.append(this.\u0788);
            }
            this.\u0786(stringBuffer, string, blArray[i2]);
        }
        stringBuffer.append(this.\u078a);
    }

    public void \u0790(StringBuffer stringBuffer, Object object) {
        if (!this.\u0785) {
            this.\u0867(stringBuffer);
        }
        this.\u052a(stringBuffer);
        \u02e3.\u08ad(object);
    }

    protected void \u0791(StringBuffer stringBuffer, String string) {
        this.\u0792(stringBuffer);
    }

    protected void \u0792(StringBuffer stringBuffer) {
        stringBuffer.append(this.\u0786);
    }

    protected void \u0793(StringBuffer stringBuffer, String string) {
        if (this.\u052f && string != null) {
            stringBuffer.append(string);
            stringBuffer.append(this.\u0783);
        }
    }

    protected void \u0794(StringBuffer stringBuffer, Object object) {
        if (this.\u0865() && object != null) {
            \u02e3.\u0866(object);
            stringBuffer.append('@');
            stringBuffer.append(Integer.toHexString(System.identityHashCode(object)));
        }
    }

    protected void \u0795(StringBuffer stringBuffer, String string, Object object, boolean bl) {
        if (\u02e3.\u0864(object) && !(object instanceof Number) && !(object instanceof Boolean) && !(object instanceof Character)) {
            this.\u052c(stringBuffer, string, object);
            return;
        }
        \u02e3.\u0866(object);
        try {
            if (object instanceof Collection) {
                if (bl) {
                    this.\u0783(stringBuffer, string, (Collection)object);
                } else {
                    this.\u07a2(stringBuffer, string, ((Collection)object).size());
                }
            } else if (object instanceof Map) {
                if (bl) {
                    this.\u0784(stringBuffer, string, (Map)object);
                } else {
                    this.\u07a2(stringBuffer, string, ((Map)object).size());
                }
            } else if (object instanceof long[]) {
                if (bl) {
                    this.\u078c(stringBuffer, string, (long[])object);
                } else {
                    this.\u079e(stringBuffer, string, (long[])object);
                }
            } else if (object instanceof int[]) {
                if (bl) {
                    this.\u078b(stringBuffer, string, (int[])object);
                } else {
                    this.\u079d(stringBuffer, string, (int[])object);
                }
            } else if (object instanceof short[]) {
                if (bl) {
                    this.\u078e(stringBuffer, string, (short[])object);
                } else {
                    this.\u07a0(stringBuffer, string, (short[])object);
                }
            } else if (object instanceof byte[]) {
                if (bl) {
                    this.\u0787(stringBuffer, string, (byte[])object);
                } else {
                    this.\u0799(stringBuffer, string, (byte[])object);
                }
            } else if (object instanceof char[]) {
                if (bl) {
                    this.\u0788(stringBuffer, string, (char[])object);
                } else {
                    this.\u079a(stringBuffer, string, (char[])object);
                }
            } else if (object instanceof double[]) {
                if (bl) {
                    this.\u0789(stringBuffer, string, (double[])object);
                } else {
                    this.\u079b(stringBuffer, string, (double[])object);
                }
            } else if (object instanceof float[]) {
                if (bl) {
                    this.\u078a(stringBuffer, string, (float[])object);
                } else {
                    this.\u079c(stringBuffer, string, (float[])object);
                }
            } else if (object instanceof boolean[]) {
                if (bl) {
                    this.\u078f(stringBuffer, string, (boolean[])object);
                } else {
                    this.\u07a1(stringBuffer, string, (boolean[])object);
                }
            } else if (object.getClass().isArray()) {
                if (bl) {
                    this.\u078d(stringBuffer, string, (Object[])object);
                } else {
                    this.\u079f(stringBuffer, string, (Object[])object);
                }
            } else if (bl) {
                this.\u0782(stringBuffer, string, object);
            } else {
                this.\u0798(stringBuffer, string, object);
            }
            return;
        }
        finally {
            \u02e3.\u08ad(object);
        }
    }

    protected void \u0796(StringBuffer stringBuffer, String string) {
        stringBuffer.append(this.\u078c);
    }

    public void \u0797(StringBuffer stringBuffer, Object object) {
        if (object != null) {
            this.\u0529(stringBuffer, object);
            this.\u0794(stringBuffer, object);
            this.\u052b(stringBuffer);
            if (this.\u0784) {
                this.\u0792(stringBuffer);
            }
        }
    }

    protected void \u0798(StringBuffer stringBuffer, String string, Object object) {
        stringBuffer.append(this.\u078f);
        stringBuffer.append(this.\u0862(object.getClass()));
        stringBuffer.append(this.\u0790);
    }

    protected void \u0799(StringBuffer stringBuffer, String string, byte[] byArray) {
        this.\u07a2(stringBuffer, string, byArray.length);
    }

    protected void \u079a(StringBuffer stringBuffer, String string, char[] cArray) {
        this.\u07a2(stringBuffer, string, cArray.length);
    }

    protected void \u079b(StringBuffer stringBuffer, String string, double[] dArray) {
        this.\u07a2(stringBuffer, string, dArray.length);
    }

    protected void \u079c(StringBuffer stringBuffer, String string, float[] fArray) {
        this.\u07a2(stringBuffer, string, fArray.length);
    }

    protected void \u079d(StringBuffer stringBuffer, String string, int[] nArray) {
        this.\u07a2(stringBuffer, string, nArray.length);
    }

    protected void \u079e(StringBuffer stringBuffer, String string, long[] lArray) {
        this.\u07a2(stringBuffer, string, lArray.length);
    }

    protected void \u079f(StringBuffer stringBuffer, String string, Object[] objectArray) {
        this.\u07a2(stringBuffer, string, objectArray.length);
    }

    protected void \u07a0(StringBuffer stringBuffer, String string, short[] sArray) {
        this.\u07a2(stringBuffer, string, sArray.length);
    }

    protected void \u07a1(StringBuffer stringBuffer, String string, boolean[] blArray) {
        this.\u07a2(stringBuffer, string, blArray.length);
    }

    protected void \u07a2(StringBuffer stringBuffer, String string, int n2) {
        stringBuffer.append(this.\u078d);
        stringBuffer.append(n2);
        stringBuffer.append(this.\u078e);
    }

    protected String \u07a3() {
        return this.\u078a;
    }

    protected String \u07a4() {
        return this.\u0787;
    }

    protected String \u07a5() {
        return this.\u0782;
    }

    protected String \u07b1() {
        return this.\u0781;
    }

    protected String \u0860() {
        return this.\u078c;
    }

    protected String \u0862(Class<?> clazz) {
        return \u02e4.\u037f(clazz);
    }

    protected boolean \u0863(Boolean bl) {
        if (bl == null) {
            return this.\u078b;
        }
        return bl;
    }

    protected boolean \u0865() {
        return this.\u0780;
    }

    protected void \u0867(StringBuffer stringBuffer) {
        if (\u02d1.\u052b(stringBuffer, this.\u0786)) {
            stringBuffer.setLength(stringBuffer.length() - this.\u0786.length());
        }
    }

    protected void \u0868(String string) {
        String string2 = string;
        if (string == null) {
            string2 = "";
        }
        this.\u078a = string2;
    }

    protected void \u0869(String string) {
        String string2 = string;
        if (string == null) {
            string2 = "";
        }
        this.\u0787 = string2;
    }

    protected void \u086a(String string) {
        String string2 = string;
        if (string == null) {
            string2 = "";
        }
        this.\u0782 = string2;
    }

    protected void \u08a0(String string) {
        String string2 = string;
        if (string == null) {
            string2 = "";
        }
        this.\u0781 = string2;
    }

    protected void \u08a1(String string) {
        String string2 = string;
        if (string == null) {
            string2 = "";
        }
        this.\u0783 = string2;
    }

    protected void \u08a2(String string) {
        String string2 = string;
        if (string == null) {
            string2 = "";
        }
        this.\u0786 = string2;
    }

    protected void \u08a3(boolean bl) {
        this.\u0784 = bl;
    }

    protected void \u08a4(String string) {
        String string2 = string;
        if (string == null) {
            string2 = "";
        }
        this.\u078c = string2;
    }

    protected void \u08a5(String string) {
        String string2 = string;
        if (string == null) {
            string2 = "";
        }
        this.\u078e = string2;
    }

    protected void \u08a6(String string) {
        String string2 = string;
        if (string == null) {
            string2 = "";
        }
        this.\u078d = string2;
    }

    protected void \u08a7(String string) {
        String string2 = string;
        if (string == null) {
            string2 = "";
        }
        this.\u0790 = string2;
    }

    protected void \u08a8(String string) {
        String string2 = string;
        if (string == null) {
            string2 = "";
        }
        this.\u078f = string2;
    }

    protected void \u08a9(boolean bl) {
        this.\u058f = bl;
    }

    protected void \u08aa(boolean bl) {
        this.\u052f = bl;
    }

    protected void \u08ab(boolean bl) {
        this.\u0780 = bl;
    }

    protected void \u08ac(boolean bl) {
        this.\u0620 = bl;
    }

    private static final class \u037f
    extends \u02e3 {
        \u037f() {
        }
    }

    private static final class \u0528
    extends \u02e3 {
        \u0528() {
            this.\u08a9(false);
            this.\u08ab(false);
            this.\u08a0(SOY.d("01"));
            this.\u086a(SOY.d("07"));
            this.\u0869(SOY.d("21"));
            this.\u0868(SOY.d("27"));
            this.\u08a2(SOY.d("56"));
            this.\u08a1(SOY.d("40"));
            this.\u08a4(SOY.d("14273D1A"));
            this.\u08a8(SOY.d("586E"));
            String string = SOY.d("4470");
            this.\u08a7(string);
            this.\u08a6(SOY.d("586E221F0E1247"));
            this.\u08a5(string);
        }

        private void \u08ae(StringBuffer stringBuffer, String string) {
            stringBuffer.append('\"');
            stringBuffer.append(\u07f4.\u037f(string));
            stringBuffer.append('\"');
        }

        private boolean \u08af(String string) {
            boolean bl = string.startsWith(this.\u07a4()) && string.endsWith(this.\u07a3());
            return bl;
        }

        private boolean \u08b0(String string) {
            boolean bl = string.startsWith(this.\u07b1()) && string.endsWith(this.\u07a5());
            return bl;
        }

        @Override
        public void \u037f(StringBuffer stringBuffer, String string, Object object, Boolean bl) {
            if (string != null) {
                if (this.\u0863(bl)) {
                    super.\u037f(stringBuffer, string, object, bl);
                    return;
                }
                throw new UnsupportedOperationException(SOY.d("3C273D1A30120E33381A541A0F21255616125A26230311570D3A34185402093B3F11543D093D3F221B240E20381813240E2B3D13"));
            }
            throw new UnsupportedOperationException(SOY.d("3C3B341A105714333C1307571B2034561916143630021B050372261E11195A27221F1A105A1822191A23150125041D191D01250F1812"));
        }

        @Override
        protected void \u052e(StringBuffer stringBuffer, String string, char c2) {
            this.\u08ae(stringBuffer, String.valueOf(c2));
        }

        @Override
        protected void \u0782(StringBuffer stringBuffer, String string, Object object) {
            if (object == null) {
                this.\u0796(stringBuffer, string);
                return;
            }
            if (!(object instanceof String) && !(object instanceof Character)) {
                if (!(object instanceof Number) && !(object instanceof Boolean)) {
                    String string2 = object.toString();
                    if (!this.\u08b0(string2) && !this.\u08af(string2)) {
                        this.\u0782(stringBuffer, string, string2);
                        return;
                    }
                    stringBuffer.append(object);
                    return;
                }
                stringBuffer.append(object);
                return;
            }
            this.\u08ae(stringBuffer, object.toString());
        }

        @Override
        protected void \u0783(StringBuffer stringBuffer, String string, Collection<?> object) {
            if (object != null && !object.isEmpty()) {
                stringBuffer.append(this.\u07a4());
                int n2 = 0;
                object = object.iterator();
                while (object.hasNext()) {
                    this.\u0780(stringBuffer, string, n2, object.next());
                    ++n2;
                }
                stringBuffer.append(this.\u07a3());
                return;
            }
            stringBuffer.append(object);
        }

        @Override
        protected void \u0784(StringBuffer stringBuffer, String string, Map<?, ?> object) {
            if (object != null && !object.isEmpty()) {
                stringBuffer.append(this.\u07b1());
                object = object.entrySet().iterator();
                boolean bl = true;
                while (object.hasNext()) {
                    Map.Entry entry = (Map.Entry)object.next();
                    string = \u07f5.\u037f(entry.getKey(), null);
                    if (string == null) continue;
                    if (bl) {
                        bl = false;
                    } else {
                        this.\u0791(stringBuffer, string);
                    }
                    this.\u0793(stringBuffer, string);
                    entry = entry.getValue();
                    if (entry == null) {
                        this.\u0796(stringBuffer, string);
                        continue;
                    }
                    this.\u0795(stringBuffer, string, entry, true);
                }
                stringBuffer.append(this.\u07a5());
                return;
            }
            stringBuffer.append(object);
        }

        @Override
        protected void \u0793(StringBuffer stringBuffer, String string) {
            if (string != null) {
                StringBuilder stringBuilder = new StringBuilder();
                String string2 = SOY.d("58");
                stringBuilder.append(string2);
                stringBuilder.append(\u07f4.\u037f(string));
                stringBuilder.append(string2);
                super.\u0793(stringBuffer, stringBuilder.toString());
                return;
            }
            throw new UnsupportedOperationException(SOY.d("3C3B341A105714333C1307571B2034561916143630021B050372261E11195A27221F1A105A1822191A23150125041D191D01250F1812"));
        }
    }

    private static final class \u052a
    extends \u02e3 {
        \u052a() {
            this.\u08a0(SOY.d("21"));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(System.lineSeparator());
            stringBuilder.append(SOY.d("5A72"));
            this.\u08a2(stringBuilder.toString());
            this.\u08a3(true);
            stringBuilder = new StringBuilder();
            stringBuilder.append(System.lineSeparator());
            stringBuilder.append(SOY.d("27"));
            this.\u086a(stringBuilder.toString());
        }
    }

    private static final class \u052c
    extends \u02e3 {
        \u052c() {
            this.\u08a9(false);
            this.\u08ab(false);
        }
    }

    private static final class \u052e
    extends \u02e3 {
        \u052e() {
            this.\u08aa(false);
        }
    }

    private static final class \u058f
    extends \u02e3 {
        \u058f() {
            this.\u08ac(true);
            this.\u08ab(false);
        }
    }

    private static final class \u0620
    extends \u02e3 {
        \u0620() {
            this.\u08a9(false);
            this.\u08ab(false);
            this.\u08aa(false);
            this.\u08a0("");
            this.\u086a("");
        }
    }
}

