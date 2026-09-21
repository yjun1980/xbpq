/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.UY;

import com.github.catvod.spider.merge.KT.e;
import java.util.Comparator;

public final class o
implements Comparator {
    public final int a;

    public /* synthetic */ o(int n2) {
        this.a = n2;
    }

    public final int compare(Object object, Object object2) {
        int n2;
        block13: {
            switch (this.a) {
                default: {
                    long l2;
                    long l3;
                    object = (e)object;
                    object2 = (e)object2;
                    boolean bl = ((e)object).b;
                    int n3 = bl != ((e)object2).b ? (bl ? -1 : 1) : (bl && (l3 = ((e)object).c) != (l2 = ((e)object2).c) ? (int)(l3 - l2) : ((e)object).d - ((e)object2).d);
                    return n3;
                }
                case 0: 
            }
            String string = (String)object;
            String string2 = (String)object2;
            object = string;
            if (string == null) {
                object = "";
            }
            object2 = string2;
            if (string2 == null) {
                object2 = "";
            }
            int n4 = ((String)object).length();
            int n5 = ((String)object2).length();
            int n6 = 0;
            n2 = 0;
            while (n6 < n4 && n2 < n5) {
                int n7;
                char c2 = ((String)object).charAt(n6);
                char c3 = ((String)object2).charAt(n2);
                if (Character.isDigit(c2) && Character.isDigit(c3)) {
                    int n8;
                    for (n7 = n6; n7 < n4 && Character.isDigit(((String)object).charAt(n7)); ++n7) {
                    }
                    for (n8 = n2; n8 < n5 && Character.isDigit(((String)object2).charAt(n8)); ++n8) {
                    }
                    string2 = ((String)object).substring(n6, n7).replaceFirst("^0+", "");
                    string = ((String)object2).substring(n2, n8).replaceFirst("^0+", "");
                    if (string2.length() != string.length()) {
                        n2 = string2.length() - string.length();
                    } else {
                        n2 = string2.compareTo(string);
                        if (n2 == 0) {
                            n6 = n7;
                            n2 = n8;
                            continue;
                        }
                    }
                    break block13;
                }
                n7 = String.valueOf(c2).compareToIgnoreCase(String.valueOf(c3));
                if (n7 != 0) {
                    n2 = n7;
                    break block13;
                }
                ++n6;
                ++n2;
            }
            n2 = n4 - n6 - (n5 - n2);
        }
        return n2;
    }
}

