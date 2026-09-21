/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u017f;
import com.github.catvod.spider.merge.\u01c3;
import com.github.catvod.spider.merge.\u0456;
import com.github.catvod.spider.merge.\u0457;
import com.github.catvod.spider.merge.\u05d5;
import com.github.catvod.spider.merge.\u0845;
import com.github.catvod.spider.merge.\u0f62;
import java.util.Arrays;

final class \u05f2 {
    private static final char[] \u037f;
    static final int[] \u0528;
    private final \u0456 \u0529;
    private final \u0457 \u052a;
    private \u0f62 \u052b = \u0f62.\u037f;
    private \u017f \u052c;
    private boolean \u052d = false;
    private String \u052e = null;
    private StringBuilder \u052f = new StringBuilder(1024);
    StringBuilder \u058f = new StringBuilder(1024);
    \u017f.\u0781 \u0620;
    \u017f.\u0780 \u0780 = new \u017f.\u0780();
    \u017f.\u0620 \u0781 = new \u017f.\u0620();
    \u017f.\u052a \u0782 = new \u017f.\u052a();
    \u017f.\u052e \u0783 = new \u017f.\u052e();
    \u017f.\u052c \u0784 = new \u017f.\u052c();
    private String \u0785;
    private final int[] \u0786 = new int[1];
    private final int[] \u0787 = new int[2];

    static {
        char[] cArray;
        char[] cArray2 = cArray = new char[7];
        cArray[0] = 9;
        cArray2[1] = 10;
        cArray2[2] = 13;
        cArray2[3] = 12;
        cArray2[4] = 32;
        cArray2[5] = 60;
        cArray2[6] = 38;
        \u037f = cArray;
        \u0528 = new int[]{8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
        Arrays.sort(cArray);
    }

    \u05f2(\u0456 \u04562, \u0457 \u04572) {
        this.\u0529 = \u04562;
        this.\u052a = \u04572;
    }

    private void \u0529(String string) {
        if (this.\u052a.\u037f()) {
            this.\u052a.add(new \u0845(this.\u0529.\u0797(), SOY.d("333C2717181E1E72321E15051B31251306570837371306121431344C545209"), string));
        }
    }

    void \u037f(\u0f62 \u0f622) {
        this.\u0529.\u037f();
        this.\u052b = \u0f622;
    }

    String \u0528() {
        return this.\u0785;
    }

    int[] \u052a(Character object, boolean bl) {
        if (this.\u0529.\u0789()) {
            return null;
        }
        if (object != null && ((Character)object).charValue() == this.\u0529.\u0788()) {
            return null;
        }
        if (this.\u0529.\u0791(\u037f)) {
            return null;
        }
        Object object2 = this.\u0786;
        this.\u0529.\u078b();
        boolean bl2 = this.\u0529.\u078c(SOY.d("59"));
        String string = SOY.d("173B22051D191D722213191E193D3D191A");
        String string2 = SOY.d("41");
        if (bl2) {
            bl = this.\u0529.\u078d(SOY.d("22"));
            object = this.\u0529;
            object = bl ? ((\u0456)object).\u052f() : ((\u0456)object).\u052e();
            if (((String)object).length() == 0) {
                this.\u0529(SOY.d("14273C13061E19722313121208373F1511570D3B251E541915723F03191208333D05"));
                this.\u0529.\u0799();
                return null;
            }
            this.\u0529.\u079b();
            if (!this.\u0529.\u078c(string2)) {
                this.\u0529(string);
            }
            int n2 = bl ? 16 : 10;
            try {
                n2 = Integer.valueOf((String)object, n2);
            }
            catch (NumberFormatException numberFormatException) {
                n2 = -1;
            }
            if (n2 != -1 && (n2 < 55296 || n2 > 57343) && n2 <= 0x10FFFF) {
                Object object3 = n2;
                if (n2 >= 128) {
                    object = \u0528;
                    object3 = n2;
                    if (n2 < ((Object)object).length + 128) {
                        this.\u0529(SOY.d("193A300415140E3723561D045A3C3E0254165A24301A1D135A273F1F17181E3771151B131F7221191D190E"));
                        object3 = object[n2 - 128];
                    }
                }
                object2[0] = object3;
            } else {
                this.\u0529(SOY.d("193A300415140E3723561B020E213812115715347100151B1336710415191D37"));
                object2[0] = 65533;
            }
            return object2;
        }
        object = this.\u0529.\u0620();
        bl2 = this.\u0529.\u078e(';');
        int n3 = !(\u05d5.\u052c((String)object) || \u05d5.\u052d((String)object) && bl2) ? 0 : 1;
        if (n3 == 0) {
            this.\u0529.\u0799();
            if (bl2) {
                this.\u0529(SOY.d("133C2717181E1E723F1719121E722313121208373F1511"));
            }
            return null;
        }
        if (bl && (this.\u0529.\u0794() || this.\u0529.\u0792() || this.\u0529.\u0790('=', '-', '_'))) {
            this.\u0529.\u0799();
            return null;
        }
        this.\u0529.\u079b();
        if (!this.\u0529.\u078c(string2)) {
            this.\u0529(string);
        }
        if ((n3 = \u05d5.\u052a((String)object, this.\u0787)) == 1) {
            object2[0] = this.\u0787[0];
            return object2;
        }
        if (n3 == 2) {
            return this.\u0787;
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append(SOY.d("2F3C340E04121926341254141233231717031F20225606120E27231811135A343E0454"));
        ((StringBuilder)object2).append((String)object);
        \u01c3.\u037f(((StringBuilder)object2).toString());
        return this.\u0787;
    }

    void \u052b() {
        this.\u0784.\u0781();
        this.\u0784.\u052a = true;
    }

    void \u052c() {
        this.\u0784.\u0781();
    }

    void \u052d() {
        this.\u0783.\u0781();
    }

    \u017f.\u0781 \u052e(boolean bl) {
        \u017f.\u0781 \u07812 = bl ? this.\u0780.\u0794() : this.\u0781.\u0794();
        this.\u0620 = \u07812;
        return \u07812;
    }

    void \u052f() {
        \u017f.\u0782(this.\u058f);
    }

    void \u058f(char c2) {
        if (this.\u052e == null) {
            this.\u052e = String.valueOf(c2);
        } else {
            if (this.\u052f.length() == 0) {
                this.\u052f.append(this.\u052e);
            }
            this.\u052f.append(c2);
        }
    }

    void \u0620(String string) {
        if (this.\u052e == null) {
            this.\u052e = string;
        } else {
            if (this.\u052f.length() == 0) {
                this.\u052f.append(this.\u052e);
            }
            this.\u052f.append(string);
        }
    }

    void \u0780(StringBuilder stringBuilder) {
        if (this.\u052e == null) {
            this.\u052e = stringBuilder.toString();
        } else {
            if (this.\u052f.length() == 0) {
                this.\u052f.append(this.\u052e);
            }
            this.\u052f.append((CharSequence)stringBuilder);
        }
    }

    void \u0781(\u017f \u017f2) {
        \u01c3.\u0528(this.\u052d);
        this.\u052c = \u017f2;
        this.\u052d = true;
        \u017f.\u0782 \u07822 = \u017f2.\u037f;
        if (\u07822 == \u017f.\u0782.\u0528) {
            this.\u0785 = ((\u017f.\u0780)\u017f2).\u0528;
        } else if (\u07822 == \u017f.\u0782.\u0529 && ((\u017f.\u0620)\u017f2).\u078e()) {
            this.\u0787(SOY.d("3B2625041D150F263405541E14313E04061219263D0F5407083722131A035A3D3F5611191E72251713"));
        }
    }

    void \u0782(int[] nArray) {
        this.\u0620(new String(nArray, 0, nArray.length));
    }

    void \u0783() {
        this.\u0781(this.\u0784);
    }

    void \u0784() {
        this.\u0781(this.\u0783);
    }

    void \u0785() {
        this.\u0620.\u078c();
        this.\u0781(this.\u0620);
    }

    void \u0786(\u0f62 \u0f622) {
        if (this.\u052a.\u037f()) {
            this.\u052a.add(new \u0845(this.\u0529.\u0797(), SOY.d("2F3C340E041219263412180E5A203417171F1F3671131A135A3D3756121E1637715E31383C7B711F1A57133C210300570926300211572177222B"), new Object[]{\u0f622}));
        }
    }

    void \u0787(String string) {
        if (this.\u052a.\u037f()) {
            this.\u052a.add(new \u0845(this.\u0529.\u0797(), string));
        }
    }

    void \u0788(\u0f62 \u0f622) {
        if (this.\u052a.\u037f()) {
            \u0457 \u04572 = this.\u052a;
            int n2 = this.\u0529.\u0797();
            char c2 = this.\u0529.\u0788();
            \u04572.add(new \u0845(n2, SOY.d("2F3C340E04121926341254141233231717031F20715151045D723818541E1422240254040E332513542C5F210C"), new Object[]{Character.valueOf(c2), \u0f622}));
        }
    }

    boolean \u0789() {
        boolean bl = this.\u0785 != null && this.\u0620.\u0790().equalsIgnoreCase(this.\u0785);
        return bl;
    }

    \u017f \u078a() {
        while (!this.\u052d) {
            this.\u052b.\u052f(this, this.\u0529);
        }
        StringBuilder stringBuilder = this.\u052f;
        if (stringBuilder.length() != 0) {
            String string = stringBuilder.toString();
            stringBuilder.delete(0, stringBuilder.length());
            this.\u052e = null;
            return this.\u0782.\u0784(string);
        }
        Object object = this.\u052e;
        if (object != null) {
            object = this.\u0782.\u0784((String)object);
            this.\u052e = null;
            return object;
        }
        this.\u052d = false;
        return this.\u052c;
    }

    void \u078b(\u0f62 \u0f622) {
        this.\u052b = \u0f622;
    }
}

