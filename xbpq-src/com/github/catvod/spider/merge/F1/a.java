/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.F1;

import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.D1.A;
import com.github.catvod.spider.merge.K1.p;
import com.github.catvod.spider.merge.n1.i;
import com.github.catvod.spider.merge.o1.c;
import java.net.URL;
import java.util.List;
import java.util.regex.Pattern;

public final class a
extends c {
    private static final a a = new a();
    private static final Pattern b = Pattern.compile("playlist|watch|attribution_link|watch_popup|embed|feed|select_site|account|reporthistory|redirect");

    private a() {
    }

    public static a m() {
        return a;
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final String c(String object) {
        try {
            object = p.q((String)object);
            String string = ((URL)object).getPath();
            if (p.i((URL)object) && (A.B((URL)object) || A.x((URL)object))) {
                object = string.substring(1);
                String[] stringArray = ((String)object).split("/");
                boolean bl = stringArray.length > 0 && stringArray[0].startsWith("@");
                if (bl) return stringArray[0];
                bl = stringArray.length == 1 && !stringArray[0].isEmpty() && !b.matcher(stringArray[0]).matches();
                if (bl) {
                    return stringArray[0];
                }
                if (!(((String)object).startsWith("user/") || ((String)object).startsWith("channel/") || ((String)object).startsWith("c/"))) {
                    object = new i("The given URL is not a channel, a user or a handle URL");
                    throw object;
                }
                object = stringArray[1];
                if (!p.h((String)object)) {
                    String string2 = stringArray[0];
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string2);
                    stringBuilder.append("/");
                    stringBuilder.append((String)object);
                    return stringBuilder.toString();
                }
                object = new i("The given ID is not a YouTube channel or user ID");
                throw object;
            }
            object = new i("The URL given is not a YouTube URL");
            throw object;
        }
        catch (Exception exception) {
            throw new i(e.c("Could not parse URL :", exception.getMessage()), exception);
        }
    }

    @Override
    public final boolean h(String string) {
        try {
            this.c(string);
            return true;
        }
        catch (i i2) {
            return false;
        }
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    @Override
    public final String k(String string, List list) {
        return e.c("https://www.youtube.com/", string);
    }
}

