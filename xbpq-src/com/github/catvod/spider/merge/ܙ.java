/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u012d;
import com.github.catvod.spider.merge.\u0131;
import com.github.catvod.spider.merge.\u01c3;
import com.github.catvod.spider.merge.\u020b;
import com.github.catvod.spider.merge.\u027f;
import com.github.catvod.spider.merge.\u0393;
import com.github.catvod.spider.merge.\u06e6;
import com.github.catvod.spider.merge.\u0f44;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class \u0719 {
    private static final String[] \u037f = new String[]{SOY.d("56"), SOY.d("44"), SOY.d("51"), SOY.d("04"), SOY.d("5A")};
    private static final String[] \u0528 = new String[]{SOY.d("47"), SOY.d("5B6F"), SOY.d("246F"), SOY.d("5E6F"), SOY.d("506F"), SOY.d("046F")};
    private static final Pattern \u0529 = Pattern.compile(SOY.d("527A0A5D592A536D792A105C536D78185C2B0978792D5F5A277B6E2A075D26367A5F4B"), 2);
    private static final Pattern \u052a = Pattern.compile(SOY.d("52097A5B295E457A0D125F5E"));
    private final \u0f44 \u052b;
    private final String \u052c;
    private final List<\u020b> \u052d = new ArrayList<\u020b>();

    private \u0719(String string) {
        \u01c3.\u052d(string);
        this.\u052c = string = string.trim();
        this.\u052b = new \u0f44(string);
    }

    private void \u037f() {
        this.\u052d.add(new \u020b.\u037f());
    }

    private void \u0528() {
        String string;
        Object object;
        block12: {
            block6: {
                block11: {
                    block10: {
                        block9: {
                            block8: {
                                block7: {
                                    block5: {
                                        object = new \u0f44(this.\u052b.\u037f('[', ']'));
                                        string = ((\u0f44)object).\u052e(\u0528);
                                        \u01c3.\u052d(string);
                                        ((\u0f44)object).\u052f();
                                        if (!((\u0f44)object).\u058f()) break block5;
                                        if (string.startsWith(SOY.d("24"))) {
                                            this.\u052d.add(new \u020b.\u052c(string.substring(1)));
                                        } else {
                                            this.\u052d.add(new \u020b.\u0528(string));
                                        }
                                        break block6;
                                    }
                                    if (!((\u0f44)object).\u0620(SOY.d("47"))) break block7;
                                    this.\u052d.add(new \u020b.\u052e(string, ((\u0f44)object).\u0785()));
                                    break block6;
                                }
                                if (!((\u0f44)object).\u0620(SOY.d("5B6F"))) break block8;
                                this.\u052d.add(new \u020b.\u0781(string, ((\u0f44)object).\u0785()));
                                break block6;
                            }
                            if (!((\u0f44)object).\u0620(SOY.d("246F"))) break block9;
                            this.\u052d.add(new \u020b.\u0782(string, ((\u0f44)object).\u0785()));
                            break block6;
                        }
                        if (!((\u0f44)object).\u0620(SOY.d("5E6F"))) break block10;
                        this.\u052d.add(new \u020b.\u0620(string, ((\u0f44)object).\u0785()));
                        break block6;
                    }
                    if (!((\u0f44)object).\u0620(SOY.d("506F"))) break block11;
                    this.\u052d.add(new \u020b.\u058f(string, ((\u0f44)object).\u0785()));
                    break block6;
                }
                if (!((\u0f44)object).\u0620(SOY.d("046F"))) break block12;
                this.\u052d.add(new \u020b.\u0780(string, Pattern.compile(((\u0f44)object).\u0785())));
            }
            return;
        }
        string = this.\u052c;
        object = ((\u0f44)object).\u0785();
        throw new \u0393.\u037f(SOY.d("393D241A1057143D255604160821345615030E20381401031F722003110503727653075040722418110F0A37320211135A263E1D11195A33255653520975"), string, object);
    }

    private void \u0529() {
        String string = this.\u052b.\u052b();
        \u01c3.\u052d(string);
        this.\u052d.add(new \u020b.\u0783(string.trim()));
    }

    private void \u052a() {
        String string = this.\u052b.\u052b();
        \u01c3.\u052d(string);
        this.\u052d.add(new \u020b.\u0788(string));
    }

    private void \u052b() {
        String string = \u06e6.\u0528(this.\u052b.\u052c());
        \u01c3.\u052d(string);
        String string2 = SOY.d("502E");
        boolean bl = string.startsWith(string2);
        String string3 = SOY.d("40");
        if (bl) {
            this.\u052d.add(new \u012d.\u0528(new \u020b.\u079c(string), new \u020b.\u079d(string.replace(string2, string3))));
        } else {
            String string4 = SOY.d("06");
            string2 = string;
            if (string.contains(string4)) {
                string2 = string.replace(string4, string3);
            }
            this.\u052d.add(new \u020b.\u079c(string2));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void \u052c(char c2) {
        boolean bl;
        Object object;
        \u020b \u020b2;
        block8: {
            \u020b \u020b3;
            block12: {
                block13: {
                    block11: {
                        block10: {
                            block9: {
                                this.\u052b.\u052f();
                                \u020b3 = \u0719.\u0788(this.\u052e());
                                if (this.\u052d.size() != 1) break block9;
                                \u020b2 = this.\u052d.get(0);
                                object = \u020b2;
                                if (!(\u020b2 instanceof \u012d.\u0528)) break block10;
                                object = \u020b2;
                                if (c2 == ',') break block10;
                                object = ((\u012d.\u0528)\u020b2).\u0529();
                                bl = true;
                                break block11;
                            }
                            object = new \u012d.\u037f(this.\u052d);
                        }
                        \u020b2 = object;
                        bl = false;
                    }
                    this.\u052d.clear();
                    if (c2 == ' ') break block12;
                    if (c2 == '>') break block13;
                    if (c2 != '~') {
                        if (c2 != '+') {
                            if (c2 != ',') {
                                object = new StringBuilder();
                                ((StringBuilder)object).append(SOY.d("2F3C3A181B00147232191915133C30021B054072"));
                                ((StringBuilder)object).append(c2);
                                throw new \u0393.\u037f(((StringBuilder)object).toString(), new Object[0]);
                            }
                            if (object instanceof \u012d.\u0528) {
                                object = (\u012d.\u0528)object;
                            } else {
                                \u012d.\u0528 \u0529 = new \u012d.\u0528();
                                \u0529.\u052b((\u020b)object);
                                object = \u0529;
                            }
                            ((\u012d.\u0528)object).\u052b(\u020b3);
                            break block8;
                        } else {
                            object = new \u012d.\u037f(new \u027f.\u052a((\u020b)object), \u020b3);
                        }
                        break block8;
                    } else {
                        object = new \u012d.\u037f(new \u027f.\u058f((\u020b)object), \u020b3);
                    }
                    break block8;
                }
                object = new \u012d.\u037f(new \u027f.\u0528((\u020b)object), \u020b3);
                break block8;
            }
            object = new \u012d.\u037f(new \u027f.\u052e((\u020b)object), \u020b3);
        }
        if (bl) {
            ((\u012d.\u0528)\u020b2).\u0528((\u020b)object);
            object = \u020b2;
        }
        this.\u052d.add((\u020b)object);
    }

    private int \u052d() {
        String string = this.\u052b.\u0528(SOY.d("53")).trim();
        \u01c3.\u052a(\u0131.\u052e(string), SOY.d("333C35130C571727220254151F723F031912083B32"));
        return Integer.parseInt(string);
    }

    private String \u052e() {
        StringBuilder stringBuilder = \u0131.\u0528();
        while (!this.\u052b.\u058f()) {
            Object object = this.\u052b;
            Object object2 = SOY.d("52");
            if (((\u0f44)object).\u0780((String)object2)) {
                stringBuilder.append((String)object2);
                stringBuilder.append(this.\u052b.\u037f('(', ')'));
                stringBuilder.append(SOY.d("53"));
                continue;
            }
            object2 = this.\u052b;
            object = SOY.d("21");
            if (((\u0f44)object2).\u0780((String)object)) {
                stringBuilder.append((String)object);
                stringBuilder.append(this.\u052b.\u037f('[', ']'));
                stringBuilder.append(SOY.d("27"));
                continue;
            }
            if (this.\u052b.\u0782(\u037f)) break;
            stringBuilder.append(this.\u052b.\u0529());
        }
        return \u0131.\u0781(stringBuilder);
    }

    private void \u052f(boolean bl) {
        \u0f44 \u0f442 = this.\u052b;
        String string = bl ? SOY.d("40313E180016133C22390319") : SOY.d("40313E180016133C22");
        \u0f442.\u052a(string);
        string = \u0f44.\u0787(this.\u052b.\u037f('(', ')'));
        \u01c3.\u052e(string, SOY.d("40313E180016133C225E00120226785605021F2028561902092671181B035A303456111A0A2628"));
        if (bl) {
            this.\u052d.add(new \u020b.\u0785(string));
        } else {
            this.\u052d.add(new \u020b.\u0786(string));
        }
    }

    private void \u058f() {
        this.\u052b.\u052a(SOY.d("40313E180016133C223215031B"));
        String string = \u0f44.\u0787(this.\u052b.\u037f('(', ')'));
        \u01c3.\u052e(string, SOY.d("40313E180016133C223215031B7A25130C0353722003110503723C0307035A3C3E0254151F72341B040303"));
        this.\u052d.add(new \u020b.\u0784(string));
    }

    private void \u0620(boolean bl, boolean bl2) {
        String string;
        block15: {
            int n2;
            int n3;
            block12: {
                String string2;
                Matcher matcher;
                block14: {
                    boolean bl3;
                    Matcher matcher2;
                    block13: {
                        int n4;
                        block11: {
                            string = \u06e6.\u0528(this.\u052b.\u0528(SOY.d("53")));
                            matcher2 = \u0529.matcher(string);
                            matcher = \u052a.matcher(string);
                            bl3 = SOY.d("153635").equals(string);
                            n3 = 2;
                            n4 = 0;
                            n2 = 0;
                            if (!bl3) break block11;
                            n2 = 1;
                            break block12;
                        }
                        if (!SOY.d("1F243418").equals(string)) break block13;
                        n2 = n4;
                        break block12;
                    }
                    bl3 = matcher2.matches();
                    string2 = SOY.d("240E7A");
                    if (!bl3) break block14;
                    n3 = matcher2.group(3) != null ? Integer.parseInt(matcher2.group(1).replaceFirst(string2, "")) : 1;
                    if (matcher2.group(4) != null) {
                        n2 = Integer.parseInt(matcher2.group(4).replaceFirst(string2, ""));
                    }
                    break block12;
                }
                if (!matcher.matches()) break block15;
                n2 = Integer.parseInt(matcher.group().replaceFirst(string2, ""));
                n3 = 0;
            }
            if (bl2) {
                if (bl) {
                    this.\u052d.add(new \u020b.\u0794(n3, n2));
                } else {
                    this.\u052d.add(new \u020b.\u0795(n3, n2));
                }
            } else if (bl) {
                this.\u052d.add(new \u020b.\u0793(n3, n2));
            } else {
                this.\u052d.add(new \u020b.\u0792(n3, n2));
            }
            return;
        }
        throw new \u0393.\u037f(SOY.d("393D241A1057143D25560416082134561A03127F3818101202727653075040722418110F0A37320211135A343E0419160E"), string);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void \u0780() {
        if (this.\u052b.\u0620(SOY.d("59"))) {
            this.\u052a();
            return;
        }
        if (this.\u052b.\u0620(SOY.d("54"))) {
            this.\u0529();
            return;
        }
        if (!this.\u052b.\u0784() && !this.\u052b.\u0780(SOY.d("502E"))) {
            if (this.\u052b.\u0780(SOY.d("21"))) {
                this.\u0528();
                return;
            }
            if (this.\u052b.\u0620(SOY.d("50"))) {
                this.\u037f();
                return;
            }
            if (this.\u052b.\u0620(SOY.d("403E255E"))) {
                this.\u0784();
                return;
            }
            if (this.\u052b.\u0620(SOY.d("4035255E"))) {
                this.\u0783();
                return;
            }
            if (this.\u052b.\u0620(SOY.d("4037205E"))) {
                this.\u0782();
                return;
            }
            if (this.\u052b.\u0780(SOY.d("403A30055C"))) {
                this.\u0781();
                return;
            }
            if (this.\u052b.\u0780(SOY.d("40313E180016133C225E"))) {
                this.\u052f(false);
                return;
            }
            if (this.\u052b.\u0780(SOY.d("40313E180016133C2239031952"))) {
                this.\u052f(true);
                return;
            }
            if (this.\u052b.\u0780(SOY.d("40313E180016133C223215031B7A"))) {
                this.\u058f();
                return;
            }
            if (this.\u052b.\u0780(SOY.d("403F3002171F1F2179"))) {
                this.\u0785(false);
                return;
            }
            if (this.\u052b.\u0780(SOY.d("403F3002171F1F211E011A5F"))) {
                this.\u0785(true);
                return;
            }
            if (this.\u052b.\u0780(SOY.d("403C3E025C"))) {
                this.\u0786();
                return;
            }
            if (this.\u052b.\u0620(SOY.d("403C251E5914123B3D125C"))) {
                this.\u0620(false, false);
                return;
            }
            if (this.\u052b.\u0620(SOY.d("403C251E591B1B21255B171F133E355E"))) {
                this.\u0620(true, false);
                return;
            }
            if (this.\u052b.\u0620(SOY.d("403C251E59181C7F250F041252"))) {
                this.\u0620(false, true);
                return;
            }
            if (this.\u052b.\u0620(SOY.d("403C251E591B1B21255B1B1157262806115F"))) {
                this.\u0620(true, true);
                return;
            }
            if (this.\u052b.\u0620(SOY.d("4034380407035731391F1813"))) {
                this.\u052d.add(new \u020b.\u078e());
                return;
            }
            if (this.\u052b.\u0620(SOY.d("403E3005005A193A381A10"))) {
                this.\u052d.add(new \u020b.\u0790());
                return;
            }
            if (this.\u052b.\u0620(SOY.d("403438040703573D375B000E0A37"))) {
                this.\u052d.add(new \u020b.\u078f());
                return;
            }
            if (this.\u052b.\u0620(SOY.d("403E3005005A15347C020D071F"))) {
                this.\u052d.add(new \u020b.\u0791());
                return;
            }
            if (this.\u052b.\u0620(SOY.d("403D3F1A0D5A193A381A10"))) {
                this.\u052d.add(new \u020b.\u0796());
                return;
            }
            if (this.\u052b.\u0620(SOY.d("403D3F1A0D5A15347C020D071F"))) {
                this.\u052d.add(new \u020b.\u0797());
                return;
            }
            if (this.\u052b.\u0620(SOY.d("40373C06000E"))) {
                this.\u052d.add(new \u020b.\u078d());
                return;
            }
            if (this.\u052b.\u0620(SOY.d("40203E1900"))) {
                this.\u052d.add(new \u020b.\u0798());
                return;
            }
            if (this.\u052b.\u0620(SOY.d("403F3002171F2E372902"))) {
                this.\u052d.add(new \u020b.\u0799());
                return;
            }
            String string = this.\u052c;
            String string2 = this.\u052b.\u0785();
            throw new \u0393.\u037f(SOY.d("393D241A1057143D255604160821345605021F202856535209756B5601191F2A211317031F3671021B1C1F3C711700575D772251"), string, string2);
        }
        this.\u052b();
    }

    private void \u0781() {
        this.\u052b.\u052a(SOY.d("403A3005"));
        String string = this.\u052b.\u037f('(', ')');
        \u01c3.\u052e(string, SOY.d("403A30055C12167B7105011509373D1317035A3F24050057143D255616125A373C06000E"));
        this.\u052d.add(new \u027f.\u037f(\u0719.\u0788(string)));
    }

    private void \u0782() {
        this.\u052d.add(new \u020b.\u0789(this.\u052d()));
    }

    private void \u0783() {
        this.\u052d.add(new \u020b.\u078b(this.\u052d()));
    }

    private void \u0784() {
        this.\u052d.add(new \u020b.\u078c(this.\u052d()));
    }

    private void \u0785(boolean bl) {
        \u0f44 \u0f442 = this.\u052b;
        String string = bl ? SOY.d("403F3002171F1F211E011A") : SOY.d("403F3002171F1F21");
        \u0f442.\u052a(string);
        string = this.\u052b.\u037f('(', ')');
        \u01c3.\u052e(string, SOY.d("403F3002171F1F21790411101F2A785605021F2028561902092671181B035A303456111A0A2628"));
        if (bl) {
            this.\u052d.add(new \u020b.\u079b(Pattern.compile(string)));
        } else {
            this.\u052d.add(new \u020b.\u079a(Pattern.compile(string)));
        }
    }

    private void \u0786() {
        this.\u052b.\u052a(SOY.d("403C3E02"));
        String string = this.\u052b.\u037f('(', ')');
        \u01c3.\u052e(string, SOY.d("403C3E025C041F3E34150018087B7105011509373D1317035A3F24050057143D255616125A373C06000E"));
        this.\u052d.add(new \u027f.\u052c(\u0719.\u0788(string)));
    }

    public static \u020b \u0788(String object) {
        try {
            \u0719 \u07192 = new \u0719((String)object);
            object = \u07192.\u0787();
            return object;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new \u0393.\u037f(illegalArgumentException.getMessage(), new Object[0]);
        }
    }

    public String toString() {
        return this.\u052c;
    }

    \u020b \u0787() {
        this.\u052b.\u052f();
        if (this.\u052b.\u0782(\u037f)) {
            this.\u052d.add(new \u027f.\u0620());
            this.\u052c(this.\u052b.\u0529());
        } else {
            this.\u0780();
        }
        while (!this.\u052b.\u058f()) {
            boolean bl = this.\u052b.\u052f();
            if (this.\u052b.\u0782(\u037f)) {
                this.\u052c(this.\u052b.\u0529());
                continue;
            }
            if (bl) {
                this.\u052c(' ');
                continue;
            }
            this.\u0780();
        }
        if (this.\u052d.size() == 1) {
            return this.\u052d.get(0);
        }
        return new \u012d.\u037f(this.\u052d);
    }
}

