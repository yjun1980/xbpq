/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J0;

import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.J0.b;
import com.github.catvod.spider.merge.J0.d;
import com.github.catvod.spider.merge.J0.g;
import com.github.catvod.spider.merge.J0.h;
import com.github.catvod.spider.merge.J0.n;
import com.github.catvod.spider.merge.J0.p;
import com.github.catvod.spider.merge.J0.r;
import com.github.catvod.spider.merge.J0.t;
import com.github.catvod.spider.merge.y.z;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.StringTokenizer;
import java.util.logging.Level;

public final class j {
    private final h a;
    private final OutputStream b;
    private final BufferedInputStream c;
    private int d;
    private int e;
    private String f;
    private int g;
    private Map<String, List<String>> h;
    private Map<String, String> i;
    private d j;
    private String k;
    private String l;
    private String m;
    final t n;

    public j(t object, h h2, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        this.n = object;
        this.a = h2;
        this.c = new BufferedInputStream(inputStream, 8192);
        this.b = outputStream;
        object = !inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress() ? inetAddress.getHostAddress().toString() : "127.0.0.1";
        this.l = object;
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            Objects.requireNonNull(inetAddress.getHostName());
        }
        this.i = new HashMap<String, String>();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(BufferedReader object, Map<String, String> map, Map<String, List<String>> object2, Map<String, String> map2) {
        Object object3 = com.github.catvod.spider.merge.J0.n.e;
        try {
            String string = ((BufferedReader)object).readLine();
            if (string == null) {
                return;
            }
            Object object4 = new StringTokenizer(string);
            if (!((StringTokenizer)object4).hasMoreTokens()) {
                object = new p((n)object3, "BAD REQUEST: Syntax error. Usage: GET /example/file.html");
                throw object;
            }
            map.put("method", ((StringTokenizer)object4).nextToken());
            if (!((StringTokenizer)object4).hasMoreTokens()) {
                object = new p((n)object3, "BAD REQUEST: Missing URI. Usage: GET /example/file.html");
                throw object;
            }
            object3 = ((StringTokenizer)object4).nextToken();
            int n2 = ((String)object3).indexOf(63);
            if (n2 >= 0) {
                this.c(((String)object3).substring(n2 + 1), (Map<String, List<String>>)object2);
                object2 = t.j(((String)object3).substring(0, n2));
            } else {
                object2 = t.j((String)object3);
            }
            if (((StringTokenizer)object4).hasMoreTokens()) {
                this.m = ((StringTokenizer)object4).nextToken();
            } else {
                this.m = "HTTP/1.1";
                t.c().log(Level.FINE, "no protocol version specified, strange. Assuming HTTP/1.1.");
            }
            while ((object4 = ((BufferedReader)object).readLine()) != null && !((String)object4).trim().isEmpty()) {
                n2 = ((String)object4).indexOf(58);
                if (n2 < 0) continue;
                map2.put(((String)object4).substring(0, n2).trim().toLowerCase(Locale.US), ((String)object4).substring(n2 + 1).trim());
            }
            map.put("uri", (String)object2);
            return;
        }
        catch (IOException iOException) {
            object = com.github.catvod.spider.merge.C.a.c("SERVER INTERNAL ERROR: IOException: ");
            ((StringBuilder)object).append(iOException.getMessage());
            throw new p(((StringBuilder)object).toString(), iOException);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void b(b var1_1, ByteBuffer var2_4, Map<String, List<String>> var3_5, Map<String, String> var4_6) {
        block20: {
            var13_7 = com.github.catvod.spider.merge.J0.n.e;
            var18_8 = com.github.catvod.spider.merge.J0.n.h;
            try {
                var19_9 = this.f(var2_4, var1_1.a().getBytes());
                if (var19_9.length < 2) ** GOTO lbl126
                var20_10 = new byte[1024];
                var7_11 = 0;
                var5_12 = 0;
lbl9:
                // 3 sources

                while (var7_11 < var19_9.length - 1) {
                    var2_4.position(var19_9[var7_11]);
                    var8_14 = var2_4.remaining() < 1024 ? var2_4.remaining() : 1024;
                    var2_4.get(var20_10, 0, var8_14);
                    var11_17 = new ByteArrayInputStream(var20_10, 0, var8_14);
                    var12_18 = new InputStreamReader((InputStream)var11_17, Charset.forName(var1_1.e()));
                    var21_23 = new BufferedReader((Reader)var12_18, var8_14);
                    var11_17 = var21_23.readLine();
                    if (var11_17 == null || !var11_17.contains(var1_1.a())) ** GOTO lbl124
                    var16_21 = var21_23.readLine();
                    var12_18 = null;
                    var15_20 = null;
                    var6_13 = 2;
                    var11_17 = null;
lbl25:
                    // 2 sources

                    while (var16_21 != null && var16_21.trim().length() > 0) {
                        var14_19 = t.d().matcher((CharSequence)var16_21);
                        if (var14_19.matches()) {
                            var14_19 = var14_19.group(2);
                            var17_22 = t.e().matcher((CharSequence)var14_19);
                            while (var17_22.find()) {
                                var22_24 = var17_22.group(1);
                                if ("name".equalsIgnoreCase(var22_24)) {
                                    var14_19 = var17_22.group(2);
                                } else {
                                    var14_19 = var12_18;
                                    if ("filename".equalsIgnoreCase(var22_24)) {
                                        var11_17 = var17_22.group(2);
                                        if (var11_17.isEmpty()) continue;
                                        if (var5_12 > 0) {
                                            var14_19 = new StringBuilder();
                                            var14_19.append((String)var12_18);
                                            var14_19.append(String.valueOf(var5_12));
                                            var12_18 = var14_19.toString();
                                            ++var5_12;
                                            continue;
                                        }
                                        ++var5_12;
                                        continue;
                                    }
                                }
                                var12_18 = var14_19;
                            }
                        }
                        ** GOTO lbl-1000
                    }
                    break block20;
                }
                return;
            }
            catch (Exception var1_2) {
                throw new p(var18_8, var1_2.toString());
            }
            catch (p var1_3) {
                throw var1_3;
            }
lbl-1000:
            // 1 sources

            {
                var14_19 = t.f().matcher((CharSequence)var16_21);
                if (var14_19.matches()) {
                    var15_20 = var14_19.group(2).trim();
                }
                var16_21 = var21_23.readLine();
                ++var6_13;
                ** GOTO lbl25
            }
        }
        var10_16 = 0;
        var9_15 = var6_13;
        var6_13 = var10_16;
        while (var9_15 > 0) {
            do {
                var10_16 = var20_10[var6_13];
                ++var6_13;
            } while (var10_16 != 10);
            --var9_15;
        }
        if (var6_13 >= var8_14 - 4) ** GOTO lbl122
        var6_13 = var19_9[var7_11] + var6_13;
        var8_14 = var19_9[++var7_11];
        {
            var2_4.position(var6_13);
            var16_21 = var3_5.get(var12_18);
            var14_19 = var16_21;
            if (var16_21 == null) {
                var14_19 = new ArrayList();
                var3_5.put((String)var12_18, (List<String>)var14_19);
            }
            var8_14 = var8_14 - 4 - var6_13;
            if (var15_20 != null) ** GOTO lbl96
        }
        {
            block21: {
                var11_17 = new byte[var8_14];
                var2_4.get((byte[])var11_17);
                var12_18 = new String((byte[])var11_17, var1_1.e());
                var14_19.add(var12_18);
                ** GOTO lbl9
lbl96:
                // 1 sources

                var15_20 = this.l(var2_4, var6_13, var8_14, (String)var11_17);
                if (var4_6.containsKey(var12_18)) break block21;
                var4_6.put((String)var12_18, var15_20);
                ** GOTO lbl119
            }
            var6_13 = 2;
            while (true) {
                var16_21 = new StringBuilder();
                var16_21.append((String)var12_18);
                var16_21.append(var6_13);
                if (!var4_6.containsKey(var16_21.toString())) break;
                ++var6_13;
            }
        }
        {
            var16_21 = new StringBuilder();
            var16_21.append((String)var12_18);
            var16_21.append(var6_13);
            var4_6.put(var16_21.toString(), var15_20);
lbl119:
            // 2 sources

            var14_19.add(var11_17);
            ** GOTO lbl9
lbl122:
            // 1 sources

            var1_1 = new p(var18_8, "Multipart header size exceeds MAX_HEADER_SIZE.");
            throw var1_1;
lbl124:
            // 1 sources

            var1_1 = new p(var13_7, "BAD REQUEST: Content type is multipart/form-data but chunk does not start with boundary.");
            throw var1_1;
lbl126:
            // 1 sources

            var1_1 = new p(var13_7, "BAD REQUEST: Content type is multipart/form-data but contains less than two boundary strings.");
            throw var1_1;
        }
    }

    private void c(String string, Map<String, List<String>> map) {
        if (string == null) {
            this.k = "";
            return;
        }
        this.k = string;
        StringTokenizer stringTokenizer = new StringTokenizer(string, "&");
        while (stringTokenizer.hasMoreTokens()) {
            List<String> list;
            String string2;
            string = stringTokenizer.nextToken();
            int n2 = string.indexOf(61);
            if (n2 >= 0) {
                string2 = t.j(string.substring(0, n2)).trim();
                string = t.j(string.substring(n2 + 1));
            } else {
                string2 = t.j(string).trim();
                string = "";
            }
            List<String> list2 = list = map.get(string2);
            if (list == null) {
                list2 = new ArrayList<String>();
                map.put(string2, list2);
            }
            list2.add(string);
        }
    }

    private int e(byte[] byArray, int n2) {
        int n3;
        int n4 = 0;
        while ((n3 = n4 + 1) < n2) {
            int n5;
            if (byArray[n4] == 13 && byArray[n3] == 10 && (n5 = n4 + 3) < n2 && byArray[n4 + 2] == 13 && byArray[n5] == 10) {
                return n4 + 4;
            }
            if (byArray[n4] == 10 && byArray[n3] == 10) {
                return n4 + 2;
            }
            n4 = n3;
        }
        return 0;
    }

    private int[] f(ByteBuffer byteBuffer, byte[] byArray) {
        int[] nArray;
        int[] nArray2 = new int[]{};
        if (byteBuffer.remaining() < byArray.length) {
            return nArray2;
        }
        int n2 = byArray.length + 4096;
        byte[] byArray2 = new byte[n2];
        int n3 = byteBuffer.remaining() < n2 ? byteBuffer.remaining() : n2;
        byteBuffer.get(byArray2, 0, n3);
        int n4 = n3 - byArray.length;
        int n5 = 0;
        do {
            nArray = nArray2;
            for (n3 = 0; n3 < n4; ++n3) {
                nArray2 = nArray;
                for (int i2 = 0; i2 < byArray.length && byArray2[n3 + i2] == byArray[i2]; ++i2) {
                    nArray = nArray2;
                    if (i2 == byArray.length - 1) {
                        nArray = new int[nArray2.length + 1];
                        System.arraycopy(nArray2, 0, nArray, 0, nArray2.length);
                        nArray[nArray2.length] = n5 + n3;
                    }
                    nArray2 = nArray;
                }
                nArray = nArray2;
            }
            n5 += n4;
            System.arraycopy(byArray2, n2 - byArray.length, byArray2, 0, byArray.length);
            n3 = n4 = n2 - byArray.length;
            if (byteBuffer.remaining() < n4) {
                n3 = byteBuffer.remaining();
            }
            byteBuffer.get(byArray2, byArray.length, n3);
            nArray2 = nArray;
            n4 = n3;
        } while (n3 > 0);
        return nArray;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String l(ByteBuffer object, int n2, int n3, String object2) {
        void var5_11;
        block10: {
            block8: {
                Throwable throwable;
                Error error;
                block9: {
                    ByteBuffer byteBuffer;
                    r r2;
                    if (n3 <= 0) {
                        return "";
                    }
                    error = null;
                    throwable = null;
                    object2 = throwable;
                    try {
                        r2 = this.a.b();
                        object2 = throwable;
                        byteBuffer = ((ByteBuffer)object).duplicate();
                        object2 = throwable;
                        object2 = throwable;
                        r2 = (g)r2;
                        object2 = throwable;
                        object = new FileOutputStream(((g)r2).b());
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                    catch (Exception exception) {
                        object = error;
                        break block9;
                    }
                    try {
                        object2 = ((FileOutputStream)object).getChannel();
                        byteBuffer.position(n2).limit(n2 + n3);
                        ((FileChannel)object2).write(byteBuffer.slice());
                        object2 = ((g)r2).b();
                    }
                    catch (Throwable throwable3) {
                        break block10;
                    }
                    catch (Exception exception) {
                        break block9;
                    }
                    t.a(object);
                    return object2;
                }
                object2 = object;
                {
                    object2 = object;
                    error = new Error(throwable);
                    object2 = object;
                    throw error;
                }
            }
            object = object2;
        }
        t.a(object);
        throw var5_11;
    }

    /*
     * Exception decompiling
     */
    public final void d() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 22[TRYBLOCK] [135, 134, 133, 132, 131, 130 : 764->769)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final Map<String, String> g() {
        return this.i;
    }

    public final int h() {
        return this.g;
    }

    @Deprecated
    public final Map<String, String> i() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        for (String string : ((HashMap)this.h).keySet()) {
            hashMap.put(string, (String)((List)((HashMap)this.h).get(string)).get(0));
        }
        return hashMap;
    }

    public final String j() {
        return this.k;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void k(Map<String, String> var1_1) {
        block20: {
            block23: {
                var9_6 = null;
                if (!this.i.containsKey("content-length")) break block23;
                var4_7 = Long.parseLong((String)this.i.get("content-length"));
                ** GOTO lbl18
            }
            var2_10 = this.d;
            var3_11 = this.e;
            if (var2_10 < var3_11) {
            }
            ** GOTO lbl17
            {
                block22: {
                    block21: {
                        block24: {
                            catch (Throwable var1_2) {
                                var8_8 = var9_6;
                                break block20;
                            }
                            var4_7 = var3_11 - var2_10;
                            break block24;
lbl17:
                            // 1 sources

                            var4_7 = 0L;
                        }
                        if (var4_7 < 1024L) {
                            var8_8 = new ByteArrayOutputStream();
                            var10_12 = new DataOutputStream((OutputStream)var8_8);
                            var11_13 = null;
                            var9_6 = var8_8;
                            var8_8 = var11_13;
                        } else {
                            var8_8 = new RandomAccessFile(((g)this.a.b()).b(), "rw");
                            var9_6 = null;
                            var10_12 = var8_8;
                        }
                        try {
                            var11_13 = new byte[512];
lbl32:
                            // 3 sources

                            while (this.e >= 0 && var4_7 > 0L) {
                                this.e = var2_10 = this.c.read(var11_13, 0, (int)Math.min(var4_7, 512L));
                                break block21;
                            }
                            ** GOTO lbl44
                        }
                        catch (Throwable var1_3) {
                            break block20;
                        }
                    }
                    var4_7 = var6_14 = var4_7 - (long)var2_10;
                    if (var2_10 <= 0) ** GOTO lbl32
                    {
                        var10_12.write(var11_13, 0, var2_10);
                        var4_7 = var6_14;
                        ** GOTO lbl32
lbl44:
                        // 1 sources

                        if (var9_6 != null) {
                            var9_6 = ByteBuffer.wrap(var9_6.toByteArray(), 0, var9_6.size());
                        } else {
                            var9_6 = var8_8.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, var8_8.length());
                            var8_8.seek(0L);
                        }
                        if (z.a(3, this.g)) {
                            var10_12 = new b((String)this.i.get("content-type"));
                            if (var10_12.f()) {
                                if (var10_12.a() == null) {
                                    var1_1 = new p(com.github.catvod.spider.merge.J0.n.e, "BAD REQUEST: Content type is multipart/form-data but boundary missing. Usage: GET /example/file.html");
                                    throw var1_1;
                                }
                                this.b((b)var10_12, (ByteBuffer)var9_6, this.h, (Map<String, String>)var1_1);
                                break block22;
                            }
                            var11_13 = new byte[var9_6.remaining()];
                            var9_6.get(var11_13);
                            var9_6 = new String(var11_13, var10_12.e());
                            var9_6 = var9_6.trim();
                            if ("application/x-www-form-urlencoded".equalsIgnoreCase(var10_12.b())) {
                                this.c((String)var9_6, this.h);
                                break block22;
                            }
                            if (var9_6.length() != 0) {
                                var1_1.put("postData", var9_6);
                            }
                            break block22;
                        }
                        if (!z.a(2, this.g)) break block22;
                        var1_1.put((String)"content", (String)this.l((ByteBuffer)var9_6, 0, var9_6.limit(), null));
                    }
                }
                t.a(var8_8);
                return;
                catch (Exception var1_4) {}
                {
                    var8_9 = new Error(var1_4);
                    throw var8_9;
                }
            }
        }
        t.a(var8_8);
        throw var1_5;
    }
}

