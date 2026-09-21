/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.shell;

import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.nio.charset.Charset;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.tools.shell.FlexibleCompletor;
import org.mozilla.javascript.tools.shell.ShellConsole$JLineShellConsoleV1;
import org.mozilla.javascript.tools.shell.ShellConsole$JLineShellConsoleV2;
import org.mozilla.javascript.tools.shell.ShellConsole$SimpleShellConsole;

public abstract class ShellConsole {
    private static final Class[] BOOLEAN_ARG;
    private static final Class[] CHARSEQ_ARG;
    private static final Class[] NO_ARG;
    private static final Class[] STRING_ARG;

    static {
        NO_ARG = new Class[0];
        BOOLEAN_ARG = new Class[]{Boolean.TYPE};
        STRING_ARG = new Class[]{String.class};
        CHARSEQ_ARG = new Class[]{CharSequence.class};
    }

    protected ShellConsole() {
    }

    static /* synthetic */ Class[] access$000() {
        return NO_ARG;
    }

    static /* synthetic */ Object access$100(Object object, String string, Class[] classArray, Object[] objectArray) {
        return ShellConsole.tryInvoke(object, string, classArray, objectArray);
    }

    static /* synthetic */ Class[] access$200() {
        return STRING_ARG;
    }

    static /* synthetic */ Class[] access$300() {
        return CHARSEQ_ARG;
    }

    public static ShellConsole getConsole(InputStream inputStream, PrintStream printStream, Charset charset) {
        return new ShellConsole$SimpleShellConsole(inputStream, printStream, charset);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ShellConsole getConsole(Scriptable object, Charset charset) {
        Class<?> clazz = ShellConsole.class.getClassLoader();
        ClassLoader classLoader = clazz;
        if (clazz == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        if (classLoader == null) {
            return null;
        }
        try {
            clazz = Kit.classOrNull(classLoader, "jline.console.ConsoleReader");
            if (clazz != null) {
                return ShellConsole.getJLineShellConsoleV2(classLoader, clazz, (Scriptable)object, charset);
            }
            clazz = Kit.classOrNull(classLoader, "jline.ConsoleReader");
            if (clazz == null) return null;
            return ShellConsole.getJLineShellConsoleV1(classLoader, clazz, (Scriptable)object, charset);
        }
        catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
            return null;
        }
    }

    private static ShellConsole$JLineShellConsoleV1 getJLineShellConsoleV1(ClassLoader object, Class<?> clazz, Scriptable object2, Charset charset) {
        Object obj = clazz.getConstructor(new Class[0]).newInstance(new Object[0]);
        ShellConsole.tryInvoke(obj, "setBellEnabled", BOOLEAN_ARG, Boolean.FALSE);
        clazz = Kit.classOrNull((ClassLoader)object, "jline.Completor");
        object2 = new FlexibleCompletor(clazz, (Scriptable)object2);
        object = Proxy.newProxyInstance((ClassLoader)object, new Class[]{clazz}, (InvocationHandler)object2);
        ShellConsole.tryInvoke(obj, "addCompletor", new Class[]{clazz}, object);
        return new ShellConsole$JLineShellConsoleV1(obj, charset);
    }

    private static ShellConsole$JLineShellConsoleV2 getJLineShellConsoleV2(ClassLoader object, Class<?> clazz, Scriptable object2, Charset charset) {
        Object obj = clazz.getConstructor(new Class[0]).newInstance(new Object[0]);
        ShellConsole.tryInvoke(obj, "setBellEnabled", BOOLEAN_ARG, Boolean.FALSE);
        clazz = Kit.classOrNull((ClassLoader)object, "jline.console.completer.Completer");
        object2 = new FlexibleCompletor(clazz, (Scriptable)object2);
        object = Proxy.newProxyInstance((ClassLoader)object, new Class[]{clazz}, (InvocationHandler)object2);
        ShellConsole.tryInvoke(obj, "addCompleter", new Class[]{clazz}, object);
        return new ShellConsole$JLineShellConsoleV2(obj, charset);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Object tryInvoke(Object object, String object2, Class[] classArray, Object ... objectArray) {
        object2 = object.getClass().getDeclaredMethod((String)object2, classArray);
        if (object2 == null) return null;
        try {
            return ((Method)object2).invoke(object, objectArray);
        }
        catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException exception) {
            return null;
        }
    }

    public abstract void flush();

    public abstract InputStream getIn();

    public abstract void print(String var1);

    public abstract void println();

    public abstract void println(String var1);

    public abstract String readLine();

    public abstract String readLine(String var1);
}

