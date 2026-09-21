/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u02c9;
import com.github.catvod.spider.merge.\u0674;
import com.github.catvod.spider.merge.\u079c;
import com.github.catvod.spider.merge.\u079f;
import com.github.catvod.spider.merge.\u0861;
import com.github.catvod.spider.merge.\u0862;
import com.github.catvod.spider.merge.\u0866;
import com.github.catvod.spider.merge.\u0867;
import com.github.catvod.spider.merge.\u0868;
import com.github.catvod.spider.merge.\u086a;
import com.github.catvod.spider.merge.\u08a0;
import com.github.catvod.spider.merge.\u08a1;
import com.github.catvod.spider.merge.\u08a3;
import com.github.catvod.spider.merge.\u08a5;
import com.github.catvod.spider.merge.\u08aa;
import com.github.catvod.spider.merge.\u08b0;
import com.github.catvod.spider.merge.\u1028;
import com.github.catvod.spider.merge.\u1075;
import java.io.PrintStream;

public class \u0860
implements \u079c {
    protected boolean \u037f = false;
    protected int \u0528 = -1;
    protected \u0674 \u0529;
    protected \u0868 \u052a;
    protected int \u052b;

    @Override
    public \u08a3 \u037f(\u0867 object) {
        \u08a3 \u08a32 = this.\u078b((\u0867)object);
        if (\u08a32 != null) {
            ((\u0867)object).\u0787();
            return \u08a32;
        }
        if (this.\u078c((\u0867)object)) {
            return this.\u0782((\u0867)object);
        }
        object = this.\u052a == null ? new \u0862((\u0867)object) : new \u0862((\u0867)object, this.\u052b, this.\u052a);
        throw object;
    }

    @Override
    public void \u0528(\u0867 \u08672) {
        this.\u058f(\u08672);
    }

    @Override
    public void \u0529(\u0867 \u08672, \u086a object) {
        if (this.\u0528 == \u08672.\u0790().\u052d() && (object = this.\u0529) != null && ((\u0674)object).\u052e(\u08672.\u0780())) {
            \u08672.\u0787();
        }
        this.\u0528 = \u08672.\u0790().\u052d();
        if (this.\u0529 == null) {
            this.\u0529 = new \u0674(new int[0]);
        }
        this.\u0529.\u0529(\u08672.\u0780());
        this.\u052f(\u08672, this.\u0780(\u08672));
    }

    @Override
    public void \u052a(\u0867 \u08672) {
        this.\u058f(\u08672);
    }

    @Override
    public void \u052b(\u0867 \u08672, \u086a \u086a2) {
        if (this.\u052c(\u08672)) {
            return;
        }
        this.\u052e(\u08672);
        if (\u086a2 instanceof \u0866) {
            this.\u0789(\u08672, (\u0866)\u086a2);
        } else if (\u086a2 instanceof \u0862) {
            this.\u0787(\u08672, (\u0862)\u086a2);
        } else if (\u086a2 instanceof \u0861) {
            this.\u0786(\u08672, (\u0861)\u086a2);
        } else {
            PrintStream printStream = System.err;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(SOY.d("0F3C3A181B001472231317181D3C38021D181472340406180872250F04124072"));
            stringBuilder.append(\u086a2.getClass().getName());
            printStream.println(stringBuilder.toString());
            \u08672.\u0794(\u086a2.\u0529(), \u086a2.getMessage(), \u086a2);
        }
    }

    @Override
    public boolean \u052c(\u0867 \u08672) {
        return this.\u037f;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void \u052d(\u0867 \u08672) {
        \u08b0 \u08b02 = ((\u1028)\u08672.\u058f()).\u052a.\u037f.get(\u08672.\u0780());
        if (this.\u052c(\u08672)) {
            return;
        }
        int n2 = \u08672.\u0790().\u052c(1);
        \u0674 \u06742 = \u08672.\u052d().\u052c(\u08b02);
        if (\u06742.\u052e(n2)) {
            this.\u052a = null;
            this.\u052b = -1;
            return;
        }
        if (\u06742.\u052e(-2)) {
            if (this.\u052a != null) return;
            this.\u052a = \u08672.\u078d();
            this.\u052b = \u08672.\u0780();
            return;
        }
        n2 = \u08b02.\u052a();
        if (n2 != 3 && n2 != 4 && n2 != 5) {
            switch (n2) {
                default: {
                    return;
                }
                case 9: 
                case 11: {
                    this.\u078a(\u08672);
                    this.\u052f(\u08672, \u08672.\u078f().\u0781(this.\u0780(\u08672)));
                    return;
                }
                case 10: 
            }
        }
        if (this.\u078b(\u08672) == null) throw new \u0862(\u08672);
    }

    protected void \u052e(\u0867 \u08672) {
        this.\u037f = true;
    }

    protected void \u052f(\u0867 \u08672, \u0674 \u06742) {
        int n2 = \u08672.\u0790().\u052c(1);
        while (n2 != -1 && !\u06742.\u052e(n2)) {
            \u08672.\u0787();
            n2 = \u08672.\u0790().\u052c(1);
        }
    }

    protected void \u058f(\u0867 \u08672) {
        this.\u037f = false;
        this.\u0529 = null;
        this.\u0528 = -1;
    }

    protected String \u0620(String charSequence) {
        String string = ((String)charSequence).replace(SOY.d("70"), SOY.d("263C")).replace(SOY.d("77"), SOY.d("2620")).replace(SOY.d("73"), SOY.d("2626"));
        charSequence = new StringBuilder();
        String string2 = SOY.d("5D");
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append(string);
        ((StringBuilder)charSequence).append(string2);
        return ((StringBuilder)charSequence).toString();
    }

    protected \u0674 \u0780(\u0867 object) {
        int n2;
        \u08aa \u08aa2 = ((\u1028)((\u08a0)object).\u058f()).\u052a;
        object = ((\u0867)object).\u052e;
        \u0674 \u06742 = new \u0674(new int[0]);
        while (object != null && (n2 = ((\u08a1)object).\u0529) >= 0) {
            \u06742.\u052c(\u08aa2.\u052c(((\u1075)\u08aa2.\u037f.get((int)n2).\u052e((int)0)).\u052c));
            object = ((\u08a1)object).\u0528;
        }
        \u06742.\u0782(-2);
        return \u06742;
    }

    protected \u0674 \u0781(\u0867 \u08672) {
        return \u08672.\u078f();
    }

    protected \u08a3 \u0782(\u0867 \u08672) {
        \u08a3 \u08a32 = \u08672.\u078e();
        Object object = this.\u0781(\u08672);
        int n2 = !((\u0674)object).\u0528() ? ((\u0674)object).\u058f() : 0;
        if (n2 == -1) {
            object = SOY.d("463F3805071E143571333B3144");
        } else {
            object = new StringBuilder();
            ((StringBuilder)object).append(SOY.d("463F3805071E143571"));
            ((StringBuilder)object).append(\u08672.\u0781().\u0529(n2));
            ((StringBuilder)object).append(SOY.d("44"));
            object = ((StringBuilder)object).toString();
        }
        \u08a3 \u08a33 = \u08672.\u0790().\u052b(-1);
        \u08a3 \u08a34 = \u08a32;
        if (\u08a32.getType() == -1) {
            \u08a34 = \u08a32;
            if (\u08a33 != null) {
                \u08a34 = \u08a33;
            }
        }
        return \u08672.\u052a().\u037f(new \u02c9<\u08a5, \u079f>(\u08a34.\u052a(), \u08a34.\u052a().\u0528()), n2, (String)object, 0, -1, -1, \u08a34.\u0529(), \u08a34.\u037f());
    }

    protected String \u0783(\u08a3 \u08a32) {
        return \u08a32.\u0528();
    }

    protected int \u0784(\u08a3 \u08a32) {
        return \u08a32.getType();
    }

    protected String \u0785(\u08a3 \u08a32) {
        if (\u08a32 == null) {
            return SOY.d("463C3E56001811373F48");
        }
        String string = this.\u0783(\u08a32);
        CharSequence charSequence = string;
        if (string == null) {
            if (this.\u0784(\u08a32) == -1) {
                charSequence = SOY.d("46171E304A");
            } else {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(SOY.d("46"));
                ((StringBuilder)charSequence).append(this.\u0784(\u08a32));
                ((StringBuilder)charSequence).append(SOY.d("44"));
                charSequence = ((StringBuilder)charSequence).toString();
            }
        }
        return this.\u0620((String)charSequence);
    }

    protected void \u0786(\u0867 \u08672, \u0861 \u08612) {
        String string = \u08672.\u0620()[\u08672.\u052e.\u052e()];
        CharSequence charSequence = new StringBuilder();
        charSequence.append(SOY.d("08273D1354"));
        charSequence.append(string);
        charSequence.append(SOY.d("5A"));
        charSequence.append(\u08612.getMessage());
        charSequence = charSequence.toString();
        \u08672.\u0794(\u08612.\u0529(), (String)charSequence, \u08612);
    }

    protected void \u0787(\u0867 \u08672, \u0862 \u08622) {
        CharSequence charSequence = new StringBuilder();
        charSequence.append(SOY.d("173B221B1503193A3412541E1422240254"));
        charSequence.append(this.\u0785(\u08622.\u0529()));
        charSequence.append(SOY.d("5A37290611140E3B3F1154"));
        charSequence.append(\u08622.\u037f().\u0787(\u08672.\u0781()));
        charSequence = charSequence.toString();
        \u08672.\u0794(\u08622.\u0529(), (String)charSequence, \u08622);
    }

    protected void \u0788(\u0867 \u08672) {
        if (this.\u052c(\u08672)) {
            return;
        }
        this.\u052e(\u08672);
        \u08a3 \u08a32 = \u08672.\u078e();
        \u0674 \u06742 = this.\u0781(\u08672);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(SOY.d("173B22051D191D72"));
        stringBuilder.append(\u06742.\u0787(\u08672.\u0781()));
        stringBuilder.append(SOY.d("5A332556"));
        stringBuilder.append(this.\u0785(\u08a32));
        \u08672.\u0794(\u08a32, stringBuilder.toString(), null);
    }

    protected void \u0789(\u0867 \u08672, \u0866 \u08662) {
        Object object = \u08672.\u0790();
        object = object != null ? (\u08662.\u052c().getType() == -1 ? SOY.d("46171E304A") : object.\u0528(\u08662.\u052c(), \u08662.\u0529())) : SOY.d("46273F1D1A180D3C711F1A070F266F");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(SOY.d("143D71001D16183E3456151B0E37231815031324345615035A3B3F0601035A"));
        stringBuilder.append(this.\u0620((String)object));
        object = stringBuilder.toString();
        \u08672.\u0794(\u08662.\u0529(), (String)object, \u08662);
    }

    protected void \u078a(\u0867 \u08672) {
        if (this.\u052c(\u08672)) {
            return;
        }
        this.\u052e(\u08672);
        \u08a3 \u08a32 = \u08672.\u078e();
        String string = this.\u0785(\u08a32);
        \u0674 \u06742 = this.\u0781(\u08672);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(SOY.d("1F2A250415191F3D2405541E1422240254"));
        stringBuilder.append(string);
        stringBuilder.append(SOY.d("5A37290611140E3B3F1154"));
        stringBuilder.append(\u06742.\u0787(\u08672.\u0781()));
        \u08672.\u0794(\u08a32, stringBuilder.toString(), null);
    }

    protected \u08a3 \u078b(\u0867 \u08672) {
        int n2 = \u08672.\u0790().\u052c(2);
        if (this.\u0781(\u08672).\u052e(n2)) {
            this.\u078a(\u08672);
            \u08672.\u0787();
            \u08a3 \u08a32 = \u08672.\u078e();
            this.\u0528(\u08672);
            return \u08a32;
        }
        return null;
    }

    protected boolean \u078c(\u0867 \u08672) {
        int n2 = \u08672.\u0790().\u052c(1);
        \u08b0 \u08b02 = ((\u1028)\u08672.\u058f()).\u052a.\u037f.get((int)\u08672.\u0780()).\u052e((int)0).\u0529;
        if (((\u1028)\u08672.\u058f()).\u052a.\u052d(\u08b02, \u08672.\u052e).\u052e(n2)) {
            this.\u0788(\u08672);
            return true;
        }
        return false;
    }
}

