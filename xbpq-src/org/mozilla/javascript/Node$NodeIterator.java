/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.mozilla.javascript.Node;

public class Node$NodeIterator
implements Iterator<Node> {
    private Node cursor;
    private Node prev;
    private Node prev2;
    private boolean removed;
    final Node this$0;

    public Node$NodeIterator(Node node) {
        this.this$0 = node;
        this.prev = Node.access$000();
        this.removed = false;
        this.cursor = node.first;
    }

    @Override
    public boolean hasNext() {
        boolean bl = this.cursor != null;
        return bl;
    }

    @Override
    public Node next() {
        Node node = this.cursor;
        if (node != null) {
            this.removed = false;
            this.prev2 = this.prev;
            this.prev = node;
            this.cursor = node.next;
            return node;
        }
        throw new NoSuchElementException();
    }

    @Override
    public void remove() {
        if (this.prev != Node.access$000()) {
            if (!this.removed) {
                Node node = this.prev;
                Node node2 = this.this$0;
                if (node == node2.first) {
                    node2.first = node.next;
                } else if (node == node2.last) {
                    node = this.prev2;
                    node.next = null;
                    node2.last = node;
                } else {
                    this.prev2.next = this.cursor;
                }
                return;
            }
            throw new IllegalStateException("remove() already called for current element");
        }
        throw new IllegalStateException("next() has not been called");
    }
}

