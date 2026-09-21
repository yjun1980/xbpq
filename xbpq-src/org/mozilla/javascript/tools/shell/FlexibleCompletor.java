/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.shell;

import com.github.catvod.spider.merge.B.e;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

class FlexibleCompletor
implements InvocationHandler {
    private Method completeMethod;
    private Scriptable global;

    FlexibleCompletor(Class<?> clazz, Scriptable scriptable) {
        this.global = scriptable;
        this.completeMethod = clazz.getMethod("complete", String.class, Integer.TYPE, List.class);
    }

    public int complete(String string, int n2, List<String> list) {
        char c2;
        int n3;
        for (n3 = n2 - 1; n3 >= 0 && (Character.isJavaIdentifierPart(c2 = string.charAt(n3)) || c2 == '.'); --n3) {
        }
        Object object = string.substring(n3 + 1, n2).split("\\.", -1);
        Object object2 = this.global;
        n3 = 0;
        for (n2 = 0; n2 < ((String[])object).length - 1; ++n2) {
            if ((object2 = object2.get(object[n2], this.global)) instanceof Scriptable) {
                object2 = (Scriptable)object2;
                continue;
            }
            return string.length();
        }
        Object[] objectArray = object2 instanceof ScriptableObject ? ((ScriptableObject)object2).getAllIds() : object2.getIds();
        String string2 = object[((String[])object).length - 1];
        for (n2 = n3; n2 < objectArray.length; ++n2) {
            String string3;
            if (!(objectArray[n2] instanceof String) || !(string3 = (String)objectArray[n2]).startsWith(string2)) continue;
            object = string3;
            if (object2.get(string3, (Scriptable)object2) instanceof Function) {
                object = e.c(string3, "(");
            }
            list.add((String)object);
        }
        return string.length() - string2.length();
    }

    @Override
    public Object invoke(Object object, Method method, Object[] objectArray) {
        if (method.equals(this.completeMethod)) {
            return this.complete((String)objectArray[0], (Integer)objectArray[1], (List)objectArray[2]);
        }
        throw new NoSuchMethodError(method.toString());
    }
}

