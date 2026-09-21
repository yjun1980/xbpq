/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.commonjs.module.provider;

import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URLConnection;
import java.util.List;
import org.mozilla.javascript.commonjs.module.provider.UrlConnectionExpiryCalculator;

class UrlModuleSourceProvider$URLValidator
implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String entityTags;
    private long expiry;
    private final long lastModified;
    private final URI uri;

    public UrlModuleSourceProvider$URLValidator(URI uRI, URLConnection uRLConnection, long l2, UrlConnectionExpiryCalculator urlConnectionExpiryCalculator) {
        this.uri = uRI;
        this.lastModified = uRLConnection.getLastModified();
        this.entityTags = UrlModuleSourceProvider$URLValidator.getEntityTags(uRLConnection);
        this.expiry = UrlModuleSourceProvider$URLValidator.calculateExpiry(uRLConnection, l2, urlConnectionExpiryCalculator);
    }

    private static long calculateExpiry(URLConnection uRLConnection, long l2, UrlConnectionExpiryCalculator urlConnectionExpiryCalculator) {
        boolean bl = "no-cache".equals(uRLConnection.getHeaderField("Pragma"));
        long l3 = 0L;
        if (bl) {
            return 0L;
        }
        String string = uRLConnection.getHeaderField("Cache-Control");
        if (string != null) {
            if (string.indexOf("no-cache") != -1) {
                return 0L;
            }
            int n2 = UrlModuleSourceProvider$URLValidator.getMaxAge(string);
            if (-1 != n2) {
                long l4 = System.currentTimeMillis();
                l3 = Math.max(Math.max(0L, l4 - uRLConnection.getDate()), (long)uRLConnection.getHeaderFieldInt("Age", 0) * 1000L);
                return (long)n2 * 1000L + (l4 - (l4 - l2 + l3));
            }
        }
        if ((l2 = uRLConnection.getHeaderFieldDate("Expires", -1L)) != -1L) {
            return l2;
        }
        l2 = urlConnectionExpiryCalculator == null ? l3 : urlConnectionExpiryCalculator.calculateExpiry(uRLConnection);
        return l2;
    }

    private static String getEntityTags(URLConnection object) {
        List<String> list = ((URLConnection)object).getHeaderFields().get("ETag");
        if (list != null && !list.isEmpty()) {
            object = new StringBuilder();
            list = list.iterator();
            while (true) {
                ((StringBuilder)object).append((String)list.next());
                if (!list.hasNext()) break;
                ((StringBuilder)object).append(", ");
            }
            return ((StringBuilder)object).toString();
        }
        return null;
    }

    private static int getMaxAge(String string) {
        int n2;
        int n3 = string.indexOf("max-age");
        if (n3 == -1) {
            return -1;
        }
        if ((n3 = string.indexOf(61, n3 + 7)) == -1) {
            return -1;
        }
        string = (n2 = string.indexOf(44, ++n3)) == -1 ? string.substring(n3) : string.substring(n3, n2);
        try {
            n3 = Integer.parseInt(string);
            return n3;
        }
        catch (NumberFormatException numberFormatException) {
            return -1;
        }
    }

    private boolean isResourceChanged(URLConnection uRLConnection) {
        boolean bl = uRLConnection instanceof HttpURLConnection;
        boolean bl2 = true;
        boolean bl3 = true;
        if (bl) {
            bl2 = ((HttpURLConnection)uRLConnection).getResponseCode() != 304 ? bl3 : false;
            return bl2;
        }
        if (this.lastModified == uRLConnection.getLastModified()) {
            bl2 = false;
        }
        return bl2;
    }

    boolean appliesTo(URI uRI) {
        return this.uri.equals(uRI);
    }

    void applyConditionals(URLConnection uRLConnection) {
        String string;
        long l2 = this.lastModified;
        if (l2 != 0L) {
            uRLConnection.setIfModifiedSince(l2);
        }
        if ((string = this.entityTags) != null && string.length() > 0) {
            uRLConnection.addRequestProperty("If-None-Match", this.entityTags);
        }
    }

    boolean entityNeedsRevalidation() {
        boolean bl = System.currentTimeMillis() > this.expiry;
        return bl;
    }

    boolean updateValidator(URLConnection uRLConnection, long l2, UrlConnectionExpiryCalculator urlConnectionExpiryCalculator) {
        boolean bl = this.isResourceChanged(uRLConnection);
        if (!bl) {
            this.expiry = UrlModuleSourceProvider$URLValidator.calculateExpiry(uRLConnection, l2, urlConnectionExpiryCalculator);
        }
        return bl;
    }
}

