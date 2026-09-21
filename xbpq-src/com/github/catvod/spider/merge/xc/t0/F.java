/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.t0;

import com.github.catvod.spider.merge.xc.t0.a;
import com.github.catvod.spider.merge.xc.t0.l;
import java.io.Serializable;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class F
extends a {
    public static final F f = new F();
    public static final ReentrantReadWriteLock g = new ReentrantReadWriteLock();
    public static final WeakHashMap h = new WeakHashMap();

    /*
     * Loose catch block
     */
    @Override
    public final com.github.catvod.spider.merge.by.l a(Class clazz) {
        int n2;
        int n3;
        com.github.catvod.spider.merge.by.l l2;
        WeakHashMap weakHashMap;
        ReentrantReadWriteLock.ReadLock readLock;
        Serializable serializable;
        block10: {
            serializable = g;
            readLock = ((ReentrantReadWriteLock)serializable).readLock();
            readLock.lock();
            weakHashMap = h;
            l2 = (com.github.catvod.spider.merge.by.l)weakHashMap.get(clazz);
            readLock.unlock();
            if (l2 != null) {
                return l2;
            }
            readLock = ((ReentrantReadWriteLock)serializable).readLock();
            n3 = ((ReentrantReadWriteLock)serializable).getWriteHoldCount();
            int n4 = 0;
            int n5 = 0;
            int n6 = 0;
            n3 = n3 == 0 ? ((ReentrantReadWriteLock)serializable).getReadHoldCount() : 0;
            for (n2 = 0; n2 < n3; ++n2) {
                readLock.unlock();
            }
            serializable = ((ReentrantReadWriteLock)serializable).writeLock();
            ((ReentrantReadWriteLock.WriteLock)serializable).lock();
            l2 = (com.github.catvod.spider.merge.by.l)weakHashMap.get(clazz);
            if (l2 == null) break block10;
            for (n2 = n6; n2 < n3; ++n2) {
                readLock.lock();
            }
            ((ReentrantReadWriteLock.WriteLock)serializable).unlock();
            return l2;
        }
        try {
            l2 = l.a(clazz);
            weakHashMap.put(clazz, l2);
        }
        catch (Throwable throwable) {
            for (n2 = n5; n2 < n3; ++n2) {
                readLock.lock();
            }
            ((ReentrantReadWriteLock.WriteLock)serializable).unlock();
            throw throwable;
        }
        for (n2 = n4; n2 < n3; ++n2) {
            readLock.lock();
        }
        ((ReentrantReadWriteLock.WriteLock)serializable).unlock();
        return l2;
        catch (Throwable throwable) {
            readLock.unlock();
            throw throwable;
        }
    }
}

