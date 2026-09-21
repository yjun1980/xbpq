/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u079b;
import com.github.catvod.spider.merge.\u0867;
import com.github.catvod.spider.merge.\u086a;
import com.github.catvod.spider.merge.\u08a0;
import com.github.catvod.spider.merge.\u08ac;
import com.github.catvod.spider.merge.\u107f;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;

public class \u0869
implements \u079b {
    private final Collection<? extends \u079b> \u037f;

    public \u0869(Collection<? extends \u079b> collection) {
        if (collection != null) {
            this.\u037f = collection;
            return;
        }
        throw new NullPointerException(SOY.d("1E373D1313160E3722"));
    }

    @Override
    public void \u037f(\u0867 \u08672, \u107f \u107f2, int n2, int n3, boolean bl, BitSet bitSet, \u08ac \u08ac2) {
        Iterator<? extends \u079b> iterator = this.\u037f.iterator();
        while (iterator.hasNext()) {
            iterator.next().\u037f(\u08672, \u107f2, n2, n3, bl, bitSet, \u08ac2);
        }
    }

    @Override
    public void \u0528(\u0867 \u08672, \u107f \u107f2, int n2, int n3, int n4, \u08ac \u08ac2) {
        Iterator<? extends \u079b> iterator = this.\u037f.iterator();
        while (iterator.hasNext()) {
            iterator.next().\u0528(\u08672, \u107f2, n2, n3, n4, \u08ac2);
        }
    }

    @Override
    public void \u0529(\u08a0<?, ?> \u08a02, Object object, int n2, int n3, String string, \u086a \u086a2) {
        Iterator<? extends \u079b> iterator = this.\u037f.iterator();
        while (iterator.hasNext()) {
            iterator.next().\u0529(\u08a02, object, n2, n3, string, \u086a2);
        }
    }

    @Override
    public void \u052a(\u0867 \u08672, \u107f \u107f2, int n2, int n3, BitSet bitSet, \u08ac \u08ac2) {
        Iterator<? extends \u079b> iterator = this.\u037f.iterator();
        while (iterator.hasNext()) {
            iterator.next().\u052a(\u08672, \u107f2, n2, n3, bitSet, \u08ac2);
        }
    }
}

