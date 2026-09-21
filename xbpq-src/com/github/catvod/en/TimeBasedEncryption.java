/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
package com.github.catvod.en;

import android.util.Base64;
import java.security.Key;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import javax.crypto.Cipher;

public class TimeBasedEncryption {
    private static PublicKey a;

    static {
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(Base64.decode((String)"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAv70LA/hdYBX4q6Ssv63LgPUMCgGNeodU8kgiTYjFbS7JssMKNMCKEi6c4OKv4n2ovXcutysHAPh6lnis6WEp4YJILsh8uAQO5xm7bRGcxKoGZkPzg4aTByKA7eIcv4rz2HIqjRpG8zwlILpGHWrDbwnH2gKidR3X74mXrDLOnUc3pr3n8MhtpfQtKuGqgi8ys7UMRHmEWpy+gkD0xQLc8uv9r3nCJnom1hgBcBDtbIthQHlHme9CCM7lfx7++Wu/lgSvcqdNx9kkBFyKMJgofLn1dt2ercDWwpSlhNjuJw7V70ws46v+ddFK+lYp3oinCCMncnpAMRHVGFe70ZT+fwIDAQAB", (int)0));
            PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(Base64.decode((String)"FIXED_PRIVATE_KEY", (int)0));
            a = keyFactory.generatePublic(x509EncodedKeySpec);
            keyFactory.generatePrivate(pKCS8EncodedKeySpec);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static String encrypt(String object) {
        Object object2 = new SimpleDateFormat("yyyyMMddHHmm");
        ((DateFormat)object2).setTimeZone(TimeZone.getTimeZone("UTC"));
        object2 = ((DateFormat)object2).format(new Date());
        Object object3 = new StringBuilder();
        ((StringBuilder)object3).append((String)object);
        ((StringBuilder)object3).append(":");
        ((StringBuilder)object3).append((String)object2);
        object2 = ((StringBuilder)object3).toString().getBytes();
        object = a;
        object3 = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        ((Cipher)object3).init(1, (Key)object);
        return Base64.encodeToString((byte[])((Cipher)object3).doFinal((byte[])object2), (int)0);
    }

    public static String extracted(String string) {
        return TimeBasedEncryption.encrypt(string);
    }
}

