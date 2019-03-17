package com.jacend.jdk.concurrent;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author fengxf
 * @since 2019-03-17
 */
public class SyncCollection {

    public static void main(String[] args) {
        //------- 同步容器 ----------------------
        // 早期 JDK 一部分
        Vector vector = new Vector(10);
        Hashtable hashtable = new Hashtable(10);

        // Collections.synchoronizedXxx 等工厂方法
        Collections.synchronizedMap(null);
        Collections.synchronizedNavigableMap(null);
        Collections.synchronizedList(null);
        Collections.synchronizedSet(null);
        Collections.synchronizedSortedSet(null);
        Collections.synchronizedNavigableSet(null);

        //------- 并发容器 ----------------------
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(10);
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();

    }
}
