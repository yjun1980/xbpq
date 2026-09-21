/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u013a;
import com.github.catvod.spider.merge.\u0140;
import com.github.catvod.spider.merge.\u0155;
import com.github.catvod.spider.merge.\u027e;
import com.github.catvod.spider.merge.\u028f;
import com.github.catvod.spider.merge.\u0582;
import com.github.catvod.spider.merge.\u07d9;
import com.github.catvod.spider.merge.\u07e0;
import com.github.catvod.spider.merge.\u0e33;
import com.github.catvod.spider.merge.\u0f6c;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class \u0688
implements \u07d9 {
    @Override
    public String name() {
        return SOY.d("0E372902");
    }

    @Override
    public \u07e0 \u037f(\u0155 iterator) {
        \u0e33 \u0e332;
        block6: {
            Object object = ((\u0155)((Object)iterator)).\u037f();
            \u0e332 = new \u0e33();
            if (object == null || ((ArrayList)object).size() <= 0) break block6;
            if (((\u0155)((Object)iterator)).\u052c()) {
                iterator = ((ArrayList)object).iterator();
                while (iterator.hasNext()) {
                    object = (\u013a)iterator.next();
                    \u027e.\u0528(new \u0f6c(this, new HashMap(), \u0e332){
                        final Map \u037f;
                        final \u0e33 \u0528;
                        final \u0688 \u0529;
                        {
                            this.\u0529 = \u06882;
                            this.\u037f = map;
                            this.\u0528 = \u0e332;
                        }

                        @Override
                        public void \u037f(\u0582 \u05822, int n2) {
                        }

                        /*
                         * Enabled aggressive block sorting
                         * Enabled unnecessary exception pruning
                         * Enabled aggressive exception aggregation
                         */
                        @Override
                        public void \u0528(\u0582 object, int n2) {
                            if (object instanceof \u0140) {
                                \u0140 \u01402 = (\u0140)object;
                                object = new StringBuilder();
                                ((StringBuilder)object).append(n2);
                                ((StringBuilder)object).append(SOY.d("25"));
                                ((StringBuilder)object).append(\u01402.\u0790().hashCode());
                                Object object2 = ((StringBuilder)object).toString();
                                object = (Integer)this.\u037f.get(object2);
                                if (object == null) {
                                    object = 1;
                                    this.\u037f.put(object2, object);
                                } else {
                                    object = (Integer)object + 1;
                                    this.\u037f.put(object2, object);
                                }
                                object2 = new \u013a(SOY.d("300A0E22312F2E"));
                                ((\u013a)object2).\u08ba(\u01402.\u07a3());
                                try {
                                    Method method = \u0582.class.getDeclaredMethod(SOY.d("A4C9"), \u0582.class);
                                    method.setAccessible(true);
                                    method.invoke(object2, \u01402.\u0790());
                                }
                                catch (Exception exception) {}
                                \u028f.\u052c((\u013a)object2, (Integer)object);
                                this.\u0528.add(object2);
                            }
                        }
                    }, (\u0582)object);
                }
            } else {
                iterator = ((ArrayList)object).iterator();
                while (iterator.hasNext()) {
                    \u0582 \u05822 = (\u013a)iterator.next();
                    object = ((\u013a)\u05822).\u0789();
                    boolean bl = SOY.d("0931231F0403").equals(object);
                    object = SOY.d("300A0E22312F2E");
                    if (bl) {
                        object = new \u013a((String)object);
                        ((\u013a)object).\u08ba(((\u013a)\u05822).\u0866());
                        \u028f.\u052c((\u013a)object, 1);
                        \u0e332.add(object);
                        continue;
                    }
                    List<\u0140> list = ((\u013a)\u05822).\u08bb();
                    int n2 = 0;
                    while (n2 < list.size()) {
                        \u05822 = list.get(n2);
                        \u013a \u013a2 = new \u013a((String)object);
                        \u013a2.\u08ba(((\u0140)\u05822).\u07a3());
                        \u028f.\u052c(\u013a2, ++n2);
                        \u0e332.add(\u013a2);
                    }
                }
            }
        }
        return \u07e0.\u058f(\u0e332);
    }
}

