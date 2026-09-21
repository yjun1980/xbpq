/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.z;

import com.github.catvod.spider.merge.B.c;
import com.github.catvod.spider.merge.B.n;
import com.github.catvod.spider.merge.D.f0;
import com.github.catvod.spider.merge.D.i0;
import com.github.catvod.spider.merge.y.V;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.TYPE})
public @interface d {
    public boolean alphabetic() default true;

    public boolean asm() default true;

    public Class<? extends n> autoTypeCheckHandler() default n.class;

    public Class<?> builder() default Void.class;

    public Class<?> deserializer() default Void.class;

    public String[] ignores() default {};

    public String[] includes() default {};

    public Class<?> mappingTo() default Void.class;

    public V naming() default V.b;

    public String[] orders() default {};

    public c[] parseFeatures() default {};

    public Class<?>[] seeAlso() default {};

    public boolean serializeEnumAsJavaBean() default false;

    public Class<?> serializer() default Void.class;

    public i0[] serialzeFeatures() default {};

    public Class<? extends f0>[] serialzeFilters() default {};

    public String typeKey() default "";

    public String typeName() default "";
}

