/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.I;
import com.github.catvod.spider.merge.E0.a;
import com.github.catvod.spider.merge.E0.j0;
import com.github.catvod.spider.merge.E0.r0;
import java.util.Objects;

public abstract class C<MessageType extends I<MessageType, BuilderType>, BuilderType extends C<MessageType, BuilderType>>
extends a<MessageType, BuilderType> {
    private final MessageType a;
    protected MessageType b;

    protected C(MessageType MessageType) {
        this.a = MessageType;
        if (!((I)MessageType).l()) {
            this.b = ((I)MessageType).q();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    @Override
    public final j0 b() {
        return this.a;
    }

    public final Object clone() {
        Object BuilderType = ((I)this.a).o();
        ((C)BuilderType).b = this.e();
        return BuilderType;
    }

    @Override
    public final boolean d() {
        return I.e(this.b);
    }

    public final MessageType e() {
        if (!((I)this.b).l()) {
            return this.b;
        }
        ((I)this.b).m();
        return this.b;
    }

    protected final void f() {
        if (!((I)this.b).l()) {
            Object MessageType = ((I)this.a).q();
            MessageType MessageType2 = this.b;
            r0 r02 = r0.a();
            Objects.requireNonNull(r02);
            r02.b(MessageType.getClass()).a(MessageType, MessageType2);
            this.b = MessageType;
        }
    }

    public final BuilderType g(MessageType MessageType) {
        if (((I)this.a).equals(MessageType)) {
            return (BuilderType)this;
        }
        this.f();
        MessageType MessageType2 = this.b;
        r0 r02 = r0.a();
        Objects.requireNonNull(r02);
        r02.b(MessageType2.getClass()).a(MessageType2, MessageType);
        return (BuilderType)this;
    }
}

