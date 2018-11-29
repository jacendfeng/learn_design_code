package com.jacend.jdk.basic;

/**
 * Object 类是类继承关系的根
 * 所有类有一个 Object 作为基类.
 * 所有对象（包括数组），实现了 Object 类中的方法
 *
 * @author fengxf
 * @since 2018-09-26
 */
public class AboutObject {

    /**
     * 其主要作用是将C/C++中的方法映射到Java中的native方法，实现方法命名的解耦。
     * 函数的执行是在静态代码块中执行的，在类首次进行加载的时候执行
     */
//    private static native void registerNatives();
//    static {
//        registerNatives();
//    }

//    Returns the runtime class of this Object.
//    The returned Class object is the object that is locked by static synchronized methods of the represented class.
//    The actual result type is Class<? extends |X|> where |X| is the erasure of the static type of the expression on which getClass is called. For example, no cast is required in this code fragment:
//
//    Number n = 0;
//    Class<? extends Number> c = n.getClass();
//
//    Returns:
//    The Class object that represents the runtime class of this object.

    // public final native Class<?> getClass();
    public static void main(String[] args) {
        System.out.println(1);
        int[] ar = {1,2};
        System.out.println(ar.toString());
    }
}
