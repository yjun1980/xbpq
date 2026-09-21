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
import com.github.catvod.spider.merge.xx;
import java.io.IOException;
import java.util.Map;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

class vV {
    private Request.Builder HM;
    private Request N;
    private final String OL;
    private String S;
    private Object T4 = null;
    private final Map<String, String> b;
    private final Map<String, String> l;
    private final String l8;
    private final xx tT;

    vV(String string, String string2, String string3, Map<String, String> map, xx xx2) {
        this(string, string2, string3, null, map, xx2);
    }

    private vV(String string, String string2, String string3, Map<String, String> map, Map<String, String> map2, xx xx2) {
        this.l8 = string;
        this.S = string2;
        this.OL = string3;
        this.b = map;
        this.l = map2;
        this.tT = xx2;
        this.S();
    }

    vV(String string, String string2, Map<String, String> map, Map<String, String> map2, xx xx2) {
        this(string, string2, null, map, map2, xx2);
    }

    private void OL() {
        Map<String, String> map = this.l;
        if (map != null) {
            for (String string : map.keySet()) {
                this.HM.addHeader(string, this.l.get(string));
            }
        }
    }

    private void S() {
        this.HM = new Request.Builder();
        Object object = this.l8;
        ((String)object).hashCode();
        if (!((String)object).equals("GET")) {
            if (((String)object).equals("POST")) {
                this.HM.post(this.T4());
            }
        } else {
            this.b();
        }
        this.HM.url(this.S);
        object = this.T4;
        if (object != null) {
            this.HM.tag(object);
        }
        if (this.l != null) {
            this.OL();
        }
        this.N = this.HM.build();
    }

    private RequestBody T4() {
        if (!TextUtils.isEmpty((CharSequence)this.OL)) {
            return RequestBody.create((MediaType)MediaType.parse((String)"application/json; charset=utf-8"), (String)this.OL);
        }
        FormBody.Builder builder = new FormBody.Builder();
        Map<String, String> map = this.b;
        if (map != null) {
            for (String string : map.keySet()) {
                builder.add(string, this.b.get(string));
            }
        }
        return builder.build();
    }

    private void b() {
        if (this.b != null) {
            StringBuilder charSequence2 = new StringBuilder();
            charSequence2.append(this.S);
            charSequence2.append("?");
            this.S = charSequence2.toString();
            for (String string : this.b.keySet()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.S);
                stringBuilder.append(string);
                stringBuilder.append("=");
                stringBuilder.append(this.b.get(string));
                stringBuilder.append("&");
                this.S = stringBuilder.toString();
            }
            String string = this.S;
            this.S = string.substring(0, string.length() - 1);
        }
    }

    public void l(Object object) {
        this.T4 = object;
    }

    void l8(OkHttpClient okHttpClient) {
        block3: {
            okHttpClient = okHttpClient.newCall(this.N);
            Object object = okHttpClient.execute();
            xx xx2 = this.tT;
            if (xx2 == null) break block3;
            try {
                xx2.l8((Call)okHttpClient, (Response)object);
            }
            catch (IOException iOException) {
                object = this.tT;
                if (object == null) break block3;
                ((xx)object).onError((Call)okHttpClient, iOException);
            }
        }
    }
}

