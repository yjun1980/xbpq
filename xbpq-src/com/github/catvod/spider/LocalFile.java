/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Environment
 *  android.text.TextUtils
 *  com.github.catvod.crawler.Spider
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.\u0528;
import com.github.catvod.spider.\u052a;
import java.io.File;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class LocalFile
extends Spider {
    public static boolean checkstring(String string) {
        String string2 = SOY.d("5433271F");
        String string3 = SOY.d("54253C00");
        String string4 = SOY.d("54203C");
        String string5 = SOY.d("54613606");
        String string6 = SOY.d("543F3E00");
        String string7 = SOY.d("543F21");
        String string8 = SOY.d("543F65");
        String string9 = SOY.d("54243E14");
        String string10 = SOY.d("542622");
        String string11 = SOY.d("5425341419");
        String string12 = SOY.d("54363002");
        String string13 = SOY.d("543F6203");
        String string14 = SOY.d("543F3A00");
        String string15 = SOY.d("54343D00");
        String string16 = SOY.d("54333015");
        String string17 = SOY.d("54253C17");
        String string18 = SOY.d("54343D1717");
        String string19 = SOY.d("54332113");
        string = string.toLowerCase();
        for (int i2 = 0; i2 < 18; ++i2) {
            if (!string.contains((new String[]{string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, string19})[i2])) continue;
            return true;
        }
        return false;
    }

    static /* synthetic */ int \u0528(File file, File file2) {
        return file.getName().compareTo(file2.getName());
    }

    static /* synthetic */ int \u0529(File file, File file2) {
        return file.getName().compareTo(file2.getName());
    }

    public String categoryContent(String string, String object, boolean bl, HashMap<String, String> fileArray) {
        object = new File(string);
        fileArray = ((File)object).listFiles();
        Arrays.sort(fileArray, \u0528.\u037f);
        object = new JSONArray();
        for (File file : fileArray) {
            String string2 = file.getName();
            if (string2.indexOf(46) == 0) continue;
            string = SOY.d("12262506074D557D381B13590E273A0304070E7C321919580A3C362904051F24381303584A627E474C5848617E31361A380767103C184D7C3B0613565534265946414A");
            if (!file.isDirectory()) {
                string = SOY.d("12262506074D557D381B13590E273A0304070E7C321919580A3C362904051F24381303584A627E4246584F627E450D243D05661B020E237C3B0613565534265946414A");
            }
            if (!file.isDirectory() && !LocalFile.checkstring(string2)) continue;
            string2 = new JSONObject();
            string2.put(SOY.d("0C3D35291D13"), (Object)file.getAbsolutePath());
            string2.put(SOY.d("0C3D35291A161737"), (Object)file.getName());
            string2.put(SOY.d("0C3D3529041E19"), (Object)string);
            String string3 = SOY.d("0C3D352900161D");
            string = file.isDirectory() ? SOY.d("1C3D3D121105") : SOY.d("1C3B3D13");
            string2.put(string3, (Object)string);
            string2.put(SOY.d("0C3D352906121733231D07"), (Object)this.\u037f(file.lastModified(), SOY.d("032B280F5B3A377D35125416321A6B1B194D0921")));
            object.put((Object)string2);
        }
        try {
            string = new JSONObject();
            string.put(SOY.d("0A333613"), 1);
            string.put(SOY.d("0A33361317180F3C25"), 1);
            string.put(SOY.d("163B3C1F00"), object.length());
            string.put(SOY.d("0E3D251718"), object.length());
            string.put(SOY.d("163B2202"), object);
            string = string.toString();
            return string;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return "";
        }
    }

    public String detailContent(List<String> object) {
        Object object2;
        object = object.get(0);
        Object object3 = new File((String)object);
        object3 = ((File)object3).getParent();
        Serializable serializable = new File((String)object3);
        File[] fileArray = ((File)serializable).listFiles();
        Arrays.sort(fileArray, \u052a.\u037f);
        serializable = new ArrayList();
        for (File file : fileArray) {
            String string = file.getName();
            if (string.indexOf(46) == 0 || !file.isFile() || !LocalFile.checkstring(string)) continue;
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(string);
            ((StringBuilder)object2).append(SOY.d("5E"));
            ((StringBuilder)object2).append(file.getAbsolutePath());
            ((ArrayList)serializable).add(((StringBuilder)object2).toString());
        }
        try {
            object2 = new JSONObject();
            object2.put(SOY.d("0C3D35291D13"), object);
            object2.put(SOY.d("0C3D35291A161737"), object3);
            object2.put(SOY.d("0C3D3529041E19"), (Object)"");
            object2.put(SOY.d("0E2B21132B191B3F34"), (Object)"");
            object2.put(SOY.d("0C3D3529041B1B2B0E10061817"), (Object)SOY.d("98CBF49FD2EE93C9D490F7F2"));
            object2.put(SOY.d("0C3D3529041B1B2B0E03061B"), (Object)TextUtils.join((CharSequence)SOY.d("59"), (Iterable)((Object)serializable)));
            object3 = new JSONObject();
            object = new JSONArray();
            object.put(object2);
            object3.put(SOY.d("163B2202"), object);
            object = object3.toString();
            return object;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return "";
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String homeContent(boolean bl) {
        String string;
        JSONObject jSONObject;
        try {
            new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject = new JSONObject();
            string = Environment.getExternalStorageDirectory().getAbsolutePath();
            jSONObject.put(SOY.d("0E2B21132B1E1E"), (Object)string);
            jSONObject.put(SOY.d("0E2B21132B191B3F34"), (Object)SOY.d("9CCEFD93E8C79CC4D692CFC1"));
            jSONObject.put(SOY.d("0E2B21132B11163336"), (Object)SOY.d("4B"));
            jSONArray.put((Object)jSONObject);
            new JSONArray();
            string = new JSONObject();
            string.put(SOY.d("193E300507"), (Object)jSONArray);
            if (!bl) return string.toString();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return "";
        }
        String string2 = SOY.d("1C3B3D02110509");
        jSONObject = new JSONObject(SOY.d("012F"));
        string.put(string2, (Object)jSONObject);
        return string.toString();
    }

    public void init(Context context) {
        super.init(context);
    }

    public String playerContent(String string, String string2, List<String> list) {
        try {
            string = new JSONObject();
            string.put(SOY.d("0A33230511"), 0);
            string.put(SOY.d("0A3E300F210516"), (Object)"");
            string.put(SOY.d("0F203D"), (Object)string2);
            string = string.toString();
            return string;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return "";
        }
    }

    public String searchContent(String string, boolean bl) {
        return "";
    }

    String \u037f(long l2, String string) {
        Comparable<Calendar> comparable = Calendar.getInstance();
        comparable.setTimeInMillis(l2);
        comparable = comparable.getTime();
        return new SimpleDateFormat(string).format((Date)comparable);
    }
}

