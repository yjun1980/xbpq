/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.ai;

import com.github.catvod.spider.merge.ai.c;
import com.github.catvod.spider.merge.ai.i;
import com.github.catvod.spider.merge.nIe;
import java.io.RandomAccessFile;
import java.util.zip.ZipException;

final class d {
    static i a(RandomAccessFile object) {
        long l2 = ((RandomAccessFile)object).length() - 22L;
        long l3 = 0L;
        if (l2 >= 0L) {
            long l4 = l2 - 65536L;
            if (l4 < 0L) {
                l4 = l3;
            }
            int n2 = Integer.reverseBytes(101010256);
            do {
                ((RandomAccessFile)object).seek(l2);
                if (((RandomAccessFile)object).readInt() != n2) continue;
                ((RandomAccessFile)object).skipBytes(2);
                ((RandomAccessFile)object).skipBytes(2);
                ((RandomAccessFile)object).skipBytes(2);
                ((RandomAccessFile)object).skipBytes(2);
                i i2 = new i();
                i2.b = (long)Integer.reverseBytes(((RandomAccessFile)object).readInt()) & 0xFFFFFFFFL;
                i2.a = (long)Integer.reverseBytes(((RandomAccessFile)object).readInt()) & 0xFFFFFFFFL;
                return i2;
            } while (--l2 >= l4);
            throw new ZipException(nIe.d("0708376306296225362D3D3D230A7307203D2705272C3B3662153A24272E3613212669212D127325263A2C02"));
        }
        StringBuilder stringBuilder = c.b(nIe.d("040F3F26693B2D097330212030127337266F2003732269352B1673252023275C73"));
        stringBuilder.append(((RandomAccessFile)object).length());
        object = new ZipException(stringBuilder.toString());
        throw object;
    }
}

