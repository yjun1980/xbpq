/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.c0;

import com.github.catvod.spider.merge.b0.b;
import com.github.catvod.spider.merge.c0.c;
import com.github.catvod.spider.merge.c0.g;
import com.github.catvod.spider.merge.c0.h;
import com.github.catvod.spider.merge.c0.n;
import com.github.catvod.spider.merge.cYh;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

public final class a
implements Map.Entry<String, String>,
Cloneable {
    private static final String[] f = new String[]{cYh.d("063C2D3E203C123C2D22342802352F"), cYh.d("0623383F34"), cYh.d("0625353E3135042532"), cYh.d("043824323C3F03"), cYh.d("043F2C21363913"), cYh.d("0335223D362802"), cYh.d("03352730223613"), cYh.d("0335273425"), cYh.d("0339323035360234"), cYh.d("013F333C393511312D38333B1335"), cYh.d("0F3925353234"), cYh.d("0E3E242323"), cYh.d("0E232C3027"), cYh.d("0E24243C2439082024"), cYh.d("0A252D253E2A0B35"), cYh.d("0A25353433"), cYh.d("093F2923323C"), cYh.d("093F333424331D35"), cYh.d("093F3239363E02"), cYh.d("093F37303B3303313534"), cYh.d("093F3623362A"), cYh.d("0820243F"), cYh.d("1535203538340B29"), cYh.d("153530243E280234"), cYh.d("1535373425290234"), cYh.d("1435203C3B3F1423"), cYh.d("14352D34342E0234"), cYh.d("143F332536380B35"), cYh.d("13223434242A023525"), cYh.d("132931343A2F14242C3023390F")};
    private String c;
    private String d;
    c e;

    public a(String string, String string2, c c2) {
        com.github.catvod.spider.merge.N.a.k(string);
        string = string.trim();
        com.github.catvod.spider.merge.N.a.i(string);
        this.c = string;
        this.d = string2;
        this.e = c2;
    }

    protected static boolean c(String string, String string2, g g2) {
        boolean bl;
        block2: {
            block3: {
                boolean bl2;
                int n2;
                block4: {
                    n2 = g2.g();
                    bl = bl2 = false;
                    if (n2 != 1) break block2;
                    if (string2 == null) break block3;
                    if (string2.isEmpty()) break block4;
                    bl = bl2;
                    if (!string2.equalsIgnoreCase(string)) break block2;
                }
                n2 = Arrays.binarySearch(f, string) >= 0 ? 1 : 0;
                bl = bl2;
                if (n2 == 0) break block2;
            }
            bl = true;
        }
        return bl;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        String string;
        String string2 = string = this.d;
        if (string == null) {
            string2 = "";
        }
        return string2;
    }

    public final Object clone() {
        try {
            a a2 = (a)super.clone();
            return a2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
    }

    @Override
    public final boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (object != null && a.class == object.getClass()) {
            Object object2 = (a)object;
            object = this.c;
            if (object != null ? !((String)object).equals(((a)object2).c) : ((a)object2).c != null) {
                return false;
            }
            object = this.d;
            object2 = ((a)object2).d;
            if (object != null) {
                bl = ((String)object).equals(object2);
            } else if (object2 != null) {
                bl = false;
            }
            return bl;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.c;
    }

    @Override
    public final Object getValue() {
        String string;
        String string2 = string = this.d;
        if (string == null) {
            string2 = "";
        }
        return string2;
    }

    @Override
    public final int hashCode() {
        String string = this.c;
        int n2 = 0;
        int n3 = string != null ? string.hashCode() : 0;
        string = this.d;
        if (string != null) {
            n2 = string.hashCode();
        }
        return n3 * 31 + n2;
    }

    @Override
    public final Object setValue(Object object) {
        String string = (String)object;
        object = this.d;
        Object object2 = this.e;
        if (object2 != null) {
            object2 = ((c)object2).j(this.c);
            int n2 = this.e.o(this.c);
            object = object2;
            if (n2 != -1) {
                this.e.e[n2] = string;
                object = object2;
            }
        }
        this.d = string;
        object2 = object;
        if (object == null) {
            object2 = "";
        }
        return object2;
    }

    public final String toString() {
        StringBuilder stringBuilder;
        block3: {
            g g2;
            Object object;
            block4: {
                stringBuilder = b.a();
                try {
                    object = new h();
                    g2 = ((h)object).s0();
                    object = this.c;
                    String string = this.d;
                    stringBuilder.append((CharSequence)object);
                    if (a.c((String)object, string, g2)) break block3;
                    stringBuilder.append((CharSequence)cYh.d("5A72"));
                    object = string;
                    if (string != null) break block4;
                    object = "";
                }
                catch (IOException iOException) {
                    throw new com.github.catvod.spider.merge.Z.a(iOException);
                }
            }
            n.d(stringBuilder, (String)object, g2, true, false, false);
            stringBuilder.append('\"');
        }
        return b.g(stringBuilder);
    }
}

