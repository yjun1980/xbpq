package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.cYh;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.github.catvod.spider.merge.n.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class EnumC0191A implements Executor {
    public static final EnumC0191A c;
    private static final /* synthetic */ EnumC0191A[] d;

    static {
        EnumC0191A enumC0191A = new EnumC0191A();
        c = enumC0191A;
        d = new EnumC0191A[]{enumC0191A};
    }

    private EnumC0191A() {
        cYh.d("2E1E120516142415");
    }

    public static EnumC0191A valueOf(String str) {
        return (EnumC0191A) Enum.valueOf(EnumC0191A.class, str);
    }

    public static EnumC0191A[] values() {
        return (EnumC0191A[]) d.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return cYh.d("2A3F33341222023334253828147E2538253F04240429323912242E237F73");
    }
}
