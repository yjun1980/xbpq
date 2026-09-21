package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.cYh;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class O {
    private static final Pattern a = Pattern.compile(cYh.d("39787E6B7F650E79061C037358781A7A7A074E6F690D3306036F686E7F6058781D350B3E5879686E73"));
    private static final TimeZone b = new Q(false, 0, 0);
    public static final /* synthetic */ int c = 0;

    public static TimeZone a(String str) {
        if (cYh.d("3D").equals(str) || cYh.d("320402").equals(str)) {
            return b;
        }
        Matcher matcher = a.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(2);
        boolean z = false;
        int parseInt = group != null ? Integer.parseInt(group) : 0;
        String group2 = matcher.group(4);
        int parseInt2 = group2 != null ? Integer.parseInt(group2) : 0;
        if (parseInt == 0 && parseInt2 == 0) {
            return b;
        }
        String group3 = matcher.group(1);
        if (group3 != null && group3.charAt(0) == '-') {
            z = true;
        }
        return new Q(z, parseInt, parseInt2);
    }
}
