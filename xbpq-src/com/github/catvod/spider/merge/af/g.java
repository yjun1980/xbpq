/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  okhttp3.Interceptor
 *  okhttp3.Interceptor$Chain
 *  okhttp3.Request
 *  okhttp3.Response
 *  okhttp3.ResponseBody
 */
package com.github.catvod.spider.merge.af;

import com.github.catvod.spider.merge.af.f;
import com.github.catvod.spider.merge.nIe;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public final class g
implements Interceptor {
    public final Response intercept(Interceptor.Chain object) {
        Object object2 = object.request();
        Request request = object2;
        if (object2.url().host().equals(nIe.d("250F2720262B27483D263D"))) {
            request = object2.newBuilder().addHeader(nIe.d("17153631640E25033D37"), nIe.d("0F09292A25232349666D796F6A313A2D2D203515730D1D6F73567D73726F150F3D757D74621E6577606F0316232F2C182704182A3D607755646D7A79624E180B1D020E4A732F2024274614262A242D4F7300213D2D0B366C787E7548636D7961724600222F2E300F7C767A786C5565")).build();
        }
        request = object.proceed(request);
        object2 = request.header(nIe.d("01093D372C21364B162D2A20260F3D24"));
        object = request;
        if (request.body() != null) {
            object = request;
            if (object2 != null) {
                if (!((String)object2).equals(nIe.d("2603352F283B27"))) {
                    object = request;
                } else {
                    object = new InflaterInputStream(request.body().byteStream(), new Inflater(true));
                    object = request.newBuilder().headers(request.headers()).body((ResponseBody)new f((Response)request, (InflaterInputStream)object)).build();
                }
            }
        }
        return object;
    }
}

