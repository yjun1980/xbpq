/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  javax.annotation.ParametersAreNonnullByDefault
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u0129;
import com.github.catvod.spider.merge.\u012b;
import com.github.catvod.spider.merge.\u0131;
import com.github.catvod.spider.merge.\u013a;
import com.github.catvod.spider.merge.\u0140;
import com.github.catvod.spider.merge.\u017f;
import com.github.catvod.spider.merge.\u01c3;
import com.github.catvod.spider.merge.\u01d0;
import com.github.catvod.spider.merge.\u0209;
import com.github.catvod.spider.merge.\u02cd;
import com.github.catvod.spider.merge.\u0371;
import com.github.catvod.spider.merge.\u0457;
import com.github.catvod.spider.merge.\u0582;
import com.github.catvod.spider.merge.\u05d6;
import com.github.catvod.spider.merge.\u0845;
import com.github.catvod.spider.merge.\u097d;
import com.github.catvod.spider.merge.\u0d3d;
import com.github.catvod.spider.merge.\u0f62;
import com.github.catvod.spider.merge.\u0f6a;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

public class \u07ca
extends \u0f6a {
    static final String[] \u0620;
    static final String[] \u0780;
    static final String[] \u0781;
    static final String[] \u0782;
    static final String[] \u0783;
    static final String[] \u0784;
    static final String[] \u0785;
    private \u05d6 \u0786;
    private \u05d6 \u0787;
    private boolean \u0788;
    @Nullable
    private \u013a \u0789;
    @Nullable
    private \u0d3d \u078a;
    @Nullable
    private \u013a \u078b;
    private ArrayList<\u013a> \u078c;
    private List<String> \u078d;
    private \u017f.\u0620 \u078e;
    private boolean \u078f;
    private boolean \u0790;
    private boolean \u0791;
    private String[] \u0792 = new String[]{null};

    static {
        String string = SOY.d("1B22211A1103");
        String string2 = SOY.d("193321021D1814");
        String string3 = SOY.d("12263C1A");
        String string4 = SOY.d("1733230701121F");
        String string5 = SOY.d("15303B131703");
        String string6 = SOY.d("0E33331A11");
        String string7 = SOY.d("0E36");
        String string8 = SOY.d("0E3A");
        \u0620 = new String[]{string, string2, string3, string4, string5, string6, string7, string8};
        String string9 = SOY.d("153E");
        String string10 = SOY.d("0F3E");
        \u0780 = new String[]{string9, string10};
        String string11 = SOY.d("182725021B19");
        \u0781 = new String[]{string11};
        \u0782 = new String[]{string3, string6};
        String string12 = SOY.d("1522251106180F22");
        String string13 = SOY.d("1522251F1B19");
        \u0783 = new String[]{string12, string13};
        \u0784 = new String[]{SOY.d("1E36"), SOY.d("1E26"), SOY.d("163B"), string12, string13, SOY.d("0A"), SOY.d("0822"), SOY.d("0826")};
        \u0785 = new String[]{SOY.d("1B363504110409"), string, SOY.d("1B203417"), SOY.d("1B20251F171B1F"), SOY.d("1B21381211"), SOY.d("18332213"), SOY.d("1833221312181426"), SOY.d("1835221901191E"), SOY.d("183E3E151F060F3D2513"), SOY.d("183D350F"), SOY.d("1820"), string11, string2, SOY.d("19373F021105"), SOY.d("193D3D"), SOY.d("193D3D1106180F22"), SOY.d("193D3C1B15191E"), SOY.d("1E36"), SOY.d("1E3725171D1B09"), SOY.d("1E3B23"), SOY.d("1E3B27"), SOY.d("1E3E"), SOY.d("1E26"), SOY.d("1F3F331310"), SOY.d("1C3B341A10041F26"), SOY.d("1C3B361515070E3B3E18"), SOY.d("1C3B36030612"), SOY.d("1C3D3E021105"), SOY.d("1C3D231B"), SOY.d("1C20301B11"), SOY.d("1C20301B11041F26"), SOY.d("1263"), SOY.d("1260"), SOY.d("1261"), SOY.d("1266"), SOY.d("1267"), SOY.d("1264"), SOY.d("12373012"), SOY.d("123730121105"), SOY.d("123523190107"), SOY.d("1220"), string3, SOY.d("133423171912"), SOY.d("133F36"), SOY.d("133C210300"), SOY.d("13213818101202"), SOY.d("163B"), SOY.d("163B3F1D"), SOY.d("163B22021D191D"), string4, SOY.d("17373F03"), SOY.d("17372517"), SOY.d("143327"), SOY.d("143D341B16121E"), SOY.d("143D3704151A1F21"), SOY.d("143D2215061E0A26"), string5, string9, SOY.d("0A"), SOY.d("0A33231719"), SOY.d("0A3E301F1A031F2A25"), SOY.d("0A2034"), SOY.d("0931231F0403"), SOY.d("093732021D1814"), SOY.d("09373D131703"), SOY.d("0926281A11"), SOY.d("09273C1B150503"), string6, SOY.d("0E303E120D"), string7, SOY.d("0E37290215051F33"), SOY.d("0E343E1900"), string8, SOY.d("0E3A341710"), SOY.d("0E3B251A11"), SOY.d("0E20"), string10, SOY.d("0D3023"), SOY.d("023F21")};
    }

    private void \u0783(String ... stringArray) {
        \u013a \u013a2;
        for (int i2 = this.\u052b.size() - 1; i2 >= 0 && !\u0131.\u0529((\u013a2 = this.\u052b.get(i2)).\u08aa(), stringArray) && !\u013a2.\u08aa().equals(SOY.d("12263C1A")); --i2) {
            this.\u052b.remove(i2);
        }
    }

    private boolean \u079a(String string, String[] stringArray, String[] stringArray2) {
        String[] stringArray3 = this.\u0792;
        stringArray3[0] = string;
        return this.\u079b(stringArray3, stringArray, stringArray2);
    }

    private boolean \u079b(String[] stringArray, String[] stringArray2, String[] stringArray3) {
        int n2 = this.\u052b.size() - 1;
        int n3 = n2 > 100 ? n2 - 100 : 0;
        while (n2 >= n3) {
            String string = this.\u052b.get(n2).\u08aa();
            if (\u0131.\u052a(string, stringArray)) {
                return true;
            }
            if (\u0131.\u052a(string, stringArray2)) {
                return false;
            }
            if (stringArray3 != null && \u0131.\u052a(string, stringArray3)) {
                return false;
            }
            --n2;
        }
        return false;
    }

    private void \u07a5(\u0582 \u05822) {
        \u0d3d \u0d3d2;
        if (this.\u052b.isEmpty()) {
            this.\u052a.\u07a2(\u05822);
        } else if (this.\u0862()) {
            this.\u07a3(\u05822);
        } else {
            this.\u037f().\u07a2(\u05822);
        }
        if (\u05822 instanceof \u013a && ((\u013a)(\u05822 = (\u013a)\u05822)).\u08b7().\u052c() && (\u0d3d2 = this.\u078a) != null) {
            \u0d3d2.\u08bc((\u013a)\u05822);
        }
    }

    private boolean \u0861(ArrayList<\u013a> arrayList, \u013a \u013a2) {
        int n2 = arrayList.size() - 1;
        int n3 = n2 >= 256 ? n2 - 256 : 0;
        while (n2 >= n3) {
            if (arrayList.get(n2) == \u013a2) {
                return true;
            }
            --n2;
        }
        return false;
    }

    private boolean \u0865(\u013a \u013a2, \u013a \u013a3) {
        boolean bl = \u013a2.\u08aa().equals(\u013a3.\u08aa()) && \u013a2.\u052b().equals(\u013a3.\u052b());
        return bl;
    }

    private void \u08b0(ArrayList<\u013a> arrayList, \u013a \u013a2, \u013a \u013a3) {
        int n2 = arrayList.lastIndexOf(\u013a2);
        boolean bl = n2 != -1;
        \u01c3.\u0529(bl);
        arrayList.set(n2, \u013a3);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(SOY.d("2E2034133602133E3513060C1927230411190E063E1D111947"));
        stringBuilder.append(this.\u052d);
        stringBuilder.append(SOY.d("5672220215031F6F"));
        stringBuilder.append((Object)this.\u0786);
        stringBuilder.append(SOY.d("5672320306051F3C2533181217373F0249"));
        stringBuilder.append(this.\u037f());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    @Override
    \u097d \u0528() {
        return \u097d.\u037f;
    }

    @Override
    @ParametersAreNonnullByDefault
    protected void \u052a(Reader reader, String string, \u0371 \u03712) {
        super.\u052a(reader, string, \u03712);
        this.\u0786 = \u05d6.\u037f;
        this.\u0787 = null;
        this.\u0788 = false;
        this.\u0789 = null;
        this.\u078a = null;
        this.\u078b = null;
        this.\u078c = new ArrayList();
        this.\u078d = new ArrayList<String>();
        this.\u078e = new \u017f.\u0620();
        this.\u078f = true;
        this.\u0790 = false;
        this.\u0791 = false;
    }

    @Override
    protected boolean \u052b(String string) {
        boolean bl = string.equals(SOY.d("0931231F0403")) || string.equals(SOY.d("0926281A11"));
        return bl;
    }

    @Override
    protected boolean \u052d(\u017f \u017f2) {
        this.\u052d = \u017f2;
        return this.\u0786.\u058f(\u017f2, this);
    }

    \u013a \u0780(\u013a \u013a2) {
        for (int i2 = this.\u052b.size() - 1; i2 >= 0; --i2) {
            if (this.\u052b.get(i2) != \u013a2) continue;
            return this.\u052b.get(i2 - 1);
        }
        return null;
    }

    void \u0781(\u013a \u013a2) {
        \u013a \u013a3;
        int n2 = 0;
        for (int i2 = this.\u078c.size() - 1; i2 >= 0 && (\u013a3 = this.\u078c.get(i2)) != null; --i2) {
            int n3 = n2;
            if (this.\u0865(\u013a2, \u013a3)) {
                n3 = n2 + 1;
            }
            if (n3 == 3) {
                this.\u078c.remove(i2);
                break;
            }
            n2 = n3;
        }
    }

    void \u0782() {
        while (!this.\u078c.isEmpty() && this.\u08ae() != null) {
        }
    }

    void \u0784() {
        this.\u0783(SOY.d("0E303E120D"), SOY.d("0E343E1900"), SOY.d("0E3A341710"), SOY.d("0E373C0618160E37"));
    }

    void \u0785() {
        this.\u0783(SOY.d("0E33331A11"));
    }

    void \u0786() {
        this.\u0783(SOY.d("0E20"), SOY.d("0E373C0618160E37"));
    }

    void \u0787(\u05d6 \u05d62) {
        if (this.\u037f.\u037f().\u037f()) {
            \u0457 \u04572 = this.\u037f.\u037f();
            int n2 = this.\u0528.\u0797();
            String string = this.\u052d.\u0783();
            \u04572.add(new \u0845(n2, SOY.d("2F3C340E041219263412540315393418542C5F210C56031F1F3C711F1A570926300211572177222B"), new Object[]{string, \u05d62}));
        }
    }

    void \u0788(boolean bl) {
        this.\u078f = bl;
    }

    boolean \u0789() {
        return this.\u078f;
    }

    void \u078a() {
        this.\u078b(null);
    }

    void \u078b(String string) {
        while (string != null && !this.\u037f().\u08aa().equals(string) && \u0131.\u052a(this.\u037f().\u08aa(), \u0784)) {
            this.\u08a2();
        }
    }

    \u013a \u078c(String string) {
        \u013a \u013a2;
        for (int i2 = this.\u078c.size() - 1; i2 >= 0 && (\u013a2 = this.\u078c.get(i2)) != null; --i2) {
            if (!\u013a2.\u08aa().equals(string)) continue;
            return \u013a2;
        }
        return null;
    }

    String \u078d() {
        return this.\u052c;
    }

    \u01d0 \u078e() {
        return this.\u052a;
    }

    \u0d3d \u078f() {
        return this.\u078a;
    }

    \u013a \u0790(String string) {
        for (int i2 = this.\u052b.size() - 1; i2 >= 0; --i2) {
            \u013a \u013a2 = this.\u052b.get(i2);
            if (!\u013a2.\u08aa().equals(string)) continue;
            return \u013a2;
        }
        return null;
    }

    \u013a \u0791() {
        return this.\u0789;
    }

    List<String> \u0792() {
        return this.\u078d;
    }

    ArrayList<\u013a> \u0793() {
        return this.\u052b;
    }

    boolean \u0794(String string) {
        return this.\u0797(string, \u0781);
    }

    boolean \u0795(String string) {
        return this.\u0797(string, \u0780);
    }

    boolean \u0796(String string) {
        return this.\u0797(string, null);
    }

    boolean \u0797(String string, String[] stringArray) {
        return this.\u079a(string, \u0620, stringArray);
    }

    boolean \u0798(String[] stringArray) {
        return this.\u079b(stringArray, \u0620, null);
    }

    boolean \u0799(String string) {
        for (int i2 = this.\u052b.size() - 1; i2 >= 0; --i2) {
            String string2 = this.\u052b.get(i2).\u08aa();
            if (string2.equals(string)) {
                return true;
            }
            if (\u0131.\u052a(string2, \u0783)) continue;
            return false;
        }
        \u01c3.\u037f(SOY.d("293A3E0318135A3C3E0254151F72231315141233331A11"));
        return false;
    }

    boolean \u079c(String string) {
        return this.\u079a(string, \u0782, null);
    }

    \u013a \u079d(\u017f.\u0780 object) {
        if (((\u017f.\u0781)object).\u078e() && !((\u017f.\u0781)object).\u058f.isEmpty() && ((\u017f.\u0781)object).\u058f.\u058f(this.\u052e) > 0) {
            this.\u0529(SOY.d("3E27211A1D141B26345615030E20381401031F"));
        }
        if (((\u017f.\u0781)object).\u078f()) {
            object = this.\u07a1((\u017f.\u0780)object);
            this.\u052b.add((\u013a)object);
            this.\u0529.\u078b(\u0f62.\u037f);
            this.\u0529.\u0781(this.\u078e.\u0794().\u0791(((\u013a)object).\u08b8()));
            return object;
        }
        object = new \u013a(\u0209.\u0783(((\u017f.\u0781)object).\u0790(), this.\u052e), null, this.\u052e.\u0528(((\u017f.\u0781)object).\u058f));
        this.\u079e((\u013a)object);
        return object;
    }

    void \u079e(\u013a \u013a2) {
        this.\u07a5(\u013a2);
        this.\u052b.add(\u013a2);
    }

    void \u079f(\u017f.\u052a object) {
        Object object2 = this.\u037f();
        \u013a \u013a2 = object2;
        if (object2 == null) {
            \u013a2 = this.\u052a;
        }
        object2 = \u013a2.\u08aa();
        String string = ((\u017f.\u052a)object).\u0785();
        object = ((\u017f)object).\u052c() ? new \u02cd(string) : (this.\u052b((String)object2) ? new \u0129(string) : new \u0140(string));
        \u013a2.\u07a2((\u0582)object);
    }

    void \u07a0(\u017f.\u052c \u052d) {
        this.\u07a5(new \u012b(\u052d.\u0787()));
    }

    \u013a \u07a1(\u017f.\u0780 \u07802) {
        \u0209 \u02092 = \u0209.\u0783(\u07802.\u0790(), this.\u052e);
        \u013a \u013a2 = new \u013a(\u02092, null, this.\u052e.\u0528(\u07802.\u058f));
        this.\u07a5(\u013a2);
        if (\u07802.\u078f()) {
            if (\u02092.\u052e()) {
                if (!\u02092.\u052b()) {
                    this.\u0529.\u0787(SOY.d("2E3336561716143C3E0254151F72221318115A313D19071E14356A561A180E7230560218133671021510"));
                }
            } else {
                \u02092.\u0781();
            }
        }
        return \u013a2;
    }

    \u0d3d \u07a2(\u017f.\u0780 object, boolean bl) {
        object = new \u0d3d(\u0209.\u0783(((\u017f.\u0781)object).\u0790(), this.\u052e), null, this.\u052e.\u0528(((\u017f.\u0781)object).\u058f));
        this.\u08b3((\u0d3d)object);
        this.\u07a5((\u0582)object);
        if (bl) {
            this.\u052b.add((\u013a)object);
        }
        return object;
    }

    void \u07a3(\u0582 \u05822) {
        \u013a \u013a2;
        \u013a \u013a3 = this.\u0790(SOY.d("0E33331A11"));
        boolean bl = false;
        if (\u013a3 != null) {
            if (\u013a3.\u08ad() != null) {
                \u013a2 = \u013a3.\u08ad();
                bl = true;
            } else {
                \u013a2 = this.\u0780(\u013a3);
            }
        } else {
            \u013a2 = this.\u052b.get(0);
        }
        if (bl) {
            \u01c3.\u052f(\u013a3);
            \u013a3.\u0861(\u05822);
        } else {
            \u013a2.\u07a2(\u05822);
        }
    }

    void \u07a4() {
        this.\u078c.add(null);
    }

    void \u07b1(\u013a \u013a2, \u013a \u013a3) {
        int n2 = this.\u052b.lastIndexOf(\u013a2);
        boolean bl = n2 != -1;
        \u01c3.\u0529(bl);
        this.\u052b.add(n2 + 1, \u013a3);
    }

    \u013a \u0860(String object) {
        object = new \u013a(\u0209.\u0783((String)object, this.\u052e), null);
        this.\u079e((\u013a)object);
        return object;
    }

    boolean \u0862() {
        return this.\u0790;
    }

    boolean \u0863() {
        return this.\u0791;
    }

    boolean \u0864(\u013a \u013a2) {
        return this.\u0861(this.\u078c, \u013a2);
    }

    boolean \u0866(\u013a \u013a2) {
        return \u0131.\u052a(\u013a2.\u08aa(), \u0785);
    }

    \u013a \u0867() {
        Cloneable cloneable;
        if (this.\u078c.size() > 0) {
            cloneable = this.\u078c;
            cloneable = cloneable.get(cloneable.size() - 1);
        } else {
            cloneable = null;
        }
        return cloneable;
    }

    void \u0868() {
        this.\u0787 = this.\u0786;
    }

    void \u0869(\u013a object) {
        if (this.\u0788) {
            return;
        }
        if (((String)(object = ((\u0582)object).\u037f(SOY.d("12203410")))).length() != 0) {
            this.\u052c = object;
            this.\u0788 = true;
            this.\u052a.\u079a((String)object);
        }
    }

    void \u086a() {
        this.\u078d = new ArrayList<String>();
    }

    boolean \u08a0(\u013a \u013a2) {
        return this.\u0861(this.\u052b, \u013a2);
    }

    \u05d6 \u08a1() {
        return this.\u0787;
    }

    \u013a \u08a2() {
        int n2 = this.\u052b.size();
        return this.\u052b.remove(n2 - 1);
    }

    void \u08a3(String string) {
        for (int i2 = this.\u052b.size() - 1; i2 >= 0 && !this.\u052b.get(i2).\u08aa().equals(string); --i2) {
            this.\u052b.remove(i2);
        }
    }

    \u013a \u08a4(String string) {
        for (int i2 = this.\u052b.size() - 1; i2 >= 0; --i2) {
            \u013a \u013a2 = this.\u052b.get(i2);
            this.\u052b.remove(i2);
            if (!\u013a2.\u08aa().equals(string)) continue;
            return \u013a2;
        }
        return null;
    }

    void \u08a5(String ... stringArray) {
        for (int i2 = this.\u052b.size() - 1; i2 >= 0; --i2) {
            \u013a \u013a2 = this.\u052b.get(i2);
            this.\u052b.remove(i2);
            if (\u0131.\u052a(\u013a2.\u08aa(), stringArray)) break;
        }
    }

    int \u08a6(\u013a \u013a2) {
        for (int i2 = 0; i2 < this.\u078c.size(); ++i2) {
            if (\u013a2 != this.\u078c.get(i2)) continue;
            return i2;
        }
        return -1;
    }

    boolean \u08a7(\u017f \u017f2, \u05d6 \u05d62) {
        this.\u052d = \u017f2;
        return \u05d62.\u058f(\u017f2, this);
    }

    void \u08a8(\u013a \u013a2) {
        this.\u052b.add(\u013a2);
    }

    void \u08a9(\u013a \u013a2) {
        this.\u0781(\u013a2);
        this.\u078c.add(\u013a2);
    }

    void \u08aa(\u013a \u013a2, int n2) {
        this.\u0781(\u013a2);
        this.\u078c.add(n2, \u013a2);
    }

    /*
     * Unable to fully structure code
     */
    void \u08ab() {
        var5_1 = this.\u0867();
        if (var5_1 != null && !this.\u08a0((\u013a)var5_1)) {
            var1_2 = this.\u078c.size();
            var3_3 = true;
            var1_2 = var4_4 = var1_2 - 1;
            while (var1_2 != 0) {
                var5_1 = this.\u078c;
                var2_5 = var1_2 - 1;
                var6_6 = (\u013a)var5_1.get(var2_5);
                var5_1 = var6_6;
                var1_2 = var2_5;
                if (var6_6 != null) {
                    var5_1 = var6_6;
                    var1_2 = var2_5;
                    if (!this.\u08a0(var6_6)) continue;
                    var1_2 = var2_5;
                    var5_1 = var6_6;
                }
                while (true) {
                    var3_3 = false;
                    break;
                }
                break;
            }
            var2_5 = var1_2;
            if (!var3_3) {
                var5_1 = this.\u078c;
                var2_5 = var1_2 + 1;
                var5_1 = (\u013a)var5_1.get(var2_5);
            }
            \u01c3.\u052f(var5_1);
            var6_6 = this.\u0860(var5_1.\u08aa());
            var6_6.\u052b().\u052b(var5_1.\u052b());
            this.\u078c.set(var2_5, var6_6);
            var1_2 = var2_5;
            if (var2_5 != var4_4) ** continue;
        }
    }

    void \u08ac(\u013a \u013a2) {
        for (int i2 = this.\u078c.size() - 1; i2 >= 0; --i2) {
            if (this.\u078c.get(i2) != \u013a2) continue;
            this.\u078c.remove(i2);
            break;
        }
    }

    boolean \u08ad(\u013a \u013a2) {
        for (int i2 = this.\u052b.size() - 1; i2 >= 0; --i2) {
            if (this.\u052b.get(i2) != \u013a2) continue;
            this.\u052b.remove(i2);
            return true;
        }
        return false;
    }

    \u013a \u08ae() {
        int n2 = this.\u078c.size();
        if (n2 > 0) {
            return this.\u078c.remove(n2 - 1);
        }
        return null;
    }

    void \u08af(\u013a \u013a2, \u013a \u013a3) {
        this.\u08b0(this.\u078c, \u013a2, \u013a3);
    }

    void \u08b1(\u013a \u013a2, \u013a \u013a3) {
        this.\u08b0(this.\u052b, \u013a2, \u013a3);
    }

    void \u08b2() {
        boolean bl = false;
        for (int i2 = this.\u052b.size() - 1; i2 >= 0; --i2) {
            Object object = this.\u052b.get(i2);
            if (i2 == 0) {
                object = this.\u078b;
                bl = true;
            }
            object = object != null ? ((\u013a)object).\u08aa() : "";
            if (SOY.d("09373D131703").equals(object)) {
                this.\u08b8(\u05d6.\u0784);
                break;
            }
            if (!(SOY.d("0E36").equals(object) || SOY.d("0E3A").equals(object) && !bl)) {
                if (SOY.d("0E20").equals(object)) {
                    this.\u08b8(\u05d6.\u0782);
                    break;
                }
                if (!(SOY.d("0E303E120D").equals(object) || SOY.d("0E3A341710").equals(object) || SOY.d("0E343E1900").equals(object))) {
                    if (SOY.d("193321021D1814").equals(object)) {
                        this.\u08b8(\u05d6.\u0620);
                        break;
                    }
                    if (SOY.d("193D3D1106180F22").equals(object)) {
                        this.\u08b8(\u05d6.\u0780);
                        break;
                    }
                    if (SOY.d("0E33331A11").equals(object)) {
                        this.\u08b8(\u05d6.\u052f);
                        break;
                    }
                    if (SOY.d("12373012").equals(object)) {
                        this.\u08b8(\u05d6.\u052d);
                        break;
                    }
                    if (SOY.d("183D350F").equals(object)) {
                        this.\u08b8(\u05d6.\u052d);
                        break;
                    }
                    if (SOY.d("1C20301B11041F26").equals(object)) {
                        this.\u08b8(\u05d6.\u0787);
                        break;
                    }
                    if (SOY.d("12263C1A").equals(object)) {
                        this.\u08b8(\u05d6.\u0529);
                        break;
                    }
                    if (!bl) continue;
                    this.\u08b8(\u05d6.\u052d);
                    break;
                }
                this.\u08b8(\u05d6.\u0781);
                break;
            }
            this.\u08b8(\u05d6.\u0783);
            break;
        }
    }

    void \u08b3(\u0d3d \u0d3d2) {
        this.\u078a = \u0d3d2;
    }

    void \u08b4(boolean bl) {
        this.\u0790 = bl;
    }

    void \u08b6(\u013a \u013a2) {
        this.\u0789 = \u013a2;
    }

    \u05d6 \u08b7() {
        return this.\u0786;
    }

    void \u08b8(\u05d6 \u05d62) {
        this.\u0786 = \u05d62;
    }
}

