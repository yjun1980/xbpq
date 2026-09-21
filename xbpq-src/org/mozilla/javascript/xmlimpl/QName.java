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
import org.mozilla.javascript.xmlimpl.Namespace;
import org.mozilla.javascript.xmlimpl.XMLLibImpl;
import org.mozilla.javascript.xmlimpl.XmlNode$Namespace;
import org.mozilla.javascript.xmlimpl.XmlNode$QName;

final class QName
extends IdScriptableObject {
    private static final int Id_constructor = 1;
    private static final int Id_localName = 1;
    private static final int Id_toSource = 3;
    private static final int Id_toString = 2;
    private static final int Id_uri = 2;
    private static final int MAX_INSTANCE_ID = 2;
    private static final int MAX_PROTOTYPE_ID = 3;
    private static final Object QNAME_TAG = "QName";
    static final long serialVersionUID = 416745167693026750L;
    private XmlNode$QName delegate;
    private XMLLibImpl lib;
    private QName prototype;

    private QName() {
    }

    static QName create(XMLLibImpl xMLLibImpl, Scriptable scriptable, QName qName, XmlNode$QName qName2) {
        QName qName3 = new QName();
        qName3.lib = xMLLibImpl;
        qName3.setParentScope(scriptable);
        qName3.prototype = qName;
        qName3.setPrototype(qName);
        qName3.delegate = qName2;
        return qName3;
    }

    private boolean equals(QName qName) {
        return this.delegate.equals(qName.delegate);
    }

    private Object jsConstructor(Context context, boolean bl, Object[] objectArray) {
        if (!bl && objectArray.length == 1) {
            return this.castToQName(this.lib, context, objectArray[0]);
        }
        if (objectArray.length == 0) {
            return this.constructQName(this.lib, context, Undefined.instance);
        }
        if (objectArray.length == 1) {
            return this.constructQName(this.lib, context, objectArray[0]);
        }
        return this.constructQName(this.lib, context, objectArray[0], objectArray[1]);
    }

    private String js_toSource() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('(');
        QName.toSourceImpl(this.uri(), this.localName(), this.prefix(), stringBuilder);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    private QName realThis(Scriptable scriptable, IdFunctionObject idFunctionObject) {
        return IdScriptableObject.ensureType(scriptable, QName.class, idFunctionObject);
    }

    private static void toSourceImpl(String string, String string2, String string3, StringBuilder stringBuilder) {
        block3: {
            block4: {
                block2: {
                    stringBuilder.append("new QName(");
                    if (string != null || string3 != null) break block2;
                    if ("*".equals(string2)) break block3;
                    string = "null, ";
                    break block4;
                }
                if (string == null) break block3;
                Namespace.toSourceImpl(string3, string, stringBuilder);
                string = ", ";
            }
            stringBuilder.append(string);
        }
        stringBuilder.append('\'');
        stringBuilder.append(ScriptRuntime.escapeString(string2, '\''));
        stringBuilder.append("')");
    }

    QName castToQName(XMLLibImpl xMLLibImpl, Context context, Object object) {
        if (object instanceof QName) {
            return (QName)object;
        }
        return this.constructQName(xMLLibImpl, context, object);
    }

    QName constructQName(XMLLibImpl xMLLibImpl, Context context, Object object) {
        return this.constructQName(xMLLibImpl, context, Undefined.instance, object);
    }

    QName constructQName(XMLLibImpl xMLLibImpl, Context object, Object object2, Object object3) {
        Object object4;
        if (object3 instanceof QName) {
            if (object2 == Undefined.instance) {
                return (QName)object3;
            }
            ((QName)object3).localName();
        }
        String string = object3 == (object4 = Undefined.instance) ? "" : ScriptRuntime.toString(object3);
        Object var6_7 = null;
        object3 = object2;
        if (object2 == object4) {
            object3 = "*".equals(string) ? null : xMLLibImpl.getDefaultNamespace((Context)object);
        }
        object = object3 == null ? null : (object3 instanceof Namespace ? (Namespace)object3 : xMLLibImpl.newNamespace(ScriptRuntime.toString(object3)));
        if (object3 == null) {
            object2 = null;
            object = var6_7;
        } else {
            object3 = ((Namespace)object).uri();
            object2 = ((Namespace)object).prefix();
            object = object3;
        }
        return this.newQName(xMLLibImpl, (String)object, string, (String)object2);
    }

    public boolean equals(Object object) {
        if (!(object instanceof QName)) {
            return false;
        }
        return this.equals((QName)object);
    }

    @Override
    protected Object equivalentValues(Object object) {
        if (!(object instanceof QName)) {
            return Scriptable.NOT_FOUND;
        }
        object = this.equals((QName)object) ? Boolean.TRUE : Boolean.FALSE;
        return object;
    }

    @Override
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        if (!idFunctionObject.hasTag(QNAME_TAG)) {
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

    void exportAsJSClass(boolean bl) {
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
        } else if (n2 == 9) {
            string2 = "localName";
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
        return "QName";
    }

    @Override
    public Object getDefaultValue(Class<?> clazz) {
        return this.toString();
    }

    final XmlNode$QName getDelegate() {
        return this.delegate;
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
        return "localName";
    }

    @Override
    protected Object getInstanceIdValue(int n2) {
        int n3 = n2 - super.getMaxInstanceId();
        if (n3 != 1) {
            if (n3 != 2) {
                return super.getInstanceIdValue(n2);
            }
            return this.uri();
        }
        return this.localName();
    }

    @Override
    protected int getMaxInstanceId() {
        return super.getMaxInstanceId() + 2;
    }

    public int hashCode() {
        return this.delegate.hashCode();
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
        this.initPrototypeMethod(QNAME_TAG, n2, string, n3);
    }

    public String localName() {
        if (this.delegate.getLocalName() == null) {
            return "*";
        }
        return this.delegate.getLocalName();
    }

    QName newQName(XMLLibImpl xMLLibImpl, String object, String string, String string2) {
        QName qName;
        QName qName2 = qName = this.prototype;
        if (qName == null) {
            qName2 = this;
        }
        object = string2 != null ? XmlNode$Namespace.create(string2, (String)object) : (object != null ? XmlNode$Namespace.create((String)object) : null);
        string2 = string;
        if (string != null) {
            string2 = string;
            if (string.equals("*")) {
                string2 = null;
            }
        }
        return QName.create(xMLLibImpl, this.getParentScope(), qName2, XmlNode$QName.create((XmlNode$Namespace)object, string2));
    }

    String prefix() {
        if (this.delegate.getNamespace() == null) {
            return null;
        }
        return this.delegate.getNamespace().getPrefix();
    }

    @Deprecated
    final XmlNode$QName toNodeQname() {
        return this.delegate;
    }

    public String toString() {
        String string;
        StringBuilder stringBuilder;
        if (this.delegate.getNamespace() == null) {
            stringBuilder = new StringBuilder();
            string = "*::";
        } else {
            if (this.delegate.getNamespace().isGlobal()) {
                return this.localName();
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.uri());
            string = "::";
        }
        stringBuilder.append(string);
        stringBuilder.append(this.localName());
        return stringBuilder.toString();
    }

    String uri() {
        if (this.delegate.getNamespace() == null) {
            return null;
        }
        return this.delegate.getNamespace().getUri();
    }
}

