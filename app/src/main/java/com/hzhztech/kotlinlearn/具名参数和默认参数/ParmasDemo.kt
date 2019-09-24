package com.hzhztech.kotlinlearn.具名参数和默认参数

val Pi = 3.14159f
fun 获取圆的周长(PI:Float = Pi,半径:Float):Float {
    return 2 * Pi * 半径
}

fun main(args: Array<String>) {
    //因为方法中有一个值是已知常量,是默认参数
    //第二个参数为具名参数
    var zhouChang = 获取圆的周长(半径 = 2.0f)
    print(zhouChang)
}