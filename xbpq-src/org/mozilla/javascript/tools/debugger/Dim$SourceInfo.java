/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger;

import org.mozilla.javascript.debug.DebuggableScript;
import org.mozilla.javascript.tools.debugger.Dim$1;
import org.mozilla.javascript.tools.debugger.Dim$FunctionSource;

public class Dim$SourceInfo {
    private static final boolean[] EMPTY_BOOLEAN_ARRAY = new boolean[0];
    private boolean[] breakableLines;
    private boolean[] breakpoints;
    private Dim$FunctionSource[] functionSources;
    private String source;
    private String url;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private Dim$SourceInfo(String object, DebuggableScript[] debuggableScriptArray, String object2) {
        int[] nArray;
        boolean bl;
        int n2;
        block19: {
            void var4_11;
            int n3;
            void var4_7;
            this.source = object;
            this.url = object2;
            n2 = debuggableScriptArray.length;
            object = new int[n2][];
            bl = false;
            boolean bl2 = false;
            while (var4_7 != n2) {
                object[var4_7] = debuggableScriptArray[var4_7].getLineNumbers();
                ++var4_7;
            }
            nArray = new int[n2];
            int n4 = 0;
            boolean bl3 = false;
            int n5 = -1;
            while (true) {
                Object object3;
                block23: {
                    int n6;
                    Object object4;
                    block25: {
                        block24: {
                            block22: {
                                block20: {
                                    block21: {
                                        if (n4 == n2) break block20;
                                        object2 = object[n4];
                                        if (object2 == null || ((Object)object2).length == 0) break block21;
                                        object4 = object3 = (Object)object2[0];
                                        break block22;
                                    }
                                    nArray[n4] = -1;
                                    object3 = n5;
                                    break block23;
                                }
                                if (n6 > n5) {
                                    object = EMPTY_BOOLEAN_ARRAY;
                                    this.breakableLines = (boolean[])object;
                                    this.breakpoints = (boolean[])object;
                                    break block19;
                                } else {
                                    if (n6 < 0) {
                                        throw new IllegalStateException(String.valueOf(n6));
                                    }
                                    int n7 = n5 + 1;
                                    this.breakableLines = new boolean[n7];
                                    this.breakpoints = new boolean[n7];
                                    boolean bl4 = false;
                                    break;
                                }
                            }
                            for (n3 = 1; n3 != ((Object)object2).length; ++n3) {
                                Object object5;
                                Object object6;
                                Object object7 = object2[n3];
                                if (object7 < object3) {
                                    object6 = object7;
                                    object5 = object4;
                                } else {
                                    object6 = object3;
                                    object5 = object4;
                                    if (object7 > object4) {
                                        object5 = object7;
                                        object6 = object3;
                                    }
                                }
                                object3 = object6;
                                object4 = object5;
                            }
                            nArray[n4] = object3;
                            if (n6 <= n5) break block24;
                            n3 = object3;
                            break block25;
                        }
                        n3 = n6;
                        if (object3 < n6) {
                            n3 = object3;
                        }
                        n6 = n3;
                        object3 = n5;
                        if (object4 <= n5) break block23;
                    }
                    object3 = object4;
                    n6 = n3;
                }
                ++n4;
                n5 = object3;
            }
            while (var4_11 != n2) {
                object2 = object[var4_11];
                if (object2 != null && ((Object)object2).length != 0) {
                    for (n3 = 0; n3 != ((Object)object2).length; ++n3) {
                        Object object8 = object2[n3];
                        this.breakableLines[object8] = true;
                    }
                }
                ++var4_11;
            }
        }
        this.functionSources = new Dim$FunctionSource[n2];
        boolean bl5 = bl;
        void var4_13;
        while (var4_13 != n2) {
            object = object2 = debuggableScriptArray[var4_13].getFunctionName();
            if (object2 == null) {
                object = "";
            }
            this.functionSources[var4_13] = new Dim$FunctionSource(this, nArray[var4_13], (String)object, null);
            ++var4_13;
        }
        return;
    }

    /* synthetic */ Dim$SourceInfo(String string, DebuggableScript[] debuggableScriptArray, String string2, Dim$1 dim$1) {
        this(string, debuggableScriptArray, string2);
    }

    static /* synthetic */ void access$200(Dim$SourceInfo dim$SourceInfo, Dim$SourceInfo dim$SourceInfo2) {
        dim$SourceInfo.copyBreakpointsFrom(dim$SourceInfo2);
    }

    static /* synthetic */ boolean[] access$2500(Dim$SourceInfo dim$SourceInfo) {
        return dim$SourceInfo.breakpoints;
    }

    private void copyBreakpointsFrom(Dim$SourceInfo dim$SourceInfo) {
        int n2 = dim$SourceInfo.breakpoints.length;
        boolean[] blArray = this.breakpoints;
        int n3 = n2;
        if (n2 > blArray.length) {
            n3 = blArray.length;
        }
        for (n2 = 0; n2 != n3; ++n2) {
            if (!dim$SourceInfo.breakpoints[n2]) continue;
            this.breakpoints[n2] = true;
        }
    }

    public boolean breakableLine(int n2) {
        boolean[] blArray = this.breakableLines;
        boolean bl = n2 < blArray.length && blArray[n2];
        return bl;
    }

    public boolean breakpoint(int n2) {
        if (this.breakableLine(n2)) {
            boolean[] blArray = this.breakpoints;
            boolean bl = n2 < blArray.length && blArray[n2];
            return bl;
        }
        throw new IllegalArgumentException(String.valueOf(n2));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean breakpoint(int n2, boolean bl) {
        if (!this.breakableLine(n2)) {
            throw new IllegalArgumentException(String.valueOf(n2));
        }
        boolean[] blArray = this.breakpoints;
        synchronized (blArray) {
            boolean[] blArray2 = this.breakpoints;
            if (blArray2[n2] == bl) return false;
            blArray2[n2] = bl;
            return true;
        }
    }

    public Dim$FunctionSource functionSource(int n2) {
        return this.functionSources[n2];
    }

    public int functionSourcesTop() {
        return this.functionSources.length;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void removeAllBreakpoints() {
        boolean[] blArray = this.breakpoints;
        synchronized (blArray) {
            int n2 = 0;
            boolean[] blArray2;
            while (n2 != (blArray2 = this.breakpoints).length) {
                blArray2[n2] = false;
                ++n2;
            }
            return;
        }
    }

    public String source() {
        return this.source;
    }

    public String url() {
        return this.url;
    }
}

