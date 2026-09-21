/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.ai;

import com.github.catvod.spider.merge.nIe;
import java.io.File;
import java.io.FileFilter;

final class f
implements FileFilter {
    f() {
    }

    @Override
    public final boolean accept(File file) {
        return file.getName().equals(nIe.d("0F133F37200B271E7D2F262C29")) ^ true;
    }
}

