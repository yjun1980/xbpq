/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.xmlimpl;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.NativeWith;
import org.mozilla.javascript.Ref;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.xml.XMLObject;
import org.mozilla.javascript.xmlimpl.Namespace;
import org.mozilla.javascript.xmlimpl.QName;
import org.mozilla.javascript.xmlimpl.XML;
import org.mozilla.javascript.xmlimpl.XMLCtor;
import org.mozilla.javascript.xmlimpl.XMLLibImpl;
import org.mozilla.javascript.xmlimpl.XMLList;
import org.mozilla.javascript.xmlimpl.XMLName;
import org.mozilla.javascript.xmlimpl.XMLWithScope;
import org.mozilla.javascript.xmlimpl.XmlNode;
import org.mozilla.javascript.xmlimpl.XmlNode$Namespace;
import org.mozilla.javascript.xmlimpl.XmlNode$QName;
import org.mozilla.javascript.xmlimpl.XmlProcessor;

abstract class XMLObjectImpl
extends XMLObject {
    private static final int Id_addNamespace = 2;
    private static final int Id_appendChild = 3;
    private static final int Id_attribute = 4;
    private static final int Id_attributes = 5;
    private static final int Id_child = 6;
    private static final int Id_childIndex = 7;
    private static final int Id_children = 8;
    private static final int Id_comments = 9;
    private static final int Id_constructor = 1;
    private static final int Id_contains = 10;
    private static final int Id_copy = 11;
    private static final int Id_descendants = 12;
    private static final int Id_elements = 13;
    private static final int Id_hasComplexContent = 18;
    private static final int Id_hasOwnProperty = 17;
    private static final int Id_hasSimpleContent = 19;
    private static final int Id_inScopeNamespaces = 14;
    private static final int Id_insertChildAfter = 15;
    private static final int Id_insertChildBefore = 16;
    private static final int Id_length = 20;
    private static final int Id_localName = 21;
    private static final int Id_name = 22;
    private static final int Id_namespace = 23;
    private static final int Id_namespaceDeclarations = 24;
    private static final int Id_nodeKind = 25;
    private static final int Id_normalize = 26;
    private static final int Id_parent = 27;
    private static final int Id_prependChild = 28;
    private static final int Id_processingInstructions = 29;
    private static final int Id_propertyIsEnumerable = 30;
    private static final int Id_removeNamespace = 31;
    private static final int Id_replace = 32;
    private static final int Id_setChildren = 33;
    private static final int Id_setLocalName = 34;
    private static final int Id_setName = 35;
    private static final int Id_setNamespace = 36;
    private static final int Id_text = 37;
    private static final int Id_toSource = 39;
    private static final int Id_toString = 38;
    private static final int Id_toXMLString = 40;
    private static final int Id_valueOf = 41;
    private static final int MAX_PROTOTYPE_ID = 41;
    private static final Object XMLOBJECT_TAG = "XMLObject";
    private static final long serialVersionUID = -2553684605738101761L;
    private XMLLibImpl lib;
    private boolean prototypeFlag;

    protected XMLObjectImpl(XMLLibImpl xMLLibImpl, Scriptable scriptable, XMLObject xMLObject) {
        this.initialize(xMLLibImpl, scriptable, xMLObject);
    }

    private static Object arg(Object[] object, int n2) {
        object = n2 < ((Object[])object).length ? object[n2] : Undefined.instance;
        return object;
    }

    private XMLList getMatches(XMLName xMLName) {
        XMLList xMLList = this.newXMLList();
        this.addMatches(xMLList, xMLName);
        return xMLList;
    }

    private Object[] toObjectArray(Object[] objectArray) {
        int n2 = objectArray.length;
        Object[] objectArray2 = new Object[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            objectArray2[i2] = objectArray[i2];
        }
        return objectArray2;
    }

    private void xmlMethodNotFound(Object object, String string) {
        throw ScriptRuntime.notFunctionError(object, string);
    }

    abstract void addMatches(XMLList var1, XMLName var2);

    @Override
    public final Object addValues(Context context, boolean bl, Object object) {
        if (object instanceof XMLObject) {
            Object object2;
            object = (XMLObject)object;
            if (bl) {
                object2 = object;
                object = this;
            } else {
                object2 = this;
            }
            return this.lib.addXMLObjects(context, (XMLObject)object, (XMLObject)object2);
        }
        if (object == Undefined.instance) {
            return ScriptRuntime.toString(this);
        }
        return super.addValues(context, bl, object);
    }

    abstract XMLList child(int var1);

    abstract XMLList child(XMLName var1);

    abstract XMLList children();

    abstract XMLList comments();

    abstract boolean contains(Object var1);

    abstract XMLObjectImpl copy();

    final XML createEmptyXML() {
        return this.newXML(XmlNode.createEmpty(this.getProcessor()));
    }

    final Namespace createNamespace(XmlNode$Namespace xmlNode$Namespace) {
        if (xmlNode$Namespace == null) {
            return null;
        }
        return this.lib.createNamespaces(new XmlNode$Namespace[]{xmlNode$Namespace})[0];
    }

    final Namespace[] createNamespaces(XmlNode$Namespace[] xmlNode$NamespaceArray) {
        return this.lib.createNamespaces(xmlNode$NamespaceArray);
    }

    @Override
    public void delete(String string) {
        Context context = Context.getCurrentContext();
        this.deleteXMLProperty(this.lib.toXMLNameFromString(context, string));
    }

    @Override
    public final boolean delete(Context object, Object object2) {
        Context context = object;
        if (object == null) {
            context = Context.getCurrentContext();
        }
        if ((object = this.lib.toXMLNameOrIndex(context, object2)) == null) {
            this.delete((int)ScriptRuntime.lastUint32Result(context));
            return true;
        }
        this.deleteXMLProperty((XMLName)object);
        return true;
    }

    abstract void deleteXMLProperty(XMLName var1);

    final String ecmaEscapeAttributeValue(String string) {
        string = this.lib.escapeAttributeValue(string);
        return string.substring(1, string.length() - 1);
    }

    final XML ecmaToXml(Object object) {
        return this.lib.ecmaToXml(object);
    }

    abstract XMLList elements(XMLName var1);

    @Override
    public NativeWith enterDotQuery(Scriptable scriptable) {
        scriptable = new XMLWithScope(this.lib, scriptable, this);
        ((XMLWithScope)scriptable).initAsDotQuery();
        return scriptable;
    }

    @Override
    public NativeWith enterWith(Scriptable scriptable) {
        return new XMLWithScope(this.lib, scriptable, this);
    }

    @Override
    protected final Object equivalentValues(Object object) {
        object = this.equivalentXml(object) ? Boolean.TRUE : Boolean.FALSE;
        return object;
    }

    abstract boolean equivalentXml(Object var1);

    @Override
    public Object execIdCall(IdFunctionObject object, Context object2, Scriptable object3, Scriptable scriptable, Object[] objectArray) {
        if (!((IdFunctionObject)object).hasTag(XMLOBJECT_TAG)) {
            return super.execIdCall((IdFunctionObject)object, (Context)object2, (Scriptable)object3, scriptable, objectArray);
        }
        int n2 = ((IdFunctionObject)object).methodId();
        boolean bl = true;
        if (n2 == 1) {
            if (scriptable != null) {
                bl = false;
            }
            return this.jsConstructor((Context)object2, bl, objectArray);
        }
        XMLObjectImpl xMLObjectImpl = IdScriptableObject.ensureType(scriptable, XMLObjectImpl.class, (IdFunctionObject)object);
        scriptable = xMLObjectImpl.getXML();
        object = null;
        switch (n2) {
            default: {
                throw new IllegalArgumentException(String.valueOf(n2));
            }
            case 41: {
                return xMLObjectImpl.valueOf();
            }
            case 40: {
                return xMLObjectImpl.toXMLString();
            }
            case 39: {
                return xMLObjectImpl.toSource(ScriptRuntime.toInt32(objectArray, 0));
            }
            case 38: {
                return xMLObjectImpl.toString();
            }
            case 37: {
                return xMLObjectImpl.text();
            }
            case 36: {
                if (scriptable == null) {
                    this.xmlMethodNotFound(xMLObjectImpl, "setNamespace");
                }
                ((XML)scriptable).setNamespace(this.lib.castToNamespace((Context)object2, XMLObjectImpl.arg(objectArray, 0)));
                return Undefined.instance;
            }
            case 35: {
                if (scriptable == null) {
                    this.xmlMethodNotFound(xMLObjectImpl, "setName");
                }
                object = objectArray.length != 0 ? objectArray[0] : Undefined.instance;
                ((XML)scriptable).setName(this.lib.constructQName((Context)object2, object));
                return Undefined.instance;
            }
            case 34: {
                if (scriptable == null) {
                    this.xmlMethodNotFound(xMLObjectImpl, "setLocalName");
                }
                object = (object = XMLObjectImpl.arg(objectArray, 0)) instanceof QName ? ((QName)object).localName() : ScriptRuntime.toString(object);
                ((XML)scriptable).setLocalName((String)object);
                return Undefined.instance;
            }
            case 33: {
                if (scriptable == null) {
                    this.xmlMethodNotFound(xMLObjectImpl, "setChildren");
                }
                return ((XML)scriptable).setChildren(XMLObjectImpl.arg(objectArray, 0));
            }
            case 32: {
                if (scriptable == null) {
                    this.xmlMethodNotFound(xMLObjectImpl, "replace");
                }
                object = this.lib.toXMLNameOrIndex((Context)object2, XMLObjectImpl.arg(objectArray, 0));
                object3 = XMLObjectImpl.arg(objectArray, 1);
                if (object == null) {
                    return ((XML)scriptable).replace((int)ScriptRuntime.lastUint32Result((Context)object2), object3);
                }
                return ((XML)scriptable).replace((XMLName)object, object3);
            }
            case 31: {
                if (scriptable == null) {
                    this.xmlMethodNotFound(xMLObjectImpl, "removeNamespace");
                }
                return ((XML)scriptable).removeNamespace(this.lib.castToNamespace((Context)object2, XMLObjectImpl.arg(objectArray, 0)));
            }
            case 30: {
                return ScriptRuntime.wrapBoolean(xMLObjectImpl.propertyIsEnumerable(XMLObjectImpl.arg(objectArray, 0)));
            }
            case 29: {
                object = objectArray.length > 0 ? this.lib.toXMLName((Context)object2, objectArray[0]) : XMLName.formStar();
                return xMLObjectImpl.processingInstructions((XMLName)object);
            }
            case 28: {
                if (scriptable == null) {
                    this.xmlMethodNotFound(xMLObjectImpl, "prependChild");
                }
                return ((XML)scriptable).prependChild(XMLObjectImpl.arg(objectArray, 0));
            }
            case 27: {
                return xMLObjectImpl.parent();
            }
            case 26: {
                xMLObjectImpl.normalize();
                return Undefined.instance;
            }
            case 25: {
                if (scriptable == null) {
                    this.xmlMethodNotFound(xMLObjectImpl, "nodeKind");
                }
                return ((XML)scriptable).nodeKind();
            }
            case 24: {
                if (scriptable == null) {
                    this.xmlMethodNotFound(xMLObjectImpl, "namespaceDeclarations");
                }
                return ((Context)object2).newArray((Scriptable)object3, this.toObjectArray(((XML)scriptable).namespaceDeclarations()));
            }
            case 23: {
                if (scriptable == null) {
                    this.xmlMethodNotFound(xMLObjectImpl, "namespace");
                }
                if (objectArray.length > 0) {
                    object = ScriptRuntime.toString(objectArray[0]);
                }
                object = object2 = ((XML)scriptable).namespace((String)object);
                if (object2 == null) {
                    object = Undefined.instance;
                }
                return object;
            }
            case 22: {
                if (scriptable == null) {
                    this.xmlMethodNotFound(xMLObjectImpl, "name");
                }
                return ((XML)scriptable).name();
            }
            case 21: {
                if (scriptable == null) {
                    this.xmlMethodNotFound(xMLObjectImpl, "localName");
                }
                return ((XML)scriptable).localName();
            }
            case 20: {
                return ScriptRuntime.wrapInt(xMLObjectImpl.length());
            }
            case 19: {
                return ScriptRuntime.wrapBoolean(xMLObjectImpl.hasSimpleContent());
            }
            case 18: {
                return ScriptRuntime.wrapBoolean(xMLObjectImpl.hasComplexContent());
            }
            case 17: {
                return ScriptRuntime.wrapBoolean(xMLObjectImpl.hasOwnProperty(this.lib.toXMLName((Context)object2, XMLObjectImpl.arg(objectArray, 0))));
            }
            case 16: {
                if (scriptable == null) {
                    this.xmlMethodNotFound(xMLObjectImpl, "insertChildBefore");
                }
                if ((object = XMLObjectImpl.arg(objectArray, 0)) != null && !(object instanceof XML)) {
                    return Undefined.instance;
                }
                return ((XML)scriptable).insertChildBefore((XML)object, XMLObjectImpl.arg(objectArray, 1));
            }
            case 15: {
                if (scriptable == null) {
                    this.xmlMethodNotFound(xMLObjectImpl, "insertChildAfter");
                }
                if ((object = XMLObjectImpl.arg(objectArray, 0)) != null && !(object instanceof XML)) {
                    return Undefined.instance;
                }
                return ((XML)scriptable).insertChildAfter((XML)object, XMLObjectImpl.arg(objectArray, 1));
            }
            case 14: {
                if (scriptable == null) {
                    this.xmlMethodNotFound(xMLObjectImpl, "inScopeNamespaces");
                }
                return ((Context)object2).newArray((Scriptable)object3, this.toObjectArray(((XML)scriptable).inScopeNamespaces()));
            }
            case 13: {
                object = objectArray.length == 0 ? XMLName.formStar() : this.lib.toXMLName((Context)object2, objectArray[0]);
                return xMLObjectImpl.elements((XMLName)object);
            }
            case 12: {
                object = objectArray.length == 0 ? XmlNode$QName.create(null, null) : this.lib.toNodeQName((Context)object2, objectArray[0], false);
                return xMLObjectImpl.getMatches(XMLName.create((XmlNode$QName)object, false, true));
            }
            case 11: {
                return xMLObjectImpl.copy();
            }
            case 10: {
                return ScriptRuntime.wrapBoolean(xMLObjectImpl.contains(XMLObjectImpl.arg(objectArray, 0)));
            }
            case 9: {
                return xMLObjectImpl.comments();
            }
            case 8: {
                return xMLObjectImpl.children();
            }
            case 7: {
                if (scriptable == null) {
                    this.xmlMethodNotFound(xMLObjectImpl, "childIndex");
                }
                return ScriptRuntime.wrapInt(((XML)scriptable).childIndex());
            }
            case 6: {
                object = this.lib.toXMLNameOrIndex((Context)object2, XMLObjectImpl.arg(objectArray, 0));
                if (object == null) {
                    return xMLObjectImpl.child((int)ScriptRuntime.lastUint32Result((Context)object2));
                }
                return xMLObjectImpl.child((XMLName)object);
            }
            case 5: {
                return xMLObjectImpl.getMatches(XMLName.create(XmlNode$QName.create(null, null), true, false));
            }
            case 4: {
                return xMLObjectImpl.getMatches(XMLName.create(this.lib.toNodeQName((Context)object2, XMLObjectImpl.arg(objectArray, 0), true), true, false));
            }
            case 3: {
                if (scriptable == null) {
                    this.xmlMethodNotFound(xMLObjectImpl, "appendChild");
                }
                return ((XML)scriptable).appendChild(XMLObjectImpl.arg(objectArray, 0));
            }
            case 2: 
        }
        if (scriptable == null) {
            this.xmlMethodNotFound(xMLObjectImpl, "addNamespace");
        }
        return ((XML)scriptable).addNamespace(this.lib.castToNamespace((Context)object2, XMLObjectImpl.arg(objectArray, 0)));
    }

    final void exportAsJSClass(boolean bl) {
        this.prototypeFlag = true;
        this.exportAsJSClass(41, this.getParentScope(), bl);
    }

    @Override
    protected int findPrototypeId(String string) {
        int n2;
        block69: {
            String string2;
            int n3;
            block68: {
                n2 = string.length();
                n3 = 0;
                switch (n2) {
                    default: {
                        break;
                    }
                    case 22: {
                        n2 = 29;
                        string2 = "processingInstructions";
                        break block68;
                    }
                    case 21: {
                        n2 = 24;
                        string2 = "namespaceDeclarations";
                        break block68;
                    }
                    case 20: {
                        n2 = 30;
                        string2 = "propertyIsEnumerable";
                        break block68;
                    }
                    case 17: {
                        n2 = string.charAt(3);
                        if (n2 == 67) {
                            n2 = 18;
                            string2 = "hasComplexContent";
                        } else if (n2 == 99) {
                            n2 = 14;
                            string2 = "inScopeNamespaces";
                        } else {
                            if (n2 != 101) break;
                            n2 = 16;
                            string2 = "insertChildBefore";
                        }
                        break block68;
                    }
                    case 16: {
                        n2 = string.charAt(0);
                        if (n2 == 104) {
                            n2 = 19;
                            string2 = "hasSimpleContent";
                        } else {
                            if (n2 != 105) break;
                            n2 = 15;
                            string2 = "insertChildAfter";
                        }
                        break block68;
                    }
                    case 15: {
                        n2 = 31;
                        string2 = "removeNamespace";
                        break block68;
                    }
                    case 14: {
                        n2 = 17;
                        string2 = "hasOwnProperty";
                        break block68;
                    }
                    case 12: {
                        n2 = string.charAt(0);
                        if (n2 == 97) {
                            string2 = "addNamespace";
                            n2 = 2;
                        } else if (n2 == 112) {
                            n2 = 28;
                            string2 = "prependChild";
                        } else {
                            if (n2 != 115) break;
                            n2 = string.charAt(3);
                            if (n2 == 76) {
                                n2 = 34;
                                string2 = "setLocalName";
                            } else {
                                if (n2 != 78) break;
                                n2 = 36;
                                string2 = "setNamespace";
                            }
                        }
                        break block68;
                    }
                    case 11: {
                        n2 = string.charAt(0);
                        if (n2 != 97) {
                            if (n2 != 99) {
                                if (n2 != 100) {
                                    if (n2 != 115) {
                                        if (n2 != 116) break;
                                        n2 = 40;
                                        string2 = "toXMLString";
                                    } else {
                                        n2 = 33;
                                        string2 = "setChildren";
                                    }
                                } else {
                                    n2 = 12;
                                    string2 = "descendants";
                                }
                            } else {
                                n2 = 1;
                                string2 = "constructor";
                            }
                        } else {
                            string2 = "appendChild";
                            n2 = 3;
                        }
                        break block68;
                    }
                    case 10: {
                        n2 = string.charAt(0);
                        if (n2 == 97) {
                            n2 = 5;
                            string2 = "attributes";
                        } else {
                            if (n2 != 99) break;
                            string2 = "childIndex";
                            n2 = 7;
                        }
                        break block68;
                    }
                    case 9: {
                        n2 = string.charAt(2);
                        if (n2 != 99) {
                            if (n2 != 109) {
                                if (n2 != 114) {
                                    if (n2 != 116) break;
                                    n2 = 4;
                                    string2 = "attribute";
                                } else {
                                    n2 = 26;
                                    string2 = "normalize";
                                }
                            } else {
                                n2 = 23;
                                string2 = "namespace";
                            }
                        } else {
                            n2 = 21;
                            string2 = "localName";
                        }
                        break block68;
                    }
                    case 8: {
                        n2 = string.charAt(2);
                        if (n2 != 83) {
                            if (n2 != 105) {
                                if (n2 != 100) {
                                    if (n2 != 101) {
                                        if (n2 != 109) {
                                            if (n2 != 110) break;
                                            n2 = 10;
                                            string2 = "contains";
                                        } else {
                                            n2 = 9;
                                            string2 = "comments";
                                        }
                                    } else {
                                        n2 = 13;
                                        string2 = "elements";
                                    }
                                } else {
                                    n2 = 25;
                                    string2 = "nodeKind";
                                }
                            } else {
                                n2 = 8;
                                string2 = "children";
                            }
                        } else {
                            n2 = string.charAt(7);
                            if (n2 == 101) {
                                n2 = 39;
                                string2 = "toSource";
                            } else {
                                if (n2 != 103) break;
                                n2 = 38;
                                string2 = "toString";
                            }
                        }
                        break block68;
                    }
                    case 7: {
                        n2 = string.charAt(0);
                        if (n2 == 114) {
                            n2 = 32;
                            string2 = "replace";
                        } else if (n2 == 115) {
                            n2 = 35;
                            string2 = "setName";
                        } else {
                            if (n2 != 118) break;
                            n2 = 41;
                            string2 = "valueOf";
                        }
                        break block68;
                    }
                    case 6: {
                        n2 = string.charAt(0);
                        if (n2 == 108) {
                            n2 = 20;
                            string2 = "length";
                        } else {
                            if (n2 != 112) break;
                            n2 = 27;
                            string2 = "parent";
                        }
                        break block68;
                    }
                    case 5: {
                        n2 = 6;
                        string2 = "child";
                        break block68;
                    }
                    case 4: {
                        n2 = string.charAt(0);
                        if (n2 == 99) {
                            n2 = 11;
                            string2 = "copy";
                        } else if (n2 == 110) {
                            n2 = 22;
                            string2 = "name";
                        } else {
                            if (n2 != 116) break;
                            n2 = 37;
                            string2 = "text";
                        }
                        break block68;
                    }
                }
                string2 = null;
                n2 = 0;
            }
            if (string2 == null || string2 == string || string2.equals(string)) break block69;
            n2 = n3;
        }
        return n2;
    }

    @Override
    public Object get(String string, Scriptable object) {
        object = Context.getCurrentContext();
        return this.getXMLProperty(this.lib.toXMLNameFromString((Context)object, string));
    }

    @Override
    public final Object get(Context object, Object object2) {
        Context context = object;
        if (object == null) {
            context = Context.getCurrentContext();
        }
        if ((object = this.lib.toXMLNameOrIndex(context, object2)) == null) {
            object = object2 = this.get((int)ScriptRuntime.lastUint32Result(context), (Scriptable)this);
            if (object2 == Scriptable.NOT_FOUND) {
                object = Undefined.instance;
            }
            return object;
        }
        return this.getXMLProperty((XMLName)object);
    }

    @Override
    public final Object getDefaultValue(Class<?> clazz) {
        return this.toString();
    }

    @Override
    public Object getFunctionProperty(Context context, int n2) {
        if (this.isPrototype()) {
            return super.get(n2, (Scriptable)this);
        }
        Scriptable scriptable = this.getPrototype();
        if (scriptable instanceof XMLObject) {
            return ((XMLObject)scriptable).getFunctionProperty(context, n2);
        }
        return Scriptable.NOT_FOUND;
    }

    @Override
    public Object getFunctionProperty(Context context, String string) {
        if (this.isPrototype()) {
            return super.get(string, (Scriptable)this);
        }
        Scriptable scriptable = this.getPrototype();
        if (scriptable instanceof XMLObject) {
            return ((XMLObject)scriptable).getFunctionProperty(context, string);
        }
        return Scriptable.NOT_FOUND;
    }

    XMLLibImpl getLib() {
        return this.lib;
    }

    @Override
    public final Scriptable getParentScope() {
        return super.getParentScope();
    }

    final XmlProcessor getProcessor() {
        return this.lib.getProcessor();
    }

    @Override
    public final Scriptable getPrototype() {
        return super.getPrototype();
    }

    abstract XML getXML();

    abstract Object getXMLProperty(XMLName var1);

    @Override
    public boolean has(String string, Scriptable object) {
        object = Context.getCurrentContext();
        return this.hasXMLProperty(this.lib.toXMLNameFromString((Context)object, string));
    }

    @Override
    public final boolean has(Context object, Object object2) {
        Context context = object;
        if (object == null) {
            context = Context.getCurrentContext();
        }
        if ((object = this.lib.toXMLNameOrIndex(context, object2)) == null) {
            return this.has((int)ScriptRuntime.lastUint32Result(context), (Scriptable)this);
        }
        return this.hasXMLProperty((XMLName)object);
    }

    abstract boolean hasComplexContent();

    @Override
    public final boolean hasInstance(Scriptable scriptable) {
        return super.hasInstance(scriptable);
    }

    abstract boolean hasOwnProperty(XMLName var1);

    abstract boolean hasSimpleContent();

    abstract boolean hasXMLProperty(XMLName var1);

    /*
     * Unable to fully structure code
     */
    @Override
    protected void initPrototypeId(int var1_1) {
        var2_2 = 1;
        switch (var1_1) {
            default: {
                throw new IllegalArgumentException(String.valueOf(var1_1));
            }
            case 41: {
                var3_3 = "valueOf";
                ** GOTO lbl116
            }
            case 40: {
                var3_3 = "toXMLString";
                ** GOTO lbl126
            }
            case 39: {
                var3_3 = "toSource";
                ** GOTO lbl126
            }
            case 38: {
                var3_3 = "toString";
                ** GOTO lbl116
            }
            case 37: {
                var3_3 = "text";
                ** GOTO lbl116
            }
            case 36: {
                var3_3 = "setNamespace";
                ** GOTO lbl126
            }
            case 35: {
                var3_3 = "setName";
                ** GOTO lbl126
            }
            case 34: {
                var3_3 = "setLocalName";
                ** GOTO lbl126
            }
            case 33: {
                var3_3 = "setChildren";
                ** GOTO lbl126
            }
            case 32: {
                var3_3 = "replace";
                ** GOTO lbl85
            }
            case 31: {
                var3_3 = "removeNamespace";
                ** GOTO lbl126
            }
            case 30: {
                var3_3 = "propertyIsEnumerable";
                ** GOTO lbl126
            }
            case 29: {
                var3_3 = "processingInstructions";
                ** GOTO lbl126
            }
            case 28: {
                var3_3 = "prependChild";
                ** GOTO lbl126
            }
            case 27: {
                var3_3 = "parent";
                ** GOTO lbl116
            }
            case 26: {
                var3_3 = "normalize";
                ** GOTO lbl116
            }
            case 25: {
                var3_3 = "nodeKind";
                ** GOTO lbl116
            }
            case 24: {
                var3_3 = "namespaceDeclarations";
                ** GOTO lbl116
            }
            case 23: {
                var3_3 = "namespace";
                ** GOTO lbl126
            }
            case 22: {
                var3_3 = "name";
                ** GOTO lbl116
            }
            case 21: {
                var3_3 = "localName";
                ** GOTO lbl116
            }
            case 20: {
                var3_3 = "length";
                ** GOTO lbl116
            }
            case 19: {
                var3_3 = "hasSimpleContent";
                ** GOTO lbl116
            }
            case 18: {
                var3_3 = "hasComplexContent";
                ** GOTO lbl116
            }
            case 17: {
                var3_3 = "hasOwnProperty";
                ** GOTO lbl126
            }
            case 16: {
                var3_3 = "insertChildBefore";
                ** GOTO lbl85
            }
            case 15: {
                var3_3 = "insertChildAfter";
lbl85:
                // 3 sources

                var2_2 = 2;
                ** GOTO lbl126
            }
            case 14: {
                var3_3 = "inScopeNamespaces";
                ** GOTO lbl116
            }
            case 13: {
                var3_3 = "elements";
                ** GOTO lbl126
            }
            case 12: {
                var3_3 = "descendants";
                ** GOTO lbl126
            }
            case 11: {
                var3_3 = "copy";
                ** GOTO lbl116
            }
            case 10: {
                var3_3 = "contains";
                ** GOTO lbl126
            }
            case 9: {
                var3_3 = "comments";
                ** GOTO lbl116
            }
            case 8: {
                var3_3 = "children";
                ** GOTO lbl116
            }
            case 7: {
                var3_3 = "childIndex";
                ** GOTO lbl116
            }
            case 6: {
                var3_3 = "child";
                ** GOTO lbl126
            }
            case 5: {
                var3_3 = "attributes";
lbl116:
                // 18 sources

                var2_2 = 0;
                ** GOTO lbl126
            }
            case 4: {
                var3_3 = "attribute";
                ** GOTO lbl126
            }
            case 3: {
                var3_3 = "appendChild";
                ** GOTO lbl126
            }
            case 2: {
                var3_3 = "addNamespace";
lbl126:
                // 21 sources

                this.initPrototypeMethod(XMLObjectImpl.XMLOBJECT_TAG, var1_1, var3_3, var2_2);
                return;
            }
            case 1: 
        }
        var3_4 = this instanceof XML != false ? new XMLCtor((XML)this, XMLObjectImpl.XMLOBJECT_TAG, var1_1, 1) : new IdFunctionObject(this, XMLObjectImpl.XMLOBJECT_TAG, var1_1, 1);
        this.initPrototypeConstructor(var3_4);
    }

    final void initialize(XMLLibImpl xMLLibImpl, Scriptable scriptable, XMLObject xMLObject) {
        this.setParentScope(scriptable);
        this.setPrototype(xMLObject);
        boolean bl = xMLObject == null;
        this.prototypeFlag = bl;
        this.lib = xMLLibImpl;
    }

    final boolean isPrototype() {
        return this.prototypeFlag;
    }

    protected abstract Object jsConstructor(Context var1, boolean var2, Object[] var3);

    abstract int length();

    @Override
    public Ref memberRef(Context object, Object object2, int n2) {
        boolean bl = true;
        boolean bl2 = (n2 & 2) != 0;
        if ((n2 & 4) == 0) {
            bl = false;
        }
        if (!bl2 && !bl) {
            throw Kit.codeBug();
        }
        object = XMLName.create(this.lib.toNodeQName((Context)object, object2, bl2), bl2, bl);
        ((XMLName)object).initXMLObject(this);
        return object;
    }

    @Override
    public Ref memberRef(Context object, Object object2, Object object3, int n2) {
        boolean bl = true;
        boolean bl2 = (n2 & 2) != 0;
        if ((n2 & 4) == 0) {
            bl = false;
        }
        object = XMLName.create(this.lib.toNodeQName((Context)object, object2, object3), bl2, bl);
        ((XMLName)object).initXMLObject(this);
        return object;
    }

    final QName newQName(String string, String string2, String string3) {
        return this.lib.newQName(string, string2, string3);
    }

    final QName newQName(XmlNode$QName xmlNode$QName) {
        return this.lib.newQName(xmlNode$QName);
    }

    final XML newTextElementXML(XmlNode xmlNode, XmlNode$QName xmlNode$QName, String string) {
        return this.lib.newTextElementXML(xmlNode, xmlNode$QName, string);
    }

    final XML newXML(XmlNode xmlNode) {
        return this.lib.newXML(xmlNode);
    }

    final XML newXMLFromJs(Object object) {
        return this.lib.newXMLFromJs(object);
    }

    final XMLList newXMLList() {
        return this.lib.newXMLList();
    }

    final XMLList newXMLListFrom(Object object) {
        return this.lib.newXMLListFrom(object);
    }

    abstract void normalize();

    abstract Object parent();

    abstract XMLList processingInstructions(XMLName var1);

    abstract boolean propertyIsEnumerable(Object var1);

    @Override
    public void put(String string, Scriptable object, Object object2) {
        object = Context.getCurrentContext();
        this.putXMLProperty(this.lib.toXMLNameFromString((Context)object, string), object2);
    }

    @Override
    public final void put(Context object, Object object2, Object object3) {
        Context context = object;
        if (object == null) {
            context = Context.getCurrentContext();
        }
        if ((object = this.lib.toXMLNameOrIndex(context, object2)) == null) {
            this.put((int)ScriptRuntime.lastUint32Result(context), (Scriptable)this, object3);
            return;
        }
        this.putXMLProperty((XMLName)object, object3);
    }

    abstract void putXMLProperty(XMLName var1, Object var2);

    @Override
    public final void setParentScope(Scriptable scriptable) {
        super.setParentScope(scriptable);
    }

    @Override
    public final void setPrototype(Scriptable scriptable) {
        super.setPrototype(scriptable);
    }

    abstract XMLList text();

    abstract String toSource(int var1);

    public abstract String toString();

    abstract String toXMLString();

    abstract Object valueOf();

    XML xmlFromNode(XmlNode xmlNode) {
        if (xmlNode.getXml() == null) {
            xmlNode.setXml(this.newXML(xmlNode));
        }
        return xmlNode.getXml();
    }
}

