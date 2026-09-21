package com.github.catvod.spider.merge.c0;

import com.github.catvod.spider.merge.cYh;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class a implements Map.Entry<String, String>, Cloneable {
    private static final String[] f = {cYh.d("063C2D3E203C123C2D22342802352F"), cYh.d("0623383F34"), cYh.d("0625353E3135042532"), cYh.d("043824323C3F03"), cYh.d("043F2C21363913"), cYh.d("0335223D362802"), cYh.d("03352730223613"), cYh.d("0335273425"), cYh.d("0339323035360234"), cYh.d("013F333C393511312D38333B1335"), cYh.d("0F3925353234"), cYh.d("0E3E242323"), cYh.d("0E232C3027"), cYh.d("0E24243C2439082024"), cYh.d("0A252D253E2A0B35"), cYh.d("0A25353433"), cYh.d("093F2923323C"), cYh.d("093F333424331D35"), cYh.d("093F3239363E02"), cYh.d("093F37303B3303313534"), cYh.d("093F3623362A"), cYh.d("0820243F"), cYh.d("1535203538340B29"), cYh.d("153530243E280234"), cYh.d("1535373425290234"), cYh.d("1435203C3B3F1423"), cYh.d("14352D34342E0234"), cYh.d("143F332536380B35"), cYh.d("13223434242A023525"), cYh.d("132931343A2F14242C3023390F")};
    private String c;
    private String d;
    c e;

    public a(String str, String str2, c cVar) {
        com.github.catvod.spider.merge.N.a.k(str);
        String trim = str.trim();
        com.github.catvod.spider.merge.N.a.i(trim);
        this.c = trim;
        this.d = str2;
        this.e = cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean c(String str, String str2, g gVar) {
        if (gVar.g() != 1) {
            return false;
        }
        if (str2 != null) {
            if (!str2.isEmpty() && !str2.equalsIgnoreCase(str)) {
                return false;
            }
            if (!(Arrays.binarySearch(f, str) >= 0)) {
                return false;
            }
        }
        return true;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        String str = this.d;
        return str == null ? "" : str;
    }

    public final Object clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.c;
        if (str == null ? aVar.c != null : !str.equals(aVar.c)) {
            return false;
        }
        String str2 = this.d;
        String str3 = aVar.d;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    @Override // java.util.Map.Entry
    public final String getKey() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final String getValue() {
        String str = this.d;
        return str == null ? "" : str;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        String str = this.c;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final String setValue(String str) {
        String str2 = str;
        String str3 = this.d;
        c cVar = this.e;
        if (cVar != null) {
            str3 = cVar.j(this.c);
            int o = this.e.o(this.c);
            if (o != -1) {
                this.e.e[o] = str2;
            }
        }
        this.d = str2;
        return str3 == null ? "" : str3;
    }

    public final String toString() {
        StringBuilder a = com.github.catvod.spider.merge.b0.b.a();
        try {
            g s0 = new h().s0();
            String str = this.c;
            String str2 = this.d;
            a.append((CharSequence) str);
            if (!c(str, str2, s0)) {
                a.append((CharSequence) cYh.d("5A72"));
                if (str2 == null) {
                    str2 = "";
                }
                n.d(a, str2, s0, true, false, false);
                a.append('\"');
            }
            return com.github.catvod.spider.merge.b0.b.g(a);
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.Z.a(e);
        }
    }
}
