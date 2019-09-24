package com.hzhztech.kotlinlearn.面向对象

fun main(args: Array<String>) {
    var girl1 = Girl("彪悍","甜美")
    println("girl的声音: ${girl1.voice}")
    girl1.smile("何闰")
}

/**
 * 一个类
 * 静态就是类的属性
 * 动态就是里面的方法
 */
class Girl(var chactor:String, var voice:String) {
    fun smile(name:String) {
        println("妹子对${name}笑了一下,么么哒")
    }

    fun cry() {
        println("呜呜呜, 人家伤心么")
    }
}

