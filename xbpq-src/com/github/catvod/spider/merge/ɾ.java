/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u0142;
import com.github.catvod.spider.merge.\u0582;
import com.github.catvod.spider.merge.\u0f6c;

public class \u027e {
    public static \u0142.\u037f \u037f(\u0142 \u01422, \u0582 \u05822) {
        Object object = \u05822;
        int n2 = 0;
        while (object != null) {
            Object object2;
            int n3;
            \u0582 \u05823;
            block19: {
                block18: {
                    \u0142.\u037f \u03f3 = \u01422.\u0528((\u0582)object, n2);
                    if (\u03f3 == \u0142.\u037f.\u052b) {
                        return \u03f3;
                    }
                    \u05823 = object;
                    n3 = n2;
                    object2 = \u03f3;
                    if (\u03f3 == \u0142.\u037f.\u037f) {
                        \u05823 = object;
                        n3 = n2++;
                        object2 = \u03f3;
                        if (object.\u052f() > 0) {
                            object = object.\u052e(0);
                            continue;
                        }
                    }
                    while (\u05823.\u0788() == null && n3 > 0) {
                        block17: {
                            block16: {
                                \u03f3 = \u0142.\u037f.\u037f;
                                if (object2 == \u03f3) break block16;
                                object = object2;
                                if (object2 != \u0142.\u037f.\u0528) break block17;
                            }
                            object2 = \u01422.\u037f(\u05823, n3);
                            object = object2;
                            if (object2 == \u0142.\u037f.\u052b) {
                                return object2;
                            }
                        }
                        \u0582 \u05824 = \u05823.\u0791();
                        --n3;
                        if (object == \u0142.\u037f.\u052a) {
                            \u05823.\u0794();
                        }
                        object2 = \u03f3;
                        \u05823 = \u05824;
                    }
                    if (object2 == \u0142.\u037f.\u037f) break block18;
                    object = object2;
                    if (object2 != \u0142.\u037f.\u0528) break block19;
                }
                object2 = \u01422.\u037f(\u05823, n3);
                object = object2;
                if (object2 == \u0142.\u037f.\u052b) {
                    return object2;
                }
            }
            if (\u05823 == \u05822) {
                return object;
            }
            object2 = \u05823.\u0788();
            if (object == \u0142.\u037f.\u052a) {
                \u05823.\u0794();
            }
            object = object2;
            n2 = n3;
        }
        return \u0142.\u037f.\u037f;
    }

    public static void \u0528(\u0f6c \u0f6c2, \u0582 \u05822) {
        \u0582 \u05823 = \u05822;
        int n2 = 0;
        while (\u05823 != null) {
            int n3;
            \u0582 \u05824 = \u05823.\u0791();
            \u0f6c2.\u0528(\u05823, n2);
            \u0582 \u05825 = \u05823;
            if (\u05824 != null) {
                \u05825 = \u05823;
                if (!\u05823.\u0786()) {
                    \u05825 = \u05824.\u052e(\u05823.\u079d());
                }
            }
            \u05823 = \u05825;
            if (\u05825.\u052f() > 0) {
                \u05823 = \u05825.\u052e(0);
                continue;
            }
            for (n3 = n2++; \u05823.\u0788() == null && n3 > 0; --n3) {
                \u0f6c2.\u037f(\u05823, n3);
                \u05823 = \u05823.\u0791();
            }
            \u0f6c2.\u037f(\u05823, n3);
            if (\u05823 == \u05822) break;
            \u05823 = \u05823.\u0788();
            n2 = n3;
        }
    }
}

