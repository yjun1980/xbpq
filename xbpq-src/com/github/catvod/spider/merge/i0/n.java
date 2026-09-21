/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.SpiderDebug
 */
package com.github.catvod.spider.merge.i0;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.c.b;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;

public final class n {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static File a(File object) {
        File file = b.e("subtitles.srt");
        try {
            Object object2 = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse((File)object);
            object2.getDocumentElement().normalize();
            object = new FileWriter(file);
            object2 = object2.getElementsByTagName("text");
            for (int i2 = 0; i2 < object2.getLength(); ++i2) {
                Object object3 = (Element)object2.item(i2);
                double d2 = Double.parseDouble(object3.getAttribute("start"));
                double d3 = Double.parseDouble(object3.getAttribute("dur"));
                object3 = object3.getTextContent().trim();
                CharSequence charSequence = n.b(d2);
                String string = n.b(d2 + d3);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(i2);
                stringBuilder.append("\n");
                ((Writer)object).write(stringBuilder.toString());
                stringBuilder = new StringBuilder();
                stringBuilder.append((String)charSequence);
                stringBuilder.append(" --> ");
                stringBuilder.append(string);
                stringBuilder.append("\n");
                ((Writer)object).write(stringBuilder.toString());
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append((String)object3);
                ((StringBuilder)charSequence).append("\n\n");
                ((Writer)object).write(((StringBuilder)charSequence).toString());
            }
            ((Writer)object).close();
            object = new StringBuilder();
            ((StringBuilder)object).append("\u8f6c\u6362\u5b8c\u6210\uff0cSRT \u6587\u4ef6\u751f\u6210\u5728\uff1a");
            ((StringBuilder)object).append(file.getAbsolutePath());
            SpiderDebug.log((String)((StringBuilder)object).toString());
            return file;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return file;
    }

    private static String b(double d2) {
        return String.format("%02d:%02d:%02d,%03d", (int)(d2 / 3600.0), (int)(d2 % 3600.0 / 60.0), (int)(d2 % 60.0), (int)((d2 - (double)((int)d2)) * 1000.0));
    }
}

