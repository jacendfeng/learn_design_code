# 代理模式 proxy pattern
Provide a surrogate or placeholder for another object to control to it.
为其他对象提供一种代理以控制对这个对象的访问。

- Subject 抽象主题对象

- RealSubject 具体主题对象

- Proxy 代理主题对象

# 实际例子
- concept 包中是简单的静态代理
  通常情况下， 静态代理中的代理类和委托类会实现同一接口或是派生自相同的父类
- Spring AOP 典型的动态代理模式

# 动态代理两种实现方式
- JDK Proxy InvocationHandle
- cglib

# 好的博文
[欧阳峰工作室解释](https://juejin.im/post/5a99048a6fb9a028d5668e62)
[IBM Developer 文章1](https://www.ibm.com/developerworks/cn/java/j-lo-proxy1/index.html)
[IBM Developer 文章2](https://www.ibm.com/developerworks/cn/java/j-lo-proxy2/index.html)

# 接触到新东西
[生成Java文件的开源项目](https://github.com/square/javapoet)