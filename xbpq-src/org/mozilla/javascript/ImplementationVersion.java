/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.io.IOException;
import java.io.InputStream;
import java.util.jar.Manifest;

public class ImplementationVersion {
    private static final ImplementationVersion version = new ImplementationVersion();
    private String versionString;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private ImplementationVersion() {
        super();
        try {
            var1_1 = ImplementationVersion.class.getClassLoader().getResources("META-INF/MANIFEST.MF");
        }
        catch (IOException var1_2) {
            return;
        }
        while (true) {
            if (!var1_1.hasMoreElements()) {
                this.versionString = "Rhino Snapshot";
                return;
            }
            var2_3 = var1_1.nextElement();
            var2_3 = var2_3.openStream();
            var3_6 = new Manifest((InputStream)var2_3);
            var4_8 = var3_6.getMainAttributes();
            if (!"Mozilla Rhino".equals(var4_8.getValue("Implementation-Title"))) ** GOTO lbl35
            var3_6 = new StringBuilder(23);
            var3_6.append("Rhino ");
            var3_6.append(var4_8.getValue("Implementation-Version"));
            var4_8 = var4_8.getValue("Built-Date");
            if (var4_8 != null) {
                var4_8 = var4_8.replaceAll("-", " ");
                var3_6.append(' ');
                var3_6.append((String)var4_8);
            }
            this.versionString = var3_6.toString();
            if (var2_3 == null) return;
            var2_3.close();
            return;
lbl35:
            // 1 sources

            if (var2_3 == null) continue;
            var2_3.close();
            catch (Throwable var4_9) {
                try {
                    throw var4_9;
                }
                catch (Throwable var3_7) {
                    if (var2_3 == null) throw var3_7;
                    try {
                        var2_3.close();
                        throw var3_7;
                    }
                    catch (Throwable var2_4) {
                        try {
                            var4_9.addSuppressed(var2_4);
                            throw var3_7;
                        }
                        catch (IOException var2_5) {
                        }
                    }
                }
            }
        }
    }

    public static String get() {
        return ImplementationVersion.version.versionString;
    }
}

