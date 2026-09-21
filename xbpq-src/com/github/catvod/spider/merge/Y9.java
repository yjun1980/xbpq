/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.WI;
import com.github.catvod.spider.merge.g9;
import com.github.catvod.spider.merge.kJ;
import com.github.catvod.spider.merge.tv;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import java.util.HashMap;

public class Y9 {
    private static final HashMap<String, String> S;
    private static final g9.aA T4;
    private static final char[] l8;

    static {
        l8 = new char[]{',', ';'};
        S = new HashMap();
        T4 = new g9.aA();
    }

    private static void N(Y y2, String object, int n2) {
        Y.S(y2, new String[n2]);
        Y.b(y2, new int[n2]);
        Y.l(y2, new int[n2]);
        Y.N(y2, new String[n2]);
        object = new kJ((String)object);
        boolean bl = false;
        int n3 = 0;
        while (!((kJ)object).Q()) {
            String string = ((kJ)object).s('=');
            ((kJ)object).l8();
            int n4 = Integer.parseInt(((kJ)object).Kf(l8), 36);
            int n5 = ((kJ)object).eD();
            ((kJ)object).l8();
            if (n5 == 44) {
                n5 = Integer.parseInt(((kJ)object).s(';'), 36);
                ((kJ)object).l8();
            } else {
                n5 = -1;
            }
            int n6 = Integer.parseInt(((kJ)object).s('&'), 36);
            ((kJ)object).l8();
            ((Y)y2).OL[n3] = string;
            ((Y)y2).l[n3] = n4;
            ((Y)y2).tT[n6] = n4;
            ((Y)y2).N[n6] = string;
            if (n5 != -1) {
                S.put(string, new String(new int[]{n4, n5}, 0, 2));
            }
            ++n3;
        }
        if (n3 == n2) {
            bl = true;
        }
        Rc.b(bl, "Unexpected count of entities loaded");
    }

    static void OL(Appendable appendable, String string, g9.aA aA2, boolean bl, boolean bl2, boolean bl3) {
        int n2;
        Y y2 = aA2.OL();
        CharsetEncoder charsetEncoder = aA2.b();
        ut ut2 = aA2.b;
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
                            if (!tv.HM(n2)) break block30;
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
                                        if (Y9.T4(ut2, c2, charsetEncoder)) {
                                            appendable.append(c2);
                                        } else {
                                            Y9.S(appendable, y2, n2);
                                        }
                                    } else if (y2 != Y.l8) {
                                        appendable.append("&nbsp;");
                                    } else {
                                        appendable.append("&#xa0;");
                                    }
                                } else if (!bl) {
                                    appendable.append("&gt;");
                                } else {
                                    appendable.append(c2);
                                }
                            } else if (bl && y2 != Y.l8 && aA2.n() != g9.aA.aA.S) {
                                appendable.append(c2);
                            } else {
                                appendable.append("&lt;");
                            }
                        } else {
                            appendable.append("&amp;");
                        }
                    } else if (bl) {
                        appendable.append("&quot;");
                    } else {
                        appendable.append(c2);
                    }
                } else {
                    String string2 = new String(Character.toChars(n2));
                    if (charsetEncoder.canEncode(string2)) {
                        appendable.append(string2);
                    } else {
                        Y9.S(appendable, y2, n2);
                    }
                }
            }
            bl4 = bl7;
            bl5 = bl6;
        }
    }

    private static void S(Appendable appendable, Y object, int n2) {
        if (!"".equals(object = object.n(n2))) {
            appendable.append('&').append((CharSequence)object).append(';');
        } else {
            appendable.append("&#x").append(Integer.toHexString(n2)).append(';');
        }
    }

    private static boolean T4(ut ut2, char c2, CharsetEncoder charsetEncoder) {
        int n2 = aA.l8[ut2.ordinal()];
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

    public static int b(String string, int[] nArray) {
        String string2 = S.get(string);
        if (string2 != null) {
            nArray[0] = string2.codePointAt(0);
            nArray[1] = string2.codePointAt(1);
            return 2;
        }
        int n2 = Y.T4.HM(string);
        if (n2 != -1) {
            nArray[0] = n2;
            return 1;
        }
        return 0;
    }

    public static boolean l(String string) {
        boolean bl = Y.S.HM(string) != -1;
        return bl;
    }

    public static boolean tT(String string) {
        boolean bl = Y.T4.HM(string) != -1;
        return bl;
    }

    public static final class Y
    extends Enum<Y> {
        public static final /* enum */ Y S;
        public static final /* enum */ Y T4;
        private static final Y[] b;
        public static final /* enum */ Y l8;
        private String[] N;
        private String[] OL;
        private int[] l;
        private int[] tT;

        static {
            Y y2;
            Y y3;
            Y y4;
            l8 = y4 = new Y(WI.l8, 4);
            S = y3 = new Y(WI.S, 106);
            T4 = y2 = new Y(WI.T4, 2125);
            b = new Y[]{y4, y3, y2};
        }

        private Y(String string2, int n3) {
            Y9.N(this, string2, n3);
        }

        static /* synthetic */ String[] N(Y y2, String[] stringArray) {
            y2.N = stringArray;
            return stringArray;
        }

        static /* synthetic */ String[] S(Y y2, String[] stringArray) {
            y2.OL = stringArray;
            return stringArray;
        }

        static /* synthetic */ int[] b(Y y2, int[] nArray) {
            y2.l = nArray;
            return nArray;
        }

        static /* synthetic */ int[] l(Y y2, int[] nArray) {
            y2.tT = nArray;
            return nArray;
        }

        public static Y v(String string) {
            return Enum.valueOf(Y.class, string);
        }

        public static Y[] values() {
            return (Y[])b.clone();
        }

        int HM(String string) {
            int n2 = Arrays.binarySearch(this.OL, string);
            n2 = n2 >= 0 ? this.l[n2] : -1;
            return n2;
        }

        String n(int n2) {
            int n3 = Arrays.binarySearch(this.tT, n2);
            if (n3 >= 0) {
                int n4;
                Object object;
                String[] stringArray = this.N;
                object = n3 < stringArray.length - 1 && (object = this.tT)[n4 = n3 + 1] == n2 ? (Object)stringArray[n4] : (Object)stringArray[n3];
                return object;
            }
            return "";
        }
    }

    static final class ut
    extends Enum<ut> {
        public static final /* enum */ ut S;
        public static final /* enum */ ut T4;
        private static final ut[] b;
        public static final /* enum */ ut l8;

        static {
            ut ut2;
            ut ut3;
            ut ut4;
            l8 = ut4 = new ut();
            S = ut3 = new ut();
            T4 = ut2 = new ut();
            b = new ut[]{ut4, ut3, ut2};
        }

        public static ut[] S() {
            return (ut[])b.clone();
        }

        static ut l8(String string) {
            if (string.equals("US-ASCII")) {
                return l8;
            }
            if (string.startsWith("UTF-")) {
                return S;
            }
            return T4;
        }
    }
}

