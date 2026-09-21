/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  okhttp3.Call
 *  okhttp3.FormBody$Builder
 *  okhttp3.MediaType
 *  okhttp3.OkHttpClient
 *  okhttp3.Request
 *  okhttp3.Request$Builder
 *  okhttp3.RequestBody
 *  okhttp3.Response
 */
package com.github.catvod.spider.merge;

import android.text.TextUtils;
import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u078a;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Map;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

class \u078b {
    private final String \u037f;
    private String \u0528;
    private Object \u0529 = null;
    private final Map<String, String> \u052a;
    private final String \u052b;
    private final Map<String, String> \u052c;
    private final \u078a \u052d;
    private Request \u052e;
    private Request.Builder \u052f;

    \u078b(String string, String string2, String string3, Map<String, String> map, \u078a \u078a2) {
        this(string, string2, string3, null, map, \u078a2);
    }

    private \u078b(String string, String string2, String string3, Map<String, String> map, Map<String, String> map2, \u078a \u078a2) {
        this.\u037f = string;
        this.\u0528 = string2;
        this.\u052b = string3;
        this.\u052a = map;
        this.\u052c = map2;
        this.\u052d = \u078a2;
        this.\u0528();
    }

    \u078b(String string, String string2, Map<String, String> map, Map<String, String> map2, \u078a \u078a2) {
        this(string, string2, null, map, map2, \u078a2);
    }

    private void \u0528() {
        this.\u052f = new Request.Builder();
        Object object = this.\u037f;
        ((String)object).hashCode();
        if (!((String)object).equals(SOY.d("3D1705"))) {
            if (((String)object).equals(SOY.d("2A1D0222"))) {
                this.\u052f.post(this.\u0529());
            }
        } else {
            this.\u052a();
        }
        this.\u052f.url(this.\u0528);
        object = this.\u0529;
        if (object != null) {
            this.\u052f.tag(object);
        }
        if (this.\u052c != null) {
            this.\u052b();
        }
        this.\u052e = this.\u052f.build();
    }

    private RequestBody \u0529() {
        String string42 = SOY.d("193A300407120E6F");
        boolean bl = TextUtils.isEmpty((CharSequence)this.\u052b);
        String string2 = SOY.d("393D3F0211190E7F050F0412");
        if (!bl) {
            string42 = SOY.d("1B22211A1D141B2638191A5810213E184F57193A300407120E6F2402125A42");
            Object object = MediaType.parse((String)string42);
            Object object2 = this.\u052c;
            Object object3 = object;
            if (object2 != null) {
                object2 = object2.keySet().iterator();
                while (true) {
                    object3 = object;
                    if (!object2.hasNext()) break;
                    object3 = (String)object2.next();
                    if (!((String)object3).equalsIgnoreCase(string2)) continue;
                    object = this.\u052c.get(object3).isEmpty() ? string42 : this.\u052c.get(object3);
                    object = MediaType.parse((String)object);
                }
            }
            return RequestBody.create((MediaType)object3, (String)this.\u052b);
        }
        FormBody.Builder builder = new FormBody.Builder();
        Map<String, String> map = this.\u052c;
        if (map != null) {
            map = map.keySet().iterator();
            while (map.hasNext()) {
                Map<String, String> object4;
                String string3 = (String)map.next();
                if (!string3.equalsIgnoreCase(string2) || (object4 = this.\u052a) == null) continue;
                for (String string : object4.keySet()) {
                    try {
                        map = this.\u052c.get(string3).contains(string42) ? this.\u052c.get(string3).split(string42)[1] : SOY.d("0F26375B4C");
                        builder.addEncoded(string, URLEncoder.encode(this.\u052a.get(string), (String)((Object)map)));
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                }
                return builder.build();
            }
        }
        if ((map = this.\u052a) != null) {
            for (String string42 : map.keySet()) {
                builder.add(string42, this.\u052a.get(string42));
            }
        }
        return builder.build();
    }

    private void \u052a() {
        if (this.\u052a != null) {
            StringBuilder charSequence2 = new StringBuilder();
            charSequence2.append(this.\u0528);
            charSequence2.append(SOY.d("45"));
            this.\u0528 = charSequence2.toString();
            for (String string : this.\u052a.keySet()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.\u0528);
                stringBuilder.append(string);
                stringBuilder.append(SOY.d("47"));
                stringBuilder.append(this.\u052a.get(string));
                stringBuilder.append(SOY.d("5C"));
                this.\u0528 = stringBuilder.toString();
            }
            String string = this.\u0528;
            this.\u0528 = string.substring(0, string.length() - 1);
        }
    }

    private void \u052b() {
        Map<String, String> map = this.\u052c;
        if (map != null) {
            for (String string : map.keySet()) {
                this.\u052f.addHeader(string, this.\u052c.get(string));
            }
        }
    }

    void \u037f(OkHttpClient okHttpClient) {
        block3: {
            okHttpClient = okHttpClient.newCall(this.\u052e);
            Response response = okHttpClient.execute();
            \u078a \u078a2 = this.\u052d;
            if (\u078a2 == null) break block3;
            try {
                \u078a2.\u037f((Call)okHttpClient, response);
            }
            catch (IOException iOException) {
                \u078a2 = this.\u052d;
                if (\u078a2 == null) break block3;
                \u078a2.onError((Call)okHttpClient, iOException);
            }
        }
    }

    public void \u052c(Object object) {
        this.\u0529 = object;
    }
}

