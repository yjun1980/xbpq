/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.B.b;
import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.B.k;
import com.github.catvod.spider.merge.C.v;
import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.D.h0;
import com.github.catvod.spider.merge.D.i0;
import com.github.catvod.spider.merge.y.a;
import com.github.catvod.spider.merge.y.d;
import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;
import java.lang.reflect.Type;

public final class j
implements X,
v {
    public static final j a = new j();

    public static boolean j(Class<?> clazz) {
        boolean bl = clazz == Point.class || clazz == Rectangle.class || clazz == Font.class || clazz == Color.class;
        return bl;
    }

    @Override
    public final <T> T c(b object, Type object2, Object object3) {
        block9: {
            Object object4;
            block6: {
                block8: {
                    block7: {
                        block5: {
                            object4 = ((b)object).f;
                            if (object4.p() == 8) {
                                object4.o(16);
                                return null;
                            }
                            if (object4.p() != 12 && object4.p() != 16) {
                                throw new d("syntax error");
                            }
                            object4.nextToken();
                            if (object2 != Point.class) break block5;
                            object2 = this.h((b)object, object3);
                            break block6;
                        }
                        if (object2 != Rectangle.class) break block7;
                        object2 = this.i((b)object);
                        break block6;
                    }
                    if (object2 != Color.class) break block8;
                    object2 = this.f((b)object);
                    break block6;
                }
                if (object2 != Font.class) break block9;
                object2 = this.g((b)object);
            }
            object4 = ((b)object).f();
            ((b)object).A(object2, object3);
            ((b)object).B((k)object4);
            return (T)object2;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("not support awt class : ");
        ((StringBuilder)object).append(object2);
        throw new d(((StringBuilder)object).toString());
    }

    @Override
    public final void d(L object, Object object2, Object object3, Type type, int n2) {
        block9: {
            block5: {
                block7: {
                    block8: {
                        block6: {
                            block4: {
                                object3 = ((L)object).j;
                                if (object2 == null) {
                                    ((h0)object3).s();
                                    return;
                                }
                                if (!(object2 instanceof Point)) break block4;
                                object = (Point)object2;
                                ((h0)object3).k(this.k((h0)object3, Point.class), "x", ((Point)object).x);
                                ((h0)object3).k(',', "y", ((Point)object).y);
                                break block5;
                            }
                            if (!(object2 instanceof Font)) break block6;
                            object = (Font)object2;
                            ((h0)object3).m(this.k((h0)object3, Font.class), "name", ((Font)object).getName());
                            ((h0)object3).k(',', "style", ((Font)object).getStyle());
                            n2 = ((Font)object).getSize();
                            object = "size";
                            break block7;
                        }
                        if (!(object2 instanceof Rectangle)) break block8;
                        object = (Rectangle)object2;
                        ((h0)object3).k(this.k((h0)object3, Rectangle.class), "x", ((Rectangle)object).x);
                        ((h0)object3).k(',', "y", ((Rectangle)object).y);
                        ((h0)object3).k(',', "width", ((Rectangle)object).width);
                        n2 = ((Rectangle)object).height;
                        object = "height";
                        break block7;
                    }
                    if (!(object2 instanceof Color)) break block9;
                    object = (Color)object2;
                    ((h0)object3).k(this.k((h0)object3, Color.class), "r", ((Color)object).getRed());
                    ((h0)object3).k(',', "g", ((Color)object).getGreen());
                    ((h0)object3).k(',', "b", ((Color)object).getBlue());
                    if (((Color)object).getAlpha() <= 0) break block5;
                    n2 = ((Color)object).getAlpha();
                    object = "alpha";
                }
                ((h0)object3).k(',', (String)object, n2);
            }
            ((h0)object3).write(125);
            return;
        }
        object = com.github.catvod.spider.merge.C.a.c("not support awt class : ");
        ((StringBuilder)object).append(object2.getClass().getName());
        throw new d(((StringBuilder)object).toString());
    }

    @Override
    public final int e() {
        return 12;
    }

    protected final Color f(b object) {
        block8: {
            block9: {
                com.github.catvod.spider.merge.B.d d2 = ((b)object).f;
                int n2 = 0;
                int n3 = 0;
                int n4 = 0;
                int n5 = 0;
                while (true) {
                    int n6;
                    int n7;
                    int n8;
                    if (d2.p() == 13) {
                        d2.nextToken();
                        return new Color(n2, n3, n4, n5);
                    }
                    if (d2.p() != 4) break block8;
                    object = d2.K();
                    d2.a();
                    if (d2.p() != 2) break block9;
                    int n9 = d2.c();
                    d2.nextToken();
                    if (((String)object).equalsIgnoreCase("r")) {
                        n8 = n3;
                        n7 = n4;
                        n6 = n5;
                    } else if (((String)object).equalsIgnoreCase("g")) {
                        n8 = n9;
                        n9 = n2;
                        n7 = n4;
                        n6 = n5;
                    } else if (((String)object).equalsIgnoreCase("b")) {
                        n7 = n9;
                        n9 = n2;
                        n8 = n3;
                        n6 = n5;
                    } else {
                        if (!((String)object).equalsIgnoreCase("alpha")) break;
                        n6 = n9;
                        n7 = n4;
                        n8 = n3;
                        n9 = n2;
                    }
                    n2 = n9;
                    n3 = n8;
                    n4 = n7;
                    n5 = n6;
                    if (d2.p() != 16) continue;
                    d2.o(4);
                    n2 = n9;
                    n3 = n8;
                    n4 = n7;
                    n5 = n6;
                }
                throw new d(e.c("syntax error, ", (String)object));
            }
            throw new d("syntax error");
        }
        throw new d("syntax error");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected final Font g(b object) {
        com.github.catvod.spider.merge.B.d d2 = ((b)object).f;
        int n2 = 0;
        object = null;
        int n3 = 0;
        while (true) {
            int n4;
            int n5;
            if (d2.p() == 13) {
                d2.nextToken();
                return new Font((String)object, n2, n3);
            }
            if (d2.p() != 4) throw new d("syntax error");
            Object object2 = d2.K();
            d2.a();
            if (((String)object2).equalsIgnoreCase("name")) {
                if (d2.p() != 4) throw new d("syntax error");
                object2 = d2.K();
                n5 = n2;
                n4 = n3;
            } else if (((String)object2).equalsIgnoreCase("style")) {
                if (d2.p() != 2) throw new d("syntax error");
                n5 = d2.c();
                object2 = object;
                n4 = n3;
            } else {
                if (!((String)object2).equalsIgnoreCase("size")) throw new d(e.c("syntax error, ", (String)object2));
                if (d2.p() != 2) throw new d("syntax error");
                n4 = d2.c();
                object2 = object;
                n5 = n2;
            }
            d2.nextToken();
            n2 = n5;
            object = object2;
            n3 = n4;
            if (d2.p() != 16) continue;
            d2.o(4);
            n2 = n5;
            object = object2;
            n3 = n4;
        }
    }

    protected final Point h(b object, Object object2) {
        block10: {
            com.github.catvod.spider.merge.B.d d2;
            block11: {
                Object object3;
                d2 = ((b)object).f;
                int n2 = 0;
                int n3 = 0;
                while (true) {
                    int n4;
                    if (d2.p() == 13) {
                        d2.nextToken();
                        return new Point(n2, n3);
                    }
                    if (d2.p() != 4) break block10;
                    object3 = d2.K();
                    if (com.github.catvod.spider.merge.y.a.c.equals(object3)) {
                        object3 = ((b)object).f;
                        object3.q();
                        if (object3.p() == 4) {
                            if ("java.awt.Point".equals(object3.K())) {
                                object3.nextToken();
                                if (object3.p() != 16) continue;
                                object3.nextToken();
                                continue;
                            }
                            throw new d("type not match error");
                        }
                        throw new d("type not match error");
                    }
                    if ("$ref".equals(object3)) {
                        d2 = ((b)object).f;
                        d2.a();
                        object3 = d2.K();
                        ((b)object).A(((b)object).f(), object2);
                        ((b)object).b(new com.github.catvod.spider.merge.B.a(((b)object).f(), (String)object3));
                        ((b)object).x();
                        ((b)object).k = 1;
                        d2.o(13);
                        ((b)object).a(13);
                        object = null;
                        return null;
                    }
                    d2.a();
                    int n5 = d2.p();
                    if (n5 == 2) {
                        n5 = d2.c();
                    } else {
                        if (n5 != 3) break block11;
                        n5 = (int)d2.k();
                    }
                    d2.nextToken();
                    if (((String)object3).equalsIgnoreCase("x")) {
                        n4 = n3;
                    } else {
                        if (!((String)object3).equalsIgnoreCase("y")) break;
                        n4 = n5;
                        n5 = n2;
                    }
                    n2 = n5;
                    n3 = n4;
                    if (d2.p() != 16) continue;
                    d2.o(4);
                    n2 = n5;
                    n3 = n4;
                }
                throw new d(e.c("syntax error, ", (String)object3));
            }
            object = com.github.catvod.spider.merge.C.a.c("syntax error : ");
            ((StringBuilder)object).append(d2.y());
            throw new d(((StringBuilder)object).toString());
        }
        throw new d("syntax error");
    }

    protected final Rectangle i(b object) {
        block10: {
            block11: {
                com.github.catvod.spider.merge.B.d d2 = ((b)object).f;
                int n2 = 0;
                int n3 = 0;
                int n4 = 0;
                int n5 = 0;
                while (true) {
                    int n6;
                    int n7;
                    int n8;
                    if (d2.p() == 13) {
                        d2.nextToken();
                        return new Rectangle(n2, n3, n4, n5);
                    }
                    if (d2.p() != 4) break block10;
                    object = d2.K();
                    d2.a();
                    int n9 = d2.p();
                    if (n9 == 2) {
                        n9 = d2.c();
                    } else {
                        if (n9 != 3) break block11;
                        n9 = (int)d2.k();
                    }
                    d2.nextToken();
                    if (((String)object).equalsIgnoreCase("x")) {
                        n8 = n3;
                        n7 = n4;
                        n6 = n5;
                    } else if (((String)object).equalsIgnoreCase("y")) {
                        n8 = n9;
                        n9 = n2;
                        n7 = n4;
                        n6 = n5;
                    } else if (((String)object).equalsIgnoreCase("width")) {
                        n7 = n9;
                        n9 = n2;
                        n8 = n3;
                        n6 = n5;
                    } else {
                        if (!((String)object).equalsIgnoreCase("height")) break;
                        n6 = n9;
                        n7 = n4;
                        n8 = n3;
                        n9 = n2;
                    }
                    n2 = n9;
                    n3 = n8;
                    n4 = n7;
                    n5 = n6;
                    if (d2.p() != 16) continue;
                    d2.o(4);
                    n2 = n9;
                    n3 = n8;
                    n4 = n7;
                    n5 = n6;
                }
                throw new d(e.c("syntax error, ", (String)object));
            }
            throw new d("syntax error");
        }
        throw new d("syntax error");
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    protected final char k(h0 h02, Class clazz) {
        boolean bl = h02.g(i0.o);
        int n2 = 123;
        if (bl) {
            h02.write(123);
            h02.j(com.github.catvod.spider.merge.y.a.c);
            h02.v(clazz.getName());
            n2 = 44;
        }
        return (char)n2;
    }
}

