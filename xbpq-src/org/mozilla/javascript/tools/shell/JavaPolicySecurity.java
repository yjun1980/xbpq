/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.shell;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.CodeSource;
import java.security.Policy;
import java.security.ProtectionDomain;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.GeneratedClassLoader;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.tools.shell.JavaPolicySecurity$1;
import org.mozilla.javascript.tools.shell.JavaPolicySecurity$2;
import org.mozilla.javascript.tools.shell.JavaPolicySecurity$3;
import org.mozilla.javascript.tools.shell.JavaPolicySecurity$ContextPermissions;
import org.mozilla.javascript.tools.shell.SecurityProxy;

public class JavaPolicySecurity
extends SecurityProxy {
    public JavaPolicySecurity() {
        new CodeSource(null, null);
    }

    static /* synthetic */ URL access$000(JavaPolicySecurity javaPolicySecurity, String string) {
        return javaPolicySecurity.getUrlObj(string);
    }

    static /* synthetic */ ProtectionDomain access$100(JavaPolicySecurity javaPolicySecurity, URL uRL) {
        return javaPolicySecurity.getUrlDomain(uRL);
    }

    private ProtectionDomain getDynamicDomain(ProtectionDomain protectionDomain) {
        return new ProtectionDomain(null, new JavaPolicySecurity$ContextPermissions(protectionDomain));
    }

    private ProtectionDomain getUrlDomain(URL serializable) {
        serializable = new CodeSource((URL)serializable, null);
        return new ProtectionDomain((CodeSource)serializable, Policy.getPolicy().getPermissions((CodeSource)serializable));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private URL getUrlObj(String object) {
        try {
            URL uRL = new URL((String)object);
            return uRL;
        }
        catch (MalformedURLException malformedURLException) {
            CharSequence charSequence = System.getProperty("user.dir").replace('\\', '/');
            Object object2 = charSequence;
            if (!((String)charSequence).endsWith("/")) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)charSequence);
                ((StringBuilder)object2).append('/');
                object2 = ((StringBuilder)object2).toString();
            }
            try {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("file:");
                ((StringBuilder)charSequence).append((String)object2);
                URL uRL = new URL(((StringBuilder)charSequence).toString());
                object2 = new URL(uRL, (String)object);
                return object2;
            }
            catch (MalformedURLException malformedURLException2) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Can not construct file URL for '");
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append("':");
                ((StringBuilder)object2).append(malformedURLException2.getMessage());
                throw new RuntimeException(((StringBuilder)object2).toString());
            }
        }
    }

    @Override
    protected void callProcessFileSecure(Context context, Scriptable scriptable, String string) {
        AccessController.doPrivileged(new JavaPolicySecurity$1(this, string, context, scriptable));
    }

    @Override
    public Object callWithDomain(Object object, Context context, Callable callable, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        object = new AccessControlContext(new ProtectionDomain[]{this.getDynamicDomain((ProtectionDomain)object)});
        return AccessController.doPrivileged(new JavaPolicySecurity$3(this, callable, context, scriptable, scriptable2, objectArray), (AccessControlContext)object);
    }

    @Override
    public GeneratedClassLoader createClassLoader(ClassLoader classLoader, Object object) {
        return AccessController.doPrivileged(new JavaPolicySecurity$2(this, classLoader, (ProtectionDomain)object));
    }

    @Override
    public Object getDynamicSecurityDomain(Object object) {
        return this.getDynamicDomain((ProtectionDomain)object);
    }

    @Override
    public Class<?> getStaticSecurityDomainClassInternal() {
        return ProtectionDomain.class;
    }
}

