/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger;

import java.awt.Dimension;
import java.io.InputStream;
import java.io.PrintStream;
import javax.swing.JFrame;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.tools.debugger.Dim;
import org.mozilla.javascript.tools.debugger.Main$IProxy;
import org.mozilla.javascript.tools.debugger.ScopeProvider;
import org.mozilla.javascript.tools.debugger.SourceProvider;
import org.mozilla.javascript.tools.debugger.SwingGui;
import org.mozilla.javascript.tools.shell.Global;

public class Main {
    private SwingGui debugGui;
    private Dim dim = new Dim();

    public Main(String string) {
        this.debugGui = new SwingGui(this.dim, string);
    }

    public static void main(String[] stringArray) {
        Main main = new Main("Rhino JavaScript Debugger");
        main.doBreak();
        main.setExitAction(new Main$IProxy(1));
        System.setIn(main.getIn());
        System.setOut(main.getOut());
        System.setErr(main.getErr());
        Global global = org.mozilla.javascript.tools.shell.Main.getGlobal();
        global.setIn(main.getIn());
        global.setOut(main.getOut());
        global.setErr(main.getErr());
        main.attachTo(org.mozilla.javascript.tools.shell.Main.shellContextFactory);
        main.setScope(global);
        main.pack();
        main.setSize(600, 460);
        main.setVisible(true);
        org.mozilla.javascript.tools.shell.Main.exec(stringArray);
    }

    public static Main mainEmbedded(String string) {
        ContextFactory contextFactory = ContextFactory.getGlobal();
        Global global = new Global();
        global.init(contextFactory);
        return Main.mainEmbedded(contextFactory, global, string);
    }

    public static Main mainEmbedded(ContextFactory contextFactory, Scriptable scriptable, String string) {
        return Main.mainEmbeddedImpl(contextFactory, scriptable, string);
    }

    public static Main mainEmbedded(ContextFactory contextFactory, ScopeProvider scopeProvider, String string) {
        return Main.mainEmbeddedImpl(contextFactory, scopeProvider, string);
    }

    private static Main mainEmbeddedImpl(ContextFactory object, Object object2, String object3) {
        String string = object3;
        if (object3 == null) {
            string = "Rhino JavaScript Debugger (embedded usage)";
        }
        object3 = new Main(string);
        ((Main)object3).doBreak();
        ((Main)object3).setExitAction(new Main$IProxy(1));
        ((Main)object3).attachTo((ContextFactory)object);
        if (object2 instanceof ScopeProvider) {
            ((Main)object3).setScopeProvider((ScopeProvider)object2);
        } else {
            if ((object2 = (Scriptable)object2) instanceof Global) {
                object = (Global)object2;
                ((Global)object).setIn(((Main)object3).getIn());
                ((Global)object).setOut(((Main)object3).getOut());
                ((Global)object).setErr(((Main)object3).getErr());
            }
            ((Main)object3).setScope((Scriptable)object2);
        }
        ((Main)object3).pack();
        ((Main)object3).setSize(600, 460);
        ((Main)object3).setVisible(true);
        return object3;
    }

    public void attachTo(ContextFactory contextFactory) {
        this.dim.attachTo(contextFactory);
    }

    public void clearAllBreakpoints() {
        this.dim.clearAllBreakpoints();
    }

    @Deprecated
    public void contextCreated(Context context) {
        throw new IllegalStateException();
    }

    @Deprecated
    public void contextEntered(Context context) {
        throw new IllegalStateException();
    }

    @Deprecated
    public void contextExited(Context context) {
        throw new IllegalStateException();
    }

    @Deprecated
    public void contextReleased(Context context) {
        throw new IllegalStateException();
    }

    public void detach() {
        this.dim.detach();
    }

    public void dispose() {
        this.clearAllBreakpoints();
        this.dim.go();
        this.debugGui.dispose();
        this.dim = null;
    }

    public void doBreak() {
        this.dim.setBreak();
    }

    public JFrame getDebugFrame() {
        return this.debugGui;
    }

    public PrintStream getErr() {
        return this.debugGui.getConsole().getErr();
    }

    public InputStream getIn() {
        return this.debugGui.getConsole().getIn();
    }

    public PrintStream getOut() {
        return this.debugGui.getConsole().getOut();
    }

    public void go() {
        this.dim.go();
    }

    public boolean isVisible() {
        return this.debugGui.isVisible();
    }

    public void pack() {
        this.debugGui.pack();
    }

    public void setBreakOnEnter(boolean bl) {
        this.dim.setBreakOnEnter(bl);
        this.debugGui.getMenubar().getBreakOnEnter().setSelected(bl);
    }

    public void setBreakOnExceptions(boolean bl) {
        this.dim.setBreakOnExceptions(bl);
        this.debugGui.getMenubar().getBreakOnExceptions().setSelected(bl);
    }

    public void setBreakOnReturn(boolean bl) {
        this.dim.setBreakOnReturn(bl);
        this.debugGui.getMenubar().getBreakOnReturn().setSelected(bl);
    }

    public void setExitAction(Runnable runnable) {
        this.debugGui.setExitAction(runnable);
    }

    @Deprecated
    public void setOptimizationLevel(int n2) {
    }

    public void setScope(Scriptable scriptable) {
        this.setScopeProvider(Main$IProxy.newScopeProvider(scriptable));
    }

    public void setScopeProvider(ScopeProvider scopeProvider) {
        this.dim.setScopeProvider(scopeProvider);
    }

    public void setSize(int n2, int n3) {
        this.debugGui.setSize(n2, n3);
    }

    @Deprecated
    public void setSize(Dimension dimension) {
        this.debugGui.setSize(dimension.width, dimension.height);
    }

    public void setSourceProvider(SourceProvider sourceProvider) {
        this.dim.setSourceProvider(sourceProvider);
    }

    public void setVisible(boolean bl) {
        this.debugGui.setVisible(bl);
    }
}

