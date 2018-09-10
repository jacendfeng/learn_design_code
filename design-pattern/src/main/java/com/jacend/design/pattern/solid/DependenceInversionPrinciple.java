package com.jacend.design.pattern.solid;

/**
 * 依赖倒置原则
 * - 高层模块不应该依赖于低层模块，两者都应该依赖其抽象
 * - 抽象不应该依赖细节
 * - 细节应该依赖抽象
 * <p>
 * At java
 * - 模块间的依赖通过抽象发生，实现类之间不发生直接的依赖关系，其依赖关系通过接口或抽象类产生
 * - 接口或抽象类不依赖于实现类
 * - 实现类依赖于接口或抽象类
 *
 * 依赖倒置原则的本质就是通过抽象（接口或抽象类使各个类或模块的实现彼此独立，不互相影响，实现
 * 模块中的松耦合）
 * @author fengxf
 * @since 2018-09-09
 */
public class DependenceInversionPrinciple {

    /**
     * 依赖三种写法
     * 1. 构造函数传递依赖对象
     * 2. Setter 方法传递依赖对象
     * 3. 接口申明依赖对象
     */
}
