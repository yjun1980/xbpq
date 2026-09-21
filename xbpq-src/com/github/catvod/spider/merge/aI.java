/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.C4;
import com.github.catvod.spider.merge.Iw;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.fZ;
import com.github.catvod.spider.merge.i3;
import com.github.catvod.spider.merge.jk;
import javax.annotation.Nullable;

public class aI {
    public static jk S(i3 i32, Iw iw) {
        Rc.HM(i32);
        Rc.HM(iw);
        return fZ.l8(i32, iw);
    }

    @Nullable
    public static Iw T4(String string, Iw iw) {
        Rc.tT(string);
        return fZ.S(C4.eD(string), iw);
    }

    public static jk l8(String string, Iw iw) {
        Rc.tT(string);
        return aI.S(C4.eD(string), iw);
    }

    public static class aA
    extends IllegalStateException {
        public aA(String string, Object ... objectArray) {
            super(String.format(string, objectArray));
        }
    }
}

