/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.z;

import com.github.catvod.spider.merge.B.c;
import com.github.catvod.spider.merge.D.i0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
public @interface b {
    public String[] alternateNames() default {};

    public String defaultValue() default "";

    public boolean deserialize() default true;

    public Class<?> deserializeUsing() default Void.class;

    public String format() default "";

    public boolean jsonDirect() default false;

    public String label() default "";

    public String name() default "";

    public int ordinal() default 0;

    public c[] parseFeatures() default {};

    public boolean serialize() default true;

    public Class<?> serializeUsing() default Void.class;

    public i0[] serialzeFeatures() default {};

    public boolean unwrapped() default false;
}

