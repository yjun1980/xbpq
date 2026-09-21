/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import org.mozilla.javascript.Hashtable$Entry;
import org.mozilla.javascript.Hashtable$Iter;
import org.mozilla.javascript.b;

public class Hashtable
implements Serializable,
Iterable<Hashtable$Entry> {
    static final boolean $assertionsDisabled = false;
    private static final long serialVersionUID = -7151554912419543747L;
    private Hashtable$Entry first = null;
    private Hashtable$Entry last = null;
    private final HashMap<Object, Hashtable$Entry> map = new HashMap();

    static /* synthetic */ Hashtable$Entry access$000() {
        return Hashtable.makeDummy();
    }

    private static Hashtable$Entry makeDummy() {
        Hashtable$Entry hashtable$Entry = new Hashtable$Entry();
        hashtable$Entry.clear();
        return hashtable$Entry;
    }

    public void clear() {
        this.iterator().forEachRemaining(b.a);
        if (this.first != null) {
            Hashtable$Entry hashtable$Entry;
            this.last.next = hashtable$Entry = Hashtable.makeDummy();
            this.last = hashtable$Entry;
            this.first = hashtable$Entry;
        }
        this.map.clear();
    }

    /*
     * Unable to fully structure code
     */
    public Object delete(Object var1_1) {
        block5: {
            block3: {
                block4: {
                    var3_2 = this.map.remove(var1_1 = new Hashtable$Entry(var1_1, null));
                    if (var3_2 == null) {
                        return null;
                    }
                    if (var3_2 != this.first) break block3;
                    if (var3_2 != this.last) break block4;
                    var3_2.clear();
                    var3_2.prev = null;
                    break block5;
                }
                this.first = var2_3 = var3_2.next;
                var2_3.prev = null;
                var1_1 = var2_3.next;
                if (var1_1 == null) break block5;
                ** GOTO lbl-1000
            }
            var2_3 = var3_2.prev;
            var2_3.next = var3_2.next;
            var3_2.prev = null;
            var1_1 = var3_2.next;
            if (var1_1 != null) lbl-1000:
            // 2 sources

            {
                var1_1.prev = var2_3;
            } else {
                this.last = var2_3;
            }
        }
        var1_1 = var3_2.value;
        var3_2.clear();
        return var1_1;
    }

    /*
     * Unable to fully structure code
     */
    public boolean deleteEntry(Object var1_1) {
        block5: {
            block3: {
                block4: {
                    var3_2 = this.map.remove(var1_1 = new Hashtable$Entry(var1_1, null));
                    if (var3_2 == null) {
                        return false;
                    }
                    if (var3_2 != this.first) break block3;
                    if (var3_2 != this.last) break block4;
                    var3_2.clear();
                    var3_2.prev = null;
                    break block5;
                }
                this.first = var2_3 = var3_2.next;
                var2_3.prev = null;
                var1_1 = var2_3.next;
                if (var1_1 == null) break block5;
                ** GOTO lbl-1000
            }
            var2_3 = var3_2.prev;
            var2_3.next = var3_2.next;
            var3_2.prev = null;
            var1_1 = var3_2.next;
            if (var1_1 != null) lbl-1000:
            // 2 sources

            {
                var1_1.prev = var2_3;
            } else {
                this.last = var2_3;
            }
        }
        var3_2.clear();
        return true;
    }

    public Object get(Object object) {
        object = new Hashtable$Entry(object, null);
        if ((object = this.map.get(object)) == null) {
            return null;
        }
        return ((Hashtable$Entry)object).value;
    }

    public Hashtable$Entry getEntry(Object object) {
        object = new Hashtable$Entry(object, null);
        return this.map.get(object);
    }

    public boolean has(Object object) {
        object = new Hashtable$Entry(object, null);
        return this.map.containsKey(object);
    }

    @Override
    public Iterator<Hashtable$Entry> iterator() {
        return new Hashtable$Iter(this.first);
    }

    public void put(Object object, Object object2) {
        if (!this.map.containsKey(object = new Hashtable$Entry(object, object2))) {
            this.map.put(object, (Hashtable$Entry)object);
            if (this.first == null) {
                this.last = object;
                this.first = object;
            } else {
                object2 = this.last;
                ((Hashtable$Entry)object2).next = object;
                ((Hashtable$Entry)object).prev = object2;
                this.last = object;
            }
        } else {
            this.map.get((Object)object).value = object2;
        }
    }

    public int size() {
        return this.map.size();
    }
}

