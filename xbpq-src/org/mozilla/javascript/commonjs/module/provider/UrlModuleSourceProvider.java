/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.commonjs.module.provider;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Serializable;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import org.mozilla.javascript.commonjs.module.provider.DefaultUrlConnectionExpiryCalculator;
import org.mozilla.javascript.commonjs.module.provider.ModuleSource;
import org.mozilla.javascript.commonjs.module.provider.ModuleSourceProvider;
import org.mozilla.javascript.commonjs.module.provider.ModuleSourceProviderBase;
import org.mozilla.javascript.commonjs.module.provider.ParsedContentType;
import org.mozilla.javascript.commonjs.module.provider.UrlConnectionExpiryCalculator;
import org.mozilla.javascript.commonjs.module.provider.UrlConnectionSecurityDomainProvider;
import org.mozilla.javascript.commonjs.module.provider.UrlModuleSourceProvider$URLValidator;

public class UrlModuleSourceProvider
extends ModuleSourceProviderBase {
    private static final long serialVersionUID = 1L;
    private final Iterable<URI> fallbackUris;
    private final Iterable<URI> privilegedUris;
    private final UrlConnectionExpiryCalculator urlConnectionExpiryCalculator;
    private final UrlConnectionSecurityDomainProvider urlConnectionSecurityDomainProvider;

    public UrlModuleSourceProvider(Iterable<URI> iterable, Iterable<URI> iterable2) {
        this(iterable, iterable2, new DefaultUrlConnectionExpiryCalculator(), null);
    }

    public UrlModuleSourceProvider(Iterable<URI> iterable, Iterable<URI> iterable2, UrlConnectionExpiryCalculator urlConnectionExpiryCalculator, UrlConnectionSecurityDomainProvider urlConnectionSecurityDomainProvider) {
        this.privilegedUris = iterable;
        this.fallbackUris = iterable2;
        this.urlConnectionExpiryCalculator = urlConnectionExpiryCalculator;
        this.urlConnectionSecurityDomainProvider = urlConnectionSecurityDomainProvider;
    }

    private void close(URLConnection uRLConnection) {
        try {
            uRLConnection.getInputStream().close();
        }
        catch (IOException iOException) {
            this.onFailedClosingUrlConnection(uRLConnection, iOException);
        }
    }

    private Reader getReader(URLConnection uRLConnection) {
        return new InputStreamReader(uRLConnection.getInputStream(), this.getCharacterEncoding(uRLConnection));
    }

    private Object getSecurityDomain(URLConnection object) {
        UrlConnectionSecurityDomainProvider urlConnectionSecurityDomainProvider = this.urlConnectionSecurityDomainProvider;
        object = urlConnectionSecurityDomainProvider == null ? null : urlConnectionSecurityDomainProvider.getSecurityDomain((URLConnection)object);
        return object;
    }

    private ModuleSource loadFromPathList(String string, Object object, Iterable<URI> object2) {
        if (object2 == null) {
            return null;
        }
        object2 = object2.iterator();
        while (object2.hasNext()) {
            Serializable serializable = (URI)object2.next();
            if ((serializable = this.loadFromUri(serializable.resolve(string), (URI)serializable, object)) == null) continue;
            return serializable;
        }
        return null;
    }

    @Override
    protected boolean entityNeedsRevalidation(Object object) {
        boolean bl = !(object instanceof UrlModuleSourceProvider$URLValidator) || ((UrlModuleSourceProvider$URLValidator)object).entityNeedsRevalidation();
        return bl;
    }

    protected String getCharacterEncoding(URLConnection object) {
        String string = ((ParsedContentType)(object = new ParsedContentType(((URLConnection)object).getContentType()))).getEncoding();
        if (string != null) {
            return string;
        }
        if ((object = ((ParsedContentType)object).getContentType()) != null && ((String)object).startsWith("text/")) {
            return "8859_1";
        }
        return "utf-8";
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected ModuleSource loadFromActualUri(URI serializable, URI uRI, Object object) {
        UrlModuleSourceProvider$URLValidator urlModuleSourceProvider$URLValidator;
        void var2_6;
        Object object2 = var2_6 == null ? null : var2_6.toURL();
        object2 = new URL((URL)object2, ((URI)serializable).toString());
        long l2 = System.currentTimeMillis();
        object2 = this.openUrlConnection((URL)object2);
        if (!(urlModuleSourceProvider$URLValidator instanceof UrlModuleSourceProvider$URLValidator) || !(urlModuleSourceProvider$URLValidator = (UrlModuleSourceProvider$URLValidator)urlModuleSourceProvider$URLValidator).appliesTo((URI)serializable)) {
            urlModuleSourceProvider$URLValidator = null;
        }
        if (urlModuleSourceProvider$URLValidator != null) {
            urlModuleSourceProvider$URLValidator.applyConditionals((URLConnection)object2);
        }
        try {
            ((URLConnection)object2).connect();
            if (urlModuleSourceProvider$URLValidator != null && !urlModuleSourceProvider$URLValidator.updateValidator((URLConnection)object2, l2, this.urlConnectionExpiryCalculator)) {
                this.close((URLConnection)object2);
                return ModuleSourceProvider.NOT_MODIFIED;
            }
            Reader reader = this.getReader((URLConnection)object2);
            Object object3 = this.getSecurityDomain((URLConnection)object2);
            urlModuleSourceProvider$URLValidator = new UrlModuleSourceProvider$URLValidator((URI)serializable, (URLConnection)object2, l2, this.urlConnectionExpiryCalculator);
            return new ModuleSource(reader, object3, (URI)serializable, (URI)var2_6, urlModuleSourceProvider$URLValidator);
        }
        catch (IOException iOException) {
            this.close((URLConnection)object2);
            throw iOException;
        }
        catch (RuntimeException runtimeException) {
            this.close((URLConnection)object2);
            throw runtimeException;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return null;
        }
    }

    @Override
    protected ModuleSource loadFromFallbackLocations(String string, Object object) {
        return this.loadFromPathList(string, object, this.fallbackUris);
    }

    @Override
    protected ModuleSource loadFromPrivilegedLocations(String string, Object object) {
        return this.loadFromPathList(string, object, this.privilegedUris);
    }

    @Override
    protected ModuleSource loadFromUri(URI serializable, URI uRI, Object object) {
        Serializable serializable2 = new StringBuilder();
        serializable2.append(serializable);
        serializable2.append(".js");
        serializable2 = this.loadFromActualUri(new URI(serializable2.toString()), uRI, object);
        serializable = serializable2 != null ? serializable2 : this.loadFromActualUri((URI)serializable, uRI, object);
        return serializable;
    }

    protected void onFailedClosingUrlConnection(URLConnection uRLConnection, IOException iOException) {
    }

    protected URLConnection openUrlConnection(URL uRL) {
        return uRL.openConnection();
    }
}

