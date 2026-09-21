/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.xml;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Ref;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

public abstract class XMLLib {
    private static final Object XML_LIB_KEY = new Object();

    public static XMLLib extractFromScope(Scriptable object) {
        if ((object = XMLLib.extractFromScopeOrNull((Scriptable)object)) != null) {
            return object;
        }
        throw Context.reportRuntimeError(ScriptRuntime.getMessageById("msg.XML.not.available", new Object[0]));
    }

    public static XMLLib extractFromScopeOrNull(Scriptable scriptable) {
        if ((scriptable = ScriptRuntime.getLibraryScopeOrNull(scriptable)) == null) {
            return null;
        }
        ScriptableObject.getProperty(scriptable, "XML");
        return (XMLLib)((ScriptableObject)scriptable).getAssociatedValue(XML_LIB_KEY);
    }

    protected final XMLLib bindToScope(Scriptable scriptable) {
        if ((scriptable = ScriptRuntime.getLibraryScopeOrNull(scriptable)) != null) {
            return (XMLLib)((ScriptableObject)scriptable).associateValue(XML_LIB_KEY, this);
        }
        throw new IllegalStateException();
    }

    public abstract String escapeAttributeValue(Object var1);

    public abstract String escapeTextValue(Object var1);

    public int getPrettyIndent() {
        throw new UnsupportedOperationException();
    }

    public boolean isIgnoreComments() {
        throw new UnsupportedOperationException();
    }

    public boolean isIgnoreProcessingInstructions() {
        throw new UnsupportedOperationException();
    }

    public boolean isIgnoreWhitespace() {
        throw new UnsupportedOperationException();
    }

    public boolean isPrettyPrinting() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean isXMLName(Context var1, Object var2);

    public abstract Ref nameRef(Context var1, Object var2, Object var3, Scriptable var4, int var5);

    public abstract Ref nameRef(Context var1, Object var2, Scriptable var3, int var4);

    public void setIgnoreComments(boolean bl) {
        throw new UnsupportedOperationException();
    }

    public void setIgnoreProcessingInstructions(boolean bl) {
        throw new UnsupportedOperationException();
    }

    public void setIgnoreWhitespace(boolean bl) {
        throw new UnsupportedOperationException();
    }

    public void setPrettyIndent(int n2) {
        throw new UnsupportedOperationException();
    }

    public void setPrettyPrinting(boolean bl) {
        throw new UnsupportedOperationException();
    }

    public abstract Object toDefaultXmlNamespace(Context var1, Object var2);
}

