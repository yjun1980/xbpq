/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import com.github.catvod.spider.merge.h1.e;
import com.github.catvod.spider.merge.h1.f;
import com.github.catvod.spider.merge.h1.g;
import com.github.catvod.spider.merge.h1.h;
import com.github.catvod.spider.merge.h1.i;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.function.UnaryOperator;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Undefined;

public class JavaToJSONConverters {
    public static final UnaryOperator<Object> BEAN;
    public static final UnaryOperator<Object> EMPTY_OBJECT;
    public static final UnaryOperator<Object> STRING;
    public static final UnaryOperator<Object> THROW_TYPE_ERROR;
    public static final UnaryOperator<Object> UNDEFINED;

    static {
        STRING = g.a;
        UNDEFINED = e.a;
        EMPTY_OBJECT = f.a;
        THROW_TYPE_ERROR = h.a;
        BEAN = i.a;
    }

    private JavaToJSONConverters() {
    }

    public static /* synthetic */ Object a(Object object) {
        return JavaToJSONConverters.lambda$static$1(object);
    }

    public static /* synthetic */ Object b(Object object) {
        return JavaToJSONConverters.lambda$static$2(object);
    }

    public static /* synthetic */ Object c(Object object) {
        return object.toString();
    }

    public static /* synthetic */ Object d(Object object) {
        return JavaToJSONConverters.lambda$static$3(object);
    }

    public static /* synthetic */ Object e(Object object) {
        return JavaToJSONConverters.lambda$static$4(object);
    }

    private static /* synthetic */ Object lambda$static$1(Object object) {
        return Undefined.instance;
    }

    private static /* synthetic */ Object lambda$static$2(Object object) {
        return Collections.EMPTY_MAP;
    }

    private static /* synthetic */ Object lambda$static$3(Object object) {
        throw ScriptRuntime.typeErrorById("msg.json.cant.serialize", object.getClass().getName());
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ Object lambda$static$4(Object linkedHashMap) {
        PropertyDescriptor[] propertyDescriptorArray;
        LinkedHashMap<String, Object> linkedHashMap2;
        BeanInfo beanInfo;
        try {
            beanInfo = Introspector.getBeanInfo(linkedHashMap.getClass(), Object.class);
            linkedHashMap2 = new LinkedHashMap<String, Object>();
            propertyDescriptorArray = beanInfo.getPropertyDescriptors();
        }
        catch (IntrospectionException introspectionException) {
            return null;
        }
        int n2 = propertyDescriptorArray.length;
        int n3 = 0;
        while (true) {
            if (n3 < n2) {
                PropertyDescriptor propertyDescriptor = propertyDescriptorArray[n3];
                if (propertyDescriptor.getReadMethod() != null) {
                    Object object = propertyDescriptor.getReadMethod().invoke(linkedHashMap, new Object[0]);
                    ((AbstractMap)linkedHashMap2).put(propertyDescriptor.getName(), object);
                }
            } else {
                if (((AbstractMap)linkedHashMap2).size() == 0) {
                    return null;
                }
                linkedHashMap = new LinkedHashMap();
                ((AbstractMap)linkedHashMap).put("beanClass", beanInfo.getBeanDescriptor().getBeanClass().getName());
                ((AbstractMap)linkedHashMap).put("properties", linkedHashMap2);
                return linkedHashMap;
                catch (Exception exception) {}
            }
            ++n3;
        }
    }
}

