package com.jacend

import com.jacend.trygroovy.Person

/**
 *
 * @author fengxf
 * @since 2018-10-09
 */
println("println 该方法是自动继承的")

// def 可以定义变量，可以定义方法
String s = "It's a string"
def s2 = "It's another String"

def sayHello() {
    println("test def method say hello")
}

sayHello()

// 也可以指定返回类型
String buildHello() {
    // 返回值默认是最后一个
    "hello"
}

// new 的方式
Person person = new Person()
person.setAge(10) // 可以用 java-like setter 方法
person.name = "大冯" // 也可以用 .fieldName 会调用 setter 方法

// 更加简单的 groovy 式样 new 的 方式
def person2 = new Person(age: 10, name: "大王")

// 这里我们再看下打印
println("简化类实例化以及eval式样的输出占位符 name is $person.name, age is $person.age")
println("年龄是否大于 5 ：${person.age > 5}")

// 定义一个多行字符串
String input = '''I want you to know you were right. I didn't want \
                      to admit that. Just pride I guess. You get my age, you \
                      get kinda set in your ways. It had to be \
                      done. Don't blame yourself for what happened later.'''
assert input

// map 简化使用
Map<String, Integer> wordCounts = new HashMap<>()
wordCounts.put("Hello", 1)
wordCounts.put("Java", 1)
wordCounts.put("World", 2)

Map<String, Integer> wordCounts2 = ["Hello": 1, "Groovy": 1, "World": 2]

// list array 简化使用
List<String> races = Arrays.asList("Drazi", "Minbari", "Humans")
List<String> races2 = ["Drazi", "Minbari", "Humans"]
assert races == races2

String[] racesArray = ["Drazi", "Minbari", "Humans"]
// groovy 里面以下初始化方式不行，java 里面可以
// String[] racesArrayJava = {"Drazi","Minbari","Humans"}