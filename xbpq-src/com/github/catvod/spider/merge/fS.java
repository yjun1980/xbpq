/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.graphics.BitmapFactory$Options
 *  android.os.Handler
 *  android.os.Message
 *  android.util.DisplayMetrics
 *  android.util.Log
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.ImageView
 *  android.widget.Toast
 */
package com.github.catvod.spider.merge;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class fS
extends ImageView {
    public boolean S = false;
    private Handler T4 = new Handler(this){
        final fS l8;
        {
            this.l8 = fS2;
        }

        public void handleMessage(Message message) {
            int n2 = message.what;
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 == 3) {
                        Toast.makeText((Context)this.l8.getContext(), (CharSequence)"\u670d\u52a1\u5668\u53d1\u751f\u9519\u8bef", (int)0).show();
                    }
                } else {
                    Toast.makeText((Context)this.l8.getContext(), (CharSequence)"\u7f51\u7edc\u8fde\u63a5\u5931\u8d25", (int)0).show();
                }
            } else {
                message = (Bitmap)message.obj;
                this.l8.setImageBitmap((Bitmap)message);
            }
        }
    };
    private String l8;

    public fS(Context context) {
        super(context);
    }

    static /* synthetic */ Handler S(fS fS2) {
        return fS2.T4;
    }

    static /* synthetic */ String l8(fS fS2) {
        return fS2.l8;
    }

    public void HM(String string) {
        this.l8 = string;
        if (this.S) {
            this.n();
        } else {
            this.v();
        }
    }

    public int N() {
        int n2;
        DisplayMetrics displayMetrics = this.getContext().getResources().getDisplayMetrics();
        ViewGroup.LayoutParams layoutParams = this.getLayoutParams();
        int n3 = n2 = this.getWidth();
        if (n2 <= 0) {
            n3 = layoutParams.width;
        }
        n2 = n3;
        if (n3 <= 0) {
            n2 = this.getMaxWidth();
        }
        n3 = n2;
        if (n2 <= 0) {
            n3 = displayMetrics.widthPixels;
        }
        Log.e((String)"ImageView\u5b9e\u9645\u7684\u5bbd\u5ea6", (String)String.valueOf(n3));
        return n3;
    }

    public int OL(BitmapFactory.Options options) {
        int n2 = this.N();
        int n3 = this.tT();
        int n4 = options.outWidth;
        Log.e((String)"\u7f51\u7edc\u56fe\u7247\u5b9e\u9645\u7684\u5bbd\u5ea6", (String)String.valueOf(n4));
        int n5 = options.outHeight;
        Log.e((String)"\u7f51\u7edc\u56fe\u7247\u5b9e\u9645\u7684\u9ad8\u5ea6", (String)String.valueOf(n5));
        if (n4 <= n2 && n5 <= n3) {
            n3 = 1;
        } else {
            n4 = Math.round(n4 / n2);
            n3 = n5 = Math.round(n5 / n3);
            if (n4 > n5) {
                n3 = n4;
            }
        }
        Log.e((String)"\u538b\u7f29\u6bd4\u7387", (String)String.valueOf(n3));
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void T4(InputStream inputStream) {
        try {
            Object object = new File(this.getContext().getCacheDir(), this.l());
            FileOutputStream fileOutputStream = new FileOutputStream((File)object);
            object = new byte[1024];
            while (true) {
                int n2;
                if ((n2 = inputStream.read((byte[])object)) == -1) {
                    fileOutputStream.close();
                    Log.e((String)"MyImageView", (String)"\u7f13\u5b58\u6210\u529f");
                    return;
                }
                fileOutputStream.write((byte[])object, 0, n2);
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            Log.e((String)"MyImageView", (String)"\u7f13\u5b58\u5931\u8d25");
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Bitmap b(InputStream inputStream) {
        Object object;
        Closeable closeable = new ByteArrayOutputStream();
        try {
            int n2;
            object = new byte[1024];
            while ((n2 = inputStream.read((byte[])object)) > -1) {
                closeable.write((byte[])object, 0, n2);
            }
            closeable.flush();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        inputStream = new ByteArrayInputStream(closeable.toByteArray());
        closeable = new ByteArrayInputStream(closeable.toByteArray());
        object = new BitmapFactory.Options();
        object.inJustDecodeBounds = true;
        BitmapFactory.decodeStream((InputStream)inputStream, null, (BitmapFactory.Options)object);
        object.inSampleSize = this.OL((BitmapFactory.Options)object);
        object.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream((InputStream)closeable, null, (BitmapFactory.Options)object);
    }

    public String l() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = this.l8.split("\\/");
        int n2 = ((String[])object).length;
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append(object[i2]);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("\u6587\u4ef6\u540d\uff1a");
        ((StringBuilder)object).append(stringBuilder.toString());
        Log.e((String)"MyImageView", (String)((StringBuilder)object).toString());
        return stringBuilder.toString();
    }

    public void n() {
        File file = new File(this.getContext().getCacheDir(), this.l());
        if (file.length() > 0L) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                file = this.b(fileInputStream);
                fileInputStream = Message.obtain();
                ((Message)fileInputStream).obj = file;
                ((Message)fileInputStream).what = 1;
                this.T4.sendMessage((Message)fileInputStream);
                Log.e((String)"MyImageView", (String)"\u4f7f\u7528\u7f13\u5b58\u56fe\u7247");
            }
            catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }
        } else {
            this.v();
            Log.e((String)"MyImageView", (String)"\u4f7f\u7528\u7f51\u7edc\u56fe\u7247");
        }
    }

    public int tT() {
        int n2;
        DisplayMetrics displayMetrics = this.getContext().getResources().getDisplayMetrics();
        ViewGroup.LayoutParams layoutParams = this.getLayoutParams();
        int n3 = n2 = this.getHeight();
        if (n2 <= 0) {
            n3 = layoutParams.height;
        }
        n2 = n3;
        if (n3 <= 0) {
            n2 = this.getMaxHeight();
        }
        n3 = n2;
        if (n2 <= 0) {
            n3 = displayMetrics.heightPixels;
        }
        Log.e((String)"ImageView\u5b9e\u9645\u7684\u9ad8\u5ea6", (String)String.valueOf(n3));
        return n3;
    }

    public void v() {
        new Thread(this){
            final fS l8;
            {
                this.l8 = fS2;
            }

            /*
             * Unable to fully structure code
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void run() {
                var2_1 = new URL(fS.l8(this.l8));
                var2_1 = (HttpURLConnection)var2_1.openConnection();
                var2_1.setRequestMethod("GET");
                var2_1.setConnectTimeout(10000);
                if (var2_1.getResponseCode() != 200) ** GOTO lbl35
                var3_3 = var2_1.getInputStream();
                var2_1 = this.l8;
                if (!var2_1.S) ** GOTO lbl26
                var2_1 = new ByteArrayOutputStream();
                try {
                    var4_4 /* !! */  = (Message)new byte[1024];
                    while ((var1_6 = var3_3.read((byte[])var4_4 /* !! */ )) > -1) {
                        var2_1.write((byte[])var4_4 /* !! */ , 0, var1_6);
                    }
                    var2_1.flush();
                    ** GOTO lbl21
                }
                catch (IOException var4_5) {
                    try {
                        block6: {
                            var4_5.printStackTrace();
lbl21:
                            // 2 sources

                            var5_7 = new ByteArrayInputStream(var2_1.toByteArray());
                            var4_4 /* !! */  = new ByteArrayInputStream(var2_1.toByteArray());
                            var2_1 = this.l8.b(var5_7);
                            this.l8.T4((InputStream)var4_4 /* !! */ );
                            break block6;
lbl26:
                            // 1 sources

                            var2_1 = var2_1.b(var3_3);
                        }
                        var4_4 /* !! */  = Message.obtain();
                        var4_4 /* !! */ .obj = var2_1;
                        var4_4 /* !! */ .what = 1;
                        fS.S(this.l8).sendMessage(var4_4 /* !! */ );
                        var3_3.close();
                        return;
lbl35:
                        // 1 sources

                        fS.S(this.l8).sendEmptyMessage(3);
                        return;
                    }
                    catch (IOException var2_2) {
                        var2_2.printStackTrace();
                        fS.S(this.l8).sendEmptyMessage(2);
                    }
                }
            }
        }.start();
    }
}

