/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u013a;
import com.github.catvod.spider.merge.\u0155;
import com.github.catvod.spider.merge.\u024d;
import com.github.catvod.spider.merge.\u028f;
import com.github.catvod.spider.merge.\u02ba;
import com.github.catvod.spider.merge.\u02c8;
import com.github.catvod.spider.merge.\u02d1;
import com.github.catvod.spider.merge.\u04af;
import com.github.catvod.spider.merge.\u05df;
import com.github.catvod.spider.merge.\u068c;
import com.github.catvod.spider.merge.\u07d7;
import com.github.catvod.spider.merge.\u07e0;
import com.github.catvod.spider.merge.\u08a1;
import com.github.catvod.spider.merge.\u0e33;
import com.github.catvod.spider.merge.\u0ec0;
import com.github.catvod.spider.merge.\u0f41;
import com.github.catvod.spider.merge.\u0f60;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class \u0710
extends \u0f60<\u07e0> {
    private \u0f41 \u037f = \u024d.\u052f(\u0710.class);
    private Stack<\u0155> \u0528 = new Stack();
    private \u0155 \u0529;

    public \u0710(\u0e33 \u0e332) {
        this.\u0529 = \u0155.\u0529(\u0e332);
        this.\u0528.push(\u0155.\u0529(\u0e332).\u058f(this.\u0529));
    }

    private \u0155 \u0797() {
        return this.\u0528.peek();
    }

    private void \u0798(\u0e33 \u0e332) {
        this.\u0528.peek().\u052f(\u0e332);
    }

    public \u07e0 \u0799(\u07d7.\u037f hashSet) {
        hashSet = ((\u08a1)((Object)hashSet)).\u0528();
        if (SOY.d("547C").equals(hashSet)) {
            hashSet = new HashSet<\u013a>();
            \u0e33 \u0e332 = new \u0e33();
            Iterator iterator = this.\u0797().\u037f().iterator();
            while (iterator.hasNext()) {
                hashSet.add(((\u013a)iterator.next()).\u08ad());
            }
            \u0e332.addAll(hashSet);
            return \u07e0.\u058f(\u0e332);
        }
        return \u07e0.\u058f(this.\u0797().\u037f());
    }

    public \u07e0 \u079a(\u07d7.\u0528 \u0529) {
        if (\u0ec0.\u037f(\u0529.\u052e.\u0528(), SOY.d("557D"))) {
            this.\u0797().\u052e();
        }
        return (\u07e0)this.\u0796(\u0529.\u078c());
    }

    public \u07e0 \u079b(\u07d7.\u052a \u052b) {
        Object object = \u052b.\u078c();
        int n2 = object.size();
        if (n2 == 1) {
            return (\u07e0)this.\u0796(object.get(0));
        }
        object = ((\u07e0)this.\u0796(object.get(0))).\u0529();
        String string = null;
        for (int i2 = 1; i2 < \u052b.\u052c(); ++i2) {
            Object object2 = \u052b.\u052b(i2);
            if (object2 instanceof \u07d7.\u0785) {
                object2 = (\u07e0)this.\u0796((\u02c8)object2);
                if (SOY.d("51").equals(string)) {
                    object = (Double)object + ((\u07e0)object2).\u0529();
                    continue;
                }
                if (SOY.d("57").equals(string)) {
                    object = (Double)object - ((\u07e0)object2).\u0529();
                    continue;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append(SOY.d("092B3F02150F5A3723041B055672"));
                ((StringBuilder)object).append(\u052b.\u0528());
                throw new \u068c(((StringBuilder)object).toString());
            }
            string = object2.\u0528();
        }
        return \u07e0.\u058f(object);
    }

    public \u07e0 \u079c(\u07d7.\u052c object) {
        List<\u07d7.\u058f> list = ((\u07d7.\u052c)object).\u078c();
        int n2 = list.size();
        if (n2 > 1) {
            object = ((\u07e0)this.\u0796(list.get(0))).\u037f();
            for (int i2 = 1; i2 < list.size(); ++i2) {
                object = (Boolean)object & ((\u07e0)this.\u0796(list.get(i2))).\u037f();
            }
            return \u07e0.\u058f(object);
        }
        return (\u07e0)this.\u0796(list.get(0));
    }

    public \u07e0 \u079d(\u07d7.\u052e object) {
        if (((\u07d7.\u052e)object).\u078c() != null) {
            return \u04af.\u0529(((\u07d7.\u052e)object).\u078c().\u0528()).\u037f(this.\u0797().\u037f());
        }
        object = ((\u08a1)object).\u0528();
        if (SOY.d("3A").equals(object)) {
            return \u07e0.\u058f(null).\u052e();
        }
        return null;
    }

    public \u07e0 \u079e(\u07d7.\u058f object) {
        List<\u07d7.\u078e> list = ((\u07d7.\u058f)object).\u078c();
        if (list.size() == 1) {
            return (\u07e0)this.\u0796(list.get(0));
        }
        if (list.size() == 2) {
            \u07e0 \u07e02 = (\u07e0)this.\u0796(list.get(0));
            list = (\u07e0)this.\u0796(list.get(1));
            object = ((\u07d7.\u058f)object).\u052e.\u0528();
            if (SOY.d("47").equals(object)) {
                if (\u07e02.\u0788().equals(((\u07e0)((Object)list)).\u0788())) {
                    return \u07e0.\u058f(\u0ec0.\u037f(\u07e02, list));
                }
                return \u07e0.\u058f(\u0ec0.\u037f(\u07e02.\u052d(), ((\u07e0)((Object)list)).\u052d()));
            }
            if (\u07e02.\u0788().equals(((\u07e0)((Object)list)).\u0788())) {
                return \u07e0.\u058f(\u0ec0.\u037f(\u07e02, list) ^ true);
            }
            return \u07e0.\u058f(\u0ec0.\u037f(\u07e02.\u052d(), ((\u07e0)((Object)list)).\u052d()) ^ true);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(SOY.d("1F20231906571F232417181E0E2B140E04055A3C3417064D"));
        stringBuilder.append(((\u08a1)object).\u0528());
        throw new \u068c(stringBuilder.toString());
    }

    public \u07e0 \u079f(\u07d7.\u0620 \u06202) {
        return (\u07e0)this.\u0796(\u06202.\u078c());
    }

    public \u07e0 \u07a0(\u07d7.\u0780 \u07802) {
        return (\u07e0)this.\u0796(\u07802.\u078c());
    }

    public \u07e0 \u07a1(\u07d7.\u0781 object) {
        LinkedList<\u07e0> linkedList = new LinkedList<\u07e0>();
        \u07e0 \u07e02 = (\u07e0)this.\u0796(((\u07d7.\u0781)object).\u078d());
        for (\u07d7.\u0620 \u06202 : ((\u07d7.\u0781)object).\u078c()) {
            this.\u0528.push(\u0155.\u052a(this.\u0797()));
            linkedList.add((\u07e0)this.\u0796(\u06202));
            this.\u0528.pop();
        }
        return \u04af.\u037f(\u07e02.\u052d()).\u037f(this.\u0797(), linkedList);
    }

    public \u07e0 \u07a2(\u07d7.\u0782 \u07822) {
        return (\u07e0)this.\u0796(\u07822.\u078c());
    }

    public \u07e0 \u07a3(\u07d7.\u0783 \u07832) {
        if (\u07832.\u078d() != null && !\u07832.\u078d().\u052f()) {
            return (\u07e0)this.\u0796(\u07832.\u078d());
        }
        return (\u07e0)this.\u0796(\u07832.\u078c());
    }

    public \u07e0 \u07a4(\u07d7.\u0784 \u07842) {
        return (\u07e0)this.\u0796(\u07842.\u078c());
    }

    public \u07e0 \u07a5(\u07d7.\u0785 \u07852) {
        if (\u07852.\u078c() != null && !\u07852.\u078c().\u052f()) {
            Comparable<\u07e0> comparable = (\u07e0)this.\u0796(\u07852.\u078d());
            \u07e0 \u07e02 = (\u07e0)this.\u0796(\u07852.\u078c());
            switch (\u07852.\u052e.getType()) {
                default: {
                    comparable = new StringBuilder();
                    ((StringBuilder)comparable).append(SOY.d("092B3F02150F5A3723041B055672"));
                    ((StringBuilder)comparable).append(\u07852.\u0528());
                    throw new \u068c(((StringBuilder)comparable).toString());
                }
                case 19: {
                    return \u07e0.\u058f(((\u07e0)comparable).\u0529() % \u07e02.\u0529());
                }
                case 18: {
                    return \u07e0.\u058f(((\u07e0)comparable).\u0529() / \u07e02.\u0529());
                }
                case 17: 
            }
            return \u07e0.\u058f(((\u07e0)comparable).\u0529() * \u07e02.\u0529());
        }
        return (\u07e0)this.\u0796(\u07852.\u078d());
    }

    public \u07e0 \u07b1(\u07d7.\u0786 \u07862) {
        if (\u07862.\u078c() != null) {
            return \u07e0.\u058f(\u07862.\u078c().\u0528()).\u0620();
        }
        return \u07e0.\u058f(\u07862.\u078d().\u0528()).\u0620();
    }

    public \u07e0 \u0860(\u07d7.\u0787 \u07872) {
        String string = \u07872.\u0528();
        String string2 = SOY.d("50");
        if (string2.equals(string)) {
            return \u07e0.\u058f(string2).\u0620();
        }
        if (\u07872.\u078d() != null && !\u07872.\u078d().\u052f()) {
            return (\u07e0)this.\u0796(\u07872.\u078d());
        }
        if (\u07872.\u078c() != null && !\u07872.\u078c().\u052f()) {
            return (\u07e0)this.\u0796(\u07872.\u078c());
        }
        return null;
    }

    public \u07e0 \u0861(\u07d7.\u0788 \u07882) {
        if (\u07882.\u078d() != null) {
            return (\u07e0)this.\u0796(\u07882.\u078d());
        }
        if (\u07882.\u078c() != null) {
            return \u04af.\u0528(\u07882.\u078c().\u0528()).\u037f(this.\u0797());
        }
        return null;
    }

    public \u07e0 \u0862(\u07d7.\u0789 object) {
        List<\u07d7.\u052c> list = ((\u07d7.\u0789)object).\u078c();
        int n2 = list.size();
        if (n2 > 1) {
            object = ((\u07e0)this.\u0796(list.get(0))).\u037f();
            for (int i2 = 1; i2 < list.size(); ++i2) {
                object = (Boolean)object | ((\u07e0)this.\u0796(list.get(i2))).\u037f();
            }
            return \u07e0.\u058f(object);
        }
        return (\u07e0)this.\u0796(list.get(0));
    }

    public \u07e0 \u0863(\u07d7.\u078a \u078a2) {
        if (\u078a2.\u078d() != null && !\u078a2.\u078d().\u052f()) {
            return (\u07e0)this.\u0796(\u078a2.\u078d());
        }
        Object object = \u078a2.\u052e;
        if (object == null) {
            return (\u07e0)this.\u0796(\u078a2.\u078c());
        }
        object = object.\u0528();
        if (SOY.d("557D").equals(object)) {
            this.\u0797().\u052e();
        }
        return (\u07e0)this.\u0796(\u078a2.\u078e());
    }

    public \u07e0 \u0864(\u07d7.\u078b object) {
        \u0e33 \u0e332 = new \u0e33();
        for (\u013a \u013a2 : this.\u0797().\u037f()) {
            this.\u0528.push(\u0155.\u0528(\u013a2).\u058f(this.\u0797()));
            Object object2 = (\u07e0)this.\u0796(((\u07d7.\u078b)object).\u078c());
            this.\u0528.pop();
            if (((\u07e0)object2).\u0786()) {
                long l2 = ((\u07e0)object2).\u052c();
                object2 = SOY.d("300A0E22312F2E");
                long l3 = l2;
                if (l2 < 0L) {
                    int n2 = \u0ec0.\u037f(\u013a2.\u08b8(), object2) ? \u028f.\u0529(\u013a2) : \u028f.\u052b(\u013a2, this.\u0797());
                    l3 = l2 = (long)n2 + l2 + 1L;
                    if (l2 < 0L) {
                        l3 = 1L;
                    }
                }
                if (\u0ec0.\u037f(\u013a2.\u08b8(), object2)) {
                    if (l3 != (long)\u028f.\u0529(\u013a2)) continue;
                    \u0e332.add(\u013a2);
                    continue;
                }
                if (l3 != (long)\u028f.\u0528(\u013a2, this.\u0797())) continue;
                \u0e332.add(\u013a2);
                continue;
            }
            if (((\u07e0)object2).\u0781()) {
                if (!((\u07e0)object2).\u037f().booleanValue()) continue;
                \u0e332.add(\u013a2);
                continue;
            }
            if (((\u07e0)object2).\u0787()) {
                if (!\u02d1.\u0620(((\u07e0)object2).\u052d())) continue;
                \u0e332.add(\u013a2);
                continue;
            }
            if (((\u07e0)object2).\u0783()) {
                if (((\u07e0)object2).\u052a().size() <= 0) continue;
                \u0e332.add(\u013a2);
                continue;
            }
            if (((\u07e0)object2).\u0785()) {
                if (((\u07e0)object2).\u052b().size() <= 0) continue;
                \u0e332.add(\u013a2);
                continue;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append(SOY.d("0F3C3A181B001472340E04055A24301A4E"));
            ((StringBuilder)object).append(object2);
            throw new \u068c(((StringBuilder)object).toString());
        }
        return \u07e0.\u058f(\u0e332);
    }

    public \u07e0 \u0865(\u07d7.\u078c \u078c2) {
        if (\u078c2.\u078e() != null && !\u078c2.\u078e().\u052f()) {
            return (\u07e0)this.\u0796(\u078c2.\u078e());
        }
        if (\u078c2.\u078f() != null && !\u078c2.\u078f().\u052f()) {
            return (\u07e0)this.\u0796(\u078c2.\u078f());
        }
        if (\u078c2.\u078c() != null) {
            return \u07e0.\u058f(\u078c2.\u078c().\u0528()).\u0620();
        }
        if (\u078c2.\u078d() != null) {
            return \u07e0.\u058f(\u02ba.\u037f(\u078c2.\u078d().\u0528()));
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(SOY.d("143D255607020A223E0400570C33231F151516370313121208373F15114D"));
        stringBuilder.append(\u078c2.\u0528());
        throw new \u068c(stringBuilder.toString());
    }

    public \u07e0 \u0866(\u07d7.\u078d object) {
        Object object2 = ((\u07d7.\u078d)object).\u078c();
        if (object2 != null) {
            if (object2.size() > 1) {
                object = new LinkedList();
                Iterator<\u07d7.\u0786> iterator = object2.iterator();
                while (iterator.hasNext()) {
                    object2 = (\u07e0)this.\u0796(iterator.next());
                    if (object2 == null) continue;
                    object.add(((\u07e0)object2).\u052d());
                }
                return \u07e0.\u058f(\u02d1.\u0780(object, SOY.d("40")));
            }
            return (\u07e0)this.\u0796(object2.get(0));
        }
        return null;
    }

    public \u07e0 \u0867(\u07d7.\u078e \u078e2) {
        Object object = \u078e2.\u078c();
        int n2 = object.size();
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        if (n2 == 1) {
            return (\u07e0)this.\u0796(object.get(0));
        }
        if (object.size() == 2) {
            Comparable<\u07e0> comparable = (\u07e0)this.\u0796(object.get(0));
            object = (\u07e0)this.\u0796(object.get(1));
            switch (\u078e2.\u052e.getType()) {
                default: {
                    comparable = new StringBuilder();
                    ((StringBuilder)comparable).append(SOY.d("0F3C3A181B0014723E0611051B263E04"));
                    ((StringBuilder)comparable).append(\u078e2.\u052e.\u0528());
                    throw new \u068c(((StringBuilder)comparable).toString());
                }
                case 34: {
                    return \u07e0.\u058f(((\u07e0)comparable).\u052d().matches(((\u07e0)object).\u052d()) ^ true);
                }
                case 33: {
                    return \u07e0.\u058f(((\u07e0)comparable).\u052d().matches(((\u07e0)object).\u052d()));
                }
                case 32: {
                    return \u07e0.\u058f(((\u07e0)comparable).\u052d().contains(((\u07e0)object).\u052d()));
                }
                case 31: {
                    return \u07e0.\u058f(((\u07e0)comparable).\u052d().endsWith(((\u07e0)object).\u052d()));
                }
                case 30: {
                    return \u07e0.\u058f(((\u07e0)comparable).\u052d().startsWith(((\u07e0)object).\u052d()));
                }
                case 27: {
                    if (((\u07e0)comparable).\u052f((\u07e0)object) >= 0) {
                        bl4 = true;
                    }
                    return \u07e0.\u058f(bl4);
                }
                case 26: {
                    bl4 = bl;
                    if (((\u07e0)comparable).\u052f((\u07e0)object) <= 0) {
                        bl4 = true;
                    }
                    return \u07e0.\u058f(bl4);
                }
                case 25: {
                    bl4 = bl2;
                    if (((\u07e0)comparable).\u052f((\u07e0)object) > 0) {
                        bl4 = true;
                    }
                    return \u07e0.\u058f(bl4);
                }
                case 24: 
            }
            bl4 = bl3;
            if (((\u07e0)comparable).\u052f((\u07e0)object) < 0) {
                bl4 = true;
            }
            return \u07e0.\u058f(bl4);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(SOY.d("1F20231906571F232417181E0E2B140E04055A3C3417064D"));
        stringBuilder.append(\u078e2.\u0528());
        throw new \u068c(stringBuilder.toString());
    }

    public \u07e0 \u0868(\u07d7.\u078f \u078f2) {
        Object object = null;
        for (int i2 = 0; i2 < \u078f2.\u052c(); ++i2) {
            Object object2 = \u078f2.\u052b(i2);
            if (object2 instanceof \u07d7.\u0790) {
                object = object2 = (\u07e0)this.\u0796((\u02c8)object2);
                if (!((\u07e0)object2).\u0783()) continue;
                this.\u0798(((\u07e0)object2).\u052a());
                object = object2;
                continue;
            }
            object2 = object2.\u0528();
            if (SOY.d("557D").equals(object2)) {
                this.\u0797().\u052e();
                continue;
            }
            this.\u0797().\u052d();
        }
        return object;
    }

    /*
     * Unable to fully structure code
     */
    public \u07e0 \u0869(\u07d7.\u0790 var1_1) {
        block25: {
            block23: {
                block24: {
                    if (var1_1.\u078c() != null && !var1_1.\u078c().\u052f()) {
                        return (\u07e0)this.\u0796(var1_1.\u078c());
                    }
                    var4_2 = var1_1.\u078d();
                    var3_3 = false;
                    if (var4_2 == null || var1_1.\u078d().\u052f() || (var4_2 = (\u07e0)this.\u0796(var1_1.\u078d())) == null) break block23;
                    if (!var4_2.\u0783()) break block24;
                    this.\u0798(var4_2.\u052a());
                    ** GOTO lbl-1000
                }
                if (var4_2.\u0780()) {
                    var2_4 = 1;
                    var3_3 = true;
                } else lbl-1000:
                // 2 sources

                {
                    var2_4 = 1;
                }
                break block25;
            }
            var2_4 = 0;
        }
        if (var1_1.\u078e() != null && !var1_1.\u078e().\u052f()) {
            var4_2 = (\u07e0)this.\u0796(var1_1.\u078e());
            if (var3_3) {
                var7_5 = this.\u0797().\u037f();
                var1_1 = var4_2.\u052d();
                if (this.\u0797().\u052c()) {
                    var2_4 = var7_5.size();
                    var5_7 = SOY.d("27");
                    var4_2 = SOY.d("21");
                    if (var2_4 == 1) {
                        var7_5 = this.\u0797().\u0620();
                        var6_10 = new StringBuilder();
                        var6_10.append((String)var4_2);
                        var6_10.append((String)var1_1);
                        var6_10.append((String)var5_7);
                        var5_7 = var7_5.\u08b3(var6_10.toString());
                        var4_2 = new LinkedList<E>();
                        var5_7 = var5_7.iterator();
                        while (var5_7.hasNext()) {
                            var4_2.add(((\u013a)var5_7.next()).\u0529((String)var1_1));
                        }
                        return \u07e0.\u058f(var4_2);
                    }
                    var6_11 = new \u0e33();
                    var9_13 = var7_5.iterator();
                    while (var9_13.hasNext()) {
                        var8_15 = (\u013a)var9_13.next();
                        var7_5 = new StringBuilder();
                        var7_5.append((String)var4_2);
                        var7_5.append((String)var1_1);
                        var7_5.append((String)var5_7);
                        var6_11.addAll(var8_15.\u08b3(var7_5.toString()));
                    }
                    var4_2 = new LinkedList<String>();
                    var5_7 = var6_11.iterator();
                    while (var5_7.hasNext()) {
                        var4_2.add(((\u013a)var5_7.next()).\u0529((String)var1_1));
                    }
                    return \u07e0.\u058f(var4_2);
                }
                if (var7_5.size() == 1) {
                    return \u07e0.\u058f(this.\u0797().\u0620().\u0529((String)var1_1));
                }
                var4_2 = new LinkedList<E>();
                var5_8 = var7_5.iterator();
                while (var5_8.hasNext()) {
                    var4_2.add(((\u013a)var5_8.next()).\u0529((String)var1_1));
                }
                return \u07e0.\u058f(var4_2);
            }
            if (var4_2.\u0784()) {
                var4_2 = var4_2.\u052d();
                var5_9 = this.\u0797().\u037f();
                if (this.\u0797().\u052c()) {
                    this.\u0798(var5_9.\u052d((String)var4_2));
                } else {
                    var6_12 = new \u0e33();
                    for (\u013a var8_16 : this.\u0797().\u037f()) {
                        var7_6 = SOY.d("50");
                        if (var2_4 != 0) {
                            if (!var8_16.\u0789().equals(var4_2) && !var7_6.equals(var4_2)) continue;
                            var6_12.add(var8_16);
                            continue;
                        }
                        for (\u013a var8_16 : var8_16.\u0864()) {
                            if (!var8_16.\u0789().equals(var4_2) && !var7_6.equals(var4_2)) continue;
                            var6_12.add(var8_16);
                        }
                    }
                    this.\u0798(var6_12);
                }
            } else if (var4_2.\u0783()) {
                this.\u0798(var4_2.\u052a());
            } else {
                return var4_2;
            }
        }
        if (var1_1.\u078f() != null && var1_1.\u078f().size() > 0) {
            var1_1 = var1_1.\u078f().iterator();
            while (var1_1.hasNext()) {
                this.\u0798(((\u07e0)this.\u0796((\u07d7.\u078b)var1_1.next())).\u052a());
            }
        }
        return \u07e0.\u058f(this.\u0797().\u037f());
    }

    public \u07e0 \u086a(\u07d7.\u0791 \u07912) {
        \u07e0 \u07e02 = (\u07e0)this.\u0796(\u07912.\u078c());
        if (\u07912.\u052e == null) {
            return \u07e02;
        }
        return \u07e0.\u058f(-\u07e02.\u0529().doubleValue());
    }

    public \u07e0 \u08a0(\u07d7.\u0792 object) {
        if (((\u07d7.\u0792)object).\u078c() == null && !((\u07d7.\u0792)object).\u078c().\u052f()) {
            return (\u07e0)this.\u0796(((\u07d7.\u0792)object).\u078d());
        }
        \u07e0 \u07e02 = (\u07e0)this.\u0796(((\u07d7.\u0792)object).\u078c());
        if (((\u07d7.\u0792)object).\u052e == null) {
            return \u07e02;
        }
        this.\u0528.push(\u0155.\u052a(this.\u0797().\u052b()));
        object = (\u07e0)this.\u0796(((\u07d7.\u0792)object).\u078d());
        this.\u0528.pop();
        boolean bl = \u07e02.\u0783();
        CharSequence charSequence = SOY.d("2C");
        if (bl) {
            if (((\u07e0)object).\u0783()) {
                \u07e02.\u052a().addAll(((\u07e0)object).\u052a());
            } else {
                \u013a \u013a2 = new \u013a((String)charSequence);
                \u013a2.\u07a5(((\u07e0)object).\u052d());
                \u07e02.\u052a().add(\u013a2);
            }
            return \u07e02;
        }
        if (\u07e02.\u0787()) {
            if (((\u07e0)object).\u0783()) {
                \u013a \u013a3 = new \u013a((String)charSequence);
                \u013a3.\u07a5(\u07e02.\u052d());
                ((\u07e0)object).\u052a().add(\u013a3);
                return object;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(\u07e02.\u052d());
            stringBuilder.append(((\u07e0)object).\u052d());
            return \u07e0.\u058f(stringBuilder.toString());
        }
        bl = \u07e02.\u0781();
        Object object2 = SOY.d("5624301A464A");
        String string = SOY.d("19333F561A180E723C1306101F722717184647");
        if (bl) {
            if (((\u07e0)object).\u0781()) {
                bl = \u07e02.\u037f();
                return \u07e0.\u058f(((\u07e0)object).\u037f() | bl);
            }
            if (((\u07e0)object).\u0783()) {
                object2 = new \u013a((String)charSequence);
                ((\u013a)object2).\u07a5(\u07e02.\u052d());
                ((\u07e0)object).\u052a().add(object2);
                return object;
            }
            if (((\u07e0)object).\u0787()) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(\u07e02.\u037f());
                ((StringBuilder)object2).append(((\u07e0)object).\u052d());
                return \u07e0.\u058f(((StringBuilder)object2).toString());
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string);
            ((StringBuilder)charSequence).append(\u07e02.\u037f());
            ((StringBuilder)charSequence).append((String)object2);
            ((StringBuilder)charSequence).append(((\u07e0)object).\u052d());
            throw new \u05df(((StringBuilder)charSequence).toString());
        }
        if (\u07e02.\u0786()) {
            if (((\u07e0)object).\u0787()) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(\u07e02.\u0529());
                ((StringBuilder)object2).append(((\u07e0)object).\u052d());
                return \u07e0.\u058f(((StringBuilder)object2).toString());
            }
            if (((\u07e0)object).\u0783()) {
                object2 = new \u013a((String)charSequence);
                ((\u013a)object2).\u07a5(\u07e02.\u052d());
                ((\u07e0)object).\u052a().add(object2);
                return object;
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string);
            ((StringBuilder)charSequence).append(\u07e02.\u0529());
            ((StringBuilder)charSequence).append((String)object2);
            ((StringBuilder)charSequence).append(((\u07e0)object).\u052d());
            throw new \u05df(((StringBuilder)charSequence).toString());
        }
        object2 = new LinkedList();
        if (\u02d1.\u0620(\u07e02.\u052d())) {
            object2.add(\u07e02.\u052d());
        }
        if (\u02d1.\u0620(((\u07e0)object).\u052d())) {
            object2.add(((\u07e0)object).\u052d());
        }
        return \u07e0.\u058f(\u02d1.\u0780(object2, SOY.d("56")));
    }
}

