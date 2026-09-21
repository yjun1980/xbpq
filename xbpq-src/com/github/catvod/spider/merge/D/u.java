/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.y.d;
import java.io.IOException;
import java.lang.reflect.Type;
import java.sql.Clob;
import java.sql.SQLException;

public final class u
implements X {
    public static final u a = new u();

    /*
     * Unable to fully structure code
     */
    @Override
    public final void d(L var1_1, Object var2_4, Object var3_5, Type var4_6, int var5_7) {
        if (var2_4 != null) ** GOTO lbl5
        var1_1.w();
        return;
lbl5:
        // 1 sources

        var2_4 = ((Clob)var2_4).getCharacterStream();
        var3_5 = new StringBuilder();
        try {
            var4_6 = new char[2048];
            while (true) {
                if ((var5_7 = var2_4.read((char[])var4_6, 0, 2048)) >= 0) break block8;
                break;
            }
        }
        catch (Exception var1_2) {
            try {
                var2_4 = new d("read string from reader error", var1_2);
                throw var2_4;
            }
            catch (SQLException var1_3) {
                throw new IOException("write clob error", var1_3);
            }
        }
        {
            block8: {
                var3_5 = var3_5.toString();
                var2_4.close();
                var1_1.v((String)var3_5);
                return;
            }
            var3_5.append((char[])var4_6, 0, var5_7);
            continue;
        }
    }
}

