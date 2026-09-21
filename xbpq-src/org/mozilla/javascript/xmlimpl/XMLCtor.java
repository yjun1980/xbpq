/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.xmlimpl;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.xmlimpl.XML;
import org.mozilla.javascript.xmlimpl.XMLList;
import org.mozilla.javascript.xmlimpl.XmlProcessor;

class XMLCtor
extends IdFunctionObject {
    private static final int Id_defaultSettings = 1;
    private static final int Id_ignoreComments = 1;
    private static final int Id_ignoreProcessingInstructions = 2;
    private static final int Id_ignoreWhitespace = 3;
    private static final int Id_prettyIndent = 4;
    private static final int Id_prettyPrinting = 5;
    private static final int Id_setSettings = 3;
    private static final int Id_settings = 2;
    private static final int MAX_FUNCTION_ID = 3;
    private static final int MAX_INSTANCE_ID = 5;
    private static final Object XMLCTOR_TAG = "XMLCtor";
    static final long serialVersionUID = -8708195078359817341L;
    private XmlProcessor options;

    XMLCtor(XML xML, Object object, int n2, int n3) {
        super(xML, object, n2, n3);
        this.options = xML.getProcessor();
        this.activatePrototypeMap(3);
    }

    private void readSettings(Scriptable scriptable) {
        for (int i2 = 1; i2 <= 5; ++i2) {
            Object object;
            int n2;
            block5: {
                block3: {
                    block4: {
                        n2 = super.getMaxInstanceId() + i2;
                        object = ScriptableObject.getProperty(scriptable, this.getInstanceIdName(n2));
                        if (object == Scriptable.NOT_FOUND) continue;
                        if (i2 == 1 || i2 == 2 || i2 == 3) break block3;
                        if (i2 == 4) break block4;
                        if (i2 != 5) {
                            throw new IllegalStateException();
                        }
                        break block3;
                    }
                    if (!(object instanceof Number)) {
                        continue;
                    }
                    break block5;
                }
                if (!(object instanceof Boolean)) continue;
            }
            this.setInstanceIdValue(n2, object);
        }
    }

    private void writeSetting(Scriptable scriptable) {
        for (int i2 = 1; i2 <= 5; ++i2) {
            int n2 = super.getMaxInstanceId() + i2;
            ScriptableObject.putProperty(scriptable, this.getInstanceIdName(n2), this.getInstanceIdValue(n2));
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public Object execIdCall(IdFunctionObject scriptable, Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objectArray) {
        void var5_6;
        void var3_4;
        void var2_3;
        if (!((IdFunctionObject)scriptable).hasTag(XMLCTOR_TAG)) {
            void var4_5;
            return super.execIdCall((IdFunctionObject)scriptable, (Context)var2_3, (Scriptable)var3_4, (Scriptable)var4_5, (Object[])var5_6);
        }
        int n2 = ((IdFunctionObject)scriptable).methodId();
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) throw new IllegalArgumentException(String.valueOf(n2));
                if (((void)var5_6).length != 0 && var5_6[0] != null && var5_6[0] != Undefined.instance) {
                    if (!(var5_6[0] instanceof Scriptable)) return Undefined.instance;
                    this.readSettings((Scriptable)var5_6[0]);
                    return Undefined.instance;
                }
                this.options.setDefault();
                return Undefined.instance;
            }
        } else {
            this.options.setDefault();
        }
        Scriptable scriptable4 = var2_3.newObject((Scriptable)var3_4);
        this.writeSetting(scriptable4);
        return scriptable4;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected int findInstanceIdInfo(String var1_1) {
        block10: {
            block7: {
                block8: {
                    block9: {
                        var2_2 = var1_1.length();
                        var3_3 = 0;
                        if (var2_2 == 12) break block7;
                        if (var2_2 == 14) break block8;
                        if (var2_2 == 16) break block9;
                        if (var2_2 != 28) ** GOTO lbl-1000
                        var4_4 = "ignoreProcessingInstructions";
                        var2_2 = 2;
                        break block10;
                    }
                    var4_4 = "ignoreWhitespace";
                    var2_2 = 3;
                    break block10;
                }
                var2_2 = var1_1.charAt(0);
                if (var2_2 == 105) {
                    var4_4 = "ignoreComments";
                    var2_2 = 1;
                } else if (var2_2 == 112) {
                    var4_4 = "prettyPrinting";
                    var2_2 = 5;
                } else lbl-1000:
                // 2 sources

                {
                    var4_4 = null;
                    var2_2 = 0;
                }
                break block10;
            }
            var4_4 = "prettyIndent";
            var2_2 = 4;
        }
        if (var4_4 != null && var4_4 != var1_1 && !var4_4.equals(var1_1)) {
            var2_2 = var3_3;
        }
        if (var2_2 == 0) {
            return super.findInstanceIdInfo(var1_1);
        }
        if (var2_2 != 1 && var2_2 != 2 && var2_2 != 3 && var2_2 != 4 && var2_2 != 5) {
            throw new IllegalStateException();
        }
        return IdScriptableObject.instanceIdInfo(6, super.getMaxInstanceId() + var2_2);
    }

    @Override
    protected int findPrototypeId(String string) {
        int n2;
        block6: {
            String string2;
            n2 = string.length();
            int n3 = 0;
            if (n2 == 8) {
                n2 = 2;
                string2 = "settings";
            } else if (n2 == 11) {
                n2 = 3;
                string2 = "setSettings";
            } else if (n2 == 15) {
                n2 = 1;
                string2 = "defaultSettings";
            } else {
                string2 = null;
                n2 = 0;
            }
            if (string2 == null || string2 == string || string2.equals(string)) break block6;
            n2 = n3;
        }
        return n2;
    }

    @Override
    protected String getInstanceIdName(int n2) {
        int n3 = n2 - super.getMaxInstanceId();
        if (n3 != 1) {
            if (n3 != 2) {
                if (n3 != 3) {
                    if (n3 != 4) {
                        if (n3 != 5) {
                            return super.getInstanceIdName(n2);
                        }
                        return "prettyPrinting";
                    }
                    return "prettyIndent";
                }
                return "ignoreWhitespace";
            }
            return "ignoreProcessingInstructions";
        }
        return "ignoreComments";
    }

    @Override
    protected Object getInstanceIdValue(int n2) {
        int n3 = n2 - super.getMaxInstanceId();
        if (n3 != 1) {
            if (n3 != 2) {
                if (n3 != 3) {
                    if (n3 != 4) {
                        if (n3 != 5) {
                            return super.getInstanceIdValue(n2);
                        }
                        return ScriptRuntime.wrapBoolean(this.options.isPrettyPrinting());
                    }
                    return ScriptRuntime.wrapInt(this.options.getPrettyIndent());
                }
                return ScriptRuntime.wrapBoolean(this.options.isIgnoreWhitespace());
            }
            return ScriptRuntime.wrapBoolean(this.options.isIgnoreProcessingInstructions());
        }
        return ScriptRuntime.wrapBoolean(this.options.isIgnoreComments());
    }

    @Override
    protected int getMaxInstanceId() {
        return super.getMaxInstanceId() + 5;
    }

    @Override
    public boolean hasInstance(Scriptable scriptable) {
        boolean bl = scriptable instanceof XML || scriptable instanceof XMLList;
        return bl;
    }

    @Override
    protected void initPrototypeId(int n2) {
        String string;
        int n3;
        block3: {
            block4: {
                block0: {
                    block1: {
                        block2: {
                            n3 = 1;
                            if (n2 == 1) break block0;
                            if (n2 == 2) break block1;
                            if (n2 != 3) break block2;
                            string = "setSettings";
                            break block3;
                        }
                        throw new IllegalArgumentException(String.valueOf(n2));
                    }
                    string = "settings";
                    break block4;
                }
                string = "defaultSettings";
            }
            n3 = 0;
        }
        this.initPrototypeMethod(XMLCTOR_TAG, n2, string, n3);
    }

    @Override
    protected void setInstanceIdValue(int n2, Object object) {
        int n3 = n2 - super.getMaxInstanceId();
        if (n3 != 1) {
            if (n3 != 2) {
                if (n3 != 3) {
                    if (n3 != 4) {
                        if (n3 != 5) {
                            super.setInstanceIdValue(n2, object);
                            return;
                        }
                        this.options.setPrettyPrinting(ScriptRuntime.toBoolean(object));
                        return;
                    }
                    this.options.setPrettyIndent(ScriptRuntime.toInt32(object));
                    return;
                }
                this.options.setIgnoreWhitespace(ScriptRuntime.toBoolean(object));
                return;
            }
            this.options.setIgnoreProcessingInstructions(ScriptRuntime.toBoolean(object));
            return;
        }
        this.options.setIgnoreComments(ScriptRuntime.toBoolean(object));
    }
}

