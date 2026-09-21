/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.xmlimpl;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.xmlimpl.QName;
import org.mozilla.javascript.xmlimpl.XMLName;
import org.mozilla.javascript.xmlimpl.XmlNode$Namespace;

class Namespace
extends IdScriptableObject {
    private static final int Id_constructor = 1;
    private static final int Id_prefix = 1;
    private static final int Id_toSource = 3;
    private static final int Id_toString = 2;
    private static final int Id_uri = 2;
    private static final int MAX_INSTANCE_ID = 2;
    private static final int MAX_PROTOTYPE_ID = 3;
    private static final Object NAMESPACE_TAG = "Namespace";
    static final long serialVersionUID = -5765755238131301744L;
    private XmlNode$Namespace ns;
    private Namespace prototype;

    private Namespace() {
    }

    private Namespace constructNamespace() {
        return this.newNamespace("", "");
    }

    private Namespace constructNamespace(Object object, Object object2) {
        String string;
        if (object2 instanceof QName) {
            QName qName = (QName)object2;
            string = qName.uri();
            object2 = string;
            if (string == null) {
                object2 = qName.toString();
            }
        } else {
            object2 = ScriptRuntime.toString(object2);
        }
        int n2 = ((String)object2).length();
        string = "";
        if (n2 == 0) {
            if (object == Undefined.instance) {
                object = string;
            } else if (((String)(object = ScriptRuntime.toString(object))).length() != 0) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Illegal prefix '");
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append("' for 'no namespace'.");
                throw ScriptRuntime.typeError(((StringBuilder)object2).toString());
            }
        } else {
            object = object == Undefined.instance ? string : (!XMLName.accept(object) ? string : ScriptRuntime.toString(object));
        }
        return this.newNamespace((String)object, (String)object2);
    }

    static Namespace create(Scriptable scriptable, Namespace namespace, XmlNode$Namespace namespace2) {
        Namespace namespace3 = new Namespace();
        namespace3.setParentScope(scriptable);
        namespace3.prototype = namespace;
        namespace3.setPrototype(namespace);
        namespace3.ns = namespace2;
        return namespace3;
    }

    private boolean equals(Namespace namespace) {
        return this.uri().equals(namespace.uri());
    }

    private Object jsConstructor(Context context, boolean bl, Object[] objectArray) {
        if (!bl && objectArray.length == 1) {
            return this.castToNamespace(objectArray[0]);
        }
        if (objectArray.length == 0) {
            return this.constructNamespace();
        }
        if (objectArray.length == 1) {
            return this.constructNamespace(objectArray[0]);
        }
        return this.constructNamespace(objectArray[0], objectArray[1]);
    }

    private String js_toSource() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('(');
        Namespace.toSourceImpl(this.ns.getPrefix(), this.ns.getUri(), stringBuilder);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    private Namespace realThis(Scriptable scriptable, IdFunctionObject idFunctionObject) {
        return IdScriptableObject.ensureType(scriptable, Namespace.class, idFunctionObject);
    }

    static void toSourceImpl(String string, String string2, StringBuilder stringBuilder) {
        stringBuilder.append("new Namespace(");
        if (string2.length() == 0) {
            if (!"".equals(string)) {
                throw new IllegalArgumentException(string);
            }
        } else {
            stringBuilder.append('\'');
            if (string != null) {
                stringBuilder.append(ScriptRuntime.escapeString(string, '\''));
                stringBuilder.append("', '");
            }
            stringBuilder.append(ScriptRuntime.escapeString(string2, '\''));
            stringBuilder.append('\'');
        }
        stringBuilder.append(')');
    }

    Namespace castToNamespace(Object object) {
        if (object instanceof Namespace) {
            return (Namespace)object;
        }
        return this.constructNamespace(object);
    }

    /*
     * Enabled aggressive block sorting
     */
    Namespace constructNamespace(Object object) {
        Object object2;
        if (object instanceof Namespace) {
            object2 = (Namespace)object;
            object = ((Namespace)object2).prefix();
            object2 = ((Namespace)object2).uri();
            return this.newNamespace((String)object, (String)object2);
        }
        if (object instanceof QName) {
            object2 = ((QName)(object = (QName)object)).uri();
            if (object2 != null) {
                object = ((QName)object).prefix();
                return this.newNamespace((String)object, (String)object2);
            }
            object2 = ((QName)object).toString();
        } else {
            object2 = object = ScriptRuntime.toString(object);
            if (((String)object).length() == 0) {
                String string = "";
                object2 = object;
                object = string;
                return this.newNamespace((String)object, (String)object2);
            }
        }
        object = null;
        return this.newNamespace((String)object, (String)object2);
    }

    public boolean equals(Object object) {
        if (!(object instanceof Namespace)) {
            return false;
        }
        return this.equals((Namespace)object);
    }

    @Override
    protected Object equivalentValues(Object object) {
        if (!(object instanceof Namespace)) {
            return Scriptable.NOT_FOUND;
        }
        object = this.equals((Namespace)object) ? Boolean.TRUE : Boolean.FALSE;
        return object;
    }

    @Override
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        if (!idFunctionObject.hasTag(NAMESPACE_TAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objectArray);
        }
        int n2 = idFunctionObject.methodId();
        boolean bl = true;
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 == 3) {
                    return this.realThis(scriptable2, idFunctionObject).js_toSource();
                }
                throw new IllegalArgumentException(String.valueOf(n2));
            }
            return this.realThis(scriptable2, idFunctionObject).toString();
        }
        if (scriptable2 != null) {
            bl = false;
        }
        return this.jsConstructor(context, bl, objectArray);
    }

    public void exportAsJSClass(boolean bl) {
        this.exportAsJSClass(3, this.getParentScope(), bl);
    }

    @Override
    protected int findInstanceIdInfo(String string) {
        String string2;
        int n2 = string.length();
        int n3 = 0;
        if (n2 == 3) {
            string2 = "uri";
            n2 = 2;
        } else if (n2 == 6) {
            string2 = "prefix";
            n2 = 1;
        } else {
            string2 = null;
            n2 = 0;
        }
        if (string2 != null && string2 != string && !string2.equals(string)) {
            n2 = n3;
        }
        if (n2 == 0) {
            return super.findInstanceIdInfo(string);
        }
        if (n2 != 1 && n2 != 2) {
            throw new IllegalStateException();
        }
        return IdScriptableObject.instanceIdInfo(5, super.getMaxInstanceId() + n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected int findPrototypeId(String string) {
        String string2;
        int n2 = string.length();
        int n3 = 3;
        int n4 = 0;
        if (n2 == 8) {
            n2 = string.charAt(3);
            if (n2 == 111) {
                string2 = "toSource";
            } else {
                if (n2 != 116) return 0;
                n3 = 2;
                string2 = "toString";
            }
        } else {
            if (n2 != 11) return 0;
            n3 = 1;
            string2 = "constructor";
        }
        if (string2 == null) return n3;
        if (string2 == string) return n3;
        if (string2.equals(string)) return n3;
        return n4;
    }

    @Override
    public String getClassName() {
        return "Namespace";
    }

    @Override
    public Object getDefaultValue(Class<?> clazz) {
        return this.uri();
    }

    final XmlNode$Namespace getDelegate() {
        return this.ns;
    }

    @Override
    protected String getInstanceIdName(int n2) {
        int n3 = n2 - super.getMaxInstanceId();
        if (n3 != 1) {
            if (n3 != 2) {
                return super.getInstanceIdName(n2);
            }
            return "uri";
        }
        return "prefix";
    }

    @Override
    protected Object getInstanceIdValue(int n2) {
        int n3 = n2 - super.getMaxInstanceId();
        if (n3 != 1) {
            if (n3 != 2) {
                return super.getInstanceIdValue(n2);
            }
            return this.ns.getUri();
        }
        if (this.ns.getPrefix() == null) {
            return Undefined.instance;
        }
        return this.ns.getPrefix();
    }

    @Override
    protected int getMaxInstanceId() {
        return super.getMaxInstanceId() + 2;
    }

    public int hashCode() {
        return this.uri().hashCode();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected void initPrototypeId(int n2) {
        String string;
        int n3 = 0;
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) throw new IllegalArgumentException(String.valueOf(n2));
                string = "toSource";
            } else {
                string = "toString";
            }
        } else {
            string = "constructor";
            n3 = 2;
        }
        this.initPrototypeMethod(NAMESPACE_TAG, n2, string, n3);
    }

    Namespace newNamespace(String string) {
        Namespace namespace;
        Namespace namespace2 = namespace = this.prototype;
        if (namespace == null) {
            namespace2 = this;
        }
        return Namespace.create(this.getParentScope(), namespace2, XmlNode$Namespace.create(string));
    }

    Namespace newNamespace(String string, String string2) {
        Namespace namespace;
        if (string == null) {
            return this.newNamespace(string2);
        }
        Namespace namespace2 = namespace = this.prototype;
        if (namespace == null) {
            namespace2 = this;
        }
        return Namespace.create(this.getParentScope(), namespace2, XmlNode$Namespace.create(string, string2));
    }

    public String prefix() {
        return this.ns.getPrefix();
    }

    public String toLocaleString() {
        return this.toString();
    }

    public String toString() {
        return this.uri();
    }

    public String uri() {
        return this.ns.getUri();
    }
}

