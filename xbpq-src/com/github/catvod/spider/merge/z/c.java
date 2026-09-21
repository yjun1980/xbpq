/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.z;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.TYPE})
public @interface c {
    public String buildMethod() default "build";

    public String withPrefix() default "with";
}

