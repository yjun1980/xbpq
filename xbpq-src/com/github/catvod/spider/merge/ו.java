/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u0131;
import com.github.catvod.spider.merge.\u01c3;
import com.github.catvod.spider.merge.\u01d0;
import com.github.catvod.spider.merge.\u0456;
import com.github.catvod.spider.merge.\u04cf;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import java.util.HashMap;

public class \u05d5 {
    private static final char[] \u037f = new char[]{',', ';'};
    private static final HashMap<String, String> \u0528 = new HashMap();
    private static final \u01d0.\u037f \u0529 = new \u01d0.\u037f();

    private static void \u0528(Appendable appendable, \u052a object, int n2) {
        if (!"".equals(object = object.\u058f(n2))) {
            appendable.append('&').append((CharSequence)object).append(';');
        } else {
            appendable.append(SOY.d("5C7129")).append(Integer.toHexString(n2)).append(';');
        }
    }

    private static boolean \u0529(\u0528 \u0529, char c2, CharsetEncoder charsetEncoder) {
        int n2 = com.github.catvod.spider.merge.\u05d5$\u037f.\u037f[\u0529.ordinal()];
        boolean bl = true;
        if (n2 != 1) {
            if (n2 != 2) {
                return charsetEncoder.canEncode(c2);
            }
            return true;
        }
        if (c2 >= '\u0080') {
            bl = false;
        }
        return bl;
    }

    public static int \u052a(String string, int[] nArray) {
        String string2 = \u0528.get(string);
        if (string2 != null) {
            nArray[0] = string2.codePointAt(0);
            nArray[1] = string2.codePointAt(1);
            return 2;
        }
        int n2 = \u052a.\u0529.\u052f(string);
        if (n2 != -1) {
            nArray[0] = n2;
            return 1;
        }
        return 0;
    }

    static void \u052b(Appendable appendable, String string, \u01d0.\u037f \u03f3, boolean bl, boolean bl2, boolean bl3) {
        int n2;
        \u052a \u052b = \u03f3.\u052b();
        CharsetEncoder charsetEncoder = \u03f3.\u052a();
        \u0528 \u0529 = \u03f3.\u052a;
        int n3 = string.length();
        boolean bl4 = false;
        boolean bl5 = false;
        for (int i2 = 0; i2 < n3; i2 += Character.charCount(n2)) {
            boolean bl6;
            boolean bl7;
            block32: {
                block29: {
                    block30: {
                        block31: {
                            n2 = string.codePointAt(i2);
                            bl7 = bl4;
                            bl6 = bl5;
                            if (!bl2) break block29;
                            if (!\u0131.\u052f(n2)) break block30;
                            if (!bl3) break block31;
                            bl7 = bl4;
                            bl6 = bl5;
                            if (!bl4) break block32;
                        }
                        if (bl5) {
                            bl7 = bl4;
                            bl6 = bl5;
                        } else {
                            appendable.append(' ');
                            bl6 = true;
                            bl7 = bl4;
                        }
                        break block32;
                    }
                    bl7 = true;
                    bl6 = false;
                }
                if (n2 < 65536) {
                    char c2 = (char)n2;
                    if (c2 != '\"') {
                        if (c2 != '&') {
                            if (c2 != '<') {
                                if (c2 != '>') {
                                    if (c2 != '\u00a0') {
                                        if (\u05d5.\u0529(\u0529, c2, charsetEncoder)) {
                                            appendable.append(c2);
                                        } else {
                                            \u05d5.\u0528(appendable, \u052b, n2);
                                        }
                                    } else if (\u052b != \u052a.\u037f) {
                                        appendable.append(SOY.d("5C3C3305044C"));
                                    } else {
                                        appendable.append(SOY.d("5C712917444C"));
                                    }
                                } else if (!bl) {
                                    appendable.append(SOY.d("5C35254D"));
                                } else {
                                    appendable.append(c2);
                                }
                            } else if (bl && \u052b != \u052a.\u037f && \u03f3.\u058f() != \u01d0.\u037f.\u037f.\u0528) {
                                appendable.append(c2);
                            } else {
                                appendable.append(SOY.d("5C3E254D"));
                            }
                        } else {
                            appendable.append(SOY.d("5C333C064F"));
                        }
                    } else if (bl) {
                        appendable.append(SOY.d("5C232419004C"));
                    } else {
                        appendable.append(c2);
                    }
                } else {
                    String string2 = new String(Character.toChars(n2));
                    if (charsetEncoder.canEncode(string2)) {
                        appendable.append(string2);
                    } else {
                        \u05d5.\u0528(appendable, \u052b, n2);
                    }
                }
            }
            bl4 = bl7;
            bl5 = bl6;
        }
    }

    public static boolean \u052c(String string) {
        boolean bl = \u052a.\u0528.\u052f(string) != -1;
        return bl;
    }

    public static boolean \u052d(String string) {
        boolean bl = \u052a.\u0529.\u052f(string) != -1;
        return bl;
    }

    private static void \u052e(\u052a \u052b, String object, int n2) {
        \u052a.\u0528(\u052b, new String[n2]);
        \u052a.\u052a(\u052b, new int[n2]);
        \u052a.\u052c(\u052b, new int[n2]);
        \u052a.\u052e(\u052b, new String[n2]);
        object = new \u0456((String)object);
        boolean bl = false;
        int n3 = 0;
        while (!((\u0456)object).\u0789()) {
            String string = ((\u0456)object).\u0782('=');
            ((\u0456)object).\u037f();
            int n4 = Integer.parseInt(((\u0456)object).\u0784(\u037f), 36);
            int n5 = ((\u0456)object).\u0788();
            ((\u0456)object).\u037f();
            if (n5 == 44) {
                n5 = Integer.parseInt(((\u0456)object).\u0782(';'), 36);
                ((\u0456)object).\u037f();
            } else {
                n5 = -1;
            }
            int n6 = Integer.parseInt(((\u0456)object).\u0782('&'), 36);
            ((\u0456)object).\u037f();
            ((\u052a)\u052b).\u052b[n3] = string;
            ((\u052a)\u052b).\u052c[n3] = n4;
            ((\u052a)\u052b).\u052d[n6] = n4;
            ((\u052a)\u052b).\u052e[n6] = string;
            if (n5 != -1) {
                \u0528.put(string, new String(new int[]{n4, n5}, 0, 2));
            }
            ++n3;
        }
        if (n3 == n2) {
            bl = true;
        }
        \u01c3.\u052a(bl, SOY.d("2F3C340E041219263412541415273F0254181C723418001E0E3B3405541B1533351310"));
    }

    static final class \u0528
    extends Enum<\u0528> {
        public static final /* enum */ \u0528 \u037f;
        public static final /* enum */ \u0528 \u0528;
        public static final /* enum */ \u0528 \u0529;
        private static final \u0528[] \u052a;

        static {
            \u0528 \u0529;
            \u0528 \u05292;
            \u0528 \u05293;
            \u037f = \u05293 = new \u0528();
            \u0528 = \u05292 = new \u0528();
            com.github.catvod.spider.merge.\u05d5$\u0528.\u0529 = \u0529 = new \u0528();
            \u052a = new \u0528[]{\u05293, \u05292, \u0529};
        }

        static \u0528 \u037f(String string) {
            if (string.equals(SOY.d("2F017C372734331B"))) {
                return \u037f;
            }
            if (string.startsWith(SOY.d("2F06175B"))) {
                return \u0528;
            }
            return \u0529;
        }

        public static \u0528[] \u0528() {
            return (\u0528[])\u052a.clone();
        }
    }

    public static final class \u052a
    extends Enum<\u052a> {
        public static final /* enum */ \u052a \u037f;
        public static final /* enum */ \u052a \u0528;
        public static final /* enum */ \u052a \u0529;
        private static final \u052a[] \u052a;
        private String[] \u052b;
        private int[] \u052c;
        private int[] \u052d;
        private String[] \u052e;

        static {
            Object object = \u04cf.\u037f;
            object = new \u052a((String)object, 4);
            \u037f = object;
            Object object2 = \u04cf.\u0528;
            object2 = new \u052a((String)object2, 106);
            \u0528 = object2;
            Object object3 = \u04cf.\u0529;
            object3 = new \u052a((String)object3, 2125);
            \u0529 = object3;
            \u052a = new \u052a[]{object, object2, object3};
        }

        private \u052a(String string2, int n3) {
            \u05d5.\u052e(this, string2, n3);
        }

        public static \u052a[] values() {
            return (\u052a[])\u052a.clone();
        }

        static /* synthetic */ String[] \u0528(\u052a \u052b, String[] stringArray) {
            \u052b.\u052b = stringArray;
            return stringArray;
        }

        static /* synthetic */ int[] \u052a(\u052a \u052b, int[] nArray) {
            \u052b.\u052c = nArray;
            return nArray;
        }

        static /* synthetic */ int[] \u052c(\u052a \u052b, int[] nArray) {
            \u052b.\u052d = nArray;
            return nArray;
        }

        static /* synthetic */ String[] \u052e(\u052a \u052b, String[] stringArray) {
            \u052b.\u052e = stringArray;
            return stringArray;
        }

        public static \u052a \u0620(String string) {
            return Enum.valueOf(\u052a.class, string);
        }

        int \u052f(String string) {
            int n2 = Arrays.binarySearch(this.\u052b, string);
            n2 = n2 >= 0 ? this.\u052c[n2] : -1;
            return n2;
        }

        String \u058f(int n2) {
            int n3 = Arrays.binarySearch(this.\u052d, n2);
            if (n3 >= 0) {
                int n4;
                int[] nArray;
                Object object = this.\u052e;
                object = n3 < ((String[])object).length - 1 && (nArray = this.\u052d)[n4 = n3 + 1] == n2 ? object[n4] : object[n3];
                return object;
            }
            return "";
        }
    }
}

