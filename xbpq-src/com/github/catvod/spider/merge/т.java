/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u013a;
import com.github.catvod.spider.merge.\u02b2;
import com.github.catvod.spider.merge.\u02bd;
import com.github.catvod.spider.merge.\u02c8;
import com.github.catvod.spider.merge.\u02ec;
import com.github.catvod.spider.merge.\u0671;
import com.github.catvod.spider.merge.\u06c1;
import com.github.catvod.spider.merge.\u0710;
import com.github.catvod.spider.merge.\u079c;
import com.github.catvod.spider.merge.\u079f;
import com.github.catvod.spider.merge.\u07a0;
import com.github.catvod.spider.merge.\u07d7;
import com.github.catvod.spider.merge.\u07e0;
import com.github.catvod.spider.merge.\u0867;
import com.github.catvod.spider.merge.\u08a5;
import com.github.catvod.spider.merge.\u08a6;
import com.github.catvod.spider.merge.\u0e33;
import com.github.catvod.spider.merge.\u0eb2;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class \u0442 {
    private \u0e33 \u037f;

    public \u0442(\u0e33 \u0e332) {
        this.\u037f = \u0e332;
    }

    public static \u0442 \u037f(String string) {
        return new \u0442(\u0671.\u037f(string).\u0864());
    }

    public List<\u02ec> \u0528(String iterator) {
        Serializable serializable;
        block15: {
            block14: {
                block13: {
                    block12: {
                        block11: {
                            block10: {
                                serializable = new LinkedList();
                                iterator = \u07a0.\u037f((String)((Object)iterator));
                                Object object = new \u0eb2((\u079f)((Object)iterator));
                                iterator = new Iterator<Object>((\u08a5)object);
                                object = new \u07d7((\u08a6)((Object)iterator));
                                iterator = new Iterator<Object>();
                                ((\u0867)object).\u0797((\u079c)((Object)iterator));
                                iterator = ((\u07d7)object).\u0861();
                                object = new \u0710(this.\u037f);
                                iterator = (\u07e0)((\u02bd)object).\u0796((\u02c8)((Object)iterator));
                                if (!((\u07e0)((Object)iterator)).\u0783()) break block10;
                                iterator = ((\u07e0)((Object)iterator)).\u052a().iterator();
                                while (iterator.hasNext()) {
                                    serializable.add(\u02ec.\u0529((\u013a)iterator.next()));
                                }
                                return serializable;
                            }
                            try {
                                if (!((\u07e0)((Object)iterator)).\u0785()) break block11;
                                iterator = ((\u07e0)((Object)iterator)).\u052b().iterator();
                                while (iterator.hasNext()) {
                                    serializable.add(\u02ec.\u0529((String)iterator.next()));
                                }
                                return serializable;
                            }
                            catch (Exception exception) {
                                serializable = new StringBuilder();
                                ((StringBuilder)serializable).append(SOY.d("2A3E341707125A313913171C5A2639135404033C25170C571534710F1B020872290615031272340E04055A3D23561718173F380254165A"));
                                ((StringBuilder)serializable).append(\u02b2.\u0529(exception));
                                \u06c1 \u06c12 = new \u06c1(((StringBuilder)serializable).toString(), exception);
                                throw \u06c12;
                            }
                        }
                        if (!((\u07e0)((Object)iterator)).\u0787()) break block12;
                        serializable.add(\u02ec.\u0529(((\u07e0)((Object)iterator)).\u052d()));
                        return serializable;
                    }
                    if (!((\u07e0)((Object)iterator)).\u0786()) break block13;
                    serializable.add(\u02ec.\u0529(((\u07e0)((Object)iterator)).\u0529()));
                    return serializable;
                }
                if (!((\u07e0)((Object)iterator)).\u0781()) break block14;
                serializable.add(\u02ec.\u0529(((\u07e0)((Object)iterator)).\u037f()));
                return serializable;
            }
            if (!((\u07e0)((Object)iterator)).\u0782()) break block15;
            serializable.add(\u02ec.\u0529(((\u07e0)((Object)iterator)).\u0528()));
            return serializable;
        }
        serializable.add(\u02ec.\u0529(((\u07e0)((Object)iterator)).\u052d()));
        return serializable;
    }

    public \u02ec \u0529(String object) {
        if ((object = this.\u0528((String)object)) != null && object.size() > 0) {
            return (\u02ec)object.get(0);
        }
        return null;
    }
}

